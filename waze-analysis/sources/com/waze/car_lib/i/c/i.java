package com.waze.car_lib.i.c;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    private final long f20108a;

    public i(long j2) {
        this.f20108a = j2;
    }

    public final long a() {
        return this.f20108a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f20108a == ((i) obj).f20108a;
    }

    public final int hashCode() {
        return a.a.b(this.f20108a);
    }

    public final String toString() {
        return "AvgSpeedCam(distanceLeftMeters=" + this.f20108a + ")";
    }
}
