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
public final class MultiAskAnswer extends du<MultiAskAnswer, Builder> implements MultiAskAnswerOrBuilder {
    private static final MultiAskAnswer DEFAULT_INSTANCE;
    private static volatile fo<MultiAskAnswer> PARSER = null;
    public static final int POINTS_AWARD_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int pointsAward_;
    private int type_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.asks.MultiAskAnswer$1, reason: invalid class name */
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
    public enum AnswerType implements eg {
        ANSWER_TYPE_UNSPECIFIED(0),
        YES(1),
        NO(2),
        UNRECOGNIZED(-1);

        public static final int ANSWER_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int NO_VALUE = 2;
        public static final int YES_VALUE = 1;
        private static final eh<AnswerType> internalValueMap = new eh<AnswerType>() { // from class: com.waze.jni.protos.asks.MultiAskAnswer.AnswerType.1
            @Override // com.google.v.eh
            public AnswerType findValueByNumber(int i2) {
                return AnswerType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class AnswerTypeVerifier implements ei {
            static final ei INSTANCE = new AnswerTypeVerifier();

            private AnswerTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return AnswerType.forNumber(i2) != null;
            }
        }

        AnswerType(int i2) {
            this.value = i2;
        }

        public static AnswerType forNumber(int i2) {
            if (i2 == 0) {
                return ANSWER_TYPE_UNSPECIFIED;
            }
            if (i2 == 1) {
                return YES;
            }
            if (i2 != 2) {
                return null;
            }
            return NO;
        }

        public static eh<AnswerType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return AnswerTypeVerifier.INSTANCE;
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

    /* compiled from: WazeSource */
    public final class Builder extends dm<MultiAskAnswer, Builder> implements MultiAskAnswerOrBuilder {
        private Builder() {
            super(MultiAskAnswer.DEFAULT_INSTANCE);
        }

        public Builder clearPointsAward() {
            copyOnWrite();
            ((MultiAskAnswer) this.instance).clearPointsAward();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((MultiAskAnswer) this.instance).clearType();
            return this;
        }

        @Override // com.waze.jni.protos.asks.MultiAskAnswerOrBuilder
        public int getPointsAward() {
            return ((MultiAskAnswer) this.instance).getPointsAward();
        }

        @Override // com.waze.jni.protos.asks.MultiAskAnswerOrBuilder
        public AnswerType getType() {
            return ((MultiAskAnswer) this.instance).getType();
        }

        @Override // com.waze.jni.protos.asks.MultiAskAnswerOrBuilder
        public int getTypeValue() {
            return ((MultiAskAnswer) this.instance).getTypeValue();
        }

        public Builder setPointsAward(int i2) {
            copyOnWrite();
            ((MultiAskAnswer) this.instance).setPointsAward(i2);
            return this;
        }

        public Builder setType(AnswerType answerType) {
            copyOnWrite();
            ((MultiAskAnswer) this.instance).setType(answerType);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((MultiAskAnswer) this.instance).setTypeValue(i2);
            return this;
        }
    }

    static {
        MultiAskAnswer multiAskAnswer = new MultiAskAnswer();
        DEFAULT_INSTANCE = multiAskAnswer;
        du.registerDefaultInstance(MultiAskAnswer.class, multiAskAnswer);
    }

    private MultiAskAnswer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPointsAward() {
        this.pointsAward_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static MultiAskAnswer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MultiAskAnswer parseDelimitedFrom(InputStream inputStream) {
        return (MultiAskAnswer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MultiAskAnswer parseFrom(v vVar) {
        return (MultiAskAnswer) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MultiAskAnswer> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointsAward(int i2) {
        this.pointsAward_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(AnswerType answerType) {
        this.type_ = answerType.getNumber();
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
            return new MultiAskAnswer();
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
        fo<MultiAskAnswer> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MultiAskAnswer.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.asks.MultiAskAnswerOrBuilder
    public int getPointsAward() {
        return this.pointsAward_;
    }

    @Override // com.waze.jni.protos.asks.MultiAskAnswerOrBuilder
    public AnswerType getType() {
        AnswerType answerTypeForNumber = AnswerType.forNumber(this.type_);
        return answerTypeForNumber == null ? AnswerType.UNRECOGNIZED : answerTypeForNumber;
    }

    @Override // com.waze.jni.protos.asks.MultiAskAnswerOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    public static Builder newBuilder(MultiAskAnswer multiAskAnswer) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(multiAskAnswer);
    }

    public static MultiAskAnswer parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MultiAskAnswer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MultiAskAnswer parseFrom(v vVar, de deVar) {
        return (MultiAskAnswer) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MultiAskAnswer parseFrom(z zVar) {
        return (MultiAskAnswer) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MultiAskAnswer parseFrom(z zVar, de deVar) {
        return (MultiAskAnswer) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static MultiAskAnswer parseFrom(InputStream inputStream) {
        return (MultiAskAnswer) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MultiAskAnswer parseFrom(InputStream inputStream, de deVar) {
        return (MultiAskAnswer) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MultiAskAnswer parseFrom(ByteBuffer byteBuffer) {
        return (MultiAskAnswer) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MultiAskAnswer parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MultiAskAnswer) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static MultiAskAnswer parseFrom(byte[] bArr) {
        return (MultiAskAnswer) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MultiAskAnswer parseFrom(byte[] bArr, de deVar) {
        return (MultiAskAnswer) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
