package com.waze.jni.protos.map;

import com.waze.jni.protos.map.RouteOption;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RouteOptionKt {
    public static final RouteOptionKt INSTANCE = new RouteOptionKt();

    private RouteOptionKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RouteOption.Builder _builder;

        private Dsl(RouteOption.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RouteOption _build() {
            RouteOption routeOptionBuild = this._builder.build();
            x.e(routeOptionBuild, "build(...)");
            return routeOptionBuild;
        }

        public final void clearShowTraffic() {
            this._builder.clearShowTraffic();
        }

        public final void clearSnailTrailBehavior() {
            this._builder.clearSnailTrailBehavior();
        }

        public final boolean getShowTraffic() {
            return this._builder.getShowTraffic();
        }

        public final RouteOption.SnailTrailBehavior getSnailTrailBehavior() {
            RouteOption.SnailTrailBehavior snailTrailBehavior = this._builder.getSnailTrailBehavior();
            x.e(snailTrailBehavior, "getSnailTrailBehavior(...)");
            return snailTrailBehavior;
        }

        public final int getSnailTrailBehaviorValue() {
            return this._builder.getSnailTrailBehaviorValue();
        }

        public final void setShowTraffic(boolean z) {
            this._builder.setShowTraffic(z);
        }

        public final void setSnailTrailBehavior(RouteOption.SnailTrailBehavior snailTrailBehavior) {
            x.f(snailTrailBehavior, "value");
            this._builder.setSnailTrailBehavior(snailTrailBehavior);
        }

        public final void setSnailTrailBehaviorValue(int i2) {
            this._builder.setSnailTrailBehaviorValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RouteOption.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(RouteOption.Builder builder, o oVar) {
            this(builder);
        }
    }
}
