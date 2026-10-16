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
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.alerters.AlerterSubType;
import com.waze.jni.protos.alerters.AlerterType;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EnrichAlertQuestion extends du<EnrichAlertQuestion, Builder> implements EnrichAlertQuestionOrBuilder {
    public static final int ANSWERS_FIELD_NUMBER = 2;
    private static final EnrichAlertQuestion DEFAULT_INSTANCE;
    private static volatile fo<EnrichAlertQuestion> PARSER = null;
    public static final int STATS_ALERTER_TYPE_FIELD_NUMBER = 4;
    public static final int STATS_ALERT_ID_FIELD_NUMBER = 3;
    public static final int TITLE_TYPE_FIELD_NUMBER = 1;
    private eo<Answer> answers_ = emptyProtobufList();
    private int statsAlertId_;
    private int statsAlerterType_;
    private int titleType_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.asks.EnrichAlertQuestion$1, reason: invalid class name */
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
    public interface AnswerOrBuilder extends fj {
        String getAnswerKey();

        v getAnswerKeyBytes();

        Answer.BlockedLaneVariant getBlockedLane();

        Answer.HazardVariant getHazard();

        int getPointsAward();

        Answer.NotThereVariant getValidation();

        Answer.VariantCase getVariantCase();

        boolean hasBlockedLane();

        boolean hasHazard();

        boolean hasValidation();
    }

    /* compiled from: WazeSource */
    public enum QuestionTitleType implements eg {
        WHAT_DO_YOU_SEE(0),
        ARE_LANES_BLOCKED(1),
        UNRECOGNIZED(-1);

        public static final int ARE_LANES_BLOCKED_VALUE = 1;
        public static final int WHAT_DO_YOU_SEE_VALUE = 0;
        private static final eh<QuestionTitleType> internalValueMap = new eh<QuestionTitleType>() { // from class: com.waze.jni.protos.asks.EnrichAlertQuestion.QuestionTitleType.1
            @Override // com.google.v.eh
            public QuestionTitleType findValueByNumber(int i2) {
                return QuestionTitleType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class QuestionTitleTypeVerifier implements ei {
            static final ei INSTANCE = new QuestionTitleTypeVerifier();

            private QuestionTitleTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return QuestionTitleType.forNumber(i2) != null;
            }
        }

        QuestionTitleType(int i2) {
            this.value = i2;
        }

        public static QuestionTitleType forNumber(int i2) {
            if (i2 == 0) {
                return WHAT_DO_YOU_SEE;
            }
            if (i2 != 1) {
                return null;
            }
            return ARE_LANES_BLOCKED;
        }

        public static eh<QuestionTitleType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return QuestionTitleTypeVerifier.INSTANCE;
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
        EnrichAlertQuestion enrichAlertQuestion = new EnrichAlertQuestion();
        DEFAULT_INSTANCE = enrichAlertQuestion;
        du.registerDefaultInstance(EnrichAlertQuestion.class, enrichAlertQuestion);
    }

    private EnrichAlertQuestion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAnswers(Iterable<? extends Answer> iterable) {
        ensureAnswersIsMutable();
        c.addAll(iterable, this.answers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnswers(int i2, Answer answer) {
        Objects.requireNonNull(answer);
        ensureAnswersIsMutable();
        this.answers_.add(i2, answer);
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
    public void clearStatsAlerterType() {
        this.statsAlerterType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitleType() {
        this.titleType_ = 0;
    }

    private void ensureAnswersIsMutable() {
        eo<Answer> eoVar = this.answers_;
        if (eoVar.c()) {
            return;
        }
        this.answers_ = du.mutableCopy(eoVar);
    }

    public static EnrichAlertQuestion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EnrichAlertQuestion parseDelimitedFrom(InputStream inputStream) {
        return (EnrichAlertQuestion) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnrichAlertQuestion parseFrom(v vVar) {
        return (EnrichAlertQuestion) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<EnrichAlertQuestion> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAnswers(int i2) {
        ensureAnswersIsMutable();
        this.answers_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswers(int i2, Answer answer) {
        Objects.requireNonNull(answer);
        ensureAnswersIsMutable();
        this.answers_.set(i2, answer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatsAlertId(int i2) {
        this.statsAlertId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatsAlerterType(AlerterType alerterType) {
        this.statsAlerterType_ = alerterType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatsAlerterTypeValue(int i2) {
        this.statsAlerterType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleType(QuestionTitleType questionTitleType) {
        this.titleType_ = questionTitleType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleTypeValue(int i2) {
        this.titleType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003\u0004\u0004\f", new Object[]{"titleType_", "answers_", Answer.class, "statsAlertId_", "statsAlerterType_"});
        }
        if (iOrdinal == 3) {
            return new EnrichAlertQuestion();
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
        fo<EnrichAlertQuestion> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (EnrichAlertQuestion.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.asks.EnrichAlertQuestionOrBuilder
    public Answer getAnswers(int i2) {
        return this.answers_.get(i2);
    }

    @Override // com.waze.jni.protos.asks.EnrichAlertQuestionOrBuilder
    public int getAnswersCount() {
        return this.answers_.size();
    }

    @Override // com.waze.jni.protos.asks.EnrichAlertQuestionOrBuilder
    public List<Answer> getAnswersList() {
        return this.answers_;
    }

    public AnswerOrBuilder getAnswersOrBuilder(int i2) {
        return this.answers_.get(i2);
    }

    public List<? extends AnswerOrBuilder> getAnswersOrBuilderList() {
        return this.answers_;
    }

    @Override // com.waze.jni.protos.asks.EnrichAlertQuestionOrBuilder
    public int getStatsAlertId() {
        return this.statsAlertId_;
    }

    @Override // com.waze.jni.protos.asks.EnrichAlertQuestionOrBuilder
    public AlerterType getStatsAlerterType() {
        AlerterType alerterTypeForNumber = AlerterType.forNumber(this.statsAlerterType_);
        return alerterTypeForNumber == null ? AlerterType.UNRECOGNIZED : alerterTypeForNumber;
    }

    @Override // com.waze.jni.protos.asks.EnrichAlertQuestionOrBuilder
    public int getStatsAlerterTypeValue() {
        return this.statsAlerterType_;
    }

    @Override // com.waze.jni.protos.asks.EnrichAlertQuestionOrBuilder
    public QuestionTitleType getTitleType() {
        QuestionTitleType questionTitleTypeForNumber = QuestionTitleType.forNumber(this.titleType_);
        return questionTitleTypeForNumber == null ? QuestionTitleType.UNRECOGNIZED : questionTitleTypeForNumber;
    }

    @Override // com.waze.jni.protos.asks.EnrichAlertQuestionOrBuilder
    public int getTitleTypeValue() {
        return this.titleType_;
    }

    /* compiled from: WazeSource */
    public final class Answer extends du<Answer, Builder> implements AnswerOrBuilder {
        public static final int ANSWER_KEY_FIELD_NUMBER = 1;
        public static final int BLOCKED_LANE_FIELD_NUMBER = 4;
        private static final Answer DEFAULT_INSTANCE;
        public static final int HAZARD_FIELD_NUMBER = 2;
        private static volatile fo<Answer> PARSER = null;
        public static final int POINTS_AWARD_FIELD_NUMBER = 5;
        public static final int VALIDATION_FIELD_NUMBER = 3;
        private int pointsAward_;
        private Object variant_;
        private int variantCase_ = 0;
        private String answerKey_ = "";

        /* compiled from: WazeSource */
        public interface BlockedLaneVariantOrBuilder extends fj {
            AlerterSubType.BlockedLaneSubType getSubType();

            int getSubTypeValue();
        }

        /* compiled from: WazeSource */
        public interface HazardVariantOrBuilder extends fj {
            AlerterSubType.HazardSubType getSubType();

            int getSubTypeValue();
        }

        /* compiled from: WazeSource */
        public interface NotThereVariantOrBuilder extends fj {
        }

        /* compiled from: WazeSource */
        public enum VariantCase {
            HAZARD(2),
            VALIDATION(3),
            BLOCKED_LANE(4),
            VARIANT_NOT_SET(0);

            private final int value;

            VariantCase(int i2) {
                this.value = i2;
            }

            public static VariantCase forNumber(int i2) {
                if (i2 == 0) {
                    return VARIANT_NOT_SET;
                }
                if (i2 == 2) {
                    return HAZARD;
                }
                if (i2 == 3) {
                    return VALIDATION;
                }
                if (i2 != 4) {
                    return null;
                }
                return BLOCKED_LANE;
            }

            public int getNumber() {
                return this.value;
            }
        }

        static {
            Answer answer = new Answer();
            DEFAULT_INSTANCE = answer;
            du.registerDefaultInstance(Answer.class, answer);
        }

        private Answer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnswerKey() {
            this.answerKey_ = getDefaultInstance().getAnswerKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBlockedLane() {
            if (this.variantCase_ == 4) {
                this.variantCase_ = 0;
                this.variant_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHazard() {
            if (this.variantCase_ == 2) {
                this.variantCase_ = 0;
                this.variant_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPointsAward() {
            this.pointsAward_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValidation() {
            if (this.variantCase_ == 3) {
                this.variantCase_ = 0;
                this.variant_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVariant() {
            this.variantCase_ = 0;
            this.variant_ = null;
        }

        public static Answer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBlockedLane(BlockedLaneVariant blockedLaneVariant) {
            Objects.requireNonNull(blockedLaneVariant);
            if (this.variantCase_ == 4 && this.variant_ != BlockedLaneVariant.getDefaultInstance()) {
                BlockedLaneVariant.Builder builderNewBuilder = BlockedLaneVariant.newBuilder((BlockedLaneVariant) this.variant_);
                builderNewBuilder.mergeFrom((BlockedLaneVariant.Builder) blockedLaneVariant);
                blockedLaneVariant = builderNewBuilder.buildPartial();
            }
            this.variant_ = blockedLaneVariant;
            this.variantCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHazard(HazardVariant hazardVariant) {
            Objects.requireNonNull(hazardVariant);
            if (this.variantCase_ == 2 && this.variant_ != HazardVariant.getDefaultInstance()) {
                HazardVariant.Builder builderNewBuilder = HazardVariant.newBuilder((HazardVariant) this.variant_);
                builderNewBuilder.mergeFrom((HazardVariant.Builder) hazardVariant);
                hazardVariant = builderNewBuilder.buildPartial();
            }
            this.variant_ = hazardVariant;
            this.variantCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeValidation(NotThereVariant notThereVariant) {
            Objects.requireNonNull(notThereVariant);
            if (this.variantCase_ == 3 && this.variant_ != NotThereVariant.getDefaultInstance()) {
                NotThereVariant.Builder builderNewBuilder = NotThereVariant.newBuilder((NotThereVariant) this.variant_);
                builderNewBuilder.mergeFrom((NotThereVariant.Builder) notThereVariant);
                notThereVariant = builderNewBuilder.buildPartial();
            }
            this.variant_ = notThereVariant;
            this.variantCase_ = 3;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Answer parseDelimitedFrom(InputStream inputStream) {
            return (Answer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Answer parseFrom(v vVar) {
            return (Answer) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Answer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnswerKey(String str) {
            Objects.requireNonNull(str);
            this.answerKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnswerKeyBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.answerKey_ = vVar.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlockedLane(BlockedLaneVariant blockedLaneVariant) {
            Objects.requireNonNull(blockedLaneVariant);
            this.variant_ = blockedLaneVariant;
            this.variantCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHazard(HazardVariant hazardVariant) {
            Objects.requireNonNull(hazardVariant);
            this.variant_ = hazardVariant;
            this.variantCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPointsAward(int i2) {
            this.pointsAward_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValidation(NotThereVariant notThereVariant) {
            Objects.requireNonNull(notThereVariant);
            this.variant_ = notThereVariant;
            this.variantCase_ = 3;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005\u0004", new Object[]{"variant_", "variantCase_", "answerKey_", HazardVariant.class, NotThereVariant.class, BlockedLaneVariant.class, "pointsAward_"});
            }
            if (iOrdinal == 3) {
                return new Answer();
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
            fo<Answer> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Answer.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
        public String getAnswerKey() {
            return this.answerKey_;
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
        public v getAnswerKeyBytes() {
            return v.s(this.answerKey_);
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
        public BlockedLaneVariant getBlockedLane() {
            return this.variantCase_ == 4 ? (BlockedLaneVariant) this.variant_ : BlockedLaneVariant.getDefaultInstance();
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
        public HazardVariant getHazard() {
            return this.variantCase_ == 2 ? (HazardVariant) this.variant_ : HazardVariant.getDefaultInstance();
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
        public int getPointsAward() {
            return this.pointsAward_;
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
        public NotThereVariant getValidation() {
            return this.variantCase_ == 3 ? (NotThereVariant) this.variant_ : NotThereVariant.getDefaultInstance();
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
        public VariantCase getVariantCase() {
            return VariantCase.forNumber(this.variantCase_);
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
        public boolean hasBlockedLane() {
            return this.variantCase_ == 4;
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
        public boolean hasHazard() {
            return this.variantCase_ == 2;
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
        public boolean hasValidation() {
            return this.variantCase_ == 3;
        }

        /* compiled from: WazeSource */
        public final class BlockedLaneVariant extends du<BlockedLaneVariant, Builder> implements BlockedLaneVariantOrBuilder {
            private static final BlockedLaneVariant DEFAULT_INSTANCE;
            private static volatile fo<BlockedLaneVariant> PARSER = null;
            public static final int SUB_TYPE_FIELD_NUMBER = 1;
            private int subType_;

            /* compiled from: WazeSource */
            public final class Builder extends dm<BlockedLaneVariant, Builder> implements BlockedLaneVariantOrBuilder {
                private Builder() {
                    super(BlockedLaneVariant.DEFAULT_INSTANCE);
                }

                public Builder clearSubType() {
                    copyOnWrite();
                    ((BlockedLaneVariant) this.instance).clearSubType();
                    return this;
                }

                @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.Answer.BlockedLaneVariantOrBuilder
                public AlerterSubType.BlockedLaneSubType getSubType() {
                    return ((BlockedLaneVariant) this.instance).getSubType();
                }

                @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.Answer.BlockedLaneVariantOrBuilder
                public int getSubTypeValue() {
                    return ((BlockedLaneVariant) this.instance).getSubTypeValue();
                }

                public Builder setSubType(AlerterSubType.BlockedLaneSubType blockedLaneSubType) {
                    copyOnWrite();
                    ((BlockedLaneVariant) this.instance).setSubType(blockedLaneSubType);
                    return this;
                }

                public Builder setSubTypeValue(int i2) {
                    copyOnWrite();
                    ((BlockedLaneVariant) this.instance).setSubTypeValue(i2);
                    return this;
                }
            }

            static {
                BlockedLaneVariant blockedLaneVariant = new BlockedLaneVariant();
                DEFAULT_INSTANCE = blockedLaneVariant;
                du.registerDefaultInstance(BlockedLaneVariant.class, blockedLaneVariant);
            }

            private BlockedLaneVariant() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSubType() {
                this.subType_ = 0;
            }

            public static BlockedLaneVariant getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static BlockedLaneVariant parseDelimitedFrom(InputStream inputStream) {
                return (BlockedLaneVariant) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BlockedLaneVariant parseFrom(v vVar) {
                return (BlockedLaneVariant) du.parseFrom(DEFAULT_INSTANCE, vVar);
            }

            public static fo<BlockedLaneVariant> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSubType(AlerterSubType.BlockedLaneSubType blockedLaneSubType) {
                this.subType_ = blockedLaneSubType.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSubTypeValue(int i2) {
                this.subType_ = i2;
            }

            @Override // com.google.v.du
            protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
                fo dnVar;
                int iOrdinal = dtVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"subType_"});
                }
                if (iOrdinal == 3) {
                    return new BlockedLaneVariant();
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
                fo<BlockedLaneVariant> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (BlockedLaneVariant.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            }

            @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.Answer.BlockedLaneVariantOrBuilder
            public AlerterSubType.BlockedLaneSubType getSubType() {
                AlerterSubType.BlockedLaneSubType blockedLaneSubTypeForNumber = AlerterSubType.BlockedLaneSubType.forNumber(this.subType_);
                return blockedLaneSubTypeForNumber == null ? AlerterSubType.BlockedLaneSubType.UNRECOGNIZED : blockedLaneSubTypeForNumber;
            }

            @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.Answer.BlockedLaneVariantOrBuilder
            public int getSubTypeValue() {
                return this.subType_;
            }

            public static Builder newBuilder(BlockedLaneVariant blockedLaneVariant) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(blockedLaneVariant);
            }

            public static BlockedLaneVariant parseDelimitedFrom(InputStream inputStream, de deVar) {
                return (BlockedLaneVariant) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
            }

            public static BlockedLaneVariant parseFrom(v vVar, de deVar) {
                return (BlockedLaneVariant) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
            }

            public static BlockedLaneVariant parseFrom(z zVar) {
                return (BlockedLaneVariant) du.parseFrom(DEFAULT_INSTANCE, zVar);
            }

            public static BlockedLaneVariant parseFrom(z zVar, de deVar) {
                return (BlockedLaneVariant) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
            }

            public static BlockedLaneVariant parseFrom(InputStream inputStream) {
                return (BlockedLaneVariant) du.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BlockedLaneVariant parseFrom(InputStream inputStream, de deVar) {
                return (BlockedLaneVariant) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
            }

            public static BlockedLaneVariant parseFrom(ByteBuffer byteBuffer) {
                return (BlockedLaneVariant) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static BlockedLaneVariant parseFrom(ByteBuffer byteBuffer, de deVar) {
                return (BlockedLaneVariant) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
            }

            public static BlockedLaneVariant parseFrom(byte[] bArr) {
                return (BlockedLaneVariant) du.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static BlockedLaneVariant parseFrom(byte[] bArr, de deVar) {
                return (BlockedLaneVariant) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
            }
        }

        /* compiled from: WazeSource */
        public final class HazardVariant extends du<HazardVariant, Builder> implements HazardVariantOrBuilder {
            private static final HazardVariant DEFAULT_INSTANCE;
            private static volatile fo<HazardVariant> PARSER = null;
            public static final int SUB_TYPE_FIELD_NUMBER = 1;
            private int subType_;

            /* compiled from: WazeSource */
            public final class Builder extends dm<HazardVariant, Builder> implements HazardVariantOrBuilder {
                private Builder() {
                    super(HazardVariant.DEFAULT_INSTANCE);
                }

                public Builder clearSubType() {
                    copyOnWrite();
                    ((HazardVariant) this.instance).clearSubType();
                    return this;
                }

                @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.Answer.HazardVariantOrBuilder
                public AlerterSubType.HazardSubType getSubType() {
                    return ((HazardVariant) this.instance).getSubType();
                }

                @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.Answer.HazardVariantOrBuilder
                public int getSubTypeValue() {
                    return ((HazardVariant) this.instance).getSubTypeValue();
                }

                public Builder setSubType(AlerterSubType.HazardSubType hazardSubType) {
                    copyOnWrite();
                    ((HazardVariant) this.instance).setSubType(hazardSubType);
                    return this;
                }

                public Builder setSubTypeValue(int i2) {
                    copyOnWrite();
                    ((HazardVariant) this.instance).setSubTypeValue(i2);
                    return this;
                }
            }

            static {
                HazardVariant hazardVariant = new HazardVariant();
                DEFAULT_INSTANCE = hazardVariant;
                du.registerDefaultInstance(HazardVariant.class, hazardVariant);
            }

            private HazardVariant() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSubType() {
                this.subType_ = 0;
            }

            public static HazardVariant getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static HazardVariant parseDelimitedFrom(InputStream inputStream) {
                return (HazardVariant) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static HazardVariant parseFrom(v vVar) {
                return (HazardVariant) du.parseFrom(DEFAULT_INSTANCE, vVar);
            }

            public static fo<HazardVariant> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSubType(AlerterSubType.HazardSubType hazardSubType) {
                this.subType_ = hazardSubType.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSubTypeValue(int i2) {
                this.subType_ = i2;
            }

            @Override // com.google.v.du
            protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
                fo dnVar;
                int iOrdinal = dtVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"subType_"});
                }
                if (iOrdinal == 3) {
                    return new HazardVariant();
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
                fo<HazardVariant> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (HazardVariant.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            }

            @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.Answer.HazardVariantOrBuilder
            public AlerterSubType.HazardSubType getSubType() {
                AlerterSubType.HazardSubType hazardSubTypeForNumber = AlerterSubType.HazardSubType.forNumber(this.subType_);
                return hazardSubTypeForNumber == null ? AlerterSubType.HazardSubType.UNRECOGNIZED : hazardSubTypeForNumber;
            }

            @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.Answer.HazardVariantOrBuilder
            public int getSubTypeValue() {
                return this.subType_;
            }

            public static Builder newBuilder(HazardVariant hazardVariant) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(hazardVariant);
            }

            public static HazardVariant parseDelimitedFrom(InputStream inputStream, de deVar) {
                return (HazardVariant) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
            }

            public static HazardVariant parseFrom(v vVar, de deVar) {
                return (HazardVariant) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
            }

            public static HazardVariant parseFrom(z zVar) {
                return (HazardVariant) du.parseFrom(DEFAULT_INSTANCE, zVar);
            }

            public static HazardVariant parseFrom(z zVar, de deVar) {
                return (HazardVariant) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
            }

            public static HazardVariant parseFrom(InputStream inputStream) {
                return (HazardVariant) du.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static HazardVariant parseFrom(InputStream inputStream, de deVar) {
                return (HazardVariant) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
            }

            public static HazardVariant parseFrom(ByteBuffer byteBuffer) {
                return (HazardVariant) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static HazardVariant parseFrom(ByteBuffer byteBuffer, de deVar) {
                return (HazardVariant) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
            }

            public static HazardVariant parseFrom(byte[] bArr) {
                return (HazardVariant) du.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static HazardVariant parseFrom(byte[] bArr, de deVar) {
                return (HazardVariant) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
            }
        }

        /* compiled from: WazeSource */
        public final class NotThereVariant extends du<NotThereVariant, Builder> implements NotThereVariantOrBuilder {
            private static final NotThereVariant DEFAULT_INSTANCE;
            private static volatile fo<NotThereVariant> PARSER;

            /* compiled from: WazeSource */
            public final class Builder extends dm<NotThereVariant, Builder> implements NotThereVariantOrBuilder {
                private Builder() {
                    super(NotThereVariant.DEFAULT_INSTANCE);
                }
            }

            static {
                NotThereVariant notThereVariant = new NotThereVariant();
                DEFAULT_INSTANCE = notThereVariant;
                du.registerDefaultInstance(NotThereVariant.class, notThereVariant);
            }

            private NotThereVariant() {
            }

            public static NotThereVariant getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static NotThereVariant parseDelimitedFrom(InputStream inputStream) {
                return (NotThereVariant) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NotThereVariant parseFrom(v vVar) {
                return (NotThereVariant) du.parseFrom(DEFAULT_INSTANCE, vVar);
            }

            public static fo<NotThereVariant> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.v.du
            protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
                fo dnVar;
                int iOrdinal = dtVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                }
                if (iOrdinal == 3) {
                    return new NotThereVariant();
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
                fo<NotThereVariant> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (NotThereVariant.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            }

            public static Builder newBuilder(NotThereVariant notThereVariant) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(notThereVariant);
            }

            public static NotThereVariant parseDelimitedFrom(InputStream inputStream, de deVar) {
                return (NotThereVariant) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
            }

            public static NotThereVariant parseFrom(v vVar, de deVar) {
                return (NotThereVariant) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
            }

            public static NotThereVariant parseFrom(z zVar) {
                return (NotThereVariant) du.parseFrom(DEFAULT_INSTANCE, zVar);
            }

            public static NotThereVariant parseFrom(z zVar, de deVar) {
                return (NotThereVariant) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
            }

            public static NotThereVariant parseFrom(InputStream inputStream) {
                return (NotThereVariant) du.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NotThereVariant parseFrom(InputStream inputStream, de deVar) {
                return (NotThereVariant) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
            }

            public static NotThereVariant parseFrom(ByteBuffer byteBuffer) {
                return (NotThereVariant) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static NotThereVariant parseFrom(ByteBuffer byteBuffer, de deVar) {
                return (NotThereVariant) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
            }

            public static NotThereVariant parseFrom(byte[] bArr) {
                return (NotThereVariant) du.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static NotThereVariant parseFrom(byte[] bArr, de deVar) {
                return (NotThereVariant) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
            }
        }

        public static Builder newBuilder(Answer answer) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(answer);
        }

        public static Answer parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Answer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Answer parseFrom(v vVar, de deVar) {
            return (Answer) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Answer parseFrom(z zVar) {
            return (Answer) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Answer parseFrom(z zVar, de deVar) {
            return (Answer) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Answer parseFrom(InputStream inputStream) {
            return (Answer) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Answer parseFrom(InputStream inputStream, de deVar) {
            return (Answer) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Answer parseFrom(ByteBuffer byteBuffer) {
            return (Answer) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Answer parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Answer) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<Answer, Builder> implements AnswerOrBuilder {
            private Builder() {
                super(Answer.DEFAULT_INSTANCE);
            }

            public Builder clearAnswerKey() {
                copyOnWrite();
                ((Answer) this.instance).clearAnswerKey();
                return this;
            }

            public Builder clearBlockedLane() {
                copyOnWrite();
                ((Answer) this.instance).clearBlockedLane();
                return this;
            }

            public Builder clearHazard() {
                copyOnWrite();
                ((Answer) this.instance).clearHazard();
                return this;
            }

            public Builder clearPointsAward() {
                copyOnWrite();
                ((Answer) this.instance).clearPointsAward();
                return this;
            }

            public Builder clearValidation() {
                copyOnWrite();
                ((Answer) this.instance).clearValidation();
                return this;
            }

            public Builder clearVariant() {
                copyOnWrite();
                ((Answer) this.instance).clearVariant();
                return this;
            }

            @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
            public String getAnswerKey() {
                return ((Answer) this.instance).getAnswerKey();
            }

            @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
            public v getAnswerKeyBytes() {
                return ((Answer) this.instance).getAnswerKeyBytes();
            }

            @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
            public BlockedLaneVariant getBlockedLane() {
                return ((Answer) this.instance).getBlockedLane();
            }

            @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
            public HazardVariant getHazard() {
                return ((Answer) this.instance).getHazard();
            }

            @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
            public int getPointsAward() {
                return ((Answer) this.instance).getPointsAward();
            }

            @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
            public NotThereVariant getValidation() {
                return ((Answer) this.instance).getValidation();
            }

            @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
            public VariantCase getVariantCase() {
                return ((Answer) this.instance).getVariantCase();
            }

            @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
            public boolean hasBlockedLane() {
                return ((Answer) this.instance).hasBlockedLane();
            }

            @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
            public boolean hasHazard() {
                return ((Answer) this.instance).hasHazard();
            }

            @Override // com.waze.jni.protos.asks.EnrichAlertQuestion.AnswerOrBuilder
            public boolean hasValidation() {
                return ((Answer) this.instance).hasValidation();
            }

            public Builder mergeBlockedLane(BlockedLaneVariant blockedLaneVariant) {
                copyOnWrite();
                ((Answer) this.instance).mergeBlockedLane(blockedLaneVariant);
                return this;
            }

            public Builder mergeHazard(HazardVariant hazardVariant) {
                copyOnWrite();
                ((Answer) this.instance).mergeHazard(hazardVariant);
                return this;
            }

            public Builder mergeValidation(NotThereVariant notThereVariant) {
                copyOnWrite();
                ((Answer) this.instance).mergeValidation(notThereVariant);
                return this;
            }

            public Builder setAnswerKey(String str) {
                copyOnWrite();
                ((Answer) this.instance).setAnswerKey(str);
                return this;
            }

            public Builder setAnswerKeyBytes(v vVar) {
                copyOnWrite();
                ((Answer) this.instance).setAnswerKeyBytes(vVar);
                return this;
            }

            public Builder setBlockedLane(BlockedLaneVariant.Builder builder) {
                copyOnWrite();
                ((Answer) this.instance).setBlockedLane(builder.build());
                return this;
            }

            public Builder setHazard(HazardVariant.Builder builder) {
                copyOnWrite();
                ((Answer) this.instance).setHazard(builder.build());
                return this;
            }

            public Builder setPointsAward(int i2) {
                copyOnWrite();
                ((Answer) this.instance).setPointsAward(i2);
                return this;
            }

            public Builder setValidation(NotThereVariant.Builder builder) {
                copyOnWrite();
                ((Answer) this.instance).setValidation(builder.build());
                return this;
            }

            public Builder setBlockedLane(BlockedLaneVariant blockedLaneVariant) {
                copyOnWrite();
                ((Answer) this.instance).setBlockedLane(blockedLaneVariant);
                return this;
            }

            public Builder setHazard(HazardVariant hazardVariant) {
                copyOnWrite();
                ((Answer) this.instance).setHazard(hazardVariant);
                return this;
            }

            public Builder setValidation(NotThereVariant notThereVariant) {
                copyOnWrite();
                ((Answer) this.instance).setValidation(notThereVariant);
                return this;
            }
        }

        public static Answer parseFrom(byte[] bArr) {
            return (Answer) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Answer parseFrom(byte[] bArr, de deVar) {
            return (Answer) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(EnrichAlertQuestion enrichAlertQuestion) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(enrichAlertQuestion);
    }

    public static EnrichAlertQuestion parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (EnrichAlertQuestion) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EnrichAlertQuestion parseFrom(v vVar, de deVar) {
        return (EnrichAlertQuestion) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static EnrichAlertQuestion parseFrom(z zVar) {
        return (EnrichAlertQuestion) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static EnrichAlertQuestion parseFrom(z zVar, de deVar) {
        return (EnrichAlertQuestion) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnswers(Answer answer) {
        Objects.requireNonNull(answer);
        ensureAnswersIsMutable();
        this.answers_.add(answer);
    }

    public static EnrichAlertQuestion parseFrom(InputStream inputStream) {
        return (EnrichAlertQuestion) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnrichAlertQuestion parseFrom(InputStream inputStream, de deVar) {
        return (EnrichAlertQuestion) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EnrichAlertQuestion parseFrom(ByteBuffer byteBuffer) {
        return (EnrichAlertQuestion) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EnrichAlertQuestion parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (EnrichAlertQuestion) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<EnrichAlertQuestion, Builder> implements EnrichAlertQuestionOrBuilder {
        private Builder() {
            super(EnrichAlertQuestion.DEFAULT_INSTANCE);
        }

        public Builder addAllAnswers(Iterable<? extends Answer> iterable) {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).addAllAnswers(iterable);
            return this;
        }

        public Builder addAnswers(int i2, Answer.Builder builder) {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).addAnswers(i2, builder.build());
            return this;
        }

        public Builder clearAnswers() {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).clearAnswers();
            return this;
        }

        public Builder clearStatsAlertId() {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).clearStatsAlertId();
            return this;
        }

        public Builder clearStatsAlerterType() {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).clearStatsAlerterType();
            return this;
        }

        public Builder clearTitleType() {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).clearTitleType();
            return this;
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestionOrBuilder
        public Answer getAnswers(int i2) {
            return ((EnrichAlertQuestion) this.instance).getAnswers(i2);
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestionOrBuilder
        public int getAnswersCount() {
            return ((EnrichAlertQuestion) this.instance).getAnswersCount();
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestionOrBuilder
        public List<Answer> getAnswersList() {
            return DesugarCollections.unmodifiableList(((EnrichAlertQuestion) this.instance).getAnswersList());
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestionOrBuilder
        public int getStatsAlertId() {
            return ((EnrichAlertQuestion) this.instance).getStatsAlertId();
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestionOrBuilder
        public AlerterType getStatsAlerterType() {
            return ((EnrichAlertQuestion) this.instance).getStatsAlerterType();
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestionOrBuilder
        public int getStatsAlerterTypeValue() {
            return ((EnrichAlertQuestion) this.instance).getStatsAlerterTypeValue();
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestionOrBuilder
        public QuestionTitleType getTitleType() {
            return ((EnrichAlertQuestion) this.instance).getTitleType();
        }

        @Override // com.waze.jni.protos.asks.EnrichAlertQuestionOrBuilder
        public int getTitleTypeValue() {
            return ((EnrichAlertQuestion) this.instance).getTitleTypeValue();
        }

        public Builder removeAnswers(int i2) {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).removeAnswers(i2);
            return this;
        }

        public Builder setAnswers(int i2, Answer.Builder builder) {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).setAnswers(i2, builder.build());
            return this;
        }

        public Builder setStatsAlertId(int i2) {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).setStatsAlertId(i2);
            return this;
        }

        public Builder setStatsAlerterType(AlerterType alerterType) {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).setStatsAlerterType(alerterType);
            return this;
        }

        public Builder setStatsAlerterTypeValue(int i2) {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).setStatsAlerterTypeValue(i2);
            return this;
        }

        public Builder setTitleType(QuestionTitleType questionTitleType) {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).setTitleType(questionTitleType);
            return this;
        }

        public Builder setTitleTypeValue(int i2) {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).setTitleTypeValue(i2);
            return this;
        }

        public Builder addAnswers(int i2, Answer answer) {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).addAnswers(i2, answer);
            return this;
        }

        public Builder setAnswers(int i2, Answer answer) {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).setAnswers(i2, answer);
            return this;
        }

        public Builder addAnswers(Answer.Builder builder) {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).addAnswers(builder.build());
            return this;
        }

        public Builder addAnswers(Answer answer) {
            copyOnWrite();
            ((EnrichAlertQuestion) this.instance).addAnswers(answer);
            return this;
        }
    }

    public static EnrichAlertQuestion parseFrom(byte[] bArr) {
        return (EnrichAlertQuestion) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EnrichAlertQuestion parseFrom(byte[] bArr, de deVar) {
        return (EnrichAlertQuestion) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
