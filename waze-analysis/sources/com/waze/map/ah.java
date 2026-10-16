package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f27938a;

    /* renamed from: b, reason: collision with root package name */
    private final ag f27939b;

    /* renamed from: c, reason: collision with root package name */
    private final float f27940c;

    /* renamed from: d, reason: collision with root package name */
    private final int f27941d;

    public ah(com.waze.shared_infra.h.c cVar, ag agVar, float f2, int i2) {
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(agVar, "mapLine");
        this.f27938a = cVar;
        this.f27939b = agVar;
        this.f27940c = f2;
        this.f27941d = i2;
    }

    public final float a() {
        return this.f27940c;
    }

    public final int b() {
        return this.f27941d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return h.g.b.x.n(this.f27938a, ahVar.f27938a) && h.g.b.x.n(this.f27939b, ahVar.f27939b) && Float.compare(this.f27940c, ahVar.f27940c) == 0 && this.f27941d == ahVar.f27941d;
    }

    public final int hashCode() {
        return (((((this.f27938a.hashCode() * 31) + this.f27939b.hashCode()) * 31) + Float.floatToIntBits(this.f27940c)) * 31) + this.f27941d;
    }

    public final String toString() {
        return "MapLineIntersectionMetadata(coordinate=" + this.f27938a + ", mapLine=" + this.f27939b + ", azimuth=" + this.f27940c + ", distanceMeters=" + this.f27941d + ")";
    }
}
