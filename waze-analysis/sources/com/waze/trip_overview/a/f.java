package com.waze.trip_overview.a;

import com.waze.map.b.fk;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final fk f40987a;

    /* renamed from: b, reason: collision with root package name */
    private final fk f40988b;

    /* renamed from: c, reason: collision with root package name */
    private final fk f40989c;

    public f(fk fkVar, fk fkVar2, fk fkVar3) {
        x.f(fkVar, "zoomIn");
        x.f(fkVar2, "zoomMedium");
        x.f(fkVar3, "zoomOut");
        this.f40987a = fkVar;
        this.f40988b = fkVar2;
        this.f40989c = fkVar3;
    }

    public final fk a() {
        return this.f40987a;
    }

    public final fk b() {
        return this.f40988b;
    }

    public final fk c() {
        return this.f40989c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return x.n(this.f40987a, fVar.f40987a) && x.n(this.f40988b, fVar.f40988b) && x.n(this.f40989c, fVar.f40989c);
    }

    public final int hashCode() {
        return (((this.f40987a.hashCode() * 31) + this.f40988b.hashCode()) * 31) + this.f40989c.hashCode();
    }

    public final String toString() {
        return "ZoomLevels(zoomIn=" + this.f40987a + ", zoomMedium=" + this.f40988b + ", zoomOut=" + this.f40989c + ")";
    }
}
