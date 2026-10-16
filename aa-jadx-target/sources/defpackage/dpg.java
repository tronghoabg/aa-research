package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dpg {
    public static boolean a = false;
    public static long b;
    public final defpackage.lam j;
    private final defpackage.dpf r;
    private defpackage.dpf s;
    private int k = 1000;
    public boolean c = false;
    int d = 0;
    private int l = 32;
    private int m = 32;
    public boolean f = false;
    public boolean g = false;
    private boolean[] n = new boolean[32];
    int h = 1;
    int i = 0;
    private int o = 32;
    private defpackage.dpj[] p = new defpackage.dpj[1000];
    private int q = 0;
    defpackage.dpf[] e = new defpackage.dpf[32];

    public dpg() {
        t();
        defpackage.lam lamVar = new defpackage.lam((short[]) null);
        this.j = lamVar;
        this.r = new defpackage.dpi(lamVar);
        this.s = new defpackage.dpf(lamVar);
    }

    public static final int o(java.lang.Object obj) {
        defpackage.dpj dpjVar = ((defpackage.dqu) obj).h;
        if (dpjVar != null) {
            return (int) (dpjVar.f + 0.5f);
        }
        return 0;
    }

    private final void q(defpackage.dpf dpfVar) {
        int i;
        if (dpfVar.d) {
            dpfVar.a.d(this, dpfVar.b);
        } else {
            defpackage.dpf[] dpfVarArr = this.e;
            int i2 = this.i;
            dpfVarArr[i2] = dpfVar;
            defpackage.dpj dpjVar = dpfVar.a;
            dpjVar.d = i2;
            this.i = i2 + 1;
            dpjVar.e(this, dpfVar);
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < this.i) {
                if (this.e[i3] == null) {
                    java.lang.System.out.println("WTF");
                }
                defpackage.dpf dpfVar2 = this.e[i3];
                if (dpfVar2 != null && dpfVar2.d) {
                    dpfVar2.a.d(this, dpfVar2.b);
                    ((defpackage.skb) this.j.a).g(dpfVar2);
                    this.e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.i;
                        if (i4 >= i) {
                            break;
                        }
                        defpackage.dpf[] dpfVarArr2 = this.e;
                        int i6 = i4 - 1;
                        defpackage.dpf dpfVar3 = dpfVarArr2[i4];
                        dpfVarArr2[i6] = dpfVar3;
                        defpackage.dpj dpjVar2 = dpfVar3.a;
                        if (dpjVar2.d == i4) {
                            dpjVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.e[i5] = null;
                    }
                    this.i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.c = false;
        }
    }

    private final void r() {
        for (int i = 0; i < this.i; i++) {
            defpackage.dpf dpfVar = this.e[i];
            dpfVar.a.f = dpfVar.b;
        }
    }

    private final void s() {
        int i = this.l;
        int i2 = i + i;
        this.l = i2;
        this.e = (defpackage.dpf[]) java.util.Arrays.copyOf(this.e, i2);
        defpackage.lam lamVar = this.j;
        lamVar.b = (defpackage.dpj[]) java.util.Arrays.copyOf((java.lang.Object[]) lamVar.b, this.l);
        int i3 = this.l;
        this.n = new boolean[i3];
        this.m = i3;
        this.o = i3;
    }

    private final void t() {
        for (int i = 0; i < this.i; i++) {
            defpackage.dpf dpfVar = this.e[i];
            if (dpfVar != null) {
                ((defpackage.skb) this.j.a).g(dpfVar);
            }
            this.e[i] = null;
        }
    }

    private final void u(defpackage.dpf dpfVar) {
        defpackage.dpe dpeVar;
        int i;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.n[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            z = true;
            i3++;
            int i4 = this.h;
            if (i3 >= i4 + i4) {
                return;
            }
            defpackage.dpj dpjVar = dpfVar.a;
            if (dpjVar != null) {
                this.n[dpjVar.c] = true;
            }
            defpackage.dpj dpjVarK = dpfVar.k(this.n);
            if (dpjVarK != null) {
                boolean[] zArr = this.n;
                int i5 = dpjVarK.c;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (dpjVarK != null) {
                float f = Float.MAX_VALUE;
                int i6 = -1;
                for (int i7 = 0; i7 < this.i; i7++) {
                    defpackage.dpf dpfVar2 = this.e[i7];
                    if (dpfVar2.a.n != 1 && !dpfVar2.d && (i = (dpeVar = dpfVar2.e).e) != -1) {
                        for (int i8 = 0; i != -1 && i8 < dpeVar.a; i8++) {
                            if (dpeVar.b[i] == dpjVarK.c) {
                                float fA = dpfVar2.e.a(dpjVarK);
                                if (fA >= 0.0f) {
                                    break;
                                }
                                float f2 = (-dpfVar2.b) / fA;
                                if (f2 >= f) {
                                    break;
                                }
                                i6 = i7;
                                f = f2;
                                break;
                            }
                            i = dpeVar.c[i];
                        }
                    }
                }
                if (i6 >= 0) {
                    defpackage.dpf dpfVar3 = this.e[i6];
                    dpfVar3.a.d = -1;
                    dpfVar3.b(dpjVarK);
                    defpackage.dpj dpjVar2 = dpfVar3.a;
                    dpjVar2.d = i6;
                    dpjVar2.e(this, dpfVar3);
                }
                z = false;
            }
        }
    }

    private final defpackage.dpj v(int i) {
        defpackage.dpj dpjVar = (defpackage.dpj) ((defpackage.skb) this.j.c).f();
        if (dpjVar == null) {
            dpjVar = new defpackage.dpj(i);
            dpjVar.n = i;
        } else {
            dpjVar.c();
            dpjVar.n = i;
        }
        int i2 = this.q;
        int i3 = this.k;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            this.k = i4;
            this.p = (defpackage.dpj[]) java.util.Arrays.copyOf(this.p, i4);
        }
        defpackage.dpj[] dpjVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        dpjVarArr[i5] = dpjVar;
        return dpjVar;
    }

    public final defpackage.dpf a() {
        defpackage.lam lamVar = this.j;
        defpackage.dpf dpfVar = (defpackage.dpf) ((defpackage.skb) lamVar.a).f();
        if (dpfVar == null) {
            dpfVar = new defpackage.dpf(lamVar);
            b++;
        } else {
            dpfVar.a = null;
            dpfVar.e.f();
            dpfVar.b = 0.0f;
            dpfVar.d = false;
        }
        defpackage.dpj.a++;
        return dpfVar;
    }

    public final defpackage.dpj b(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            s();
        }
        defpackage.dqu dquVar = (defpackage.dqu) obj;
        defpackage.dpj dpjVar = dquVar.h;
        if (dpjVar == null) {
            dquVar.m();
            dpjVar = dquVar.h;
        }
        int i = dpjVar.c;
        if (i != -1) {
            if (i <= this.d && ((defpackage.dpj[]) this.j.b)[i] != null) {
                return dpjVar;
            }
            if (i != -1) {
                dpjVar.c();
            }
        }
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        dpjVar.c = i2;
        dpjVar.n = 1;
        ((defpackage.dpj[]) this.j.b)[i2] = dpjVar;
        return dpjVar;
    }

    public final defpackage.dpj c() {
        if (this.h + 1 >= this.m) {
            s();
        }
        defpackage.dpj dpjVarV = v(3);
        int i = this.d + 1;
        this.d = i;
        this.h++;
        dpjVarV.c = i;
        ((defpackage.dpj[]) this.j.b)[i] = dpjVarV;
        return dpjVarV;
    }

    public final void d(defpackage.dpj dpjVar, defpackage.dpj dpjVar2, int i, float f, defpackage.dpj dpjVar3, defpackage.dpj dpjVar4, int i2, int i3) {
        defpackage.dpf dpfVarA = a();
        if (dpjVar2 == dpjVar3) {
            dpfVarA.e.g(dpjVar, 1.0f);
            dpfVarA.e.g(dpjVar4, 1.0f);
            dpfVarA.e.g(dpjVar2, -2.0f);
        } else if (f == 0.5f) {
            dpfVarA.e.g(dpjVar, 1.0f);
            dpfVarA.e.g(dpjVar2, -1.0f);
            dpfVarA.e.g(dpjVar3, -1.0f);
            dpfVarA.e.g(dpjVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                dpfVarA.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            dpfVarA.e.g(dpjVar, -1.0f);
            dpfVarA.e.g(dpjVar2, 1.0f);
            dpfVarA.b = i;
        } else if (f >= 1.0f) {
            dpfVarA.e.g(dpjVar4, -1.0f);
            dpfVarA.e.g(dpjVar3, 1.0f);
            dpfVarA.b = -i2;
        } else {
            float f2 = 1.0f - f;
            dpfVarA.e.g(dpjVar, f2);
            dpfVarA.e.g(dpjVar2, -f2);
            dpfVarA.e.g(dpjVar3, -f);
            dpfVarA.e.g(dpjVar4, f);
            if (i > 0 || i2 > 0) {
                dpfVarA.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            dpfVarA.f(this, i3);
        }
        e(dpfVarA);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x0109  */
    public final void e(defpackage.dpf dpfVar) {
        boolean z;
        boolean z2;
        defpackage.dpj dpjVarA;
        if (this.i + 1 >= this.o || this.h + 1 >= this.m) {
            s();
        }
        if (!dpfVar.d) {
            if (this.e.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int i = dpfVar.e.a;
                    for (int i2 = 0; i2 < i; i2++) {
                        defpackage.dpj dpjVarD = dpfVar.e.d(i2);
                        if (dpjVarD.d != -1 || dpjVarD.g) {
                            dpfVar.c.add(dpjVarD);
                        } else {
                            boolean z4 = dpjVarD.m;
                        }
                    }
                    java.util.ArrayList arrayList = dpfVar.c;
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i3 = 0; i3 < size; i3++) {
                            defpackage.dpj dpjVar = (defpackage.dpj) arrayList.get(i3);
                            if (dpjVar.g) {
                                dpfVar.c(this, dpjVar, true);
                            } else {
                                boolean z5 = dpjVar.m;
                                dpfVar.d(this, this.e[dpjVar.d], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (dpfVar.a != null && dpfVar.e.a == 0) {
                    dpfVar.d = true;
                    this.c = true;
                }
            }
            if (dpfVar.e()) {
                return;
            }
            float f = dpfVar.b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                dpfVar.b = -f;
                defpackage.dpe dpeVar = dpfVar.e;
                int i4 = dpeVar.e;
                for (int i5 = 0; i4 != -1 && i5 < dpeVar.a; i5++) {
                    float[] fArr = dpeVar.d;
                    fArr[i4] = -fArr[i4];
                    i4 = dpeVar.c[i4];
                }
            }
            int i6 = dpfVar.e.a;
            float f3 = 0.0f;
            float f4 = 0.0f;
            defpackage.dpj dpjVar2 = null;
            defpackage.dpj dpjVar3 = null;
            int i7 = 0;
            boolean z6 = false;
            boolean z7 = false;
            while (i7 < i6) {
                float fB = dpfVar.e.b(i7);
                defpackage.dpj dpjVarD2 = dpfVar.e.d(i7);
                float f5 = f2;
                if (dpjVarD2.n == 1) {
                    if (dpjVar2 == null) {
                        if (dpjVarD2.l <= 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        dpjVar2 = dpjVarD2;
                        f3 = fB;
                    } else {
                        if (f3 > fB) {
                            if (dpjVarD2.l > 1) {
                                z6 = false;
                            }
                            dpjVar2 = dpjVarD2;
                            f3 = fB;
                        } else if (z6 || dpjVarD2.l > 1) {
                        }
                        z6 = true;
                        dpjVar2 = dpjVarD2;
                        f3 = fB;
                    }
                } else if (dpjVar2 == null) {
                    if (fB >= f5) {
                        dpjVar2 = null;
                    } else {
                        if (dpjVar3 != null) {
                            if (f4 > fB) {
                                if (dpjVarD2.l > 1) {
                                    z7 = false;
                                }
                            } else if (z7 || dpjVarD2.l > 1) {
                                dpjVar2 = null;
                            }
                            z7 = true;
                        } else if (dpjVarD2.l <= 1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        dpjVar3 = dpjVarD2;
                        dpjVar2 = null;
                        f4 = fB;
                    }
                }
                i7++;
                f2 = f5;
            }
            float f6 = f2;
            if (dpjVar2 == null) {
                dpjVar2 = dpjVar3;
            }
            if (dpjVar2 == null) {
                z = true;
            } else {
                dpfVar.b(dpjVar2);
                z = false;
            }
            if (dpfVar.e.a == 0) {
                dpfVar.d = true;
            }
            if (z) {
                if (this.h + 1 >= this.m) {
                    s();
                }
                defpackage.dpj dpjVarV = v(3);
                int i8 = this.d + 1;
                this.d = i8;
                this.h++;
                dpjVarV.c = i8;
                defpackage.lam lamVar = this.j;
                ((defpackage.dpj[]) lamVar.b)[i8] = dpjVarV;
                dpfVar.a = dpjVarV;
                int i9 = this.i;
                q(dpfVar);
                if (this.i == i9 + 1) {
                    defpackage.dpf dpfVar2 = this.s;
                    dpfVar2.a = null;
                    dpfVar2.e.f();
                    int i10 = 0;
                    while (true) {
                        defpackage.dpe dpeVar2 = dpfVar.e;
                        if (i10 >= dpeVar2.a) {
                            break;
                        }
                        dpfVar2.e.e(dpeVar2.d(i10), dpfVar.e.b(i10), true);
                        i10++;
                    }
                    u(this.s);
                    if (dpjVarV.d == -1) {
                        if (dpfVar.a == dpjVarV && (dpjVarA = dpfVar.a(null, dpjVarV)) != null) {
                            dpfVar.b(dpjVarA);
                        }
                        if (!dpfVar.d) {
                            dpfVar.a.e(this, dpfVar);
                        }
                        ((defpackage.skb) lamVar.a).g(dpfVar);
                        this.i--;
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            defpackage.dpj dpjVar4 = dpfVar.a;
            if (dpjVar4 == null) {
                return;
            }
            if ((dpjVar4.n != 1 && dpfVar.b < f6) || z2) {
                return;
            }
        }
        q(dpfVar);
    }

    public final void f(defpackage.dpj dpjVar, int i) {
        int i2 = dpjVar.d;
        if (i2 == -1) {
            dpjVar.d(this, i);
            for (int i3 = 0; i3 < this.d + 1; i3++) {
                defpackage.dpj dpjVar2 = ((defpackage.dpj[]) this.j.b)[i3];
            }
            return;
        }
        if (i2 == -1) {
            float f = i;
            defpackage.dpf dpfVarA = a();
            dpfVarA.a = dpjVar;
            dpjVar.f = f;
            dpfVarA.b = f;
            dpfVarA.d = true;
            e(dpfVarA);
            return;
        }
        defpackage.dpf dpfVar = this.e[i2];
        if (dpfVar.d) {
            dpfVar.b = i;
            return;
        }
        if (dpfVar.e.a == 0) {
            dpfVar.d = true;
            dpfVar.b = i;
            return;
        }
        defpackage.dpf dpfVarA2 = a();
        if (i < 0) {
            dpfVarA2.b = -i;
            dpfVarA2.e.g(dpjVar, 1.0f);
        } else {
            dpfVarA2.b = i;
            dpfVarA2.e.g(dpjVar, -1.0f);
        }
        e(dpfVarA2);
    }

    public final void g(defpackage.dpj dpjVar, defpackage.dpj dpjVar2, int i, int i2) {
        defpackage.dpf dpfVarA = a();
        defpackage.dpj dpjVarC = c();
        dpjVarC.e = 0;
        dpfVarA.h(dpjVar, dpjVar2, dpjVarC, i);
        if (i2 != 8) {
            i(dpfVarA, (int) (-dpfVarA.e.a(dpjVarC)), i2);
        }
        e(dpfVarA);
    }

    public final void h(defpackage.dpj dpjVar, defpackage.dpj dpjVar2, int i, int i2) {
        defpackage.dpf dpfVarA = a();
        defpackage.dpj dpjVarC = c();
        dpjVarC.e = 0;
        dpfVarA.i(dpjVar, dpjVar2, dpjVarC, i);
        if (i2 != 8) {
            i(dpfVarA, (int) (-dpfVarA.e.a(dpjVarC)), i2);
        }
        e(dpfVarA);
    }

    final void i(defpackage.dpf dpfVar, int i, int i2) {
        dpfVar.e.g(p(i2), i);
    }

    public final void j() throws java.lang.Exception {
        defpackage.dpf dpfVar = this.r;
        if (dpfVar.e()) {
            r();
            return;
        }
        if (!this.g) {
            l(dpfVar);
            return;
        }
        for (int i = 0; i < this.i; i++) {
            if (!this.e[i].d) {
                l(dpfVar);
                return;
            }
        }
        r();
    }

    public final void k() {
        defpackage.lam lamVar;
        int i = 0;
        while (true) {
            lamVar = this.j;
            defpackage.dpj[] dpjVarArr = (defpackage.dpj[]) lamVar.b;
            if (i >= dpjVarArr.length) {
                break;
            }
            defpackage.dpj dpjVar = dpjVarArr[i];
            if (dpjVar != null) {
                dpjVar.c();
            }
            i++;
        }
        java.lang.Object obj = lamVar.c;
        defpackage.dpj[] dpjVarArr2 = this.p;
        int i2 = this.q;
        int length = dpjVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            defpackage.dpj dpjVar2 = dpjVarArr2[i3];
            defpackage.skb skbVar = (defpackage.skb) obj;
            int i4 = skbVar.a;
            if (i4 < 256) {
                ((java.lang.Object[]) skbVar.b)[i4] = dpjVar2;
                skbVar.a = i4 + 1;
            }
        }
        this.q = 0;
        java.util.Arrays.fill((java.lang.Object[]) lamVar.b, (java.lang.Object) null);
        this.d = 0;
        defpackage.dpi dpiVar = (defpackage.dpi) this.r;
        dpiVar.f = 0;
        dpiVar.b = 0.0f;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            defpackage.dpf dpfVar = this.e[i5];
        }
        t();
        this.i = 0;
        this.s = new defpackage.dpf(lamVar);
    }

    final void l(defpackage.dpf dpfVar) throws java.lang.Exception {
        boolean z;
        for (int i = 0; i < this.i; i++) {
            defpackage.dpf dpfVar2 = this.e[i];
            if (dpfVar2.a.n != 1) {
                float f = 0.0f;
                if (dpfVar2.b < 0.0f) {
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.i) {
                            defpackage.dpf dpfVar3 = this.e[i5];
                            if (dpfVar3.a.n != 1 && !dpfVar3.d && dpfVar3.b < f) {
                                int i7 = dpfVar3.e.a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    defpackage.dpj dpjVarD = dpfVar3.e.d(i8);
                                    float fA = dpfVar3.e.a(dpjVarD);
                                    if (fA > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = dpjVarD.h[i9] / fA;
                                            if ((f3 < f2 && i9 == i6) || i9 > i6) {
                                                i4 = dpjVarD.c;
                                                i6 = i9;
                                                f2 = f3;
                                                i3 = i5;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            f = 0.0f;
                        }
                        if (i3 != -1) {
                            defpackage.dpf dpfVar4 = this.e[i3];
                            dpfVar4.a.d = -1;
                            dpfVar4.b(((defpackage.dpj[]) this.j.b)[i4]);
                            defpackage.dpj dpjVar = dpfVar4.a;
                            dpjVar.d = i3;
                            dpjVar.e(this, dpfVar4);
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 = (!(i2 <= this.h / 2)) | z;
                        f = 0.0f;
                    }
                    break;
                }
            }
        }
        u(dpfVar);
        r();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    public final void m(defpackage.dpj dpjVar, defpackage.dpj dpjVar2, int i, int i2) {
        boolean z;
        if (i2 == 8) {
            if (dpjVar2.g && dpjVar.d == -1) {
                dpjVar.d(this, dpjVar2.f + i);
                return;
            }
            i2 = 8;
        }
        defpackage.dpf dpfVarA = a();
        if (i == 0) {
            dpfVarA.e.g(dpjVar, -1.0f);
            dpfVarA.e.g(dpjVar2, 1.0f);
        } else {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            dpfVarA.b = i;
            if (z) {
                dpfVarA.e.g(dpjVar, 1.0f);
                dpfVarA.e.g(dpjVar2, -1.0f);
            } else {
                dpfVarA.e.g(dpjVar, -1.0f);
                dpfVarA.e.g(dpjVar2, 1.0f);
            }
        }
        if (i2 != 8) {
            dpfVarA.f(this, i2);
        }
        e(dpfVarA);
    }

    public final void n(defpackage.dpj dpjVar, defpackage.dpj dpjVar2, defpackage.dpj dpjVar3, defpackage.dpj dpjVar4, float f) {
        defpackage.dpf dpfVarA = a();
        dpfVarA.g(dpjVar, dpjVar2, dpjVar3, dpjVar4, f);
        e(dpfVarA);
    }

    public final defpackage.dpj p(int i) {
        if (this.h + 1 >= this.m) {
            s();
        }
        defpackage.dpj dpjVarV = v(4);
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        dpjVarV.c = i2;
        dpjVarV.e = i;
        ((defpackage.dpj[]) this.j.b)[i2] = dpjVarV;
        defpackage.dpi dpiVar = (defpackage.dpi) this.r;
        defpackage.dph dphVar = dpiVar.g;
        dphVar.a = dpjVarV;
        java.util.Arrays.fill(dphVar.a.i, 0.0f);
        dpjVarV.i[dpjVarV.e] = 1.0f;
        dpiVar.l(dpjVarV);
        return dpjVarV;
    }
}
