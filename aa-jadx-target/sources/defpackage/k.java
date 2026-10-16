package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class k {
    public final defpackage.j d;
    public defpackage.n a = null;
    public float b = 0.0f;
    boolean c = false;
    boolean e = false;

    public k(defpackage.lam lamVar) {
        this.d = new defpackage.j(this, lamVar);
    }

    public final void a(defpackage.n nVar) {
        defpackage.n nVar2 = this.a;
        if (nVar2 != null) {
            this.d.f(nVar2, -1.0f);
            this.a = null;
        }
        defpackage.j jVar = this.d;
        float f = -jVar.c(nVar);
        this.a = nVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        int i = jVar.e;
        for (int i2 = 0; i != -1 && i2 < jVar.a; i2++) {
            float[] fArr = jVar.d;
            fArr[i] = fArr[i] / f;
            i = jVar.c[i];
        }
    }

    final void b() {
        defpackage.j jVar = this.d;
        int i = jVar.e;
        for (int i2 = 0; i != -1 && i2 < jVar.a; i2++) {
            defpackage.n nVar = ((defpackage.n[]) jVar.h.b)[jVar.b[i]];
            int i3 = 0;
            while (true) {
                int i4 = nVar.g;
                if (i3 >= i4) {
                    defpackage.k[] kVarArr = nVar.f;
                    int length = kVarArr.length;
                    if (i4 >= length) {
                        nVar.f = (defpackage.k[]) java.util.Arrays.copyOf(kVarArr, length + length);
                    }
                    defpackage.k[] kVarArr2 = nVar.f;
                    int i5 = nVar.g;
                    kVarArr2[i5] = this;
                    nVar.g = i5 + 1;
                    break;
                }
                if (nVar.f[i3] == this) {
                    break;
                } else {
                    i3++;
                }
            }
            i = jVar.c[i];
        }
    }

    public final void c(defpackage.n nVar, defpackage.n nVar2) {
        defpackage.j jVar = this.d;
        jVar.f(nVar, 1.0f);
        jVar.f(nVar2, -1.0f);
    }

    public final void d(defpackage.n nVar, defpackage.n nVar2, int i, float f, defpackage.n nVar3, defpackage.n nVar4, int i2) {
        if (nVar2 == nVar3) {
            defpackage.j jVar = this.d;
            jVar.f(nVar, 1.0f);
            jVar.f(nVar4, 1.0f);
            jVar.f(nVar2, -2.0f);
            return;
        }
        if (f == 0.5f) {
            defpackage.j jVar2 = this.d;
            jVar2.f(nVar, 1.0f);
            jVar2.f(nVar2, -1.0f);
            jVar2.f(nVar3, -1.0f);
            jVar2.f(nVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
                return;
            }
            return;
        }
        if (f <= 0.0f) {
            defpackage.j jVar3 = this.d;
            jVar3.f(nVar, -1.0f);
            jVar3.f(nVar2, 1.0f);
            this.b = i;
            return;
        }
        defpackage.j jVar4 = this.d;
        if (f >= 1.0f) {
            jVar4.f(nVar3, -1.0f);
            jVar4.f(nVar4, 1.0f);
            this.b = i2;
            return;
        }
        float f2 = 1.0f - f;
        jVar4.f(nVar, f2);
        jVar4.f(nVar2, -f2);
        jVar4.f(nVar3, -f);
        jVar4.f(nVar4, f);
        if (i > 0 || i2 > 0) {
            this.b = ((-i) * f2) + (i2 * f);
        }
    }

    public final void e(defpackage.n nVar, defpackage.n nVar2, defpackage.n nVar3, defpackage.n nVar4, float f) {
        defpackage.j jVar = this.d;
        jVar.f(nVar, -1.0f);
        jVar.f(nVar2, 1.0f);
        jVar.f(nVar3, f);
        jVar.f(nVar4, -f);
    }

    public final void f(float f, float f2, float f3, defpackage.n nVar, int i, defpackage.n nVar2, int i2, defpackage.n nVar3, int i3, defpackage.n nVar4, int i4) {
        int i5 = (-i) - i2;
        if (f2 == 0.0f || f == f3) {
            this.b = i5 + i3 + i4;
            defpackage.j jVar = this.d;
            jVar.f(nVar, 1.0f);
            jVar.f(nVar2, -1.0f);
            jVar.f(nVar4, 1.0f);
            jVar.f(nVar3, -1.0f);
            return;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.b = i5 + (i3 * f4) + (i4 * f4);
        defpackage.j jVar2 = this.d;
        jVar2.f(nVar, 1.0f);
        jVar2.f(nVar2, -1.0f);
        jVar2.f(nVar4, f4);
        jVar2.f(nVar3, -f4);
    }

    public final void g(defpackage.n nVar, int i) {
        if (i < 0) {
            this.b = -i;
            this.d.f(nVar, 1.0f);
        } else {
            this.b = i;
            this.d.f(nVar, -1.0f);
        }
    }

    public final void h(defpackage.n nVar, defpackage.n nVar2, int i) {
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
                defpackage.j jVar = this.d;
                jVar.f(nVar, 1.0f);
                jVar.f(nVar2, -1.0f);
                return;
            }
        }
        defpackage.j jVar2 = this.d;
        jVar2.f(nVar, -1.0f);
        jVar2.f(nVar2, 1.0f);
    }

    public final void i(defpackage.n nVar, defpackage.n nVar2, defpackage.n nVar3, int i) {
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
                defpackage.j jVar = this.d;
                jVar.f(nVar, 1.0f);
                jVar.f(nVar2, -1.0f);
                jVar.f(nVar3, -1.0f);
                return;
            }
        }
        defpackage.j jVar2 = this.d;
        jVar2.f(nVar, -1.0f);
        jVar2.f(nVar2, 1.0f);
        jVar2.f(nVar3, 1.0f);
    }

    public final void j(defpackage.n nVar, defpackage.n nVar2, defpackage.n nVar3, int i) {
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
                defpackage.j jVar = this.d;
                jVar.f(nVar, 1.0f);
                jVar.f(nVar2, -1.0f);
                jVar.f(nVar3, 1.0f);
                return;
            }
        }
        defpackage.j jVar2 = this.d;
        jVar2.f(nVar, -1.0f);
        jVar2.f(nVar2, 1.0f);
        jVar2.f(nVar3, -1.0f);
    }

    public final void k(defpackage.k kVar) {
        this.d.g(this, kVar);
    }

    public final java.lang.String toString() {
        java.lang.String strConcat;
        boolean z;
        java.lang.String str;
        if (this.a == null) {
            strConcat = "0";
        } else {
            defpackage.n nVar = this.a;
            java.util.Objects.toString(nVar);
            strConcat = "".concat(java.lang.String.valueOf(nVar));
        }
        float f = this.b;
        java.lang.String strConcat2 = strConcat.concat(" = ");
        if (f != 0.0f) {
            strConcat2 = strConcat2 + this.b;
            z = true;
        } else {
            z = false;
        }
        defpackage.j jVar = this.d;
        int i = jVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (jVar.d(i2) != null) {
                float fB = jVar.b(i2);
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
                strConcat2 = fB == 1.0f ? strConcat2.concat("null") : strConcat2 + fB + " null";
                z = true;
            }
        }
        return !z ? strConcat2.concat("0.0") : strConcat2;
    }
}
