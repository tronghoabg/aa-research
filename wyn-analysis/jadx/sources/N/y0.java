package N;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC3340k;
import x.C4420m;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f7966a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f7967b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f7968c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f7969d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f7970e;

    /* renamed from: f, reason: collision with root package name */
    public C4420m f7971f;

    /* renamed from: g, reason: collision with root package name */
    public int f7972g;

    /* renamed from: h, reason: collision with root package name */
    public int f7973h;

    /* renamed from: i, reason: collision with root package name */
    public int f7974i;

    /* renamed from: j, reason: collision with root package name */
    public int f7975j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f7976l;

    /* renamed from: m, reason: collision with root package name */
    public int f7977m;

    /* renamed from: n, reason: collision with root package name */
    public int f7978n;

    /* renamed from: o, reason: collision with root package name */
    public int f7979o;

    /* renamed from: p, reason: collision with root package name */
    public final I f7980p;

    /* renamed from: q, reason: collision with root package name */
    public final I f7981q;

    /* renamed from: r, reason: collision with root package name */
    public final I f7982r;

    /* renamed from: s, reason: collision with root package name */
    public int f7983s;

    /* renamed from: t, reason: collision with root package name */
    public int f7984t;

    /* renamed from: u, reason: collision with root package name */
    public int f7985u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7986v;

    /* renamed from: w, reason: collision with root package name */
    public C0719d0 f7987w;

    public y0(w0 w0Var) {
        this.f7966a = w0Var;
        int[] iArr = w0Var.f7944a;
        this.f7967b = iArr;
        Object[] objArr = w0Var.f7946c;
        this.f7968c = objArr;
        this.f7969d = w0Var.f7951h;
        this.f7970e = w0Var.f7952i;
        this.f7971f = w0Var.f7953j;
        int i5 = w0Var.f7945b;
        this.f7972g = i5;
        this.f7973h = (iArr.length / 5) - i5;
        int i10 = w0Var.f7947d;
        this.k = i10;
        this.f7976l = objArr.length - i10;
        this.f7977m = i5;
        this.f7980p = new I(0);
        this.f7981q = new I(0);
        this.f7982r = new I(0);
        this.f7984t = i5;
        this.f7985u = -1;
    }

    public static int h(int i5, int i10, int i11, int i12) {
        return i5 > i10 ? -(((i12 - i11) - i5) + 1) : i5;
    }

    public final void A(int i5, int i10, int i11) {
        if (i10 > 0) {
            int i12 = this.f7976l;
            int i13 = i5 + i10;
            v(i13, i11);
            this.k = i5;
            this.f7976l = i12 + i10;
            Arrays.fill(this.f7968c, i5, i13, (Object) null);
            int i14 = this.f7975j;
            if (i14 >= i5) {
                this.f7975j = i14 - i10;
            }
        }
    }

    public final void B() {
        int i5 = this.f7984t;
        this.f7983s = i5;
        this.f7974i = f(p(i5), this.f7967b);
    }

    public final int C(int i5, int[] iArr) {
        if (i5 >= m()) {
            return this.f7968c.length - this.f7976l;
        }
        int iR = C0718d.r(i5, iArr);
        return iR < 0 ? (this.f7968c.length - this.f7976l) + iR + 1 : iR;
    }

    public final int D(int i5, int i10) {
        int iC = C(p(i5), this.f7967b);
        int i11 = iC + i10;
        if (i11 >= iC && i11 < f(p(i5 + 1), this.f7967b)) {
            return i11;
        }
        C0718d.v("Write to an invalid slot index " + i10 + " for group " + i5);
        throw null;
    }

    public final void E() {
        if (this.f7978n != 0) {
            C0718d.v("Key must be supplied when inserting");
            throw null;
        }
        P p10 = C0732k.f7800a;
        F(p10, false, p10, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(Object obj, boolean z2, Object obj2, int i5) {
        int i10;
        HashMap map;
        C0716c c0716cG;
        int i11 = this.f7985u;
        Object[] objArr = this.f7978n > 0;
        this.f7982r.c(this.f7979o);
        P p10 = C0732k.f7800a;
        if (objArr == true) {
            int i12 = this.f7983s;
            int iF = f(p(i12), this.f7967b);
            r(1);
            this.f7974i = iF;
            this.f7975j = iF;
            int iP = p(i12);
            int i13 = obj != p10 ? 1 : 0;
            int i14 = (z2 || obj2 == p10) ? 0 : 1;
            int iH = h(iF, this.k, this.f7976l, this.f7968c.length);
            if (iH >= 0 && this.f7977m < i12) {
                iH = -(((this.f7968c.length - this.f7976l) - iH) + 1);
            }
            int[] iArr = this.f7967b;
            int i15 = this.f7985u;
            int i16 = z2 ? 1073741824 : 0;
            int i17 = i13 != 0 ? 536870912 : 0;
            int i18 = i14 != 0 ? 268435456 : 0;
            int i19 = iP * 5;
            iArr[i19] = i5;
            iArr[i19 + 1] = i16 | i17 | i18;
            iArr[i19 + 2] = i15;
            iArr[i19 + 3] = 0;
            iArr[i19 + 4] = iH;
            int i20 = (z2 ? 1 : 0) + i13 + i14;
            if (i20 > 0) {
                s(i20, i12);
                Object[] objArr2 = this.f7968c;
                int i21 = this.f7974i;
                if (z2) {
                    objArr2[i21] = obj2;
                    i21++;
                }
                if (i13 != 0) {
                    objArr2[i21] = obj;
                    i21++;
                }
                if (i14 != 0) {
                    objArr2[i21] = obj2;
                    i21++;
                }
                this.f7974i = i21;
            }
            this.f7979o = 0;
            i10 = i12 + 1;
            this.f7985u = i12;
            this.f7983s = i10;
            if (i11 >= 0 && (map = this.f7970e) != null && (c0716cG = G(i11)) != null) {
            }
        } else {
            this.f7980p.c(i11);
            this.f7981q.c((m() - this.f7973h) - this.f7984t);
            int i22 = this.f7983s;
            int iP2 = p(i22);
            if (!AbstractC3340k.a(obj2, p10)) {
                if (z2) {
                    J(this.f7983s, obj2);
                } else {
                    H(obj2);
                }
            }
            this.f7974i = C(iP2, this.f7967b);
            this.f7975j = f(p(this.f7983s + 1), this.f7967b);
            this.f7979o = C0718d.o(iP2, this.f7967b);
            this.f7985u = i22;
            this.f7983s = i22 + 1;
            i10 = i22 + this.f7967b[(iP2 * 5) + 3];
        }
        this.f7984t = i10;
    }

    public final C0716c G(int i5) {
        ArrayList arrayList;
        int iL;
        if (i5 < 0 || i5 >= n() || (iL = C0718d.L((arrayList = this.f7969d), i5, n())) < 0) {
            return null;
        }
        return (C0716c) arrayList.get(iL);
    }

    public final void H(Object obj) {
        int iP = p(this.f7983s);
        if (!C0718d.k(iP, this.f7967b)) {
            C0718d.v("Updating the data of a group that was not created with a data slot");
            throw null;
        }
        Object[] objArr = this.f7968c;
        int[] iArr = this.f7967b;
        int iF = f(iP, iArr);
        int i5 = 1;
        switch (iArr[(iP * 5) + 1] >> 29) {
            case 0:
                i5 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i5 = 2;
                break;
            default:
                i5 = 3;
                break;
        }
        objArr[g(i5 + iF)] = obj;
    }

    public final void I(int i5) {
        if (i5 >= 0) {
            C0719d0 c0719d0 = this.f7987w;
            if (c0719d0 == null) {
                c0719d0 = new C0719d0(0);
                this.f7987w = c0719d0;
            }
            c0719d0.a(i5);
        }
    }

    public final void J(int i5, Object obj) {
        int iP = p(i5);
        int[] iArr = this.f7967b;
        if (iP < iArr.length && C0718d.m(iP, iArr)) {
            this.f7968c[g(f(iP, this.f7967b))] = obj;
            return;
        }
        C0718d.v("Updating the node of a group at " + i5 + " that was not created with as a node group");
        throw null;
    }

    public final void a(int i5) {
        boolean z2 = false;
        if (!(i5 >= 0)) {
            C0718d.v("Cannot seek backwards");
            throw null;
        }
        if (!(this.f7978n <= 0)) {
            C0718d.P("Cannot call seek() while inserting");
            throw null;
        }
        if (i5 == 0) {
            return;
        }
        int i10 = this.f7983s + i5;
        if (i10 >= this.f7985u && i10 <= this.f7984t) {
            z2 = true;
        }
        if (z2) {
            this.f7983s = i10;
            int iF = f(p(i10), this.f7967b);
            this.f7974i = iF;
            this.f7975j = iF;
            return;
        }
        C0718d.v("Cannot seek outside the current group (" + this.f7985u + '-' + this.f7984t + ')');
        throw null;
    }

    public final C0716c b(int i5) {
        ArrayList arrayList = this.f7969d;
        int iL = C0718d.L(arrayList, i5, n());
        if (iL >= 0) {
            return (C0716c) arrayList.get(iL);
        }
        if (i5 > this.f7972g) {
            i5 = -(n() - i5);
        }
        C0716c c0716c = new C0716c(i5);
        arrayList.add(-(iL + 1), c0716c);
        return c0716c;
    }

    public final int c(C0716c c0716c) {
        int i5 = c0716c.f7752a;
        return i5 < 0 ? n() + i5 : i5;
    }

    public final void d() {
        int i5 = this.f7978n;
        this.f7978n = i5 + 1;
        if (i5 == 0) {
            this.f7981q.c((m() - this.f7973h) - this.f7984t);
        }
    }

    public final void e(boolean z2) {
        this.f7986v = true;
        if (z2 && this.f7980p.f7705a == 0) {
            u(n());
            v(this.f7968c.length - this.f7976l, this.f7972g);
            int i5 = this.k;
            Arrays.fill(this.f7968c, i5, this.f7976l + i5, (Object) null);
            x();
        }
        int[] iArr = this.f7967b;
        int i10 = this.f7972g;
        Object[] objArr = this.f7968c;
        int i11 = this.k;
        ArrayList arrayList = this.f7969d;
        HashMap map = this.f7970e;
        C4420m c4420m = this.f7971f;
        w0 w0Var = this.f7966a;
        w0Var.getClass();
        if (!w0Var.f7949f) {
            C0718d.O("Unexpected writer close()");
            throw null;
        }
        w0Var.f7949f = false;
        w0Var.f7944a = iArr;
        w0Var.f7945b = i10;
        w0Var.f7946c = objArr;
        w0Var.f7947d = i11;
        w0Var.f7951h = arrayList;
        w0Var.f7952i = map;
        w0Var.f7953j = c4420m;
    }

    public final int f(int i5, int[] iArr) {
        if (i5 >= m()) {
            return this.f7968c.length - this.f7976l;
        }
        int i10 = C0718d.i(i5, iArr);
        return i10 < 0 ? (this.f7968c.length - this.f7976l) + i10 + 1 : i10;
    }

    public final int g(int i5) {
        return i5 < this.k ? i5 : i5 + this.f7976l;
    }

    public final void i() {
        boolean z2 = this.f7978n > 0;
        int i5 = this.f7983s;
        int i10 = this.f7984t;
        int i11 = this.f7985u;
        int iP = p(i11);
        int i12 = this.f7979o;
        int i13 = i5 - i11;
        boolean zM = C0718d.m(iP, this.f7967b);
        I i14 = this.f7982r;
        if (z2) {
            C0718d.s(iP, i13, this.f7967b);
            C0718d.t(iP, i12, this.f7967b);
            int iB = i14.b();
            if (zM) {
                i12 = 1;
            }
            this.f7979o = iB + i12;
            int iW = w(i11, this.f7967b);
            this.f7985u = iW;
            int iN = iW < 0 ? n() : p(iW + 1);
            int iF = iN >= 0 ? f(iN, this.f7967b) : 0;
            this.f7974i = iF;
            this.f7975j = iF;
            return;
        }
        if (i5 != i10) {
            C0718d.v("Expected to be at the end of a group");
            throw null;
        }
        int[] iArr = this.f7967b;
        int i15 = iArr[(iP * 5) + 3];
        int iO = C0718d.o(iP, iArr);
        C0718d.s(iP, i13, this.f7967b);
        C0718d.t(iP, i12, this.f7967b);
        int iB2 = this.f7980p.b();
        this.f7984t = (m() - this.f7973h) - this.f7981q.b();
        this.f7985u = iB2;
        int iW2 = w(i11, this.f7967b);
        int iB3 = i14.b();
        this.f7979o = iB3;
        if (iW2 == iB2) {
            this.f7979o = iB3 + (zM ? 0 : i12 - iO);
            return;
        }
        int i16 = i13 - i15;
        int i17 = zM ? 0 : i12 - iO;
        if (i16 != 0 || i17 != 0) {
            while (iW2 != 0 && iW2 != iB2 && (i17 != 0 || i16 != 0)) {
                int iP2 = p(iW2);
                if (i16 != 0) {
                    int[] iArr2 = this.f7967b;
                    C0718d.s(iP2, iArr2[(iP2 * 5) + 3] + i16, iArr2);
                }
                if (i17 != 0) {
                    int[] iArr3 = this.f7967b;
                    C0718d.t(iP2, C0718d.o(iP2, iArr3) + i17, iArr3);
                }
                if (C0718d.m(iP2, this.f7967b)) {
                    i17 = 0;
                }
                iW2 = w(iW2, this.f7967b);
            }
        }
        this.f7979o += i17;
    }

    public final void j() {
        int i5 = this.f7978n;
        if (!(i5 > 0)) {
            C0718d.P("Unbalanced begin/end insert");
            throw null;
        }
        int i10 = i5 - 1;
        this.f7978n = i10;
        if (i10 == 0) {
            if (this.f7982r.f7705a == this.f7980p.f7705a) {
                this.f7984t = (m() - this.f7973h) - this.f7981q.b();
            } else {
                C0718d.v("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        }
    }

    public final void k(int i5) {
        boolean z2 = false;
        if (!(this.f7978n <= 0)) {
            C0718d.v("Cannot call ensureStarted() while inserting");
            throw null;
        }
        int i10 = this.f7985u;
        if (i10 != i5) {
            if (i5 >= i10 && i5 < this.f7984t) {
                z2 = true;
            }
            if (!z2) {
                C0718d.v("Started group at " + i5 + " must be a subgroup of the group at " + i10);
                throw null;
            }
            int i11 = this.f7983s;
            int i12 = this.f7974i;
            int i13 = this.f7975j;
            this.f7983s = i5;
            E();
            this.f7983s = i11;
            this.f7974i = i12;
            this.f7975j = i13;
        }
    }

    public final void l(int i5, int i10, int i11) {
        if (i5 >= this.f7972g) {
            i5 = -((n() - i5) + 2);
        }
        while (i11 < i10) {
            this.f7967b[(p(i11) * 5) + 2] = i5;
            int i12 = this.f7967b[(p(i11) * 5) + 3] + i11;
            l(i11, i12, i11 + 1);
            i11 = i12;
        }
    }

    public final int m() {
        return this.f7967b.length / 5;
    }

    public final int n() {
        return m() - this.f7973h;
    }

    public final int o() {
        return this.f7968c.length - this.f7976l;
    }

    public final int p(int i5) {
        return i5 < this.f7972g ? i5 : i5 + this.f7973h;
    }

    public final int q(int i5) {
        return C0718d.j(p(i5), this.f7967b);
    }

    public final void r(int i5) {
        if (i5 > 0) {
            int i10 = this.f7983s;
            u(i10);
            int i11 = this.f7972g;
            int i12 = this.f7973h;
            int[] iArr = this.f7967b;
            int length = iArr.length / 5;
            int i13 = length - i12;
            if (i12 < i5) {
                int iMax = Math.max(Math.max(length * 2, i13 + i5), 32);
                int[] iArr2 = new int[iMax * 5];
                int i14 = iMax - i13;
                ff.m.g0(0, 0, i11 * 5, iArr, iArr2);
                ff.m.g0((i11 + i14) * 5, (i12 + i11) * 5, length * 5, iArr, iArr2);
                this.f7967b = iArr2;
                i12 = i14;
            }
            int i15 = this.f7984t;
            if (i15 >= i11) {
                this.f7984t = i15 + i5;
            }
            int i16 = i11 + i5;
            this.f7972g = i16;
            this.f7973h = i12 - i5;
            int iH = h(i13 > 0 ? f(p(i10 + i5), this.f7967b) : 0, this.f7977m >= i11 ? this.k : 0, this.f7976l, this.f7968c.length);
            for (int i17 = i11; i17 < i16; i17++) {
                this.f7967b[(i17 * 5) + 4] = iH;
            }
            int i18 = this.f7977m;
            if (i18 >= i11) {
                this.f7977m = i18 + i5;
            }
        }
    }

    public final void s(int i5, int i10) {
        if (i5 > 0) {
            v(this.f7974i, i10);
            int i11 = this.k;
            int i12 = this.f7976l;
            if (i12 < i5) {
                Object[] objArr = this.f7968c;
                int length = objArr.length;
                int i13 = length - i12;
                int iMax = Math.max(Math.max(length * 2, i13 + i5), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i14 = 0; i14 < iMax; i14++) {
                    objArr2[i14] = null;
                }
                int i15 = iMax - i13;
                ff.m.h0(objArr, 0, objArr2, 0, i11);
                ff.m.h0(objArr, i11 + i15, objArr2, i12 + i11, length);
                this.f7968c = objArr2;
                i12 = i15;
            }
            int i16 = this.f7975j;
            if (i16 >= i11) {
                this.f7975j = i16 + i5;
            }
            this.k = i11 + i5;
            this.f7976l = i12 - i5;
        }
    }

    public final void t(w0 w0Var, int i5) {
        C0718d.K(this.f7978n > 0);
        if (i5 == 0 && this.f7983s == 0 && this.f7966a.f7945b == 0) {
            int[] iArr = w0Var.f7944a;
            int i10 = iArr[(i5 * 5) + 3];
            int i11 = w0Var.f7945b;
            if (i10 == i11) {
                int[] iArr2 = this.f7967b;
                Object[] objArr = this.f7968c;
                ArrayList arrayList = this.f7969d;
                HashMap map = this.f7970e;
                C4420m c4420m = this.f7971f;
                Object[] objArr2 = w0Var.f7946c;
                int i12 = w0Var.f7947d;
                HashMap map2 = w0Var.f7952i;
                C4420m c4420m2 = w0Var.f7953j;
                this.f7967b = iArr;
                this.f7968c = objArr2;
                this.f7969d = w0Var.f7951h;
                this.f7972g = i11;
                this.f7973h = (iArr.length / 5) - i11;
                this.k = i12;
                this.f7976l = objArr2.length - i12;
                this.f7977m = i11;
                this.f7970e = map2;
                this.f7971f = c4420m2;
                w0Var.f7944a = iArr2;
                w0Var.f7945b = 0;
                w0Var.f7946c = objArr;
                w0Var.f7947d = 0;
                w0Var.f7951h = arrayList;
                w0Var.f7952i = map;
                w0Var.f7953j = c4420m;
                return;
            }
        }
        y0 y0VarE = w0Var.e();
        try {
            C0718d.E(y0VarE, i5, this, true, true, false);
            y0VarE.e(true);
        } catch (Throwable th) {
            y0VarE.e(false);
            throw th;
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f7983s + " end=" + this.f7984t + " size = " + n() + " gap=" + this.f7972g + '-' + (this.f7972g + this.f7973h) + ')';
    }

    public final void u(int i5) {
        C0716c c0716c;
        int i10;
        C0716c c0716c2;
        int i11;
        int i12;
        int i13 = this.f7973h;
        int i14 = this.f7972g;
        if (i14 != i5) {
            if (!this.f7969d.isEmpty()) {
                int iM = m() - this.f7973h;
                if (i14 < i5) {
                    for (int iN = C0718d.n(this.f7969d, i14, iM); iN < this.f7969d.size() && (i11 = (c0716c2 = (C0716c) this.f7969d.get(iN)).f7752a) < 0 && (i12 = i11 + iM) < i5; iN++) {
                        c0716c2.f7752a = i12;
                    }
                } else {
                    for (int iN2 = C0718d.n(this.f7969d, i5, iM); iN2 < this.f7969d.size() && (i10 = (c0716c = (C0716c) this.f7969d.get(iN2)).f7752a) >= 0; iN2++) {
                        c0716c.f7752a = -(iM - i10);
                    }
                }
            }
            if (i13 > 0) {
                int[] iArr = this.f7967b;
                int i15 = i5 * 5;
                int i16 = i13 * 5;
                int i17 = i14 * 5;
                if (i5 < i14) {
                    ff.m.g0(i16 + i15, i15, i17, iArr, iArr);
                } else {
                    ff.m.g0(i17, i17 + i16, i15 + i16, iArr, iArr);
                }
            }
            if (i5 < i14) {
                i14 = i5 + i13;
            }
            int iM2 = m();
            C0718d.K(i14 < iM2);
            while (i14 < iM2) {
                int i18 = (i14 * 5) + 2;
                int i19 = this.f7967b[i18];
                int iN3 = i19 > -2 ? i19 : (n() + i19) - (-2);
                if (iN3 >= i5) {
                    iN3 = -((n() - iN3) - (-2));
                }
                if (iN3 != i19) {
                    this.f7967b[i18] = iN3;
                }
                i14++;
                if (i14 == i5) {
                    i14 += i13;
                }
            }
        }
        this.f7972g = i5;
    }

    public final void v(int i5, int i10) {
        int i11 = this.f7976l;
        int i12 = this.k;
        int i13 = this.f7977m;
        if (i12 != i5) {
            Object[] objArr = this.f7968c;
            if (i5 < i12) {
                ff.m.h0(objArr, i5 + i11, objArr, i5, i12);
            } else {
                ff.m.h0(objArr, i12, objArr, i12 + i11, i5 + i11);
            }
        }
        int iMin = Math.min(i10 + 1, n());
        if (i13 != iMin) {
            int length = this.f7968c.length - i11;
            if (iMin < i13) {
                int iP = p(iMin);
                int iP2 = p(i13);
                int i14 = this.f7972g;
                while (iP < iP2) {
                    int[] iArr = this.f7967b;
                    int i15 = (iP * 5) + 4;
                    int i16 = iArr[i15];
                    if (i16 < 0) {
                        C0718d.v("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                    iArr[i15] = -((length - i16) + 1);
                    iP++;
                    if (iP == i14) {
                        iP += this.f7973h;
                    }
                }
            } else {
                int iP3 = p(i13);
                int iP4 = p(iMin);
                while (iP3 < iP4) {
                    int[] iArr2 = this.f7967b;
                    int i17 = (iP3 * 5) + 4;
                    int i18 = iArr2[i17];
                    if (i18 >= 0) {
                        C0718d.v("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                    iArr2[i17] = i18 + length + 1;
                    iP3++;
                    if (iP3 == this.f7972g) {
                        iP3 += this.f7973h;
                    }
                }
            }
            this.f7977m = iMin;
        }
        this.k = i5;
    }

    public final int w(int i5, int[] iArr) {
        int iP = C0718d.p(p(i5), iArr);
        return iP > -2 ? iP : (n() + iP) - (-2);
    }

    public final void x() {
        boolean z2;
        C0719d0 c0719d0 = this.f7987w;
        if (c0719d0 != null) {
            while (!c0719d0.f7761a.isEmpty()) {
                int iE = c0719d0.e();
                int iP = p(iE);
                int iQ = iE + 1;
                int iQ2 = q(iE) + iE;
                while (true) {
                    if (iQ >= iQ2) {
                        z2 = false;
                        break;
                    } else {
                        if ((this.f7967b[(p(iQ) * 5) + 1] & 201326592) != 0) {
                            z2 = true;
                            break;
                        }
                        iQ += q(iQ);
                    }
                }
                if (C0718d.h(iP, this.f7967b) != z2) {
                    int[] iArr = this.f7967b;
                    int i5 = (iP * 5) + 1;
                    if (z2) {
                        iArr[i5] = iArr[i5] | 67108864;
                    } else {
                        iArr[i5] = iArr[i5] & (-67108865);
                    }
                    int iW = w(iE, iArr);
                    if (iW >= 0) {
                        c0719d0.a(iW);
                    }
                }
            }
        }
    }

    public final boolean y() {
        C0716c c0716cG;
        if (this.f7978n != 0) {
            C0718d.v("Cannot remove group while inserting");
            throw null;
        }
        int i5 = this.f7983s;
        int i10 = this.f7974i;
        int iF = f(p(i5), this.f7967b);
        int iP = p(this.f7983s);
        int iJ = C0718d.j(iP, this.f7967b) + this.f7983s;
        this.f7983s = iJ;
        this.f7974i = f(p(iJ), this.f7967b);
        int iO = C0718d.m(iP, this.f7967b) ? 1 : C0718d.o(iP, this.f7967b);
        int i11 = this.f7985u;
        HashMap map = this.f7970e;
        if (map != null && (c0716cG = G(i11)) != null) {
        }
        C0719d0 c0719d0 = this.f7987w;
        if (c0719d0 != null) {
            while (true) {
                ArrayList arrayList = c0719d0.f7761a;
                if (arrayList.isEmpty() || ((Number) ff.o.q0(arrayList)).intValue() < i5) {
                    break;
                }
                c0719d0.e();
            }
        }
        boolean z2 = z(i5, this.f7983s - i5);
        A(iF, this.f7974i - iF, i5 - 1);
        this.f7983s = i5;
        this.f7974i = i10;
        this.f7979o -= iO;
        return z2;
    }

    public final boolean z(int i5, int i10) {
        if (i10 > 0) {
            ArrayList arrayList = this.f7969d;
            u(i5);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f7970e;
                int i11 = i5 + i10;
                int iN = C0718d.n(this.f7969d, i11, m() - this.f7973h);
                if (iN >= this.f7969d.size()) {
                    iN--;
                }
                int i12 = iN + 1;
                int i13 = 0;
                while (iN >= 0) {
                    C0716c c0716c = (C0716c) this.f7969d.get(iN);
                    int iC = c(c0716c);
                    if (iC < i5) {
                        break;
                    }
                    if (iC < i11) {
                        c0716c.f7752a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i13 == 0) {
                            i13 = iN + 1;
                        }
                        i12 = iN;
                    }
                    iN--;
                }
                z = i12 < i13;
                if (z) {
                    this.f7969d.subList(i12, i13).clear();
                }
            }
            this.f7972g = i5;
            this.f7973h += i10;
            int i14 = this.f7977m;
            if (i14 > i5) {
                this.f7977m = Math.max(i5, i14 - i10);
            }
            int i15 = this.f7984t;
            if (i15 >= this.f7972g) {
                this.f7984t = i15 - i10;
            }
            int i16 = this.f7985u;
            if (i16 >= 0) {
                if (C0718d.h(p(i16), this.f7967b)) {
                    I(i16);
                }
            }
        }
        return z;
    }
}
