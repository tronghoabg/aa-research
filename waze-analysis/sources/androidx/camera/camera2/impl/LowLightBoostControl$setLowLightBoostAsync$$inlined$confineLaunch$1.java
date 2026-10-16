package androidx.camera.camera2.impl;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ boolean $cancelPreviousTask$inlined;
    final /* synthetic */ boolean $lowLightBoost$inlined;
    final /* synthetic */ CompletableDeferred $signal$inlined;
    int label;
    final /* synthetic */ LowLightBoostControl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1(e eVar, LowLightBoostControl lowLightBoostControl, CompletableDeferred completableDeferred, boolean z, boolean z2) {
        super(2, eVar);
        this.this$0 = lowLightBoostControl;
        this.$signal$inlined = completableDeferred;
        this.$lowLightBoost$inlined = z;
        this.$cancelPreviousTask$inlined = z2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1(eVar, this.this$0, this.$signal$inlined, this.$lowLightBoost$inlined, this.$cancelPreviousTask$inlined);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.label
            r2 = -1
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 != r3) goto Le
            e.b.c.b(r5)
            goto L2c
        Le:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L16:
            e.b.c.b(r5)
            r5 = r4
            h.c.e r5 = (h.c.e) r5
            androidx.camera.camera2.impl.LowLightBoostControl r5 = r4.this$0
            kotlinx.coroutines.am r5 = r5.getCheckFrameRateJob$camera_camera2()
            if (r5 == 0) goto L50
            r4.label = r3
            java.lang.Object r5 = r5.c(r4)
            if (r5 == r0) goto L4f
        L2c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L50
            androidx.camera.camera2.impl.LowLightBoostControl r5 = r4.this$0
            androidx.lifecycle.MutableLiveData r0 = androidx.camera.camera2.impl.LowLightBoostControl.access$get_lowLightBoostState$p(r5)
            androidx.camera.camera2.impl.LowLightBoostControl.access$setLiveDataValue(r5, r0, r2)
            androidx.camera.camera2.impl.LowLightBoostControl r5 = r4.this$0
            kotlinx.coroutines.CompletableDeferred r4 = r4.$signal$inlined
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Low Light Boost is disabled when expected frame rate range exceeds 30."
            r0.<init>(r1)
            java.lang.Exception r0 = (java.lang.Exception) r0
            androidx.camera.camera2.impl.LowLightBoostControl.access$createFailureResult(r5, r4, r0)
            goto Ld9
        L4f:
            return r0
        L50:
            androidx.camera.camera2.impl.LowLightBoostControl r5 = r4.this$0
            boolean r0 = r4.$lowLightBoost$inlined
            androidx.camera.camera2.impl.LowLightBoostControl.access$setLowLightBoostOn$p(r5, r0)
            boolean r5 = r4.$lowLightBoost$inlined
            if (r5 != 0) goto L64
            androidx.camera.camera2.impl.LowLightBoostControl r5 = r4.this$0
            androidx.lifecycle.MutableLiveData r0 = androidx.camera.camera2.impl.LowLightBoostControl.access$get_lowLightBoostState$p(r5)
            androidx.camera.camera2.impl.LowLightBoostControl.access$setLiveDataValue(r5, r0, r2)
        L64:
            androidx.camera.camera2.impl.LowLightBoostControl r5 = r4.this$0
            androidx.camera.camera2.impl.UseCaseCameraRequestControl r5 = r5.getRequestControl()
            if (r5 == 0) goto Lc9
            boolean r5 = r4.$lowLightBoost$inlined
            if (r5 == 0) goto L7a
            androidx.camera.camera2.impl.LowLightBoostControl r5 = r4.this$0
            androidx.lifecycle.MutableLiveData r0 = androidx.camera.camera2.impl.LowLightBoostControl.access$get_lowLightBoostState$p(r5)
            r1 = 0
            androidx.camera.camera2.impl.LowLightBoostControl.access$setLiveDataValue(r5, r0, r1)
        L7a:
            boolean r5 = r4.$cancelPreviousTask$inlined
            androidx.camera.camera2.impl.LowLightBoostControl r0 = r4.this$0
            if (r5 == 0) goto L84
            androidx.camera.camera2.impl.LowLightBoostControl.access$stopRunningTaskInternal(r0)
            goto L91
        L84:
            kotlinx.coroutines.CompletableDeferred r5 = androidx.camera.camera2.impl.LowLightBoostControl.access$get_updateSignal$p(r0)
            if (r5 == 0) goto L91
            kotlinx.coroutines.CompletableDeferred r0 = r4.$signal$inlined
            kotlinx.coroutines.am r0 = (kotlinx.coroutines.am) r0
            androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo(r0, r5)
        L91:
            androidx.camera.camera2.impl.LowLightBoostControl r5 = r4.this$0
            kotlinx.coroutines.CompletableDeferred r0 = r4.$signal$inlined
            androidx.camera.camera2.impl.LowLightBoostControl.access$set_updateSignal$p(r5, r0)
            androidx.camera.camera2.impl.LowLightBoostControl r5 = r4.this$0
            boolean r0 = r4.$lowLightBoost$inlined
            androidx.camera.camera2.impl.State3AControl r5 = androidx.camera.camera2.impl.LowLightBoostControl.access$getState3AControl$p(r5)
            if (r0 == 0) goto La9
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 6
            r0.<init>(r1)
            goto Laa
        La9:
            r0 = 0
        Laa:
            kotlinx.coroutines.am r5 = r5.setPreferredAeModeAsync(r0)
            kotlinx.coroutines.CompletableDeferred r0 = r4.$signal$inlined
            androidx.camera.camera2.impl.LowLightBoostControl$setLowLightBoostAsync$2$1$2 r1 = new androidx.camera.camera2.impl.LowLightBoostControl$setLowLightBoostAsync$2$1$2
            r1.<init>()
            h.g.a.l r1 = (h.g.a.l) r1
            r5.bY(r1)
            kotlinx.coroutines.CompletableDeferred r5 = r4.$signal$inlined
            androidx.camera.camera2.impl.LowLightBoostControl r4 = r4.this$0
            androidx.camera.camera2.impl.LowLightBoostControl$setLowLightBoostAsync$2$1$3 r0 = new androidx.camera.camera2.impl.LowLightBoostControl$setLowLightBoostAsync$2$1$3
            r0.<init>()
            h.g.a.l r0 = (h.g.a.l) r0
            r5.bY(r0)
            goto Ld9
        Lc9:
            androidx.camera.camera2.impl.LowLightBoostControl r5 = r4.this$0
            kotlinx.coroutines.CompletableDeferred r4 = r4.$signal$inlined
            androidx.camera.core.CameraControl$OperationCanceledException r0 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r1 = "Camera is not active."
            r0.<init>(r1)
            java.lang.Exception r0 = (java.lang.Exception) r0
            androidx.camera.camera2.impl.LowLightBoostControl.access$createFailureResult(r5, r4, r0)
        Ld9:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
