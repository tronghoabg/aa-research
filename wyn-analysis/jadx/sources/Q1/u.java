package Q1;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public long f9717a;

    /* renamed from: b, reason: collision with root package name */
    public long f9718b;

    /* renamed from: c, reason: collision with root package name */
    public long f9719c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f9720d = new ThreadLocal();

    public u(long j8) {
        g(j8);
    }

    public final synchronized long a(long j8) {
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long jLongValue = this.f9717a;
                if (jLongValue == 9223372036854775806L) {
                    Long l10 = (Long) this.f9720d.get();
                    l10.getClass();
                    jLongValue = l10.longValue();
                }
                this.f9718b = jLongValue - j8;
                notifyAll();
            }
            this.f9719c = j8;
            return j8 + this.f9718b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j8) {
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.f9719c;
            if (j10 != -9223372036854775807L) {
                int i5 = x.f9724a;
                long jS = x.S(j10, 90000L, 1000000L, RoundingMode.DOWN);
                long j11 = (4294967296L + jS) / 8589934592L;
                long j12 = ((j11 - 1) * 8589934592L) + j8;
                long j13 = (j11 * 8589934592L) + j8;
                j8 = Math.abs(j12 - jS) < Math.abs(j13 - jS) ? j12 : j13;
            }
            long j14 = j8;
            int i10 = x.f9724a;
            return a(x.S(j14, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j8) {
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.f9719c;
        if (j10 != -9223372036854775807L) {
            int i5 = x.f9724a;
            long jS = x.S(j10, 90000L, 1000000L, RoundingMode.DOWN);
            long j11 = jS / 8589934592L;
            Long.signum(j11);
            long j12 = (j11 * 8589934592L) + j8;
            j8 = j12 >= jS ? j12 : ((j11 + 1) * 8589934592L) + j8;
        }
        long j13 = j8;
        int i10 = x.f9724a;
        return a(x.S(j13, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public final synchronized long d() {
        long j8;
        j8 = this.f9717a;
        if (j8 == Long.MAX_VALUE || j8 == 9223372036854775806L) {
            j8 = -9223372036854775807L;
        }
        return j8;
    }

    public final synchronized long e() {
        return this.f9718b;
    }

    public final synchronized boolean f() {
        return this.f9718b != -9223372036854775807L;
    }

    public final synchronized void g(long j8) {
        this.f9717a = j8;
        this.f9718b = j8 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f9719c = -9223372036854775807L;
    }

    public final synchronized void h(long j8, boolean z2) {
        try {
            k.g(this.f9717a == 9223372036854775806L);
            if (f()) {
                return;
            }
            if (z2) {
                this.f9720d.set(Long.valueOf(j8));
            } else {
                while (!f()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
