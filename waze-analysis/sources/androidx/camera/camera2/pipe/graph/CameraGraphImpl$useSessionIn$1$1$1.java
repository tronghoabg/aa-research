package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.CameraGraph;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.q;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraGraphImpl$useSessionIn$1$1$1 extends g implements p<af, e, Object> {
    final /* synthetic */ q<af, CameraGraph.Session, e, Object> $action;
    final /* synthetic */ CameraGraphSessionImpl $session;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CameraGraphImpl$useSessionIn$1$1$1(q<? super af, ? super CameraGraph.Session, ? super e, ? extends Object> qVar, CameraGraphSessionImpl cameraGraphSessionImpl, e<? super CameraGraphImpl$useSessionIn$1$1$1> eVar) {
        super(2, eVar);
        this.$action = qVar;
        this.$session = cameraGraphSessionImpl;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        CameraGraphImpl$useSessionIn$1$1$1 cameraGraphImpl$useSessionIn$1$1$1 = new CameraGraphImpl$useSessionIn$1$1$1(this.$action, this.$session, eVar);
        cameraGraphImpl$useSessionIn$1$1$1.L$0 = obj;
        return cameraGraphImpl$useSessionIn$1$1$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e eVar) {
        return ((CameraGraphImpl$useSessionIn$1$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return obj;
        }
        c.b(obj);
        af afVar = (af) this.L$0;
        q<af, CameraGraph.Session, e, Object> qVar = this.$action;
        CameraGraphSessionImpl cameraGraphSessionImpl = this.$session;
        this.label = 1;
        Object objInvoke = qVar.invoke(afVar, cameraGraphSessionImpl, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
