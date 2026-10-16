package androidx.camera.camera2.pipe.compat;

import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1$2 extends h.c.b.a.g implements l<h.c.e<? super Boolean>, Object> {
    int label;

    Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1$2(h.c.e<? super Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1$2> eVar) {
        super(1, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(h.c.e<?> eVar) {
        return new Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1$2(eVar);
    }

    @Override // h.g.a.l
    public final Object invoke(h.c.e<? super Boolean> eVar) {
        return ((Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1$2) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.b.c.b(obj);
        return false;
    }
}
