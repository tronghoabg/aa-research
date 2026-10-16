package com.waze.jni.protos.map;

import com.waze.jni.protos.map.ZoomLevelDisplayRange;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ZoomLevelDisplayRangeKt {
    public static final ZoomLevelDisplayRangeKt INSTANCE = new ZoomLevelDisplayRangeKt();

    private ZoomLevelDisplayRangeKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ZoomLevelDisplayRange.Builder _builder;

        private Dsl(ZoomLevelDisplayRange.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ZoomLevelDisplayRange _build() {
            ZoomLevelDisplayRange zoomLevelDisplayRangeBuild = this._builder.build();
            x.e(zoomLevelDisplayRangeBuild, "build(...)");
            return zoomLevelDisplayRangeBuild;
        }

        public final void clearMaxZoomLevel() {
            this._builder.clearMaxZoomLevel();
        }

        public final void clearMinZoomLevel() {
            this._builder.clearMinZoomLevel();
        }

        public final float getMaxZoomLevel() {
            return this._builder.getMaxZoomLevel();
        }

        public final float getMinZoomLevel() {
            return this._builder.getMinZoomLevel();
        }

        public final void setMaxZoomLevel(float f2) {
            this._builder.setMaxZoomLevel(f2);
        }

        public final void setMinZoomLevel(float f2) {
            this._builder.setMinZoomLevel(f2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ZoomLevelDisplayRange.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(ZoomLevelDisplayRange.Builder builder, o oVar) {
            this(builder);
        }
    }
}
