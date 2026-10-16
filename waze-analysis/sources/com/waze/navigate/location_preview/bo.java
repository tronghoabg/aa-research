package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bo {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31675a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f31676b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.av.d.k f31677c;

    public bo(boolean z, Integer num, com.waze.av.d.k kVar) {
        h.g.b.x.f(kVar, "parkingForVenue");
        this.f31675a = z;
        this.f31676b = num;
        this.f31677c = kVar;
    }

    public final com.waze.av.d.k a() {
        return this.f31677c;
    }

    public final Integer b() {
        return this.f31676b;
    }

    public final boolean c() {
        return this.f31675a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo)) {
            return false;
        }
        bo boVar = (bo) obj;
        return this.f31675a == boVar.f31675a && h.g.b.x.n(this.f31676b, boVar.f31676b) && h.g.b.x.n(this.f31677c, boVar.f31677c);
    }

    public final int hashCode() {
        Integer num = this.f31676b;
        return (((a.a.a(this.f31675a) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.f31677c.hashCode();
    }

    public final String toString() {
        return "ParkingData(popular=" + this.f31675a + ", walkingMinutes=" + this.f31676b + ", parkingForVenue=" + this.f31677c + ")";
    }
}
