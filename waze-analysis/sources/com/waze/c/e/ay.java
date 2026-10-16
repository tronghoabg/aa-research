package com.waze.c.e;

import com.waze.modules.c.eb;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class ay implements cc, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bc f18556a;

    ay(bc bcVar) {
        this.f18556a = bcVar;
    }

    @Override // com.waze.c.e.cc
    public final void a(eb ebVar) {
        h.g.b.x.f(ebVar, "p0");
        bc.u(this.f18556a, ebVar);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof cc) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new h.g.b.u(1, this.f18556a, bc.class, "onAltRouteCardBadgeClicked", "onAltRouteCardBadgeClicked(Lcom/waze/modules/routing/RouteAttribute;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
