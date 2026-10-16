package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class am implements com.waze.main_screen.p.b.a.b.a, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ at f38335a;

    am(at atVar) {
        this.f38335a = atVar;
    }

    @Override // com.waze.main_screen.p.b.a.b.a
    public final void a() {
        at.k(this.f38335a);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof com.waze.main_screen.p.b.a.b.a) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new h.g.b.u(0, this.f38335a, at.class, "onNavigationBarClicked", "onNavigationBarClicked()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
