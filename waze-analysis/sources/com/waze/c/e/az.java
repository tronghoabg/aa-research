package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class az implements ca, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bc f18557a;

    az(bc bcVar) {
        this.f18557a = bcVar;
    }

    @Override // com.waze.c.e.ca
    public final void a(com.waze.c.d.l lVar, boolean z, int i2) {
        h.g.b.x.f(lVar, "p0");
        bc.l(this.f18557a, lVar, z, i2);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ca) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new h.g.b.u(3, this.f18557a, bc.class, "onHovRouteEnabledChanged", "onHovRouteEnabledChanged(Lcom/waze/alternate_routes/domain/AlternateRoutesController$State$AlternativeRoute$ServerRoute;ZI)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
