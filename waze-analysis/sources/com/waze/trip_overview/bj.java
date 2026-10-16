package com.waze.trip_overview;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bj {

    /* renamed from: a, reason: collision with root package name */
    private final bi f41084a;

    /* renamed from: b, reason: collision with root package name */
    private final List f41085b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f41086c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f41087d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f41088e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f41089f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f41090g;

    /* renamed from: h, reason: collision with root package name */
    private final List f41091h;

    /* renamed from: i, reason: collision with root package name */
    private final List f41092i;

    public bj(bi biVar, List list, boolean z, boolean z2, boolean z3, boolean z4, List list2, List list3) {
        h.g.b.x.f(biVar, "identifier");
        h.g.b.x.f(list, "eventsOnRoute");
        h.g.b.x.f(list2, "restrictions");
        h.g.b.x.f(list3, "routeAttributes");
        this.f41084a = biVar;
        this.f41085b = list;
        this.f41086c = z;
        this.f41087d = z2;
        this.f41088e = true;
        this.f41089f = z3;
        this.f41090g = z4;
        this.f41091h = list2;
        this.f41092i = list3;
    }

    public final bi a() {
        return this.f41084a;
    }

    public final List b() {
        return this.f41085b;
    }

    public final List c() {
        return this.f41091h;
    }

    public final List d() {
        return this.f41092i;
    }

    public final boolean e() {
        return this.f41086c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj)) {
            return false;
        }
        bj bjVar = (bj) obj;
        if (!h.g.b.x.n(this.f41084a, bjVar.f41084a) || !h.g.b.x.n(this.f41085b, bjVar.f41085b) || this.f41086c != bjVar.f41086c || this.f41087d != bjVar.f41087d) {
            return false;
        }
        boolean z = bjVar.f41088e;
        return this.f41089f == bjVar.f41089f && this.f41090g == bjVar.f41090g && h.g.b.x.n(this.f41091h, bjVar.f41091h) && h.g.b.x.n(this.f41092i, bjVar.f41092i);
    }

    public final boolean f() {
        return this.f41089f;
    }

    public final boolean g() {
        return this.f41090g;
    }

    public final int hashCode() {
        int iHashCode = (this.f41084a.hashCode() * 31) + this.f41085b.hashCode();
        List list = this.f41091h;
        boolean z = this.f41090g;
        boolean z2 = this.f41089f;
        return (((((((((((((iHashCode * 31) + a.a.a(this.f41086c)) * 31) + a.a.a(this.f41087d)) * 31) + a.a.a(true)) * 31) + a.a.a(z2)) * 31) + a.a.a(z)) * 31) + list.hashCode()) * 31) + this.f41092i.hashCode();
    }

    public final String toString() {
        return "RouteInsightData(identifier=" + this.f41084a + ", eventsOnRoute=" + this.f41085b + ", hasToll=" + this.f41086c + ", hasWarnings=" + this.f41087d + ", hasCarbonEmission=true, isBest=" + this.f41089f + ", isPreferred=" + this.f41090g + ", restrictions=" + this.f41091h + ", routeAttributes=" + this.f41092i + ")";
    }
}
