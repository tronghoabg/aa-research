package com.waze.car_lib.a;

import com.waze.modules.navigation.at;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n extends com.waze.c.c.e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f18841a;

    /* renamed from: b, reason: collision with root package name */
    private final at f18842b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.waze.av.b.n nVar, at atVar) {
        super(null);
        h.g.b.x.f(nVar, "place");
        this.f18841a = nVar;
        this.f18842b = atVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return h.g.b.x.n(this.f18841a, nVar.f18841a) && this.f18842b == nVar.f18842b;
    }

    public final int hashCode() {
        int iHashCode = this.f18841a.hashCode() * 31;
        at atVar = this.f18842b;
        return iHashCode + (atVar == null ? 0 : atVar.hashCode());
    }

    public final com.waze.av.b.n p() {
        return this.f18841a;
    }

    public final at q() {
        return this.f18842b;
    }

    public final String toString() {
        return "Navigate(place=" + this.f18841a + ", waypointStatus=" + this.f18842b + ")";
    }
}
