package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bi {

    /* renamed from: a, reason: collision with root package name */
    private final String f41082a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41083b;

    public bi(String str, String str2) {
        h.g.b.x.f(str, "routeAltId");
        h.g.b.x.f(str2, "routeUuid");
        this.f41082a = str;
        this.f41083b = str2;
    }

    public final String a() {
        return this.f41082a;
    }

    public final String b() {
        return this.f41083b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi)) {
            return false;
        }
        bi biVar = (bi) obj;
        return h.g.b.x.n(this.f41082a, biVar.f41082a) && h.g.b.x.n(this.f41083b, biVar.f41083b);
    }

    public final int hashCode() {
        return (this.f41082a.hashCode() * 31) + this.f41083b.hashCode();
    }

    public final String toString() {
        return "RouteIdentifier(routeAltId=" + this.f41082a + ", routeUuid=" + this.f41083b + ")";
    }
}
