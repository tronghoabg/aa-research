package androidx.camera.camera2.pipe.compat;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2 extends h.c.b.a.g implements p<af, h.c.e<? super AwaitOpenCameraResult>, Object> {
    final /* synthetic */ Camera2DeviceCloser $camera2DeviceCloser;
    final /* synthetic */ String $cameraId;
    Object L$0;
    int label;
    final /* synthetic */ RetryingCameraStateOpenerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2(RetryingCameraStateOpenerImpl retryingCameraStateOpenerImpl, String str, Camera2DeviceCloser camera2DeviceCloser, h.c.e<? super RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2> eVar) {
        super(2, eVar);
        this.this$0 = retryingCameraStateOpenerImpl;
        this.$cameraId = str;
        this.$camera2DeviceCloser = camera2DeviceCloser;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2(this.this$0, this.$cameraId, this.$camera2DeviceCloser, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super AwaitOpenCameraResult> eVar) {
        return ((RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            java.lang.String r3 = "!"
            java.lang.String r4 = "Failed to open "
            r5 = 2
            r6 = 1
            java.lang.String r7 = "CXCP"
            r8 = 0
            if (r2 == 0) goto L2d
            if (r2 == r6) goto L27
            if (r2 != r5) goto L1f
            java.lang.Object r1 = r0.L$0
            androidx.camera.camera2.pipe.compat.AndroidCameraState r1 = (androidx.camera.camera2.pipe.compat.AndroidCameraState) r1
            e.b.c.b(r18)
            r5 = r18
            goto L84
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L27:
            e.b.c.b(r18)
            r2 = r18
            goto L4a
        L2d:
            e.b.c.b(r18)
            androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl r2 = r0.this$0
            java.lang.String r10 = r0.$cameraId
            androidx.camera.camera2.pipe.compat.Camera2DeviceCloser r11 = r0.$camera2DeviceCloser
            r9 = r2
            androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener r9 = (androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener) r9
            r14 = r0
            h.c.e r14 = (h.c.e) r14
            r0.label = r6
            r15 = 12
            r16 = 0
            r12 = 0
            r13 = 0
            java.lang.Object r2 = androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener.CC.m1093openCameraWithRetryzDSwpeU$default(r9, r10, r11, r12, r13, r14, r15, r16)
            if (r2 == r1) goto Lc2
        L4a:
            androidx.camera.camera2.pipe.compat.OpenCameraResult r2 = (androidx.camera.camera2.pipe.compat.OpenCameraResult) r2
            androidx.camera.camera2.pipe.compat.AndroidCameraState r2 = r2.getCameraState()
            if (r2 != 0) goto L69
            java.lang.String r0 = r0.$cameraId
            androidx.camera.camera2.pipe.core.Log r1 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r1 = r1.getERROR_LOGGABLE()
            if (r1 == 0) goto L63
            java.lang.String r0 = androidx.camera.camera2.pipe.compat.d.a(r0, r4, r3)
            android.util.Log.e(r7, r0)
        L63:
            androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult r0 = new androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult
            r0.<init>(r8, r8)
            return r0
        L69:
            kotlinx.coroutines.b.ch r6 = r2.getState()
            kotlinx.coroutines.b.k r6 = (kotlinx.coroutines.b.k) r6
            androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1 r9 = new androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1
            r9.<init>(r8)
            h.g.a.p r9 = (h.g.a.p) r9
            r10 = r0
            h.c.e r10 = (h.c.e) r10
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r5 = kotlinx.coroutines.b.ai.i(r6, r9, r10)
            if (r5 == r1) goto Lc2
            r1 = r2
        L84:
            androidx.camera.camera2.pipe.compat.CameraState r5 = (androidx.camera.camera2.pipe.compat.CameraState) r5
            boolean r2 = r5 instanceof androidx.camera.camera2.pipe.compat.CameraStateOpen
            java.lang.String r0 = r0.$cameraId
            if (r2 == 0) goto Lad
            androidx.camera.camera2.pipe.core.Log r2 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r2 = r2.getINFO_LOGGABLE()
            if (r2 == 0) goto La1
            java.lang.String r0 = androidx.camera.camera2.pipe.CameraId.m552toStringimpl(r0)
            java.lang.String r2 = " opened successfully."
            java.lang.String r0 = r0.concat(r2)
            android.util.Log.i(r7, r0)
        La1:
            androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult r0 = new androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult
            androidx.camera.camera2.pipe.compat.CameraStateOpen r5 = (androidx.camera.camera2.pipe.compat.CameraStateOpen) r5
            androidx.camera.camera2.pipe.compat.CameraDeviceWrapper r2 = r5.getCameraDevice()
            r0.<init>(r2, r1)
            return r0
        Lad:
            androidx.camera.camera2.pipe.core.Log r1 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r1 = r1.getERROR_LOGGABLE()
            if (r1 == 0) goto Lbc
            java.lang.String r0 = androidx.camera.camera2.pipe.compat.d.a(r0, r4, r3)
            android.util.Log.e(r7, r0)
        Lbc:
            androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult r0 = new androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult
            r0.<init>(r8, r8)
            return r0
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
