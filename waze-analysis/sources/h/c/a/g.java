package h.c.a;

import h.c.j;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends h.c.b.a.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h.c.e eVar, j jVar) {
        super(eVar, jVar);
        x.d(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // h.c.b.a.a
    protected final Object invokeSuspend(Object obj) {
        e.b.c.b(obj);
        return obj;
    }
}
