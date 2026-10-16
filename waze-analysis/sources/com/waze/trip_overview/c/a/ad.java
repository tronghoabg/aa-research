package com.waze.trip_overview.c.a;

import com.waze.map.b.bi;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.canvas.a.b f41167a;

    /* renamed from: b, reason: collision with root package name */
    private final bi f41168b;

    public ad(com.waze.map.canvas.a.b bVar, bi biVar) {
        h.g.b.x.f(bVar, "bounds");
        h.g.b.x.f(biVar, "content");
        this.f41167a = bVar;
        this.f41168b = biVar;
    }

    public final com.waze.map.canvas.a.b a() {
        return this.f41167a;
    }

    public final bi b() {
        return this.f41168b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return h.g.b.x.n(this.f41167a, adVar.f41167a) && h.g.b.x.n(this.f41168b, adVar.f41168b);
    }

    public final int hashCode() {
        return (this.f41167a.hashCode() * 31) + this.f41168b.hashCode();
    }

    public final String toString() {
        return "MapData(bounds=" + this.f41167a + ", content=" + this.f41168b + ")";
    }
}
