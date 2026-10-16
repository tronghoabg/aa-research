package com.waze.car_lib.a;

import com.waze.modules.navigation.at;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g extends com.waze.car_lib.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f18833a;

    /* renamed from: b, reason: collision with root package name */
    private final at f18834b;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(com.waze.av.b.n nVar, at atVar) {
        h.g.b.x.f(nVar, "place");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f18833a = nVar;
        this.f18834b = atVar;
    }

    public final com.waze.av.b.n e() {
        return this.f18833a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return h.g.b.x.n(this.f18833a, gVar.f18833a) && this.f18834b == gVar.f18834b;
    }

    public final at f() {
        return this.f18834b;
    }

    public final int hashCode() {
        int iHashCode = this.f18833a.hashCode() * 31;
        at atVar = this.f18834b;
        return iHashCode + (atVar == null ? 0 : atVar.hashCode());
    }

    public final String toString() {
        return "Navigate(place=" + this.f18833a + ", waypointStatus=" + this.f18834b + ")";
    }
}
