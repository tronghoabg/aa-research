package X1;

import N1.C0753b;
import N1.C0769s;
import N1.C0773w;
import N1.L;
import N1.N;
import Q1.x;

/* loaded from: classes.dex */
public final class d extends N {

    /* renamed from: b, reason: collision with root package name */
    public final long f15944b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15945c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15946d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15947e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15948f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15949g;

    /* renamed from: h, reason: collision with root package name */
    public final long f15950h;

    /* renamed from: i, reason: collision with root package name */
    public final Y1.c f15951i;

    /* renamed from: j, reason: collision with root package name */
    public final C0773w f15952j;
    public final C0769s k;

    public d(long j8, long j10, long j11, int i5, long j12, long j13, long j14, Y1.c cVar, C0773w c0773w, C0769s c0769s) {
        Q1.k.g(cVar.f16313d == (c0769s != null));
        this.f15944b = j8;
        this.f15945c = j10;
        this.f15946d = j11;
        this.f15947e = i5;
        this.f15948f = j12;
        this.f15949g = j13;
        this.f15950h = j14;
        this.f15951i = cVar;
        this.f15952j = c0773w;
        this.k = c0769s;
    }

    @Override // N1.N
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f15947e) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // N1.N
    public final L f(int i5, L l10, boolean z2) {
        Q1.k.e(i5, h());
        Y1.c cVar = this.f15951i;
        String str = z2 ? cVar.b(i5).f16342a : null;
        Integer numValueOf = z2 ? Integer.valueOf(this.f15947e + i5) : null;
        long jD = cVar.d(i5);
        long jK = x.K(cVar.b(i5).f16343b - cVar.b(0).f16343b) - this.f15948f;
        l10.getClass();
        l10.h(str, numValueOf, 0, jD, jK, C0753b.f8135c, false);
        return l10;
    }

    @Override // N1.N
    public final int h() {
        return this.f15951i.f16321m.size();
    }

    @Override // N1.N
    public final Object l(int i5) {
        Q1.k.e(i5, h());
        return Integer.valueOf(this.f15947e + i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    @Override // N1.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final N1.M m(int r23, N1.M r24, long r25) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.d.m(int, N1.M, long):N1.M");
    }

    @Override // N1.N
    public final int o() {
        return 1;
    }
}
