package androidx.camera.camera2.pipe.compat;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Camera2SystemState$onGraphStopped$1$1 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
    int label;
    final /* synthetic */ Camera2SystemState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2SystemState$onGraphStopped$1$1(Camera2SystemState camera2SystemState, h.c.e<? super Camera2SystemState$onGraphStopped$1$1> eVar) {
        super(2, eVar);
        this.this$0 = camera2SystemState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new Camera2SystemState$onGraphStopped$1$1(this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
        return ((Camera2SystemState$onGraphStopped$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.b.c.b(obj);
        Camera2SystemState camera2SystemState = this.this$0;
        synchronized (camera2SystemState.lock) {
            if (camera2SystemState.activeGraphs.isEmpty() && camera2SystemState.activeCameras.isEmpty()) {
                camera2SystemState.invokeStopped();
            }
        }
        return ab.f48028a;
    }
}
