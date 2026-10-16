package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    private final at f20612a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.o.ad f20613b;

    public bc(at atVar, com.waze.o.ad adVar) {
        h.g.b.x.f(atVar, "address");
        this.f20612a = atVar;
        this.f20613b = adVar;
    }

    public final at a() {
        return this.f20612a;
    }

    public final com.waze.o.ad b() {
        return this.f20613b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        return h.g.b.x.n(this.f20612a, bcVar.f20612a) && h.g.b.x.n(this.f20613b, bcVar.f20613b);
    }

    public final int hashCode() {
        int iHashCode = this.f20612a.hashCode() * 31;
        com.waze.o.ad adVar = this.f20613b;
        return iHashCode + (adVar == null ? 0 : adVar.hashCode());
    }

    public final String toString() {
        return "UiDestination(address=" + this.f20612a + ", favoriteInfo=" + this.f20613b + ")";
    }
}
