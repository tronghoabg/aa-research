package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.internal.FrameState;
import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class FrameState$ImageOutput$await$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FrameState.ImageOutput this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameState$ImageOutput$await$1(FrameState.ImageOutput imageOutput, e<? super FrameState$ImageOutput$await$1> eVar) {
        super(eVar);
        this.this$0 = imageOutput;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.await(this);
    }
}
