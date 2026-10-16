package com.waze.jni.protos.network;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MessageRequestMetadata extends du<MessageRequestMetadata, Builder> implements MessageRequestMetadataOrBuilder {
    public static final int AUTH_TYPE_FIELD_NUMBER = 4;
    public static final int CONTEXT_FIELD_NUMBER = 5;
    private static final MessageRequestMetadata DEFAULT_INSTANCE;
    private static volatile fo<MessageRequestMetadata> PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 7;
    public static final int QUEUE_ID_FIELD_NUMBER = 6;
    public static final int TRANSACTION_ID_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int URL_FIELD_NUMBER = 1;
    private int authType_;
    private int bitField0_;
    private long context_;
    private int priority_;
    private int queueId_;
    private int transactionId_;
    private String url_ = "";
    private String type_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.network.MessageRequestMetadata$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<MessageRequestMetadata, Builder> implements MessageRequestMetadataOrBuilder {
        private Builder() {
            super(MessageRequestMetadata.DEFAULT_INSTANCE);
        }

        public Builder clearAuthType() {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).clearAuthType();
            return this;
        }

        public Builder clearContext() {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).clearContext();
            return this;
        }

        public Builder clearPriority() {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).clearPriority();
            return this;
        }

        public Builder clearQueueId() {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).clearQueueId();
            return this;
        }

        public Builder clearTransactionId() {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).clearTransactionId();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).clearType();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).clearUrl();
            return this;
        }

        @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
        public MessageAuthType getAuthType() {
            return ((MessageRequestMetadata) this.instance).getAuthType();
        }

        @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
        public int getAuthTypeValue() {
            return ((MessageRequestMetadata) this.instance).getAuthTypeValue();
        }

        @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
        public long getContext() {
            return ((MessageRequestMetadata) this.instance).getContext();
        }

        @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
        public MessagePriority getPriority() {
            return ((MessageRequestMetadata) this.instance).getPriority();
        }

        @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
        public int getPriorityValue() {
            return ((MessageRequestMetadata) this.instance).getPriorityValue();
        }

        @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
        public TransactionQueueId getQueueId() {
            return ((MessageRequestMetadata) this.instance).getQueueId();
        }

        @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
        public int getQueueIdValue() {
            return ((MessageRequestMetadata) this.instance).getQueueIdValue();
        }

        @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
        public int getTransactionId() {
            return ((MessageRequestMetadata) this.instance).getTransactionId();
        }

        @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
        public String getType() {
            return ((MessageRequestMetadata) this.instance).getType();
        }

        @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
        public v getTypeBytes() {
            return ((MessageRequestMetadata) this.instance).getTypeBytes();
        }

        @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
        public String getUrl() {
            return ((MessageRequestMetadata) this.instance).getUrl();
        }

        @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
        public v getUrlBytes() {
            return ((MessageRequestMetadata) this.instance).getUrlBytes();
        }

        @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
        public boolean hasPriority() {
            return ((MessageRequestMetadata) this.instance).hasPriority();
        }

        public Builder setAuthType(MessageAuthType messageAuthType) {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).setAuthType(messageAuthType);
            return this;
        }

        public Builder setAuthTypeValue(int i2) {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).setAuthTypeValue(i2);
            return this;
        }

        public Builder setContext(long j2) {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).setContext(j2);
            return this;
        }

        public Builder setPriority(MessagePriority messagePriority) {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).setPriority(messagePriority);
            return this;
        }

        public Builder setPriorityValue(int i2) {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).setPriorityValue(i2);
            return this;
        }

        public Builder setQueueId(TransactionQueueId transactionQueueId) {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).setQueueId(transactionQueueId);
            return this;
        }

        public Builder setQueueIdValue(int i2) {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).setQueueIdValue(i2);
            return this;
        }

        public Builder setTransactionId(int i2) {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).setTransactionId(i2);
            return this;
        }

        public Builder setType(String str) {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).setType(str);
            return this;
        }

        public Builder setTypeBytes(v vVar) {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).setTypeBytes(vVar);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(v vVar) {
            copyOnWrite();
            ((MessageRequestMetadata) this.instance).setUrlBytes(vVar);
            return this;
        }
    }

    static {
        MessageRequestMetadata messageRequestMetadata = new MessageRequestMetadata();
        DEFAULT_INSTANCE = messageRequestMetadata;
        du.registerDefaultInstance(MessageRequestMetadata.class, messageRequestMetadata);
    }

    private MessageRequestMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthType() {
        this.authType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.bitField0_ &= -2;
        this.priority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueueId() {
        this.queueId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransactionId() {
        this.transactionId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static MessageRequestMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MessageRequestMetadata parseDelimitedFrom(InputStream inputStream) {
        return (MessageRequestMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessageRequestMetadata parseFrom(v vVar) {
        return (MessageRequestMetadata) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MessageRequestMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthType(MessageAuthType messageAuthType) {
        this.authType_ = messageAuthType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthTypeValue(int i2) {
        this.authType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(long j2) {
        this.context_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(MessagePriority messagePriority) {
        this.priority_ = messagePriority.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriorityValue(int i2) {
        this.bitField0_ |= 1;
        this.priority_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueueId(TransactionQueueId transactionQueueId) {
        this.queueId_ = transactionQueueId.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueueIdValue(int i2) {
        this.queueId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransactionId(int i2) {
        this.transactionId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        Objects.requireNonNull(str);
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.type_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        Objects.requireNonNull(str);
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.url_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\f\u0005\u0003\u0006\f\u0007ဌ\u0000", new Object[]{"bitField0_", "url_", "type_", "transactionId_", "authType_", "context_", "queueId_", "priority_"});
        }
        if (iOrdinal == 3) {
            return new MessageRequestMetadata();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<MessageRequestMetadata> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MessageRequestMetadata.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
    public MessageAuthType getAuthType() {
        MessageAuthType messageAuthTypeForNumber = MessageAuthType.forNumber(this.authType_);
        return messageAuthTypeForNumber == null ? MessageAuthType.UNRECOGNIZED : messageAuthTypeForNumber;
    }

    @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
    public int getAuthTypeValue() {
        return this.authType_;
    }

    @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
    public long getContext() {
        return this.context_;
    }

    @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
    public MessagePriority getPriority() {
        MessagePriority messagePriorityForNumber = MessagePriority.forNumber(this.priority_);
        return messagePriorityForNumber == null ? MessagePriority.UNRECOGNIZED : messagePriorityForNumber;
    }

    @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
    public int getPriorityValue() {
        return this.priority_;
    }

    @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
    public TransactionQueueId getQueueId() {
        TransactionQueueId transactionQueueIdForNumber = TransactionQueueId.forNumber(this.queueId_);
        return transactionQueueIdForNumber == null ? TransactionQueueId.UNRECOGNIZED : transactionQueueIdForNumber;
    }

    @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
    public int getQueueIdValue() {
        return this.queueId_;
    }

    @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
    public int getTransactionId() {
        return this.transactionId_;
    }

    @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
    public String getType() {
        return this.type_;
    }

    @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
    public v getTypeBytes() {
        return v.s(this.type_);
    }

    @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
    public String getUrl() {
        return this.url_;
    }

    @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
    public v getUrlBytes() {
        return v.s(this.url_);
    }

    @Override // com.waze.jni.protos.network.MessageRequestMetadataOrBuilder
    public boolean hasPriority() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(MessageRequestMetadata messageRequestMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(messageRequestMetadata);
    }

    public static MessageRequestMetadata parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MessageRequestMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MessageRequestMetadata parseFrom(v vVar, de deVar) {
        return (MessageRequestMetadata) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MessageRequestMetadata parseFrom(z zVar) {
        return (MessageRequestMetadata) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MessageRequestMetadata parseFrom(z zVar, de deVar) {
        return (MessageRequestMetadata) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static MessageRequestMetadata parseFrom(InputStream inputStream) {
        return (MessageRequestMetadata) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessageRequestMetadata parseFrom(InputStream inputStream, de deVar) {
        return (MessageRequestMetadata) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MessageRequestMetadata parseFrom(ByteBuffer byteBuffer) {
        return (MessageRequestMetadata) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MessageRequestMetadata parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MessageRequestMetadata) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static MessageRequestMetadata parseFrom(byte[] bArr) {
        return (MessageRequestMetadata) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessageRequestMetadata parseFrom(byte[] bArr, de deVar) {
        return (MessageRequestMetadata) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
