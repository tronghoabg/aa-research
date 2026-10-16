package androidx.camera.camera2.pipe.internal;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class FrameImpl$awaitImages$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FrameImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameImpl$awaitImages$1(FrameImpl frameImpl, e<? super FrameImpl$awaitImages$1> eVar) {
        super(eVar);
        this.this$0 = frameImpl;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo643awaitImagesNYG5g8E(0, this);
    }
}
