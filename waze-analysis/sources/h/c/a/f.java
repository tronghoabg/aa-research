package h.c.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends h.c.b.a.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(h.c.e eVar) {
        super(eVar);
        x.d(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // h.c.b.a.a
    protected final Object invokeSuspend(Object obj) {
        e.b.c.b(obj);
        return obj;
    }
}
