package L2;

import Q1.k;
import Q1.x;
import s2.v;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f6861a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6862b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6863c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6864d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6865e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6866f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f6867g;

    public h(long j8, int i5, long j10, int i10, long j11, long[] jArr) {
        this.f6861a = j8;
        this.f6862b = i5;
        this.f6863c = j10;
        this.f6864d = i10;
        this.f6865e = j11;
        this.f6867g = jArr;
        this.f6866f = j11 != -1 ? j8 + j11 : -1L;
    }

    @Override // L2.f
    public final long b(long j8) {
        long j10 = j8 - this.f6861a;
        if (!e() || j10 <= this.f6862b) {
            return 0L;
        }
        long[] jArr = this.f6867g;
        k.h(jArr);
        double d3 = (j10 * 256.0d) / this.f6865e;
        int iE = x.e(jArr, (long) d3, true);
        long j11 = this.f6863c;
        long j12 = (iE * j11) / 100;
        long j13 = jArr[iE];
        int i5 = iE + 1;
        long j14 = (j11 * i5) / 100;
        return Math.round((j13 == (iE == 99 ? 256L : jArr[i5]) ? 0.0d : (d3 - j13) / (r0 - j13)) * (j14 - j12)) + j12;
    }

    @Override // s2.w
    public final v c(long j8) {
        double d3;
        double d5;
        boolean zE = e();
        int i5 = this.f6862b;
        long j10 = this.f6861a;
        if (!zE) {
            s2.x xVar = new s2.x(0L, j10 + i5);
            return new v(xVar, xVar);
        }
        long j11 = x.j(j8, 0L, this.f6863c);
        double d10 = (j11 * 100.0d) / this.f6863c;
        double d11 = 0.0d;
        if (d10 <= 0.0d) {
            d3 = 256.0d;
        } else if (d10 >= 100.0d) {
            d3 = 256.0d;
            d11 = 256.0d;
        } else {
            int i10 = (int) d10;
            long[] jArr = this.f6867g;
            k.h(jArr);
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
        long j12 = this.f6865e;
        s2.x xVar2 = new s2.x(j11, j10 + x.j(Math.round((d11 / d3) * j12), i5, j12 - 1));
        return new v(xVar2, xVar2);
    }

    @Override // L2.f
    public final long d() {
        return this.f6866f;
    }

    @Override // s2.w
    public final boolean e() {
        return this.f6867g != null;
    }

    @Override // s2.w
    public final long f() {
        return this.f6863c;
    }

    @Override // L2.f
    public final int l() {
        return this.f6864d;
    }
}
