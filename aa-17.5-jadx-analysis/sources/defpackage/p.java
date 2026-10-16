package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class p {
    protected int A;
    protected int B;
    public int C;
    protected int D;
    protected int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public Object J;
    public int K;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    public int V;
    public int W;
    boolean X;
    boolean Y;
    public float Z;
    public float aa;
    p ab;
    p ac;
    public int ad;
    public int ae;
    private int af;
    private int ag;
    final o i;
    final o j;
    final o k;
    final o l;
    final o m;
    final o n;
    final o o;
    final o p;
    protected final ArrayList q;
    public p r;
    int s;
    int t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;

    public p() {
        o oVar = new o(this, 2);
        this.i = oVar;
        o oVar2 = new o(this, 3);
        this.j = oVar2;
        o oVar3 = new o(this, 4);
        this.k = oVar3;
        o oVar4 = new o(this, 5);
        this.l = oVar4;
        o oVar5 = new o(this, 6);
        this.m = oVar5;
        o oVar6 = new o(this, 8);
        this.n = oVar6;
        o oVar7 = new o(this, 9);
        this.o = oVar7;
        this.p = new o(this, 7);
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = BitmapDescriptorFactory.HUE_RED;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.K = 0;
        this.V = 0;
        this.W = 0;
        this.Z = BitmapDescriptorFactory.HUE_RED;
        this.aa = BitmapDescriptorFactory.HUE_RED;
        this.ab = null;
        this.ac = null;
        arrayList.add(oVar);
        arrayList.add(oVar2);
        arrayList.add(oVar3);
        arrayList.add(oVar4);
        arrayList.add(oVar6);
        arrayList.add(oVar7);
        arrayList.add(oVar5);
    }

    private final void A(m mVar, boolean z, boolean z2, o oVar, o oVar2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        int i8 = i6;
        n nVarC = mVar.c(oVar);
        n nVarC2 = mVar.c(oVar2);
        n nVarC3 = mVar.c(oVar.b);
        n nVarC4 = mVar.c(oVar2.b);
        int iA = oVar.a();
        int iA2 = oVar2.a();
        int i9 = this.K;
        boolean z5 = i9 != 8;
        int i10 = i9 == 8 ? 0 : i3;
        boolean z6 = (!z5) | z2;
        if (nVarC3 == null && nVarC4 == null) {
            k kVarA = mVar.a();
            kVarA.g(nVarC, i);
            mVar.e(kVarA);
            if (z3) {
                return;
            }
            if (z) {
                k kVarA2 = mVar.a();
                kVarA2.h(nVarC2, nVarC, i4);
                mVar.i(kVarA2, 1);
                mVar.e(kVarA2);
                return;
            }
            if (z6) {
                k kVarA3 = mVar.a();
                kVarA3.h(nVarC2, nVarC, i10);
                mVar.e(kVarA3);
                return;
            } else {
                k kVarA4 = mVar.a();
                kVarA4.g(nVarC2, i2);
                mVar.e(kVarA4);
                return;
            }
        }
        if (nVarC3 != null && nVarC4 == null) {
            k kVarA5 = mVar.a();
            kVarA5.h(nVarC, nVarC3, iA);
            mVar.e(kVarA5);
            if (z) {
                k kVarA6 = mVar.a();
                kVarA6.h(nVarC2, nVarC, i4);
                mVar.i(kVarA6, 1);
                mVar.e(kVarA6);
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                k kVarA7 = mVar.a();
                kVarA7.h(nVarC2, nVarC, i10);
                mVar.e(kVarA7);
                return;
            } else {
                k kVarA8 = mVar.a();
                kVarA8.g(nVarC2, i2);
                mVar.e(kVarA8);
                return;
            }
        }
        if (nVarC3 == null) {
            k kVarA9 = mVar.a();
            kVarA9.h(nVarC2, nVarC4, -iA2);
            mVar.e(kVarA9);
            if (z) {
                k kVarA10 = mVar.a();
                kVarA10.h(nVarC2, nVarC, i4);
                mVar.i(kVarA10, 1);
                mVar.e(kVarA10);
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                k kVarA11 = mVar.a();
                kVarA11.h(nVarC2, nVarC, i10);
                mVar.e(kVarA11);
                return;
            } else {
                k kVarA12 = mVar.a();
                kVarA12.g(nVarC, i);
                mVar.e(kVarA12);
                return;
            }
        }
        if (!z6) {
            if (z3) {
                mVar.g(nVarC, nVarC3, iA, 3);
                mVar.h(nVarC2, nVarC4, -iA2, 3);
                mVar.e(m.o(mVar, nVarC, nVarC3, iA, f, nVarC4, nVarC2, iA2));
                return;
            }
            if (z4) {
                return;
            }
            int i11 = -iA2;
            if (i5 == 1) {
                if (i8 <= i10) {
                    i8 = i10;
                }
                if (i7 > 0) {
                    if (i7 < i8) {
                        i8 = i7;
                    } else {
                        mVar.h(nVarC2, nVarC, i7, 3);
                    }
                }
                mVar.l(nVarC2, nVarC, i8, 3);
                mVar.g(nVarC, nVarC3, iA, 2);
                mVar.h(nVarC2, nVarC4, i11, 2);
                mVar.k(nVarC, nVarC3, iA, f, nVarC4, nVarC2, iA2);
                return;
            }
            if (i8 != 0 || i7 != 0) {
                if (i7 > 0) {
                    mVar.h(nVarC2, nVarC, i7, 3);
                }
                mVar.g(nVarC, nVarC3, iA, 2);
                mVar.h(nVarC2, nVarC4, i11, 2);
                mVar.k(nVarC, nVarC3, iA, f, nVarC4, nVarC2, iA2);
                return;
            }
            k kVarA13 = mVar.a();
            kVarA13.h(nVarC, nVarC3, iA);
            mVar.e(kVarA13);
            k kVarA14 = mVar.a();
            kVarA14.h(nVarC2, nVarC4, i11);
            mVar.e(kVarA14);
            return;
        }
        if (z) {
            k kVarA15 = mVar.a();
            kVarA15.h(nVarC2, nVarC, i4);
            mVar.i(kVarA15, 1);
            mVar.e(kVarA15);
        } else {
            k kVarA16 = mVar.a();
            kVarA16.h(nVarC2, nVarC, i10);
            mVar.e(kVarA16);
        }
        int i12 = oVar.h;
        if (i12 != oVar2.h) {
            int i13 = -iA2;
            if (i12 == 2) {
                k kVarA17 = mVar.a();
                kVarA17.h(nVarC, nVarC3, iA);
                mVar.e(kVarA17);
                n nVarD = mVar.d();
                k kVarA18 = mVar.a();
                kVarA18.j(nVarC2, nVarC4, nVarD, i13);
                mVar.e(kVarA18);
                return;
            }
            n nVarD2 = mVar.d();
            k kVarA19 = mVar.a();
            kVarA19.i(nVarC, nVarC3, nVarD2, iA);
            mVar.e(kVarA19);
            k kVarA20 = mVar.a();
            kVarA20.h(nVarC2, nVarC4, i13);
            mVar.e(kVarA20);
            return;
        }
        if (nVarC3 == nVarC4) {
            mVar.e(m.o(mVar, nVarC, nVarC3, 0, 0.5f, nVarC4, nVarC2, 0));
            return;
        }
        if (z4) {
            return;
        }
        int i14 = -iA2;
        int i15 = oVar.i;
        n nVarD3 = mVar.d();
        k kVarA21 = mVar.a();
        kVarA21.i(nVarC, nVarC3, nVarD3, iA);
        if (i15 != 2) {
            mVar.i(kVarA21, (int) (-kVarA21.d.a(nVarD3)));
        }
        mVar.e(kVarA21);
        int i16 = oVar2.i;
        n nVarD4 = mVar.d();
        k kVarA22 = mVar.a();
        kVarA22.j(nVarC2, nVarC4, nVarD4, i14);
        if (i16 != 2) {
            mVar.i(kVarA22, (int) (-kVarA22.d.a(nVarD4)));
        }
        mVar.e(kVarA22);
        k kVarA23 = mVar.a();
        kVarA23.d(nVarC, nVarC3, iA, f, nVarC4, nVarC2, iA2);
        mVar.e(kVarA23);
    }

    public final int a() {
        return this.x + this.t;
    }

    public final int b() {
        return this.af + this.A;
    }

    public final int c() {
        return this.ag + this.B;
    }

    public final int d() {
        if (this.K == 8) {
            return 0;
        }
        return this.t;
    }

    public final int e() {
        int i = this.t;
        if (this.ae != 3) {
            return i;
        }
        int i2 = this.d;
        int iMax = this.g;
        if (i2 == 1) {
            iMax = Math.max(iMax, i);
        } else if (iMax > 0) {
            this.t = iMax;
        } else {
            iMax = 0;
        }
        int i3 = this.h;
        return (i3 <= 0 || i3 >= iMax) ? iMax : i3;
    }

    public final int f() {
        int i = this.s;
        if (this.ad != 3) {
            return i;
        }
        int i2 = this.c;
        int iMax = this.e;
        if (i2 == 1) {
            iMax = Math.max(iMax, i);
        } else if (iMax > 0) {
            this.s = iMax;
        } else {
            iMax = 0;
        }
        int i3 = this.f;
        return (i3 <= 0 || i3 >= iMax) ? iMax : i3;
    }

    public final int g() {
        return this.w + this.s;
    }

    public final int h() {
        if (this.K == 8) {
            return 0;
        }
        return this.s;
    }

    public void i() {
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.o.b();
        this.p.b();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = BitmapDescriptorFactory.HUE_RED;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = BitmapDescriptorFactory.HUE_RED;
        this.aa = BitmapDescriptorFactory.HUE_RED;
        this.a = -1;
        this.b = -1;
    }

    public final void j(int i) {
        this.t = i;
        int i2 = this.E;
        if (i < i2) {
            this.t = i2;
        }
    }

    public final void k(int i, int i2) {
        this.w = i;
        int i3 = i2 - i;
        this.s = i3;
        int i4 = this.D;
        if (i3 < i4) {
            this.s = i4;
        }
    }

    public final void l(int i) {
        if (i < 0) {
            this.E = 0;
        } else {
            this.E = i;
        }
    }

    public final void m(int i) {
        if (i < 0) {
            this.D = 0;
        } else {
            this.D = i;
        }
    }

    public void n(int i, int i2) {
        this.A = i;
        this.B = i2;
    }

    public final void o(int i, int i2) {
        this.x = i;
        int i3 = i2 - i;
        this.t = i3;
        int i4 = this.E;
        if (i3 < i4) {
            this.t = i4;
        }
    }

    public final void p(int i) {
        this.s = i;
        int i2 = this.D;
        if (i < i2) {
            this.s = i2;
        }
    }

    public void q() {
        int i = this.w;
        int i2 = this.x;
        int i3 = this.s + i;
        int i4 = this.t + i2;
        this.af = i;
        this.ag = i2;
        this.y = i3 - i;
        this.z = i4 - i2;
    }

    public final boolean r() {
        return this.C > 0;
    }

    public final boolean s() {
        return this.r == null;
    }

    public o t(int i) {
        switch (i - 1) {
            case 1:
                return this.i;
            case 2:
                return this.j;
            case 3:
                return this.k;
            case 4:
                return this.l;
            case 5:
                return this.m;
            case 6:
            default:
                return this.p;
            case 7:
                return this.n;
            case 8:
                return this.o;
        }
    }

    public final String toString() {
        return "(" + this.w + ", " + this.x + ") - (" + this.s + " x " + this.t + ") wrap: (" + this.F + " x " + this.G + ")";
    }

    public final void u(int i, p pVar, int i2, int i3, int i4) {
        t(i).d(pVar.t(i2), i3, i4, 2, 0, true);
    }

    public final void v(int i) {
        this.ad = i;
        if (i == 2) {
            p(this.F);
        }
    }

    public final void w(int i) {
        this.ae = i;
        if (i == 2) {
            j(this.G);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(defpackage.m r44) {
        /*
            Method dump skipped, instructions count: 1121
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p.x(m):void");
    }

    public void y() {
        int i;
        int i2;
        int iN = m.n(this.i);
        int iN2 = m.n(this.j);
        int iN3 = m.n(this.k) - iN;
        int iN4 = m.n(this.l) - iN2;
        this.w = iN;
        this.x = iN2;
        if (this.K == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        if (this.ad == 1 && iN3 < (i2 = this.s)) {
            iN3 = i2;
        }
        if (this.ae == 1 && iN4 < (i = this.t)) {
            iN4 = i;
        }
        this.s = iN3;
        this.t = iN4;
        int i3 = this.E;
        if (iN4 < i3) {
            this.t = i3;
        }
        int i4 = this.D;
        if (iN3 < i4) {
            this.s = i4;
        }
    }

    public void z(lah lahVar) {
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.e();
        this.p.e();
        this.n.e();
        this.o.e();
    }
}
