package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final long f41606a;

    /* renamed from: b, reason: collision with root package name */
    private final long f41607b;

    public y(long j2, long j3) {
        this.f41606a = j2;
        this.f41607b = j3;
    }

    public final long a() {
        return this.f41606a;
    }

    public final long b() {
        return this.f41607b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f41606a == yVar.f41606a && this.f41607b == yVar.f41607b;
    }

    public final int hashCode() {
        return (a.a.b(this.f41606a) * 31) + a.a.b(this.f41607b);
    }

    public final String toString() {
        return "TimerGpsBehavior(durationSeconds=" + this.f41606a + ", maxSupportedAccuracyMeters=" + this.f41607b + ")";
    }
}
