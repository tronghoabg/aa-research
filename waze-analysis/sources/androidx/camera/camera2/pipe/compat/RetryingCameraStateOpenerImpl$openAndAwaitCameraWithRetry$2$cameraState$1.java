package androidx.camera.camera2.pipe.compat;

import h.ab;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1 extends h.c.b.a.g implements p<CameraState, h.c.e<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1(h.c.e<? super RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1> eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1 retryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1 = new RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1(eVar);
        retryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1.L$0 = obj;
        return retryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1;
    }

    @Override // h.g.a.p
    public final Object invoke(CameraState cameraState, h.c.e<? super Boolean> eVar) {
        return ((RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1) create(cameraState, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.b.c.b(obj);
        return Boolean.valueOf(!x.n((CameraState) this.L$0, CameraStateUnopened.INSTANCE));
    }
}
