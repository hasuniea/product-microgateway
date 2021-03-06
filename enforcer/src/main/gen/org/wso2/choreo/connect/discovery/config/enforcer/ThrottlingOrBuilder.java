// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/config/enforcer/throttling.proto

package org.wso2.choreo.connect.discovery.config.enforcer;

public interface ThrottlingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wso2.discovery.config.enforcer.Throttling)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool enable_global_event_publishing = 1;</code>
   * @return The enableGlobalEventPublishing.
   */
  boolean getEnableGlobalEventPublishing();

  /**
   * <code>bool enable_header_conditions = 2;</code>
   * @return The enableHeaderConditions.
   */
  boolean getEnableHeaderConditions();

  /**
   * <code>bool enable_query_param_conditions = 3;</code>
   * @return The enableQueryParamConditions.
   */
  boolean getEnableQueryParamConditions();

  /**
   * <code>bool enable_jwt_claim_conditions = 4;</code>
   * @return The enableJwtClaimConditions.
   */
  boolean getEnableJwtClaimConditions();

  /**
   * <code>string jms_connection_initial_context_factory = 5;</code>
   * @return The jmsConnectionInitialContextFactory.
   */
  java.lang.String getJmsConnectionInitialContextFactory();
  /**
   * <code>string jms_connection_initial_context_factory = 5;</code>
   * @return The bytes for jmsConnectionInitialContextFactory.
   */
  com.google.protobuf.ByteString
      getJmsConnectionInitialContextFactoryBytes();

  /**
   * <code>string jms_connection_provider_url = 6;</code>
   * @return The jmsConnectionProviderUrl.
   */
  java.lang.String getJmsConnectionProviderUrl();
  /**
   * <code>string jms_connection_provider_url = 6;</code>
   * @return The bytes for jmsConnectionProviderUrl.
   */
  com.google.protobuf.ByteString
      getJmsConnectionProviderUrlBytes();

  /**
   * <code>.wso2.discovery.config.enforcer.BinaryPublisher publisher = 7;</code>
   * @return Whether the publisher field is set.
   */
  boolean hasPublisher();
  /**
   * <code>.wso2.discovery.config.enforcer.BinaryPublisher publisher = 7;</code>
   * @return The publisher.
   */
  org.wso2.choreo.connect.discovery.config.enforcer.BinaryPublisher getPublisher();
  /**
   * <code>.wso2.discovery.config.enforcer.BinaryPublisher publisher = 7;</code>
   */
  org.wso2.choreo.connect.discovery.config.enforcer.BinaryPublisherOrBuilder getPublisherOrBuilder();
}
