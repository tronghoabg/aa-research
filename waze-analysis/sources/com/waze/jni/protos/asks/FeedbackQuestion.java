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
import com.waze.jni.protos.asks.FeedbackAnswer;
import com.waze.jni.protos.asks.TriggeredBySegmentId;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FeedbackQuestion extends du<FeedbackQuestion, Builder> implements FeedbackQuestionOrBuilder {
    public static final int ANSWERS_FIELD_NUMBER = 3;
    private static final FeedbackQuestion DEFAULT_INSTANCE;
    private static volatile fo<FeedbackQuestion> PARSER = null;
    public static final int TRIGGERED_BY_ALERT_ID_FIELD_NUMBER = 2;
    public static final int TRIGGERED_BY_SEGMENT_ID_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 1;
    private Object triggeredBy_;
    private int type_;
    private int triggeredByCase_ = 0;
    private eo<FeedbackAnswer> answers_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.asks.FeedbackQuestion$1, reason: invalid class name */
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
    public enum FeedbackQuestionType implements eg {
        RAILROAD_CROSSING(0),
        SPEED_BUMP(1),
        DANGEROUS_CURVE(2),
        DANGEROUS_INTERSECTION(3),
        DANGEROUS_MERGE(4),
        TOLL_BOOTH(5),
        TOPES(6),
        SCHOOL_ZONE(7),
        CAMERA_SPEED(8),
        CAMERA_RED_LIGHT(9),
        CAMERA_SEATBELT(10),
        CAMERA_MOBILE_PHONE(11),
        CAMERA_STOP(12),
        CAMERA_NOISE(13),
        CAMERA_DISTANCE(14),
        CAMERA_CARPOOL_LANE(15),
        CAMERA_BUS_LANE(16),
        CAMERA_HOV_LANE(17),
        CAMERA_SPEED_RED_LIGHT(18),
        UNRECOGNIZED(-1);

        public static final int CAMERA_BUS_LANE_VALUE = 16;
        public static final int CAMERA_CARPOOL_LANE_VALUE = 15;
        public static final int CAMERA_DISTANCE_VALUE = 14;
        public static final int CAMERA_HOV_LANE_VALUE = 17;
        public static final int CAMERA_MOBILE_PHONE_VALUE = 11;
        public static final int CAMERA_NOISE_VALUE = 13;
        public static final int CAMERA_RED_LIGHT_VALUE = 9;
        public static final int CAMERA_SEATBELT_VALUE = 10;
        public static final int CAMERA_SPEED_RED_LIGHT_VALUE = 18;
        public static final int CAMERA_SPEED_VALUE = 8;
        public static final int CAMERA_STOP_VALUE = 12;
        public static final int DANGEROUS_CURVE_VALUE = 2;
        public static final int DANGEROUS_INTERSECTION_VALUE = 3;
        public static final int DANGEROUS_MERGE_VALUE = 4;
        public static final int RAILROAD_CROSSING_VALUE = 0;
        public static final int SCHOOL_ZONE_VALUE = 7;
        public static final int SPEED_BUMP_VALUE = 1;
        public static final int TOLL_BOOTH_VALUE = 5;
        public static final int TOPES_VALUE = 6;
        private static final eh<FeedbackQuestionType> internalValueMap = new eh<FeedbackQuestionType>() { // from class: com.waze.jni.protos.asks.FeedbackQuestion.FeedbackQuestionType.1
            @Override // com.google.v.eh
            public FeedbackQuestionType findValueByNumber(int i2) {
                return FeedbackQuestionType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class FeedbackQuestionTypeVerifier implements ei {
            static final ei INSTANCE = new FeedbackQuestionTypeVerifier();

            private FeedbackQuestionTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return FeedbackQuestionType.forNumber(i2) != null;
            }
        }

        FeedbackQuestionType(int i2) {
            this.value = i2;
        }

        public static FeedbackQuestionType forNumber(int i2) {
            switch (i2) {
                case 0:
                    return RAILROAD_CROSSING;
                case 1:
                    return SPEED_BUMP;
                case 2:
                    return DANGEROUS_CURVE;
                case 3:
                    return DANGEROUS_INTERSECTION;
                case 4:
                    return DANGEROUS_MERGE;
                case 5:
                    return TOLL_BOOTH;
                case 6:
                    return TOPES;
                case 7:
                    return SCHOOL_ZONE;
                case 8:
                    return CAMERA_SPEED;
                case 9:
                    return CAMERA_RED_LIGHT;
                case 10:
                    return CAMERA_SEATBELT;
                case 11:
                    return CAMERA_MOBILE_PHONE;
                case 12:
                    return CAMERA_STOP;
                case 13:
                    return CAMERA_NOISE;
                case 14:
                    return CAMERA_DISTANCE;
                case 15:
                    return CAMERA_CARPOOL_LANE;
                case 16:
                    return CAMERA_BUS_LANE;
                case 17:
                    return CAMERA_HOV_LANE;
                case 18:
                    return CAMERA_SPEED_RED_LIGHT;
                default:
                    return null;
            }
        }

        public static eh<FeedbackQuestionType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return FeedbackQuestionTypeVerifier.INSTANCE;
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
    public interface TriggeredByAlertIdOrBuilder extends fj {
        String getProviderId();

        v getProviderIdBytes();

        String getUniqueId();

        v getUniqueIdBytes();
    }

    /* compiled from: WazeSource */
    public enum TriggeredByCase {
        TRIGGERED_BY_ALERT_ID(2),
        TRIGGERED_BY_SEGMENT_ID(4),
        TRIGGEREDBY_NOT_SET(0);

        private final int value;

        TriggeredByCase(int i2) {
            this.value = i2;
        }

        public static TriggeredByCase forNumber(int i2) {
            if (i2 == 0) {
                return TRIGGEREDBY_NOT_SET;
            }
            if (i2 == 2) {
                return TRIGGERED_BY_ALERT_ID;
            }
            if (i2 != 4) {
                return null;
            }
            return TRIGGERED_BY_SEGMENT_ID;
        }

        public int getNumber() {
            return this.value;
        }
    }

    static {
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion();
        DEFAULT_INSTANCE = feedbackQuestion;
        du.registerDefaultInstance(FeedbackQuestion.class, feedbackQuestion);
    }

    private FeedbackQuestion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAnswers(Iterable<? extends FeedbackAnswer> iterable) {
        ensureAnswersIsMutable();
        c.addAll(iterable, this.answers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnswers(int i2, FeedbackAnswer feedbackAnswer) {
        Objects.requireNonNull(feedbackAnswer);
        ensureAnswersIsMutable();
        this.answers_.add(i2, feedbackAnswer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswers() {
        this.answers_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeredBy() {
        this.triggeredByCase_ = 0;
        this.triggeredBy_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeredByAlertId() {
        if (this.triggeredByCase_ == 2) {
            this.triggeredByCase_ = 0;
            this.triggeredBy_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeredBySegmentId() {
        if (this.triggeredByCase_ == 4) {
            this.triggeredByCase_ = 0;
            this.triggeredBy_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    private void ensureAnswersIsMutable() {
        eo<FeedbackAnswer> eoVar = this.answers_;
        if (eoVar.c()) {
            return;
        }
        this.answers_ = du.mutableCopy(eoVar);
    }

    public static FeedbackQuestion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTriggeredByAlertId(TriggeredByAlertId triggeredByAlertId) {
        Objects.requireNonNull(triggeredByAlertId);
        if (this.triggeredByCase_ == 2 && this.triggeredBy_ != TriggeredByAlertId.getDefaultInstance()) {
            TriggeredByAlertId.Builder builderNewBuilder = TriggeredByAlertId.newBuilder((TriggeredByAlertId) this.triggeredBy_);
            builderNewBuilder.mergeFrom((TriggeredByAlertId.Builder) triggeredByAlertId);
            triggeredByAlertId = builderNewBuilder.buildPartial();
        }
        this.triggeredBy_ = triggeredByAlertId;
        this.triggeredByCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTriggeredBySegmentId(TriggeredBySegmentId triggeredBySegmentId) {
        Objects.requireNonNull(triggeredBySegmentId);
        if (this.triggeredByCase_ == 4 && this.triggeredBy_ != TriggeredBySegmentId.getDefaultInstance()) {
            TriggeredBySegmentId.Builder builderNewBuilder = TriggeredBySegmentId.newBuilder((TriggeredBySegmentId) this.triggeredBy_);
            builderNewBuilder.mergeFrom((TriggeredBySegmentId.Builder) triggeredBySegmentId);
            triggeredBySegmentId = builderNewBuilder.buildPartial();
        }
        this.triggeredBy_ = triggeredBySegmentId;
        this.triggeredByCase_ = 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FeedbackQuestion parseDelimitedFrom(InputStream inputStream) {
        return (FeedbackQuestion) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FeedbackQuestion parseFrom(v vVar) {
        return (FeedbackQuestion) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<FeedbackQuestion> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAnswers(int i2) {
        ensureAnswersIsMutable();
        this.answers_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswers(int i2, FeedbackAnswer feedbackAnswer) {
        Objects.requireNonNull(feedbackAnswer);
        ensureAnswersIsMutable();
        this.answers_.set(i2, feedbackAnswer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeredByAlertId(TriggeredByAlertId triggeredByAlertId) {
        Objects.requireNonNull(triggeredByAlertId);
        this.triggeredBy_ = triggeredByAlertId;
        this.triggeredByCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeredBySegmentId(TriggeredBySegmentId triggeredBySegmentId) {
        Objects.requireNonNull(triggeredBySegmentId);
        this.triggeredBy_ = triggeredBySegmentId;
        this.triggeredByCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(FeedbackQuestionType feedbackQuestionType) {
        this.type_ = feedbackQuestionType.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002<\u0000\u0003\u001b\u0004<\u0000", new Object[]{"triggeredBy_", "triggeredByCase_", "type_", TriggeredByAlertId.class, "answers_", FeedbackAnswer.class, TriggeredBySegmentId.class});
        }
        if (iOrdinal == 3) {
            return new FeedbackQuestion();
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
        fo<FeedbackQuestion> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (FeedbackQuestion.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
    public FeedbackAnswer getAnswers(int i2) {
        return this.answers_.get(i2);
    }

    @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
    public int getAnswersCount() {
        return this.answers_.size();
    }

    @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
    public List<FeedbackAnswer> getAnswersList() {
        return this.answers_;
    }

    public FeedbackAnswerOrBuilder getAnswersOrBuilder(int i2) {
        return this.answers_.get(i2);
    }

    public List<? extends FeedbackAnswerOrBuilder> getAnswersOrBuilderList() {
        return this.answers_;
    }

    @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
    public TriggeredByAlertId getTriggeredByAlertId() {
        return this.triggeredByCase_ == 2 ? (TriggeredByAlertId) this.triggeredBy_ : TriggeredByAlertId.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
    public TriggeredByCase getTriggeredByCase() {
        return TriggeredByCase.forNumber(this.triggeredByCase_);
    }

    @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
    public TriggeredBySegmentId getTriggeredBySegmentId() {
        return this.triggeredByCase_ == 4 ? (TriggeredBySegmentId) this.triggeredBy_ : TriggeredBySegmentId.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
    public FeedbackQuestionType getType() {
        FeedbackQuestionType feedbackQuestionTypeForNumber = FeedbackQuestionType.forNumber(this.type_);
        return feedbackQuestionTypeForNumber == null ? FeedbackQuestionType.UNRECOGNIZED : feedbackQuestionTypeForNumber;
    }

    @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
    public boolean hasTriggeredByAlertId() {
        return this.triggeredByCase_ == 2;
    }

    @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
    public boolean hasTriggeredBySegmentId() {
        return this.triggeredByCase_ == 4;
    }

    /* compiled from: WazeSource */
    public final class TriggeredByAlertId extends du<TriggeredByAlertId, Builder> implements TriggeredByAlertIdOrBuilder {
        private static final TriggeredByAlertId DEFAULT_INSTANCE;
        private static volatile fo<TriggeredByAlertId> PARSER = null;
        public static final int PROVIDER_ID_FIELD_NUMBER = 2;
        public static final int UNIQUE_ID_FIELD_NUMBER = 1;
        private String uniqueId_ = "";
        private String providerId_ = "";

        /* compiled from: WazeSource */
        public final class Builder extends dm<TriggeredByAlertId, Builder> implements TriggeredByAlertIdOrBuilder {
            private Builder() {
                super(TriggeredByAlertId.DEFAULT_INSTANCE);
            }

            public Builder clearProviderId() {
                copyOnWrite();
                ((TriggeredByAlertId) this.instance).clearProviderId();
                return this;
            }

            public Builder clearUniqueId() {
                copyOnWrite();
                ((TriggeredByAlertId) this.instance).clearUniqueId();
                return this;
            }

            @Override // com.waze.jni.protos.asks.FeedbackQuestion.TriggeredByAlertIdOrBuilder
            public String getProviderId() {
                return ((TriggeredByAlertId) this.instance).getProviderId();
            }

            @Override // com.waze.jni.protos.asks.FeedbackQuestion.TriggeredByAlertIdOrBuilder
            public v getProviderIdBytes() {
                return ((TriggeredByAlertId) this.instance).getProviderIdBytes();
            }

            @Override // com.waze.jni.protos.asks.FeedbackQuestion.TriggeredByAlertIdOrBuilder
            public String getUniqueId() {
                return ((TriggeredByAlertId) this.instance).getUniqueId();
            }

            @Override // com.waze.jni.protos.asks.FeedbackQuestion.TriggeredByAlertIdOrBuilder
            public v getUniqueIdBytes() {
                return ((TriggeredByAlertId) this.instance).getUniqueIdBytes();
            }

            public Builder setProviderId(String str) {
                copyOnWrite();
                ((TriggeredByAlertId) this.instance).setProviderId(str);
                return this;
            }

            public Builder setProviderIdBytes(v vVar) {
                copyOnWrite();
                ((TriggeredByAlertId) this.instance).setProviderIdBytes(vVar);
                return this;
            }

            public Builder setUniqueId(String str) {
                copyOnWrite();
                ((TriggeredByAlertId) this.instance).setUniqueId(str);
                return this;
            }

            public Builder setUniqueIdBytes(v vVar) {
                copyOnWrite();
                ((TriggeredByAlertId) this.instance).setUniqueIdBytes(vVar);
                return this;
            }
        }

        static {
            TriggeredByAlertId triggeredByAlertId = new TriggeredByAlertId();
            DEFAULT_INSTANCE = triggeredByAlertId;
            du.registerDefaultInstance(TriggeredByAlertId.class, triggeredByAlertId);
        }

        private TriggeredByAlertId() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProviderId() {
            this.providerId_ = getDefaultInstance().getProviderId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUniqueId() {
            this.uniqueId_ = getDefaultInstance().getUniqueId();
        }

        public static TriggeredByAlertId getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TriggeredByAlertId parseDelimitedFrom(InputStream inputStream) {
            return (TriggeredByAlertId) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TriggeredByAlertId parseFrom(v vVar) {
            return (TriggeredByAlertId) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<TriggeredByAlertId> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProviderId(String str) {
            Objects.requireNonNull(str);
            this.providerId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProviderIdBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.providerId_ = vVar.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUniqueId(String str) {
            Objects.requireNonNull(str);
            this.uniqueId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUniqueIdBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.uniqueId_ = vVar.u();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"uniqueId_", "providerId_"});
            }
            if (iOrdinal == 3) {
                return new TriggeredByAlertId();
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
            fo<TriggeredByAlertId> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (TriggeredByAlertId.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.asks.FeedbackQuestion.TriggeredByAlertIdOrBuilder
        public String getProviderId() {
            return this.providerId_;
        }

        @Override // com.waze.jni.protos.asks.FeedbackQuestion.TriggeredByAlertIdOrBuilder
        public v getProviderIdBytes() {
            return v.s(this.providerId_);
        }

        @Override // com.waze.jni.protos.asks.FeedbackQuestion.TriggeredByAlertIdOrBuilder
        public String getUniqueId() {
            return this.uniqueId_;
        }

        @Override // com.waze.jni.protos.asks.FeedbackQuestion.TriggeredByAlertIdOrBuilder
        public v getUniqueIdBytes() {
            return v.s(this.uniqueId_);
        }

        public static Builder newBuilder(TriggeredByAlertId triggeredByAlertId) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(triggeredByAlertId);
        }

        public static TriggeredByAlertId parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (TriggeredByAlertId) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static TriggeredByAlertId parseFrom(v vVar, de deVar) {
            return (TriggeredByAlertId) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static TriggeredByAlertId parseFrom(z zVar) {
            return (TriggeredByAlertId) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static TriggeredByAlertId parseFrom(z zVar, de deVar) {
            return (TriggeredByAlertId) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static TriggeredByAlertId parseFrom(InputStream inputStream) {
            return (TriggeredByAlertId) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TriggeredByAlertId parseFrom(InputStream inputStream, de deVar) {
            return (TriggeredByAlertId) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static TriggeredByAlertId parseFrom(ByteBuffer byteBuffer) {
            return (TriggeredByAlertId) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static TriggeredByAlertId parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (TriggeredByAlertId) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static TriggeredByAlertId parseFrom(byte[] bArr) {
            return (TriggeredByAlertId) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TriggeredByAlertId parseFrom(byte[] bArr, de deVar) {
            return (TriggeredByAlertId) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(FeedbackQuestion feedbackQuestion) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(feedbackQuestion);
    }

    public static FeedbackQuestion parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (FeedbackQuestion) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static FeedbackQuestion parseFrom(v vVar, de deVar) {
        return (FeedbackQuestion) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static FeedbackQuestion parseFrom(z zVar) {
        return (FeedbackQuestion) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static FeedbackQuestion parseFrom(z zVar, de deVar) {
        return (FeedbackQuestion) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnswers(FeedbackAnswer feedbackAnswer) {
        Objects.requireNonNull(feedbackAnswer);
        ensureAnswersIsMutable();
        this.answers_.add(feedbackAnswer);
    }

    public static FeedbackQuestion parseFrom(InputStream inputStream) {
        return (FeedbackQuestion) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FeedbackQuestion parseFrom(InputStream inputStream, de deVar) {
        return (FeedbackQuestion) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static FeedbackQuestion parseFrom(ByteBuffer byteBuffer) {
        return (FeedbackQuestion) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FeedbackQuestion parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (FeedbackQuestion) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<FeedbackQuestion, Builder> implements FeedbackQuestionOrBuilder {
        private Builder() {
            super(FeedbackQuestion.DEFAULT_INSTANCE);
        }

        public Builder addAllAnswers(Iterable<? extends FeedbackAnswer> iterable) {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).addAllAnswers(iterable);
            return this;
        }

        public Builder addAnswers(int i2, FeedbackAnswer.Builder builder) {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).addAnswers(i2, builder.build());
            return this;
        }

        public Builder clearAnswers() {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).clearAnswers();
            return this;
        }

        public Builder clearTriggeredBy() {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).clearTriggeredBy();
            return this;
        }

        public Builder clearTriggeredByAlertId() {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).clearTriggeredByAlertId();
            return this;
        }

        public Builder clearTriggeredBySegmentId() {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).clearTriggeredBySegmentId();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).clearType();
            return this;
        }

        @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
        public FeedbackAnswer getAnswers(int i2) {
            return ((FeedbackQuestion) this.instance).getAnswers(i2);
        }

        @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
        public int getAnswersCount() {
            return ((FeedbackQuestion) this.instance).getAnswersCount();
        }

        @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
        public List<FeedbackAnswer> getAnswersList() {
            return DesugarCollections.unmodifiableList(((FeedbackQuestion) this.instance).getAnswersList());
        }

        @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
        public TriggeredByAlertId getTriggeredByAlertId() {
            return ((FeedbackQuestion) this.instance).getTriggeredByAlertId();
        }

        @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
        public TriggeredByCase getTriggeredByCase() {
            return ((FeedbackQuestion) this.instance).getTriggeredByCase();
        }

        @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
        public TriggeredBySegmentId getTriggeredBySegmentId() {
            return ((FeedbackQuestion) this.instance).getTriggeredBySegmentId();
        }

        @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
        public FeedbackQuestionType getType() {
            return ((FeedbackQuestion) this.instance).getType();
        }

        @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
        public int getTypeValue() {
            return ((FeedbackQuestion) this.instance).getTypeValue();
        }

        @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
        public boolean hasTriggeredByAlertId() {
            return ((FeedbackQuestion) this.instance).hasTriggeredByAlertId();
        }

        @Override // com.waze.jni.protos.asks.FeedbackQuestionOrBuilder
        public boolean hasTriggeredBySegmentId() {
            return ((FeedbackQuestion) this.instance).hasTriggeredBySegmentId();
        }

        public Builder mergeTriggeredByAlertId(TriggeredByAlertId triggeredByAlertId) {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).mergeTriggeredByAlertId(triggeredByAlertId);
            return this;
        }

        public Builder mergeTriggeredBySegmentId(TriggeredBySegmentId triggeredBySegmentId) {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).mergeTriggeredBySegmentId(triggeredBySegmentId);
            return this;
        }

        public Builder removeAnswers(int i2) {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).removeAnswers(i2);
            return this;
        }

        public Builder setAnswers(int i2, FeedbackAnswer.Builder builder) {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).setAnswers(i2, builder.build());
            return this;
        }

        public Builder setTriggeredByAlertId(TriggeredByAlertId.Builder builder) {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).setTriggeredByAlertId(builder.build());
            return this;
        }

        public Builder setTriggeredBySegmentId(TriggeredBySegmentId.Builder builder) {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).setTriggeredBySegmentId(builder.build());
            return this;
        }

        public Builder setType(FeedbackQuestionType feedbackQuestionType) {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).setType(feedbackQuestionType);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).setTypeValue(i2);
            return this;
        }

        public Builder addAnswers(int i2, FeedbackAnswer feedbackAnswer) {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).addAnswers(i2, feedbackAnswer);
            return this;
        }

        public Builder setAnswers(int i2, FeedbackAnswer feedbackAnswer) {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).setAnswers(i2, feedbackAnswer);
            return this;
        }

        public Builder setTriggeredByAlertId(TriggeredByAlertId triggeredByAlertId) {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).setTriggeredByAlertId(triggeredByAlertId);
            return this;
        }

        public Builder setTriggeredBySegmentId(TriggeredBySegmentId triggeredBySegmentId) {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).setTriggeredBySegmentId(triggeredBySegmentId);
            return this;
        }

        public Builder addAnswers(FeedbackAnswer.Builder builder) {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).addAnswers(builder.build());
            return this;
        }

        public Builder addAnswers(FeedbackAnswer feedbackAnswer) {
            copyOnWrite();
            ((FeedbackQuestion) this.instance).addAnswers(feedbackAnswer);
            return this;
        }
    }

    public static FeedbackQuestion parseFrom(byte[] bArr) {
        return (FeedbackQuestion) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FeedbackQuestion parseFrom(byte[] bArr, de deVar) {
        return (FeedbackQuestion) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
