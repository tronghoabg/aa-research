package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class by {

    /* renamed from: a, reason: collision with root package name */
    private final Long f31153a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f31154b;

    public by(Long l2, Long l3) {
        this.f31153a = l2;
        this.f31154b = l3;
    }

    public final Long a() {
        return this.f31153a;
    }

    public final Long b() {
        return this.f31154b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by)) {
            return false;
        }
        by byVar = (by) obj;
        return h.g.b.x.n(this.f31153a, byVar.f31153a) && h.g.b.x.n(this.f31154b, byVar.f31154b);
    }

    public final int hashCode() {
        Long l2 = this.f31153a;
        int iHashCode = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.f31154b;
        return (iHashCode * 31) + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        return "DistanceAndETA(distanceMeters=" + this.f31153a + ", etaMinutes=" + this.f31154b + ")";
    }
}
