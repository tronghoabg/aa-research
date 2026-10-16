package androidx.camera.camera2.compat.workaround;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CapturePipelineTorchCorrection$submitStillCaptures$2 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ List<am<Void>> $deferredResults;
    int label;
    final /* synthetic */ CapturePipelineTorchCorrection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CapturePipelineTorchCorrection$submitStillCaptures$2(List<? extends am<Void>> list, CapturePipelineTorchCorrection capturePipelineTorchCorrection, e<? super CapturePipelineTorchCorrection$submitStillCaptures$2> eVar) {
        super(2, eVar);
        this.$deferredResults = list;
        this.this$0 = capturePipelineTorchCorrection;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CapturePipelineTorchCorrection$submitStillCaptures$2(this.$deferredResults, this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((CapturePipelineTorchCorrection$submitStillCaptures$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r11.this$0.torchControl.m266setTorchAsyncOup_wC0$camera_camera2(androidx.camera.camera2.impl.TorchControl.TorchMode.Companion.m277getUSED_AS_FLASHIRs_R8(), false | (!((2 & 2) == 0)), false & ((2 & 4) == 0)).m(r11) == r0) goto L27;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r11.label
            java.lang.String r2 = "CXCP"
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            e.b.c.b(r12)
            goto L87
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L1d:
            e.b.c.b(r12)
            goto L68
        L21:
            e.b.c.b(r12)
            goto L38
        L25:
            e.b.c.b(r12)
            java.util.List<kotlinx.coroutines.am<java.lang.Void>> r12 = r11.$deferredResults
            java.util.Collection r12 = (java.util.Collection) r12
            r1 = r11
            h.c.e r1 = (h.c.e) r1
            r11.label = r5
            java.lang.Object r12 = kotlinx.coroutines.aj.E(r12, r1)
            if (r12 != r0) goto L38
            goto L9b
        L38:
            androidx.camera.camera2.impl.Camera2Logger r12 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r12 = androidx.camera.core.Logger.isDebugEnabled(r2)
            if (r12 == 0) goto L49
            java.lang.String r12 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "Re-enable Torch to correct the Torch state"
            android.util.Log.d(r12, r1)
        L49:
            androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection r12 = r11.this$0
            androidx.camera.camera2.impl.TorchControl r5 = androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection.access$getTorchControl$p(r12)
            androidx.camera.camera2.impl.TorchControl$TorchMode$Companion r12 = androidx.camera.camera2.impl.TorchControl.TorchMode.Companion
            int r6 = r12.m275getOFFIRs_R8()
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            kotlinx.coroutines.am r12 = androidx.camera.camera2.impl.TorchControl.m263setTorchAsyncOup_wC0$camera_camera2$default(r5, r6, r7, r8, r9, r10)
            r1 = r11
            h.c.e r1 = (h.c.e) r1
            r11.label = r4
            java.lang.Object r12 = r12.m(r1)
            if (r12 == r0) goto L9b
        L68:
            androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection r12 = r11.this$0
            androidx.camera.camera2.impl.TorchControl r4 = androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection.access$getTorchControl$p(r12)
            androidx.camera.camera2.impl.TorchControl$TorchMode$Companion r12 = androidx.camera.camera2.impl.TorchControl.TorchMode.Companion
            int r5 = r12.m277getUSED_AS_FLASHIRs_R8()
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.am r12 = androidx.camera.camera2.impl.TorchControl.m263setTorchAsyncOup_wC0$camera_camera2$default(r4, r5, r6, r7, r8, r9)
            r1 = r11
            h.c.e r1 = (h.c.e) r1
            r11.label = r3
            java.lang.Object r11 = r12.m(r1)
            if (r11 == r0) goto L9b
        L87:
            androidx.camera.camera2.impl.Camera2Logger r11 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r11 = androidx.camera.core.Logger.isDebugEnabled(r2)
            if (r11 == 0) goto L98
            java.lang.String r11 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r12 = "Re-enable Torch to correct the Torch state, done"
            android.util.Log.d(r11, r12)
        L98:
            h.ab r11 = h.ab.f48028a
            return r11
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
