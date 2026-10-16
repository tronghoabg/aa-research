package com.waze.trip_overview.c.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.q.c f41164a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.b.n f41165b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.uid.r f41166c;

    public ac(com.waze.uid.r rVar, com.waze.shared_infra.q.c cVar, com.waze.av.b.n nVar) {
        h.g.b.x.f(rVar, "buttonType");
        this.f41166c = rVar;
        this.f41164a = cVar;
        this.f41165b = nVar;
    }

    public final com.waze.av.b.n a() {
        return this.f41165b;
    }

    public final com.waze.shared_infra.q.c b() {
        return this.f41164a;
    }

    public final com.waze.uid.r c() {
        return this.f41166c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return h.g.b.x.n(this.f41166c, acVar.f41166c) && h.g.b.x.n(this.f41164a, acVar.f41164a) && h.g.b.x.n(this.f41165b, acVar.f41165b);
    }

    public final int hashCode() {
        int iHashCode = this.f41166c.hashCode() * 31;
        com.waze.shared_infra.q.c cVar = this.f41164a;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        com.waze.av.b.n nVar = this.f41165b;
        return iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "MainButtonData(buttonType=" + this.f41166c + ", timeout=" + this.f41164a + ", destination=" + this.f41165b + ")";
    }
}
