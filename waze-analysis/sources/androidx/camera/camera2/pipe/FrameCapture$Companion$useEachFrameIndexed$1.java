package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.FrameCapture;
import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class FrameCapture$Companion$useEachFrameIndexed$1 extends c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FrameCapture.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameCapture$Companion$useEachFrameIndexed$1(FrameCapture.Companion companion, e<? super FrameCapture$Companion$useEachFrameIndexed$1> eVar) {
        super(eVar);
        this.this$0 = companion;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.useEachFrameIndexed(null, null, this);
    }
}
