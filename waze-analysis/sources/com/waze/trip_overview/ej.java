package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ej extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.de f41433a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(com.waze.map.b.de deVar) {
        super(null);
        h.g.b.x.f(deVar, "mapEvent");
        this.f41433a = deVar;
    }

    public final com.waze.map.b.de a() {
        return this.f41433a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ej) && h.g.b.x.n(this.f41433a, ((ej) obj).f41433a);
    }

    public final int hashCode() {
        return this.f41433a.hashCode();
    }

    public final String toString() {
        return "MapRouteClicked(mapEvent=" + this.f41433a + ")";
    }
}
