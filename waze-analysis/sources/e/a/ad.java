package e.a;

import androidx.media3.common.C;
import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ad implements Comparable<ad> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f46239a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final long f46240b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f46241c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f46242d;

    /* renamed from: g, reason: collision with root package name */
    private static final dt f46243g = new dt((char[]) null);

    /* renamed from: e, reason: collision with root package name */
    private final long f46244e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f46245f;

    /* renamed from: h, reason: collision with root package name */
    private final dt f46246h;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f46240b = 3153600000000000000L;
        f46241c = -3153600000000000000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        f46242d = C.NANOS_PER_SECOND;
    }

    private ad(dt dtVar, long j2, long j3) {
        this.f46246h = dtVar;
        long jMin = Math.min(f46240b, Math.max(f46241c, j3));
        this.f46244e = j2 + jMin;
        this.f46245f = jMin <= 0;
    }

    public static ad c(long j2, TimeUnit timeUnit) {
        dt dtVar = f46243g;
        Objects.requireNonNull(timeUnit, "units");
        return new ad(dtVar, System.nanoTime(), timeUnit.toNanos(j2));
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ad adVar) {
        dt dtVar = this.f46246h;
        dt dtVar2 = adVar.f46246h;
        if (dtVar == dtVar2) {
            return Long.compare(this.f46244e, adVar.f46244e);
        }
        throw new AssertionError("Tickers (" + dtVar.toString() + " and " + dtVar2.toString() + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final long b(TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        if (!this.f46245f && this.f46244e - jNanoTime <= 0) {
            this.f46245f = true;
        }
        return timeUnit.convert(this.f46244e - jNanoTime, TimeUnit.NANOSECONDS);
    }

    public final boolean d() {
        if (!this.f46245f) {
            if (this.f46244e - System.nanoTime() > 0) {
                return false;
            }
            this.f46245f = true;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return this.f46246h == adVar.f46246h && this.f46244e == adVar.f46244e;
    }

    public final int hashCode() {
        return Objects.hash(this.f46246h, Long.valueOf(this.f46244e));
    }

    public final String toString() {
        long jB = b(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jB);
        long j2 = f46242d;
        long j3 = jAbs / j2;
        long jAbs2 = Math.abs(jB) % j2;
        StringBuilder sb = new StringBuilder();
        if (jB < 0) {
            sb.append('-');
        }
        sb.append(j3);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        dt dtVar = this.f46246h;
        if (dtVar != f46243g) {
            sb.append(" (ticker=" + dtVar.toString() + ")");
        }
        return sb.toString();
    }
}
