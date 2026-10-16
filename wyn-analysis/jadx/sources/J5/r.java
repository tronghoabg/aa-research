package J5;

import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class r implements t {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f5674a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f5675b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5676c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5677d;

    public r(long[] jArr, long[] jArr2, long j8) {
        AbstractC4256a.e(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z2 = length > 0;
        this.f5677d = z2;
        if (!z2 || jArr2[0] <= 0) {
            this.f5674a = jArr;
            this.f5675b = jArr2;
        } else {
            int i5 = length + 1;
            long[] jArr3 = new long[i5];
            this.f5674a = jArr3;
            long[] jArr4 = new long[i5];
            this.f5675b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f5676c = j8;
    }

    @Override // J5.t
    public final s c(long j8) {
        if (!this.f5677d) {
            u uVar = u.f5680c;
            return new s(uVar, uVar);
        }
        long[] jArr = this.f5675b;
        int iE = u6.v.e(jArr, j8, true);
        long j10 = jArr[iE];
        long[] jArr2 = this.f5674a;
        u uVar2 = new u(j10, jArr2[iE]);
        if (j10 == j8 || iE == jArr.length - 1) {
            return new s(uVar2, uVar2);
        }
        int i5 = iE + 1;
        return new s(uVar2, new u(jArr[i5], jArr2[i5]));
    }

    @Override // J5.t
    public final boolean e() {
        return this.f5677d;
    }

    @Override // J5.t
    public final long f() {
        return this.f5676c;
    }
}
