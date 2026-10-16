package Y1;

import Q1.x;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n extends s {

    /* renamed from: d, reason: collision with root package name */
    public final long f16363d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16364e;

    /* renamed from: f, reason: collision with root package name */
    public final List f16365f;

    /* renamed from: g, reason: collision with root package name */
    public final long f16366g;

    /* renamed from: h, reason: collision with root package name */
    public final long f16367h;

    /* renamed from: i, reason: collision with root package name */
    public final long f16368i;

    public n(j jVar, long j8, long j10, long j11, long j12, List list, long j13, long j14, long j15) {
        super(jVar, j8, j10);
        this.f16363d = j11;
        this.f16364e = j12;
        this.f16365f = list;
        this.f16368i = j13;
        this.f16366g = j14;
        this.f16367h = j15;
    }

    public final long b(long j8, long j10) {
        long jD = d(j8);
        return jD != -1 ? jD : (int) (f((j10 - this.f16367h) + this.f16368i, j8) - c(j8, j10));
    }

    public final long c(long j8, long j10) {
        long jD = d(j8);
        long j11 = this.f16363d;
        if (jD == -1) {
            long j12 = this.f16366g;
            if (j12 != -9223372036854775807L) {
                return Math.max(j11, f((j10 - this.f16367h) - j12, j8));
            }
        }
        return j11;
    }

    public abstract long d(long j8);

    public final long e(long j8, long j10) {
        long j11 = this.f16377b;
        long j12 = this.f16363d;
        List list = this.f16365f;
        if (list != null) {
            return (((q) list.get((int) (j8 - j12))).f16373b * 1000000) / j11;
        }
        long jD = d(j10);
        return (jD == -1 || j8 != (j12 + jD) - 1) ? (this.f16364e * 1000000) / j11 : j10 - g(j8);
    }

    public final long f(long j8, long j10) {
        long jD = d(j10);
        long j11 = this.f16363d;
        if (jD != 0) {
            if (this.f16365f != null) {
                long j12 = (jD + j11) - 1;
                long j13 = j11;
                while (j13 <= j12) {
                    long j14 = ((j12 - j13) / 2) + j13;
                    long jG = g(j14);
                    if (jG < j8) {
                        j13 = j14 + 1;
                    } else {
                        if (jG <= j8) {
                            return j14;
                        }
                        j12 = j14 - 1;
                    }
                }
                return j13 == j11 ? j13 : j12;
            }
            long j15 = (j8 / ((this.f16364e * 1000000) / this.f16377b)) + j11;
            if (j15 >= j11) {
                return jD == -1 ? j15 : Math.min(j15, (j11 + jD) - 1);
            }
        }
        return j11;
    }

    public final long g(long j8) {
        long j10 = this.f16363d;
        List list = this.f16365f;
        long j11 = list != null ? ((q) list.get((int) (j8 - j10))).f16372a - this.f16378c : (j8 - j10) * this.f16364e;
        int i5 = x.f9724a;
        return x.S(j11, 1000000L, this.f16377b, RoundingMode.DOWN);
    }

    public abstract j h(k kVar, long j8);

    public boolean i() {
        return this.f16365f != null;
    }
}
