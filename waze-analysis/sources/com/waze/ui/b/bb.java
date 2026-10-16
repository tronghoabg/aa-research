package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bb {

    /* renamed from: a, reason: collision with root package name */
    private final az f42033a;

    /* renamed from: b, reason: collision with root package name */
    private final az f42034b;

    public bb(az azVar, az azVar2) {
        h.g.b.x.f(azVar, "originToStopPoint");
        h.g.b.x.f(azVar2, "stopPointToDestination");
        this.f42033a = azVar;
        this.f42034b = azVar2;
    }

    public final az a() {
        return this.f42033a;
    }

    public final az b() {
        return this.f42034b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return h.g.b.x.n(this.f42033a, bbVar.f42033a) && h.g.b.x.n(this.f42034b, bbVar.f42034b);
    }

    public final int hashCode() {
        return (this.f42033a.hashCode() * 31) + this.f42034b.hashCode();
    }

    public final String toString() {
        return "WaypointSplitDuration(originToStopPoint=" + this.f42033a + ", stopPointToDestination=" + this.f42034b + ")";
    }
}
