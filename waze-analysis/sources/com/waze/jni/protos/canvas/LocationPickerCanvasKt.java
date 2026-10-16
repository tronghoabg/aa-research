package com.waze.jni.protos.canvas;

import com.waze.jni.protos.canvas.LocationPickerCanvas;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LocationPickerCanvasKt {
    public static final LocationPickerCanvasKt INSTANCE = new LocationPickerCanvasKt();

    private LocationPickerCanvasKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final LocationPickerCanvas.Builder _builder;

        private Dsl(LocationPickerCanvas.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ LocationPickerCanvas _build() {
            LocationPickerCanvas locationPickerCanvasBuild = this._builder.build();
            x.e(locationPickerCanvasBuild, "build(...)");
            return locationPickerCanvasBuild;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(LocationPickerCanvas.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(LocationPickerCanvas.Builder builder, o oVar) {
            this(builder);
        }
    }
}
