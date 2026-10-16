package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class aq implements p, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f35785a;

    aq(am amVar) {
        this.f35785a = amVar;
    }

    @Override // com.waze.search.h.p
    public final void a(com.waze.search.d.a.a.a aVar, int i2) {
        h.g.b.x.f(aVar, "p0");
        this.f35785a.a(aVar, i2);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof p) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new h.g.b.u(2, this.f35785a, am.class, "onCategoryClicked", "onCategoryClicked(Lcom/waze/search/emptystate/categories/model/CategoryGroupItem;I)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
