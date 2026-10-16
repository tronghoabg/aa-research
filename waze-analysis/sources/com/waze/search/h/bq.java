package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class bq implements com.waze.search.c.b, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bx f35846a;

    bq(bx bxVar) {
        this.f35846a = bxVar;
    }

    @Override // com.waze.search.c.b
    public final void a(com.waze.av.b.n nVar, com.waze.search.e.p pVar) {
        h.g.b.x.f(nVar, "p0");
        h.g.b.x.f(pVar, "p1");
        bx.n(this.f35846a, nVar, pVar);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof com.waze.search.c.b) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new h.g.b.u(2, this.f35846a, bx.class, "updateLongClickedGenericPlace", "updateLongClickedGenericPlace(Lcom/waze/models/place/GenericPlace;Lcom/waze/search/model/SearchListItem$DestinationCell;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
