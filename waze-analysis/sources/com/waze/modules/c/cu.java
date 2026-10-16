package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cu {

    /* renamed from: a, reason: collision with root package name */
    private final int f30009a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30010b;

    /* renamed from: c, reason: collision with root package name */
    private final long f30011c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f30012d;

    public /* synthetic */ cu(int i2, int i3, long j2, com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "coordinate");
        this.f30009a = i2;
        this.f30010b = i3;
        this.f30011c = j2;
        this.f30012d = cVar;
    }

    public final long a() {
        return this.f30011c;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f30012d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu)) {
            return false;
        }
        cu cuVar = (cu) obj;
        return this.f30009a == cuVar.f30009a && this.f30010b == cuVar.f30010b && h.o.a.A(this.f30011c, cuVar.f30011c) && h.g.b.x.n(this.f30012d, cuVar.f30012d);
    }

    public final int hashCode() {
        h.o.c cVar = h.o.a.f48264a;
        int i2 = this.f30009a * 31;
        com.waze.shared_infra.h.c cVar2 = this.f30012d;
        return ((((i2 + this.f30010b) * 31) + a.a.b(this.f30011c)) * 31) + cVar2.hashCode();
    }

    public final String toString() {
        return "RouteWaypoint(id=" + this.f30009a + ", lengthToWaypointMeters=" + this.f30010b + ", timeToWaypoint=" + h.o.a.y(this.f30011c) + ", coordinate=" + this.f30012d + ")";
    }
}
