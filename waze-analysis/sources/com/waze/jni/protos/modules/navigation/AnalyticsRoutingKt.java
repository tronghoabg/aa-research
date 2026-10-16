package com.waze.jni.protos.modules.navigation;

import com.waze.jni.protos.modules.navigation.AnalyticsRouting;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AnalyticsRoutingKt {
    public static final AnalyticsRoutingKt INSTANCE = new AnalyticsRoutingKt();

    private AnalyticsRoutingKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AnalyticsRouting.Builder _builder;

        private Dsl(AnalyticsRouting.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ AnalyticsRouting _build() {
            AnalyticsRouting analyticsRoutingBuild = this._builder.build();
            x.e(analyticsRoutingBuild, "build(...)");
            return analyticsRoutingBuild;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AnalyticsRouting.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(AnalyticsRouting.Builder builder, o oVar) {
            this(builder);
        }
    }
}
