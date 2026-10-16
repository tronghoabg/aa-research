package com.waze.jni.protos.asks;

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
public final class FeedbackAnswer extends du<FeedbackAnswer, Builder> implements FeedbackAnswerOrBuilder {
    private static final FeedbackAnswer DEFAULT_INSTANCE;
    private static volatile fo<FeedbackAnswer> PARSER = null;
    public static final int POINTS_AWARD_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int pointsAward_;
    private int type_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.asks.FeedbackAnswer$1, reason: invalid class name */
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
    public final class Builder extends dm<FeedbackAnswer, Builder> implements FeedbackAnswerOrBuilder {
        private Builder() {
            super(FeedbackAnswer.DEFAULT_INSTANCE);
        }

        public Builder clearPointsAward() {
            copyOnWrite();
            ((FeedbackAnswer) this.instance).clearPointsAward();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((FeedbackAnswer) this.instance).clearType();
            return this;
        }

        @Override // com.waze.jni.protos.asks.FeedbackAnswerOrBuilder
        public int getPointsAward() {
            return ((FeedbackAnswer) this.instance).getPointsAward();
        }

        @Override // com.waze.jni.protos.asks.FeedbackAnswerOrBuilder
        public FeedbackAnswerType getType() {
            return ((FeedbackAnswer) this.instance).getType();
        }

        @Override // com.waze.jni.protos.asks.FeedbackAnswerOrBuilder
        public int getTypeValue() {
            return ((FeedbackAnswer) this.instance).getTypeValue();
        }

        public Builder setPointsAward(int i2) {
            copyOnWrite();
            ((FeedbackAnswer) this.instance).setPointsAward(i2);
            return this;
        }

        public Builder setType(FeedbackAnswerType feedbackAnswerType) {
            copyOnWrite();
            ((FeedbackAnswer) this.instance).setType(feedbackAnswerType);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((FeedbackAnswer) this.instance).setTypeValue(i2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum FeedbackAnswerType implements eg {
        NOT_HELPFUL(0),
        HELPFUL(1),
        UNRECOGNIZED(-1);

        public static final int HELPFUL_VALUE = 1;
        public static final int NOT_HELPFUL_VALUE = 0;
        private static final eh<FeedbackAnswerType> internalValueMap = new eh<FeedbackAnswerType>() { // from class: com.waze.jni.protos.asks.FeedbackAnswer.FeedbackAnswerType.1
            @Override // com.google.v.eh
            public FeedbackAnswerType findValueByNumber(int i2) {
                return FeedbackAnswerType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class FeedbackAnswerTypeVerifier implements ei {
            static final ei INSTANCE = new FeedbackAnswerTypeVerifier();

            private FeedbackAnswerTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return FeedbackAnswerType.forNumber(i2) != null;
            }
        }

        FeedbackAnswerType(int i2) {
            this.value = i2;
        }

        public static FeedbackAnswerType forNumber(int i2) {
            if (i2 == 0) {
                return NOT_HELPFUL;
            }
            if (i2 != 1) {
                return null;
            }
            return HELPFUL;
        }

        public static eh<FeedbackAnswerType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return FeedbackAnswerTypeVerifier.INSTANCE;
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
        FeedbackAnswer feedbackAnswer = new FeedbackAnswer();
        DEFAULT_INSTANCE = feedbackAnswer;
        du.registerDefaultInstance(FeedbackAnswer.class, feedbackAnswer);
    }

    private FeedbackAnswer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPointsAward() {
        this.pointsAward_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static FeedbackAnswer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FeedbackAnswer parseDelimitedFrom(InputStream inputStream) {
        return (FeedbackAnswer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FeedbackAnswer parseFrom(v vVar) {
        return (FeedbackAnswer) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<FeedbackAnswer> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointsAward(int i2) {
        this.pointsAward_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(FeedbackAnswerType feedbackAnswerType) {
        this.type_ = feedbackAnswerType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"type_", "pointsAward_"});
        }
        if (iOrdinal == 3) {
            return new FeedbackAnswer();
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
        fo<FeedbackAnswer> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (FeedbackAnswer.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.asks.FeedbackAnswerOrBuilder
    public int getPointsAward() {
        return this.pointsAward_;
    }

    @Override // com.waze.jni.protos.asks.FeedbackAnswerOrBuilder
    public FeedbackAnswerType getType() {
        FeedbackAnswerType feedbackAnswerTypeForNumber = FeedbackAnswerType.forNumber(this.type_);
        return feedbackAnswerTypeForNumber == null ? FeedbackAnswerType.UNRECOGNIZED : feedbackAnswerTypeForNumber;
    }

    @Override // com.waze.jni.protos.asks.FeedbackAnswerOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    public static Builder newBuilder(FeedbackAnswer feedbackAnswer) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(feedbackAnswer);
    }

    public static FeedbackAnswer parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (FeedbackAnswer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static FeedbackAnswer parseFrom(v vVar, de deVar) {
        return (FeedbackAnswer) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static FeedbackAnswer parseFrom(z zVar) {
        return (FeedbackAnswer) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static FeedbackAnswer parseFrom(z zVar, de deVar) {
        return (FeedbackAnswer) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static FeedbackAnswer parseFrom(InputStream inputStream) {
        return (FeedbackAnswer) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FeedbackAnswer parseFrom(InputStream inputStream, de deVar) {
        return (FeedbackAnswer) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static FeedbackAnswer parseFrom(ByteBuffer byteBuffer) {
        return (FeedbackAnswer) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FeedbackAnswer parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (FeedbackAnswer) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static FeedbackAnswer parseFrom(byte[] bArr) {
        return (FeedbackAnswer) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FeedbackAnswer parseFrom(byte[] bArr, de deVar) {
        return (FeedbackAnswer) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
