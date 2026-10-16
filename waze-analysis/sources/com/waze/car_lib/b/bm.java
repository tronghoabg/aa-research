package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bm extends com.waze.alerters.a.k {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.b.at f19034a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19035b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.b.a.a f19036c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(com.waze.reports_v2.b.at atVar, int i2, com.waze.car_lib.b.a.a aVar) {
        super(null);
        h.g.b.x.f(aVar, "uiItem");
        this.f19034a = atVar;
        this.f19035b = i2;
        this.f19036c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        return this.f19034a == bmVar.f19034a && this.f19035b == bmVar.f19035b && h.g.b.x.n(this.f19036c, bmVar.f19036c);
    }

    public final com.waze.car_lib.b.a.a f() {
        return this.f19036c;
    }

    public final int hashCode() {
        com.waze.reports_v2.b.at atVar = this.f19034a;
        return ((((atVar == null ? 0 : atVar.hashCode()) * 31) + this.f19035b) * 31) + this.f19036c.hashCode();
    }

    public final String toString() {
        return "Success(reportedType=" + this.f19034a + ", pointsAwarded=" + this.f19035b + ", uiItem=" + this.f19036c + ")";
    }
}
