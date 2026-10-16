package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ac extends com.waze.x.g {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f19349a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19350b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.modules.navigation.at f19351c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(com.waze.av.b.n nVar, boolean z, com.waze.modules.navigation.at atVar) {
        super(null);
        h.g.b.x.f(nVar, "place");
        this.f19349a = nVar;
        this.f19350b = z;
        this.f19351c = atVar;
    }

    public final com.waze.av.b.n a() {
        return this.f19349a;
    }

    public final com.waze.modules.navigation.at b() {
        return this.f19351c;
    }

    public final boolean c() {
        return this.f19350b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return h.g.b.x.n(this.f19349a, acVar.f19349a) && this.f19350b == acVar.f19350b && this.f19351c == acVar.f19351c;
    }

    public final int hashCode() {
        int iHashCode = this.f19349a.hashCode() * 31;
        com.waze.modules.navigation.at atVar = this.f19351c;
        return ((iHashCode + a.a.a(this.f19350b)) * 31) + (atVar == null ? 0 : atVar.hashCode());
    }

    public final String toString() {
        return "Navigate(place=" + this.f19349a + ", isDangerArea=" + this.f19350b + ", waypointStatus=" + this.f19351c + ")";
    }
}
