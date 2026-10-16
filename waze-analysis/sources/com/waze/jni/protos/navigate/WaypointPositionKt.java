package com.waze.jni.protos.navigate;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.navigate.WaypointPosition;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WaypointPositionKt {
    public static final WaypointPositionKt INSTANCE = new WaypointPositionKt();

    private WaypointPositionKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final WaypointPosition.Builder _builder;

        private Dsl(WaypointPosition.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ WaypointPosition _build() {
            WaypointPosition waypointPositionBuild = this._builder.build();
            x.e(waypointPositionBuild, "build(...)");
            return waypointPositionBuild;
        }

        public final void clearPosition() {
            this._builder.clearPosition();
        }

        public final Position.IntPosition getPosition() {
            Position.IntPosition position = this._builder.getPosition();
            x.e(position, "getPosition(...)");
            return position;
        }

        public final Position.IntPosition getPositionOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return WaypointPositionKtKt.getPositionOrNull(dsl._builder);
        }

        public final boolean hasPosition() {
            return this._builder.hasPosition();
        }

        public final void setPosition(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setPosition(intPosition);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(WaypointPosition.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(WaypointPosition.Builder builder, o oVar) {
            this(builder);
        }
    }
}
