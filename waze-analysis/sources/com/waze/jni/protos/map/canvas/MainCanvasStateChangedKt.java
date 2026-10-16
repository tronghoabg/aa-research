package com.waze.jni.protos.map.canvas;

import com.waze.jni.protos.map.canvas.MainCanvasStateChanged;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MainCanvasStateChangedKt {
    public static final MainCanvasStateChangedKt INSTANCE = new MainCanvasStateChangedKt();

    private MainCanvasStateChangedKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MainCanvasStateChanged.Builder _builder;

        private Dsl(MainCanvasStateChanged.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MainCanvasStateChanged _build() {
            MainCanvasStateChanged mainCanvasStateChangedBuild = this._builder.build();
            x.e(mainCanvasStateChangedBuild, "build(...)");
            return mainCanvasStateChangedBuild;
        }

        public final void clearCameraState() {
            this._builder.clearCameraState();
        }

        public final void clearCanvasId() {
            this._builder.clearCanvasId();
        }

        public final MainCanvasCameraStateProto getCameraState() {
            MainCanvasCameraStateProto cameraState = this._builder.getCameraState();
            x.e(cameraState, "getCameraState(...)");
            return cameraState;
        }

        public final int getCameraStateValue() {
            return this._builder.getCameraStateValue();
        }

        public final String getCanvasId() {
            String canvasId = this._builder.getCanvasId();
            x.e(canvasId, "getCanvasId(...)");
            return canvasId;
        }

        public final void setCameraState(MainCanvasCameraStateProto mainCanvasCameraStateProto) {
            x.f(mainCanvasCameraStateProto, "value");
            this._builder.setCameraState(mainCanvasCameraStateProto);
        }

        public final void setCameraStateValue(int i2) {
            this._builder.setCameraStateValue(i2);
        }

        public final void setCanvasId(String str) {
            x.f(str, "value");
            this._builder.setCanvasId(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MainCanvasStateChanged.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MainCanvasStateChanged.Builder builder, o oVar) {
            this(builder);
        }
    }
}
