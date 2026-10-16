package com.waze.car_lib.g;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19789a;

    /* renamed from: b, reason: collision with root package name */
    private final long f19790b;

    /* renamed from: c, reason: collision with root package name */
    private final long f19791c;

    public c(boolean z, long j2, long j3) {
        this.f19789a = z;
        this.f19790b = j2;
        this.f19791c = j3;
    }

    public final long a() {
        return this.f19790b;
    }

    public final long b() {
        return this.f19791c;
    }

    public final boolean c() {
        return this.f19789a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f19789a == cVar.f19789a && this.f19790b == cVar.f19790b && this.f19791c == cVar.f19791c;
    }

    public final int hashCode() {
        return (((a.a.a(this.f19789a) * 31) + a.a.b(this.f19790b)) * 31) + a.a.b(this.f19791c);
    }

    public final String toString() {
        return "LcvConfig(featureEnabled=" + this.f19789a + ", midSizedVehicleLowerBoundInMillimeters=" + this.f19790b + ", midSizedVehicleUpperBoundInMillimeters=" + this.f19791c + ")";
    }
}
