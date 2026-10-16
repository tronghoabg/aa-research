package com.waze.jni.protos.asks;

import com.waze.jni.protos.asks.MultiAskAnswer;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MultiAskAnswerKt {
    public static final MultiAskAnswerKt INSTANCE = new MultiAskAnswerKt();

    private MultiAskAnswerKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MultiAskAnswer.Builder _builder;

        private Dsl(MultiAskAnswer.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MultiAskAnswer _build() {
            MultiAskAnswer multiAskAnswerBuild = this._builder.build();
            x.e(multiAskAnswerBuild, "build(...)");
            return multiAskAnswerBuild;
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

        public final MultiAskAnswer.AnswerType getType() {
            MultiAskAnswer.AnswerType type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final void setPointsAward(int i2) {
            this._builder.setPointsAward(i2);
        }

        public final void setType(MultiAskAnswer.AnswerType answerType) {
            x.f(answerType, "value");
            this._builder.setType(answerType);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MultiAskAnswer.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MultiAskAnswer.Builder builder, o oVar) {
            this(builder);
        }
    }
}
