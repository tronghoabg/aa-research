package com.waze.jni.protos.map;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AnimationParams extends du<AnimationParams, Builder> implements AnimationParamsOrBuilder {
    public static final int ANIMATION_DURATION_MS_FIELD_NUMBER = 2;
    public static final int ANIMATION_START_TIME_MS_FIELD_NUMBER = 1;
    public static final int CURVETYPE_FIELD_NUMBER = 3;
    private static final AnimationParams DEFAULT_INSTANCE;
    private static volatile fo<AnimationParams> PARSER;
    private long animationDurationMs_;
    private long animationStartTimeMs_;
    private int curveType_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.AnimationParams$1, reason: invalid class name */
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
    public final class Builder extends dm<AnimationParams, Builder> implements AnimationParamsOrBuilder {
        private Builder() {
            super(AnimationParams.DEFAULT_INSTANCE);
        }

        public Builder clearAnimationDurationMs() {
            copyOnWrite();
            ((AnimationParams) this.instance).clearAnimationDurationMs();
            return this;
        }

        public Builder clearAnimationStartTimeMs() {
            copyOnWrite();
            ((AnimationParams) this.instance).clearAnimationStartTimeMs();
            return this;
        }

        public Builder clearCurveType() {
            copyOnWrite();
            ((AnimationParams) this.instance).clearCurveType();
            return this;
        }

        @Override // com.waze.jni.protos.map.AnimationParamsOrBuilder
        public long getAnimationDurationMs() {
            return ((AnimationParams) this.instance).getAnimationDurationMs();
        }

        @Override // com.waze.jni.protos.map.AnimationParamsOrBuilder
        public long getAnimationStartTimeMs() {
            return ((AnimationParams) this.instance).getAnimationStartTimeMs();
        }

        @Override // com.waze.jni.protos.map.AnimationParamsOrBuilder
        public CurveType getCurveType() {
            return ((AnimationParams) this.instance).getCurveType();
        }

        @Override // com.waze.jni.protos.map.AnimationParamsOrBuilder
        public int getCurveTypeValue() {
            return ((AnimationParams) this.instance).getCurveTypeValue();
        }

        public Builder setAnimationDurationMs(long j2) {
            copyOnWrite();
            ((AnimationParams) this.instance).setAnimationDurationMs(j2);
            return this;
        }

        public Builder setAnimationStartTimeMs(long j2) {
            copyOnWrite();
            ((AnimationParams) this.instance).setAnimationStartTimeMs(j2);
            return this;
        }

        public Builder setCurveType(CurveType curveType) {
            copyOnWrite();
            ((AnimationParams) this.instance).setCurveType(curveType);
            return this;
        }

        public Builder setCurveTypeValue(int i2) {
            copyOnWrite();
            ((AnimationParams) this.instance).setCurveTypeValue(i2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum CurveType implements eg {
        LINEAR(0),
        STRONG_EASE_IN(1),
        STRONG_EASE_OUT(2),
        SMOOTH_EASE_OUT(3),
        SMOOTH_EASE_IN(4),
        EASE_IN_EASE_OUT(5),
        KINETIC_EASE_OUT(6),
        UNRECOGNIZED(-1);

        public static final int EASE_IN_EASE_OUT_VALUE = 5;
        public static final int KINETIC_EASE_OUT_VALUE = 6;
        public static final int LINEAR_VALUE = 0;
        public static final int SMOOTH_EASE_IN_VALUE = 4;
        public static final int SMOOTH_EASE_OUT_VALUE = 3;
        public static final int STRONG_EASE_IN_VALUE = 1;
        public static final int STRONG_EASE_OUT_VALUE = 2;
        private static final eh<CurveType> internalValueMap = new eh<CurveType>() { // from class: com.waze.jni.protos.map.AnimationParams.CurveType.1
            @Override // com.google.v.eh
            public CurveType findValueByNumber(int i2) {
                return CurveType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class CurveTypeVerifier implements ei {
            static final ei INSTANCE = new CurveTypeVerifier();

            private CurveTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return CurveType.forNumber(i2) != null;
            }
        }

        CurveType(int i2) {
            this.value = i2;
        }

        public static CurveType forNumber(int i2) {
            switch (i2) {
                case 0:
                    return LINEAR;
                case 1:
                    return STRONG_EASE_IN;
                case 2:
                    return STRONG_EASE_OUT;
                case 3:
                    return SMOOTH_EASE_OUT;
                case 4:
                    return SMOOTH_EASE_IN;
                case 5:
                    return EASE_IN_EASE_OUT;
                case 6:
                    return KINETIC_EASE_OUT;
                default:
                    return null;
            }
        }

        public static eh<CurveType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return CurveTypeVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this == UNRECOGNIZED ? ep.b() : this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    static {
        AnimationParams animationParams = new AnimationParams();
        DEFAULT_INSTANCE = animationParams;
        du.registerDefaultInstance(AnimationParams.class, animationParams);
    }

    private AnimationParams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnimationDurationMs() {
        this.animationDurationMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnimationStartTimeMs() {
        this.animationStartTimeMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurveType() {
        this.curveType_ = 0;
    }

    public static AnimationParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AnimationParams parseDelimitedFrom(InputStream inputStream) {
        return (AnimationParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AnimationParams parseFrom(v vVar) {
        return (AnimationParams) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<AnimationParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationDurationMs(long j2) {
        this.animationDurationMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationStartTimeMs(long j2) {
        this.animationStartTimeMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurveType(CurveType curveType) {
        this.curveType_ = curveType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurveTypeValue(int i2) {
        this.curveType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\f", new Object[]{"animationStartTimeMs_", "animationDurationMs_", "curveType_"});
        }
        if (iOrdinal == 3) {
            return new AnimationParams();
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
        fo<AnimationParams> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (AnimationParams.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.AnimationParamsOrBuilder
    public long getAnimationDurationMs() {
        return this.animationDurationMs_;
    }

    @Override // com.waze.jni.protos.map.AnimationParamsOrBuilder
    public long getAnimationStartTimeMs() {
        return this.animationStartTimeMs_;
    }

    @Override // com.waze.jni.protos.map.AnimationParamsOrBuilder
    public CurveType getCurveType() {
        CurveType curveTypeForNumber = CurveType.forNumber(this.curveType_);
        return curveTypeForNumber == null ? CurveType.UNRECOGNIZED : curveTypeForNumber;
    }

    @Override // com.waze.jni.protos.map.AnimationParamsOrBuilder
    public int getCurveTypeValue() {
        return this.curveType_;
    }

    public static Builder newBuilder(AnimationParams animationParams) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(animationParams);
    }

    public static AnimationParams parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (AnimationParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AnimationParams parseFrom(v vVar, de deVar) {
        return (AnimationParams) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static AnimationParams parseFrom(z zVar) {
        return (AnimationParams) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static AnimationParams parseFrom(z zVar, de deVar) {
        return (AnimationParams) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static AnimationParams parseFrom(InputStream inputStream) {
        return (AnimationParams) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AnimationParams parseFrom(InputStream inputStream, de deVar) {
        return (AnimationParams) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AnimationParams parseFrom(ByteBuffer byteBuffer) {
        return (AnimationParams) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AnimationParams parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (AnimationParams) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static AnimationParams parseFrom(byte[] bArr) {
        return (AnimationParams) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AnimationParams parseFrom(byte[] bArr, de deVar) {
        return (AnimationParams) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
