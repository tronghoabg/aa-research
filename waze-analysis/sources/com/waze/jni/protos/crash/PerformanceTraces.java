package com.waze.jni.protos.crash;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.crash.PerformanceTrace;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PerformanceTraces extends du<PerformanceTraces, Builder> implements PerformanceTracesOrBuilder {
    private static final PerformanceTraces DEFAULT_INSTANCE;
    private static volatile fo<PerformanceTraces> PARSER = null;
    public static final int TIME_NOW_NS_FIELD_NUMBER = 2;
    public static final int TRACES_FIELD_NUMBER = 1;
    private int bitField0_;
    private long timeNowNs_;
    private eo<PerformanceTrace> traces_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.crash.PerformanceTraces$1, reason: invalid class name */
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

    static {
        PerformanceTraces performanceTraces = new PerformanceTraces();
        DEFAULT_INSTANCE = performanceTraces;
        du.registerDefaultInstance(PerformanceTraces.class, performanceTraces);
    }

    private PerformanceTraces() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTraces(Iterable<? extends PerformanceTrace> iterable) {
        ensureTracesIsMutable();
        c.addAll(iterable, this.traces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTraces(int i2, PerformanceTrace performanceTrace) {
        Objects.requireNonNull(performanceTrace);
        ensureTracesIsMutable();
        this.traces_.add(i2, performanceTrace);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeNowNs() {
        this.bitField0_ &= -2;
        this.timeNowNs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraces() {
        this.traces_ = emptyProtobufList();
    }

    private void ensureTracesIsMutable() {
        eo<PerformanceTrace> eoVar = this.traces_;
        if (eoVar.c()) {
            return;
        }
        this.traces_ = du.mutableCopy(eoVar);
    }

    public static PerformanceTraces getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PerformanceTraces parseDelimitedFrom(InputStream inputStream) {
        return (PerformanceTraces) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerformanceTraces parseFrom(v vVar) {
        return (PerformanceTraces) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<PerformanceTraces> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTraces(int i2) {
        ensureTracesIsMutable();
        this.traces_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeNowNs(long j2) {
        this.bitField0_ |= 1;
        this.timeNowNs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraces(int i2, PerformanceTrace performanceTrace) {
        Objects.requireNonNull(performanceTrace);
        ensureTracesIsMutable();
        this.traces_.set(i2, performanceTrace);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"bitField0_", "traces_", PerformanceTrace.class, "timeNowNs_"});
        }
        if (iOrdinal == 3) {
            return new PerformanceTraces();
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
        fo<PerformanceTraces> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (PerformanceTraces.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.crash.PerformanceTracesOrBuilder
    public long getTimeNowNs() {
        return this.timeNowNs_;
    }

    @Override // com.waze.jni.protos.crash.PerformanceTracesOrBuilder
    public PerformanceTrace getTraces(int i2) {
        return this.traces_.get(i2);
    }

    @Override // com.waze.jni.protos.crash.PerformanceTracesOrBuilder
    public int getTracesCount() {
        return this.traces_.size();
    }

    @Override // com.waze.jni.protos.crash.PerformanceTracesOrBuilder
    public List<PerformanceTrace> getTracesList() {
        return this.traces_;
    }

    public PerformanceTraceOrBuilder getTracesOrBuilder(int i2) {
        return this.traces_.get(i2);
    }

    public List<? extends PerformanceTraceOrBuilder> getTracesOrBuilderList() {
        return this.traces_;
    }

    @Override // com.waze.jni.protos.crash.PerformanceTracesOrBuilder
    public boolean hasTimeNowNs() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(PerformanceTraces performanceTraces) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(performanceTraces);
    }

    public static PerformanceTraces parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (PerformanceTraces) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static PerformanceTraces parseFrom(v vVar, de deVar) {
        return (PerformanceTraces) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static PerformanceTraces parseFrom(z zVar) {
        return (PerformanceTraces) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static PerformanceTraces parseFrom(z zVar, de deVar) {
        return (PerformanceTraces) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTraces(PerformanceTrace performanceTrace) {
        Objects.requireNonNull(performanceTrace);
        ensureTracesIsMutable();
        this.traces_.add(performanceTrace);
    }

    public static PerformanceTraces parseFrom(InputStream inputStream) {
        return (PerformanceTraces) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerformanceTraces parseFrom(InputStream inputStream, de deVar) {
        return (PerformanceTraces) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static PerformanceTraces parseFrom(ByteBuffer byteBuffer) {
        return (PerformanceTraces) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PerformanceTraces parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (PerformanceTraces) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<PerformanceTraces, Builder> implements PerformanceTracesOrBuilder {
        private Builder() {
            super(PerformanceTraces.DEFAULT_INSTANCE);
        }

        public Builder addAllTraces(Iterable<? extends PerformanceTrace> iterable) {
            copyOnWrite();
            ((PerformanceTraces) this.instance).addAllTraces(iterable);
            return this;
        }

        public Builder addTraces(int i2, PerformanceTrace.Builder builder) {
            copyOnWrite();
            ((PerformanceTraces) this.instance).addTraces(i2, builder.build());
            return this;
        }

        public Builder clearTimeNowNs() {
            copyOnWrite();
            ((PerformanceTraces) this.instance).clearTimeNowNs();
            return this;
        }

        public Builder clearTraces() {
            copyOnWrite();
            ((PerformanceTraces) this.instance).clearTraces();
            return this;
        }

        @Override // com.waze.jni.protos.crash.PerformanceTracesOrBuilder
        public long getTimeNowNs() {
            return ((PerformanceTraces) this.instance).getTimeNowNs();
        }

        @Override // com.waze.jni.protos.crash.PerformanceTracesOrBuilder
        public PerformanceTrace getTraces(int i2) {
            return ((PerformanceTraces) this.instance).getTraces(i2);
        }

        @Override // com.waze.jni.protos.crash.PerformanceTracesOrBuilder
        public int getTracesCount() {
            return ((PerformanceTraces) this.instance).getTracesCount();
        }

        @Override // com.waze.jni.protos.crash.PerformanceTracesOrBuilder
        public List<PerformanceTrace> getTracesList() {
            return DesugarCollections.unmodifiableList(((PerformanceTraces) this.instance).getTracesList());
        }

        @Override // com.waze.jni.protos.crash.PerformanceTracesOrBuilder
        public boolean hasTimeNowNs() {
            return ((PerformanceTraces) this.instance).hasTimeNowNs();
        }

        public Builder removeTraces(int i2) {
            copyOnWrite();
            ((PerformanceTraces) this.instance).removeTraces(i2);
            return this;
        }

        public Builder setTimeNowNs(long j2) {
            copyOnWrite();
            ((PerformanceTraces) this.instance).setTimeNowNs(j2);
            return this;
        }

        public Builder setTraces(int i2, PerformanceTrace.Builder builder) {
            copyOnWrite();
            ((PerformanceTraces) this.instance).setTraces(i2, builder.build());
            return this;
        }

        public Builder addTraces(int i2, PerformanceTrace performanceTrace) {
            copyOnWrite();
            ((PerformanceTraces) this.instance).addTraces(i2, performanceTrace);
            return this;
        }

        public Builder setTraces(int i2, PerformanceTrace performanceTrace) {
            copyOnWrite();
            ((PerformanceTraces) this.instance).setTraces(i2, performanceTrace);
            return this;
        }

        public Builder addTraces(PerformanceTrace.Builder builder) {
            copyOnWrite();
            ((PerformanceTraces) this.instance).addTraces(builder.build());
            return this;
        }

        public Builder addTraces(PerformanceTrace performanceTrace) {
            copyOnWrite();
            ((PerformanceTraces) this.instance).addTraces(performanceTrace);
            return this;
        }
    }

    public static PerformanceTraces parseFrom(byte[] bArr) {
        return (PerformanceTraces) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerformanceTraces parseFrom(byte[] bArr, de deVar) {
        return (PerformanceTraces) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
