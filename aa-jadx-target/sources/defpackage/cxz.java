package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cxz extends defpackage.cux implements defpackage.ctx, defpackage.cwf, defpackage.cyd {
    public float A;
    public boolean B;
    public defpackage.affc C;
    public defpackage.cmq D;
    public float F;
    private boolean H;
    private boolean M;
    public final defpackage.cxp f;
    public boolean g;
    public boolean j;
    public boolean k;
    public boolean l;
    public defpackage.affc n;
    public defpackage.cmq o;
    public float p;
    public java.lang.Object r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean y;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int G = 3;
    public long m = 0;
    public boolean q = true;
    public final defpackage.cwe w = new defpackage.cxm(this);
    private final defpackage.bzc I = new defpackage.bzc(new defpackage.cxz[16]);
    public boolean x = true;
    public long z = defpackage.dln.d(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    private final defpackage.afer J = new defpackage.cew(this, 5);
    private final defpackage.afer K = new defpackage.cew(this, 6);
    public long E = 0;
    private final defpackage.afer L = new defpackage.cew(this, 7);

    public cxz(defpackage.cxp cxpVar) {
        this.f = cxpVar;
    }

    private final defpackage.cxw H() {
        return this.f.p;
    }

    private final void I() {
        boolean z = this.s;
        this.s = true;
        defpackage.cxl cxlVarP = p();
        if (!z) {
            cxlVarP.p().ao();
            ((defpackage.czz) defpackage.cxo.a(cxlVarP)).p.e(p());
            if (cxlVarP.al()) {
                cxlVarP.X(true, true, true);
            } else if (cxlVarP.ak()) {
                cxlVarP.V(true, true, true);
            }
        }
        defpackage.cyl cylVar = cxlVarP.p().w;
        for (defpackage.cyl cylVarQ = cxlVarP.q(); !defpackage.afga.f(cylVarQ, cylVar) && cylVarQ != null; cylVarQ = cylVarQ.w) {
            if (cylVarQ.H) {
                cylVarQ.ak();
            }
        }
        defpackage.bzc bzcVarK = cxlVarP.k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cxl cxlVar = (defpackage.cxl) objArr[i2];
            if (cxlVar.f() != Integer.MAX_VALUE) {
                cxlVar.o().I();
                cxlVarP.Y(cxlVar);
            }
        }
    }

    private final void J() {
        int i = 1;
        p().X(false, true, true);
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

    private final void K(long j, float f, defpackage.affc affcVar, defpackage.cmq cmqVar) throws java.lang.Throwable {
        defpackage.cuw cutVar;
        defpackage.cxl cxlVarP = p();
        try {
            this.t = true;
            if (j != this.m || affcVar != this.n || this.M) {
                defpackage.cxp cxpVar = this.f;
                if (cxpVar.j || cxpVar.i || this.M) {
                    this.v = true;
                    this.M = false;
                }
            }
            defpackage.cxw cxwVarH = H();
            if (cxwVarH != null && cxwVarH.z == 3 && !defpackage.dai.C(cxwVarH.p())) {
                cxwVarH.f.c = true;
            }
            defpackage.cxw cxwVarH2 = H();
            if (cxwVarH2 != null && cxwVarH2.D()) {
                defpackage.cyl cylVar = q().x;
                if (cylVar == null || (cutVar = cylVar.n) == null) {
                    cutVar = new defpackage.cut(defpackage.cxo.a(p()));
                }
                defpackage.cxw cxwVarH3 = H();
                cxwVarH3.getClass();
                defpackage.cxl cxlVarL = p().l();
                if (cxlVarL != null) {
                    cxlVarL.w.g = 0;
                }
                cxwVarH3.i = Integer.MAX_VALUE;
                cutVar.r(cxwVarH3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            defpackage.cxw cxwVarH4 = H();
            if (cxwVarH4 != null && !cxwVarH4.k) {
                defpackage.csc.c("Error: Placement happened before lookahead.");
            }
            C(j, f, affcVar, cmqVar);
        } catch (java.lang.Throwable th) {
            cxlVarP.as(th);
            throw new defpackage.afap();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    public final void B() {
        this.B = true;
        defpackage.cxl cxlVarL = p().l();
        float f = k().z;
        defpackage.cxl cxlVarP = p();
        defpackage.cyl cylVarQ = cxlVarP.q();
        defpackage.cyl cylVarP = cxlVarP.p();
        while (cylVarQ != cylVarP) {
            cylVarQ.getClass();
            defpackage.cxh cxhVar = (defpackage.cxh) cylVarQ;
            f += cxhVar.z;
            cylVarQ = cxhVar.w;
        }
        if (f != this.A) {
            this.A = f;
            if (cxlVarL != null) {
                cxlVarL.Q();
            }
            if (cxlVarL != null) {
                cxlVarL.G();
            }
        }
        if (!k().m) {
            boolean z = this.s;
            if (!z || this.w.i()) {
                I();
                if (z) {
                    p().p().ao();
                } else {
                    if (cxlVarL != null) {
                        cxlVarL.G();
                    }
                    if (this.g && cxlVarL != null) {
                        cxlVarL.W(false);
                    }
                }
            } else {
                p().p().ao();
            }
        }
        if (cxlVarL == null) {
            this.i = 0;
        } else if (!this.g && cxlVarL.av() == 3) {
            if (this.i != Integer.MAX_VALUE) {
                defpackage.csc.c("Place was called on a node which was placed already");
            }
            defpackage.cxp cxpVar = cxlVarL.w;
            int i = cxpVar.h;
            this.i = i;
            cxpVar.h = i + 1;
        }
        m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [affc, java.lang.Object] */
    public final void C(long j, float f, defpackage.affc affcVar, defpackage.cmq cmqVar) {
        if (p().D) {
            defpackage.csc.b("place is called on a deactivated node");
        }
        G(3);
        this.m = j;
        this.p = f;
        this.n = affcVar;
        this.o = cmqVar;
        this.B = false;
        defpackage.cyu cyuVarA = defpackage.cxo.a(p());
        if (this.v || !this.s) {
            this.w.g = false;
            this.f.i(false);
            this.C = affcVar;
            this.E = j;
            this.F = f;
            this.D = cmqVar;
            defpackage.cyx cyxVar = ((defpackage.czz) cyuVarA).w;
            defpackage.cxl cxlVarP = p();
            defpackage.afer aferVar = this.L;
            ((defpackage.cez) cyxVar.a).b(cxlVarP, cyxVar.f, aferVar);
        } else {
            defpackage.cyl cylVarQ = q();
            cylVarQ.as(defpackage.dlw.d(j, cylVarQ.e), f, affcVar, cmqVar);
            B();
        }
        G(5);
        if (q().m) {
            defpackage.cxp cxpVar = this.f;
            if (cxpVar.j || cxpVar.i) {
                n();
            }
        }
        this.k = true;
    }

    public final void D() {
        if (!p().an() || this.f.k <= 0) {
            return;
        }
        defpackage.cxp cxpVar = p().w;
        if ((cxpVar.i || cxpVar.j) && !cxpVar.n()) {
            p().W(false);
        }
        defpackage.bzc bzcVarK = p().k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.cxl) objArr[i2]).o().D();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [affc, java.lang.Object] */
    public final boolean E(long j) throws java.lang.Throwable {
        defpackage.cxl cxlVarP = p();
        try {
            if (p().D) {
                defpackage.csc.b("measure is called on a deactivated node");
            }
            defpackage.cyu cyuVarA = defpackage.cxo.a(p());
            defpackage.cxl cxlVarL = p().l();
            p().u = p().u || (cxlVarL != null && cxlVarL.u);
            if (!p().al() && this.d == j) {
                cyuVarA.u(p(), false);
                p().Z();
                return false;
            }
            this.w.f = false;
            l(new defpackage.bwy(14));
            this.j = true;
            long j2 = q().c;
            A(j);
            if (F() != 5) {
                defpackage.csc.c("layout state is not idle before measure starts");
            }
            this.z = j;
            G(1);
            this.u = false;
            defpackage.cyx cyxVar = ((defpackage.czz) defpackage.cxo.a(p())).w;
            ((defpackage.cez) cyxVar.a).b(p(), cyxVar.c, this.J);
            if (F() == 1) {
                s();
                G(5);
            }
            boolean z = (q().c == j2 && q().a == this.a && q().b == this.b) ? false : true;
            z((((long) q().b) & 4294967295L) | (((long) q().a) << 32));
            return z;
        } catch (java.lang.Throwable th) {
            cxlVarP.as(th);
            throw new defpackage.afap();
        }
    }

    public final int F() {
        return this.f.q;
    }

    public final void G(int i) {
        this.f.q = i;
    }

    @Override // defpackage.cyd
    public final void U(boolean z) {
        if (z != q().k) {
            q().k = z;
            this.M = true;
        }
    }

    @Override // defpackage.csy
    public final int c(int i) {
        if (!defpackage.dai.C(p())) {
            J();
            return q().c(i);
        }
        defpackage.cxw cxwVarH = H();
        cxwVarH.getClass();
        return cxwVarH.c(i);
    }

    @Override // defpackage.csy
    public final int d(int i) {
        if (!defpackage.dai.C(p())) {
            J();
            return q().d(i);
        }
        defpackage.cxw cxwVarH = H();
        cxwVarH.getClass();
        return cxwVarH.d(i);
    }

    @Override // defpackage.cux
    public final void dD(long j, float f, defpackage.affc affcVar) throws java.lang.Throwable {
        K(j, f, affcVar, null);
    }

    @Override // defpackage.cuc
    public final int dJ(defpackage.csf csfVar) {
        defpackage.cxl cxlVarL = p().l();
        if (cxlVarL == null || cxlVarL.av() != 1) {
            defpackage.cxl cxlVarL2 = p().l();
            if (cxlVarL2 != null && cxlVarL2.av() == 3) {
                this.w.d = true;
            }
        } else {
            this.w.c = true;
        }
        this.l = true;
        int iDJ = q().dJ(csfVar);
        this.l = false;
        return iDJ;
    }

    @Override // defpackage.cux, defpackage.cuc
    public final int dK() {
        return q().dK();
    }

    @Override // defpackage.csy
    public final int e(int i) {
        if (!defpackage.dai.C(p())) {
            J();
            return q().e(i);
        }
        defpackage.cxw cxwVarH = H();
        cxwVarH.getClass();
        return cxwVarH.e(i);
    }

    @Override // defpackage.csy
    public final int f(int i) {
        if (!defpackage.dai.C(p())) {
            J();
            return q().f(i);
        }
        defpackage.cxw cxwVarH = H();
        cxwVarH.getClass();
        return cxwVarH.f(i);
    }

    @Override // defpackage.cux, defpackage.csy
    public final java.lang.Object g() {
        return this.r;
    }

    @Override // defpackage.cwf
    public final int h() {
        return this.i;
    }

    @Override // defpackage.cwf
    public final defpackage.cwe i() {
        return this.w;
    }

    @Override // defpackage.cwf
    public final defpackage.cwf j() {
        defpackage.cxp cxpVar;
        defpackage.cxl cxlVarL = p().l();
        if (cxlVarL == null || (cxpVar = cxlVarL.w) == null) {
            return null;
        }
        return cxpVar.o;
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
            affcVar.invoke(((defpackage.cxl) objArr[i2]).w.o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [affc, java.lang.Object] */
    @Override // defpackage.cwf
    public final void m() {
        this.y = true;
        defpackage.cwe cweVar = this.w;
        cweVar.g();
        if (this.v) {
            defpackage.bzc bzcVarK = p().k();
            java.lang.Object[] objArr = bzcVarK.a;
            int i = bzcVarK.b;
            for (int i2 = 0; i2 < i; i2++) {
                defpackage.cxl cxlVar = (defpackage.cxl) objArr[i2];
                if (cxlVar.al() && cxlVar.aw() == 1 && cxlVar.aq(cxlVar.w.b())) {
                    p().X(false, true, true);
                }
            }
        }
        if (this.H || (!this.l && !k().m && this.v)) {
            this.v = false;
            int iF = F();
            G(3);
            this.f.j(false);
            defpackage.cxl cxlVarP = p();
            defpackage.cyx cyxVar = ((defpackage.czz) defpackage.cxo.a(cxlVarP)).w;
            ((defpackage.cez) cyxVar.a).b(cxlVarP, cyxVar.e, this.K);
            G(iF);
            this.H = false;
        }
        if (cweVar.d) {
            cweVar.e = true;
        }
        if (cweVar.b && cweVar.j()) {
            cweVar.f();
        }
        this.y = false;
    }

    @Override // defpackage.cwf
    public final void n() {
        p().W(false);
    }

    @Override // defpackage.cwf
    public final void o() {
        p().X(false, true, true);
    }

    public final defpackage.cxl p() {
        return this.f.a;
    }

    public final defpackage.cyl q() {
        return this.f.a();
    }

    public final java.util.List r() {
        p().ag();
        if (!this.x) {
            return this.I.e();
        }
        defpackage.cxl cxlVarP = p();
        defpackage.bzc bzcVar = this.I;
        defpackage.bzc bzcVarK = cxlVarP.k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cxl cxlVar = (defpackage.cxl) objArr[i2];
            if (bzcVar.b <= i2) {
                bzcVar.n(cxlVar.w.o);
            } else {
                bzcVar.d(i2, cxlVar.w.o);
            }
        }
        bzcVar.h(cxlVarP.v().size(), bzcVar.b);
        this.x = false;
        return bzcVar.e();
    }

    public final void s() {
        this.v = true;
        this.H = true;
    }

    public final void t() {
        this.u = true;
    }

    public final void u() {
        if (this.s) {
            this.s = false;
            ((defpackage.czz) defpackage.cxo.a(p())).p.f(p());
            defpackage.cxl cxlVarP = p();
            defpackage.cyl cylVar = cxlVarP.p().w;
            for (defpackage.cyl cylVarQ = cxlVarP.q(); !defpackage.afga.f(cylVarQ, cylVar) && cylVarQ != null; cylVarQ = cylVarQ.w) {
                cylVarQ.aq();
                cylVarQ.au();
            }
            defpackage.bzc bzcVarK = p().k();
            java.lang.Object[] objArr = bzcVarK.a;
            int i = bzcVarK.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((defpackage.cxl) objArr[i2]).o().u();
            }
        }
    }

    @Override // defpackage.ctx
    public final defpackage.cux v(long j) throws java.lang.Throwable {
        int i = 3;
        if (p().E == 3) {
            p().z();
        }
        if (defpackage.dai.C(p())) {
            defpackage.cxw cxwVarH = H();
            cxwVarH.getClass();
            cxwVarH.y = 3;
            cxwVarH.v(j);
        }
        defpackage.cxl cxlVarP = p();
        defpackage.cxl cxlVarL = cxlVarP.l();
        if (cxlVarL != null) {
            if (this.G != 3 && !cxlVarP.u) {
                defpackage.csc.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iAv = cxlVarL.av();
            int i2 = iAv - 1;
            if (iAv == 0) {
                throw null;
            }
            if (i2 == 0) {
                i = 1;
            } else {
                if (i2 != 2) {
                    int iAv2 = cxlVarL.av();
                    defpackage.dai.D(iAv2);
                    throw new java.lang.IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(defpackage.dai.D(iAv2)));
                }
                i = 2;
            }
        }
        this.G = i;
        E(j);
        return this;
    }

    @Override // defpackage.cux
    public final int x() {
        return q().x();
    }

    @Override // defpackage.cux
    public final void y(long j, float f, defpackage.cmq cmqVar) throws java.lang.Throwable {
        K(j, f, null, cmqVar);
    }
}
