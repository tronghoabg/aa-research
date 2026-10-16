package com.waze.bk;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private long f16837a = SystemClock.elapsedRealtime();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f16838b = new AtomicLong(a(30));

    private static final long a(int i2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return 1000 / i2;
    }

    public final void c() {
        this.f16837a = SystemClock.elapsedRealtime();
    }

    protected final void d(int i2) {
        this.f16838b.set(a(i2));
    }

    public final boolean e() {
        long j2 = this.f16838b.get();
        return j2 != -1 && SystemClock.elapsedRealtime() - this.f16837a < j2;
    }
}
