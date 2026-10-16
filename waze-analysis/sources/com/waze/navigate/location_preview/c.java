package com.waze.navigate.location_preview;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List f31706a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31707b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31708c;

    /* renamed from: d, reason: collision with root package name */
    private final List f31709d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.ui.ac.n f31710e;

    public c(List list, boolean z, boolean z2, List list2, com.waze.ui.ac.n nVar) {
        h.g.b.x.f(list, "sortedPlugOverviews");
        h.g.b.x.f(list2, "paymentMethods");
        this.f31706a = list;
        this.f31707b = z;
        this.f31708c = z2;
        this.f31709d = list2;
        this.f31710e = nVar;
    }

    public final com.waze.ui.ac.n a() {
        return this.f31710e;
    }

    public final List b() {
        return this.f31709d;
    }

    public final List c() {
        return this.f31706a;
    }

    public final boolean d() {
        return this.f31707b;
    }

    public final boolean e() {
        return this.f31708c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.g.b.x.n(this.f31706a, cVar.f31706a) && this.f31707b == cVar.f31707b && this.f31708c == cVar.f31708c && h.g.b.x.n(this.f31709d, cVar.f31709d) && h.g.b.x.n(this.f31710e, cVar.f31710e);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f31706a.hashCode() * 31) + a.a.a(this.f31707b)) * 31) + a.a.a(this.f31708c)) * 31) + this.f31709d.hashCode();
        com.waze.ui.ac.n nVar = this.f31710e;
        return (iHashCode * 31) + (nVar == null ? 0 : nVar.hashCode());
    }

    public final String toString() {
        return "EVChargingVenueModel(sortedPlugOverviews=" + this.f31706a + ", noPlugsMatchUserSelectedConnectors=" + this.f31707b + ", restrictedAccess=" + this.f31708c + ", paymentMethods=" + this.f31709d + ", directions=" + this.f31710e + ")";
    }
}
