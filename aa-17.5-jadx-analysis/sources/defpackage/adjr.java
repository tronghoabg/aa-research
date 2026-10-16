package defpackage;

import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class adjr implements Comparable {
    public static final adqq b = new adqq();
    private static final long d;
    private static final long e;
    private static final long f;
    public final long a;
    public final adqq c;
    private volatile boolean g;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        d = 3153600000000000000L;
        e = -3153600000000000000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        f = 1000000000L;
    }

    private adjr(adqq adqqVar, long j, long j2) {
        this.c = adqqVar;
        long jMin = Math.min(d, Math.max(e, j2));
        this.a = j + jMin;
        this.g = jMin <= 0;
    }

    public static adjr c(long j, TimeUnit timeUnit) {
        return g(j, timeUnit, b);
    }

    public static adjr g(long j, TimeUnit timeUnit, adqq adqqVar) {
        timeUnit.getClass();
        return new adjr(adqqVar, System.nanoTime(), timeUnit.toNanos(j));
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(adjr adjrVar) {
        d(adjrVar);
        return Long.compare(this.a, adjrVar.a);
    }

    public final long b(TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        if (!this.g && this.a - jNanoTime <= 0) {
            this.g = true;
        }
        return timeUnit.convert(this.a - jNanoTime, TimeUnit.NANOSECONDS);
    }

    public final void d(adjr adjrVar) {
        adqq adqqVar = this.c;
        adqq adqqVar2 = adjrVar.c;
        if (adqqVar == adqqVar2) {
            return;
        }
        throw new AssertionError("Tickers (" + String.valueOf(adqqVar) + " and " + String.valueOf(adqqVar2) + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean e(adjr adjrVar) {
        d(adjrVar);
        return this.a - adjrVar.a < 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adjr)) {
            return false;
        }
        adjr adjrVar = (adjr) obj;
        adqq adqqVar = this.c;
        if (adqqVar != null ? adqqVar == adjrVar.c : adjrVar.c == null) {
            return this.a == adjrVar.a;
        }
        return false;
    }

    public final boolean f() {
        if (!this.g) {
            if (this.a - System.nanoTime() > 0) {
                return false;
            }
            this.g = true;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.c, Long.valueOf(this.a));
    }

    public final String toString() {
        long jB = b(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jB);
        long j = f;
        long j2 = jAbs / j;
        long jAbs2 = Math.abs(jB) % j;
        StringBuilder sb = new StringBuilder();
        if (jB < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        adqq adqqVar = this.c;
        if (adqqVar != b) {
            sb.append(a.bV(adqqVar, " (ticker=", ")"));
        }
        return sb.toString();
    }
}
