package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class at implements com.waze.c.e.a.w, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bc f18549a;

    at(bc bcVar) {
        this.f18549a = bcVar;
    }

    @Override // com.waze.c.e.a.w
    public final h.k a(long j2) {
        return bc.h(this.f18549a, j2);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof com.waze.c.e.a.w) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new h.g.b.u(1, this.f18549a, bc.class, "onMapAltRouteSelected", "onMapAltRouteSelected(J)Lkotlin/Pair;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
