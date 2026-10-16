package androidx.camera.camera2.impl;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CapturePipelineImpl$defaultNoFlashCapture$$inlined$invoke$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ List $captureSignal;
    final /* synthetic */ boolean $lock3ARequired$inlined;
    int label;
    final /* synthetic */ CapturePipelineImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturePipelineImpl$defaultNoFlashCapture$$inlined$invoke$1(List list, e eVar, boolean z, CapturePipelineImpl capturePipelineImpl) {
        super(2, eVar);
        this.$captureSignal = list;
        this.$lock3ARequired$inlined = z;
        this.this$0 = capturePipelineImpl;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CapturePipelineImpl$defaultNoFlashCapture$$inlined$invoke$1(this.$captureSignal, eVar, this.$lock3ARequired$inlined, this.this$0);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((CapturePipelineImpl$defaultNoFlashCapture$$inlined$invoke$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r8.unlockAf(r5, r7) != r0) goto L26;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.label
            r2 = 2
            r3 = 1
            java.lang.String r4 = "CXCP"
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            e.b.c.b(r8)
            goto L77
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1a:
            e.b.c.b(r8)
            goto L42
        L1e:
            e.b.c.b(r8)
            androidx.camera.camera2.impl.Camera2Logger r8 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r8 = androidx.camera.core.Logger.isDebugEnabled(r4)
            if (r8 == 0) goto L32
            java.lang.String r8 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal"
            android.util.Log.d(r8, r1)
        L32:
            java.util.List r8 = r7.$captureSignal
            java.util.Collection r8 = (java.util.Collection) r8
            r1 = r7
            h.c.e r1 = (h.c.e) r1
            r7.label = r3
            java.lang.Object r8 = kotlinx.coroutines.aj.E(r8, r1)
            if (r8 != r0) goto L42
            goto L89
        L42:
            androidx.camera.camera2.impl.Camera2Logger r8 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r8 = androidx.camera.core.Logger.isDebugEnabled(r4)
            if (r8 == 0) goto L53
            java.lang.String r8 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal done"
            android.util.Log.d(r8, r1)
        L53:
            r8 = r7
            h.c.e r8 = (h.c.e) r8
            boolean r8 = r7.$lock3ARequired$inlined
            if (r8 == 0) goto L8a
            boolean r8 = androidx.camera.core.Logger.isDebugEnabled(r4)
            if (r8 == 0) goto L69
            java.lang.String r8 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "CapturePipeline#defaultNoFlashCapture: Unlocking 3A"
            android.util.Log.d(r8, r1)
        L69:
            androidx.camera.camera2.impl.CapturePipelineImpl r8 = r7.this$0
            long r5 = androidx.camera.camera2.impl.CapturePipelineKt.access$getCHECK_3A_TIMEOUT_IN_NS$p()
            r7.label = r2
            java.lang.Object r7 = androidx.camera.camera2.impl.CapturePipelineImpl.access$unlockAf(r8, r5, r7)
            if (r7 == r0) goto L89
        L77:
            androidx.camera.camera2.impl.Camera2Logger r7 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r7 = androidx.camera.core.Logger.isDebugEnabled(r4)
            if (r7 == 0) goto L8a
            java.lang.String r7 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r8 = "CapturePipeline#defaultNoFlashCapture: Unlocking 3A done"
            android.util.Log.d(r7, r8)
            goto L8a
        L89:
            return r0
        L8a:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl$defaultNoFlashCapture$$inlined$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
