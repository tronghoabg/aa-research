package androidx.camera.camera2.compat.workaround;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CapturePipelineTorchCorrection$submitStillCaptures$1 extends c {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CapturePipelineTorchCorrection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CapturePipelineTorchCorrection$submitStillCaptures$1(CapturePipelineTorchCorrection capturePipelineTorchCorrection, e<? super CapturePipelineTorchCorrection$submitStillCaptures$1> eVar) {
        super(eVar);
        this.this$0 = capturePipelineTorchCorrection;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo224submitStillCapturesBvXKQx0(null, 0, null, 0, 0, 0, this);
    }
}
