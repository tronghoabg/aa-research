package androidx.camera.camera2.impl;

import androidx.camera.camera2.impl.StillCaptureRequestControl;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class StillCaptureRequestControl$propagateResultOrEnqueueRequest$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ UseCaseCameraRequestControl $currentRequestControl;
    final /* synthetic */ StillCaptureRequestControl.CaptureRequest $submittedRequest;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ StillCaptureRequestControl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StillCaptureRequestControl$propagateResultOrEnqueueRequest$1$1(StillCaptureRequestControl stillCaptureRequestControl, UseCaseCameraRequestControl useCaseCameraRequestControl, StillCaptureRequestControl.CaptureRequest captureRequest, e<? super StillCaptureRequestControl$propagateResultOrEnqueueRequest$1$1> eVar) {
        super(2, eVar);
        this.this$0 = stillCaptureRequestControl;
        this.$currentRequestControl = useCaseCameraRequestControl;
        this.$submittedRequest = captureRequest;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new StillCaptureRequestControl$propagateResultOrEnqueueRequest$1$1(this.this$0, this.$currentRequestControl, this.$submittedRequest, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((StillCaptureRequestControl$propagateResultOrEnqueueRequest$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[PHI: r6
  0x0075: PHI (r6v1 h.g.b.am) = (r6v0 h.g.b.am), (r6v0 h.g.b.am), (r6v2 h.g.b.am) binds: [B:11:0x004a, B:13:0x0056, B:18:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r8.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r0 = r8.L$2
            androidx.camera.camera2.impl.StillCaptureRequestControl$CaptureRequest r0 = (androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest) r0
            java.lang.Object r1 = r8.L$1
            androidx.camera.camera2.impl.StillCaptureRequestControl r1 = (androidx.camera.camera2.impl.StillCaptureRequestControl) r1
            java.lang.Object r2 = r8.L$0
            kotlinx.coroutines.h.a r2 = (kotlinx.coroutines.h.a) r2
            e.b.c.b(r9)
            goto L96
        L1e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L26:
            java.lang.Object r1 = r8.L$3
            androidx.camera.camera2.impl.StillCaptureRequestControl r1 = (androidx.camera.camera2.impl.StillCaptureRequestControl) r1
            java.lang.Object r3 = r8.L$2
            androidx.camera.camera2.impl.UseCaseCameraRequestControl r3 = (androidx.camera.camera2.impl.UseCaseCameraRequestControl) r3
            java.lang.Object r5 = r8.L$1
            androidx.camera.camera2.impl.StillCaptureRequestControl$CaptureRequest r5 = (androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest) r5
            java.lang.Object r6 = r8.L$0
            h.g.b.am r6 = (h.g.b.am) r6
            e.b.c.b(r9)
            goto L6d
        L3a:
            e.b.c.b(r9)
            h.g.b.am r6 = new h.g.b.am
            r6.<init>()
            r6.f48101a = r3
            androidx.camera.camera2.impl.StillCaptureRequestControl r9 = r8.this$0
            androidx.camera.camera2.impl.UseCaseCameraRequestControl r9 = r9.getRequestControl()
            if (r9 == 0) goto L75
            androidx.camera.camera2.impl.UseCaseCameraRequestControl r1 = r8.$currentRequestControl
            androidx.camera.camera2.impl.StillCaptureRequestControl r5 = r8.this$0
            androidx.camera.camera2.impl.StillCaptureRequestControl$CaptureRequest r7 = r8.$submittedRequest
            boolean r1 = h.g.b.x.n(r1, r9)
            if (r1 != 0) goto L75
            r8.L$0 = r6
            r8.L$1 = r7
            r8.L$2 = r9
            r8.L$3 = r5
            r8.label = r3
            java.lang.Object r1 = androidx.camera.camera2.impl.StillCaptureRequestControl.access$submitRequest(r5, r7, r9, r8)
            if (r1 != r0) goto L69
            goto Lcc
        L69:
            r3 = r9
            r9 = r1
            r1 = r5
            r5 = r7
        L6d:
            kotlinx.coroutines.am r9 = (kotlinx.coroutines.am) r9
            androidx.camera.camera2.impl.StillCaptureRequestControl.access$propagateResultOrEnqueueRequest(r1, r9, r5, r3)
            r9 = 0
            r6.f48101a = r9
        L75:
            boolean r9 = r6.f48101a
            if (r9 == 0) goto Lcd
            androidx.camera.camera2.impl.StillCaptureRequestControl r1 = r8.this$0
            androidx.camera.camera2.impl.StillCaptureRequestControl$CaptureRequest r9 = r8.$submittedRequest
            kotlinx.coroutines.h.a r3 = androidx.camera.camera2.impl.StillCaptureRequestControl.access$getMutex$p(r1)
            r5 = r8
            h.c.e r5 = (h.c.e) r5
            r8.L$0 = r3
            r8.L$1 = r1
            r8.L$2 = r9
            r8.L$3 = r4
            r8.label = r2
            java.lang.Object r2 = r3.lock(r4, r5)
            if (r2 == r0) goto Lcc
            r0 = r9
            r2 = r3
        L96:
            java.util.LinkedList r9 = androidx.camera.camera2.impl.StillCaptureRequestControl.access$getPendingRequests$p(r1)     // Catch: java.lang.Throwable -> Lc7
            r9.add(r0)     // Catch: java.lang.Throwable -> Lc7
            r2.unlock(r4)
            androidx.camera.camera2.impl.Camera2Logger r9 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            androidx.camera.camera2.impl.StillCaptureRequestControl$CaptureRequest r8 = r8.$submittedRequest
            java.lang.String r9 = "CXCP"
            boolean r9 = androidx.camera.core.Logger.isDebugEnabled(r9)
            if (r9 == 0) goto Lcd
            java.lang.String r9 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StillCaptureRequestControl: failed to submit "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = ", will be retried with a future UseCaseCamera"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            android.util.Log.d(r9, r8)
            goto Lcd
        Lc7:
            r8 = move-exception
            r2.unlock(r4)
            throw r8
        Lcc:
            return r0
        Lcd:
            h.ab r8 = h.ab.f48028a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.StillCaptureRequestControl$propagateResultOrEnqueueRequest$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
