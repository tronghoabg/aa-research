package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class eg extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final long f41430a;

    public eg(long j2) {
        super(null);
        this.f41430a = j2;
    }

    public final long a() {
        return this.f41430a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg) && this.f41430a == ((eg) obj).f41430a;
    }

    public final int hashCode() {
        return a.a.b(this.f41430a);
    }

    public final String toString() {
        return "MapMarkerClicked(routeAltId=" + this.f41430a + ")";
    }
}
