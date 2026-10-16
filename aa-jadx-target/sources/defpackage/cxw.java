package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cxw extends defpackage.cux implements defpackage.ctx, defpackage.cwf, defpackage.cyd {
    private boolean A;
    public final defpackage.cxp f;
    public boolean g;
    public boolean j;
    public boolean k;
    public defpackage.dlm l;
    public defpackage.affc n;
    public defpackage.cmq o;
    public boolean s;
    public boolean x;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int y = 3;
    public long m = 0;
    public int z = 3;
    public final defpackage.cwe p = new defpackage.cxq(this);
    public final defpackage.bzc q = new defpackage.bzc(new defpackage.cxw[16]);
    public boolean r = true;
    private final defpackage.afer B = new defpackage.cwg(this, 3);
    public boolean t = true;
    public java.lang.Object u = q().r;
    public long v = defpackage.dln.d(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    public final defpackage.afer w = new defpackage.cwg(this, 4);
    private final defpackage.afer C = new defpackage.cwg(this, 5);

    public cxw(defpackage.cxp cxpVar) {
        this.f = cxpVar;
    }

    private final void J() {
        int i = this.z;
        if (L()) {
            this.z = 2;
        } else {
            this.z = 1;
        }
        if (i != 1 && this.f.d) {
            p().V(true, true, true);
        }
        defpackage.bzc bzcVarK = p().k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i2 = bzcVarK.b;
        for (int i3 = 0; i3 < i2; i3++) {
            defpackage.cxl cxlVar = (defpackage.cxl) objArr[i3];
            defpackage.cxw cxwVarN = cxlVar.n();
            if (cxwVarN == null) {
                throw new java.lang.IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (cxwVarN.i != Integer.MAX_VALUE) {
                cxwVarN.J();
                cxlVar.Y(cxlVar);
            }
        }
    }

    private final void K() {
        int i = 1;
        p().V(false, true, true);
        defpackage.cxl cxlVarL = p().l();
        if (cxlVarL == null || p().E != 3) {
            return;
        }
        defpackage.cxl cxlVarP = p();
        int iAv = cxlVarL.av();
        int i2 = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i2 != 0) {
            i = 2;
            if (i2 != 2) {
                i = cxlVarL.E;
            }
        }
        cxlVarP.E = i;
    }

    private final boolean L() {
        return this.f.c;
    }

    private final boolean M() {
        return this.f.e;
    }

    public final void B(boolean z) {
        this.f.e = z;
    }

    public final void C(boolean z) {
        this.f.f = z;
    }

    public final boolean D() {
        return defpackage.dai.C(p()) || L();
    }

    public final boolean E() {
        return this.z != 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [affc, java.lang.Object] */
    public final boolean F(long j) throws java.lang.Throwable {
        defpackage.dlm dlmVar;
        defpackage.cxl cxlVarP = p();
        try {
            if (p().D) {
                defpackage.csc.b("measure is called on a deactivated node");
            }
            defpackage.cxl cxlVarL = p().l();
            p().u = p().u || (cxlVarL != null && cxlVarL.u);
            if (!p().ak() && (dlmVar = this.l) != null && dlmVar.a == j) {
                defpackage.cyu cyuVar = p().k;
                if (cyuVar != null) {
                    cyuVar.u(p(), true);
                }
                p().Z();
                return false;
            }
            this.l = new defpackage.dlm(j);
            A(j);
            this.p.f = false;
            l(new defpackage.cmr(7));
            long j2 = this.A ? this.c : -9223372034707292160L;
            this.A = true;
            defpackage.cxv cxvVarC = r().C();
            if (cxvVarC == null) {
                defpackage.csc.c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            defpackage.cxw cxwVar = this.f.p;
            if (cxwVar != null) {
                cxwVar.I(2);
                cxwVar.f.d = false;
                cxwVar.v = j;
                defpackage.cyx cyxVar = ((defpackage.czz) defpackage.cxo.a(cxwVar.p())).w;
                ((defpackage.cez) cyxVar.a).b(cxwVar.p(), cyxVar.b, cxwVar.w);
                cxwVar.B(true);
                cxwVar.C(true);
                if (defpackage.dai.C(cxwVar.p())) {
                    cxwVar.q().s();
                } else {
                    cxwVar.q().t();
                }
                cxwVar.I(5);
            }
            z((((long) cxvVarC.b) & 4294967295L) | (((long) cxvVarC.a) << 32));
            if (((int) (j2 >> 32)) == cxvVarC.a) {
                if (((int) (j2 & 4294967295L)) == cxvVarC.b) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Throwable th) {
            cxlVarP.as(th);
            throw new defpackage.afap();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [affc, java.lang.Object] */
    public final void G(long j, defpackage.affc affcVar, defpackage.cmq cmqVar) throws java.lang.Throwable {
        defpackage.cxl cxlVarP = p();
        try {
            defpackage.cxl cxlVarL = p().l();
            if (cxlVarL != null && cxlVarL.av() == 4) {
                this.f.c = false;
            }
            if (p().D) {
                defpackage.csc.b("place is called on a deactivated node");
            }
            I(4);
            this.k = true;
            this.x = false;
            if (j != this.m) {
                defpackage.cxp cxpVar = this.f;
                if (cxpVar.m || cxpVar.l) {
                    B(true);
                }
                t();
            }
            defpackage.cyu cyuVarA = defpackage.cxo.a(p());
            this.m = j;
            if (M() || !E()) {
                this.f.k(false);
                this.p.g = false;
                defpackage.cyx cyxVar = ((defpackage.czz) cyuVarA).w;
                defpackage.cxl cxlVarP2 = p();
                defpackage.afer aferVar = this.C;
                ((defpackage.cez) cyxVar.a).b(cxlVarP2, cyxVar.g, aferVar);
            } else {
                defpackage.cxv cxvVarC = r().C();
                cxvVarC.getClass();
                cxvVarC.B(defpackage.dlw.d(j, cxvVarC.e));
                u();
            }
            this.n = affcVar;
            this.o = cmqVar;
            I(5);
        } catch (java.lang.Throwable th) {
            cxlVarP.as(th);
            throw new defpackage.afap();
        }
    }

    public final int H() {
        return this.f.q;
    }

    public final void I(int i) {
        this.f.q = i;
    }

    @Override // defpackage.cyd
    public final void U(boolean z) {
        defpackage.cxv cxvVarC;
        defpackage.cxv cxvVarC2 = r().C();
        if (defpackage.afga.f(java.lang.Boolean.valueOf(z), cxvVarC2 != null ? java.lang.Boolean.valueOf(cxvVarC2.k) : null) || (cxvVarC = r().C()) == null) {
            return;
        }
        cxvVarC.k = z;
    }

    @Override // defpackage.csy
    public final int c(int i) {
        K();
        defpackage.cxv cxvVarC = r().C();
        cxvVarC.getClass();
        return cxvVarC.c(i);
    }

    @Override // defpackage.csy
    public final int d(int i) {
        K();
        defpackage.cxv cxvVarC = r().C();
        cxvVarC.getClass();
        return cxvVarC.d(i);
    }

    @Override // defpackage.cux
    public final void dD(long j, float f, defpackage.affc affcVar) throws java.lang.Throwable {
        G(j, affcVar, null);
    }

    @Override // defpackage.cuc
    public final int dJ(defpackage.csf csfVar) {
        defpackage.cxl cxlVarL = p().l();
        if (cxlVarL == null || cxlVarL.av() != 2) {
            defpackage.cxl cxlVarL2 = p().l();
            if (cxlVarL2 != null && cxlVarL2.av() == 4) {
                this.p.d = true;
            }
        } else {
            this.p.c = true;
        }
        this.j = true;
        defpackage.cxv cxvVarC = r().C();
        cxvVarC.getClass();
        int iDJ = cxvVarC.dJ(csfVar);
        this.j = false;
        return iDJ;
    }

    @Override // defpackage.cux, defpackage.cuc
    public final int dK() {
        defpackage.cxv cxvVarC = r().C();
        cxvVarC.getClass();
        return cxvVarC.dK();
    }

    @Override // defpackage.csy
    public final int e(int i) {
        K();
        defpackage.cxv cxvVarC = r().C();
        cxvVarC.getClass();
        return cxvVarC.e(i);
    }

    @Override // defpackage.csy
    public final int f(int i) {
        K();
        defpackage.cxv cxvVarC = r().C();
        cxvVarC.getClass();
        return cxvVarC.f(i);
    }

    @Override // defpackage.cux, defpackage.csy
    public final java.lang.Object g() {
        return this.u;
    }

    @Override // defpackage.cwf
    public final int h() {
        return this.i;
    }

    @Override // defpackage.cwf
    public final defpackage.cwe i() {
        return this.p;
    }

    @Override // defpackage.cwf
    public final defpackage.cwf j() {
        defpackage.cxp cxpVar;
        defpackage.cxl cxlVarL = p().l();
        if (cxlVarL == null || (cxpVar = cxlVarL.w) == null) {
            return null;
        }
        return cxpVar.p;
    }

    @Override // defpackage.cwf
    public final defpackage.cyl k() {
        return p().p();
    }

    @Override // defpackage.cwf
    public final void l(defpackage.affc affcVar) {
        defpackage.bzc bzcVarK = p().k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cxw cxwVar = ((defpackage.cxl) objArr[i2]).w.p;
            cxwVar.getClass();
            affcVar.invoke(cxwVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [affc, java.lang.Object] */
    @Override // defpackage.cwf
    public final void m() {
        this.s = true;
        defpackage.cwe cweVar = this.p;
        cweVar.g();
        if (M()) {
            defpackage.bzc bzcVarK = p().k();
            java.lang.Object[] objArr = bzcVarK.a;
            int i = bzcVarK.b;
            for (int i2 = 0; i2 < i; i2++) {
                defpackage.cxl cxlVar = (defpackage.cxl) objArr[i2];
                if (cxlVar.ak() && cxlVar.ax() == 1) {
                    defpackage.cxp cxpVar = cxlVar.w;
                    defpackage.cxw cxwVar = cxpVar.p;
                    cxwVar.getClass();
                    defpackage.dlm dlmVarC = cxpVar.c();
                    dlmVarC.getClass();
                    if (cxwVar.F(dlmVarC.a)) {
                        p().V(false, true, true);
                    }
                }
            }
        }
        defpackage.cxv cxvVar = ((defpackage.cxa) k()).g;
        cxvVar.getClass();
        defpackage.cxp cxpVar2 = this.f;
        if (cxpVar2.f || (!this.j && !cxvVar.m && M())) {
            B(false);
            int iH = H();
            I(4);
            cxpVar2.l(false);
            defpackage.cyx cyxVar = ((defpackage.czz) defpackage.cxo.a(p())).w;
            ((defpackage.cez) cyxVar.a).b(p(), cyxVar.h, this.B);
            I(iH);
            if (cxpVar2.l && cxvVar.m) {
                n();
            }
            C(false);
        }
        if (cweVar.d) {
            cweVar.e = true;
        }
        if (cweVar.b && cweVar.j()) {
            cweVar.f();
        }
        this.s = false;
    }

    @Override // defpackage.cwf
    public final void n() {
        p().U(false);
    }

    @Override // defpackage.cwf
    public final void o() {
        p().V(false, true, true);
    }

    public final defpackage.cxl p() {
        return this.f.a;
    }

    public final defpackage.cxz q() {
        return this.f.o;
    }

    public final defpackage.cyl r() {
        return this.f.a();
    }

    public final void s(boolean z) {
        if (z) {
            if (D()) {
                return;
            }
        } else if (!D()) {
            return;
        }
        this.z = 3;
        defpackage.bzc bzcVarK = p().k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cxw cxwVar = ((defpackage.cxl) objArr[i2]).w.p;
            cxwVar.getClass();
            cxwVar.s(true);
        }
    }

    public final void t() {
        if (this.f.n > 0) {
            defpackage.bzc bzcVarK = p().k();
            java.lang.Object[] objArr = bzcVarK.a;
            int i = bzcVarK.b;
            for (int i2 = 0; i2 < i; i2++) {
                defpackage.cxl cxlVar = (defpackage.cxl) objArr[i2];
                defpackage.cxp cxpVar = cxlVar.w;
                if ((cxpVar.l || cxpVar.m) && !cxpVar.e) {
                    cxlVar.U(false);
                }
                defpackage.cxw cxwVar = cxpVar.p;
                if (cxwVar != null) {
                    cxwVar.t();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public final void u() {
        this.x = true;
        defpackage.cxl cxlVarL = p().l();
        int i = this.z;
        if (i == 1) {
            if (L()) {
                J();
                if (this.g && cxlVarL != null) {
                    cxlVarL.U(false);
                }
            }
        } else if (!L()) {
            J();
            if (this.g) {
                cxlVarL.U(false);
            }
        } else if (i != 2) {
            if (L()) {
                J();
                if (this.g) {
                    cxlVarL.U(false);
                }
            }
        }
        if (cxlVarL == null) {
            this.i = 0;
        } else if (!this.g && (cxlVarL.av() == 3 || cxlVarL.av() == 4)) {
            if (this.i != Integer.MAX_VALUE) {
                defpackage.csc.c("Place was called on a node which was placed already");
            }
            defpackage.cxp cxpVar = cxlVarL.w;
            int i2 = cxpVar.g;
            this.i = i2;
            cxpVar.g = i2 + 1;
        }
        m();
    }

    @Override // defpackage.ctx
    public final defpackage.cux v(long j) {
        defpackage.cxl cxlVarL;
        defpackage.cxl cxlVarL2 = p().l();
        int i = 2;
        if ((cxlVarL2 != null && cxlVarL2.av() == 2) || ((cxlVarL = p().l()) != null && cxlVarL.av() == 4)) {
            this.f.b = false;
        }
        defpackage.cxl cxlVarP = p();
        defpackage.cxl cxlVarL3 = cxlVarP.l();
        if (cxlVarL3 != null) {
            if (this.y != 3 && !cxlVarP.u) {
                defpackage.csc.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iAv = cxlVarL3.av();
            int i2 = iAv - 1;
            if (iAv == 0) {
                throw null;
            }
            if (i2 == 0 || i2 == 1) {
                i = 1;
            } else if (i2 != 2 && i2 != 3) {
                int iAv2 = cxlVarL3.av();
                defpackage.dai.D(iAv2);
                throw new java.lang.IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(defpackage.dai.D(iAv2)));
            }
            this.y = i;
        } else {
            this.y = 3;
        }
        if (p().E == 3) {
            p().z();
        }
        F(j);
        return this;
    }

    @Override // defpackage.cux
    public final int x() {
        defpackage.cxv cxvVarC = r().C();
        cxvVarC.getClass();
        return cxvVarC.x();
    }

    @Override // defpackage.cux
    public final void y(long j, float f, defpackage.cmq cmqVar) throws java.lang.Throwable {
        G(j, null, cmqVar);
    }
}
