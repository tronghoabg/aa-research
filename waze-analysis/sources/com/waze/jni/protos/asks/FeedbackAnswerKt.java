package com.waze.jni.protos.asks;

import com.waze.jni.protos.asks.FeedbackAnswer;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FeedbackAnswerKt {
    public static final FeedbackAnswerKt INSTANCE = new FeedbackAnswerKt();

    private FeedbackAnswerKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final FeedbackAnswer.Builder _builder;

        private Dsl(FeedbackAnswer.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ FeedbackAnswer _build() {
            FeedbackAnswer feedbackAnswerBuild = this._builder.build();
            x.e(feedbackAnswerBuild, "build(...)");
            return feedbackAnswerBuild;
        }

        public final void clearPointsAward() {
            this._builder.clearPointsAward();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final int getPointsAward() {
            return this._builder.getPointsAward();
        }

        public final FeedbackAnswer.FeedbackAnswerType getType() {
            FeedbackAnswer.FeedbackAnswerType type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final void setPointsAward(int i2) {
            this._builder.setPointsAward(i2);
        }

        public final void setType(FeedbackAnswer.FeedbackAnswerType feedbackAnswerType) {
            x.f(feedbackAnswerType, "value");
            this._builder.setType(feedbackAnswerType);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(FeedbackAnswer.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(FeedbackAnswer.Builder builder, o oVar) {
            this(builder);
        }
    }
}
