package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class dpf {
    defpackage.dpj a = null;
    public float b = 0.0f;
    final java.util.ArrayList c = new java.util.ArrayList();
    boolean d = false;
    public defpackage.dpe e;

    public dpf(defpackage.lam lamVar) {
        this.e = new defpackage.dpe(this, lamVar);
    }

    public final defpackage.dpj a(boolean[] zArr, defpackage.dpj dpjVar) {
        int i;
        int i2 = this.e.a;
        defpackage.dpj dpjVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float fB = this.e.b(i3);
            if (fB < 0.0f) {
                defpackage.dpj dpjVarD = this.e.d(i3);
                if ((zArr == null || !zArr[dpjVarD.c]) && dpjVarD != dpjVar && (((i = dpjVarD.n) == 3 || i == 4) && fB < f)) {
                    f = fB;
                    dpjVar2 = dpjVarD;
                }
            }
        }
        return dpjVar2;
    }

    final void b(defpackage.dpj dpjVar) {
        defpackage.dpj dpjVar2 = this.a;
        if (dpjVar2 != null) {
            this.e.g(dpjVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(dpjVar, true);
        this.a = dpjVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        defpackage.dpe dpeVar = this.e;
        int i = dpeVar.e;
        for (int i2 = 0; i != -1 && i2 < dpeVar.a; i2++) {
            float[] fArr = dpeVar.d;
            fArr[i] = fArr[i] / f;
            i = dpeVar.c[i];
        }
    }

    public final void c(defpackage.dpg dpgVar, defpackage.dpj dpjVar, boolean z) {
        if (dpjVar == null || !dpjVar.g) {
            return;
        }
        this.b += dpjVar.f * this.e.a(dpjVar);
        this.e.c(dpjVar, z);
        if (z) {
            dpjVar.b(this);
        }
        if (this.e.a == 0) {
            this.d = true;
            dpgVar.c = true;
        }
    }

    public void d(defpackage.dpg dpgVar, defpackage.dpf dpfVar, boolean z) {
        defpackage.dpe dpeVar = this.e;
        float fA = dpeVar.a(dpfVar.a);
        dpeVar.c(dpfVar.a, z);
        defpackage.dpe dpeVar2 = dpfVar.e;
        int i = dpeVar2.a;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dpj dpjVarD = dpeVar2.d(i2);
            dpeVar.e(dpjVarD, dpeVar2.a(dpjVarD) * fA, z);
        }
        this.b += dpfVar.b * fA;
        if (z) {
            dpfVar.a.b(this);
        }
        if (this.a == null || this.e.a != 0) {
            return;
        }
        this.d = true;
        dpgVar.c = true;
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }

    public final void f(defpackage.dpg dpgVar, int i) {
        this.e.g(dpgVar.p(i), 1.0f);
        this.e.g(dpgVar.p(i), -1.0f);
    }

    public final void g(defpackage.dpj dpjVar, defpackage.dpj dpjVar2, defpackage.dpj dpjVar3, defpackage.dpj dpjVar4, float f) {
        this.e.g(dpjVar, -1.0f);
        this.e.g(dpjVar2, 1.0f);
        this.e.g(dpjVar3, f);
        this.e.g(dpjVar4, -f);
    }

    public final void h(defpackage.dpj dpjVar, defpackage.dpj dpjVar2, defpackage.dpj dpjVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(dpjVar, 1.0f);
                this.e.g(dpjVar2, -1.0f);
                this.e.g(dpjVar3, -1.0f);
                return;
            }
        }
        this.e.g(dpjVar, -1.0f);
        this.e.g(dpjVar2, 1.0f);
        this.e.g(dpjVar3, 1.0f);
    }

    public final void i(defpackage.dpj dpjVar, defpackage.dpj dpjVar2, defpackage.dpj dpjVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(dpjVar, 1.0f);
                this.e.g(dpjVar2, -1.0f);
                this.e.g(dpjVar3, 1.0f);
                return;
            }
        }
        this.e.g(dpjVar, -1.0f);
        this.e.g(dpjVar2, 1.0f);
        this.e.g(dpjVar3, -1.0f);
    }

    public final void j(defpackage.dpj dpjVar, defpackage.dpj dpjVar2, defpackage.dpj dpjVar3, defpackage.dpj dpjVar4, float f) {
        this.e.g(dpjVar3, 0.5f);
        this.e.g(dpjVar4, 0.5f);
        this.e.g(dpjVar, -0.5f);
        this.e.g(dpjVar2, -0.5f);
        this.b = -f;
    }

    public defpackage.dpj k(boolean[] zArr) {
        return a(zArr, null);
    }

    public java.lang.String toString() {
        boolean z;
        java.lang.String str;
        defpackage.dpj dpjVar = this.a;
        java.lang.String strConcat = dpjVar == null ? "0" : "".concat(dpjVar.toString());
        float f = this.b;
        java.lang.String strConcat2 = strConcat.concat(" = ");
        if (f != 0.0f) {
            strConcat2 = strConcat2 + f;
            z = true;
        } else {
            z = false;
        }
        int i = this.e.a;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dpj dpjVarD = this.e.d(i2);
            if (dpjVarD != null) {
                float fB = this.e.b(i2);
                if (fB != 0.0f) {
                    java.lang.String string = dpjVarD.toString();
                    if (z) {
                        if (fB > 0.0f) {
                            str = " + ";
                        } else {
                            fB = -fB;
                            str = " - ";
                        }
                        strConcat2 = strConcat2.concat(str);
                    } else if (fB < 0.0f) {
                        fB = -fB;
                        strConcat2 = strConcat2.concat("- ");
                    }
                    strConcat2 = fB == 1.0f ? strConcat2.concat(string) : strConcat2 + fB + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat2.concat("0.0") : strConcat2;
    }

    public dpf() {
    }
}
