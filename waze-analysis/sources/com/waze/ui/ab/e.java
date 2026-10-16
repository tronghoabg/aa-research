package com.waze.ui.ab;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final c f41737a;

    /* renamed from: b, reason: collision with root package name */
    private final d f41738b;

    public e(c cVar, d dVar) {
        x.f(dVar, "impact");
        this.f41737a = cVar;
        this.f41738b = dVar;
    }

    public final c a() {
        return this.f41737a;
    }

    public final d b() {
        return this.f41738b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return x.n(this.f41737a, eVar.f41737a) && this.f41738b == eVar.f41738b;
    }

    public final int hashCode() {
        c cVar = this.f41737a;
        return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f41738b.hashCode();
    }

    public final String toString() {
        return "State(cause=" + this.f41737a + ", impact=" + this.f41738b + ")";
    }
}
