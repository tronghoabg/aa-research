package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cxp {
    public final defpackage.cxl a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public defpackage.cxw p;
    public int q = 5;
    public final defpackage.cxz o = new defpackage.cxz(this);

    public cxp(defpackage.cxl cxlVar) {
        this.a = cxlVar;
    }

    public final defpackage.cyl a() {
        return this.a.v.d;
    }

    public final defpackage.dlm b() {
        defpackage.cxz cxzVar = this.o;
        if (cxzVar.j) {
            return new defpackage.dlm(cxzVar.d);
        }
        return null;
    }

    public final defpackage.dlm c() {
        defpackage.cxw cxwVar = this.p;
        if (cxwVar != null) {
            return cxwVar.l;
        }
        return null;
    }

    public final void d() {
        this.o.x = true;
        defpackage.cxw cxwVar = this.p;
        if (cxwVar != null) {
            cxwVar.r = true;
        }
    }

    public final void e() {
        this.e = true;
        this.f = true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public final void f() {
        int iAv = this.a.av();
        if (iAv == 3) {
            if (this.o.y) {
                j(true);
            } else {
                i(true);
            }
        } else if (iAv == 4) {
            iAv = 4;
            if (this.o.y) {
                j(true);
            } else {
                i(true);
            }
        }
        if (iAv == 4) {
            defpackage.cxw cxwVar = this.p;
            if (cxwVar == null || !cxwVar.s) {
                k(true);
            } else {
                l(true);
            }
        }
    }

    public final void g(int i) {
        int i2 = this.k;
        this.k = i;
        if ((i2 == 0) != (i == 0)) {
            defpackage.cxl cxlVarL = this.a.l();
            defpackage.cxp cxpVar = cxlVarL != null ? cxlVarL.w : null;
            if (cxpVar != null) {
                if (i == 0) {
                    cxpVar.g(cxpVar.k - 1);
                } else {
                    cxpVar.g(cxpVar.k + 1);
                }
            }
        }
    }

    public final void h(int i) {
        int i2 = this.n;
        this.n = i;
        if ((i2 == 0) != (i == 0)) {
            defpackage.cxl cxlVarL = this.a.l();
            defpackage.cxp cxpVar = cxlVarL != null ? cxlVarL.w : null;
            if (cxpVar != null) {
                if (i == 0) {
                    cxpVar.h(cxpVar.n - 1);
                } else {
                    cxpVar.h(cxpVar.n + 1);
                }
            }
        }
    }

    public final void i(boolean z) {
        if (this.j != z) {
            this.j = z;
            boolean z2 = this.i;
            if (z) {
                if (z2) {
                    return;
                }
                g(this.k + 1);
            } else {
                if (z2) {
                    return;
                }
                g(this.k - 1);
            }
        }
    }

    public final void j(boolean z) {
        if (this.i != z) {
            this.i = z;
            boolean z2 = this.j;
            if (z) {
                if (z2) {
                    return;
                }
                g(this.k + 1);
            } else {
                if (z2) {
                    return;
                }
                g(this.k - 1);
            }
        }
    }

    public final void k(boolean z) {
        if (this.m != z) {
            this.m = z;
            boolean z2 = this.l;
            if (z) {
                if (z2) {
                    return;
                }
                h(this.n + 1);
            } else {
                if (z2) {
                    return;
                }
                h(this.n - 1);
            }
        }
    }

    public final void l(boolean z) {
        if (this.l != z) {
            this.l = z;
            boolean z2 = this.m;
            if (z) {
                if (z2) {
                    return;
                }
                h(this.n + 1);
            } else {
                if (z2) {
                    return;
                }
                h(this.n - 1);
            }
        }
    }

    public final void m() {
        defpackage.cxz cxzVar = this.o;
        if ((cxzVar.r != null || cxzVar.q().g() != null) && cxzVar.q) {
            cxzVar.q = false;
            cxzVar.r = cxzVar.q().g();
            defpackage.cxl cxlVarL = this.a.l();
            if (cxlVarL != null) {
                cxlVarL.X(false, true, true);
            }
        }
        defpackage.cxw cxwVar = this.p;
        if (cxwVar != null) {
            if (cxwVar.u == null) {
                defpackage.cxv cxvVarC = cxwVar.r().C();
                cxvVarC.getClass();
                if (cxvVarC.g() == null) {
                    return;
                }
            }
            if (cxwVar.t) {
                cxwVar.t = false;
                defpackage.cxv cxvVarC2 = cxwVar.r().C();
                cxvVarC2.getClass();
                cxwVar.u = cxvVarC2.g();
                defpackage.cxl cxlVar = this.a;
                if (defpackage.dai.C(cxlVar)) {
                    defpackage.cxl cxlVarL2 = cxlVar.l();
                    if (cxlVarL2 != null) {
                        cxlVarL2.X(false, true, true);
                        return;
                    }
                    return;
                }
                defpackage.cxl cxlVarL3 = cxlVar.l();
                if (cxlVarL3 != null) {
                    cxlVarL3.V(false, true, true);
                }
            }
        }
    }

    public final boolean n() {
        return this.o.v;
    }
}
