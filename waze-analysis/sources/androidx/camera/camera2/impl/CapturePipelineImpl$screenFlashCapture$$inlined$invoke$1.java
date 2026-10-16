package androidx.camera.camera2.impl;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CapturePipelineImpl$screenFlashCapture$$inlined$invoke$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ int $captureMode$inlined;
    final /* synthetic */ List $captureSignal;
    int label;
    final /* synthetic */ CapturePipelineImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturePipelineImpl$screenFlashCapture$$inlined$invoke$1(List list, e eVar, CapturePipelineImpl capturePipelineImpl, int i2) {
        super(2, eVar);
        this.$captureSignal = list;
        this.this$0 = capturePipelineImpl;
        this.$captureMode$inlined = i2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CapturePipelineImpl$screenFlashCapture$$inlined$invoke$1(this.$captureSignal, eVar, this.this$0, this.$captureMode$inlined);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((CapturePipelineImpl$screenFlashCapture$$inlined$invoke$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r6.invokeScreenFlashPostCaptureTasks(r1, r5) != r0) goto L21;
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
            java.lang.String r2 = "CXCP"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            e.b.c.b(r6)
            goto L62
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1a:
            e.b.c.b(r6)
            goto L42
        L1e:
            e.b.c.b(r6)
            androidx.camera.camera2.impl.Camera2Logger r6 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r6 = androidx.camera.core.Logger.isDebugEnabled(r2)
            if (r6 == 0) goto L32
            java.lang.String r6 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal"
            android.util.Log.d(r6, r1)
        L32:
            java.util.List r6 = r5.$captureSignal
            java.util.Collection r6 = (java.util.Collection) r6
            r1 = r5
            h.c.e r1 = (h.c.e) r1
            r5.label = r4
            java.lang.Object r6 = kotlinx.coroutines.aj.E(r6, r1)
            if (r6 != r0) goto L42
            goto L65
        L42:
            androidx.camera.camera2.impl.Camera2Logger r6 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r6 = androidx.camera.core.Logger.isDebugEnabled(r2)
            if (r6 == 0) goto L53
            java.lang.String r6 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal done"
            android.util.Log.d(r6, r1)
        L53:
            r6 = r5
            h.c.e r6 = (h.c.e) r6
            androidx.camera.camera2.impl.CapturePipelineImpl r6 = r5.this$0
            int r1 = r5.$captureMode$inlined
            r5.label = r3
            java.lang.Object r5 = r6.invokeScreenFlashPostCaptureTasks(r1, r5)
            if (r5 == r0) goto L65
        L62:
            h.ab r5 = h.ab.f48028a
            return r5
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl$screenFlashCapture$$inlined$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
