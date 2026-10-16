package com.waze.trip_overview.views.trip_details_container;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f41563a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41564b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f41565c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f41566d;

    public h(int i2, int i3, h.g.a.a aVar, Integer num) {
        x.f(aVar, "clickListener");
        this.f41563a = i2;
        this.f41564b = i3;
        this.f41565c = aVar;
        this.f41566d = num;
    }

    public final int a() {
        return this.f41563a;
    }

    public final int b() {
        return this.f41564b;
    }

    public final Integer c() {
        return this.f41566d;
    }

    public final h.g.a.a d() {
        return this.f41565c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f41563a == hVar.f41563a && this.f41564b == hVar.f41564b && x.n(this.f41565c, hVar.f41565c) && x.n(this.f41566d, hVar.f41566d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f41563a * 31) + this.f41564b) * 31) + this.f41565c.hashCode();
        Integer num = this.f41566d;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "TripOverViewFooterModel(icon=" + this.f41563a + ", text=" + this.f41564b + ", clickListener=" + this.f41565c + ", hashTag=" + this.f41566d + ")";
    }
}
