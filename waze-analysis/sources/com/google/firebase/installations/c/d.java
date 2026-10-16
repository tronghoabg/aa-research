package com.google.firebase.installations.c;

import androidx.compose.material3.internal.CalendarModelKt;
import com.google.firebase.installations.m;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final long f10021a;

    /* renamed from: b, reason: collision with root package name */
    private static final long f10022b;

    /* renamed from: c, reason: collision with root package name */
    private long f10023c;

    /* renamed from: d, reason: collision with root package name */
    private int f10024d;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        f10021a = CalendarModelKt.MillisecondsIn24Hours;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f10022b = 1800000L;
    }

    d() {
        m.b();
    }

    private final synchronized long c(int i2) {
        if (i2 == 429 || (i2 >= 500 && i2 < 600)) {
            return (long) Math.min(Math.pow(2.0d, this.f10024d) + ((long) (Math.random() * 1000.0d)), f10022b);
        }
        return f10021a;
    }

    private final synchronized void d() {
        this.f10024d = 0;
    }

    public final synchronized void a(int i2) {
        if ((i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404) {
            d();
            return;
        }
        this.f10024d++;
        this.f10023c = System.currentTimeMillis() + c(i2);
    }

    public final synchronized boolean b() {
        if (this.f10024d != 0) {
            if (System.currentTimeMillis() <= this.f10023c) {
                return false;
            }
        }
        return true;
    }
}
