package com.waze.jni.protos.asks;

import com.waze.jni.protos.asks.WazeAsksQuestion;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WazeAsksQuestionKt {
    public static final WazeAsksQuestionKt INSTANCE = new WazeAsksQuestionKt();

    private WazeAsksQuestionKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final WazeAsksQuestion.Builder _builder;

        private Dsl(WazeAsksQuestion.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ WazeAsksQuestion _build() {
            WazeAsksQuestion wazeAsksQuestionBuild = this._builder.build();
            x.e(wazeAsksQuestionBuild, "build(...)");
            return wazeAsksQuestionBuild;
        }

        public final void clearEnrichAlertQuestion() {
            this._builder.clearEnrichAlertQuestion();
        }

        public final void clearEntityId() {
            this._builder.clearEntityId();
        }

        public final void clearFeedbackQuestion() {
            this._builder.clearFeedbackQuestion();
        }

        public final void clearIsMock() {
            this._builder.clearIsMock();
        }

        public final void clearMultiAskQuestion() {
            this._builder.clearMultiAskQuestion();
        }

        public final void clearQuestion() {
            this._builder.clearQuestion();
        }

        public final void clearQuestionKey() {
            this._builder.clearQuestionKey();
        }

        public final void clearSource() {
            this._builder.clearSource();
        }

        public final EnrichAlertQuestion getEnrichAlertQuestion() {
            EnrichAlertQuestion enrichAlertQuestion = this._builder.getEnrichAlertQuestion();
            x.e(enrichAlertQuestion, "getEnrichAlertQuestion(...)");
            return enrichAlertQuestion;
        }

        public final String getEntityId() {
            String entityId = this._builder.getEntityId();
            x.e(entityId, "getEntityId(...)");
            return entityId;
        }

        public final FeedbackQuestion getFeedbackQuestion() {
            FeedbackQuestion feedbackQuestion = this._builder.getFeedbackQuestion();
            x.e(feedbackQuestion, "getFeedbackQuestion(...)");
            return feedbackQuestion;
        }

        public final boolean getIsMock() {
            return this._builder.getIsMock();
        }

        public final MultiAskQuestion getMultiAskQuestion() {
            MultiAskQuestion multiAskQuestion = this._builder.getMultiAskQuestion();
            x.e(multiAskQuestion, "getMultiAskQuestion(...)");
            return multiAskQuestion;
        }

        public final WazeAsksQuestion.QuestionCase getQuestionCase() {
            WazeAsksQuestion.QuestionCase questionCase = this._builder.getQuestionCase();
            x.e(questionCase, "getQuestionCase(...)");
            return questionCase;
        }

        public final String getQuestionKey() {
            String questionKey = this._builder.getQuestionKey();
            x.e(questionKey, "getQuestionKey(...)");
            return questionKey;
        }

        public final WazeAsksQuestion.WazeAsksQuestionSource getSource() {
            WazeAsksQuestion.WazeAsksQuestionSource source = this._builder.getSource();
            x.e(source, "getSource(...)");
            return source;
        }

        public final int getSourceValue() {
            return this._builder.getSourceValue();
        }

        public final boolean hasEnrichAlertQuestion() {
            return this._builder.hasEnrichAlertQuestion();
        }

        public final boolean hasFeedbackQuestion() {
            return this._builder.hasFeedbackQuestion();
        }

        public final boolean hasMultiAskQuestion() {
            return this._builder.hasMultiAskQuestion();
        }

        public final void setEnrichAlertQuestion(EnrichAlertQuestion enrichAlertQuestion) {
            x.f(enrichAlertQuestion, "value");
            this._builder.setEnrichAlertQuestion(enrichAlertQuestion);
        }

        public final void setEntityId(String str) {
            x.f(str, "value");
            this._builder.setEntityId(str);
        }

        public final void setFeedbackQuestion(FeedbackQuestion feedbackQuestion) {
            x.f(feedbackQuestion, "value");
            this._builder.setFeedbackQuestion(feedbackQuestion);
        }

        public final void setIsMock(boolean z) {
            this._builder.setIsMock(z);
        }

        public final void setMultiAskQuestion(MultiAskQuestion multiAskQuestion) {
            x.f(multiAskQuestion, "value");
            this._builder.setMultiAskQuestion(multiAskQuestion);
        }

        public final void setQuestionKey(String str) {
            x.f(str, "value");
            this._builder.setQuestionKey(str);
        }

        public final void setSource(WazeAsksQuestion.WazeAsksQuestionSource wazeAsksQuestionSource) {
            x.f(wazeAsksQuestionSource, "value");
            this._builder.setSource(wazeAsksQuestionSource);
        }

        public final void setSourceValue(int i2) {
            this._builder.setSourceValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(WazeAsksQuestion.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(WazeAsksQuestion.Builder builder, o oVar) {
            this(builder);
        }
    }
}
