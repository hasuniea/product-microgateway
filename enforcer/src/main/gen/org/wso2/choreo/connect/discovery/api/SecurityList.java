// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/api/Resource.proto

package org.wso2.choreo.connect.discovery.api;

/**
 * <pre>
 * Holds the array of security schemas defined for particular API operation
 * </pre>
 *
 * Protobuf type {@code wso2.discovery.api.SecurityList}
 */
public final class SecurityList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wso2.discovery.api.SecurityList)
    SecurityListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SecurityList.newBuilder() to construct.
  private SecurityList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SecurityList() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SecurityList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SecurityList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              scopeList_ = com.google.protobuf.MapField.newMapField(
                  ScopeListDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes>
            scopeList__ = input.readMessage(
                ScopeListDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            scopeList_.getMutableMap().put(
                scopeList__.getKey(), scopeList__.getValue());
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.wso2.choreo.connect.discovery.api.ResourceProto.internal_static_wso2_discovery_api_SecurityList_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetScopeList();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.wso2.choreo.connect.discovery.api.ResourceProto.internal_static_wso2_discovery_api_SecurityList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.wso2.choreo.connect.discovery.api.SecurityList.class, org.wso2.choreo.connect.discovery.api.SecurityList.Builder.class);
  }

  public static final int SCOPELIST_FIELD_NUMBER = 1;
  private static final class ScopeListDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes>newDefaultInstance(
                org.wso2.choreo.connect.discovery.api.ResourceProto.internal_static_wso2_discovery_api_SecurityList_ScopeListEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                org.wso2.choreo.connect.discovery.api.Scopes.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes> scopeList_;
  private com.google.protobuf.MapField<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes>
  internalGetScopeList() {
    if (scopeList_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ScopeListDefaultEntryHolder.defaultEntry);
    }
    return scopeList_;
  }

  public int getScopeListCount() {
    return internalGetScopeList().getMap().size();
  }
  /**
   * <code>map&lt;string, .wso2.discovery.api.Scopes&gt; scopeList = 1;</code>
   */

  @java.lang.Override
  public boolean containsScopeList(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetScopeList().getMap().containsKey(key);
  }
  /**
   * Use {@link #getScopeListMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes> getScopeList() {
    return getScopeListMap();
  }
  /**
   * <code>map&lt;string, .wso2.discovery.api.Scopes&gt; scopeList = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes> getScopeListMap() {
    return internalGetScopeList().getMap();
  }
  /**
   * <code>map&lt;string, .wso2.discovery.api.Scopes&gt; scopeList = 1;</code>
   */
  @java.lang.Override

  public org.wso2.choreo.connect.discovery.api.Scopes getScopeListOrDefault(
      java.lang.String key,
      org.wso2.choreo.connect.discovery.api.Scopes defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes> map =
        internalGetScopeList().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .wso2.discovery.api.Scopes&gt; scopeList = 1;</code>
   */
  @java.lang.Override

  public org.wso2.choreo.connect.discovery.api.Scopes getScopeListOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes> map =
        internalGetScopeList().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetScopeList(),
        ScopeListDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes> entry
         : internalGetScopeList().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes>
      scopeList__ = ScopeListDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, scopeList__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.wso2.choreo.connect.discovery.api.SecurityList)) {
      return super.equals(obj);
    }
    org.wso2.choreo.connect.discovery.api.SecurityList other = (org.wso2.choreo.connect.discovery.api.SecurityList) obj;

    if (!internalGetScopeList().equals(
        other.internalGetScopeList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetScopeList().getMap().isEmpty()) {
      hash = (37 * hash) + SCOPELIST_FIELD_NUMBER;
      hash = (53 * hash) + internalGetScopeList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.wso2.choreo.connect.discovery.api.SecurityList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.choreo.connect.discovery.api.SecurityList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.choreo.connect.discovery.api.SecurityList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.choreo.connect.discovery.api.SecurityList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.choreo.connect.discovery.api.SecurityList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.choreo.connect.discovery.api.SecurityList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.choreo.connect.discovery.api.SecurityList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.choreo.connect.discovery.api.SecurityList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.choreo.connect.discovery.api.SecurityList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.wso2.choreo.connect.discovery.api.SecurityList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.choreo.connect.discovery.api.SecurityList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.choreo.connect.discovery.api.SecurityList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.wso2.choreo.connect.discovery.api.SecurityList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Holds the array of security schemas defined for particular API operation
   * </pre>
   *
   * Protobuf type {@code wso2.discovery.api.SecurityList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wso2.discovery.api.SecurityList)
      org.wso2.choreo.connect.discovery.api.SecurityListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.wso2.choreo.connect.discovery.api.ResourceProto.internal_static_wso2_discovery_api_SecurityList_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetScopeList();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableScopeList();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.wso2.choreo.connect.discovery.api.ResourceProto.internal_static_wso2_discovery_api_SecurityList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.wso2.choreo.connect.discovery.api.SecurityList.class, org.wso2.choreo.connect.discovery.api.SecurityList.Builder.class);
    }

    // Construct using org.wso2.choreo.connect.discovery.api.SecurityList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableScopeList().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.wso2.choreo.connect.discovery.api.ResourceProto.internal_static_wso2_discovery_api_SecurityList_descriptor;
    }

    @java.lang.Override
    public org.wso2.choreo.connect.discovery.api.SecurityList getDefaultInstanceForType() {
      return org.wso2.choreo.connect.discovery.api.SecurityList.getDefaultInstance();
    }

    @java.lang.Override
    public org.wso2.choreo.connect.discovery.api.SecurityList build() {
      org.wso2.choreo.connect.discovery.api.SecurityList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.wso2.choreo.connect.discovery.api.SecurityList buildPartial() {
      org.wso2.choreo.connect.discovery.api.SecurityList result = new org.wso2.choreo.connect.discovery.api.SecurityList(this);
      int from_bitField0_ = bitField0_;
      result.scopeList_ = internalGetScopeList();
      result.scopeList_.makeImmutable();
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.wso2.choreo.connect.discovery.api.SecurityList) {
        return mergeFrom((org.wso2.choreo.connect.discovery.api.SecurityList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.wso2.choreo.connect.discovery.api.SecurityList other) {
      if (other == org.wso2.choreo.connect.discovery.api.SecurityList.getDefaultInstance()) return this;
      internalGetMutableScopeList().mergeFrom(
          other.internalGetScopeList());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.wso2.choreo.connect.discovery.api.SecurityList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.wso2.choreo.connect.discovery.api.SecurityList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes> scopeList_;
    private com.google.protobuf.MapField<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes>
    internalGetScopeList() {
      if (scopeList_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ScopeListDefaultEntryHolder.defaultEntry);
      }
      return scopeList_;
    }
    private com.google.protobuf.MapField<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes>
    internalGetMutableScopeList() {
      onChanged();;
      if (scopeList_ == null) {
        scopeList_ = com.google.protobuf.MapField.newMapField(
            ScopeListDefaultEntryHolder.defaultEntry);
      }
      if (!scopeList_.isMutable()) {
        scopeList_ = scopeList_.copy();
      }
      return scopeList_;
    }

    public int getScopeListCount() {
      return internalGetScopeList().getMap().size();
    }
    /**
     * <code>map&lt;string, .wso2.discovery.api.Scopes&gt; scopeList = 1;</code>
     */

    @java.lang.Override
    public boolean containsScopeList(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetScopeList().getMap().containsKey(key);
    }
    /**
     * Use {@link #getScopeListMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes> getScopeList() {
      return getScopeListMap();
    }
    /**
     * <code>map&lt;string, .wso2.discovery.api.Scopes&gt; scopeList = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes> getScopeListMap() {
      return internalGetScopeList().getMap();
    }
    /**
     * <code>map&lt;string, .wso2.discovery.api.Scopes&gt; scopeList = 1;</code>
     */
    @java.lang.Override

    public org.wso2.choreo.connect.discovery.api.Scopes getScopeListOrDefault(
        java.lang.String key,
        org.wso2.choreo.connect.discovery.api.Scopes defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes> map =
          internalGetScopeList().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .wso2.discovery.api.Scopes&gt; scopeList = 1;</code>
     */
    @java.lang.Override

    public org.wso2.choreo.connect.discovery.api.Scopes getScopeListOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes> map =
          internalGetScopeList().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearScopeList() {
      internalGetMutableScopeList().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .wso2.discovery.api.Scopes&gt; scopeList = 1;</code>
     */

    public Builder removeScopeList(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableScopeList().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes>
    getMutableScopeList() {
      return internalGetMutableScopeList().getMutableMap();
    }
    /**
     * <code>map&lt;string, .wso2.discovery.api.Scopes&gt; scopeList = 1;</code>
     */
    public Builder putScopeList(
        java.lang.String key,
        org.wso2.choreo.connect.discovery.api.Scopes value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableScopeList().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .wso2.discovery.api.Scopes&gt; scopeList = 1;</code>
     */

    public Builder putAllScopeList(
        java.util.Map<java.lang.String, org.wso2.choreo.connect.discovery.api.Scopes> values) {
      internalGetMutableScopeList().getMutableMap()
          .putAll(values);
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:wso2.discovery.api.SecurityList)
  }

  // @@protoc_insertion_point(class_scope:wso2.discovery.api.SecurityList)
  private static final org.wso2.choreo.connect.discovery.api.SecurityList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.wso2.choreo.connect.discovery.api.SecurityList();
  }

  public static org.wso2.choreo.connect.discovery.api.SecurityList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityList>
      PARSER = new com.google.protobuf.AbstractParser<SecurityList>() {
    @java.lang.Override
    public SecurityList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SecurityList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SecurityList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.wso2.choreo.connect.discovery.api.SecurityList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
