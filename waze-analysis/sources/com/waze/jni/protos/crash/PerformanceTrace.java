package com.waze.jni.protos.crash;

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
public final class PerformanceTrace extends du<PerformanceTrace, Builder> implements PerformanceTraceOrBuilder {
    private static final PerformanceTrace DEFAULT_INSTANCE;
    public static final int END_TIME_NS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<PerformanceTrace> PARSER = null;
    public static final int START_TIME_NS_FIELD_NUMBER = 2;
    private int bitField0_;
    private long endTimeNs_;
    private String name_ = "";
    private long startTimeNs_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.crash.PerformanceTrace$1, reason: invalid class name */
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
    public final class Builder extends dm<PerformanceTrace, Builder> implements PerformanceTraceOrBuilder {
        private Builder() {
            super(PerformanceTrace.DEFAULT_INSTANCE);
        }

        public Builder clearEndTimeNs() {
            copyOnWrite();
            ((PerformanceTrace) this.instance).clearEndTimeNs();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((PerformanceTrace) this.instance).clearName();
            return this;
        }

        public Builder clearStartTimeNs() {
            copyOnWrite();
            ((PerformanceTrace) this.instance).clearStartTimeNs();
            return this;
        }

        @Override // com.waze.jni.protos.crash.PerformanceTraceOrBuilder
        public long getEndTimeNs() {
            return ((PerformanceTrace) this.instance).getEndTimeNs();
        }

        @Override // com.waze.jni.protos.crash.PerformanceTraceOrBuilder
        public String getName() {
            return ((PerformanceTrace) this.instance).getName();
        }

        @Override // com.waze.jni.protos.crash.PerformanceTraceOrBuilder
        public v getNameBytes() {
            return ((PerformanceTrace) this.instance).getNameBytes();
        }

        @Override // com.waze.jni.protos.crash.PerformanceTraceOrBuilder
        public long getStartTimeNs() {
            return ((PerformanceTrace) this.instance).getStartTimeNs();
        }

        @Override // com.waze.jni.protos.crash.PerformanceTraceOrBuilder
        public boolean hasEndTimeNs() {
            return ((PerformanceTrace) this.instance).hasEndTimeNs();
        }

        @Override // com.waze.jni.protos.crash.PerformanceTraceOrBuilder
        public boolean hasName() {
            return ((PerformanceTrace) this.instance).hasName();
        }

        @Override // com.waze.jni.protos.crash.PerformanceTraceOrBuilder
        public boolean hasStartTimeNs() {
            return ((PerformanceTrace) this.instance).hasStartTimeNs();
        }

        public Builder setEndTimeNs(long j2) {
            copyOnWrite();
            ((PerformanceTrace) this.instance).setEndTimeNs(j2);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((PerformanceTrace) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(v vVar) {
            copyOnWrite();
            ((PerformanceTrace) this.instance).setNameBytes(vVar);
            return this;
        }

        public Builder setStartTimeNs(long j2) {
            copyOnWrite();
            ((PerformanceTrace) this.instance).setStartTimeNs(j2);
            return this;
        }
    }

    static {
        PerformanceTrace performanceTrace = new PerformanceTrace();
        DEFAULT_INSTANCE = performanceTrace;
        du.registerDefaultInstance(PerformanceTrace.class, performanceTrace);
    }

    private PerformanceTrace() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTimeNs() {
        this.bitField0_ &= -5;
        this.endTimeNs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTimeNs() {
        this.bitField0_ &= -3;
        this.startTimeNs_ = 0L;
    }

    public static PerformanceTrace getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PerformanceTrace parseDelimitedFrom(InputStream inputStream) {
        return (PerformanceTrace) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerformanceTrace parseFrom(v vVar) {
        return (PerformanceTrace) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<PerformanceTrace> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTimeNs(long j2) {
        this.bitField0_ |= 4;
        this.endTimeNs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimeNs(long j2) {
        this.bitField0_ |= 2;
        this.startTimeNs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "name_", "startTimeNs_", "endTimeNs_"});
        }
        if (iOrdinal == 3) {
            return new PerformanceTrace();
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
        fo<PerformanceTrace> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (PerformanceTrace.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.crash.PerformanceTraceOrBuilder
    public long getEndTimeNs() {
        return this.endTimeNs_;
    }

    @Override // com.waze.jni.protos.crash.PerformanceTraceOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.waze.jni.protos.crash.PerformanceTraceOrBuilder
    public v getNameBytes() {
        return v.s(this.name_);
    }

    @Override // com.waze.jni.protos.crash.PerformanceTraceOrBuilder
    public long getStartTimeNs() {
        return this.startTimeNs_;
    }

    @Override // com.waze.jni.protos.crash.PerformanceTraceOrBuilder
    public boolean hasEndTimeNs() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.crash.PerformanceTraceOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.crash.PerformanceTraceOrBuilder
    public boolean hasStartTimeNs() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(PerformanceTrace performanceTrace) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(performanceTrace);
    }

    public static PerformanceTrace parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (PerformanceTrace) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static PerformanceTrace parseFrom(v vVar, de deVar) {
        return (PerformanceTrace) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static PerformanceTrace parseFrom(z zVar) {
        return (PerformanceTrace) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static PerformanceTrace parseFrom(z zVar, de deVar) {
        return (PerformanceTrace) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static PerformanceTrace parseFrom(InputStream inputStream) {
        return (PerformanceTrace) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerformanceTrace parseFrom(InputStream inputStream, de deVar) {
        return (PerformanceTrace) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static PerformanceTrace parseFrom(ByteBuffer byteBuffer) {
        return (PerformanceTrace) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PerformanceTrace parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (PerformanceTrace) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static PerformanceTrace parseFrom(byte[] bArr) {
        return (PerformanceTrace) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerformanceTrace parseFrom(byte[] bArr, de deVar) {
        return (PerformanceTrace) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
