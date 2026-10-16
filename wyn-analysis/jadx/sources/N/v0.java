package N;

import Va.M6;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f7929a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7930b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7931c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f7932d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7933e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7934f;

    /* renamed from: g, reason: collision with root package name */
    public int f7935g;

    /* renamed from: h, reason: collision with root package name */
    public int f7936h;

    /* renamed from: i, reason: collision with root package name */
    public int f7937i;

    /* renamed from: j, reason: collision with root package name */
    public final I f7938j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f7939l;

    /* renamed from: m, reason: collision with root package name */
    public int f7940m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7941n;

    public v0(w0 w0Var) {
        this.f7929a = w0Var;
        this.f7930b = w0Var.f7944a;
        int i5 = w0Var.f7945b;
        this.f7931c = i5;
        this.f7932d = w0Var.f7946c;
        this.f7933e = w0Var.f7947d;
        this.f7936h = i5;
        this.f7937i = -1;
        this.f7938j = new I(0);
    }

    public final C0716c a(int i5) {
        ArrayList arrayList = this.f7929a.f7951h;
        int iL = C0718d.L(arrayList, i5, this.f7931c);
        if (iL >= 0) {
            return (C0716c) arrayList.get(iL);
        }
        C0716c c0716c = new C0716c(i5);
        arrayList.add(-(iL + 1), c0716c);
        return c0716c;
    }

    public final Object b(int i5, int[] iArr) {
        int length;
        if (!C0718d.k(i5, iArr)) {
            return C0732k.f7800a;
        }
        int i10 = i5 * 5;
        if (i10 >= iArr.length) {
            length = iArr.length;
        } else {
            int i11 = iArr[i10 + 4];
            int i12 = 1;
            switch (iArr[i10 + 1] >> 29) {
                case 0:
                    i12 = 0;
                    break;
                case 1:
                case 2:
                case 4:
                    break;
                case 3:
                case 5:
                case 6:
                    i12 = 2;
                    break;
                default:
                    i12 = 3;
                    break;
            }
            length = i12 + i11;
        }
        return this.f7932d[length];
    }

    public final void c() {
        int i5;
        this.f7934f = true;
        w0 w0Var = this.f7929a;
        w0Var.getClass();
        if (this.f7929a != w0Var || (i5 = w0Var.f7948e) <= 0) {
            C0718d.v("Unexpected reader close()");
            throw null;
        }
        w0Var.f7948e = i5 - 1;
    }

    public final void d() {
        if (this.k == 0) {
            if (!(this.f7935g == this.f7936h)) {
                C0718d.v("endGroup() not called at the end of a group");
                throw null;
            }
            int i5 = this.f7937i;
            int[] iArr = this.f7930b;
            int iP = C0718d.p(i5, iArr);
            this.f7937i = iP;
            int i10 = this.f7931c;
            this.f7936h = iP < 0 ? i10 : C0718d.j(iP, iArr) + iP;
            int iB = this.f7938j.b();
            if (iB < 0) {
                this.f7939l = 0;
                this.f7940m = 0;
            } else {
                this.f7939l = iB;
                this.f7940m = iP >= i10 - 1 ? this.f7933e : C0718d.i(iP + 1, iArr);
            }
        }
    }

    public final Object e() {
        int i5 = this.f7935g;
        if (i5 < this.f7936h) {
            return b(i5, this.f7930b);
        }
        return 0;
    }

    public final int f() {
        int i5 = this.f7935g;
        if (i5 >= this.f7936h) {
            return 0;
        }
        return this.f7930b[i5 * 5];
    }

    public final Object g(int i5, int i10) {
        int[] iArr = this.f7930b;
        int iR = C0718d.r(i5, iArr);
        int i11 = i5 + 1;
        int i12 = iR + i10;
        return i12 < (i11 < this.f7931c ? iArr[(i11 * 5) + 4] : this.f7933e) ? this.f7932d[i12] : C0732k.f7800a;
    }

    public final Object h() {
        int i5;
        if (this.k > 0 || (i5 = this.f7939l) >= this.f7940m) {
            this.f7941n = false;
            return C0732k.f7800a;
        }
        this.f7941n = true;
        this.f7939l = i5 + 1;
        return this.f7932d[i5];
    }

    public final Object i(int i5) {
        int[] iArr = this.f7930b;
        if (!C0718d.m(i5, iArr)) {
            return null;
        }
        if (!C0718d.m(i5, iArr)) {
            return C0732k.f7800a;
        }
        return this.f7932d[iArr[(i5 * 5) + 4]];
    }

    public final Object j(int i5, int[] iArr) {
        if (!C0718d.l(i5, iArr)) {
            return null;
        }
        Object[] objArr = this.f7932d;
        int i10 = i5 * 5;
        int i11 = iArr[i10 + 4];
        int i12 = 1;
        switch (iArr[i10 + 1] >> 30) {
            case 0:
                i12 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        return objArr[i12 + i11];
    }

    public final void k(int i5) {
        if (!(this.k == 0)) {
            C0718d.v("Cannot reposition while in an empty region");
            throw null;
        }
        this.f7935g = i5;
        int[] iArr = this.f7930b;
        int i10 = this.f7931c;
        int iP = i5 < i10 ? C0718d.p(i5, iArr) : -1;
        this.f7937i = iP;
        if (iP < 0) {
            this.f7936h = i10;
        } else {
            this.f7936h = C0718d.j(iP, iArr) + iP;
        }
        this.f7939l = 0;
        this.f7940m = 0;
    }

    public final int l() {
        if (!(this.k == 0)) {
            C0718d.v("Cannot skip while in an empty region");
            throw null;
        }
        int i5 = this.f7935g;
        int[] iArr = this.f7930b;
        int iO = C0718d.m(i5, iArr) ? 1 : C0718d.o(this.f7935g, iArr);
        int i10 = this.f7935g;
        this.f7935g = C0718d.j(i10, iArr) + i10;
        return iO;
    }

    public final void m() {
        if (!(this.k == 0)) {
            C0718d.v("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
        this.f7935g = this.f7936h;
        this.f7939l = 0;
        this.f7940m = 0;
    }

    public final void n() {
        if (this.k <= 0) {
            int i5 = this.f7937i;
            int i10 = this.f7935g;
            int[] iArr = this.f7930b;
            if (!(C0718d.p(i10, iArr) == i5)) {
                C0718d.O("Invalid slot table detected");
                throw null;
            }
            int i11 = this.f7939l;
            int i12 = this.f7940m;
            I i13 = this.f7938j;
            if (i11 == 0 && i12 == 0) {
                i13.c(-1);
            } else {
                i13.c(i11);
            }
            this.f7937i = i10;
            this.f7936h = C0718d.j(i10, iArr) + i10;
            int i14 = i10 + 1;
            this.f7935g = i14;
            this.f7939l = C0718d.r(i10, iArr);
            this.f7940m = i10 >= this.f7931c - 1 ? this.f7933e : C0718d.i(i14, iArr);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f7935g);
        sb2.append(", key=");
        sb2.append(f());
        sb2.append(", parent=");
        sb2.append(this.f7937i);
        sb2.append(", end=");
        return M6.r(sb2, this.f7936h, ')');
    }
}
