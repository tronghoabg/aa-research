package com.google.firebase.perf.e;

import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final long f10402a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10403b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeUnit f10404c;

    public i(long j2, long j3, TimeUnit timeUnit) {
        this.f10402a = j2;
        this.f10403b = j3;
        this.f10404c = timeUnit;
    }

    public final double a() {
        double d2;
        double d3;
        int i2 = h.f10401a[this.f10404c.ordinal()];
        if (i2 == 1) {
            long j2 = this.f10402a;
            long j3 = this.f10403b;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            d2 = j2 / j3;
            d3 = 1.0E9d;
        } else {
            if (i2 != 2) {
                long j4 = this.f10402a;
                if (i2 != 3) {
                    return j4 / r1.toSeconds(this.f10403b);
                }
                long j5 = this.f10403b;
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                return (j4 / j5) * 1000.0d;
            }
            long j6 = this.f10402a;
            long j7 = this.f10403b;
            TimeUnit timeUnit3 = TimeUnit.SECONDS;
            d2 = j6 / j7;
            d3 = 1000000.0d;
        }
        return d2 * d3;
    }
}
