package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ae extends com.waze.x.g {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f19353a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.d.k f19354b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(com.waze.av.b.n nVar, com.waze.av.d.k kVar) {
        super(null);
        h.g.b.x.f(nVar, "place");
        this.f19353a = nVar;
        this.f19354b = kVar;
    }

    public final com.waze.av.b.n a() {
        return this.f19353a;
    }

    public final com.waze.av.d.k b() {
        return this.f19354b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        return h.g.b.x.n(this.f19353a, aeVar.f19353a) && h.g.b.x.n(this.f19354b, aeVar.f19354b);
    }

    public final int hashCode() {
        int iHashCode = this.f19353a.hashCode() * 31;
        com.waze.av.d.k kVar = this.f19354b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "Show(place=" + this.f19353a + ", venue=" + this.f19354b + ")";
    }
}
