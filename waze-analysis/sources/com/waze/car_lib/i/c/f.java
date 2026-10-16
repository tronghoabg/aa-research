package com.waze.car_lib.i.c;

import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f extends dh {

    /* renamed from: a, reason: collision with root package name */
    private final long f20095a;

    public f(long j2) {
        super(null);
        this.f20095a = j2;
    }

    public final long a() {
        return this.f20095a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f20095a == ((f) obj).f20095a;
    }

    public final int hashCode() {
        return a.a.b(this.f20095a);
    }

    public final String toString() {
        return "TrafficMeter(minutesLeft=" + this.f20095a + ")";
    }
}
