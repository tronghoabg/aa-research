package com.waze.av.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final a f15833a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f15834b;

    /* renamed from: c, reason: collision with root package name */
    private final o f15835c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f15836d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15837e;

    public p(a aVar, com.waze.shared_infra.h.c cVar, o oVar, Integer num, long j2) {
        x.f(aVar, "address");
        x.f(cVar, "coordinates");
        x.f(oVar, "venueData");
        this.f15833a = aVar;
        this.f15834b = cVar;
        this.f15835c = oVar;
        this.f15836d = num;
        this.f15837e = j2;
    }

    public static /* synthetic */ p f(p pVar, a aVar, o oVar, int i2) {
        if ((i2 & 1) != 0) {
            aVar = pVar.f15833a;
        }
        a aVar2 = aVar;
        com.waze.shared_infra.h.c cVar = pVar.f15834b;
        Integer num = pVar.f15836d;
        long j2 = pVar.f15837e;
        x.f(aVar2, "address");
        x.f(cVar, "coordinates");
        x.f(oVar, "venueData");
        return new p(aVar2, cVar, oVar, num, j2);
    }

    public final long a() {
        return this.f15837e;
    }

    public final a b() {
        return this.f15833a;
    }

    public final o c() {
        return this.f15835c;
    }

    public final com.waze.shared_infra.h.c d() {
        return this.f15834b;
    }

    public final Integer e() {
        return this.f15836d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return x.n(this.f15833a, pVar.f15833a) && x.n(this.f15834b, pVar.f15834b) && x.n(this.f15835c, pVar.f15835c) && x.n(this.f15836d, pVar.f15836d) && this.f15837e == pVar.f15837e;
    }

    public final int hashCode() {
        int iHashCode = (((this.f15833a.hashCode() * 31) + this.f15834b.hashCode()) * 31) + this.f15835c.hashCode();
        Integer num = this.f15836d;
        return (((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + a.a.b(this.f15837e);
    }

    public final String toString() {
        return "WazeAddress(address=" + this.f15833a + ", coordinates=" + this.f15834b + ", venueData=" + this.f15835c + ", internalId=" + this.f15836d + ", updatedTimeSec=" + this.f15837e + ")";
    }

    public /* synthetic */ p(a aVar, com.waze.shared_infra.h.c cVar, o oVar) {
        this(aVar, cVar, oVar, null, System.currentTimeMillis() / 1000);
    }
}
