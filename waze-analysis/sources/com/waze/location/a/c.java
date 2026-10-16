package com.waze.location.a;

import android.location.Location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Location f25188a;

    /* renamed from: b, reason: collision with root package name */
    private final long f25189b;

    /* renamed from: c, reason: collision with root package name */
    private final long f25190c;

    public c(Location location, long j2, long j3) {
        h.g.b.x.f(location, "location");
        this.f25188a = location;
        this.f25189b = j2;
        this.f25190c = j3;
    }

    public final long a() {
        return this.f25189b;
    }

    public final long b() {
        return this.f25190c;
    }

    public final Location c() {
        return this.f25188a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.g.b.x.n(this.f25188a, cVar.f25188a) && this.f25189b == cVar.f25189b && this.f25190c == cVar.f25190c;
    }

    public final int hashCode() {
        return (((this.f25188a.hashCode() * 31) + a.a.b(this.f25189b)) * 31) + a.a.b(this.f25190c);
    }

    public final String toString() {
        return "LocationData(location=" + this.f25188a + ", insertionTimeMs=" + this.f25189b + ", lastModifiedCoordinatesMs=" + this.f25190c + ")";
    }
}
