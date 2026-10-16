package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class bp implements com.waze.main_screen.p.b.a.b.a, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bs f27220a;

    bp(bs bsVar) {
        this.f27220a = bsVar;
    }

    @Override // com.waze.main_screen.p.b.a.b.a
    public final void a() {
        bs.x(this.f27220a);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof com.waze.main_screen.p.b.a.b.a) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new h.g.b.u(0, this.f27220a, bs.class, "handleNavigationBarClicked", "handleNavigationBarClicked()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
