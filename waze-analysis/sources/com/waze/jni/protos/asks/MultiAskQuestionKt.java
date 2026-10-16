package com.waze.jni.protos.asks;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.asks.MultiAskQuestion;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MultiAskQuestionKt {
    public static final MultiAskQuestionKt INSTANCE = new MultiAskQuestionKt();

    private MultiAskQuestionKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MultiAskQuestion.Builder _builder;

        /* compiled from: WazeSource */
        public final class AnswersProxy extends c {
            private AnswersProxy() {
            }
        }

        private Dsl(MultiAskQuestion.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MultiAskQuestion _build() {
            MultiAskQuestion multiAskQuestionBuild = this._builder.build();
            x.e(multiAskQuestionBuild, "build(...)");
            return multiAskQuestionBuild;
        }

        public final /* synthetic */ void addAllAnswers(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllAnswers(iterable);
        }

        public final /* synthetic */ void addAnswers(a aVar, MultiAskAnswer multiAskAnswer) {
            x.f(aVar, "<this>");
            x.f(multiAskAnswer, "value");
            this._builder.addAnswers(multiAskAnswer);
        }

        public final /* synthetic */ void clearAnswers(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearAnswers();
        }

        public final void clearStatsAlertId() {
            this._builder.clearStatsAlertId();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final /* synthetic */ a getAnswers() {
            List<MultiAskAnswer> answersList = this._builder.getAnswersList();
            x.e(answersList, "getAnswersList(...)");
            return new a(answersList);
        }

        public final int getStatsAlertId() {
            return this._builder.getStatsAlertId();
        }

        public final MultiAskQuestion.QuestionType getType() {
            MultiAskQuestion.QuestionType type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final /* synthetic */ void plusAssignAllAnswers(a<MultiAskAnswer, AnswersProxy> aVar, Iterable<MultiAskAnswer> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllAnswers(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAnswers(a<MultiAskAnswer, AnswersProxy> aVar, MultiAskAnswer multiAskAnswer) {
            x.f(aVar, "<this>");
            x.f(multiAskAnswer, "value");
            addAnswers(aVar, multiAskAnswer);
        }

        public final /* synthetic */ void setAnswers(a aVar, int i2, MultiAskAnswer multiAskAnswer) {
            x.f(aVar, "<this>");
            x.f(multiAskAnswer, "value");
            this._builder.setAnswers(i2, multiAskAnswer);
        }

        public final void setStatsAlertId(int i2) {
            this._builder.setStatsAlertId(i2);
        }

        public final void setType(MultiAskQuestion.QuestionType questionType) {
            x.f(questionType, "value");
            this._builder.setType(questionType);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MultiAskQuestion.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MultiAskQuestion.Builder builder, o oVar) {
            this(builder);
        }
    }
}
