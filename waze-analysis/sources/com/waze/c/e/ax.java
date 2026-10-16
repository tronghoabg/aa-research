package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class ax implements cf, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bc f18555a;

    ax(bc bcVar) {
        this.f18555a = bcVar;
    }

    @Override // com.waze.c.e.cf
    public final void a() {
        bc.m(this.f18555a);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof cf) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new h.g.b.u(0, this.f18555a, bc.class, "resumeDrive", "resumeDrive()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
