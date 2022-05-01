// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ncraft/messaging/received_message.proto

package io.ncraft.ncraft.messaging;

public interface ReceivedMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ncraft.messaging.ReceivedMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>map&lt;string, .mojo.core.Value&gt; attributes = 2;</code>
   */
  int getAttributesCount();
  /**
   * <code>map&lt;string, .mojo.core.Value&gt; attributes = 2;</code>
   */
  boolean containsAttributes(
      java.lang.String key);
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.core.Value>
  getAttributes();
  /**
   * <code>map&lt;string, .mojo.core.Value&gt; attributes = 2;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.core.Value>
  getAttributesMap();
  /**
   * <code>map&lt;string, .mojo.core.Value&gt; attributes = 2;</code>
   */

  org.mojolang.mojo.core.Value getAttributesOrDefault(
      java.lang.String key,
      org.mojolang.mojo.core.Value defaultValue);
  /**
   * <code>map&lt;string, .mojo.core.Value&gt; attributes = 2;</code>
   */

  org.mojolang.mojo.core.Value getAttributesOrThrow(
      java.lang.String key);

  /**
   * <code>.mojo.core.Any data = 3;</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <code>.mojo.core.Any data = 3;</code>
   * @return The data.
   */
  org.mojolang.mojo.core.Any getData();
  /**
   * <code>.mojo.core.Any data = 3;</code>
   */
  org.mojolang.mojo.core.AnyOrBuilder getDataOrBuilder();

  /**
   * <code>string ack_id = 11;</code>
   * @return The ackId.
   */
  java.lang.String getAckId();
  /**
   * <code>string ack_id = 11;</code>
   * @return The bytes for ackId.
   */
  com.google.protobuf.ByteString
      getAckIdBytes();

  /**
   * <code>string subscription = 12;</code>
   * @return The subscription.
   */
  java.lang.String getSubscription();
  /**
   * <code>string subscription = 12;</code>
   * @return The bytes for subscription.
   */
  com.google.protobuf.ByteString
      getSubscriptionBytes();

  /**
   * <code>.mojo.core.Timestamp publish_time = 13;</code>
   * @return Whether the publishTime field is set.
   */
  boolean hasPublishTime();
  /**
   * <code>.mojo.core.Timestamp publish_time = 13;</code>
   * @return The publishTime.
   */
  org.mojolang.mojo.core.Timestamp getPublishTime();
  /**
   * <code>.mojo.core.Timestamp publish_time = 13;</code>
   */
  org.mojolang.mojo.core.TimestampOrBuilder getPublishTimeOrBuilder();
}
