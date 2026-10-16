package Y1;

import G6.C0555t;
import N1.C0765n;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import n8.AbstractC3602a;

/* loaded from: classes.dex */
public final class p extends n {

    /* renamed from: j, reason: collision with root package name */
    public final C0555t f16370j;
    public final C0555t k;

    /* renamed from: l, reason: collision with root package name */
    public final long f16371l;

    public p(j jVar, long j8, long j10, long j11, long j12, long j13, List list, long j14, C0555t c0555t, C0555t c0555t2, long j15, long j16) {
        super(jVar, j8, j10, j11, j13, list, j14, j15, j16);
        this.f16370j = c0555t;
        this.k = c0555t2;
        this.f16371l = j12;
    }

    @Override // Y1.s
    public final j a(m mVar) {
        C0555t c0555t = this.f16370j;
        if (c0555t == null) {
            return this.f16376a;
        }
        C0765n c0765n = mVar.f16358a;
        return new j(c0555t.a(c0765n.f8229j, c0765n.f8220a, 0L, 0L), 0L, -1L);
    }

    @Override // Y1.n
    public final long d(long j8) {
        if (this.f16365f != null) {
            return r0.size();
        }
        long j10 = this.f16371l;
        if (j10 != -1) {
            return (j10 - this.f16363d) + 1;
        }
        if (j8 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j8).multiply(BigInteger.valueOf(this.f16377b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f16364e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i5 = AbstractC3602a.f40938a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // Y1.n
    public final j h(k kVar, long j8) {
        long j10 = this.f16363d;
        List list = this.f16365f;
        long j11 = list != null ? ((q) list.get((int) (j8 - j10))).f16372a : (j8 - j10) * this.f16364e;
        C0765n c0765n = kVar.f16358a;
        return new j(this.k.a(c0765n.f8229j, c0765n.f8220a, j8, j11), 0L, -1L);
    }
}
