package M2;

import Q1.x;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final s f7452a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7453b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f7454c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f7455d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7456e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f7457f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f7458g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7459h;

    public v(s sVar, long[] jArr, int[] iArr, int i5, long[] jArr2, int[] iArr2, long j8) {
        Q1.k.c(iArr.length == jArr2.length);
        Q1.k.c(jArr.length == jArr2.length);
        Q1.k.c(iArr2.length == jArr2.length);
        this.f7452a = sVar;
        this.f7454c = jArr;
        this.f7455d = iArr;
        this.f7456e = i5;
        this.f7457f = jArr2;
        this.f7458g = iArr2;
        this.f7459h = j8;
        this.f7453b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j8) {
        long[] jArr = this.f7457f;
        for (int iA = x.a(jArr, j8, true); iA < jArr.length; iA++) {
            if ((this.f7458g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
