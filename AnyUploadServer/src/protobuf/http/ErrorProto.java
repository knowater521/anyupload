// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErrorProto.proto

package protobuf.http;

public final class ErrorProto {
  private ErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code protobuf.http.ErrorCode}
   */
  public enum ErrorCode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *md5校验失败
     * </pre>
     *
     * <code>ERROR_CODE_0 = 0;</code>
     */
    ERROR_CODE_0(0),
    /**
     * <pre>
     *上传失败，不存在这个文件
     * </pre>
     *
     * <code>ERROR_CODE_1 = 1;</code>
     */
    ERROR_CODE_1(1),
    /**
     * <pre>
     *上传失败，上传位置不对
     * </pre>
     *
     * <code>ERROR_CODE_2 = 2;</code>
     */
    ERROR_CODE_2(2),
    /**
     * <pre>
     *上传失败，长度不对
     * </pre>
     *
     * <code>ERROR_CODE_3 = 3;</code>
     */
    ERROR_CODE_3(3),
    /**
     * <pre>
     *上传失败，没发送文件
     * </pre>
     *
     * <code>ERROR_CODE_4 = 4;</code>
     */
    ERROR_CODE_4(4),
    /**
     * <pre>
     *上传失败，不存在实体文件
     * </pre>
     *
     * <code>ERROR_CODE_5 = 5;</code>
     */
    ERROR_CODE_5(5),
    /**
     * <pre>
     *上传失败，时间超前
     * </pre>
     *
     * <code>ERROR_CODE_6 = 6;</code>
     */
    ERROR_CODE_6(6),
    /**
     * <pre>
     *上传失败，更换基础文件失败
     * </pre>
     *
     * <code>ERROR_CODE_7 = 7;</code>
     */
    ERROR_CODE_7(7),
    /**
     * <pre>
     *上传失败，写入文件失败
     * </pre>
     *
     * <code>ERROR_CODE_8 = 8;</code>
     */
    ERROR_CODE_8(8),
    /**
     * <pre>
     *上传失败，更新数据失败
     * </pre>
     *
     * <code>ERROR_CODE_9 = 9;</code>
     */
    ERROR_CODE_9(9),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     *md5校验失败
     * </pre>
     *
     * <code>ERROR_CODE_0 = 0;</code>
     */
    public static final int ERROR_CODE_0_VALUE = 0;
    /**
     * <pre>
     *上传失败，不存在这个文件
     * </pre>
     *
     * <code>ERROR_CODE_1 = 1;</code>
     */
    public static final int ERROR_CODE_1_VALUE = 1;
    /**
     * <pre>
     *上传失败，上传位置不对
     * </pre>
     *
     * <code>ERROR_CODE_2 = 2;</code>
     */
    public static final int ERROR_CODE_2_VALUE = 2;
    /**
     * <pre>
     *上传失败，长度不对
     * </pre>
     *
     * <code>ERROR_CODE_3 = 3;</code>
     */
    public static final int ERROR_CODE_3_VALUE = 3;
    /**
     * <pre>
     *上传失败，没发送文件
     * </pre>
     *
     * <code>ERROR_CODE_4 = 4;</code>
     */
    public static final int ERROR_CODE_4_VALUE = 4;
    /**
     * <pre>
     *上传失败，不存在实体文件
     * </pre>
     *
     * <code>ERROR_CODE_5 = 5;</code>
     */
    public static final int ERROR_CODE_5_VALUE = 5;
    /**
     * <pre>
     *上传失败，时间超前
     * </pre>
     *
     * <code>ERROR_CODE_6 = 6;</code>
     */
    public static final int ERROR_CODE_6_VALUE = 6;
    /**
     * <pre>
     *上传失败，更换基础文件失败
     * </pre>
     *
     * <code>ERROR_CODE_7 = 7;</code>
     */
    public static final int ERROR_CODE_7_VALUE = 7;
    /**
     * <pre>
     *上传失败，写入文件失败
     * </pre>
     *
     * <code>ERROR_CODE_8 = 8;</code>
     */
    public static final int ERROR_CODE_8_VALUE = 8;
    /**
     * <pre>
     *上传失败，更新数据失败
     * </pre>
     *
     * <code>ERROR_CODE_9 = 9;</code>
     */
    public static final int ERROR_CODE_9_VALUE = 9;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ErrorCode valueOf(int value) {
      return forNumber(value);
    }

    public static ErrorCode forNumber(int value) {
      switch (value) {
        case 0: return ERROR_CODE_0;
        case 1: return ERROR_CODE_1;
        case 2: return ERROR_CODE_2;
        case 3: return ERROR_CODE_3;
        case 4: return ERROR_CODE_4;
        case 5: return ERROR_CODE_5;
        case 6: return ERROR_CODE_6;
        case 7: return ERROR_CODE_7;
        case 8: return ERROR_CODE_8;
        case 9: return ERROR_CODE_9;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ErrorCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ErrorCode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ErrorCode>() {
            public ErrorCode findValueByNumber(int number) {
              return ErrorCode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return protobuf.http.ErrorProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final ErrorCode[] VALUES = values();

    public static ErrorCode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ErrorCode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:protobuf.http.ErrorCode)
  }

  public interface ErrorSOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf.http.ErrorS)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string hOpCode = 1;</code>
     */
    java.lang.String getHOpCode();
    /**
     * <code>optional string hOpCode = 1;</code>
     */
    com.google.protobuf.ByteString
        getHOpCodeBytes();

    /**
     * <code>optional .protobuf.http.ErrorCode errorCode = 2;</code>
     */
    int getErrorCodeValue();
    /**
     * <code>optional .protobuf.http.ErrorCode errorCode = 2;</code>
     */
    protobuf.http.ErrorProto.ErrorCode getErrorCode();

    /**
     * <code>optional string errorHOpCode = 3;</code>
     */
    java.lang.String getErrorHOpCode();
    /**
     * <code>optional string errorHOpCode = 3;</code>
     */
    com.google.protobuf.ByteString
        getErrorHOpCodeBytes();

    /**
     * <code>optional string extraMsg = 4;</code>
     */
    java.lang.String getExtraMsg();
    /**
     * <code>optional string extraMsg = 4;</code>
     */
    com.google.protobuf.ByteString
        getExtraMsgBytes();
  }
  /**
   * Protobuf type {@code protobuf.http.ErrorS}
   */
  public  static final class ErrorS extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protobuf.http.ErrorS)
      ErrorSOrBuilder {
    // Use ErrorS.newBuilder() to construct.
    private ErrorS(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ErrorS() {
      hOpCode_ = "";
      errorCode_ = 0;
      errorHOpCode_ = "";
      extraMsg_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ErrorS(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              hOpCode_ = s;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              errorCode_ = rawValue;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              errorHOpCode_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              extraMsg_ = s;
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf.http.ErrorProto.internal_static_protobuf_http_ErrorS_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf.http.ErrorProto.internal_static_protobuf_http_ErrorS_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protobuf.http.ErrorProto.ErrorS.class, protobuf.http.ErrorProto.ErrorS.Builder.class);
    }

    public static final int HOPCODE_FIELD_NUMBER = 1;
    private volatile java.lang.Object hOpCode_;
    /**
     * <code>optional string hOpCode = 1;</code>
     */
    public java.lang.String getHOpCode() {
      java.lang.Object ref = hOpCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hOpCode_ = s;
        return s;
      }
    }
    /**
     * <code>optional string hOpCode = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHOpCodeBytes() {
      java.lang.Object ref = hOpCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hOpCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ERRORCODE_FIELD_NUMBER = 2;
    private int errorCode_;
    /**
     * <code>optional .protobuf.http.ErrorCode errorCode = 2;</code>
     */
    public int getErrorCodeValue() {
      return errorCode_;
    }
    /**
     * <code>optional .protobuf.http.ErrorCode errorCode = 2;</code>
     */
    public protobuf.http.ErrorProto.ErrorCode getErrorCode() {
      protobuf.http.ErrorProto.ErrorCode result = protobuf.http.ErrorProto.ErrorCode.valueOf(errorCode_);
      return result == null ? protobuf.http.ErrorProto.ErrorCode.UNRECOGNIZED : result;
    }

    public static final int ERRORHOPCODE_FIELD_NUMBER = 3;
    private volatile java.lang.Object errorHOpCode_;
    /**
     * <code>optional string errorHOpCode = 3;</code>
     */
    public java.lang.String getErrorHOpCode() {
      java.lang.Object ref = errorHOpCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorHOpCode_ = s;
        return s;
      }
    }
    /**
     * <code>optional string errorHOpCode = 3;</code>
     */
    public com.google.protobuf.ByteString
        getErrorHOpCodeBytes() {
      java.lang.Object ref = errorHOpCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorHOpCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EXTRAMSG_FIELD_NUMBER = 4;
    private volatile java.lang.Object extraMsg_;
    /**
     * <code>optional string extraMsg = 4;</code>
     */
    public java.lang.String getExtraMsg() {
      java.lang.Object ref = extraMsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extraMsg_ = s;
        return s;
      }
    }
    /**
     * <code>optional string extraMsg = 4;</code>
     */
    public com.google.protobuf.ByteString
        getExtraMsgBytes() {
      java.lang.Object ref = extraMsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        extraMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getHOpCodeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hOpCode_);
      }
      if (errorCode_ != protobuf.http.ErrorProto.ErrorCode.ERROR_CODE_0.getNumber()) {
        output.writeEnum(2, errorCode_);
      }
      if (!getErrorHOpCodeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, errorHOpCode_);
      }
      if (!getExtraMsgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, extraMsg_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getHOpCodeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hOpCode_);
      }
      if (errorCode_ != protobuf.http.ErrorProto.ErrorCode.ERROR_CODE_0.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, errorCode_);
      }
      if (!getErrorHOpCodeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, errorHOpCode_);
      }
      if (!getExtraMsgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, extraMsg_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof protobuf.http.ErrorProto.ErrorS)) {
        return super.equals(obj);
      }
      protobuf.http.ErrorProto.ErrorS other = (protobuf.http.ErrorProto.ErrorS) obj;

      boolean result = true;
      result = result && getHOpCode()
          .equals(other.getHOpCode());
      result = result && errorCode_ == other.errorCode_;
      result = result && getErrorHOpCode()
          .equals(other.getErrorHOpCode());
      result = result && getExtraMsg()
          .equals(other.getExtraMsg());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + HOPCODE_FIELD_NUMBER;
      hash = (53 * hash) + getHOpCode().hashCode();
      hash = (37 * hash) + ERRORCODE_FIELD_NUMBER;
      hash = (53 * hash) + errorCode_;
      hash = (37 * hash) + ERRORHOPCODE_FIELD_NUMBER;
      hash = (53 * hash) + getErrorHOpCode().hashCode();
      hash = (37 * hash) + EXTRAMSG_FIELD_NUMBER;
      hash = (53 * hash) + getExtraMsg().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static protobuf.http.ErrorProto.ErrorS parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf.http.ErrorProto.ErrorS parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf.http.ErrorProto.ErrorS parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf.http.ErrorProto.ErrorS parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf.http.ErrorProto.ErrorS parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protobuf.http.ErrorProto.ErrorS parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static protobuf.http.ErrorProto.ErrorS parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static protobuf.http.ErrorProto.ErrorS parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static protobuf.http.ErrorProto.ErrorS parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protobuf.http.ErrorProto.ErrorS parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(protobuf.http.ErrorProto.ErrorS prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code protobuf.http.ErrorS}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf.http.ErrorS)
        protobuf.http.ErrorProto.ErrorSOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protobuf.http.ErrorProto.internal_static_protobuf_http_ErrorS_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protobuf.http.ErrorProto.internal_static_protobuf_http_ErrorS_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protobuf.http.ErrorProto.ErrorS.class, protobuf.http.ErrorProto.ErrorS.Builder.class);
      }

      // Construct using protobuf.http.ErrorProto.ErrorS.newBuilder()
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
      public Builder clear() {
        super.clear();
        hOpCode_ = "";

        errorCode_ = 0;

        errorHOpCode_ = "";

        extraMsg_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protobuf.http.ErrorProto.internal_static_protobuf_http_ErrorS_descriptor;
      }

      public protobuf.http.ErrorProto.ErrorS getDefaultInstanceForType() {
        return protobuf.http.ErrorProto.ErrorS.getDefaultInstance();
      }

      public protobuf.http.ErrorProto.ErrorS build() {
        protobuf.http.ErrorProto.ErrorS result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protobuf.http.ErrorProto.ErrorS buildPartial() {
        protobuf.http.ErrorProto.ErrorS result = new protobuf.http.ErrorProto.ErrorS(this);
        result.hOpCode_ = hOpCode_;
        result.errorCode_ = errorCode_;
        result.errorHOpCode_ = errorHOpCode_;
        result.extraMsg_ = extraMsg_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protobuf.http.ErrorProto.ErrorS) {
          return mergeFrom((protobuf.http.ErrorProto.ErrorS)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protobuf.http.ErrorProto.ErrorS other) {
        if (other == protobuf.http.ErrorProto.ErrorS.getDefaultInstance()) return this;
        if (!other.getHOpCode().isEmpty()) {
          hOpCode_ = other.hOpCode_;
          onChanged();
        }
        if (other.errorCode_ != 0) {
          setErrorCodeValue(other.getErrorCodeValue());
        }
        if (!other.getErrorHOpCode().isEmpty()) {
          errorHOpCode_ = other.errorHOpCode_;
          onChanged();
        }
        if (!other.getExtraMsg().isEmpty()) {
          extraMsg_ = other.extraMsg_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protobuf.http.ErrorProto.ErrorS parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protobuf.http.ErrorProto.ErrorS) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object hOpCode_ = "";
      /**
       * <code>optional string hOpCode = 1;</code>
       */
      public java.lang.String getHOpCode() {
        java.lang.Object ref = hOpCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          hOpCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string hOpCode = 1;</code>
       */
      public com.google.protobuf.ByteString
          getHOpCodeBytes() {
        java.lang.Object ref = hOpCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          hOpCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string hOpCode = 1;</code>
       */
      public Builder setHOpCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        hOpCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string hOpCode = 1;</code>
       */
      public Builder clearHOpCode() {
        
        hOpCode_ = getDefaultInstance().getHOpCode();
        onChanged();
        return this;
      }
      /**
       * <code>optional string hOpCode = 1;</code>
       */
      public Builder setHOpCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        hOpCode_ = value;
        onChanged();
        return this;
      }

      private int errorCode_ = 0;
      /**
       * <code>optional .protobuf.http.ErrorCode errorCode = 2;</code>
       */
      public int getErrorCodeValue() {
        return errorCode_;
      }
      /**
       * <code>optional .protobuf.http.ErrorCode errorCode = 2;</code>
       */
      public Builder setErrorCodeValue(int value) {
        errorCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .protobuf.http.ErrorCode errorCode = 2;</code>
       */
      public protobuf.http.ErrorProto.ErrorCode getErrorCode() {
        protobuf.http.ErrorProto.ErrorCode result = protobuf.http.ErrorProto.ErrorCode.valueOf(errorCode_);
        return result == null ? protobuf.http.ErrorProto.ErrorCode.UNRECOGNIZED : result;
      }
      /**
       * <code>optional .protobuf.http.ErrorCode errorCode = 2;</code>
       */
      public Builder setErrorCode(protobuf.http.ErrorProto.ErrorCode value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        errorCode_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .protobuf.http.ErrorCode errorCode = 2;</code>
       */
      public Builder clearErrorCode() {
        
        errorCode_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object errorHOpCode_ = "";
      /**
       * <code>optional string errorHOpCode = 3;</code>
       */
      public java.lang.String getErrorHOpCode() {
        java.lang.Object ref = errorHOpCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          errorHOpCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string errorHOpCode = 3;</code>
       */
      public com.google.protobuf.ByteString
          getErrorHOpCodeBytes() {
        java.lang.Object ref = errorHOpCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          errorHOpCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string errorHOpCode = 3;</code>
       */
      public Builder setErrorHOpCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        errorHOpCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string errorHOpCode = 3;</code>
       */
      public Builder clearErrorHOpCode() {
        
        errorHOpCode_ = getDefaultInstance().getErrorHOpCode();
        onChanged();
        return this;
      }
      /**
       * <code>optional string errorHOpCode = 3;</code>
       */
      public Builder setErrorHOpCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        errorHOpCode_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object extraMsg_ = "";
      /**
       * <code>optional string extraMsg = 4;</code>
       */
      public java.lang.String getExtraMsg() {
        java.lang.Object ref = extraMsg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          extraMsg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string extraMsg = 4;</code>
       */
      public com.google.protobuf.ByteString
          getExtraMsgBytes() {
        java.lang.Object ref = extraMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          extraMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string extraMsg = 4;</code>
       */
      public Builder setExtraMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        extraMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string extraMsg = 4;</code>
       */
      public Builder clearExtraMsg() {
        
        extraMsg_ = getDefaultInstance().getExtraMsg();
        onChanged();
        return this;
      }
      /**
       * <code>optional string extraMsg = 4;</code>
       */
      public Builder setExtraMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        extraMsg_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:protobuf.http.ErrorS)
    }

    // @@protoc_insertion_point(class_scope:protobuf.http.ErrorS)
    private static final protobuf.http.ErrorProto.ErrorS DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new protobuf.http.ErrorProto.ErrorS();
    }

    public static protobuf.http.ErrorProto.ErrorS getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ErrorS>
        PARSER = new com.google.protobuf.AbstractParser<ErrorS>() {
      public ErrorS parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ErrorS(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ErrorS> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ErrorS> getParserForType() {
      return PARSER;
    }

    public protobuf.http.ErrorProto.ErrorS getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_http_ErrorS_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_http_ErrorS_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020ErrorProto.proto\022\rprotobuf.http\"n\n\006Err" +
      "orS\022\017\n\007hOpCode\030\001 \001(\t\022+\n\terrorCode\030\002 \001(\0162" +
      "\030.protobuf.http.ErrorCode\022\024\n\014errorHOpCod" +
      "e\030\003 \001(\t\022\020\n\010extraMsg\030\004 \001(\t*\277\001\n\tErrorCode\022" +
      "\020\n\014ERROR_CODE_0\020\000\022\020\n\014ERROR_CODE_1\020\001\022\020\n\014E" +
      "RROR_CODE_2\020\002\022\020\n\014ERROR_CODE_3\020\003\022\020\n\014ERROR" +
      "_CODE_4\020\004\022\020\n\014ERROR_CODE_5\020\005\022\020\n\014ERROR_COD" +
      "E_6\020\006\022\020\n\014ERROR_CODE_7\020\007\022\020\n\014ERROR_CODE_8\020" +
      "\010\022\020\n\014ERROR_CODE_9\020\tb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_protobuf_http_ErrorS_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_http_ErrorS_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_http_ErrorS_descriptor,
        new java.lang.String[] { "HOpCode", "ErrorCode", "ErrorHOpCode", "ExtraMsg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
