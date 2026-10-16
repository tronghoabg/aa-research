package com.waze.jni.protos.asks;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.asks.FeedbackQuestion;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FeedbackQuestionKt {
    public static final FeedbackQuestionKt INSTANCE = new FeedbackQuestionKt();

    private FeedbackQuestionKt() {
    }

    /* renamed from: -initializetriggeredByAlertId, reason: not valid java name */
    public final FeedbackQuestion.TriggeredByAlertId m25985initializetriggeredByAlertId(l<? super TriggeredByAlertIdKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        TriggeredByAlertIdKt.Dsl.Companion companion = TriggeredByAlertIdKt.Dsl.Companion;
        FeedbackQuestion.TriggeredByAlertId.Builder builderNewBuilder = FeedbackQuestion.TriggeredByAlertId.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        TriggeredByAlertIdKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class TriggeredByAlertIdKt {
        public static final TriggeredByAlertIdKt INSTANCE = new TriggeredByAlertIdKt();

        private TriggeredByAlertIdKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final FeedbackQuestion.TriggeredByAlertId.Builder _builder;

            private Dsl(FeedbackQuestion.TriggeredByAlertId.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ FeedbackQuestion.TriggeredByAlertId _build() {
                FeedbackQuestion.TriggeredByAlertId triggeredByAlertIdBuild = this._builder.build();
                x.e(triggeredByAlertIdBuild, "build(...)");
                return triggeredByAlertIdBuild;
            }

            public final void clearProviderId() {
                this._builder.clearProviderId();
            }

            public final void clearUniqueId() {
                this._builder.clearUniqueId();
            }

            public final String getProviderId() {
                String providerId = this._builder.getProviderId();
                x.e(providerId, "getProviderId(...)");
                return providerId;
            }

            public final String getUniqueId() {
                String uniqueId = this._builder.getUniqueId();
                x.e(uniqueId, "getUniqueId(...)");
                return uniqueId;
            }

            public final void setProviderId(String str) {
                x.f(str, "value");
                this._builder.setProviderId(str);
            }

            public final void setUniqueId(String str) {
                x.f(str, "value");
                this._builder.setUniqueId(str);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(FeedbackQuestion.TriggeredByAlertId.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(FeedbackQuestion.TriggeredByAlertId.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final FeedbackQuestion.Builder _builder;

        /* compiled from: WazeSource */
        public final class AnswersProxy extends c {
            private AnswersProxy() {
            }
        }

        private Dsl(FeedbackQuestion.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ FeedbackQuestion _build() {
            FeedbackQuestion feedbackQuestionBuild = this._builder.build();
            x.e(feedbackQuestionBuild, "build(...)");
            return feedbackQuestionBuild;
        }

        public final /* synthetic */ void addAllAnswers(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllAnswers(iterable);
        }

        public final /* synthetic */ void addAnswers(a aVar, FeedbackAnswer feedbackAnswer) {
            x.f(aVar, "<this>");
            x.f(feedbackAnswer, "value");
            this._builder.addAnswers(feedbackAnswer);
        }

        public final /* synthetic */ void clearAnswers(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearAnswers();
        }

        public final void clearTriggeredBy() {
            this._builder.clearTriggeredBy();
        }

        public final void clearTriggeredByAlertId() {
            this._builder.clearTriggeredByAlertId();
        }

        public final void clearTriggeredBySegmentId() {
            this._builder.clearTriggeredBySegmentId();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final /* synthetic */ a getAnswers() {
            List<FeedbackAnswer> answersList = this._builder.getAnswersList();
            x.e(answersList, "getAnswersList(...)");
            return new a(answersList);
        }

        public final FeedbackQuestion.TriggeredByAlertId getTriggeredByAlertId() {
            FeedbackQuestion.TriggeredByAlertId triggeredByAlertId = this._builder.getTriggeredByAlertId();
            x.e(triggeredByAlertId, "getTriggeredByAlertId(...)");
            return triggeredByAlertId;
        }

        public final FeedbackQuestion.TriggeredByCase getTriggeredByCase() {
            FeedbackQuestion.TriggeredByCase triggeredByCase = this._builder.getTriggeredByCase();
            x.e(triggeredByCase, "getTriggeredByCase(...)");
            return triggeredByCase;
        }

        public final TriggeredBySegmentId getTriggeredBySegmentId() {
            TriggeredBySegmentId triggeredBySegmentId = this._builder.getTriggeredBySegmentId();
            x.e(triggeredBySegmentId, "getTriggeredBySegmentId(...)");
            return triggeredBySegmentId;
        }

        public final FeedbackQuestion.FeedbackQuestionType getType() {
            FeedbackQuestion.FeedbackQuestionType type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final boolean hasTriggeredByAlertId() {
            return this._builder.hasTriggeredByAlertId();
        }

        public final boolean hasTriggeredBySegmentId() {
            return this._builder.hasTriggeredBySegmentId();
        }

        public final /* synthetic */ void plusAssignAllAnswers(a<FeedbackAnswer, AnswersProxy> aVar, Iterable<FeedbackAnswer> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllAnswers(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAnswers(a<FeedbackAnswer, AnswersProxy> aVar, FeedbackAnswer feedbackAnswer) {
            x.f(aVar, "<this>");
            x.f(feedbackAnswer, "value");
            addAnswers(aVar, feedbackAnswer);
        }

        public final /* synthetic */ void setAnswers(a aVar, int i2, FeedbackAnswer feedbackAnswer) {
            x.f(aVar, "<this>");
            x.f(feedbackAnswer, "value");
            this._builder.setAnswers(i2, feedbackAnswer);
        }

        public final void setTriggeredByAlertId(FeedbackQuestion.TriggeredByAlertId triggeredByAlertId) {
            x.f(triggeredByAlertId, "value");
            this._builder.setTriggeredByAlertId(triggeredByAlertId);
        }

        public final void setTriggeredBySegmentId(TriggeredBySegmentId triggeredBySegmentId) {
            x.f(triggeredBySegmentId, "value");
            this._builder.setTriggeredBySegmentId(triggeredBySegmentId);
        }

        public final void setType(FeedbackQuestion.FeedbackQuestionType feedbackQuestionType) {
            x.f(feedbackQuestionType, "value");
            this._builder.setType(feedbackQuestionType);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(FeedbackQuestion.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(FeedbackQuestion.Builder builder, o oVar) {
            this(builder);
        }
    }
}
