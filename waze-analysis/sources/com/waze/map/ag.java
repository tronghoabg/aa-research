package com.waze.map;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    private final int f27933a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27934b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27935c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f27936d;

    /* renamed from: e, reason: collision with root package name */
    private final List f27937e;

    public ag(int i2, int i3, boolean z, com.waze.shared_infra.h.c cVar, List list) {
        h.g.b.x.f(cVar, "distanceCenter");
        h.g.b.x.f(list, "coordinates");
        this.f27933a = i2;
        this.f27934b = i3;
        this.f27935c = z;
        this.f27936d = cVar;
        this.f27937e = list;
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f27936d;
    }

    public final List b() {
        return this.f27937e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return this.f27933a == agVar.f27933a && this.f27934b == agVar.f27934b && this.f27935c == agVar.f27935c && h.g.b.x.n(this.f27936d, agVar.f27936d) && h.g.b.x.n(this.f27937e, agVar.f27937e);
    }

    public final int hashCode() {
        int i2 = this.f27933a * 31;
        com.waze.shared_infra.h.c cVar = this.f27936d;
        return ((((((i2 + this.f27934b) * 31) + a.a.a(this.f27935c)) * 31) + cVar.hashCode()) * 31) + this.f27937e.hashCode();
    }

    public final String toString() {
        return "MapLine(lineId=" + this.f27933a + ", tileId=" + this.f27934b + ", isReversed=" + this.f27935c + ", distanceCenter=" + this.f27936d + ", coordinates=" + this.f27937e + ")";
    }
}
