package com.waze.location.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class q extends s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.location.x f25213a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.waze.location.x xVar) {
        super(null);
        h.g.b.x.f(xVar, "locationInfo");
        this.f25213a = xVar;
    }

    public final com.waze.location.x a() {
        return this.f25213a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && h.g.b.x.n(this.f25213a, ((q) obj).f25213a);
    }

    public final int hashCode() {
        return this.f25213a.hashCode();
    }

    public final String toString() {
        return "LocationEmit(locationInfo=" + this.f25213a + ")";
    }
}
