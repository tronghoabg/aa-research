package r6;

import E5.T;
import f6.Z;
import java.util.ArrayList;
import java.util.Arrays;
import l8.C3406H;
import u6.AbstractC4256a;

/* renamed from: r6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3927b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Z f44375a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44376b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f44377c;

    /* renamed from: d, reason: collision with root package name */
    public final T[] f44378d;

    /* renamed from: e, reason: collision with root package name */
    public int f44379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f44380f;

    public C3927b(int i5, Z z2, int[] iArr) {
        T[] tArr;
        this.f44380f = i5;
        AbstractC4256a.i(iArr.length > 0);
        z2.getClass();
        this.f44375a = z2;
        int length = iArr.length;
        this.f44376b = length;
        this.f44378d = new T[length];
        int i10 = 0;
        while (true) {
            int length2 = iArr.length;
            tArr = z2.f35020d;
            if (i10 >= length2) {
                break;
            }
            this.f44378d[i10] = tArr[iArr[i10]];
            i10++;
        }
        Arrays.sort(this.f44378d, new q6.d(2));
        this.f44377c = new int[this.f44376b];
        int i11 = 0;
        while (true) {
            int i12 = this.f44376b;
            if (i11 >= i12) {
                long[] jArr = new long[i12];
                return;
            }
            int[] iArr2 = this.f44377c;
            T t10 = this.f44378d[i11];
            int i13 = 0;
            while (true) {
                if (i13 >= tArr.length) {
                    i13 = -1;
                    break;
                } else if (t10 == tArr[i13]) {
                    break;
                } else {
                    i13++;
                }
            }
            iArr2[i11] = i13;
            i11++;
        }
    }

    public static void l(ArrayList arrayList, long[] jArr) {
        long j8 = 0;
        for (long j10 : jArr) {
            j8 += j10;
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            C3406H c3406h = (C3406H) arrayList.get(i5);
            if (c3406h != null) {
                c3406h.a(new C3926a(j8, jArr[i5]));
            }
        }
    }

    @Override // r6.n
    public void a() {
        int i5 = this.f44380f;
    }

    @Override // r6.n
    public final T b(int i5) {
        return this.f44378d[i5];
    }

    @Override // r6.n
    public final int c(int i5) {
        return this.f44377c[i5];
    }

    @Override // r6.n
    public void d(float f10) {
        int i5 = this.f44380f;
    }

    @Override // r6.n
    public final /* synthetic */ void e() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3927b c3927b = (C3927b) obj;
            if (this.f44375a == c3927b.f44375a && Arrays.equals(this.f44377c, c3927b.f44377c)) {
                return true;
            }
        }
        return false;
    }

    @Override // r6.n
    public final int f(int i5) {
        for (int i10 = 0; i10 < this.f44376b; i10++) {
            if (this.f44377c[i10] == i5) {
                return i10;
            }
        }
        return -1;
    }

    @Override // r6.n
    public final Z g() {
        return this.f44375a;
    }

    @Override // r6.n
    public final /* synthetic */ void h(boolean z2) {
    }

    public final int hashCode() {
        if (this.f44379e == 0) {
            this.f44379e = Arrays.hashCode(this.f44377c) + (System.identityHashCode(this.f44375a) * 31);
        }
        return this.f44379e;
    }

    @Override // r6.n
    public void i() {
        int i5 = this.f44380f;
    }

    @Override // r6.n
    public final T j() {
        return this.f44378d[0];
    }

    @Override // r6.n
    public final /* synthetic */ void k() {
    }

    @Override // r6.n
    public final int length() {
        return this.f44377c.length;
    }

    private final void m() {
    }

    private final void o() {
    }

    public final void n() {
    }

    public final void p() {
    }

    private final void q(float f10) {
    }

    public final void r(float f10) {
    }
}
