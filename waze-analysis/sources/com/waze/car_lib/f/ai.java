package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ai extends com.waze.design_components.d.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f19358a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.modules.navigation.at f19359b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(com.waze.av.b.n nVar, com.waze.modules.navigation.at atVar) {
        super(null);
        h.g.b.x.f(nVar, "place");
        this.f19358a = nVar;
        this.f19359b = atVar;
    }

    public final com.waze.av.b.n a() {
        return this.f19358a;
    }

    public final com.waze.modules.navigation.at b() {
        return this.f19359b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        return h.g.b.x.n(this.f19358a, aiVar.f19358a) && this.f19359b == aiVar.f19359b;
    }

    public final int hashCode() {
        int iHashCode = this.f19358a.hashCode() * 31;
        com.waze.modules.navigation.at atVar = this.f19359b;
        return iHashCode + (atVar == null ? 0 : atVar.hashCode());
    }

    public final String toString() {
        return "Navigate(place=" + this.f19358a + ", waypointStatus=" + this.f19359b + ")";
    }
}
