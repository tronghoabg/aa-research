package androidx.camera.camera2.pipe.compat;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CaptureSessionState$configureSurfaceMap$1$1 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
    int label;
    final /* synthetic */ CaptureSessionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CaptureSessionState$configureSurfaceMap$1$1(CaptureSessionState captureSessionState, h.c.e<? super CaptureSessionState$configureSurfaceMap$1$1> eVar) {
        super(2, eVar);
        this.this$0 = captureSessionState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new CaptureSessionState$configureSurfaceMap$1$1(this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
        return ((CaptureSessionState$configureSurfaceMap$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.b.c.b(obj);
        this.this$0.finalizeOutputsIfAvailable(1 == ((false ? 1 : 0) | (1 & 1)));
        return ab.f48028a;
    }
}
