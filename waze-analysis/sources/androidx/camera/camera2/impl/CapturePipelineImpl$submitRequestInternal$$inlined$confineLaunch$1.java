package androidx.camera.camera2.impl;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CapturePipelineImpl$submitRequestInternal$$inlined$confineLaunch$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ List $deferredList$inlined;
    final /* synthetic */ List $requests$inlined;
    Object L$0;
    int label;
    final /* synthetic */ CapturePipelineImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturePipelineImpl$submitRequestInternal$$inlined$confineLaunch$1(e eVar, CapturePipelineImpl capturePipelineImpl, List list, List list2) {
        super(2, eVar);
        this.this$0 = capturePipelineImpl;
        this.$deferredList$inlined = list;
        this.$requests$inlined = list2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CapturePipelineImpl$submitRequestInternal$$inlined$confineLaunch$1(eVar, this.this$0, this.$deferredList$inlined, this.$requests$inlined);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((CapturePipelineImpl$submitRequestInternal$$inlined$confineLaunch$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r12.tryStartRepeating(r11) == r1) goto L42;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl$submitRequestInternal$$inlined$confineLaunch$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
