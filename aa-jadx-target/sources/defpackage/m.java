package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class m {
    private static int h = 1000;
    public defpackage.k[] c;
    public final defpackage.lam g;
    int a = 0;
    public final defpackage.l b = new defpackage.l();
    private int i = 32;
    private int j = 32;
    public boolean[] d = new boolean[32];
    public int e = 1;
    public int f = 0;
    private int k = 32;
    private defpackage.n[] l = new defpackage.n[h];
    private int m = 0;
    private defpackage.k[] n = new defpackage.k[32];

    public m() {
        this.c = null;
        this.c = new defpackage.k[32];
        q();
        this.g = new defpackage.lam((char[]) null);
    }

    public static final int n(java.lang.Object obj) {
        defpackage.n nVar = ((defpackage.o) obj).f;
        if (nVar != null) {
            return (int) (nVar.d + 0.5f);
        }
        return 0;
    }

    public static defpackage.k o(defpackage.m mVar, defpackage.n nVar, defpackage.n nVar2, int i, float f, defpackage.n nVar3, defpackage.n nVar4, int i2) {
        defpackage.k kVarA = mVar.a();
        kVarA.d(nVar, nVar2, i, f, nVar3, nVar4, i2);
        defpackage.n nVarB = mVar.b();
        defpackage.n nVarB2 = mVar.b();
        nVarB.c = 4;
        nVarB2.c = 4;
        kVarA.c(nVarB, nVarB2);
        return kVarA;
    }

    private final void p() {
        int i = this.i;
        int i2 = i + i;
        this.i = i2;
        this.c = (defpackage.k[]) java.util.Arrays.copyOf(this.c, i2);
        defpackage.lam lamVar = this.g;
        lamVar.b = (defpackage.n[]) java.util.Arrays.copyOf((java.lang.Object[]) lamVar.b, this.i);
        int i3 = this.i;
        this.d = new boolean[i3];
        this.j = i3;
        this.k = i3;
        this.b.a.clear();
    }

    private final void q() {
        int i = 0;
        while (true) {
            defpackage.k[] kVarArr = this.c;
            if (i >= kVarArr.length) {
                return;
            }
            defpackage.k kVar = kVarArr[i];
            if (kVar != null) {
                ((defpackage.imz) this.g.c).i(kVar);
            }
            this.c[i] = null;
            i++;
        }
    }

    private final defpackage.n r(int i) {
        defpackage.n nVar = (defpackage.n) ((defpackage.imz) this.g.a).h();
        if (nVar == null) {
            nVar = new defpackage.n(i);
        } else {
            nVar.b();
            nVar.h = i;
        }
        int i2 = this.m;
        int i3 = h;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            h = i4;
            this.l = (defpackage.n[]) java.util.Arrays.copyOf(this.l, i4);
        }
        defpackage.n[] nVarArr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        nVarArr[i5] = nVar;
        return nVar;
    }

    public final defpackage.k a() {
        defpackage.lam lamVar = this.g;
        defpackage.k kVar = (defpackage.k) ((defpackage.imz) lamVar.c).h();
        if (kVar == null) {
            return new defpackage.k(lamVar);
        }
        kVar.a = null;
        defpackage.j jVar = kVar.d;
        jVar.e = -1;
        jVar.f = -1;
        jVar.g = false;
        jVar.a = 0;
        kVar.b = 0.0f;
        kVar.e = false;
        return kVar;
    }

    public final defpackage.n b() {
        if (this.e + 1 >= this.j) {
            p();
        }
        defpackage.n nVarR = r(4);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        nVarR.a = i;
        ((defpackage.n[]) this.g.b)[i] = nVarR;
        return nVarR;
    }

    public final defpackage.n c(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.j) {
            p();
        }
        defpackage.o oVar = (defpackage.o) obj;
        defpackage.n nVar = oVar.f;
        if (nVar == null) {
            oVar.e();
            nVar = oVar.f;
        }
        int i = nVar.a;
        if (i != -1) {
            if (i <= this.a && ((defpackage.n[]) this.g.b)[i] != null) {
                return nVar;
            }
            if (i != -1) {
                nVar.b();
            }
        }
        int i2 = this.a + 1;
        this.a = i2;
        this.e++;
        nVar.a = i2;
        nVar.h = 1;
        ((defpackage.n[]) this.g.b)[i2] = nVar;
        return nVar;
    }

    public final defpackage.n d() {
        if (this.e + 1 >= this.j) {
            p();
        }
        defpackage.n nVarR = r(3);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        nVarR.a = i;
        ((defpackage.n[]) this.g.b)[i] = nVarR;
        return nVarR;
    }

    public final void e(defpackage.k kVar) {
        defpackage.k[] kVarArr;
        if (this.f + 1 >= this.k || this.e + 1 >= this.j) {
            p();
        }
        if (!kVar.e) {
            if (this.f > 0) {
                defpackage.j jVar = kVar.d;
                defpackage.k[] kVarArr2 = this.c;
                int i = jVar.e;
                loop0: while (true) {
                    int i2 = 0;
                    while (true) {
                        if (i == -1 || i2 >= jVar.a) {
                            break loop0;
                        }
                        defpackage.lam lamVar = jVar.h;
                        defpackage.n nVar = ((defpackage.n[]) lamVar.b)[jVar.b[i]];
                        if (nVar.b != -1) {
                            float f = jVar.d[i];
                            jVar.c(nVar);
                            defpackage.k kVar2 = kVarArr2[nVar.b];
                            if (!kVar2.e) {
                                defpackage.j jVar2 = kVar2.d;
                                int i3 = jVar2.e;
                                for (int i4 = 0; i3 != -1 && i4 < jVar2.a; i4++) {
                                    jVar.e(((defpackage.n[]) lamVar.b)[jVar2.b[i3]], jVar2.d[i3] * f);
                                    i3 = jVar2.c[i3];
                                }
                            }
                            kVar.b += kVar2.b * f;
                            kVar2.a.a(kVar);
                            i = jVar.e;
                        } else {
                            i = jVar.c[i];
                            i2++;
                        }
                    }
                }
                if (jVar.a == 0) {
                    kVar.e = true;
                }
            }
            float f2 = kVar.b;
            if (f2 < 0.0f) {
                kVar.b = -f2;
                defpackage.j jVar3 = kVar.d;
                int i5 = jVar3.e;
                for (int i6 = 0; i5 != -1 && i6 < jVar3.a; i6++) {
                    float[] fArr = jVar3.d;
                    fArr[i5] = -fArr[i5];
                    i5 = jVar3.c[i5];
                }
            }
            defpackage.j jVar4 = kVar.d;
            int i7 = jVar4.e;
            defpackage.n nVar2 = null;
            int i8 = 0;
            defpackage.n nVar3 = null;
            while (true) {
                if (i7 == -1 || i8 >= jVar4.a) {
                    if (nVar3 == null) {
                        break;
                    }
                    nVar2 = nVar3;
                    break;
                }
                float[] fArr2 = jVar4.d;
                float f3 = fArr2[i7];
                if (f3 < 0.0f) {
                    if (f3 > -0.001f) {
                        fArr2[i7] = 0.0f;
                        f3 = 0.0f;
                    }
                } else if (f3 < 0.001f) {
                    fArr2[i7] = 0.0f;
                    f3 = 0.0f;
                }
                if (f3 != 0.0f) {
                    defpackage.n nVar4 = ((defpackage.n[]) jVar4.h.b)[jVar4.b[i7]];
                    if (nVar4.h == 1) {
                        if (f3 < 0.0f) {
                            nVar2 = nVar4;
                            break;
                        } else if (nVar3 == null) {
                            nVar3 = nVar4;
                        }
                    } else if (f3 < 0.0f && (nVar2 == null || nVar4.c < nVar2.c)) {
                        nVar2 = nVar4;
                    }
                }
                i7 = jVar4.c[i7];
                i8++;
            }
            if (nVar2 != null) {
                kVar.a(nVar2);
            }
            if (jVar4.a == 0) {
                kVar.e = true;
            }
            defpackage.n nVar5 = kVar.a;
            if (nVar5 == null) {
                return;
            }
            if (nVar5.h != 1 && kVar.b < 0.0f) {
                return;
            }
        }
        defpackage.k kVar3 = this.c[this.f];
        if (kVar3 != null) {
            ((defpackage.imz) this.g.c).i(kVar3);
        }
        if (!kVar.e) {
            kVar.b();
        }
        defpackage.k[] kVarArr3 = this.c;
        int i9 = this.f;
        kVarArr3[i9] = kVar;
        defpackage.n nVar6 = kVar.a;
        nVar6.b = i9;
        this.f = i9 + 1;
        int i10 = nVar6.g;
        if (i10 > 0) {
            while (true) {
                kVarArr = this.n;
                int length = kVarArr.length;
                if (length >= i10) {
                    break;
                } else {
                    this.n = new defpackage.k[length + length];
                }
            }
            for (int i11 = 0; i11 < i10; i11++) {
                kVarArr[i11] = kVar.a.f[i11];
            }
            for (int i12 = 0; i12 < i10; i12++) {
                defpackage.k kVar4 = kVarArr[i12];
                if (kVar4 != kVar) {
                    kVar4.d.g(kVar4, kVar);
                    kVar4.b();
                }
            }
        }
    }

    public final void f(defpackage.n nVar, int i) {
        int i2 = nVar.b;
        if (i2 != -1) {
            defpackage.k kVar = this.c[i2];
            if (kVar.e) {
                kVar.b = i;
                return;
            }
            defpackage.k kVarA = a();
            kVarA.g(nVar, i);
            e(kVarA);
            return;
        }
        float f = i;
        defpackage.k kVarA2 = a();
        kVarA2.a = nVar;
        nVar.d = f;
        kVarA2.b = f;
        kVarA2.e = true;
        e(kVarA2);
    }

    public final void g(defpackage.n nVar, defpackage.n nVar2, int i, int i2) {
        defpackage.k kVarA = a();
        defpackage.n nVarD = d();
        nVarD.c = i2;
        kVarA.i(nVar, nVar2, nVarD, i);
        e(kVarA);
    }

    public final void h(defpackage.n nVar, defpackage.n nVar2, int i, int i2) {
        defpackage.k kVarA = a();
        defpackage.n nVarD = d();
        nVarD.c = i2;
        kVarA.j(nVar, nVar2, nVarD, i);
        e(kVarA);
    }

    public final void i(defpackage.k kVar, int i) {
        kVar.d.f(b(), i);
    }

    public final void j() {
        defpackage.lam lamVar;
        int i = 0;
        while (true) {
            lamVar = this.g;
            defpackage.n[] nVarArr = (defpackage.n[]) lamVar.b;
            if (i >= nVarArr.length) {
                break;
            }
            defpackage.n nVar = nVarArr[i];
            if (nVar != null) {
                nVar.b();
            }
            i++;
        }
        java.lang.Object obj = lamVar.a;
        defpackage.n[] nVarArr2 = this.l;
        int i2 = this.m;
        int length = nVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            defpackage.n nVar2 = nVarArr2[i3];
            defpackage.imz imzVar = (defpackage.imz) obj;
            int i4 = imzVar.a;
            if (i4 < 256) {
                ((java.lang.Object[]) imzVar.b)[i4] = nVar2;
                imzVar.a = i4 + 1;
            }
        }
        this.m = 0;
        java.util.Arrays.fill((java.lang.Object[]) lamVar.b, (java.lang.Object) null);
        this.a = 0;
        this.b.a.clear();
        this.e = 1;
        for (int i5 = 0; i5 < this.f; i5++) {
            this.c[i5].c = false;
        }
        q();
        this.f = 0;
    }

    public final void k(defpackage.n nVar, defpackage.n nVar2, int i, float f, defpackage.n nVar3, defpackage.n nVar4, int i2) {
        defpackage.k kVarA = a();
        kVarA.d(nVar, nVar2, i, f, nVar3, nVar4, i2);
        defpackage.n nVarB = b();
        defpackage.n nVarB2 = b();
        nVarB.c = 4;
        nVarB2.c = 4;
        kVarA.c(nVarB, nVarB2);
        e(kVarA);
    }

    public final void l(defpackage.n nVar, defpackage.n nVar2, int i, int i2) {
        defpackage.k kVarA = a();
        kVarA.h(nVar, nVar2, i);
        defpackage.n nVarB = b();
        defpackage.n nVarB2 = b();
        nVarB.c = i2;
        nVarB2.c = i2;
        kVarA.c(nVarB, nVarB2);
        e(kVarA);
    }

    public final void m(defpackage.l lVar) throws java.lang.Exception {
        for (int i = 0; i < this.f; i++) {
            defpackage.k kVar = this.c[i];
            if (kVar.a.h != 1 && kVar.b < 0.0f) {
                while (true) {
                    float f = Float.MAX_VALUE;
                    int i2 = -1;
                    int i3 = -1;
                    int i4 = 0;
                    for (int i5 = 0; i5 < this.f; i5++) {
                        defpackage.k kVar2 = this.c[i5];
                        if (kVar2.a.h != 1 && kVar2.b < 0.0f) {
                            for (int i6 = 1; i6 < this.e; i6++) {
                                defpackage.n nVar = ((defpackage.n[]) this.g.b)[i6];
                                float fA = kVar2.d.a(nVar);
                                if (fA > 0.0f) {
                                    for (int i7 = 0; i7 < 6; i7++) {
                                        float f2 = nVar.e[i7] / fA;
                                        if ((f2 < f && i7 == i4) || i7 > i4) {
                                            f = f2;
                                            i2 = i5;
                                            i3 = i6;
                                            i4 = i7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i2 == -1) {
                        break;
                    }
                    defpackage.k kVar3 = this.c[i2];
                    kVar3.a.b = -1;
                    kVar3.a(((defpackage.n[]) this.g.b)[i3]);
                    kVar3.a.b = i2;
                    for (int i8 = 0; i8 < this.f; i8++) {
                        this.c[i8].k(kVar3);
                    }
                    lVar.a(this);
                }
            }
        }
        for (int i9 = 0; i9 < this.f; i9++) {
            defpackage.k kVar4 = this.c[i9];
            if (kVar4.a.h != 1 && kVar4.b < 0.0f) {
                return;
            }
        }
    }
}
