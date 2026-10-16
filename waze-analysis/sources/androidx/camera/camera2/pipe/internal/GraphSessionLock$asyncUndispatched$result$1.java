package androidx.camera.camera2.pipe.internal;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class GraphSessionLock$asyncUndispatched$result$1 extends g implements p<af, e, Object> {
    final /* synthetic */ p<af, e, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GraphSessionLock$asyncUndispatched$result$1(p<? super af, ? super e, ? extends Object> pVar, e<? super GraphSessionLock$asyncUndispatched$result$1> eVar) {
        super(2, eVar);
        this.$block = pVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        GraphSessionLock$asyncUndispatched$result$1 graphSessionLock$asyncUndispatched$result$1 = new GraphSessionLock$asyncUndispatched$result$1(this.$block, eVar);
        graphSessionLock$asyncUndispatched$result$1.L$0 = obj;
        return graphSessionLock$asyncUndispatched$result$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e eVar) {
        return ((GraphSessionLock$asyncUndispatched$result$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
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
        aj.i(afVar);
        p<af, e, Object> pVar = this.$block;
        this.label = 1;
        Object objInvoke = pVar.invoke(afVar, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
