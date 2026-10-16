package com.waze.trip_overview.a;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List f40981a;

    /* renamed from: b, reason: collision with root package name */
    private final List f40982b;

    /* renamed from: c, reason: collision with root package name */
    private final List f40983c;

    public c(List list, List list2, List list3) {
        x.f(list, "polylines");
        x.f(list2, "markers");
        x.f(list3, "polygons");
        this.f40981a = list;
        this.f40982b = list2;
        this.f40983c = list3;
    }

    public final List a() {
        return this.f40982b;
    }

    public final List b() {
        return this.f40983c;
    }

    public final List c() {
        return this.f40981a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f40981a, cVar.f40981a) && x.n(this.f40982b, cVar.f40982b) && x.n(this.f40983c, cVar.f40983c);
    }

    public final int hashCode() {
        return (((this.f40981a.hashCode() * 31) + this.f40982b.hashCode()) * 31) + this.f40983c.hashCode();
    }

    public final String toString() {
        return "MapData(polylines=" + this.f40981a + ", markers=" + this.f40982b + ", polygons=" + this.f40983c + ")";
    }
}
