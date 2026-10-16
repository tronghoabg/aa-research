package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class aw implements by, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bc f18554a;

    aw(bc bcVar) {
        this.f18554a = bcVar;
    }

    @Override // com.waze.c.e.by
    public final void a(com.waze.c.d.l lVar) {
        h.g.b.x.f(lVar, "p0");
        bc.n(this.f18554a, lVar);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof by) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new h.g.b.u(1, this.f18554a, bc.class, "startNavigationOnRoute", "startNavigationOnRoute(Lcom/waze/alternate_routes/domain/AlternateRoutesController$State$AlternativeRoute$ServerRoute;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
