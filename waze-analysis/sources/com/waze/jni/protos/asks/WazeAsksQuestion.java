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
import com.waze.jni.protos.asks.EnrichAlertQuestion;
import com.waze.jni.protos.asks.FeedbackQuestion;
import com.waze.jni.protos.asks.MultiAskQuestion;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WazeAsksQuestion extends du<WazeAsksQuestion, Builder> implements WazeAsksQuestionOrBuilder {
    private static final WazeAsksQuestion DEFAULT_INSTANCE;
    public static final int ENRICH_ALERT_QUESTION_FIELD_NUMBER = 4;
    public static final int ENTITY_ID_FIELD_NUMBER = 2;
    public static final int FEEDBACK_QUESTION_FIELD_NUMBER = 6;
    public static final int IS_MOCK_FIELD_NUMBER = 3;
    public static final int MULTI_ASK_QUESTION_FIELD_NUMBER = 7;
    private static volatile fo<WazeAsksQuestion> PARSER = null;
    public static final int QUESTION_KEY_FIELD_NUMBER = 1;
    public static final int SOURCE_FIELD_NUMBER = 5;
    private boolean isMock_;
    private Object question_;
    private int source_;
    private int questionCase_ = 0;
    private String questionKey_ = "";
    private String entityId_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.asks.WazeAsksQuestion$1, reason: invalid class name */
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
    public enum QuestionCase {
        ENRICH_ALERT_QUESTION(4),
        FEEDBACK_QUESTION(6),
        MULTI_ASK_QUESTION(7),
        QUESTION_NOT_SET(0);

        private final int value;

        QuestionCase(int i2) {
            this.value = i2;
        }

        public static QuestionCase forNumber(int i2) {
            if (i2 == 0) {
                return QUESTION_NOT_SET;
            }
            if (i2 == 4) {
                return ENRICH_ALERT_QUESTION;
            }
            if (i2 == 6) {
                return FEEDBACK_QUESTION;
            }
            if (i2 != 7) {
                return null;
            }
            return MULTI_ASK_QUESTION;
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* compiled from: WazeSource */
    public enum WazeAsksQuestionSource implements eg {
        UNKNOWN(0),
        LEGACY_API(1),
        REFACTOR_API(2),
        UNRECOGNIZED(-1);

        public static final int LEGACY_API_VALUE = 1;
        public static final int REFACTOR_API_VALUE = 2;
        public static final int UNKNOWN_VALUE = 0;
        private static final eh<WazeAsksQuestionSource> internalValueMap = new eh<WazeAsksQuestionSource>() { // from class: com.waze.jni.protos.asks.WazeAsksQuestion.WazeAsksQuestionSource.1
            @Override // com.google.v.eh
            public WazeAsksQuestionSource findValueByNumber(int i2) {
                return WazeAsksQuestionSource.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class WazeAsksQuestionSourceVerifier implements ei {
            static final ei INSTANCE = new WazeAsksQuestionSourceVerifier();

            private WazeAsksQuestionSourceVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return WazeAsksQuestionSource.forNumber(i2) != null;
            }
        }

        WazeAsksQuestionSource(int i2) {
            this.value = i2;
        }

        public static WazeAsksQuestionSource forNumber(int i2) {
            if (i2 == 0) {
                return UNKNOWN;
            }
            if (i2 == 1) {
                return LEGACY_API;
            }
            if (i2 != 2) {
                return null;
            }
            return REFACTOR_API;
        }

        public static eh<WazeAsksQuestionSource> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return WazeAsksQuestionSourceVerifier.INSTANCE;
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
        WazeAsksQuestion wazeAsksQuestion = new WazeAsksQuestion();
        DEFAULT_INSTANCE = wazeAsksQuestion;
        du.registerDefaultInstance(WazeAsksQuestion.class, wazeAsksQuestion);
    }

    private WazeAsksQuestion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnrichAlertQuestion() {
        if (this.questionCase_ == 4) {
            this.questionCase_ = 0;
            this.question_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntityId() {
        this.entityId_ = getDefaultInstance().getEntityId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeedbackQuestion() {
        if (this.questionCase_ == 6) {
            this.questionCase_ = 0;
            this.question_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMock() {
        this.isMock_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMultiAskQuestion() {
        if (this.questionCase_ == 7) {
            this.questionCase_ = 0;
            this.question_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestion() {
        this.questionCase_ = 0;
        this.question_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestionKey() {
        this.questionKey_ = getDefaultInstance().getQuestionKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static WazeAsksQuestion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnrichAlertQuestion(EnrichAlertQuestion enrichAlertQuestion) {
        Objects.requireNonNull(enrichAlertQuestion);
        if (this.questionCase_ == 4 && this.question_ != EnrichAlertQuestion.getDefaultInstance()) {
            EnrichAlertQuestion.Builder builderNewBuilder = EnrichAlertQuestion.newBuilder((EnrichAlertQuestion) this.question_);
            builderNewBuilder.mergeFrom((EnrichAlertQuestion.Builder) enrichAlertQuestion);
            enrichAlertQuestion = builderNewBuilder.buildPartial();
        }
        this.question_ = enrichAlertQuestion;
        this.questionCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeedbackQuestion(FeedbackQuestion feedbackQuestion) {
        Objects.requireNonNull(feedbackQuestion);
        if (this.questionCase_ == 6 && this.question_ != FeedbackQuestion.getDefaultInstance()) {
            FeedbackQuestion.Builder builderNewBuilder = FeedbackQuestion.newBuilder((FeedbackQuestion) this.question_);
            builderNewBuilder.mergeFrom((FeedbackQuestion.Builder) feedbackQuestion);
            feedbackQuestion = builderNewBuilder.buildPartial();
        }
        this.question_ = feedbackQuestion;
        this.questionCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMultiAskQuestion(MultiAskQuestion multiAskQuestion) {
        Objects.requireNonNull(multiAskQuestion);
        if (this.questionCase_ == 7 && this.question_ != MultiAskQuestion.getDefaultInstance()) {
            MultiAskQuestion.Builder builderNewBuilder = MultiAskQuestion.newBuilder((MultiAskQuestion) this.question_);
            builderNewBuilder.mergeFrom((MultiAskQuestion.Builder) multiAskQuestion);
            multiAskQuestion = builderNewBuilder.buildPartial();
        }
        this.question_ = multiAskQuestion;
        this.questionCase_ = 7;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static WazeAsksQuestion parseDelimitedFrom(InputStream inputStream) {
        return (WazeAsksQuestion) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WazeAsksQuestion parseFrom(v vVar) {
        return (WazeAsksQuestion) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<WazeAsksQuestion> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnrichAlertQuestion(EnrichAlertQuestion enrichAlertQuestion) {
        Objects.requireNonNull(enrichAlertQuestion);
        this.question_ = enrichAlertQuestion;
        this.questionCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntityId(String str) {
        Objects.requireNonNull(str);
        this.entityId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntityIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.entityId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeedbackQuestion(FeedbackQuestion feedbackQuestion) {
        Objects.requireNonNull(feedbackQuestion);
        this.question_ = feedbackQuestion;
        this.questionCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMock(boolean z) {
        this.isMock_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMultiAskQuestion(MultiAskQuestion multiAskQuestion) {
        Objects.requireNonNull(multiAskQuestion);
        this.question_ = multiAskQuestion;
        this.questionCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionKey(String str) {
        Objects.requireNonNull(str);
        this.questionKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionKeyBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.questionKey_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(WazeAsksQuestionSource wazeAsksQuestionSource) {
        this.source_ = wazeAsksQuestionSource.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i2) {
        this.source_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004<\u0000\u0005\f\u0006<\u0000\u0007<\u0000", new Object[]{"question_", "questionCase_", "questionKey_", "entityId_", "isMock_", EnrichAlertQuestion.class, "source_", FeedbackQuestion.class, MultiAskQuestion.class});
        }
        if (iOrdinal == 3) {
            return new WazeAsksQuestion();
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
        fo<WazeAsksQuestion> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (WazeAsksQuestion.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
    public EnrichAlertQuestion getEnrichAlertQuestion() {
        return this.questionCase_ == 4 ? (EnrichAlertQuestion) this.question_ : EnrichAlertQuestion.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
    public String getEntityId() {
        return this.entityId_;
    }

    @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
    public v getEntityIdBytes() {
        return v.s(this.entityId_);
    }

    @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
    public FeedbackQuestion getFeedbackQuestion() {
        return this.questionCase_ == 6 ? (FeedbackQuestion) this.question_ : FeedbackQuestion.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
    public boolean getIsMock() {
        return this.isMock_;
    }

    @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
    public MultiAskQuestion getMultiAskQuestion() {
        return this.questionCase_ == 7 ? (MultiAskQuestion) this.question_ : MultiAskQuestion.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
    public QuestionCase getQuestionCase() {
        return QuestionCase.forNumber(this.questionCase_);
    }

    @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
    public String getQuestionKey() {
        return this.questionKey_;
    }

    @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
    public v getQuestionKeyBytes() {
        return v.s(this.questionKey_);
    }

    @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
    public WazeAsksQuestionSource getSource() {
        WazeAsksQuestionSource wazeAsksQuestionSourceForNumber = WazeAsksQuestionSource.forNumber(this.source_);
        return wazeAsksQuestionSourceForNumber == null ? WazeAsksQuestionSource.UNRECOGNIZED : wazeAsksQuestionSourceForNumber;
    }

    @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
    public int getSourceValue() {
        return this.source_;
    }

    @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
    public boolean hasEnrichAlertQuestion() {
        return this.questionCase_ == 4;
    }

    @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
    public boolean hasFeedbackQuestion() {
        return this.questionCase_ == 6;
    }

    @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
    public boolean hasMultiAskQuestion() {
        return this.questionCase_ == 7;
    }

    public static Builder newBuilder(WazeAsksQuestion wazeAsksQuestion) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(wazeAsksQuestion);
    }

    public static WazeAsksQuestion parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (WazeAsksQuestion) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static WazeAsksQuestion parseFrom(v vVar, de deVar) {
        return (WazeAsksQuestion) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static WazeAsksQuestion parseFrom(z zVar) {
        return (WazeAsksQuestion) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static WazeAsksQuestion parseFrom(z zVar, de deVar) {
        return (WazeAsksQuestion) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static WazeAsksQuestion parseFrom(InputStream inputStream) {
        return (WazeAsksQuestion) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WazeAsksQuestion parseFrom(InputStream inputStream, de deVar) {
        return (WazeAsksQuestion) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static WazeAsksQuestion parseFrom(ByteBuffer byteBuffer) {
        return (WazeAsksQuestion) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static WazeAsksQuestion parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (WazeAsksQuestion) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<WazeAsksQuestion, Builder> implements WazeAsksQuestionOrBuilder {
        private Builder() {
            super(WazeAsksQuestion.DEFAULT_INSTANCE);
        }

        public Builder clearEnrichAlertQuestion() {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).clearEnrichAlertQuestion();
            return this;
        }

        public Builder clearEntityId() {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).clearEntityId();
            return this;
        }

        public Builder clearFeedbackQuestion() {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).clearFeedbackQuestion();
            return this;
        }

        public Builder clearIsMock() {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).clearIsMock();
            return this;
        }

        public Builder clearMultiAskQuestion() {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).clearMultiAskQuestion();
            return this;
        }

        public Builder clearQuestion() {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).clearQuestion();
            return this;
        }

        public Builder clearQuestionKey() {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).clearQuestionKey();
            return this;
        }

        public Builder clearSource() {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).clearSource();
            return this;
        }

        @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
        public EnrichAlertQuestion getEnrichAlertQuestion() {
            return ((WazeAsksQuestion) this.instance).getEnrichAlertQuestion();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
        public String getEntityId() {
            return ((WazeAsksQuestion) this.instance).getEntityId();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
        public v getEntityIdBytes() {
            return ((WazeAsksQuestion) this.instance).getEntityIdBytes();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
        public FeedbackQuestion getFeedbackQuestion() {
            return ((WazeAsksQuestion) this.instance).getFeedbackQuestion();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
        public boolean getIsMock() {
            return ((WazeAsksQuestion) this.instance).getIsMock();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
        public MultiAskQuestion getMultiAskQuestion() {
            return ((WazeAsksQuestion) this.instance).getMultiAskQuestion();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
        public QuestionCase getQuestionCase() {
            return ((WazeAsksQuestion) this.instance).getQuestionCase();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
        public String getQuestionKey() {
            return ((WazeAsksQuestion) this.instance).getQuestionKey();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
        public v getQuestionKeyBytes() {
            return ((WazeAsksQuestion) this.instance).getQuestionKeyBytes();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
        public WazeAsksQuestionSource getSource() {
            return ((WazeAsksQuestion) this.instance).getSource();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
        public int getSourceValue() {
            return ((WazeAsksQuestion) this.instance).getSourceValue();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
        public boolean hasEnrichAlertQuestion() {
            return ((WazeAsksQuestion) this.instance).hasEnrichAlertQuestion();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
        public boolean hasFeedbackQuestion() {
            return ((WazeAsksQuestion) this.instance).hasFeedbackQuestion();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksQuestionOrBuilder
        public boolean hasMultiAskQuestion() {
            return ((WazeAsksQuestion) this.instance).hasMultiAskQuestion();
        }

        public Builder mergeEnrichAlertQuestion(EnrichAlertQuestion enrichAlertQuestion) {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).mergeEnrichAlertQuestion(enrichAlertQuestion);
            return this;
        }

        public Builder mergeFeedbackQuestion(FeedbackQuestion feedbackQuestion) {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).mergeFeedbackQuestion(feedbackQuestion);
            return this;
        }

        public Builder mergeMultiAskQuestion(MultiAskQuestion multiAskQuestion) {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).mergeMultiAskQuestion(multiAskQuestion);
            return this;
        }

        public Builder setEnrichAlertQuestion(EnrichAlertQuestion.Builder builder) {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).setEnrichAlertQuestion(builder.build());
            return this;
        }

        public Builder setEntityId(String str) {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).setEntityId(str);
            return this;
        }

        public Builder setEntityIdBytes(v vVar) {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).setEntityIdBytes(vVar);
            return this;
        }

        public Builder setFeedbackQuestion(FeedbackQuestion.Builder builder) {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).setFeedbackQuestion(builder.build());
            return this;
        }

        public Builder setIsMock(boolean z) {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).setIsMock(z);
            return this;
        }

        public Builder setMultiAskQuestion(MultiAskQuestion.Builder builder) {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).setMultiAskQuestion(builder.build());
            return this;
        }

        public Builder setQuestionKey(String str) {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).setQuestionKey(str);
            return this;
        }

        public Builder setQuestionKeyBytes(v vVar) {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).setQuestionKeyBytes(vVar);
            return this;
        }

        public Builder setSource(WazeAsksQuestionSource wazeAsksQuestionSource) {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).setSource(wazeAsksQuestionSource);
            return this;
        }

        public Builder setSourceValue(int i2) {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).setSourceValue(i2);
            return this;
        }

        public Builder setEnrichAlertQuestion(EnrichAlertQuestion enrichAlertQuestion) {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).setEnrichAlertQuestion(enrichAlertQuestion);
            return this;
        }

        public Builder setFeedbackQuestion(FeedbackQuestion feedbackQuestion) {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).setFeedbackQuestion(feedbackQuestion);
            return this;
        }

        public Builder setMultiAskQuestion(MultiAskQuestion multiAskQuestion) {
            copyOnWrite();
            ((WazeAsksQuestion) this.instance).setMultiAskQuestion(multiAskQuestion);
            return this;
        }
    }

    public static WazeAsksQuestion parseFrom(byte[] bArr) {
        return (WazeAsksQuestion) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WazeAsksQuestion parseFrom(byte[] bArr, de deVar) {
        return (WazeAsksQuestion) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
