package com.waze.jni.protos;

import com.waze.jni.protos.InsightPriority;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class InsightPriorityKt {
    public static final InsightPriorityKt INSTANCE = new InsightPriorityKt();

    private InsightPriorityKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InsightPriority.Builder _builder;

        private Dsl(InsightPriority.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ InsightPriority _build() {
            InsightPriority insightPriorityBuild = this._builder.build();
            x.e(insightPriorityBuild, "build(...)");
            return insightPriorityBuild;
        }

        public final void clearPreemptive() {
            this._builder.clearPreemptive();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final boolean getPreemptive() {
            return this._builder.getPreemptive();
        }

        public final int getValue() {
            return this._builder.getValue();
        }

        public final void setPreemptive(boolean z) {
            this._builder.setPreemptive(z);
        }

        public final void setValue(int i2) {
            this._builder.setValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(InsightPriority.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(InsightPriority.Builder builder, o oVar) {
            this(builder);
        }
    }
}
