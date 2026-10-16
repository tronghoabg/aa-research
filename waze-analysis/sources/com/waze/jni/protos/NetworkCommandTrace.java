package com.waze.jni.protos;

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
public final class NetworkCommandTrace extends du<NetworkCommandTrace, Builder> implements NetworkCommandTraceOrBuilder {
    private static final NetworkCommandTrace DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NETWORK_LATENCY_MS_FIELD_NUMBER = 3;
    private static volatile fo<NetworkCommandTrace> PARSER = null;
    public static final int QUEUE_LATENCY_MS_FIELD_NUMBER = 2;
    public static final int RETRY_COUNT_FIELD_NUMBER = 4;
    private String name_ = "";
    private int networkLatencyMs_;
    private int queueLatencyMs_;
    private int retryCount_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.NetworkCommandTrace$1, reason: invalid class name */
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
    public final class Builder extends dm<NetworkCommandTrace, Builder> implements NetworkCommandTraceOrBuilder {
        private Builder() {
            super(NetworkCommandTrace.DEFAULT_INSTANCE);
        }

        public Builder clearName() {
            copyOnWrite();
            ((NetworkCommandTrace) this.instance).clearName();
            return this;
        }

        public Builder clearNetworkLatencyMs() {
            copyOnWrite();
            ((NetworkCommandTrace) this.instance).clearNetworkLatencyMs();
            return this;
        }

        public Builder clearQueueLatencyMs() {
            copyOnWrite();
            ((NetworkCommandTrace) this.instance).clearQueueLatencyMs();
            return this;
        }

        public Builder clearRetryCount() {
            copyOnWrite();
            ((NetworkCommandTrace) this.instance).clearRetryCount();
            return this;
        }

        @Override // com.waze.jni.protos.NetworkCommandTraceOrBuilder
        public String getName() {
            return ((NetworkCommandTrace) this.instance).getName();
        }

        @Override // com.waze.jni.protos.NetworkCommandTraceOrBuilder
        public v getNameBytes() {
            return ((NetworkCommandTrace) this.instance).getNameBytes();
        }

        @Override // com.waze.jni.protos.NetworkCommandTraceOrBuilder
        public int getNetworkLatencyMs() {
            return ((NetworkCommandTrace) this.instance).getNetworkLatencyMs();
        }

        @Override // com.waze.jni.protos.NetworkCommandTraceOrBuilder
        public int getQueueLatencyMs() {
            return ((NetworkCommandTrace) this.instance).getQueueLatencyMs();
        }

        @Override // com.waze.jni.protos.NetworkCommandTraceOrBuilder
        public int getRetryCount() {
            return ((NetworkCommandTrace) this.instance).getRetryCount();
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((NetworkCommandTrace) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(v vVar) {
            copyOnWrite();
            ((NetworkCommandTrace) this.instance).setNameBytes(vVar);
            return this;
        }

        public Builder setNetworkLatencyMs(int i2) {
            copyOnWrite();
            ((NetworkCommandTrace) this.instance).setNetworkLatencyMs(i2);
            return this;
        }

        public Builder setQueueLatencyMs(int i2) {
            copyOnWrite();
            ((NetworkCommandTrace) this.instance).setQueueLatencyMs(i2);
            return this;
        }

        public Builder setRetryCount(int i2) {
            copyOnWrite();
            ((NetworkCommandTrace) this.instance).setRetryCount(i2);
            return this;
        }
    }

    static {
        NetworkCommandTrace networkCommandTrace = new NetworkCommandTrace();
        DEFAULT_INSTANCE = networkCommandTrace;
        du.registerDefaultInstance(NetworkCommandTrace.class, networkCommandTrace);
    }

    private NetworkCommandTrace() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkLatencyMs() {
        this.networkLatencyMs_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueueLatencyMs() {
        this.queueLatencyMs_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetryCount() {
        this.retryCount_ = 0;
    }

    public static NetworkCommandTrace getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NetworkCommandTrace parseDelimitedFrom(InputStream inputStream) {
        return (NetworkCommandTrace) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkCommandTrace parseFrom(v vVar) {
        return (NetworkCommandTrace) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NetworkCommandTrace> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.name_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkLatencyMs(int i2) {
        this.networkLatencyMs_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueueLatencyMs(int i2) {
        this.queueLatencyMs_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetryCount(int i2) {
        this.retryCount_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"name_", "queueLatencyMs_", "networkLatencyMs_", "retryCount_"});
        }
        if (iOrdinal == 3) {
            return new NetworkCommandTrace();
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
        fo<NetworkCommandTrace> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NetworkCommandTrace.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.NetworkCommandTraceOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.waze.jni.protos.NetworkCommandTraceOrBuilder
    public v getNameBytes() {
        return v.s(this.name_);
    }

    @Override // com.waze.jni.protos.NetworkCommandTraceOrBuilder
    public int getNetworkLatencyMs() {
        return this.networkLatencyMs_;
    }

    @Override // com.waze.jni.protos.NetworkCommandTraceOrBuilder
    public int getQueueLatencyMs() {
        return this.queueLatencyMs_;
    }

    @Override // com.waze.jni.protos.NetworkCommandTraceOrBuilder
    public int getRetryCount() {
        return this.retryCount_;
    }

    public static Builder newBuilder(NetworkCommandTrace networkCommandTrace) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(networkCommandTrace);
    }

    public static NetworkCommandTrace parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NetworkCommandTrace) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NetworkCommandTrace parseFrom(v vVar, de deVar) {
        return (NetworkCommandTrace) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NetworkCommandTrace parseFrom(z zVar) {
        return (NetworkCommandTrace) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NetworkCommandTrace parseFrom(z zVar, de deVar) {
        return (NetworkCommandTrace) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NetworkCommandTrace parseFrom(InputStream inputStream) {
        return (NetworkCommandTrace) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkCommandTrace parseFrom(InputStream inputStream, de deVar) {
        return (NetworkCommandTrace) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NetworkCommandTrace parseFrom(ByteBuffer byteBuffer) {
        return (NetworkCommandTrace) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NetworkCommandTrace parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NetworkCommandTrace) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static NetworkCommandTrace parseFrom(byte[] bArr) {
        return (NetworkCommandTrace) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NetworkCommandTrace parseFrom(byte[] bArr, de deVar) {
        return (NetworkCommandTrace) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
