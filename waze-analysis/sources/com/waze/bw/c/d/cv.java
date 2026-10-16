package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cv {

    /* renamed from: a, reason: collision with root package name */
    private final cu f18072a;

    /* renamed from: b, reason: collision with root package name */
    private final dh f18073b;

    public cv(cu cuVar, dh dhVar) {
        h.g.b.x.f(cuVar, "address");
        this.f18072a = cuVar;
        this.f18073b = dhVar;
    }

    public final cu a() {
        return this.f18072a;
    }

    public final dh b() {
        return this.f18073b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv)) {
            return false;
        }
        cv cvVar = (cv) obj;
        return h.g.b.x.n(this.f18072a, cvVar.f18072a) && h.g.b.x.n(this.f18073b, cvVar.f18073b);
    }

    public final int hashCode() {
        int iHashCode = this.f18072a.hashCode() * 31;
        dh dhVar = this.f18073b;
        return iHashCode + (dhVar == null ? 0 : dhVar.hashCode());
    }

    public final String toString() {
        return "WazeUIDestination(address=" + this.f18072a + ", favoriteInfo=" + this.f18073b + ")";
    }
}
