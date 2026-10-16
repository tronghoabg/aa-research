package com.waze.map.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fi {

    /* renamed from: a, reason: collision with root package name */
    private final List f28335a;

    /* renamed from: b, reason: collision with root package name */
    private final fj f28336b;

    /* renamed from: c, reason: collision with root package name */
    private final fk f28337c;

    public fi(List list, fj fjVar, fk fkVar) {
        h.g.b.x.f(list, "positions");
        h.g.b.x.f(fjVar, "style");
        h.g.b.x.f(fkVar, "zoomLevelDisplayRange");
        this.f28335a = list;
        this.f28336b = fjVar;
        this.f28337c = fkVar;
    }

    public final fj a() {
        return this.f28336b;
    }

    public final fk b() {
        return this.f28337c;
    }

    public final List c() {
        return this.f28335a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi)) {
            return false;
        }
        fi fiVar = (fi) obj;
        return h.g.b.x.n(this.f28335a, fiVar.f28335a) && this.f28336b == fiVar.f28336b && h.g.b.x.n(this.f28337c, fiVar.f28337c);
    }

    public final int hashCode() {
        return (((this.f28335a.hashCode() * 31) + this.f28336b.hashCode()) * 31) + this.f28337c.hashCode();
    }

    public final String toString() {
        return "PolylineData(positions=" + this.f28335a + ", style=" + this.f28336b + ", zoomLevelDisplayRange=" + this.f28337c + ")";
    }

    public /* synthetic */ fi(List list, fj fjVar) {
        this(list, fjVar, new fk(null));
    }
}
