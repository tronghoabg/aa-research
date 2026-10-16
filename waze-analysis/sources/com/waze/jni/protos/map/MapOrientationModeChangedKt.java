package com.waze.jni.protos.map;

import com.waze.jni.protos.map.MapOrientationModeChanged;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapOrientationModeChangedKt {
    public static final MapOrientationModeChangedKt INSTANCE = new MapOrientationModeChangedKt();

    private MapOrientationModeChangedKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MapOrientationModeChanged.Builder _builder;

        private Dsl(MapOrientationModeChanged.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MapOrientationModeChanged _build() {
            MapOrientationModeChanged mapOrientationModeChangedBuild = this._builder.build();
            x.e(mapOrientationModeChangedBuild, "build(...)");
            return mapOrientationModeChangedBuild;
        }

        public final void clearOrientationMode() {
            this._builder.clearOrientationMode();
        }

        public final MapOrientationModeChanged.OrientationMode getOrientationMode() {
            MapOrientationModeChanged.OrientationMode orientationMode = this._builder.getOrientationMode();
            x.e(orientationMode, "getOrientationMode(...)");
            return orientationMode;
        }

        public final int getOrientationModeValue() {
            return this._builder.getOrientationModeValue();
        }

        public final void setOrientationMode(MapOrientationModeChanged.OrientationMode orientationMode) {
            x.f(orientationMode, "value");
            this._builder.setOrientationMode(orientationMode);
        }

        public final void setOrientationModeValue(int i2) {
            this._builder.setOrientationModeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MapOrientationModeChanged.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MapOrientationModeChanged.Builder builder, o oVar) {
            this(builder);
        }
    }
}
