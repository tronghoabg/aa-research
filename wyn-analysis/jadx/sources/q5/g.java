package Q5;

import J5.s;
import J5.u;
import u6.v;

/* loaded from: classes3.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f9874a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f9875b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9876c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9877d;

    public g(long[] jArr, long[] jArr2, long j8, long j10) {
        this.f9874a = jArr;
        this.f9875b = jArr2;
        this.f9876c = j8;
        this.f9877d = j10;
    }

    @Override // Q5.f
    public final long b(long j8) {
        return this.f9874a[v.e(this.f9875b, j8, true)];
    }

    @Override // J5.t
    public final s c(long j8) {
        long[] jArr = this.f9874a;
        int iE = v.e(jArr, j8, true);
        long j10 = jArr[iE];
        long[] jArr2 = this.f9875b;
        u uVar = new u(j10, jArr2[iE]);
        if (j10 >= j8 || iE == jArr.length - 1) {
            return new s(uVar, uVar);
        }
        int i5 = iE + 1;
        return new s(uVar, new u(jArr[i5], jArr2[i5]));
    }

    @Override // Q5.f
    public final long d() {
        return this.f9877d;
    }

    @Override // J5.t
    public final boolean e() {
        return true;
    }

    @Override // J5.t
    public final long f() {
        return this.f9876c;
    }
}
