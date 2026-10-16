package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hi extends com.waze.car_lib.o.ae {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f19655a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.modules.navigation.at f19656b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(com.waze.av.b.n nVar, com.waze.modules.navigation.at atVar) {
        super(null);
        h.g.b.x.f(nVar, "genericPlace");
        this.f19655a = nVar;
        this.f19656b = atVar;
    }

    public final com.waze.av.b.n a() {
        return this.f19655a;
    }

    public final com.waze.modules.navigation.at b() {
        return this.f19656b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi)) {
            return false;
        }
        hi hiVar = (hi) obj;
        return h.g.b.x.n(this.f19655a, hiVar.f19655a) && this.f19656b == hiVar.f19656b;
    }

    public final int hashCode() {
        int iHashCode = this.f19655a.hashCode() * 31;
        com.waze.modules.navigation.at atVar = this.f19656b;
        return iHashCode + (atVar == null ? 0 : atVar.hashCode());
    }

    public final String toString() {
        return "Navigate(genericPlace=" + this.f19655a + ", waypointStatus=" + this.f19656b + ")";
    }
}
