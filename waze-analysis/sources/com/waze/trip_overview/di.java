package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class di {

    /* renamed from: a, reason: collision with root package name */
    private final long f41357a;

    /* renamed from: b, reason: collision with root package name */
    private final long f41358b;

    /* renamed from: c, reason: collision with root package name */
    private final long f41359c;

    /* renamed from: d, reason: collision with root package name */
    private final long f41360d;

    public di(long j2, long j3, long j4, long j5) {
        this.f41357a = j2;
        this.f41358b = j3;
        this.f41359c = j4;
        this.f41360d = j5;
    }

    public final long a() {
        return this.f41360d;
    }

    public final long b() {
        return this.f41357a;
    }

    public final long c() {
        return this.f41359c;
    }

    public final long d() {
        return this.f41358b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di)) {
            return false;
        }
        di diVar = (di) obj;
        return this.f41357a == diVar.f41357a && this.f41358b == diVar.f41358b && this.f41359c == diVar.f41359c && this.f41360d == diVar.f41360d;
    }

    public final int hashCode() {
        int iB = a.a.b(this.f41357a) * 31;
        long j2 = this.f41360d;
        return ((((iB + a.a.b(this.f41358b)) * 31) + a.a.b(this.f41359c)) * 31) + a.a.b(j2);
    }

    public final String toString() {
        return "MapItemLocation(leftCoordinatePixels=" + this.f41357a + ", topCoordinatePixels=" + this.f41358b + ", rightCoordinatePixels=" + this.f41359c + ", bottomCoordinatePixels=" + this.f41360d + ")";
    }
}
