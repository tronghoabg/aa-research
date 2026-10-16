package R5;

import u6.AbstractC4256a;
import u6.v;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final n f10360a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10361b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f10362c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f10363d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10364e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f10365f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f10366g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10367h;

    public p(n nVar, long[] jArr, int[] iArr, int i5, long[] jArr2, int[] iArr2, long j8) {
        AbstractC4256a.e(iArr.length == jArr2.length);
        AbstractC4256a.e(jArr.length == jArr2.length);
        AbstractC4256a.e(iArr2.length == jArr2.length);
        this.f10360a = nVar;
        this.f10362c = jArr;
        this.f10363d = iArr;
        this.f10364e = i5;
        this.f10365f = jArr2;
        this.f10366g = iArr2;
        this.f10367h = j8;
        this.f10361b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j8) {
        long[] jArr = this.f10365f;
        for (int iB = v.b(jArr, j8, true); iB < jArr.length; iB++) {
            if ((this.f10366g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }
}
