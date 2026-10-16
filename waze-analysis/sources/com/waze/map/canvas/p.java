package com.waze.map.canvas;

import androidx.core.app.NotificationCompat;
import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.jni.protos.map.MapOrientationModeChanged;
import com.waze.jni.protos.map.canvas.MainCanvasStateChanged;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public abstract class p {
    public static final int $stable = 0;

    static final void onCanvasRemovedJNI$lambda$0(p pVar, String str) {
        h.g.b.x.d(pVar, "null cannot be cast to non-null type com.waze.map.canvas.CanvasNativeCallbacksBridge");
        ((CanvasNativeCallbacksBridge) pVar).onCanvasRemoved(str);
    }

    static final void onMainCanvasFallthroughClickEventJNI$lambda$0(p pVar, String str) {
        h.g.b.x.d(pVar, "null cannot be cast to non-null type com.waze.map.canvas.CanvasNativeCallbacksBridge");
        ((CanvasNativeCallbacksBridge) pVar).onMainCanvasFallthroughClickEvent(str);
    }

    static final void onMainCanvasOrientationChangedJNI$lambda$0(p pVar, String str, float f2) {
        h.g.b.x.d(pVar, "null cannot be cast to non-null type com.waze.map.canvas.CanvasNativeCallbacksBridge");
        ((CanvasNativeCallbacksBridge) pVar).onMainCanvasOrientationChanged(str, f2);
    }

    static final void onMainCanvasOrientationModeChangedJNI$lambda$0(p pVar, String str, MapOrientationModeChanged mapOrientationModeChanged) {
        h.g.b.x.d(pVar, "null cannot be cast to non-null type com.waze.map.canvas.CanvasNativeCallbacksBridge");
        h.g.b.x.c(mapOrientationModeChanged);
        ((CanvasNativeCallbacksBridge) pVar).onMainCanvasOrientationModeChanged(str, mapOrientationModeChanged);
    }

    static final void onMainCanvasStateChangedJNI$lambda$0(p pVar, MainCanvasStateChanged mainCanvasStateChanged) {
        h.g.b.x.d(pVar, "null cannot be cast to non-null type com.waze.map.canvas.CanvasNativeCallbacksBridge");
        h.g.b.x.c(mainCanvasStateChanged);
        ((CanvasNativeCallbacksBridge) pVar).onMainCanvasStateChanged(mainCanvasStateChanged);
    }

    public abstract void onCanvasRemoved(String str);

    protected final void onCanvasRemovedJNI(String str) {
        h.g.b.x.f(str, "canvasId");
        NativeManager.runMainThreadTask(new b(this, str, 3));
    }

    public abstract void onMainCanvasFallthroughClickEvent(String str);

    protected final void onMainCanvasFallthroughClickEventJNI(String str) {
        h.g.b.x.f(str, "canvasId");
        NativeManager.runMainThreadTask(new b(this, str, 2));
    }

    public abstract void onMainCanvasOrientationChanged(String str, float f2);

    protected final void onMainCanvasOrientationChangedJNI(final String str, final float f2) {
        h.g.b.x.f(str, "canvasId");
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.map.canvas.o
            @Override // java.lang.Runnable
            public final void run() {
                p.onMainCanvasOrientationChangedJNI$lambda$0(this.f28651a, str, f2);
            }
        });
    }

    public abstract void onMainCanvasOrientationModeChanged(String str, MapOrientationModeChanged mapOrientationModeChanged);

    protected final void onMainCanvasOrientationModeChangedJNI(String str, byte[] bArr) {
        h.g.b.x.f(str, "canvasId");
        h.g.b.x.f(bArr, NotificationCompat.CATEGORY_EVENT);
        try {
            NativeManager.runMainThreadTask(new i(this, str, (MapOrientationModeChanged) MapOrientationModeChanged.parser().c(bArr), 2));
        } catch (eu unused) {
        }
    }

    public abstract void onMainCanvasStateChanged(MainCanvasStateChanged mainCanvasStateChanged);

    protected final void onMainCanvasStateChangedJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "details");
        try {
            NativeManager.runMainThreadTask(new b(this, (MainCanvasStateChanged) MainCanvasStateChanged.parser().c(bArr), 4));
        } catch (eu unused) {
        }
    }
}
