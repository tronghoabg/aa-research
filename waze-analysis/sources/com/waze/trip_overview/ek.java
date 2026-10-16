package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ek extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.dx f41434a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(com.waze.map.b.dx dxVar) {
        super(null);
        h.g.b.x.f(dxVar, "skinState");
        this.f41434a = dxVar;
    }

    public final com.waze.map.b.dx a() {
        return this.f41434a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ek) && this.f41434a == ((ek) obj).f41434a;
    }

    public final int hashCode() {
        return this.f41434a.hashCode();
    }

    public final String toString() {
        return "MapSkinChanged(skinState=" + this.f41434a + ")";
    }
}
