// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/service/subscription/sub_policy_ds.proto

package org.wso2.gateway.discovery.service.subscription;

public final class SubPolicyDSProto {
  private SubPolicyDSProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7wso2/discovery/service/subscription/su" +
      "b_policy_ds.proto\022\036discovery.service.sub" +
      "scription\032*envoy/service/discovery/v3/di" +
      "scovery.proto2\245\001\n\"SubscriptionPolicyDisc" +
      "overyService\022\177\n\032StreamSubscriptionPolici" +
      "es\022,.envoy.service.discovery.v3.Discover" +
      "yRequest\032-.envoy.service.discovery.v3.Di" +
      "scoveryResponse\"\000(\0010\001B\224\001\n/org.wso2.gatew" +
      "ay.discovery.service.subscriptionB\020SubPo" +
      "licyDSProtoP\001ZJgithub.com/envoyproxy/go-" +
      "control-plane/wso2/discovery/service/sub" +
      "scription\210\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.service.discovery.v3.DiscoveryProto.getDescriptor(),
        });
    io.envoyproxy.envoy.service.discovery.v3.DiscoveryProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}