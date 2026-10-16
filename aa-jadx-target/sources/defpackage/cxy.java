package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cxy {
    public final defpackage.cxl a;
    public boolean b;
    public boolean c;
    public defpackage.dlm f;
    public final defpackage.ngb i = new defpackage.ngb((char[]) null, (byte[]) null);
    public final defpackage.fbk g = new defpackage.fbk();
    public final defpackage.bzc d = new defpackage.bzc(new defpackage.cyt[16]);
    public final defpackage.bzc e = new defpackage.bzc(new defpackage.cxx[16]);
    public final defpackage.dai h = null;

    public cxy(defpackage.cxl cxlVar) {
        this.a = cxlVar;
    }

    public static final boolean k(defpackage.cxl cxlVar, defpackage.dlm dlmVar) {
        if (cxlVar.j == null) {
            return false;
        }
        boolean zAp = dlmVar != null ? cxlVar.ap(dlmVar) : cxlVar.ap(cxlVar.w.c());
        defpackage.cxl cxlVarL = cxlVar.l();
        if (zAp && cxlVarL != null) {
            if (cxlVarL.j == null) {
                cxlVarL.X(false, true, false);
                return zAp;
            }
            if (cxlVar.ax() == 1) {
                cxlVarL.V(false, true, false);
                return zAp;
            }
            if (cxlVar.ax() == 2) {
                cxlVarL.U(false);
                return true;
            }
        }
        return zAp;
    }

    public static final boolean l(defpackage.cxl cxlVar, defpackage.dlm dlmVar) {
        boolean zAq = dlmVar != null ? cxlVar.aq(dlmVar) : cxlVar.aq(cxlVar.w.b());
        defpackage.cxl cxlVarL = cxlVar.l();
        if (zAq && cxlVarL != null) {
            if (cxlVar.aw() == 1) {
                cxlVarL.X(false, true, false);
                return zAq;
            }
            if (cxlVar.aw() == 2) {
                cxlVarL.W(false);
                return true;
            }
        }
        return zAq;
    }

    public static final boolean m(defpackage.cxl cxlVar) {
        defpackage.cwe cweVar;
        if (!cxlVar.ak()) {
            return false;
        }
        if (cxlVar.ax() != 3) {
            return true;
        }
        defpackage.cxw cxwVar = cxlVar.w.p;
        return (cxwVar == null || (cweVar = cxwVar.p) == null || !cweVar.j()) ? false : true;
    }

    public static final boolean n(defpackage.cxl cxlVar) {
        defpackage.cxl cxlVarL;
        if (!cxlVar.al()) {
            return false;
        }
        do {
            if ((cxlVar.aw() == 3 && !cxlVar.w.o.w.j() && ((cxlVarL = cxlVar.l()) == null || cxlVarL.av() != 1)) || (cxlVar = cxlVar.l()) == null) {
                return false;
            }
        } while (!cxlVar.an());
        return true;
    }

    private final void o(defpackage.cxl cxlVar, boolean z) {
        defpackage.cxw cxwVar;
        defpackage.cwe cweVar;
        defpackage.bzc bzcVarK = cxlVar.k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cxl cxlVar2 = (defpackage.cxl) objArr[i2];
            if ((!z && q(cxlVar2)) || (z && (cxlVar2.ax() == 1 || ((cxwVar = cxlVar2.w.p) != null && (cweVar = cxwVar.p) != null && cweVar.j())))) {
                if (defpackage.dai.C(cxlVar2) && !z) {
                    if (cxlVar2.ak() && this.i.v(cxlVar2)) {
                        s(cxlVar2, true);
                    } else {
                        e(cxlVar2, true);
                    }
                }
                p(cxlVar2, z);
                if (!r(cxlVar2, z)) {
                    o(cxlVar2, z);
                }
            }
        }
        p(cxlVar, z);
    }

    private final void p(defpackage.cxl cxlVar, boolean z) {
        if (r(cxlVar, z)) {
            s(cxlVar, z);
        }
    }

    private static final boolean q(defpackage.cxl cxlVar) {
        return cxlVar.aw() == 1 || cxlVar.w.o.w.j();
    }

    private static final boolean r(defpackage.cxl cxlVar, boolean z) {
        return z ? cxlVar.ak() : cxlVar.al();
    }

    private final boolean s(defpackage.cxl cxlVar, boolean z) {
        defpackage.dlm dlmVar;
        boolean zL = false;
        if (cxlVar.D) {
            return false;
        }
        if (t(cxlVar)) {
            if (cxlVar == this.a) {
                dlmVar = this.f;
                dlmVar.getClass();
            } else {
                dlmVar = null;
            }
            if (z) {
                if (cxlVar.ak()) {
                    zL = k(cxlVar, dlmVar);
                }
            } else if (cxlVar.al()) {
                zL = l(cxlVar, dlmVar);
            }
            c();
        }
        return zL;
    }

    private static final boolean t(defpackage.cxl cxlVar) {
        defpackage.cxw cxwVar;
        defpackage.cwe cweVar;
        if (!cxlVar.an() && !cxlVar.ao() && !n(cxlVar) && !defpackage.afga.f(cxlVar.s(), java.lang.Boolean.TRUE) && !m(cxlVar)) {
            defpackage.cxp cxpVar = cxlVar.w;
            if (!cxpVar.o.w.j() && ((cxwVar = cxpVar.p) == null || (cweVar = cxwVar.p) == null || !cweVar.j())) {
                return false;
            }
        }
        return true;
    }

    public final void a() {
        defpackage.bzc bzcVar = this.d;
        java.lang.Object[] objArr = bzcVar.a;
        int i = bzcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.cyt) objArr[i2]).a();
        }
        bzcVar.g();
    }

    public final void b(boolean z) {
        if (z) {
            defpackage.fbk fbkVar = this.g;
            defpackage.cxl cxlVar = this.a;
            if (cxlVar.C > 0) {
                defpackage.bzc bzcVar = (defpackage.bzc) fbkVar.a;
                bzcVar.g();
                bzcVar.n(cxlVar);
                cxlVar.B = true;
            }
        }
        defpackage.fbk fbkVar2 = this.g;
        if (!fbkVar2.g()) {
            return;
        }
        java.lang.Object obj = fbkVar2.a;
        ((defpackage.bzc) obj).j(defpackage.cwq.a);
        int i = ((defpackage.bzc) obj).b;
        java.lang.Object obj2 = fbkVar2.b;
        if (obj2 == null || ((defpackage.cxl[]) obj2).length < i) {
            obj2 = new defpackage.cxl[java.lang.Math.max(16, i)];
        }
        fbkVar2.b = null;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.cxl[]) obj2)[i2] = (defpackage.cxl) ((defpackage.bzc) obj).a[i2];
        }
        ((defpackage.bzc) obj).g();
        while (true) {
            i--;
            if (i < 0) {
                fbkVar2.b = obj2;
                return;
            }
            defpackage.cxl cxlVar2 = ((defpackage.cxl[]) obj2)[i];
            cxlVar2.getClass();
            if (cxlVar2.B) {
                fbkVar2.e(cxlVar2);
            }
            ((defpackage.cxl[]) obj2)[i] = null;
        }
    }

    public final void c() {
        defpackage.bzc bzcVar = this.e;
        int i = bzcVar.b;
        if (i != 0) {
            java.lang.Object[] objArr = bzcVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                defpackage.cxx cxxVar = (defpackage.cxx) objArr[i2];
                defpackage.cxl cxlVar = cxxVar.a;
                if (cxlVar.am()) {
                    if (cxxVar.b) {
                        cxlVar.V(cxxVar.c, true, false);
                    } else {
                        cxlVar.X(cxxVar.c, true, false);
                    }
                }
            }
            bzcVar.g();
        }
    }

    public final void d(defpackage.cxl cxlVar) {
        defpackage.bzc bzcVarK = cxlVar.k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cxl cxlVar2 = (defpackage.cxl) objArr[i2];
            if (defpackage.afga.f(cxlVar2.s(), java.lang.Boolean.TRUE) && !cxlVar2.D) {
                if (this.i.v(cxlVar2)) {
                    cxlVar2.K();
                }
                d(cxlVar2);
            }
        }
    }

    public final void e(defpackage.cxl cxlVar, boolean z) {
        if (!this.b) {
            defpackage.csc.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (r(cxlVar, z)) {
            defpackage.csc.b("node not yet measured");
        }
        o(cxlVar, z);
    }

    public final void f(defpackage.cxl cxlVar) {
        defpackage.bzc bzcVarK = cxlVar.k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cxl cxlVar2 = (defpackage.cxl) objArr[i2];
            if (q(cxlVar2)) {
                if (defpackage.dai.C(cxlVar2)) {
                    g(cxlVar2, true);
                } else {
                    f(cxlVar2);
                }
            }
        }
    }

    public final void g(defpackage.cxl cxlVar, boolean z) {
        defpackage.dlm dlmVar;
        if (cxlVar.D) {
            return;
        }
        if (cxlVar == this.a) {
            dlmVar = this.f;
            dlmVar.getClass();
        } else {
            dlmVar = null;
        }
        if (z) {
            k(cxlVar, dlmVar);
        } else {
            l(cxlVar, dlmVar);
        }
    }

    public final boolean h() {
        return this.i.u();
    }

    public final boolean i(defpackage.afer aferVar) {
        boolean z;
        defpackage.cxl cxlVarA;
        boolean z2;
        boolean z3;
        boolean zS;
        defpackage.dlm dlmVar;
        defpackage.cuw cutVar;
        defpackage.cxl cxlVarL;
        defpackage.cxl cxlVar = this.a;
        if (!cxlVar.am()) {
            defpackage.csc.b("performMeasureAndLayout called with unattached root");
        }
        if (!cxlVar.an()) {
            defpackage.csc.b("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            defpackage.csc.b("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.f != null) {
            this.b = true;
            this.c = true;
            try {
                defpackage.ngb ngbVar = this.i;
                if (ngbVar.u()) {
                    z = false;
                    while (true) {
                        java.lang.Object obj = ngbVar.a;
                        if (((defpackage.cwp) obj).d()) {
                            java.lang.Object obj2 = ngbVar.b;
                            if (((defpackage.cwp) obj2).d()) {
                                java.lang.Object obj3 = ngbVar.c;
                                if (((defpackage.cwp) obj3).d()) {
                                    break;
                                }
                                cxlVarA = ((defpackage.cwp) obj3).a();
                                z2 = true;
                                z3 = false;
                            } else {
                                cxlVarA = ((defpackage.cwp) obj2).a();
                                z3 = cxlVarA.j != null;
                                z2 = true;
                            }
                        } else {
                            cxlVarA = ((defpackage.cwp) obj).a();
                            z3 = cxlVarA.j != null;
                            z2 = false;
                        }
                        if (!z2) {
                            zS = s(cxlVarA, z3);
                            if (cxlVarA.aj()) {
                                ngbVar.x(cxlVarA, 2);
                            }
                            if (cxlVarA.ai()) {
                                ngbVar.x(cxlVarA, 4);
                            }
                        } else if (!cxlVarA.D && t(cxlVarA)) {
                            if (cxlVarA == cxlVar) {
                                dlmVar = this.f;
                                dlmVar.getClass();
                            } else {
                                dlmVar = null;
                            }
                            if (z3) {
                                zS = cxlVarA.ak() ? k(cxlVarA, dlmVar) : false;
                                if ((zS || cxlVarA.aj()) && defpackage.afga.f(cxlVarA.s(), java.lang.Boolean.TRUE)) {
                                    cxlVarA.K();
                                }
                            } else {
                                zS = cxlVarA.al() ? l(cxlVarA, dlmVar) : false;
                                if (cxlVarA.ai() && (cxlVarA == cxlVar || ((cxlVarL = cxlVarA.l()) != null && cxlVarL.an() && cxlVarA.ao()))) {
                                    if (cxlVarA == cxlVar) {
                                        if (cxlVarA.E == 3) {
                                            cxlVarA.A();
                                        }
                                        defpackage.cxl cxlVarL2 = cxlVarA.l();
                                        if (cxlVarL2 == null || (cutVar = cxlVarL2.p().n) == null) {
                                            cutVar = new defpackage.cut(defpackage.cxo.a(cxlVarA));
                                        }
                                        cutVar.x(cxlVarA.o(), 0, 0);
                                    } else {
                                        cxlVarA.T();
                                    }
                                    this.g.f(cxlVarA);
                                }
                            }
                            c();
                        } else {
                            zS = false;
                        }
                        if (cxlVarA == cxlVar && zS) {
                            z = true;
                        }
                    }
                    if (aferVar != null) {
                        aferVar.invoke();
                    }
                } else {
                    z = false;
                }
                this.b = false;
                this.c = false;
                z4 = z;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    this.b = false;
                    this.c = false;
                    throw th2;
                }
            }
        }
        a();
        return z4;
    }

    public final boolean j(defpackage.cxl cxlVar, boolean z) {
        int iAv = cxlVar.av();
        int i = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                this.e.n(new defpackage.cxx(cxlVar, false, z));
            } else {
                if (i != 4) {
                    throw new defpackage.afas();
                }
                if (!cxlVar.al() || z) {
                    cxlVar.N();
                    if (!cxlVar.D && (cxlVar.an() || n(cxlVar))) {
                        defpackage.cxl cxlVarL = cxlVar.l();
                        if (cxlVarL == null || !cxlVarL.al()) {
                            this.i.x(cxlVar, 3);
                        }
                        if (!this.c) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
