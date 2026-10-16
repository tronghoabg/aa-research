package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    private final Long f31621a;

    /* renamed from: b, reason: collision with root package name */
    private final long f31622b;

    public bc(Long l2, long j2) {
        this.f31621a = l2;
        this.f31622b = j2;
    }

    public final long a() {
        return this.f31622b;
    }

    public final Long b() {
        return this.f31621a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        return h.g.b.x.n(this.f31621a, bcVar.f31621a) && this.f31622b == bcVar.f31622b;
    }

    public final int hashCode() {
        Long l2 = this.f31621a;
        return ((l2 == null ? 0 : l2.hashCode()) * 31) + a.a.b(this.f31622b);
    }

    public final String toString() {
        return "ElectricVehicleChargingStationInformation(slotsAvailable=" + this.f31621a + ", slotsCapacity=" + this.f31622b + ")";
    }
}
