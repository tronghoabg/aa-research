package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.internal.CriticalCameraErrorListener;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2ErrorProcessor_Factory implements c.b.c<Camera2ErrorProcessor> {
    private final c.b.e<CriticalCameraErrorListener> criticalCameraErrorListenerProvider;

    private Camera2ErrorProcessor_Factory(c.b.e<CriticalCameraErrorListener> eVar) {
        this.criticalCameraErrorListenerProvider = eVar;
    }

    public static Camera2ErrorProcessor_Factory create(c.b.e<CriticalCameraErrorListener> eVar) {
        return new Camera2ErrorProcessor_Factory(eVar);
    }

    public static Camera2ErrorProcessor newInstance(g.a.a<CriticalCameraErrorListener> aVar) {
        return new Camera2ErrorProcessor(aVar);
    }

    @Override // g.a.a, f.a.a
    public Camera2ErrorProcessor get() {
        return newInstance(this.criticalCameraErrorListenerProvider);
    }
}
