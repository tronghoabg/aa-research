package com.waze.reports_v2.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t extends y {

    /* renamed from: a, reason: collision with root package name */
    private final at f34129a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34130b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f34131c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34132d;

    public t(at atVar, int i2, Long l2, String str) {
        super(null);
        this.f34129a = atVar;
        this.f34130b = i2;
        this.f34131c = l2;
        this.f34132d = str;
    }

    public final int a() {
        return this.f34130b;
    }

    public final at b() {
        return this.f34129a;
    }

    public final Long c() {
        return this.f34131c;
    }

    public final String d() {
        return this.f34132d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f34129a == tVar.f34129a && this.f34130b == tVar.f34130b && h.g.b.x.n(this.f34131c, tVar.f34131c) && h.g.b.x.n(this.f34132d, tVar.f34132d);
    }

    public final int hashCode() {
        at atVar = this.f34129a;
        int iHashCode = atVar == null ? 0 : atVar.hashCode();
        int i2 = this.f34130b;
        Long l2 = this.f34131c;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        int i3 = (iHashCode * 31) + i2;
        String str = this.f34132d;
        return (((i3 * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AlertReported(reportedSubtype=" + this.f34129a + ", receivedPointsCount=" + this.f34130b + ", alertId=" + this.f34131c + ", alertUuid=" + this.f34132d + ")";
    }
}
