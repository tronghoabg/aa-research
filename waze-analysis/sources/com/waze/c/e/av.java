package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class av implements bz, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bc f18553a;

    av(bc bcVar) {
        this.f18553a = bcVar;
    }

    @Override // com.waze.c.e.bz
    public final void a(com.waze.c.d.m mVar) {
        h.g.b.x.f(mVar, "p0");
        bc.k(this.f18553a, mVar);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof bz) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new h.g.b.u(1, this.f18553a, bc.class, "onAltRouteSelected", "onAltRouteSelected(Lcom/waze/alternate_routes/domain/AlternateRoutesController$State$AlternativeRoute;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
