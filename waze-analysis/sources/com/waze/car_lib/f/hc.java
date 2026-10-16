package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hc extends com.waze.car_lib.o.ae {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f19645a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.d.k f19646b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f19647c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f19648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(com.waze.av.b.n nVar, com.waze.av.d.k kVar, boolean z, boolean z2) {
        super(null);
        h.g.b.x.f(nVar, "place");
        this.f19645a = nVar;
        this.f19646b = kVar;
        this.f19647c = z;
        this.f19648d = z2;
    }

    public final com.waze.av.b.n a() {
        return this.f19645a;
    }

    public final com.waze.av.d.k b() {
        return this.f19646b;
    }

    public final boolean c() {
        return this.f19647c;
    }

    public final boolean d() {
        return this.f19648d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc)) {
            return false;
        }
        hc hcVar = (hc) obj;
        return h.g.b.x.n(this.f19645a, hcVar.f19645a) && h.g.b.x.n(this.f19646b, hcVar.f19646b) && this.f19647c == hcVar.f19647c && this.f19648d == hcVar.f19648d;
    }

    public final int hashCode() {
        int iHashCode = this.f19645a.hashCode() * 31;
        com.waze.av.d.k kVar = this.f19646b;
        return ((((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31) + a.a.a(this.f19647c)) * 31) + a.a.a(this.f19648d);
    }

    public final String toString() {
        return "PlaceSelected(place=" + this.f19645a + ", venue=" + this.f19646b + ", enablePreview=" + this.f19647c + ", isSingleSearchResults=" + this.f19648d + ")";
    }

    public /* synthetic */ hc(com.waze.av.b.n nVar, com.waze.av.d.k kVar, boolean z) {
        this(nVar, kVar, z, false);
    }
}
