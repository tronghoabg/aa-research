package com.waze.location;

import android.location.Location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Location f25385a;

    /* renamed from: b, reason: collision with root package name */
    private final float f25386b;

    public c(Location location, float f2) {
        h.g.b.x.f(location, "location");
        this.f25385a = location;
        this.f25386b = f2;
    }

    public final float a() {
        return this.f25386b;
    }

    public final Location b() {
        return this.f25385a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.g.b.x.n(this.f25385a, cVar.f25385a) && Float.compare(this.f25386b, cVar.f25386b) == 0;
    }

    public final int hashCode() {
        return (this.f25385a.hashCode() * 31) + Float.floatToIntBits(this.f25386b);
    }

    public final String toString() {
        return "LocationWithDistance(location=" + this.f25385a + ", distanceToNextLocationMeters=" + this.f25386b + ")";
    }
}
