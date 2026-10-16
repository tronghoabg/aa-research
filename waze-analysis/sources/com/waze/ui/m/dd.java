package com.waze.ui.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dd {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f42949a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.n f42950b;

    public dd(com.waze.ui.ac.n nVar, com.waze.ui.ac.n nVar2) {
        this.f42949a = nVar;
        this.f42950b = nVar2;
    }

    public final com.waze.ui.ac.n a() {
        return this.f42950b;
    }

    public final com.waze.ui.ac.n b() {
        return this.f42949a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd)) {
            return false;
        }
        dd ddVar = (dd) obj;
        return h.g.b.x.n(this.f42949a, ddVar.f42949a) && h.g.b.x.n(this.f42950b, ddVar.f42950b);
    }

    public final int hashCode() {
        com.waze.ui.ac.n nVar = this.f42949a;
        int iHashCode = nVar == null ? 0 : nVar.hashCode();
        com.waze.ui.ac.n nVar2 = this.f42950b;
        return (iHashCode * 31) + (nVar2 != null ? nVar2.hashCode() : 0);
    }

    public final String toString() {
        return "LocationPreviewParkingInfo(title=" + this.f42949a + ", subtitle=" + this.f42950b + ")";
    }
}
