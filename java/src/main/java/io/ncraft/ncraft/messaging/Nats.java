// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ncraft/messaging/config.proto

package io.ncraft.ncraft.messaging;

/**
 * Protobuf type {@code ncraft.messaging.Nats}
 */
public final class Nats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ncraft.messaging.Nats)
    NatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Nats.newBuilder() to construct.
  private Nats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Nats() {
    jetStream_ = "";
    topicNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Nats();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Nats(
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
            java.lang.String s = input.readStringRequireUtf8();

            jetStream_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              topicNames_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            topicNames_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        topicNames_ = topicNames_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.ncraft.ncraft.messaging.ConfigProto.internal_static_ncraft_messaging_Nats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.ncraft.ncraft.messaging.ConfigProto.internal_static_ncraft_messaging_Nats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.ncraft.ncraft.messaging.Nats.class, io.ncraft.ncraft.messaging.Nats.Builder.class);
  }

  public static final int JET_STREAM_FIELD_NUMBER = 1;
  private volatile java.lang.Object jetStream_;
  /**
   * <code>string jet_stream = 1;</code>
   * @return The jetStream.
   */
  @java.lang.Override
  public java.lang.String getJetStream() {
    java.lang.Object ref = jetStream_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jetStream_ = s;
      return s;
    }
  }
  /**
   * <code>string jet_stream = 1;</code>
   * @return The bytes for jetStream.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJetStreamBytes() {
    java.lang.Object ref = jetStream_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jetStream_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOPIC_NAMES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList topicNames_;
  /**
   * <code>repeated string topic_names = 2;</code>
   * @return A list containing the topicNames.
   */
  public com.google.protobuf.ProtocolStringList
      getTopicNamesList() {
    return topicNames_;
  }
  /**
   * <code>repeated string topic_names = 2;</code>
   * @return The count of topicNames.
   */
  public int getTopicNamesCount() {
    return topicNames_.size();
  }
  /**
   * <code>repeated string topic_names = 2;</code>
   * @param index The index of the element to return.
   * @return The topicNames at the given index.
   */
  public java.lang.String getTopicNames(int index) {
    return topicNames_.get(index);
  }
  /**
   * <code>repeated string topic_names = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the topicNames at the given index.
   */
  public com.google.protobuf.ByteString
      getTopicNamesBytes(int index) {
    return topicNames_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jetStream_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, jetStream_);
    }
    for (int i = 0; i < topicNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, topicNames_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jetStream_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, jetStream_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < topicNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(topicNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTopicNamesList().size();
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
    if (!(obj instanceof io.ncraft.ncraft.messaging.Nats)) {
      return super.equals(obj);
    }
    io.ncraft.ncraft.messaging.Nats other = (io.ncraft.ncraft.messaging.Nats) obj;

    if (!getJetStream()
        .equals(other.getJetStream())) return false;
    if (!getTopicNamesList()
        .equals(other.getTopicNamesList())) return false;
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
    hash = (37 * hash) + JET_STREAM_FIELD_NUMBER;
    hash = (53 * hash) + getJetStream().hashCode();
    if (getTopicNamesCount() > 0) {
      hash = (37 * hash) + TOPIC_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getTopicNamesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.ncraft.ncraft.messaging.Nats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.ncraft.ncraft.messaging.Nats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.ncraft.ncraft.messaging.Nats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.ncraft.ncraft.messaging.Nats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.ncraft.ncraft.messaging.Nats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.ncraft.ncraft.messaging.Nats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.ncraft.ncraft.messaging.Nats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.ncraft.ncraft.messaging.Nats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.ncraft.ncraft.messaging.Nats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.ncraft.ncraft.messaging.Nats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.ncraft.ncraft.messaging.Nats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.ncraft.ncraft.messaging.Nats parseFrom(
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
  public static Builder newBuilder(io.ncraft.ncraft.messaging.Nats prototype) {
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
   * Protobuf type {@code ncraft.messaging.Nats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ncraft.messaging.Nats)
      io.ncraft.ncraft.messaging.NatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.ncraft.ncraft.messaging.ConfigProto.internal_static_ncraft_messaging_Nats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.ncraft.ncraft.messaging.ConfigProto.internal_static_ncraft_messaging_Nats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.ncraft.ncraft.messaging.Nats.class, io.ncraft.ncraft.messaging.Nats.Builder.class);
    }

    // Construct using io.ncraft.ncraft.messaging.Nats.newBuilder()
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
      jetStream_ = "";

      topicNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.ncraft.ncraft.messaging.ConfigProto.internal_static_ncraft_messaging_Nats_descriptor;
    }

    @java.lang.Override
    public io.ncraft.ncraft.messaging.Nats getDefaultInstanceForType() {
      return io.ncraft.ncraft.messaging.Nats.getDefaultInstance();
    }

    @java.lang.Override
    public io.ncraft.ncraft.messaging.Nats build() {
      io.ncraft.ncraft.messaging.Nats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.ncraft.ncraft.messaging.Nats buildPartial() {
      io.ncraft.ncraft.messaging.Nats result = new io.ncraft.ncraft.messaging.Nats(this);
      int from_bitField0_ = bitField0_;
      result.jetStream_ = jetStream_;
      if (((bitField0_ & 0x00000001) != 0)) {
        topicNames_ = topicNames_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.topicNames_ = topicNames_;
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
      if (other instanceof io.ncraft.ncraft.messaging.Nats) {
        return mergeFrom((io.ncraft.ncraft.messaging.Nats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.ncraft.ncraft.messaging.Nats other) {
      if (other == io.ncraft.ncraft.messaging.Nats.getDefaultInstance()) return this;
      if (!other.getJetStream().isEmpty()) {
        jetStream_ = other.jetStream_;
        onChanged();
      }
      if (!other.topicNames_.isEmpty()) {
        if (topicNames_.isEmpty()) {
          topicNames_ = other.topicNames_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTopicNamesIsMutable();
          topicNames_.addAll(other.topicNames_);
        }
        onChanged();
      }
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
      io.ncraft.ncraft.messaging.Nats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.ncraft.ncraft.messaging.Nats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object jetStream_ = "";
    /**
     * <code>string jet_stream = 1;</code>
     * @return The jetStream.
     */
    public java.lang.String getJetStream() {
      java.lang.Object ref = jetStream_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jetStream_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string jet_stream = 1;</code>
     * @return The bytes for jetStream.
     */
    public com.google.protobuf.ByteString
        getJetStreamBytes() {
      java.lang.Object ref = jetStream_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jetStream_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string jet_stream = 1;</code>
     * @param value The jetStream to set.
     * @return This builder for chaining.
     */
    public Builder setJetStream(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jetStream_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string jet_stream = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJetStream() {
      
      jetStream_ = getDefaultInstance().getJetStream();
      onChanged();
      return this;
    }
    /**
     * <code>string jet_stream = 1;</code>
     * @param value The bytes for jetStream to set.
     * @return This builder for chaining.
     */
    public Builder setJetStreamBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jetStream_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList topicNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTopicNamesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        topicNames_ = new com.google.protobuf.LazyStringArrayList(topicNames_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string topic_names = 2;</code>
     * @return A list containing the topicNames.
     */
    public com.google.protobuf.ProtocolStringList
        getTopicNamesList() {
      return topicNames_.getUnmodifiableView();
    }
    /**
     * <code>repeated string topic_names = 2;</code>
     * @return The count of topicNames.
     */
    public int getTopicNamesCount() {
      return topicNames_.size();
    }
    /**
     * <code>repeated string topic_names = 2;</code>
     * @param index The index of the element to return.
     * @return The topicNames at the given index.
     */
    public java.lang.String getTopicNames(int index) {
      return topicNames_.get(index);
    }
    /**
     * <code>repeated string topic_names = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the topicNames at the given index.
     */
    public com.google.protobuf.ByteString
        getTopicNamesBytes(int index) {
      return topicNames_.getByteString(index);
    }
    /**
     * <code>repeated string topic_names = 2;</code>
     * @param index The index to set the value at.
     * @param value The topicNames to set.
     * @return This builder for chaining.
     */
    public Builder setTopicNames(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTopicNamesIsMutable();
      topicNames_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string topic_names = 2;</code>
     * @param value The topicNames to add.
     * @return This builder for chaining.
     */
    public Builder addTopicNames(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTopicNamesIsMutable();
      topicNames_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string topic_names = 2;</code>
     * @param values The topicNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllTopicNames(
        java.lang.Iterable<java.lang.String> values) {
      ensureTopicNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, topicNames_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string topic_names = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopicNames() {
      topicNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string topic_names = 2;</code>
     * @param value The bytes of the topicNames to add.
     * @return This builder for chaining.
     */
    public Builder addTopicNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTopicNamesIsMutable();
      topicNames_.add(value);
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:ncraft.messaging.Nats)
  }

  // @@protoc_insertion_point(class_scope:ncraft.messaging.Nats)
  private static final io.ncraft.ncraft.messaging.Nats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.ncraft.ncraft.messaging.Nats();
  }

  public static io.ncraft.ncraft.messaging.Nats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Nats>
      PARSER = new com.google.protobuf.AbstractParser<Nats>() {
    @java.lang.Override
    public Nats parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Nats(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Nats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Nats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.ncraft.ncraft.messaging.Nats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
