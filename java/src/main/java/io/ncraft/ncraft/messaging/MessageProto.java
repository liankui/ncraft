// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ncraft/messaging/message.proto

package io.ncraft.ncraft.messaging;

public final class MessageProto {
  private MessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ncraft_messaging_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ncraft_messaging_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ncraft_messaging_Message_AttributesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ncraft_messaging_Message_AttributesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036ncraft/messaging/message.proto\022\020ncraft" +
      ".messaging\032\023mojo/core/any.proto\032\025mojo/co" +
      "re/value.proto\"\267\001\n\007Message\022\n\n\002id\030\001 \001(\t\022=" +
      "\n\nattributes\030\002 \003(\0132).ncraft.messaging.Me" +
      "ssage.AttributesEntry\022\034\n\004data\030\003 \001(\0132\016.mo" +
      "jo.core.Any\032C\n\017AttributesEntry\022\013\n\003key\030\001 " +
      "\001(\t\022\037\n\005value\030\002 \001(\0132\020.mojo.core.Value:\0028\001" +
      "Bk\n\032io.ncraft.ncraft.messagingB\014MessageP" +
      "rotoP\001Z=github.com/ncraft-io/ncraft/go/p" +
      "kg/ncraft/messaging;messagingb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.core.AnyProto.getDescriptor(),
          org.mojolang.mojo.core.ValueProto.getDescriptor(),
        });
    internal_static_ncraft_messaging_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ncraft_messaging_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ncraft_messaging_Message_descriptor,
        new java.lang.String[] { "Id", "Attributes", "Data", });
    internal_static_ncraft_messaging_Message_AttributesEntry_descriptor =
      internal_static_ncraft_messaging_Message_descriptor.getNestedTypes().get(0);
    internal_static_ncraft_messaging_Message_AttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ncraft_messaging_Message_AttributesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    org.mojolang.mojo.core.AnyProto.getDescriptor();
    org.mojolang.mojo.core.ValueProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}