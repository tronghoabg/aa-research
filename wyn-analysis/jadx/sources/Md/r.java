package md;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class r implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final C3542j f40714d = new C3542j(3);

    /* renamed from: e, reason: collision with root package name */
    public static final long f40715e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f40716f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f40717g;

    /* renamed from: a, reason: collision with root package name */
    public final C3542j f40718a;

    /* renamed from: b, reason: collision with root package name */
    public final long f40719b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f40720c;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f40715e = nanos;
        f40716f = -nanos;
        f40717g = TimeUnit.SECONDS.toNanos(1L);
    }

    public r(long j8) {
        C3542j c3542j = f40714d;
        long jNanoTime = System.nanoTime();
        this.f40718a = c3542j;
        long jMin = Math.min(f40715e, Math.max(f40716f, j8));
        this.f40719b = jNanoTime + jMin;
        this.f40720c = jMin <= 0;
    }

    public final boolean a() {
        if (!this.f40720c) {
            long j8 = this.f40719b;
            this.f40718a.getClass();
            if (j8 - System.nanoTime() > 0) {
                return false;
            }
            this.f40720c = true;
        }
        return true;
    }

    public final long b() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f40718a.getClass();
        long jNanoTime = System.nanoTime();
        if (!this.f40720c && this.f40719b - jNanoTime <= 0) {
            this.f40720c = true;
        }
        return timeUnit.convert(this.f40719b - jNanoTime, timeUnit);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r rVar = (r) obj;
        C3542j c3542j = rVar.f40718a;
        C3542j c3542j2 = this.f40718a;
        if (c3542j2 == c3542j) {
            long j8 = this.f40719b - rVar.f40719b;
            if (j8 < 0) {
                return -1;
            }
            return j8 > 0 ? 1 : 0;
        }
        throw new AssertionError("Tickers (" + c3542j2 + " and " + rVar.f40718a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        C3542j c3542j = this.f40718a;
        if (c3542j != null ? c3542j == rVar.f40718a : rVar.f40718a == null) {
            return this.f40719b == rVar.f40719b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.f40718a, Long.valueOf(this.f40719b)).hashCode();
    }

    public final String toString() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jB = b();
        long jAbs = Math.abs(jB);
        long j8 = f40717g;
        long j10 = jAbs / j8;
        long jAbs2 = Math.abs(jB) % j8;
        StringBuilder sb2 = new StringBuilder();
        if (jB < 0) {
            sb2.append('-');
        }
        sb2.append(j10);
        if (jAbs2 > 0) {
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb2.append("s from now");
        C3542j c3542j = f40714d;
        C3542j c3542j2 = this.f40718a;
        if (c3542j2 != c3542j) {
            sb2.append(" (ticker=" + c3542j2 + ")");
        }
        return sb2.toString();
    }
}
