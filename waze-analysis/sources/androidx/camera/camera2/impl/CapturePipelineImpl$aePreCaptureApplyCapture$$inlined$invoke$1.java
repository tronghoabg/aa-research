package androidx.camera.camera2.impl;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ int $captureMode$inlined;
    final /* synthetic */ List $captureSignal;
    Object L$0;
    int label;
    final /* synthetic */ CapturePipelineImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1(List list, e eVar, CapturePipelineImpl capturePipelineImpl, int i2) {
        super(2, eVar);
        this.$captureSignal = list;
        this.this$0 = capturePipelineImpl;
        this.$captureMode$inlined = i2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1(this.$captureSignal, eVar, this.this$0, this.$captureMode$inlined);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:31:0x0089, B:33:0x0094, B:34:0x009d, B:38:0x00a3), top: B:53:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6 A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #1 {all -> 0x001a, blocks: (B:8:0x0015, B:41:0x00ae, B:43:0x00b6), top: B:55:0x0015 }] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.String r5 = "CXCP"
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L29
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r8 = r8.L$0
            java.lang.AutoCloseable r8 = (java.lang.AutoCloseable) r8
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L1a
            goto Lae
        L1a:
            r9 = move-exception
            goto Lca
        L1d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L25:
            e.b.c.b(r9)
            goto L87
        L29:
            e.b.c.b(r9)
            goto L52
        L2d:
            e.b.c.b(r9)
            androidx.camera.camera2.impl.Camera2Logger r9 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r9 = androidx.camera.core.Logger.isDebugEnabled(r5)
            if (r9 == 0) goto L41
            java.lang.String r9 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal"
            android.util.Log.d(r9, r1)
        L41:
            java.util.List r9 = r8.$captureSignal
            java.util.Collection r9 = (java.util.Collection) r9
            r1 = r8
            h.c.e r1 = (h.c.e) r1
            r8.label = r4
            java.lang.Object r9 = kotlinx.coroutines.aj.E(r9, r1)
            if (r9 != r0) goto L52
            goto Ld0
        L52:
            androidx.camera.camera2.impl.Camera2Logger r9 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r9 = androidx.camera.core.Logger.isDebugEnabled(r5)
            if (r9 == 0) goto L63
            java.lang.String r9 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal done"
            android.util.Log.d(r9, r1)
        L63:
            r9 = r8
            h.c.e r9 = (h.c.e) r9
            boolean r9 = androidx.camera.core.Logger.isDebugEnabled(r5)
            if (r9 == 0) goto L75
            java.lang.String r9 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "CapturePipeline#aePreCaptureApplyCapture: Acquiring session for unlocking 3A"
            android.util.Log.d(r9, r1)
        L75:
            androidx.camera.camera2.impl.CapturePipelineImpl r9 = r8.this$0
            androidx.camera.camera2.config.UseCaseCameraContext r9 = androidx.camera.camera2.impl.CapturePipelineImpl.access$getUseCaseCameraContext$p(r9)
            androidx.camera.camera2.pipe.CameraGraph r9 = r9.getGraph()
            r8.label = r3
            java.lang.Object r9 = r9.acquireSession(r8)
            if (r9 == r0) goto Ld0
        L87:
            java.lang.AutoCloseable r9 = (java.lang.AutoCloseable) r9
            r1 = r9
            androidx.camera.camera2.pipe.CameraGraph$Session r1 = (androidx.camera.camera2.pipe.CameraGraph.Session) r1     // Catch: java.lang.Throwable -> Lc6
            androidx.camera.camera2.impl.Camera2Logger r3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE     // Catch: java.lang.Throwable -> Lc6
            boolean r3 = androidx.camera.core.Logger.isDebugEnabled(r5)     // Catch: java.lang.Throwable -> Lc6
            if (r3 == 0) goto L9d
            java.lang.String r3 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = "CapturePipeline#aePreCaptureApplyCapture: Unlocking 3A"
            android.util.Log.d(r3, r6)     // Catch: java.lang.Throwable -> Lc6
        L9d:
            int r3 = r8.$captureMode$inlined     // Catch: java.lang.Throwable -> Lc6
            if (r3 != 0) goto La2
            goto La3
        La2:
            r4 = 0
        La3:
            r8.L$0 = r9     // Catch: java.lang.Throwable -> Lc6
            r8.label = r2     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r8 = r1.unlock3APostCapture(r4, r8)     // Catch: java.lang.Throwable -> Lc6
            if (r8 == r0) goto Ld0
            r8 = r9
        Lae:
            androidx.camera.camera2.impl.Camera2Logger r9 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE     // Catch: java.lang.Throwable -> L1a
            boolean r9 = androidx.camera.core.Logger.isDebugEnabled(r5)     // Catch: java.lang.Throwable -> L1a
            if (r9 == 0) goto Lbf
            java.lang.String r9 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = "CapturePipeline#aePreCaptureApplyCapture: Unlocking 3A done"
            android.util.Log.d(r9, r0)     // Catch: java.lang.Throwable -> L1a
        Lbf:
            r9 = 0
            h.a.r.y(r8, r9)
            h.ab r8 = h.ab.f48028a
            return r8
        Lc6:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        Lca:
            throw r9     // Catch: java.lang.Throwable -> Lcb
        Lcb:
            r0 = move-exception
            h.a.r.y(r8, r9)
            throw r0
        Ld0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
