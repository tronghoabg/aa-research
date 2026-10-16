package u6;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public long f46717a;

    /* renamed from: b, reason: collision with root package name */
    public long f46718b;

    /* renamed from: c, reason: collision with root package name */
    public long f46719c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f46720d = new ThreadLocal();

    public t(long j8) {
        e(j8);
    }

    public final synchronized long a(long j8) {
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f46718b == -9223372036854775807L) {
                long jLongValue = this.f46717a;
                if (jLongValue == 9223372036854775806L) {
                    Long l10 = (Long) this.f46720d.get();
                    l10.getClass();
                    jLongValue = l10.longValue();
                }
                this.f46718b = jLongValue - j8;
                notifyAll();
            }
            this.f46719c = j8;
            return j8 + this.f46718b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j8) {
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.f46719c;
            if (j10 != -9223372036854775807L) {
                long j11 = (j10 * 90000) / 1000000;
                long j12 = (4294967296L + j11) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j8;
                long j14 = (j12 * 8589934592L) + j8;
                j8 = Math.abs(j13 - j11) < Math.abs(j14 - j11) ? j13 : j14;
            }
            return a((j8 * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c() {
        long j8;
        j8 = this.f46717a;
        if (j8 == Long.MAX_VALUE || j8 == 9223372036854775806L) {
            j8 = -9223372036854775807L;
        }
        return j8;
    }

    public final synchronized long d() {
        return this.f46718b;
    }

    public final synchronized void e(long j8) {
        this.f46717a = j8;
        this.f46718b = j8 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f46719c = -9223372036854775807L;
    }
}
