package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xzg {
    public boolean a;
    private final defpackage.xzo b;
    private long c;
    private long d;

    public xzg(defpackage.xzo xzoVar) {
        xzoVar.getClass();
        this.b = xzoVar;
    }

    public static defpackage.xzg b(defpackage.xzo xzoVar) {
        defpackage.xzg xzgVar = new defpackage.xzg(xzoVar);
        xzgVar.e();
        return xzgVar;
    }

    private final long g() {
        return this.a ? (this.b.b() - this.d) + this.c : this.c;
    }

    public final long a(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(g(), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final j$.time.Duration c() {
        return j$.time.Duration.ofNanos(g());
    }

    public final void d() {
        this.c = 0L;
        this.a = false;
    }

    public final void e() {
        defpackage.ysr.bk(!this.a, "This stopwatch is already running.");
        this.a = true;
        this.d = this.b.b();
    }

    public final void f() {
        long jB = this.b.b();
        defpackage.ysr.bk(this.a, "This stopwatch is already stopped.");
        this.a = false;
        this.c += jB - this.d;
    }

    public final java.lang.String toString() {
        java.util.concurrent.TimeUnit timeUnit;
        java.lang.String str;
        long jG = g();
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.DAYS;
        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.NANOSECONDS;
        if (jG / 86400000000000L > 0) {
            timeUnit = java.util.concurrent.TimeUnit.DAYS;
        } else {
            java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.HOURS;
            java.util.concurrent.TimeUnit timeUnit5 = java.util.concurrent.TimeUnit.NANOSECONDS;
            if (jG / 3600000000000L > 0) {
                timeUnit = java.util.concurrent.TimeUnit.HOURS;
            } else {
                java.util.concurrent.TimeUnit timeUnit6 = java.util.concurrent.TimeUnit.MINUTES;
                java.util.concurrent.TimeUnit timeUnit7 = java.util.concurrent.TimeUnit.NANOSECONDS;
                if (jG / 60000000000L > 0) {
                    timeUnit = java.util.concurrent.TimeUnit.MINUTES;
                } else {
                    java.util.concurrent.TimeUnit timeUnit8 = java.util.concurrent.TimeUnit.SECONDS;
                    java.util.concurrent.TimeUnit timeUnit9 = java.util.concurrent.TimeUnit.NANOSECONDS;
                    if (jG / 1000000000 > 0) {
                        timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                    } else {
                        java.util.concurrent.TimeUnit timeUnit10 = java.util.concurrent.TimeUnit.MILLISECONDS;
                        java.util.concurrent.TimeUnit timeUnit11 = java.util.concurrent.TimeUnit.NANOSECONDS;
                        if (jG / 1000000 > 0) {
                            timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                        } else {
                            java.util.concurrent.TimeUnit timeUnit12 = java.util.concurrent.TimeUnit.MICROSECONDS;
                            java.util.concurrent.TimeUnit timeUnit13 = java.util.concurrent.TimeUnit.NANOSECONDS;
                            timeUnit = jG / 1000 > 0 ? java.util.concurrent.TimeUnit.MICROSECONDS : java.util.concurrent.TimeUnit.NANOSECONDS;
                        }
                    }
                }
            }
        }
        java.lang.String str2 = java.lang.String.format(java.util.Locale.ROOT, "%.4g", java.lang.Double.valueOf(jG / java.util.concurrent.TimeUnit.NANOSECONDS.convert(1L, timeUnit)));
        switch (xzf.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                str = "μs";
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                str = "ms";
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                str = "s";
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                str = "min";
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "h";
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "d";
                break;
            default:
                throw new java.lang.AssertionError();
        }
        return defpackage.a.bI(str, str2, " ");
    }

    public xzg() {
        this.b = defpackage.xzo.d;
    }
}
