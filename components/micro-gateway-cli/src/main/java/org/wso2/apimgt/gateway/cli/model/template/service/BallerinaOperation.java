/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.apimgt.gateway.cli.model.template.service;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.parameters.Parameter;
import org.wso2.apimgt.gateway.cli.constants.OpenAPIConstants;
import org.wso2.apimgt.gateway.cli.exception.BallerinaServiceGenException;
import org.wso2.apimgt.gateway.cli.exception.CLIRuntimeException;
import org.wso2.apimgt.gateway.cli.model.config.APIKey;
import org.wso2.apimgt.gateway.cli.model.mgwcodegen.MgwEndpointConfigDTO;
import org.wso2.apimgt.gateway.cli.model.rest.ext.ExtendedAPI;
import org.wso2.apimgt.gateway.cli.utils.OpenAPICodegenUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 * Wraps the {@link Operation} from swagger models to provide iterable child models.
 */
public class BallerinaOperation implements BallerinaOpenAPIObject<BallerinaOperation, Operation> {

    public static final String X_THROTTLING_TIER = "x-throttling-tier";
    public static final String X_SCOPE = "x-scope";
    public static final String X_AUTH_TYPE = "x-auth-type";
    public static final String AUTH_TYPE_NONE = "None";
    private List<String> tags;
    private String summary;
    private String description;
    private String resourceTier;
    private ExternalDocumentation externalDocs;
    private String operationId;
    private List<BallerinaParameter> parameters;
    private String scope;
    private boolean isSecured = true;
    //to identify if the isSecured flag is set from the operation
    private boolean isSecuredAssignedFromOperation = false;
    private MgwEndpointConfigDTO epConfig;

    /**
     * b7a module name of the request interceptor function.
     */
    private String requestInterceptorModule;
    /**
     * b7a module name of the response interceptor function.
     */
    private String responseInterceptorModule;
    /**
     * b7a function name of operation level request interceptor.
     */
    private String requestInterceptor;
    /**
     * b7a function name of operation level response interceptor.
     */
    private String responseInterceptor;
    private String requestInterceptorModuleVersion;
    private String responseInterceptorModuleVersion;

    @SuppressFBWarnings(value = "URF_UNREAD_FIELD")
    private List<APIKey> apiKeys;

    @SuppressFBWarnings(value = "URF_UNREAD_FIELD")
    private List<String> authProviders;

    @SuppressFBWarnings(value = "URF_UNREAD_FIELD")
    private boolean hasProdEpConfig = false;
    @SuppressFBWarnings(value = "URF_UNREAD_FIELD")
    private boolean hasSandEpConfig = false;

    // Not static since handlebars can't see static variables
    private final List<String> allMethods =
            Arrays.asList("HEAD", "OPTIONS", "PATCH", "DELETE", "POST", "PUT", "GET");

    @Override
    public BallerinaOperation buildContext(Operation operation, ExtendedAPI api) throws BallerinaServiceGenException {
        if (operation == null) {
            return getDefaultValue();
        }

        // OperationId with spaces with special characters will cause errors in ballerina code.
        // Replacing it with uuid so that we can identify there was a ' ' when doing bal -> swagger
        operation.setOperationId(UUID.randomUUID().toString().replaceAll("-", "_"));
        this.operationId = operation.getOperationId();
        this.tags = operation.getTags();
        this.summary = operation.getSummary();
        this.description = operation.getDescription();
        this.externalDocs = operation.getExternalDocs();
        this.parameters = new ArrayList<>();
        //to provide resource level security in dev-first approach
        this.apiKeys = OpenAPICodegenUtils.generateAPIKeysFromSecurity(operation.getSecurity());
        this.authProviders = OpenAPICodegenUtils.getMgwResourceSecurity(operation);
        //to set resource level scopes in dev-first approach
        this.scope = OpenAPICodegenUtils.getMgwResourceScope(operation);
        //set resource level endpoint configuration
        setEpConfigDTO(operation);
        Map<String, Object> exts = operation.getExtensions();

        if (exts != null) {
            resolveInterceptors(exts);
            Optional<Object> resourceTier = Optional.ofNullable(exts.get(X_THROTTLING_TIER));
            resourceTier.ifPresent(value -> this.resourceTier = value.toString());
            Optional<Object> scopes = Optional.ofNullable(exts.get(X_SCOPE));
            scopes.ifPresent(value -> this.scope = "\"" + value.toString() + "\"");
            Optional<Object> authType = Optional.ofNullable(exts.get(X_AUTH_TYPE));
            authType.ifPresent(value -> {
                if (AUTH_TYPE_NONE.equals(value)) {
                    this.isSecured = false;
                }
            });

            //set dev-first resource level throttle policy
            Optional<Object> extResourceTier = Optional.ofNullable(exts.get(OpenAPIConstants.THROTTLING_TIER));
            extResourceTier.ifPresent(value -> this.resourceTier = value.toString());
            Optional<Object> extDisableSecurity = Optional.ofNullable(exts.get(OpenAPIConstants.DISABLE_SECURITY));
            extDisableSecurity.ifPresent(value -> {
                try {
                    this.isSecured = !(Boolean) value;
                    this.isSecuredAssignedFromOperation = true;
                } catch (ClassCastException e) {
                    throw new CLIRuntimeException("The property '" + OpenAPIConstants.DISABLE_SECURITY +
                            "' should be a boolean value. But provided '" + value.toString() + "'.");
                }
            });
        }

        if (operation.getParameters() != null) {
            for (Parameter parameter : operation.getParameters()) {
                this.parameters.add(new BallerinaParameter().buildContext(parameter, api));
            }
        }

        return this;
    }

    /**
     * Returns the module version relevant to operation level request interceptors
     *
     * @return  The request interceptor module version
     */
    public String getRequestInterceptorModuleVersion() {
        return requestInterceptorModuleVersion;
    }

    /**
     * Set the module version for the operation level request interceptors
     *
     * @param requestInterceptorModuleVersion The version of the request interceptor module
     */
    public void setRequestInterceptorModuleVersion(String requestInterceptorModuleVersion) {
        this.requestInterceptorModuleVersion = requestInterceptorModuleVersion;
    }

    /**
     * Returns the module version relevant to operation level response interceptors
     *
     * @return  The response interceptor module version
     */
    public String getResponseInterceptorModuleVersion() {
        return responseInterceptorModuleVersion;
    }

    /**
     * Set the module version for the operation level response interceptors
     *
     * @param responseInterceptorModuleVersion The version of the response interceptor module
     */
    public void setResponseInterceptorModuleVersion(String responseInterceptorModuleVersion) {
        this.responseInterceptorModuleVersion = responseInterceptorModuleVersion;
    }

    /**
     * Get the module located in the Ballerina Central, where the operation level request interceptors can be found
     *
     * @return     The module which contains the operation level request interceptors
     */
    public String getRequestInterceptorModule() {
        return requestInterceptorModule;
    }

    /**
     * Set the module located in the Ballerina Central, where the operation level request interceptor can be found
     *
     * @param requestInterceptorModule   Ballerina Central Module where the operation level request interceptor
     *                                   can be found
     */
    public void setRequestInterceptorModule(String requestInterceptorModule) {
        this.requestInterceptorModule = requestInterceptorModule;
    }

    /**
     * Get the module located in the Ballerina Central, where the operation level response interceptor can be found
     *
     * @return     The module which contains the operation level response interceptors
     */
    public String getResponseInterceptorModule() {
       return responseInterceptorModule;
    }

    /**
     * Set the module located in the Ballerina Central, where the operation level response interceptors can be found
     *
     * @param responseInterceptorModule   Ballerina Central Module where the operation level response interceptor
     *                                    can be found
     */
    public void setResponseInterceptorModule(String responseInterceptorModule) {
        this.responseInterceptorModule = responseInterceptorModule;
    }

    @Override
    public BallerinaOperation buildContext(Operation operation) throws BallerinaServiceGenException {
        return buildContext(operation, null);
    }

    @Override
    public BallerinaOperation getDefaultValue() {
        return new BallerinaOperation();
    }

    public List<String> getTags() {
        return tags;
    }

    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }

    public String getOperationId() {
        return operationId;
    }

    public List<BallerinaParameter> getParameters() {
        return parameters;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public List<String> getAllMethods() {
        return allMethods;
    }

    public ExternalDocumentation getExternalDocs() {
        return externalDocs;
    }

    public void setExternalDocs(ExternalDocumentation externalDocs) {
        this.externalDocs = externalDocs;
    }

    public String getResourceTier() {
        return resourceTier;
    }

    public void setResourceTier(String resourceTier) {
        this.resourceTier = resourceTier;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        if (this.scope == null) {
            this.scope = scope;
        }
    }

    public boolean isSecured() {
        return isSecured;
    }

    public void setSecured(boolean secured) {
        if (isSecuredAssignedFromOperation) {
            return;
        }
        isSecured = secured;
    }

    public MgwEndpointConfigDTO getEpConfigDTO() {
        return epConfig;
    }

    private void setEpConfigDTO(Operation operation) {
        this.epConfig = OpenAPICodegenUtils.getResourceEpConfigForCodegen(operation);

        if (epConfig.getProdEndpointList() != null) {
            hasProdEpConfig = true;
        }
        if (epConfig.getSandboxEndpointList() != null) {
            hasSandEpConfig = true;
        }
    }

    public String getRequestInterceptor() {
        return requestInterceptor;
    }

    public void setRequestInterceptor(String requestInterceptor) {
        this.requestInterceptor = requestInterceptor;
    }

    public String getResponseInterceptor() {
        return responseInterceptor;
    }

    public void setResponseInterceptor(String responseInterceptor) {
        this.responseInterceptor = responseInterceptor;
    }

    public void setSecuritySchemas(String schemas) {
        //update the Resource auth providers property only if there is no security scheme provided during instantiation
        if (this.authProviders.size() < 1) {
            authProviders = OpenAPICodegenUtils.getAuthProviders(schemas);
        }
    }

    private void resolveInterceptors(Map<String, Object> exts) {
        Optional<Object> reqInterceptor = Optional.ofNullable(exts.get(OpenAPIConstants.REQUEST_INTERCEPTOR));
        reqInterceptor.ifPresent(val -> {
            String interceptorExt = val.toString();
            if (interceptorExt.contains(OpenAPIConstants.INTERCEPTOR_MODULE_SEPARATOR)) {
                String org = interceptorExt.split(OpenAPIConstants.INTERCEPTOR_MODULE_SEPARATOR)[0];
                String module = OpenAPICodegenUtils.extractModuleName(interceptorExt);

                this.requestInterceptorModule = org + OpenAPIConstants.INTERCEPTOR_MODULE_SEPARATOR + module;
                this.requestInterceptor = interceptorExt.split(OpenAPIConstants.INTERCEPTOR_FUNC_SEPARATOR)[1];
                this.requestInterceptorModuleVersion = OpenAPICodegenUtils.buildModuleVersion(interceptorExt);
            } else {
                this.requestInterceptor = interceptorExt;
            }
        });


        Optional<Object> resInterceptor = Optional.ofNullable(exts.get(OpenAPIConstants.RESPONSE_INTERCEPTOR));
        resInterceptor.ifPresent(val -> {
            String interceptorExt = val.toString();
            if (interceptorExt.contains(OpenAPIConstants.INTERCEPTOR_MODULE_SEPARATOR)) {
                String org = interceptorExt.split(OpenAPIConstants.INTERCEPTOR_MODULE_SEPARATOR)[0];
                String module = OpenAPICodegenUtils.extractModuleName(interceptorExt);

                this.responseInterceptorModule = org + OpenAPIConstants.INTERCEPTOR_MODULE_SEPARATOR + module;
                this.responseInterceptor = interceptorExt.split(OpenAPIConstants.INTERCEPTOR_FUNC_SEPARATOR)[1];
                this.responseInterceptorModuleVersion = OpenAPICodegenUtils.buildModuleVersion(interceptorExt);
            } else {
                this.responseInterceptor = interceptorExt;
            }
        });
    }
}
