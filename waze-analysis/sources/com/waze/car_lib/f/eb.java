package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class eb implements com.waze.car_lib.screens.core.c, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ed f19518a;

    eb(ed edVar) {
        this.f19518a = edVar;
    }

    @Override // com.waze.car_lib.screens.core.c
    public final void a() {
        ed.k(this.f19518a);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof com.waze.car_lib.screens.core.c) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new h.g.b.u(0, this.f19518a, ed.class, "onNavigationScreenBack", "onNavigationScreenBack()Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
