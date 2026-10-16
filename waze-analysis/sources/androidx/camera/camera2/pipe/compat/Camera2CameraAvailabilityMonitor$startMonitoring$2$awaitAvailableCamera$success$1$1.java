package androidx.camera.camera2.pipe.compat;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1$1 extends h.c.b.a.g implements p<ab, h.c.e<? super Boolean>, Object> {
    int label;

    Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1$1(h.c.e<? super Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1$1> eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1$1(eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(ab abVar, h.c.e<? super Boolean> eVar) {
        return ((Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1$1) create(abVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.b.c.b(obj);
        return true;
    }
}
