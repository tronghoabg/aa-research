package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bi extends com.waze.design_components.g.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f19423a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.d.k f19424b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(com.waze.av.b.n nVar, com.waze.av.d.k kVar) {
        super(null);
        h.g.b.x.f(nVar, "place");
        h.g.b.x.f(kVar, "venue");
        this.f19423a = nVar;
        this.f19424b = kVar;
    }

    public final com.waze.av.b.n a() {
        return this.f19423a;
    }

    public final com.waze.av.d.k b() {
        return this.f19424b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi)) {
            return false;
        }
        bi biVar = (bi) obj;
        return h.g.b.x.n(this.f19423a, biVar.f19423a) && h.g.b.x.n(this.f19424b, biVar.f19424b);
    }

    public final int hashCode() {
        return (this.f19423a.hashCode() * 31) + this.f19424b.hashCode();
    }

    public final String toString() {
        return "PreviewVenueLocation(place=" + this.f19423a + ", venue=" + this.f19424b + ")";
    }
}
