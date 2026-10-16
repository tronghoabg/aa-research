package J5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class g implements t {

    /* renamed from: a, reason: collision with root package name */
    public final int f5637a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f5638b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f5639c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f5640d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f5641e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5642f;

    public g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f5638b = iArr;
        this.f5639c = jArr;
        this.f5640d = jArr2;
        this.f5641e = jArr3;
        int length = iArr.length;
        this.f5637a = length;
        if (length > 0) {
            this.f5642f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f5642f = 0L;
        }
    }

    @Override // J5.t
    public final s c(long j8) {
        long[] jArr = this.f5641e;
        int iE = u6.v.e(jArr, j8, true);
        long j10 = jArr[iE];
        long[] jArr2 = this.f5639c;
        u uVar = new u(j10, jArr2[iE]);
        if (j10 >= j8 || iE == this.f5637a - 1) {
            return new s(uVar, uVar);
        }
        int i5 = iE + 1;
        return new s(uVar, new u(jArr[i5], jArr2[i5]));
    }

    @Override // J5.t
    public final boolean e() {
        return true;
    }

    @Override // J5.t
    public final long f() {
        return this.f5642f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f5637a + ", sizes=" + Arrays.toString(this.f5638b) + ", offsets=" + Arrays.toString(this.f5639c) + ", timeUs=" + Arrays.toString(this.f5641e) + ", durationsUs=" + Arrays.toString(this.f5640d) + ")";
    }
}
