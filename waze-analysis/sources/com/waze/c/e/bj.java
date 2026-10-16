package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class bj implements com.waze.main_screen.p.b.a.b.a, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bk f18594a;

    bj(bk bkVar) {
        this.f18594a = bkVar;
    }

    @Override // com.waze.main_screen.p.b.a.b.a
    public final void a() {
        bk.i(this.f18594a);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof com.waze.main_screen.p.b.a.b.a) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new h.g.b.u(0, this.f18594a, bk.class, "handleNavigationBarClicked", "handleNavigationBarClicked()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
