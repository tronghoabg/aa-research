package com.waze.jni.protos.navigate;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.navigate.RoutingRequestParams;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RoutingRequestParamsKt {
    public static final RoutingRequestParamsKt INSTANCE = new RoutingRequestParamsKt();

    private RoutingRequestParamsKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RoutingRequestParams.Builder _builder;

        private Dsl(RoutingRequestParams.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RoutingRequestParams _build() {
            RoutingRequestParams routingRequestParamsBuild = this._builder.build();
            x.e(routingRequestParamsBuild, "build(...)");
            return routingRequestParamsBuild;
        }

        public final void clearDestination() {
            this._builder.clearDestination();
        }

        public final void clearOrigin() {
            this._builder.clearOrigin();
        }

        public final Position.IntPosition getDestination() {
            Position.IntPosition destination = this._builder.getDestination();
            x.e(destination, "getDestination(...)");
            return destination;
        }

        public final Position.IntPosition getDestinationOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return RoutingRequestParamsKtKt.getDestinationOrNull(dsl._builder);
        }

        public final Position.IntPosition getOrigin() {
            Position.IntPosition origin = this._builder.getOrigin();
            x.e(origin, "getOrigin(...)");
            return origin;
        }

        public final Position.IntPosition getOriginOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return RoutingRequestParamsKtKt.getOriginOrNull(dsl._builder);
        }

        public final boolean hasDestination() {
            return this._builder.hasDestination();
        }

        public final boolean hasOrigin() {
            return this._builder.hasOrigin();
        }

        public final void setDestination(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setDestination(intPosition);
        }

        public final void setOrigin(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setOrigin(intPosition);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RoutingRequestParams.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(RoutingRequestParams.Builder builder, o oVar) {
            this(builder);
        }
    }
}
