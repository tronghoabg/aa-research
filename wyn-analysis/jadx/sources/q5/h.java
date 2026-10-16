package Q5;

import J5.s;
import J5.u;
import u6.AbstractC4256a;
import u6.v;

/* loaded from: classes3.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f9878a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9879b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9880c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9881d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9882e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f9883f;

    public h(long j8, int i5, long j10, long j11, long[] jArr) {
        this.f9878a = j8;
        this.f9879b = i5;
        this.f9880c = j10;
        this.f9883f = jArr;
        this.f9881d = j11;
        this.f9882e = j11 != -1 ? j8 + j11 : -1L;
    }

    @Override // Q5.f
    public final long b(long j8) {
        long j10 = j8 - this.f9878a;
        if (!e() || j10 <= this.f9879b) {
            return 0L;
        }
        long[] jArr = this.f9883f;
        AbstractC4256a.j(jArr);
        double d3 = (j10 * 256.0d) / this.f9881d;
        int iE = v.e(jArr, (long) d3, true);
        long j11 = this.f9880c;
        long j12 = (iE * j11) / 100;
        long j13 = jArr[iE];
        int i5 = iE + 1;
        long j14 = (j11 * i5) / 100;
        return Math.round((j13 == (iE == 99 ? 256L : jArr[i5]) ? 0.0d : (d3 - j13) / (r0 - j13)) * (j14 - j12)) + j12;
    }

    @Override // J5.t
    public final s c(long j8) {
        double d3;
        double d5;
        boolean zE = e();
        int i5 = this.f9879b;
        long j10 = this.f9878a;
        if (!zE) {
            u uVar = new u(0L, j10 + i5);
            return new s(uVar, uVar);
        }
        long jI = v.i(j8, 0L, this.f9880c);
        double d10 = (jI * 100.0d) / this.f9880c;
        double d11 = 0.0d;
        if (d10 <= 0.0d) {
            d3 = 256.0d;
        } else if (d10 >= 100.0d) {
            d3 = 256.0d;
            d11 = 256.0d;
        } else {
            int i10 = (int) d10;
            long[] jArr = this.f9883f;
            AbstractC4256a.j(jArr);
            double d12 = jArr[i10];
            if (i10 == 99) {
                d3 = 256.0d;
                d5 = 256.0d;
            } else {
                d3 = 256.0d;
                d5 = jArr[i10 + 1];
            }
            d11 = ((d5 - d12) * (d10 - i10)) + d12;
        }
        long j11 = this.f9881d;
        u uVar2 = new u(jI, j10 + v.i(Math.round((d11 / d3) * j11), i5, j11 - 1));
        return new s(uVar2, uVar2);
    }

    @Override // Q5.f
    public final long d() {
        return this.f9882e;
    }

    @Override // J5.t
    public final boolean e() {
        return this.f9883f != null;
    }

    @Override // J5.t
    public final long f() {
        return this.f9880c;
    }
}
