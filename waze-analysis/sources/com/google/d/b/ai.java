package com.google.d.b;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.common.C;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private final aq f7208a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7209b;

    /* renamed from: c, reason: collision with root package name */
    private long f7210c;

    /* renamed from: d, reason: collision with root package name */
    private long f7211d;

    ai(aq aqVar) {
        an.C(aqVar, "ticker");
        this.f7208a = aqVar;
    }

    public static ai b() {
        ai aiVar = new ai();
        aiVar.e();
        return aiVar;
    }

    public static ai c() {
        return new ai();
    }

    public static void g(aq aqVar) {
        new ai(aqVar).e();
    }

    private final long h() {
        return this.f7209b ? (this.f7208a.read() - this.f7211d) + this.f7210c : this.f7210c;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(h(), TimeUnit.NANOSECONDS);
    }

    public final void d() {
        this.f7210c = 0L;
        this.f7209b = false;
    }

    public final void e() {
        an.v(!this.f7209b, "This stopwatch is already running.");
        this.f7209b = true;
        this.f7211d = this.f7208a.read();
    }

    public final void f() {
        long j2 = this.f7208a.read();
        an.v(this.f7209b, "This stopwatch is already stopped.");
        this.f7209b = false;
        this.f7210c += j2 - this.f7211d;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long jH = h();
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        TimeUnit timeUnit3 = TimeUnit.NANOSECONDS;
        if (jH / 86400000000000L > 0) {
            timeUnit = TimeUnit.DAYS;
        } else {
            TimeUnit timeUnit4 = TimeUnit.HOURS;
            TimeUnit timeUnit5 = TimeUnit.NANOSECONDS;
            if (jH / 3600000000000L > 0) {
                timeUnit = TimeUnit.HOURS;
            } else {
                TimeUnit timeUnit6 = TimeUnit.MINUTES;
                TimeUnit timeUnit7 = TimeUnit.NANOSECONDS;
                if (jH / 60000000000L > 0) {
                    timeUnit = TimeUnit.MINUTES;
                } else {
                    TimeUnit timeUnit8 = TimeUnit.SECONDS;
                    TimeUnit timeUnit9 = TimeUnit.NANOSECONDS;
                    if (jH / C.NANOS_PER_SECOND > 0) {
                        timeUnit = TimeUnit.SECONDS;
                    } else {
                        TimeUnit timeUnit10 = TimeUnit.MILLISECONDS;
                        TimeUnit timeUnit11 = TimeUnit.NANOSECONDS;
                        if (jH / 1000000 > 0) {
                            timeUnit = TimeUnit.MILLISECONDS;
                        } else {
                            TimeUnit timeUnit12 = TimeUnit.MICROSECONDS;
                            TimeUnit timeUnit13 = TimeUnit.NANOSECONDS;
                            timeUnit = jH / 1000 > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
                        }
                    }
                }
            }
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jH / TimeUnit.NANOSECONDS.convert(1L, timeUnit)));
        switch (ah.f7207a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = AccessibilityNodeInfoCompat.MathInfoCompat.MATH_TAG_STRING_LITERAL;
                break;
            case 4:
                str = CmcdData.STREAMING_FORMAT_SS;
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = CmcdData.STREAMING_FORMAT_HLS;
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return str2 + " " + str;
    }

    ai() {
        this.f7208a = aq.systemTicker();
    }
}
