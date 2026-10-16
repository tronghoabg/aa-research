package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class br implements com.waze.j.f, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bx f35847a;

    br(bx bxVar) {
        this.f35847a = bxVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof com.waze.j.f) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new h.g.b.u(1, this.f35847a, bx.class, "onCTAClicked", "onCTAClicked(Ljava/lang/String;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        h.g.b.x.f(str, "p0");
        bx.m(this.f35847a, str);
        return h.ab.f48028a;
    }
}
