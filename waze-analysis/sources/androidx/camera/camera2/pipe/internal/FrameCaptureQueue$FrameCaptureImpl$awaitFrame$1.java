package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class FrameCaptureQueue$FrameCaptureImpl$awaitFrame$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FrameCaptureQueue.FrameCaptureImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameCaptureQueue$FrameCaptureImpl$awaitFrame$1(FrameCaptureQueue.FrameCaptureImpl frameCaptureImpl, e<? super FrameCaptureQueue$FrameCaptureImpl$awaitFrame$1> eVar) {
        super(eVar);
        this.this$0 = frameCaptureImpl;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitFrame(this);
    }
}
