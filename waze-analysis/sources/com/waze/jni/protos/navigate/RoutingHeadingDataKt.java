package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.RoutingHeadingData;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RoutingHeadingDataKt {
    public static final RoutingHeadingDataKt INSTANCE = new RoutingHeadingDataKt();

    private RoutingHeadingDataKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RoutingHeadingData.Builder _builder;

        private Dsl(RoutingHeadingData.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RoutingHeadingData _build() {
            RoutingHeadingData routingHeadingDataBuild = this._builder.build();
            x.e(routingHeadingDataBuild, "build(...)");
            return routingHeadingDataBuild;
        }

        public final void clearHasStableHeading() {
            this._builder.clearHasStableHeading();
        }

        public final boolean getHasStableHeading() {
            return this._builder.getHasStableHeading();
        }

        public final boolean hasHasStableHeading() {
            return this._builder.hasHasStableHeading();
        }

        public final void setHasStableHeading(boolean z) {
            this._builder.setHasStableHeading(z);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RoutingHeadingData.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(RoutingHeadingData.Builder builder, o oVar) {
            this(builder);
        }
    }
}
