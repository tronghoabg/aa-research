package androidx.camera.camera2.pipe.compat;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraStateOpener$tryOpenCamera$2$cameraOpenCancelJob$1 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
    int label;
    final /* synthetic */ CameraStateOpener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraStateOpener$tryOpenCamera$2$cameraOpenCancelJob$1(CameraStateOpener cameraStateOpener, h.c.e<? super CameraStateOpener$tryOpenCamera$2$cameraOpenCancelJob$1> eVar) {
        super(2, eVar);
        this.this$0 = cameraStateOpener;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new CameraStateOpener$tryOpenCamera$2$cameraOpenCancelJob$1(this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
        return ((CameraStateOpener$tryOpenCamera$2$cameraOpenCancelJob$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (kotlinx.coroutines.aj.r(androidx.camera.camera2.pipe.compat.CameraStateOpener.Companion.m1075getCAMERA_OPEN_CANCEL_TIMEOUTUwyO8pc(), r5) != r0) goto L15;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            e.b.c.b(r6)
            goto L44
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L18:
            e.b.c.b(r6)
            goto L31
        L1c:
            e.b.c.b(r6)
            androidx.camera.camera2.pipe.compat.CameraStateOpener r6 = r5.this$0
            kotlinx.coroutines.CompletableDeferred r6 = androidx.camera.camera2.pipe.compat.CameraStateOpener.access$getCameraOpenCancelled$p(r6)
            r1 = r5
            h.c.e r1 = (h.c.e) r1
            r5.label = r3
            java.lang.Object r6 = r6.c(r1)
            if (r6 != r0) goto L31
            goto L47
        L31:
            androidx.camera.camera2.pipe.compat.CameraStateOpener$Companion r6 = androidx.camera.camera2.pipe.compat.CameraStateOpener.access$getCompanion$p()
            long r3 = r6.m1075getCAMERA_OPEN_CANCEL_TIMEOUTUwyO8pc()
            r6 = r5
            h.c.e r6 = (h.c.e) r6
            r5.label = r2
            java.lang.Object r5 = kotlinx.coroutines.aj.r(r3, r6)
            if (r5 == r0) goto L47
        L44:
            h.ab r5 = h.ab.f48028a
            return r5
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$cameraOpenCancelJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
