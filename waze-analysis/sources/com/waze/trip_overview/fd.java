package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fd extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.modules.c.de f41459a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(com.waze.modules.c.de deVar) {
        super(null);
        h.g.b.x.f(deVar, "vehicleType");
        this.f41459a = deVar;
    }

    public final com.waze.modules.c.de a() {
        return this.f41459a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd) && this.f41459a == ((fd) obj).f41459a;
    }

    public final int hashCode() {
        return this.f41459a.hashCode();
    }

    public final String toString() {
        return "VehicleTypeSelected(vehicleType=" + this.f41459a + ")";
    }
}
