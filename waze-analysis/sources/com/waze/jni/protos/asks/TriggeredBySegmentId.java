package com.waze.jni.protos.asks;

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
public final class TriggeredBySegmentId extends du<TriggeredBySegmentId, Builder> implements TriggeredBySegmentIdOrBuilder {
    private static final TriggeredBySegmentId DEFAULT_INSTANCE;
    private static volatile fo<TriggeredBySegmentId> PARSER = null;
    public static final int SEGMENT_ID_FIELD_NUMBER = 1;
    public static final int SEGMENT_TYPE_FIELD_NUMBER = 2;
    private String segmentId_ = "";
    private int segmentType_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.asks.TriggeredBySegmentId$1, reason: invalid class name */
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
    public final class Builder extends dm<TriggeredBySegmentId, Builder> implements TriggeredBySegmentIdOrBuilder {
        private Builder() {
            super(TriggeredBySegmentId.DEFAULT_INSTANCE);
        }

        public Builder clearSegmentId() {
            copyOnWrite();
            ((TriggeredBySegmentId) this.instance).clearSegmentId();
            return this;
        }

        public Builder clearSegmentType() {
            copyOnWrite();
            ((TriggeredBySegmentId) this.instance).clearSegmentType();
            return this;
        }

        @Override // com.waze.jni.protos.asks.TriggeredBySegmentIdOrBuilder
        public String getSegmentId() {
            return ((TriggeredBySegmentId) this.instance).getSegmentId();
        }

        @Override // com.waze.jni.protos.asks.TriggeredBySegmentIdOrBuilder
        public v getSegmentIdBytes() {
            return ((TriggeredBySegmentId) this.instance).getSegmentIdBytes();
        }

        @Override // com.waze.jni.protos.asks.TriggeredBySegmentIdOrBuilder
        public SegmentInsightType getSegmentType() {
            return ((TriggeredBySegmentId) this.instance).getSegmentType();
        }

        @Override // com.waze.jni.protos.asks.TriggeredBySegmentIdOrBuilder
        public int getSegmentTypeValue() {
            return ((TriggeredBySegmentId) this.instance).getSegmentTypeValue();
        }

        public Builder setSegmentId(String str) {
            copyOnWrite();
            ((TriggeredBySegmentId) this.instance).setSegmentId(str);
            return this;
        }

        public Builder setSegmentIdBytes(v vVar) {
            copyOnWrite();
            ((TriggeredBySegmentId) this.instance).setSegmentIdBytes(vVar);
            return this;
        }

        public Builder setSegmentType(SegmentInsightType segmentInsightType) {
            copyOnWrite();
            ((TriggeredBySegmentId) this.instance).setSegmentType(segmentInsightType);
            return this;
        }

        public Builder setSegmentTypeValue(int i2) {
            copyOnWrite();
            ((TriggeredBySegmentId) this.instance).setSegmentTypeValue(i2);
            return this;
        }
    }

    static {
        TriggeredBySegmentId triggeredBySegmentId = new TriggeredBySegmentId();
        DEFAULT_INSTANCE = triggeredBySegmentId;
        du.registerDefaultInstance(TriggeredBySegmentId.class, triggeredBySegmentId);
    }

    private TriggeredBySegmentId() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentId() {
        this.segmentId_ = getDefaultInstance().getSegmentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentType() {
        this.segmentType_ = 0;
    }

    public static TriggeredBySegmentId getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TriggeredBySegmentId parseDelimitedFrom(InputStream inputStream) {
        return (TriggeredBySegmentId) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TriggeredBySegmentId parseFrom(v vVar) {
        return (TriggeredBySegmentId) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<TriggeredBySegmentId> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentId(String str) {
        Objects.requireNonNull(str);
        this.segmentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.segmentId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentType(SegmentInsightType segmentInsightType) {
        this.segmentType_ = segmentInsightType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentTypeValue(int i2) {
        this.segmentType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"segmentId_", "segmentType_"});
        }
        if (iOrdinal == 3) {
            return new TriggeredBySegmentId();
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
        fo<TriggeredBySegmentId> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (TriggeredBySegmentId.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.asks.TriggeredBySegmentIdOrBuilder
    public String getSegmentId() {
        return this.segmentId_;
    }

    @Override // com.waze.jni.protos.asks.TriggeredBySegmentIdOrBuilder
    public v getSegmentIdBytes() {
        return v.s(this.segmentId_);
    }

    @Override // com.waze.jni.protos.asks.TriggeredBySegmentIdOrBuilder
    public SegmentInsightType getSegmentType() {
        SegmentInsightType segmentInsightTypeForNumber = SegmentInsightType.forNumber(this.segmentType_);
        return segmentInsightTypeForNumber == null ? SegmentInsightType.UNRECOGNIZED : segmentInsightTypeForNumber;
    }

    @Override // com.waze.jni.protos.asks.TriggeredBySegmentIdOrBuilder
    public int getSegmentTypeValue() {
        return this.segmentType_;
    }

    public static Builder newBuilder(TriggeredBySegmentId triggeredBySegmentId) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(triggeredBySegmentId);
    }

    public static TriggeredBySegmentId parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (TriggeredBySegmentId) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static TriggeredBySegmentId parseFrom(v vVar, de deVar) {
        return (TriggeredBySegmentId) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static TriggeredBySegmentId parseFrom(z zVar) {
        return (TriggeredBySegmentId) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static TriggeredBySegmentId parseFrom(z zVar, de deVar) {
        return (TriggeredBySegmentId) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static TriggeredBySegmentId parseFrom(InputStream inputStream) {
        return (TriggeredBySegmentId) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TriggeredBySegmentId parseFrom(InputStream inputStream, de deVar) {
        return (TriggeredBySegmentId) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static TriggeredBySegmentId parseFrom(ByteBuffer byteBuffer) {
        return (TriggeredBySegmentId) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TriggeredBySegmentId parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (TriggeredBySegmentId) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static TriggeredBySegmentId parseFrom(byte[] bArr) {
        return (TriggeredBySegmentId) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TriggeredBySegmentId parseFrom(byte[] bArr, de deVar) {
        return (TriggeredBySegmentId) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
