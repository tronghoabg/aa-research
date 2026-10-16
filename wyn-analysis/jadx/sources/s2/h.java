package s2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements w {

    /* renamed from: a, reason: collision with root package name */
    public final int f44882a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f44883b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f44884c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f44885d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f44886e;

    /* renamed from: f, reason: collision with root package name */
    public final long f44887f;

    public h(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f44883b = iArr;
        this.f44884c = jArr;
        this.f44885d = jArr2;
        this.f44886e = jArr3;
        int length = iArr.length;
        this.f44882a = length;
        if (length > 0) {
            this.f44887f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f44887f = 0L;
        }
    }

    @Override // s2.w
    public final v c(long j8) {
        long[] jArr = this.f44886e;
        int iE = Q1.x.e(jArr, j8, true);
        long j10 = jArr[iE];
        long[] jArr2 = this.f44884c;
        x xVar = new x(j10, jArr2[iE]);
        if (j10 >= j8 || iE == this.f44882a - 1) {
            return new v(xVar, xVar);
        }
        int i5 = iE + 1;
        return new v(xVar, new x(jArr[i5], jArr2[i5]));
    }

    @Override // s2.w
    public final boolean e() {
        return true;
    }

    @Override // s2.w
    public final long f() {
        return this.f44887f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f44882a + ", sizes=" + Arrays.toString(this.f44883b) + ", offsets=" + Arrays.toString(this.f44884c) + ", timeUs=" + Arrays.toString(this.f44886e) + ", durationsUs=" + Arrays.toString(this.f44885d) + ")";
    }
}
