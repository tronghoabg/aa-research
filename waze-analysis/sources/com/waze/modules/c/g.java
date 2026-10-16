package com.waze.modules.c;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final List f30144a;

    /* renamed from: b, reason: collision with root package name */
    private final ap f30145b;

    /* renamed from: c, reason: collision with root package name */
    private final List f30146c;

    public g(List list, ap apVar, List list2) {
        h.g.b.x.f(list, "geometry");
        h.g.b.x.f(list2, "segmentIds");
        this.f30144a = list;
        this.f30145b = apVar;
        this.f30146c = list2;
    }

    public final ap a() {
        return this.f30145b;
    }

    public final List b() {
        return this.f30144a;
    }

    public final List c() {
        return this.f30146c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return h.g.b.x.n(this.f30144a, gVar.f30144a) && this.f30145b == gVar.f30145b && h.g.b.x.n(this.f30146c, gVar.f30146c);
    }

    public final int hashCode() {
        int iHashCode = this.f30144a.hashCode() * 31;
        ap apVar = this.f30145b;
        return ((iHashCode + (apVar == null ? 0 : apVar.hashCode())) * 31) + this.f30146c.hashCode();
    }

    public final String toString() {
        return "ClosurePolyline(geometry=" + this.f30144a + ", roadType=" + this.f30145b + ", segmentIds=" + this.f30146c + ")";
    }
}
