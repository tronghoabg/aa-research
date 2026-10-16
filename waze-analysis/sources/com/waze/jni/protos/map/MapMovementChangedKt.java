package com.waze.jni.protos.map;

import com.waze.jni.protos.map.MapMovementChanged;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapMovementChangedKt {
    public static final MapMovementChangedKt INSTANCE = new MapMovementChangedKt();

    private MapMovementChangedKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MapMovementChanged.Builder _builder;

        private Dsl(MapMovementChanged.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MapMovementChanged _build() {
            MapMovementChanged mapMovementChangedBuild = this._builder.build();
            x.e(mapMovementChangedBuild, "build(...)");
            return mapMovementChangedBuild;
        }

        public final void clearNewState() {
            this._builder.clearNewState();
        }

        public final MapMovementChanged.MapMovementState getNewState() {
            MapMovementChanged.MapMovementState newState = this._builder.getNewState();
            x.e(newState, "getNewState(...)");
            return newState;
        }

        public final int getNewStateValue() {
            return this._builder.getNewStateValue();
        }

        public final void setNewState(MapMovementChanged.MapMovementState mapMovementState) {
            x.f(mapMovementState, "value");
            this._builder.setNewState(mapMovementState);
        }

        public final void setNewStateValue(int i2) {
            this._builder.setNewStateValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MapMovementChanged.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MapMovementChanged.Builder builder, o oVar) {
            this(builder);
        }
    }
}
