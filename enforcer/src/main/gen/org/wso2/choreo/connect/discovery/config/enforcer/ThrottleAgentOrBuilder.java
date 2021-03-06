// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/config/enforcer/throttle_agent.proto

package org.wso2.choreo.connect.discovery.config.enforcer;

public interface ThrottleAgentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wso2.discovery.config.enforcer.ThrottleAgent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sslEnabledProtocols = 1;</code>
   * @return The sslEnabledProtocols.
   */
  java.lang.String getSslEnabledProtocols();
  /**
   * <code>string sslEnabledProtocols = 1;</code>
   * @return The bytes for sslEnabledProtocols.
   */
  com.google.protobuf.ByteString
      getSslEnabledProtocolsBytes();

  /**
   * <code>string ciphers = 2;</code>
   * @return The ciphers.
   */
  java.lang.String getCiphers();
  /**
   * <code>string ciphers = 2;</code>
   * @return The bytes for ciphers.
   */
  com.google.protobuf.ByteString
      getCiphersBytes();

  /**
   * <code>int32 queueSize = 3;</code>
   * @return The queueSize.
   */
  int getQueueSize();

  /**
   * <code>int32 batchSize = 4;</code>
   * @return The batchSize.
   */
  int getBatchSize();

  /**
   * <code>int32 corePoolSize = 5;</code>
   * @return The corePoolSize.
   */
  int getCorePoolSize();

  /**
   * <code>int32 socketTimeoutMS = 6;</code>
   * @return The socketTimeoutMS.
   */
  int getSocketTimeoutMS();

  /**
   * <code>int32 maxPoolSize = 7;</code>
   * @return The maxPoolSize.
   */
  int getMaxPoolSize();

  /**
   * <code>int32 keepAliveTimeInPool = 8;</code>
   * @return The keepAliveTimeInPool.
   */
  int getKeepAliveTimeInPool();

  /**
   * <code>int32 reconnectionInterval = 9;</code>
   * @return The reconnectionInterval.
   */
  int getReconnectionInterval();

  /**
   * <code>int32 maxTransportPoolSize = 10;</code>
   * @return The maxTransportPoolSize.
   */
  int getMaxTransportPoolSize();

  /**
   * <code>int32 maxIdleConnections = 11;</code>
   * @return The maxIdleConnections.
   */
  int getMaxIdleConnections();

  /**
   * <code>int32 evictionTimePeriod = 12;</code>
   * @return The evictionTimePeriod.
   */
  int getEvictionTimePeriod();

  /**
   * <code>int32 minIdleTimeInPool = 13;</code>
   * @return The minIdleTimeInPool.
   */
  int getMinIdleTimeInPool();

  /**
   * <code>int32 secureMaxTransportPoolSize = 14;</code>
   * @return The secureMaxTransportPoolSize.
   */
  int getSecureMaxTransportPoolSize();

  /**
   * <code>int32 secureMaxIdleConnections = 15;</code>
   * @return The secureMaxIdleConnections.
   */
  int getSecureMaxIdleConnections();

  /**
   * <code>int32 secureEvictionTimePeriod = 16;</code>
   * @return The secureEvictionTimePeriod.
   */
  int getSecureEvictionTimePeriod();

  /**
   * <code>int32 secureMinIdleTimeInPool = 17;</code>
   * @return The secureMinIdleTimeInPool.
   */
  int getSecureMinIdleTimeInPool();
}
