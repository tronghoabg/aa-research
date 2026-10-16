package com.waze.reports;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.ed f33577a;

    /* renamed from: b, reason: collision with root package name */
    private final ab f33578b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.av.a.p f33579c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33580d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.reports_v2.presentation.p f33581e;

    public ac(com.waze.map.b.ed edVar, ab abVar, com.waze.av.a.p pVar, boolean z, com.waze.reports_v2.presentation.p pVar2) {
        h.g.b.x.f(edVar, "mapController");
        h.g.b.x.f(pVar2, "placeName");
        this.f33577a = edVar;
        this.f33578b = abVar;
        this.f33579c = pVar;
        this.f33580d = z;
        this.f33581e = pVar2;
    }

    public static /* synthetic */ ac f(ac acVar, ab abVar, com.waze.av.a.p pVar, boolean z, com.waze.reports_v2.presentation.p pVar2, int i2) {
        com.waze.map.b.ed edVar = (i2 & 1) != 0 ? acVar.f33577a : null;
        if ((i2 & 2) != 0) {
            abVar = acVar.f33578b;
        }
        if ((i2 & 4) != 0) {
            pVar = acVar.f33579c;
        }
        if ((i2 & 8) != 0) {
            z = acVar.f33580d;
        }
        if ((i2 & 16) != 0) {
            pVar2 = acVar.f33581e;
        }
        com.waze.reports_v2.presentation.p pVar3 = pVar2;
        h.g.b.x.f(edVar, "mapController");
        h.g.b.x.f(pVar3, "placeName");
        boolean z2 = z;
        return new ac(edVar, abVar, pVar, z2, pVar3);
    }

    public final com.waze.map.b.ed a() {
        return this.f33577a;
    }

    public final com.waze.av.a.p b() {
        return this.f33579c;
    }

    public final ab c() {
        return this.f33578b;
    }

    public final boolean d() {
        return this.f33580d;
    }

    public final com.waze.reports_v2.presentation.p e() {
        return this.f33581e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return h.g.b.x.n(this.f33577a, acVar.f33577a) && this.f33578b == acVar.f33578b && h.g.b.x.n(this.f33579c, acVar.f33579c) && this.f33580d == acVar.f33580d && h.g.b.x.n(this.f33581e, acVar.f33581e);
    }

    public final int hashCode() {
        int iHashCode = this.f33577a.hashCode() * 31;
        ab abVar = this.f33578b;
        int iHashCode2 = (iHashCode + (abVar == null ? 0 : abVar.hashCode())) * 31;
        com.waze.av.a.p pVar = this.f33579c;
        return ((((iHashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31) + a.a.a(this.f33580d)) * 31) + this.f33581e.hashCode();
    }

    public final String toString() {
        return "EditMapLocationScreenState(mapController=" + this.f33577a + ", centerMarker=" + this.f33578b + ", centerAddress=" + this.f33579c + ", canConfirmCurrentLocation=" + this.f33580d + ", placeName=" + this.f33581e + ")";
    }
}
