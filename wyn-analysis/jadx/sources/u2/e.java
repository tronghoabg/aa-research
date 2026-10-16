package u2;

import Q1.k;
import s2.C;
import s2.v;
import s2.x;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final C f46547a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46548b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46549c;

    /* renamed from: d, reason: collision with root package name */
    public final long f46550d;

    /* renamed from: e, reason: collision with root package name */
    public final int f46551e;

    /* renamed from: f, reason: collision with root package name */
    public int f46552f;

    /* renamed from: g, reason: collision with root package name */
    public int f46553g;

    /* renamed from: h, reason: collision with root package name */
    public int f46554h;

    /* renamed from: i, reason: collision with root package name */
    public int f46555i;

    /* renamed from: j, reason: collision with root package name */
    public int f46556j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long[] f46557l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f46558m;

    public e(int i5, int i10, long j8, int i11, C c10) {
        boolean z2 = true;
        if (i10 != 1 && i10 != 2) {
            z2 = false;
        }
        k.c(z2);
        this.f46550d = j8;
        this.f46551e = i11;
        this.f46547a = c10;
        int i12 = (((i5 % 10) + 48) << 8) | ((i5 / 10) + 48);
        this.f46548b = (i10 == 2 ? 1667497984 : 1651965952) | i12;
        this.f46549c = i10 == 2 ? i12 | 1650720768 : -1;
        this.k = -1L;
        this.f46557l = new long[512];
        this.f46558m = new int[512];
    }

    public final x a(int i5) {
        return new x(((this.f46550d * 1) / this.f46551e) * this.f46558m[i5], this.f46557l[i5]);
    }

    public final v b(long j8) {
        if (this.f46556j == 0) {
            x xVar = new x(0L, this.k);
            return new v(xVar, xVar);
        }
        int i5 = (int) (j8 / ((this.f46550d * 1) / this.f46551e));
        int iD = Q1.x.d(this.f46558m, i5, true, true);
        if (this.f46558m[iD] == i5) {
            x xVarA = a(iD);
            return new v(xVarA, xVarA);
        }
        x xVarA2 = a(iD);
        int i10 = iD + 1;
        return i10 < this.f46557l.length ? new v(xVarA2, a(i10)) : new v(xVarA2, xVarA2);
    }
}
