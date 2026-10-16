package com.waze.jni.protos.map;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.Marker;
import com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignment;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RouteEtaLabelPositionAndAlignmentKt {
    public static final RouteEtaLabelPositionAndAlignmentKt INSTANCE = new RouteEtaLabelPositionAndAlignmentKt();

    private RouteEtaLabelPositionAndAlignmentKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RouteEtaLabelPositionAndAlignment.Builder _builder;

        private Dsl(RouteEtaLabelPositionAndAlignment.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RouteEtaLabelPositionAndAlignment _build() {
            RouteEtaLabelPositionAndAlignment routeEtaLabelPositionAndAlignmentBuild = this._builder.build();
            x.e(routeEtaLabelPositionAndAlignmentBuild, "build(...)");
            return routeEtaLabelPositionAndAlignmentBuild;
        }

        public final void clearAlignment() {
            this._builder.clearAlignment();
        }

        public final void clearPolylineId() {
            this._builder.clearPolylineId();
        }

        public final void clearPosition() {
            this._builder.clearPosition();
        }

        public final Marker.Alignment getAlignment() {
            Marker.Alignment alignment = this._builder.getAlignment();
            x.e(alignment, "getAlignment(...)");
            return alignment;
        }

        public final int getAlignmentValue() {
            return this._builder.getAlignmentValue();
        }

        public final long getPolylineId() {
            return this._builder.getPolylineId();
        }

        public final Position.IntPosition getPosition() {
            Position.IntPosition position = this._builder.getPosition();
            x.e(position, "getPosition(...)");
            return position;
        }

        public final Position.IntPosition getPositionOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return RouteEtaLabelPositionAndAlignmentKtKt.getPositionOrNull(dsl._builder);
        }

        public final boolean hasPosition() {
            return this._builder.hasPosition();
        }

        public final void setAlignment(Marker.Alignment alignment) {
            x.f(alignment, "value");
            this._builder.setAlignment(alignment);
        }

        public final void setAlignmentValue(int i2) {
            this._builder.setAlignmentValue(i2);
        }

        public final void setPolylineId(long j2) {
            this._builder.setPolylineId(j2);
        }

        public final void setPosition(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setPosition(intPosition);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RouteEtaLabelPositionAndAlignment.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(RouteEtaLabelPositionAndAlignment.Builder builder, o oVar) {
            this(builder);
        }
    }
}
