package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dd {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f20771a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f20772b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f20773c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f20774d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.car_lib.r.cq f20775e;

    public /* synthetic */ dd(com.waze.car_lib.r.cq cqVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, int i2) {
        aVar3 = (i2 & 8) != 0 ? new com.waze.car_lib.screens.cp(16) : aVar3;
        aVar4 = (i2 & 16) != 0 ? new com.waze.car_lib.screens.cp(17) : aVar4;
        h.g.b.x.f(cqVar, "state");
        h.g.b.x.f(aVar, "firstActionClicked");
        h.g.b.x.f(aVar2, "secondActionClicked");
        h.g.b.x.f(aVar3, "backClicked");
        h.g.b.x.f(aVar4, "onDismiss");
        this.f20775e = cqVar;
        this.f20771a = aVar;
        this.f20772b = aVar2;
        this.f20773c = aVar3;
        this.f20774d = aVar4;
    }

    public final h.g.a.a a() {
        return this.f20773c;
    }

    public final h.g.a.a b() {
        return this.f20771a;
    }

    public final h.g.a.a c() {
        return this.f20774d;
    }

    public final h.g.a.a d() {
        return this.f20772b;
    }

    public final com.waze.car_lib.r.cq e() {
        return this.f20775e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd)) {
            return false;
        }
        dd ddVar = (dd) obj;
        return h.g.b.x.n(this.f20775e, ddVar.f20775e) && h.g.b.x.n(this.f20771a, ddVar.f20771a) && h.g.b.x.n(this.f20772b, ddVar.f20772b) && h.g.b.x.n(this.f20773c, ddVar.f20773c) && h.g.b.x.n(this.f20774d, ddVar.f20774d);
    }

    public final int hashCode() {
        return (((((((this.f20775e.hashCode() * 31) + this.f20771a.hashCode()) * 31) + this.f20772b.hashCode()) * 31) + this.f20773c.hashCode()) * 31) + this.f20774d.hashCode();
    }

    public final String toString() {
        return "FullScreenPopupUiState(state=" + this.f20775e + ", firstActionClicked=" + this.f20771a + ", secondActionClicked=" + this.f20772b + ", backClicked=" + this.f20773c + ", onDismiss=" + this.f20774d + ")";
    }
}
