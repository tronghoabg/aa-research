package com.waze.jni.protos.network;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TransactionStatsMessage extends du<TransactionStatsMessage, Builder> implements TransactionStatsMessageOrBuilder {
    private static final TransactionStatsMessage DEFAULT_INSTANCE;
    public static final int INTEGRITY_TOKEN_GENERATION_LATENCY_MS_FIELD_NUMBER = 9;
    public static final int NETWORK_LATENCY_MS_FIELD_NUMBER = 3;
    private static volatile fo<TransactionStatsMessage> PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 5;
    public static final int QUEUE_ID_FIELD_NUMBER = 8;
    public static final int QUEUE_LATENCY_MS_FIELD_NUMBER = 1;
    public static final int REQUEST_SIZE_BYTES_FIELD_NUMBER = 6;
    public static final int RESPONSE_SIZE_BYTES_FIELD_NUMBER = 7;
    public static final int RETRIES_FIELD_NUMBER = 4;
    public static final int SERVER_PROCESSING_LATENCY_MS_FIELD_NUMBER = 2;
    private int bitField0_;
    private int integrityTokenGenerationLatencyMs_;
    private int networkLatencyMs_;
    private int priority_;
    private int queueId_;
    private int queueLatencyMs_;
    private int requestSizeBytes_;
    private int responseSizeBytes_;
    private int retries_;
    private int serverProcessingLatencyMs_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.network.TransactionStatsMessage$1, reason: invalid class name */
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
    public final class Builder extends dm<TransactionStatsMessage, Builder> implements TransactionStatsMessageOrBuilder {
        private Builder() {
            super(TransactionStatsMessage.DEFAULT_INSTANCE);
        }

        public Builder clearIntegrityTokenGenerationLatencyMs() {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).clearIntegrityTokenGenerationLatencyMs();
            return this;
        }

        public Builder clearNetworkLatencyMs() {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).clearNetworkLatencyMs();
            return this;
        }

        public Builder clearPriority() {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).clearPriority();
            return this;
        }

        public Builder clearQueueId() {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).clearQueueId();
            return this;
        }

        public Builder clearQueueLatencyMs() {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).clearQueueLatencyMs();
            return this;
        }

        public Builder clearRequestSizeBytes() {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).clearRequestSizeBytes();
            return this;
        }

        public Builder clearResponseSizeBytes() {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).clearResponseSizeBytes();
            return this;
        }

        public Builder clearRetries() {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).clearRetries();
            return this;
        }

        public Builder clearServerProcessingLatencyMs() {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).clearServerProcessingLatencyMs();
            return this;
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public int getIntegrityTokenGenerationLatencyMs() {
            return ((TransactionStatsMessage) this.instance).getIntegrityTokenGenerationLatencyMs();
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public int getNetworkLatencyMs() {
            return ((TransactionStatsMessage) this.instance).getNetworkLatencyMs();
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public MessagePriority getPriority() {
            return ((TransactionStatsMessage) this.instance).getPriority();
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public int getPriorityValue() {
            return ((TransactionStatsMessage) this.instance).getPriorityValue();
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public TransactionQueueId getQueueId() {
            return ((TransactionStatsMessage) this.instance).getQueueId();
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public int getQueueIdValue() {
            return ((TransactionStatsMessage) this.instance).getQueueIdValue();
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public int getQueueLatencyMs() {
            return ((TransactionStatsMessage) this.instance).getQueueLatencyMs();
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public int getRequestSizeBytes() {
            return ((TransactionStatsMessage) this.instance).getRequestSizeBytes();
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public int getResponseSizeBytes() {
            return ((TransactionStatsMessage) this.instance).getResponseSizeBytes();
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public int getRetries() {
            return ((TransactionStatsMessage) this.instance).getRetries();
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public int getServerProcessingLatencyMs() {
            return ((TransactionStatsMessage) this.instance).getServerProcessingLatencyMs();
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public boolean hasIntegrityTokenGenerationLatencyMs() {
            return ((TransactionStatsMessage) this.instance).hasIntegrityTokenGenerationLatencyMs();
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public boolean hasNetworkLatencyMs() {
            return ((TransactionStatsMessage) this.instance).hasNetworkLatencyMs();
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public boolean hasPriority() {
            return ((TransactionStatsMessage) this.instance).hasPriority();
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public boolean hasRequestSizeBytes() {
            return ((TransactionStatsMessage) this.instance).hasRequestSizeBytes();
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public boolean hasResponseSizeBytes() {
            return ((TransactionStatsMessage) this.instance).hasResponseSizeBytes();
        }

        @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
        public boolean hasServerProcessingLatencyMs() {
            return ((TransactionStatsMessage) this.instance).hasServerProcessingLatencyMs();
        }

        public Builder setIntegrityTokenGenerationLatencyMs(int i2) {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).setIntegrityTokenGenerationLatencyMs(i2);
            return this;
        }

        public Builder setNetworkLatencyMs(int i2) {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).setNetworkLatencyMs(i2);
            return this;
        }

        public Builder setPriority(MessagePriority messagePriority) {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).setPriority(messagePriority);
            return this;
        }

        public Builder setPriorityValue(int i2) {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).setPriorityValue(i2);
            return this;
        }

        public Builder setQueueId(TransactionQueueId transactionQueueId) {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).setQueueId(transactionQueueId);
            return this;
        }

        public Builder setQueueIdValue(int i2) {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).setQueueIdValue(i2);
            return this;
        }

        public Builder setQueueLatencyMs(int i2) {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).setQueueLatencyMs(i2);
            return this;
        }

        public Builder setRequestSizeBytes(int i2) {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).setRequestSizeBytes(i2);
            return this;
        }

        public Builder setResponseSizeBytes(int i2) {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).setResponseSizeBytes(i2);
            return this;
        }

        public Builder setRetries(int i2) {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).setRetries(i2);
            return this;
        }

        public Builder setServerProcessingLatencyMs(int i2) {
            copyOnWrite();
            ((TransactionStatsMessage) this.instance).setServerProcessingLatencyMs(i2);
            return this;
        }
    }

    static {
        TransactionStatsMessage transactionStatsMessage = new TransactionStatsMessage();
        DEFAULT_INSTANCE = transactionStatsMessage;
        du.registerDefaultInstance(TransactionStatsMessage.class, transactionStatsMessage);
    }

    private TransactionStatsMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntegrityTokenGenerationLatencyMs() {
        this.bitField0_ &= -33;
        this.integrityTokenGenerationLatencyMs_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkLatencyMs() {
        this.bitField0_ &= -3;
        this.networkLatencyMs_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.bitField0_ &= -5;
        this.priority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueueId() {
        this.queueId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueueLatencyMs() {
        this.queueLatencyMs_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestSizeBytes() {
        this.bitField0_ &= -9;
        this.requestSizeBytes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseSizeBytes() {
        this.bitField0_ &= -17;
        this.responseSizeBytes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetries() {
        this.retries_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerProcessingLatencyMs() {
        this.bitField0_ &= -2;
        this.serverProcessingLatencyMs_ = 0;
    }

    public static TransactionStatsMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TransactionStatsMessage parseDelimitedFrom(InputStream inputStream) {
        return (TransactionStatsMessage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransactionStatsMessage parseFrom(v vVar) {
        return (TransactionStatsMessage) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<TransactionStatsMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntegrityTokenGenerationLatencyMs(int i2) {
        this.bitField0_ |= 32;
        this.integrityTokenGenerationLatencyMs_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkLatencyMs(int i2) {
        this.bitField0_ |= 2;
        this.networkLatencyMs_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(MessagePriority messagePriority) {
        this.priority_ = messagePriority.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriorityValue(int i2) {
        this.bitField0_ |= 4;
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
    public void setQueueLatencyMs(int i2) {
        this.queueLatencyMs_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestSizeBytes(int i2) {
        this.bitField0_ |= 8;
        this.requestSizeBytes_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseSizeBytes(int i2) {
        this.bitField0_ |= 16;
        this.responseSizeBytes_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetries(int i2) {
        this.retries_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerProcessingLatencyMs(int i2) {
        this.bitField0_ |= 1;
        this.serverProcessingLatencyMs_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002င\u0000\u0003င\u0001\u0004\u0004\u0005ဌ\u0002\u0006င\u0003\u0007င\u0004\b\f\tင\u0005", new Object[]{"bitField0_", "queueLatencyMs_", "serverProcessingLatencyMs_", "networkLatencyMs_", "retries_", "priority_", "requestSizeBytes_", "responseSizeBytes_", "queueId_", "integrityTokenGenerationLatencyMs_"});
        }
        if (iOrdinal == 3) {
            return new TransactionStatsMessage();
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
        fo<TransactionStatsMessage> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (TransactionStatsMessage.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public int getIntegrityTokenGenerationLatencyMs() {
        return this.integrityTokenGenerationLatencyMs_;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public int getNetworkLatencyMs() {
        return this.networkLatencyMs_;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public MessagePriority getPriority() {
        MessagePriority messagePriorityForNumber = MessagePriority.forNumber(this.priority_);
        return messagePriorityForNumber == null ? MessagePriority.UNRECOGNIZED : messagePriorityForNumber;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public int getPriorityValue() {
        return this.priority_;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public TransactionQueueId getQueueId() {
        TransactionQueueId transactionQueueIdForNumber = TransactionQueueId.forNumber(this.queueId_);
        return transactionQueueIdForNumber == null ? TransactionQueueId.UNRECOGNIZED : transactionQueueIdForNumber;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public int getQueueIdValue() {
        return this.queueId_;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public int getQueueLatencyMs() {
        return this.queueLatencyMs_;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public int getRequestSizeBytes() {
        return this.requestSizeBytes_;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public int getResponseSizeBytes() {
        return this.responseSizeBytes_;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public int getRetries() {
        return this.retries_;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public int getServerProcessingLatencyMs() {
        return this.serverProcessingLatencyMs_;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public boolean hasIntegrityTokenGenerationLatencyMs() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public boolean hasNetworkLatencyMs() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public boolean hasPriority() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public boolean hasRequestSizeBytes() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public boolean hasResponseSizeBytes() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.network.TransactionStatsMessageOrBuilder
    public boolean hasServerProcessingLatencyMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(TransactionStatsMessage transactionStatsMessage) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(transactionStatsMessage);
    }

    public static TransactionStatsMessage parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (TransactionStatsMessage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static TransactionStatsMessage parseFrom(v vVar, de deVar) {
        return (TransactionStatsMessage) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static TransactionStatsMessage parseFrom(z zVar) {
        return (TransactionStatsMessage) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static TransactionStatsMessage parseFrom(z zVar, de deVar) {
        return (TransactionStatsMessage) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static TransactionStatsMessage parseFrom(InputStream inputStream) {
        return (TransactionStatsMessage) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransactionStatsMessage parseFrom(InputStream inputStream, de deVar) {
        return (TransactionStatsMessage) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static TransactionStatsMessage parseFrom(ByteBuffer byteBuffer) {
        return (TransactionStatsMessage) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TransactionStatsMessage parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (TransactionStatsMessage) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static TransactionStatsMessage parseFrom(byte[] bArr) {
        return (TransactionStatsMessage) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TransactionStatsMessage parseFrom(byte[] bArr, de deVar) {
        return (TransactionStatsMessage) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
