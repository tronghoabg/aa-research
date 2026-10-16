package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ed extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.dm f41427a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(com.waze.map.b.dm dmVar) {
        super(null);
        h.g.b.x.f(dmVar, "mapVisibleArea");
        this.f41427a = dmVar;
    }

    public final com.waze.map.b.dm a() {
        return this.f41427a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed) && h.g.b.x.n(this.f41427a, ((ed) obj).f41427a);
    }

    public final int hashCode() {
        return this.f41427a.hashCode();
    }

    public final String toString() {
        return "InitialMapVisibleArea(mapVisibleArea=" + this.f41427a + ")";
    }
}
