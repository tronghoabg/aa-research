package com.waze.trip_overview.c.a;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final long f41169a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f41170b;

    /* renamed from: c, reason: collision with root package name */
    private final List f41171c;

    public ae(long j2, boolean z, List list) {
        h.g.b.x.f(list, "routes");
        this.f41169a = j2;
        this.f41170b = z;
        this.f41171c = list;
    }

    public final long a() {
        return this.f41169a;
    }

    public final List b() {
        return this.f41171c;
    }

    public final boolean c() {
        return this.f41170b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        return this.f41169a == aeVar.f41169a && this.f41170b == aeVar.f41170b && h.g.b.x.n(this.f41171c, aeVar.f41171c);
    }

    public final int hashCode() {
        return (((a.a.b(this.f41169a) * 31) + a.a.a(this.f41170b)) * 31) + this.f41171c.hashCode();
    }

    public final String toString() {
        return "RouteDetailsData(selectedRouteId=" + this.f41169a + ", isNow=" + this.f41170b + ", routes=" + this.f41171c + ")";
    }

    public ae() {
        this(-1L, true, h.a.i.h());
    }
}
