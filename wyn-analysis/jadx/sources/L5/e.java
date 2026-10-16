package L5;

import J5.s;
import J5.u;
import J5.w;
import u6.AbstractC4256a;
import u6.v;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final w f6961a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6962b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6963c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6964d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6965e;

    /* renamed from: f, reason: collision with root package name */
    public int f6966f;

    /* renamed from: g, reason: collision with root package name */
    public int f6967g;

    /* renamed from: h, reason: collision with root package name */
    public int f6968h;

    /* renamed from: i, reason: collision with root package name */
    public int f6969i;

    /* renamed from: j, reason: collision with root package name */
    public int f6970j;
    public long[] k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f6971l;

    public e(int i5, int i10, long j8, int i11, w wVar) {
        boolean z2 = true;
        if (i10 != 1 && i10 != 2) {
            z2 = false;
        }
        AbstractC4256a.e(z2);
        this.f6964d = j8;
        this.f6965e = i11;
        this.f6961a = wVar;
        int i12 = (((i5 % 10) + 48) << 8) | ((i5 / 10) + 48);
        this.f6962b = (i10 == 2 ? 1667497984 : 1651965952) | i12;
        this.f6963c = i10 == 2 ? i12 | 1650720768 : -1;
        this.k = new long[512];
        this.f6971l = new int[512];
    }

    public final u a(int i5) {
        return new u(((this.f6964d * 1) / this.f6965e) * this.f6971l[i5], this.k[i5]);
    }

    public final s b(long j8) {
        int i5 = (int) (j8 / ((this.f6964d * 1) / this.f6965e));
        int iD = v.d(this.f6971l, i5, true, true);
        if (this.f6971l[iD] == i5) {
            u uVarA = a(iD);
            return new s(uVarA, uVarA);
        }
        u uVarA2 = a(iD);
        int i10 = iD + 1;
        return i10 < this.k.length ? new s(uVarA2, a(i10)) : new s(uVarA2, uVarA2);
    }
}
