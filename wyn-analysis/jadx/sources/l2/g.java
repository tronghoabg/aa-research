package L2;

import Q1.x;
import s2.v;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f6856a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f6857b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6858c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6859d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6860e;

    public g(long[] jArr, long[] jArr2, long j8, long j10, int i5) {
        this.f6856a = jArr;
        this.f6857b = jArr2;
        this.f6858c = j8;
        this.f6859d = j10;
        this.f6860e = i5;
    }

    @Override // L2.f
    public final long b(long j8) {
        return this.f6856a[x.e(this.f6857b, j8, true)];
    }

    @Override // s2.w
    public final v c(long j8) {
        long[] jArr = this.f6856a;
        int iE = x.e(jArr, j8, true);
        long j10 = jArr[iE];
        long[] jArr2 = this.f6857b;
        s2.x xVar = new s2.x(j10, jArr2[iE]);
        if (j10 >= j8 || iE == jArr.length - 1) {
            return new v(xVar, xVar);
        }
        int i5 = iE + 1;
        return new v(xVar, new s2.x(jArr[i5], jArr2[i5]));
    }

    @Override // L2.f
    public final long d() {
        return this.f6859d;
    }

    @Override // s2.w
    public final boolean e() {
        return true;
    }

    @Override // s2.w
    public final long f() {
        return this.f6858c;
    }

    @Override // L2.f
    public final int l() {
        return this.f6860e;
    }
}
