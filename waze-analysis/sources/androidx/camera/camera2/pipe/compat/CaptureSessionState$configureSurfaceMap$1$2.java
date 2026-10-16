package androidx.camera.camera2.pipe.compat;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CaptureSessionState$configureSurfaceMap$1$2 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
    int label;
    final /* synthetic */ CaptureSessionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CaptureSessionState$configureSurfaceMap$1$2(CaptureSessionState captureSessionState, h.c.e<? super CaptureSessionState$configureSurfaceMap$1$2> eVar) {
        super(2, eVar);
        this.this$0 = captureSessionState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new CaptureSessionState$configureSurfaceMap$1$2(this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
        return ((CaptureSessionState$configureSurfaceMap$1$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            e.b.c.b(obj);
            this.label = 1;
            if (this.this$0.tryCreateCaptureSession(this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
        }
        return ab.f48028a;
    }
}
