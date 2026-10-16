package androidx.camera.camera2.pipe.compat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RetryingCameraStateOpenerKt {
    private static final long activeResumeCameraRetryDelayBase;
    private static final h.o.a[] activeResumeCameraRetryThresholds;
    private static final long activeResumeCameraRetryTimeout;
    private static final long defaultCameraRetryDelay;
    private static final long defaultCameraRetryTimeout;

    static {
        h.o.c cVar = h.o.a.f48264a;
        defaultCameraRetryTimeout = h.o.c.i(10, h.o.d.f48273d);
        activeResumeCameraRetryTimeout = h.o.c.i(30, h.o.d.f48274e);
        long jI = h.o.c.i(500, h.o.d.f48272c);
        defaultCameraRetryDelay = jI;
        activeResumeCameraRetryDelayBase = jI;
        activeResumeCameraRetryThresholds = new h.o.a[]{h.o.a.z(h.o.c.i(2, h.o.d.f48274e)), h.o.a.z(h.o.c.i(5, h.o.d.f48274e))};
    }
}
