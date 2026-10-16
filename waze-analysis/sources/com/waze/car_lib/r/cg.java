package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cg {

    /* renamed from: a, reason: collision with root package name */
    private final ca f21198a;

    /* renamed from: b, reason: collision with root package name */
    private final cf f21199b;

    /* renamed from: c, reason: collision with root package name */
    private final fb f21200c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21201d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.av.b.n f21202e;

    public cg(ca caVar, cf cfVar, fb fbVar, boolean z, com.waze.av.b.n nVar) {
        h.g.b.x.f(caVar, "etaState");
        h.g.b.x.f(cfVar, "instructionsState");
        this.f21198a = caVar;
        this.f21199b = cfVar;
        this.f21200c = fbVar;
        this.f21201d = z;
        this.f21202e = nVar;
    }

    public final ca a() {
        return this.f21198a;
    }

    public final cf b() {
        return this.f21199b;
    }

    public final fb c() {
        return this.f21200c;
    }

    public final com.waze.av.b.n d() {
        return this.f21202e;
    }

    public final boolean e() {
        return this.f21201d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg)) {
            return false;
        }
        cg cgVar = (cg) obj;
        return h.g.b.x.n(this.f21198a, cgVar.f21198a) && h.g.b.x.n(this.f21199b, cgVar.f21199b) && h.g.b.x.n(this.f21200c, cgVar.f21200c) && this.f21201d == cgVar.f21201d && h.g.b.x.n(this.f21202e, cgVar.f21202e);
    }

    public final int hashCode() {
        int iHashCode = (this.f21198a.hashCode() * 31) + this.f21199b.hashCode();
        fb fbVar = this.f21200c;
        int iHashCode2 = ((((iHashCode * 31) + (fbVar == null ? 0 : fbVar.hashCode())) * 31) + a.a.a(this.f21201d)) * 31;
        com.waze.av.b.n nVar = this.f21202e;
        return iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "State(etaState=" + this.f21198a + ", instructionsState=" + this.f21199b + ", tollInfoState=" + this.f21200c + ", navigatingToStopPoint=" + this.f21201d + ", destination=" + this.f21202e + ")";
    }
}
