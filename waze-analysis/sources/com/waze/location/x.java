package com.waze.location;

import android.location.Location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final Location f25433a;

    /* renamed from: b, reason: collision with root package name */
    private final bf f25434b;

    public x(Location location, bf bfVar) {
        h.g.b.x.f(location, "location");
        h.g.b.x.f(bfVar, "source");
        this.f25433a = location;
        this.f25434b = bfVar;
    }

    public final Location a() {
        return this.f25433a;
    }

    public final bf b() {
        return this.f25434b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return h.g.b.x.n(this.f25433a, xVar.f25433a) && this.f25434b == xVar.f25434b;
    }

    public final int hashCode() {
        return (this.f25433a.hashCode() * 31) + this.f25434b.hashCode();
    }

    public final String toString() {
        return "LocationInfo(location=" + this.f25433a + ", source=" + this.f25434b + ")";
    }
}
