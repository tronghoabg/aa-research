package com.waze.car_lib.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ab {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ads.a.f f18808a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18809b;

    /* renamed from: c, reason: collision with root package name */
    private final h.o.a f18810c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.av.d.k f18811d;

    private ab(com.waze.ads.a.f fVar, boolean z, h.o.a aVar, com.waze.av.d.k kVar) {
        this.f18808a = fVar;
        this.f18809b = z;
        this.f18810c = aVar;
        this.f18811d = kVar;
    }

    public static /* synthetic */ ab e(ab abVar, boolean z, h.o.a aVar, com.waze.av.d.k kVar, int i2) {
        com.waze.ads.a.f fVar = (i2 & 1) != 0 ? abVar.f18808a : null;
        if ((i2 & 2) != 0) {
            z = abVar.f18809b;
        }
        if ((i2 & 4) != 0) {
            aVar = abVar.f18810c;
        }
        if ((i2 & 8) != 0) {
            kVar = abVar.f18811d;
        }
        return new ab(fVar, z, aVar, kVar);
    }

    public final com.waze.ads.a.f a() {
        return this.f18808a;
    }

    public final com.waze.av.d.k b() {
        return this.f18811d;
    }

    public final h.o.a c() {
        return this.f18810c;
    }

    public final boolean d() {
        return this.f18809b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return h.g.b.x.n(this.f18808a, abVar.f18808a) && this.f18809b == abVar.f18809b && h.g.b.x.n(this.f18810c, abVar.f18810c) && h.g.b.x.n(this.f18811d, abVar.f18811d);
    }

    public final int hashCode() {
        com.waze.ads.a.f fVar = this.f18808a;
        int iHashCode = fVar == null ? 0 : fVar.hashCode();
        boolean z = this.f18809b;
        h.o.a aVar = this.f18810c;
        int iB = aVar == null ? 0 : a.a.b(aVar.w());
        int iA = a.a.a(z);
        int i2 = iHashCode * 31;
        com.waze.av.d.k kVar = this.f18811d;
        return ((((i2 + iA) * 31) + iB) * 31) + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        return "InternalState(adData=" + this.f18808a + ", isLoading=" + this.f18809b + ", detourDuration=" + this.f18810c + ", venueData=" + this.f18811d + ")";
    }

    public /* synthetic */ ab(com.waze.ads.a.f fVar) {
        this(fVar, false, null, null);
    }

    public /* synthetic */ ab() {
        this(null, true, null, null);
    }
}
