package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cxh extends defpackage.cyl {
    private static final defpackage.cjs K;
    private defpackage.csl J;
    public defpackage.cxe f;
    public defpackage.dlm g;
    public defpackage.cxv h;

    static {
        defpackage.cjs cjsVar = new defpackage.cjs();
        cjsVar.j(-72056498821267456L);
        cjsVar.q(1.0f);
        cjsVar.r(1);
        K = cjsVar;
    }

    public cxh(defpackage.cxl cxlVar, defpackage.cxe cxeVar) {
        super(cxlVar);
        this.f = cxeVar;
        this.h = cxlVar.j != null ? new defpackage.cxf(this) : null;
        this.J = (cxeVar.M().r & 512) != 0 ? new defpackage.csl(this, (defpackage.csj) cxeVar) : null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    private final void aD() {
        boolean z;
        if (this.l) {
            return;
        }
        ao();
        defpackage.cyl cylVarG = G();
        defpackage.csl cslVar = this.J;
        if (cslVar != null) {
            defpackage.csj csjVar = cslVar.b;
            this.h.getClass();
            if (csjVar.d() || cslVar.c) {
                z = false;
            } else {
                long j = this.c;
                defpackage.cxv cxvVar = this.h;
                if (defpackage.dly.d(j, cxvVar != null ? new defpackage.dly(cxvVar.t()) : null)) {
                    long j2 = cylVarG.c;
                    defpackage.cxv cxvVarC = cylVarG.C();
                    if (defpackage.dly.d(j2, cxvVarC != null ? new defpackage.dly(cxvVarC.t()) : null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            cylVarG.u = z;
        }
        boolean z2 = cylVarG.m;
        cylVarG.m = this.m;
        K().h();
        cylVarG.m = z2;
        cylVarG.u = false;
    }

    @Override // defpackage.cyl
    public final defpackage.cge B() {
        return this.f.M();
    }

    @Override // defpackage.cyl
    public final defpackage.cxv C() {
        return this.h;
    }

    @Override // defpackage.cyl
    public final void D() {
        if (this.h == null) {
            this.h = new defpackage.cxf(this);
        }
    }

    @Override // defpackage.cyl
    public final void F(defpackage.ckc ckcVar, defpackage.cmq cmqVar) {
        defpackage.cyl cylVar;
        G().ah(ckcVar, cmqVar);
        if (!defpackage.cxo.a(this.t).F() || (cylVar = this.w) == null) {
            return;
        }
        if (this.c == cylVar.c && cylVar.y == 0) {
            return;
        }
        aA(ckcVar, K);
    }

    public final defpackage.cyl G() {
        defpackage.cyl cylVar = this.w;
        cylVar.getClass();
        return cylVar;
    }

    public final void H(defpackage.cxe cxeVar) {
        if (!defpackage.afga.f(cxeVar, this.f)) {
            if ((cxeVar.M().r & 512) != 0) {
                defpackage.csj csjVar = (defpackage.csj) cxeVar;
                defpackage.csl cslVar = this.J;
                if (cslVar != null) {
                    cslVar.b = csjVar;
                } else {
                    cslVar = new defpackage.csl(this, csjVar);
                }
                this.J = cslVar;
            } else {
                this.J = null;
            }
        }
        this.f = cxeVar;
    }

    @Override // defpackage.csy
    public final int c(int i) {
        defpackage.csl cslVar = this.J;
        if (cslVar == null) {
            return this.f.h(this, G(), i);
        }
        defpackage.csj csjVar = cslVar.b;
        G();
        return csjVar.e();
    }

    @Override // defpackage.csy
    public final int d(int i) {
        defpackage.csl cslVar = this.J;
        if (cslVar == null) {
            return this.f.i(this, G(), i);
        }
        defpackage.csj csjVar = cslVar.b;
        G();
        return csjVar.f();
    }

    @Override // defpackage.cyl, defpackage.cux
    public final void dD(long j, float f, defpackage.affc affcVar) {
        super.dD(j, f, affcVar);
        aD();
    }

    @Override // defpackage.csy
    public final int e(int i) {
        defpackage.csl cslVar = this.J;
        if (cslVar == null) {
            return this.f.j(this, G(), i);
        }
        defpackage.csj csjVar = cslVar.b;
        G();
        return csjVar.g();
    }

    @Override // defpackage.csy
    public final int f(int i) {
        defpackage.csl cslVar = this.J;
        if (cslVar == null) {
            return this.f.k(this, G(), i);
        }
        defpackage.csj csjVar = cslVar.b;
        G();
        return csjVar.l();
    }

    @Override // defpackage.cxu
    public final int r(defpackage.csf csfVar) {
        defpackage.cxv cxvVar = this.h;
        return cxvVar != null ? cxvVar.q.b(csfVar, Integer.MIN_VALUE) : defpackage.ua.a(this, csfVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    @Override // defpackage.ctx
    public final defpackage.cux v(long j) {
        defpackage.ctz ctzVarDt;
        if (this.v) {
            defpackage.dlm dlmVar = this.g;
            if (dlmVar == null) {
                throw new java.lang.IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            j = dlmVar.a;
        }
        A(j);
        defpackage.csl cslVar = this.J;
        if (cslVar != null) {
            defpackage.cxh cxhVar = cslVar.a;
            defpackage.csj csjVar = cslVar.b;
            defpackage.cxv cxvVar = cxhVar.h;
            cxvVar.getClass();
            defpackage.ctz ctzVarK = cxvVar.K();
            ctzVarK.c();
            ctzVarK.b();
            boolean z = false;
            boolean z2 = csjVar.c() || !defpackage.dlm.f(j, this.g);
            cslVar.c = z2;
            if (!z2) {
                G().v = true;
            }
            G();
            ctzVarDt = csjVar.a();
            G().v = false;
            int iC = ctzVarDt.c();
            defpackage.cxv cxvVar2 = this.h;
            cxvVar2.getClass();
            if (iC == cxvVar2.a) {
                int iB = ctzVarDt.b();
                defpackage.cxv cxvVar3 = this.h;
                cxvVar3.getClass();
                if (iB == cxvVar3.b) {
                    z = true;
                }
            }
            if (!cslVar.c) {
                long j2 = G().c;
                defpackage.cxv cxvVarC = G().C();
                if (defpackage.dly.d(j2, cxvVarC != null ? new defpackage.dly(cxvVarC.t()) : null) && !z) {
                    ctzVarDt = new defpackage.cxg(ctzVarDt, this);
                }
            }
            if (ctzVarDt == null) {
                ctzVarDt = this.f.dt(this, G(), j);
            }
        } else {
            ctzVarDt = this.f.dt(this, G(), j);
        }
        av(ctzVarDt);
        an();
        return this;
    }

    @Override // defpackage.cyl, defpackage.cux
    public final void y(long j, float f, defpackage.cmq cmqVar) {
        super.y(j, f, cmqVar);
        aD();
    }
}
