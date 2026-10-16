package com.waze.reports_v2.presentation.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.b.ad f34681a;

    /* renamed from: b, reason: collision with root package name */
    private final at f34682b;

    public au(com.waze.reports_v2.b.ad adVar, at atVar) {
        h.g.b.x.f(adVar, "legacyMenu");
        this.f34681a = adVar;
        this.f34682b = atVar;
    }

    public final com.waze.reports_v2.b.ad a() {
        return this.f34681a;
    }

    public final at b() {
        return this.f34682b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        return this.f34681a == auVar.f34681a && h.g.b.x.n(this.f34682b, auVar.f34682b);
    }

    public final int hashCode() {
        int iHashCode = this.f34681a.hashCode() * 31;
        at atVar = this.f34682b;
        return iHashCode + (atVar == null ? 0 : atVar.hashCode());
    }

    public final String toString() {
        return "LegacyMenu(legacyMenu=" + this.f34681a + ", laterButton=" + this.f34682b + ")";
    }
}
