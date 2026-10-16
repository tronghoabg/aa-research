package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bfh extends defpackage.cge implements defpackage.cwm, defpackage.cxe {
    public defpackage.dgd a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public defpackage.dgd g;
    public defpackage.beg h;
    private int i = -1;
    private int j = -1;
    private int k = -1;
    private defpackage.bys l;
    private java.lang.Object m;

    public bfh(defpackage.dgd dgdVar, int i, int i2, boolean z, boolean z2, defpackage.beg begVar) {
        this.a = dgdVar;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.h = begVar;
    }

    private final defpackage.bys g() {
        defpackage.bys bysVar = this.l;
        if (bysVar != null) {
            return bysVar;
        }
        defpackage.asq.a("Font resolution state is not set.");
        throw new defpackage.afap();
    }

    public final void d(java.lang.Object obj) throws java.io.IOException {
        int i;
        if (!defpackage.afga.f(obj, this.m)) {
            this.m = obj;
            this.f = true;
        }
        if (this.f) {
            int i2 = 3;
            if (this.b == 1 && ((i = this.c) == 1 || i == Integer.MAX_VALUE)) {
                i2 = 1;
            }
            defpackage.dgd dgdVar = this.g;
            if (dgdVar == null) {
                defpackage.asq.a("Resolved style is not set.");
                throw new defpackage.afap();
            }
            defpackage.deu deuVarB = defpackage.bes.b(defpackage.dgd.w(dgdVar, 0L, 0L, null, null, null, null, 0L, null, 0, 1, 0L, null, null, 16711679), defpackage.cjv.r(this).r, (defpackage.wde) defpackage.cjv.y(this, defpackage.dbl.f), i2);
            if (i2 == 1) {
                int iRound = java.lang.Math.round((float) java.lang.Math.ceil(deuVarB.d));
                this.j = iRound;
                this.k = this.c == 1 ? iRound : Integer.MAX_VALUE;
            } else {
                float fD = deuVarB.d(0);
                float fD2 = deuVarB.d(1);
                float fD3 = deuVarB.d(2);
                this.j = defpackage.asq.X(fD, fD2, fD3, this.b);
                this.k = defpackage.asq.X(fD, fD2, fD3, this.c);
            }
            this.i = java.lang.Math.round((float) java.lang.Math.ceil(deuVarB.f()));
            this.f = false;
        }
    }

    @Override // defpackage.cge
    public final void dk() {
        this.g = defpackage.dax.f(this.a, defpackage.cjv.r(this).s);
        this.f = true;
        defpackage.cjv.r(this).I();
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) throws java.io.IOException {
        long jD;
        d(g().a());
        if (this.d) {
            float fA = this.h.a();
            int iDN = cubVar.dN(fA);
            int iB = this.e ? Integer.MAX_VALUE : defpackage.dlm.b(j);
            int i = this.i;
            if (i > iB) {
                i = iB;
            }
            int i2 = java.lang.Float.compare(fA, 0.0f) == 0 ? this.j : iDN;
            if (java.lang.Float.compare(fA, 0.0f) == 0) {
                iDN = this.k;
            }
            jD = defpackage.dln.d(i, iB, i2, iDN);
        } else {
            jD = defpackage.dln.d(this.i, Integer.MAX_VALUE, defpackage.afqt.g(this.j, defpackage.dlm.c(j), defpackage.dlm.a(j)), defpackage.afqt.g(this.k, defpackage.dlm.c(j), defpackage.dlm.a(j)));
        }
        defpackage.cux cuxVarV = ctxVar.v(defpackage.dln.f(j, jD));
        return cubVar.dS(cuxVarV.a, cuxVarV.b, defpackage.afcf.a, new defpackage.bbs(cuxVarV, 20));
    }

    @Override // defpackage.cge
    public final void dz() {
        defpackage.wde wdeVar = (defpackage.wde) defpackage.cjv.y(this, defpackage.dbl.f);
        defpackage.dgd dgdVarF = defpackage.dax.f(this.a, defpackage.cjv.r(this).s);
        this.g = dgdVarF;
        dgdVarF.getClass();
        f(dgdVarF, wdeVar);
        this.f = true;
    }

    public final void f(defpackage.dgd dgdVar, defpackage.wde wdeVar) {
        defpackage.dhz dhzVarL = dgdVar.l();
        defpackage.dil dilVarO = dgdVar.o();
        if (dilVarO == null) {
            dilVarO = defpackage.dil.k;
        }
        defpackage.die dieVarM = dgdVar.m();
        int i = dieVarM != null ? dieVarM.a : 0;
        defpackage.dif difVarN = dgdVar.n();
        this.l = wdeVar.f(dhzVarL, dilVarO, i, difVarN != null ? difVarN.a : 65535);
    }

    @Override // defpackage.cxe
    public final int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) throws java.io.IOException {
        d(g().a());
        int i2 = this.j;
        int i3 = this.k;
        if (i2 == i3) {
            return i3;
        }
        int iC = csyVar.c(i);
        int i4 = this.j;
        int i5 = this.k;
        if (iC < i4) {
            iC = i4;
        }
        return iC > i5 ? i5 : iC;
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.d(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) throws java.io.IOException {
        d(g().a());
        int i2 = this.j;
        if (i2 == this.k) {
            return i2;
        }
        int iE = csyVar.e(i);
        int i3 = this.j;
        int i4 = this.k;
        if (iE < i3) {
            iE = i3;
        }
        return iE > i4 ? i4 : iE;
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.f(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cge
    /* JADX INFO: renamed from: p */
    public final void t() {
        this.f = true;
        defpackage.cjv.r(this).I();
    }

    @Override // defpackage.cge
    public final void q() {
        this.g = null;
        this.l = null;
        this.m = null;
        this.f = false;
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }
}
