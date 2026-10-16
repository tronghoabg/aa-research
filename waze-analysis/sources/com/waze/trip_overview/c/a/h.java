package com.waze.trip_overview.c.a;

import com.waze.map.b.dz;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.canvas.a.b f41216a;

    /* renamed from: b, reason: collision with root package name */
    private final dz f41217b;

    public h(com.waze.map.canvas.a.b bVar, dz dzVar) {
        h.g.b.x.f(bVar, "bounds");
        h.g.b.x.f(dzVar, "viewportArea");
        this.f41216a = bVar;
        this.f41217b = dzVar;
    }

    public final com.waze.map.canvas.a.b a() {
        return this.f41216a;
    }

    public final dz b() {
        return this.f41217b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return h.g.b.x.n(this.f41216a, hVar.f41216a) && h.g.b.x.n(this.f41217b, hVar.f41217b);
    }

    public final int hashCode() {
        return (this.f41216a.hashCode() * 31) + this.f41217b.hashCode();
    }

    public final String toString() {
        return "MapBoundsAndViewport(bounds=" + this.f41216a + ", viewportArea=" + this.f41217b + ")";
    }
}
