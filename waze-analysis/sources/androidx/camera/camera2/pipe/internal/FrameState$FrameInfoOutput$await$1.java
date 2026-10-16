package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.internal.FrameState;
import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class FrameState$FrameInfoOutput$await$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FrameState.FrameInfoOutput this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameState$FrameInfoOutput$await$1(FrameState.FrameInfoOutput frameInfoOutput, e<? super FrameState$FrameInfoOutput$await$1> eVar) {
        super(eVar);
        this.this$0 = frameInfoOutput;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.await(this);
    }
}
