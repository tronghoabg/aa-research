package androidx.camera.core;

import androidx.tracing.Trace;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraXTracer {
    public static final CameraXTracer INSTANCE = new CameraXTracer();

    private CameraXTracer() {
    }

    public final <T> T trace(String str, a<? extends T> aVar) {
        x.f(str, "label");
        x.f(aVar, "block");
        Trace.beginSection("CX:".concat(String.valueOf(str)));
        try {
            return aVar.invoke();
        } finally {
            Trace.endSection();
        }
    }

    public static final void trace(String str, Runnable runnable) {
        x.f(str, "label");
        x.f(runnable, "block");
        Trace.beginSection("CX:".concat(String.valueOf(str)));
        try {
            runnable.run();
        } finally {
            Trace.endSection();
        }
    }
}
