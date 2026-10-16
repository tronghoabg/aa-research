package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dqz extends defpackage.dqv {
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public defpackage.dqu d = this.U;
    public int e = 0;
    private boolean f;

    public dqz() {
        this.ac.clear();
        this.ac.add(this.d);
        int length = this.ab.length;
        for (int i = 0; i < 6; i++) {
            this.ab[i] = this.d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0014  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dqv
    public final defpackage.dqu U(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                } else if (this.e != 1) {
                    return null;
                }
            }
            if (this.e != 0) {
                return null;
            }
        } else if (this.e != 1) {
            return null;
        }
        return this.d;
    }

    @Override // defpackage.dqv
    public final void a(defpackage.dpg dpgVar, boolean z) {
        defpackage.dqw dqwVar = (defpackage.dqw) this.ae;
        if (dqwVar == null) {
            return;
        }
        java.lang.Object objU = dqwVar.U(2);
        java.lang.Object objU2 = dqwVar.U(4);
        defpackage.dqv dqvVar = this.ae;
        boolean z2 = dqvVar != null && dqvVar.aA[0] == 2;
        if (this.e == 0) {
            objU = dqwVar.U(3);
            objU2 = dqwVar.U(5);
            z2 = dqvVar != null && dqvVar.aA[1] == 2;
        }
        if (this.f) {
            defpackage.dqu dquVar = this.d;
            if (dquVar.c) {
                defpackage.dpj dpjVarB = dpgVar.b(dquVar);
                dpgVar.f(dpjVarB, this.d.a());
                if (this.b != -1) {
                    if (z2) {
                        dpgVar.g(dpgVar.b(objU2), dpjVarB, 0, 5);
                    }
                } else if (this.c != -1 && z2) {
                    defpackage.dpj dpjVarB2 = dpgVar.b(objU2);
                    dpgVar.g(dpjVarB, dpgVar.b(objU), 0, 5);
                    dpgVar.g(dpjVarB2, dpjVarB, 0, 5);
                }
                this.f = false;
                return;
            }
        }
        if (this.b != -1) {
            defpackage.dpj dpjVarB3 = dpgVar.b(this.d);
            dpgVar.m(dpjVarB3, dpgVar.b(objU), this.b, 8);
            if (z2) {
                dpgVar.g(dpgVar.b(objU2), dpjVarB3, 0, 5);
                return;
            }
            return;
        }
        if (this.c != -1) {
            defpackage.dpj dpjVarB4 = dpgVar.b(this.d);
            defpackage.dpj dpjVarB5 = dpgVar.b(objU2);
            dpgVar.m(dpjVarB4, dpjVarB5, -this.c, 8);
            if (z2) {
                dpgVar.g(dpjVarB4, dpgVar.b(objU), 0, 5);
                dpgVar.g(dpjVarB5, dpjVarB4, 0, 5);
                return;
            }
            return;
        }
        if (this.a != -1.0f) {
            defpackage.dpj dpjVarB6 = dpgVar.b(this.d);
            defpackage.dpj dpjVarB7 = dpgVar.b(objU2);
            float f = this.a;
            defpackage.dpf dpfVarA = dpgVar.a();
            dpfVarA.e.g(dpjVarB6, -1.0f);
            dpfVarA.e.g(dpjVarB7, f);
            dpgVar.e(dpfVarA);
        }
    }

    @Override // defpackage.dqv
    public final void ac(boolean z) {
        if (this.ae == null) {
            return;
        }
        int iO = defpackage.dpg.o(this.d);
        if (this.e == 1) {
            this.aj = iO;
            this.ak = 0;
            B(this.ae.h());
            M(0);
            return;
        }
        this.aj = 0;
        this.ak = iO;
        M(this.ae.j());
        B(0);
    }

    public final void ae(int i) {
        if (i >= 0) {
            this.a = -1.0f;
            this.b = -1;
            this.c = i;
        }
    }

    public final void af(float f) {
        if (f > -1.0f) {
            this.a = f;
            this.b = -1;
            this.c = -1;
        }
    }

    public final void ag(int i) {
        defpackage.dqu dquVar;
        if (this.e == i) {
            return;
        }
        this.e = i;
        java.util.ArrayList arrayList = this.ac;
        arrayList.clear();
        if (this.e == 1) {
            dquVar = this.T;
            this.d = dquVar;
        } else {
            dquVar = this.U;
            this.d = dquVar;
        }
        arrayList.add(dquVar);
        defpackage.dqu[] dquVarArr = this.ab;
        int length = dquVarArr.length;
        for (int i2 = 0; i2 < 6; i2++) {
            dquVarArr[i2] = this.d;
        }
    }

    @Override // defpackage.dqv
    public final boolean ay() {
        return true;
    }

    public final void b(int i) {
        this.d.f(i);
        this.f = true;
    }

    public final void c(int i) {
        if (i >= 0) {
            this.a = -1.0f;
            this.b = i;
            this.c = -1;
        }
    }

    @Override // defpackage.dqv
    public final boolean e() {
        return this.f;
    }

    @Override // defpackage.dqv
    public final boolean f() {
        return this.f;
    }
}
