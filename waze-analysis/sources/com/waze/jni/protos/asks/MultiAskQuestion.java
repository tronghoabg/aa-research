package com.waze.jni.protos.asks;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.eo;
import com.google.v.ep;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.asks.MultiAskAnswer;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MultiAskQuestion extends du<MultiAskQuestion, Builder> implements MultiAskQuestionOrBuilder {
    public static final int ANSWERS_FIELD_NUMBER = 2;
    private static final MultiAskQuestion DEFAULT_INSTANCE;
    private static volatile fo<MultiAskQuestion> PARSER = null;
    public static final int STATS_ALERT_ID_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private eo<MultiAskAnswer> answers_ = emptyProtobufList();
    private int statsAlertId_;
    private int type_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.asks.MultiAskQuestion$1, reason: invalid class name */
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
    public enum QuestionType implements eg {
        QUESTION_TYPE_UNSPECIFIED(0),
        CAR_ON_SHOULDER_NEAR_LANE(1),
        CAR_ON_SHOULDER_CLEARLY_MARKED(2),
        CAR_ON_SHOULDER_PEOPLE_AROUND(3),
        UNRECOGNIZED(-1);

        public static final int CAR_ON_SHOULDER_CLEARLY_MARKED_VALUE = 2;
        public static final int CAR_ON_SHOULDER_NEAR_LANE_VALUE = 1;
        public static final int CAR_ON_SHOULDER_PEOPLE_AROUND_VALUE = 3;
        public static final int QUESTION_TYPE_UNSPECIFIED_VALUE = 0;
        private static final eh<QuestionType> internalValueMap = new eh<QuestionType>() { // from class: com.waze.jni.protos.asks.MultiAskQuestion.QuestionType.1
            @Override // com.google.v.eh
            public QuestionType findValueByNumber(int i2) {
                return QuestionType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class QuestionTypeVerifier implements ei {
            static final ei INSTANCE = new QuestionTypeVerifier();

            private QuestionTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return QuestionType.forNumber(i2) != null;
            }
        }

        QuestionType(int i2) {
            this.value = i2;
        }

        public static QuestionType forNumber(int i2) {
            if (i2 == 0) {
                return QUESTION_TYPE_UNSPECIFIED;
            }
            if (i2 == 1) {
                return CAR_ON_SHOULDER_NEAR_LANE;
            }
            if (i2 == 2) {
                return CAR_ON_SHOULDER_CLEARLY_MARKED;
            }
            if (i2 != 3) {
                return null;
            }
            return CAR_ON_SHOULDER_PEOPLE_AROUND;
        }

        public static eh<QuestionType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return QuestionTypeVerifier.INSTANCE;
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
        MultiAskQuestion multiAskQuestion = new MultiAskQuestion();
        DEFAULT_INSTANCE = multiAskQuestion;
        du.registerDefaultInstance(MultiAskQuestion.class, multiAskQuestion);
    }

    private MultiAskQuestion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAnswers(Iterable<? extends MultiAskAnswer> iterable) {
        ensureAnswersIsMutable();
        c.addAll(iterable, this.answers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnswers(int i2, MultiAskAnswer multiAskAnswer) {
        Objects.requireNonNull(multiAskAnswer);
        ensureAnswersIsMutable();
        this.answers_.add(i2, multiAskAnswer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswers() {
        this.answers_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatsAlertId() {
        this.statsAlertId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    private void ensureAnswersIsMutable() {
        eo<MultiAskAnswer> eoVar = this.answers_;
        if (eoVar.c()) {
            return;
        }
        this.answers_ = du.mutableCopy(eoVar);
    }

    public static MultiAskQuestion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MultiAskQuestion parseDelimitedFrom(InputStream inputStream) {
        return (MultiAskQuestion) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MultiAskQuestion parseFrom(v vVar) {
        return (MultiAskQuestion) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MultiAskQuestion> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAnswers(int i2) {
        ensureAnswersIsMutable();
        this.answers_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswers(int i2, MultiAskAnswer multiAskAnswer) {
        Objects.requireNonNull(multiAskAnswer);
        ensureAnswersIsMutable();
        this.answers_.set(i2, multiAskAnswer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatsAlertId(int i2) {
        this.statsAlertId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(QuestionType questionType) {
        this.type_ = questionType.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003\u0004", new Object[]{"type_", "answers_", MultiAskAnswer.class, "statsAlertId_"});
        }
        if (iOrdinal == 3) {
            return new MultiAskQuestion();
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
        fo<MultiAskQuestion> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MultiAskQuestion.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.asks.MultiAskQuestionOrBuilder
    public MultiAskAnswer getAnswers(int i2) {
        return this.answers_.get(i2);
    }

    @Override // com.waze.jni.protos.asks.MultiAskQuestionOrBuilder
    public int getAnswersCount() {
        return this.answers_.size();
    }

    @Override // com.waze.jni.protos.asks.MultiAskQuestionOrBuilder
    public List<MultiAskAnswer> getAnswersList() {
        return this.answers_;
    }

    public MultiAskAnswerOrBuilder getAnswersOrBuilder(int i2) {
        return this.answers_.get(i2);
    }

    public List<? extends MultiAskAnswerOrBuilder> getAnswersOrBuilderList() {
        return this.answers_;
    }

    @Override // com.waze.jni.protos.asks.MultiAskQuestionOrBuilder
    public int getStatsAlertId() {
        return this.statsAlertId_;
    }

    @Override // com.waze.jni.protos.asks.MultiAskQuestionOrBuilder
    public QuestionType getType() {
        QuestionType questionTypeForNumber = QuestionType.forNumber(this.type_);
        return questionTypeForNumber == null ? QuestionType.UNRECOGNIZED : questionTypeForNumber;
    }

    @Override // com.waze.jni.protos.asks.MultiAskQuestionOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    public static Builder newBuilder(MultiAskQuestion multiAskQuestion) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(multiAskQuestion);
    }

    public static MultiAskQuestion parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MultiAskQuestion) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MultiAskQuestion parseFrom(v vVar, de deVar) {
        return (MultiAskQuestion) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MultiAskQuestion parseFrom(z zVar) {
        return (MultiAskQuestion) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MultiAskQuestion parseFrom(z zVar, de deVar) {
        return (MultiAskQuestion) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnswers(MultiAskAnswer multiAskAnswer) {
        Objects.requireNonNull(multiAskAnswer);
        ensureAnswersIsMutable();
        this.answers_.add(multiAskAnswer);
    }

    public static MultiAskQuestion parseFrom(InputStream inputStream) {
        return (MultiAskQuestion) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MultiAskQuestion parseFrom(InputStream inputStream, de deVar) {
        return (MultiAskQuestion) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MultiAskQuestion parseFrom(ByteBuffer byteBuffer) {
        return (MultiAskQuestion) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MultiAskQuestion parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MultiAskQuestion) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<MultiAskQuestion, Builder> implements MultiAskQuestionOrBuilder {
        private Builder() {
            super(MultiAskQuestion.DEFAULT_INSTANCE);
        }

        public Builder addAllAnswers(Iterable<? extends MultiAskAnswer> iterable) {
            copyOnWrite();
            ((MultiAskQuestion) this.instance).addAllAnswers(iterable);
            return this;
        }

        public Builder addAnswers(int i2, MultiAskAnswer.Builder builder) {
            copyOnWrite();
            ((MultiAskQuestion) this.instance).addAnswers(i2, builder.build());
            return this;
        }

        public Builder clearAnswers() {
            copyOnWrite();
            ((MultiAskQuestion) this.instance).clearAnswers();
            return this;
        }

        public Builder clearStatsAlertId() {
            copyOnWrite();
            ((MultiAskQuestion) this.instance).clearStatsAlertId();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((MultiAskQuestion) this.instance).clearType();
            return this;
        }

        @Override // com.waze.jni.protos.asks.MultiAskQuestionOrBuilder
        public MultiAskAnswer getAnswers(int i2) {
            return ((MultiAskQuestion) this.instance).getAnswers(i2);
        }

        @Override // com.waze.jni.protos.asks.MultiAskQuestionOrBuilder
        public int getAnswersCount() {
            return ((MultiAskQuestion) this.instance).getAnswersCount();
        }

        @Override // com.waze.jni.protos.asks.MultiAskQuestionOrBuilder
        public List<MultiAskAnswer> getAnswersList() {
            return DesugarCollections.unmodifiableList(((MultiAskQuestion) this.instance).getAnswersList());
        }

        @Override // com.waze.jni.protos.asks.MultiAskQuestionOrBuilder
        public int getStatsAlertId() {
            return ((MultiAskQuestion) this.instance).getStatsAlertId();
        }

        @Override // com.waze.jni.protos.asks.MultiAskQuestionOrBuilder
        public QuestionType getType() {
            return ((MultiAskQuestion) this.instance).getType();
        }

        @Override // com.waze.jni.protos.asks.MultiAskQuestionOrBuilder
        public int getTypeValue() {
            return ((MultiAskQuestion) this.instance).getTypeValue();
        }

        public Builder removeAnswers(int i2) {
            copyOnWrite();
            ((MultiAskQuestion) this.instance).removeAnswers(i2);
            return this;
        }

        public Builder setAnswers(int i2, MultiAskAnswer.Builder builder) {
            copyOnWrite();
            ((MultiAskQuestion) this.instance).setAnswers(i2, builder.build());
            return this;
        }

        public Builder setStatsAlertId(int i2) {
            copyOnWrite();
            ((MultiAskQuestion) this.instance).setStatsAlertId(i2);
            return this;
        }

        public Builder setType(QuestionType questionType) {
            copyOnWrite();
            ((MultiAskQuestion) this.instance).setType(questionType);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((MultiAskQuestion) this.instance).setTypeValue(i2);
            return this;
        }

        public Builder addAnswers(int i2, MultiAskAnswer multiAskAnswer) {
            copyOnWrite();
            ((MultiAskQuestion) this.instance).addAnswers(i2, multiAskAnswer);
            return this;
        }

        public Builder setAnswers(int i2, MultiAskAnswer multiAskAnswer) {
            copyOnWrite();
            ((MultiAskQuestion) this.instance).setAnswers(i2, multiAskAnswer);
            return this;
        }

        public Builder addAnswers(MultiAskAnswer.Builder builder) {
            copyOnWrite();
            ((MultiAskQuestion) this.instance).addAnswers(builder.build());
            return this;
        }

        public Builder addAnswers(MultiAskAnswer multiAskAnswer) {
            copyOnWrite();
            ((MultiAskQuestion) this.instance).addAnswers(multiAskAnswer);
            return this;
        }
    }

    public static MultiAskQuestion parseFrom(byte[] bArr) {
        return (MultiAskQuestion) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MultiAskQuestion parseFrom(byte[] bArr, de deVar) {
        return (MultiAskQuestion) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
