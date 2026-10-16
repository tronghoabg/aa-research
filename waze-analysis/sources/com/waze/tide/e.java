package com.waze.tide;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.e.c f40932a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bz.a f40933b;

    public e(com.waze.bz.a aVar, com.waze.sharedui.e.c cVar) {
        h.g.b.x.f(aVar, "bluetoothDeviceProperties");
        this.f40933b = aVar;
        this.f40932a = cVar;
    }

    public final com.waze.sharedui.e.c a() {
        return this.f40932a;
    }

    public final com.waze.bz.a b() {
        return this.f40933b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return h.g.b.x.n(this.f40933b, eVar.f40933b) && h.g.b.x.n(this.f40932a, eVar.f40932a);
    }

    public final int hashCode() {
        int iHashCode = this.f40933b.hashCode() * 31;
        com.waze.sharedui.e.c cVar = this.f40932a;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "DriveDetectionReport(bluetoothDeviceProperties=" + this.f40933b + ", location=" + this.f40932a + ")";
    }
}
