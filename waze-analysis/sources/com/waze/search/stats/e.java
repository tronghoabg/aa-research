package com.waze.search.stats;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f36022a;

    /* renamed from: b, reason: collision with root package name */
    private final q f36023b;

    /* renamed from: c, reason: collision with root package name */
    private final f f36024c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f36025d;

    public e(String str, q qVar, f fVar, com.waze.shared_infra.h.c cVar) {
        this.f36022a = str;
        this.f36023b = qVar;
        this.f36024c = fVar;
        this.f36025d = cVar;
    }

    public final f a() {
        return this.f36024c;
    }

    public final q b() {
        return this.f36023b;
    }

    public final com.waze.shared_infra.h.c c() {
        return this.f36025d;
    }

    public final String d() {
        return this.f36022a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return x.n(this.f36022a, eVar.f36022a) && this.f36023b == eVar.f36023b && this.f36024c == eVar.f36024c && x.n(this.f36025d, eVar.f36025d);
    }

    public final int hashCode() {
        String str = this.f36022a;
        int iHashCode = str == null ? 0 : str.hashCode();
        q qVar = this.f36023b;
        int iHashCode2 = qVar == null ? 0 : qVar.hashCode();
        int i2 = iHashCode * 31;
        f fVar = this.f36024c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (fVar == null ? 0 : fVar.hashCode())) * 31;
        com.waze.shared_infra.h.c cVar = this.f36025d;
        return iHashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "DestinationCard(venueId=" + this.f36022a + ", cardTrigger=" + this.f36023b + ", destinationType=" + this.f36024c + ", destinationCoordinates=" + this.f36025d + ")";
    }
}
