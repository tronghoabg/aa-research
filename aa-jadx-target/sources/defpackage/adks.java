package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adks implements java.lang.Comparable {
    public static final defpackage.adrs b = new defpackage.adrs();
    private static final long d;
    private static final long e;
    private static final long f;
    public final long a;
    public final defpackage.adrs c;
    private volatile boolean g;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        d = 3153600000000000000L;
        e = -3153600000000000000L;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.SECONDS;
        f = 1000000000L;
    }

    private adks(defpackage.adrs adrsVar, long j, long j2) {
        this.c = adrsVar;
        long jMin = java.lang.Math.min(d, java.lang.Math.max(e, j2));
        this.a = j + jMin;
        this.g = jMin <= 0;
    }

    public static defpackage.adks c(long j, java.util.concurrent.TimeUnit timeUnit) {
        return g(j, timeUnit, b);
    }

    public static defpackage.adks g(long j, java.util.concurrent.TimeUnit timeUnit, defpackage.adrs adrsVar) {
        timeUnit.getClass();
        return new defpackage.adks(adrsVar, java.lang.System.nanoTime(), timeUnit.toNanos(j));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.adks adksVar) {
        d(adksVar);
        return java.lang.Long.compare(this.a, adksVar.a);
    }

    public final long b(java.util.concurrent.TimeUnit timeUnit) {
        long jNanoTime = java.lang.System.nanoTime();
        if (!this.g && this.a - jNanoTime <= 0) {
            this.g = true;
        }
        return timeUnit.convert(this.a - jNanoTime, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final void d(defpackage.adks adksVar) {
        defpackage.adrs adrsVar = this.c;
        defpackage.adrs adrsVar2 = adksVar.c;
        if (adrsVar == adrsVar2) {
            return;
        }
        throw new java.lang.AssertionError("Tickers (" + java.lang.String.valueOf(adrsVar) + " and " + java.lang.String.valueOf(adrsVar2) + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean e(defpackage.adks adksVar) {
        d(adksVar);
        return this.a - adksVar.a < 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.adks)) {
            return false;
        }
        defpackage.adks adksVar = (defpackage.adks) obj;
        defpackage.adrs adrsVar = this.c;
        if (adrsVar != null ? adrsVar == adksVar.c : adksVar.c == null) {
            return this.a == adksVar.a;
        }
        return false;
    }

    public final boolean f() {
        if (!this.g) {
            if (this.a - java.lang.System.nanoTime() > 0) {
                return false;
            }
            this.g = true;
        }
        return true;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.c, java.lang.Long.valueOf(this.a)});
    }

    public final java.lang.String toString() {
        long jB = b(java.util.concurrent.TimeUnit.NANOSECONDS);
        long jAbs = java.lang.Math.abs(jB);
        long j = f;
        long j2 = jAbs / j;
        long jAbs2 = java.lang.Math.abs(jB) % j;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (jB < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (jAbs2 > 0) {
            sb.append(java.lang.String.format(java.util.Locale.US, ".%09d", java.lang.Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        defpackage.adrs adrsVar = this.c;
        if (adrsVar != b) {
            sb.append(defpackage.a.bU(adrsVar, " (ticker=", ")"));
        }
        return sb.toString();
    }
}
