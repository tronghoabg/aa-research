package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class bb implements kotlinx.coroutines.b.l, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f28049a;

    bb(h.g.a.l lVar) {
        this.f28049a = lVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        this.f28049a.invoke((com.waze.install.ah) obj);
        h.ab abVar = h.ab.f48028a;
        h.c.a.a aVar = h.c.a.a.f48038a;
        return abVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof kotlinx.coroutines.b.l) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new h.g.b.u(2, this.f28049a, h.g.b.w.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/waze/map/controller/MainMapController$MapEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
