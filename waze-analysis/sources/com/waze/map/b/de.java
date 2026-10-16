package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class de implements cz {

    /* renamed from: a, reason: collision with root package name */
    private final long f28186a;

    public de(long j2) {
        this.f28186a = j2;
    }

    public final long a() {
        return this.f28186a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof de) && this.f28186a == ((de) obj).f28186a;
    }

    public final int hashCode() {
        return a.a.b(this.f28186a);
    }

    public final String toString() {
        return "RouteClicked(routeAltId=" + this.f28186a + ")";
    }
}
