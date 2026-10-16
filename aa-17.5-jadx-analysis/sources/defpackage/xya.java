package defpackage;

import j$.time.Duration;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class xya {
    public boolean a;
    private final xyi b;
    private long c;
    private long d;

    public xya(xyi xyiVar) {
        xyiVar.getClass();
        this.b = xyiVar;
    }

    public static xya b(xyi xyiVar) {
        xya xyaVar = new xya(xyiVar);
        xyaVar.e();
        return xyaVar;
    }

    private final long g() {
        return this.a ? (this.b.b() - this.d) + this.c : this.c;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(g(), TimeUnit.NANOSECONDS);
    }

    public final Duration c() {
        return Duration.ofNanos(g());
    }

    public final void d() {
        this.c = 0L;
        this.a = false;
    }

    public final void e() {
        woy.aa(!this.a, "This stopwatch is already running.");
        this.a = true;
        this.d = this.b.b();
    }

    public final void f() {
        long jB = this.b.b();
        woy.aa(this.a, "This stopwatch is already stopped.");
        this.a = false;
        this.c += jB - this.d;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long jG = g();
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        TimeUnit timeUnit3 = TimeUnit.NANOSECONDS;
        if (jG / 86400000000000L > 0) {
            timeUnit = TimeUnit.DAYS;
        } else {
            TimeUnit timeUnit4 = TimeUnit.HOURS;
            TimeUnit timeUnit5 = TimeUnit.NANOSECONDS;
            if (jG / 3600000000000L > 0) {
                timeUnit = TimeUnit.HOURS;
            } else {
                TimeUnit timeUnit6 = TimeUnit.MINUTES;
                TimeUnit timeUnit7 = TimeUnit.NANOSECONDS;
                if (jG / 60000000000L > 0) {
                    timeUnit = TimeUnit.MINUTES;
                } else {
                    TimeUnit timeUnit8 = TimeUnit.SECONDS;
                    TimeUnit timeUnit9 = TimeUnit.NANOSECONDS;
                    if (jG / 1000000000 > 0) {
                        timeUnit = TimeUnit.SECONDS;
                    } else {
                        TimeUnit timeUnit10 = TimeUnit.MILLISECONDS;
                        TimeUnit timeUnit11 = TimeUnit.NANOSECONDS;
                        if (jG / 1000000 > 0) {
                            timeUnit = TimeUnit.MILLISECONDS;
                        } else {
                            TimeUnit timeUnit12 = TimeUnit.MICROSECONDS;
                            TimeUnit timeUnit13 = TimeUnit.NANOSECONDS;
                            timeUnit = jG / 1000 > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
                        }
                    }
                }
            }
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jG / TimeUnit.NANOSECONDS.convert(1L, timeUnit)));
        switch (xxz.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return a.bJ(str, str2, " ");
    }

    public xya() {
        this.b = xyi.d;
    }
}
