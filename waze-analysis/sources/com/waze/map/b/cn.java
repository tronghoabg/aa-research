package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cn extends com.waze.destination_cell.b.e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.z.a.e.b f28152a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.destination_cell.b.e f28153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(com.waze.z.a.e.b bVar, com.waze.destination_cell.b.e eVar) {
        super(null);
        h.g.b.x.f(bVar, "zoomBehavior");
        this.f28152a = bVar;
        this.f28153b = eVar;
    }

    public static /* synthetic */ cn j(cn cnVar, com.waze.z.a.e.b bVar, com.waze.destination_cell.b.e eVar, int i2) {
        if ((i2 & 1) != 0) {
            bVar = cnVar.f28152a;
        }
        if ((i2 & 2) != 0) {
            eVar = cnVar.f28153b;
        }
        h.g.b.x.f(bVar, "zoomBehavior");
        return new cn(bVar, eVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn)) {
            return false;
        }
        cn cnVar = (cn) obj;
        return h.g.b.x.n(this.f28152a, cnVar.f28152a) && h.g.b.x.n(this.f28153b, cnVar.f28153b);
    }

    public final com.waze.z.a.e.b h() {
        return this.f28152a;
    }

    public final int hashCode() {
        int iHashCode = this.f28152a.hashCode() * 31;
        com.waze.destination_cell.b.e eVar = this.f28153b;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final com.waze.destination_cell.b.e i() {
        return this.f28153b;
    }

    public final String toString() {
        return "ContinuouslyTrackUserLocation(zoomBehavior=" + this.f28152a + ", userLocation=" + this.f28153b + ")";
    }
}
