package androidx.datastore.core;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DataStoreTracer_androidKt$trace$$inlined$traceCoroutine$default$2 extends g implements p<af, e, Object> {
    final /* synthetic */ l $block$inlined;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreTracer_androidKt$trace$$inlined$traceCoroutine$default$2(e eVar, l lVar) {
        super(2, eVar);
        this.$block$inlined = lVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DataStoreTracer_androidKt$trace$$inlined$traceCoroutine$default$2(eVar, this.$block$inlined);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e eVar) {
        return ((DataStoreTracer_androidKt$trace$$inlined$traceCoroutine$default$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
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
        l lVar = this.$block$inlined;
        this.L$0 = null;
        this.I$0 = 0;
        this.label = 1;
        Object objInvoke = lVar.invoke(this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
