package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cxa extends defpackage.cyl {
    private static final defpackage.cjs h;
    public final defpackage.czf f;
    public defpackage.cxv g;

    static {
        defpackage.cjs cjsVar = new defpackage.cjs();
        cjsVar.j(-281474976710656L);
        cjsVar.q(1.0f);
        cjsVar.r(1);
        h = cjsVar;
    }

    public cxa(defpackage.cxl cxlVar) {
        super(cxlVar);
        defpackage.czf czfVar = new defpackage.czf();
        this.f = czfVar;
        czfVar.w = this;
        this.g = cxlVar.j != null ? new defpackage.cwz(this) : null;
    }

    private final void G() {
        if (this.l) {
            return;
        }
        this.t.o().B();
    }

    @Override // defpackage.cyl
    public final /* synthetic */ defpackage.cge B() {
        return this.f;
    }

    @Override // defpackage.cyl
    public final defpackage.cxv C() {
        return this.g;
    }

    @Override // defpackage.cyl
    public final void D() {
        if (this.g == null) {
            this.g = new defpackage.cwz(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0081 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.cyl
    public final void E(defpackage.cyk cykVar, long j, defpackage.cwy cwyVar, int i, boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        java.lang.Object[] objArr;
        int i4;
        defpackage.cxl cxlVar;
        long jB;
        defpackage.cxl cxlVar2 = this.t;
        if (cykVar.e(cxlVar2)) {
            if (!az(j)) {
                i2 = i;
                if (i2 == 1) {
                    if ((java.lang.Float.floatToRawIntBits(X(j, Z())) & Integer.MAX_VALUE) < 2139095040) {
                        z3 = true;
                        z2 = false;
                        i3 = 1;
                    } else {
                        z3 = false;
                        i3 = 1;
                    }
                }
                if (z3) {
                    int i5 = cwyVar.a;
                    defpackage.bzc bzcVarJ = cxlVar2.j();
                    objArr = bzcVarJ.a;
                    for (i4 = bzcVarJ.b - 1; i4 >= 0; i4--) {
                        cxlVar = (defpackage.cxl) objArr[i4];
                        if (cxlVar.an()) {
                            cykVar.b(cxlVar, j, cwyVar, i3, z2);
                            jB = cwyVar.b();
                            if (java.lang.Float.intBitsToFloat((int) (jB >> 32)) >= 0.0f && defpackage.cws.c(jB) && !defpackage.cws.b(jB) && !cykVar.c(cwyVar, cxlVar)) {
                                break;
                            }
                        }
                    }
                    cwyVar.a = i5;
                }
            }
            i3 = i;
            z3 = true;
            z2 = z;
            if (z3) {
                int i6 = cwyVar.a;
                defpackage.bzc bzcVarJ2 = cxlVar2.j();
                objArr = bzcVarJ2.a;
                while (i4 >= 0) {
                    cxlVar = (defpackage.cxl) objArr[i4];
                    if (cxlVar.an()) {
                        cykVar.b(cxlVar, j, cwyVar, i3, z2);
                        jB = cwyVar.b();
                        if (java.lang.Float.intBitsToFloat((int) (jB >> 32)) >= 0.0f) {
                            continue;
                        }
                    }
                }
                cwyVar.a = i6;
            }
        }
        i2 = i;
        z2 = z;
        z3 = false;
        i3 = i2;
        if (z3) {
            int i7 = cwyVar.a;
            defpackage.bzc bzcVarJ3 = cxlVar2.j();
            objArr = bzcVarJ3.a;
            while (i4 >= 0) {
                cxlVar = (defpackage.cxl) objArr[i4];
                if (cxlVar.an()) {
                    cykVar.b(cxlVar, j, cwyVar, i3, z2);
                    jB = cwyVar.b();
                    if (java.lang.Float.intBitsToFloat((int) (jB >> 32)) >= 0.0f) {
                        continue;
                    }
                }
            }
            cwyVar.a = i7;
        }
    }

    @Override // defpackage.cyl
    public final void F(defpackage.ckc ckcVar, defpackage.cmq cmqVar) throws java.lang.Throwable {
        defpackage.cxl cxlVar = this.t;
        defpackage.cyu cyuVarA = defpackage.cxo.a(cxlVar);
        defpackage.bzc bzcVarJ = cxlVar.j();
        java.lang.Object[] objArr = bzcVarJ.a;
        int i = bzcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cxl cxlVar2 = (defpackage.cxl) objArr[i2];
            if (cxlVar2.an()) {
                cxlVar2.C(ckcVar, cmqVar);
            }
        }
        if (cyuVarA.F()) {
            aA(ckcVar, h);
        }
    }

    @Override // defpackage.csy
    public final int c(int i) {
        defpackage.tc tcVarAz = this.t.az();
        defpackage.cty ctyVarL = tcVarAz.l();
        defpackage.cxl cxlVar = (defpackage.cxl) tcVarAz.b;
        return ctyVarL.a(cxlVar.q(), cxlVar.u(), i);
    }

    @Override // defpackage.csy
    public final int d(int i) {
        defpackage.tc tcVarAz = this.t.az();
        defpackage.cty ctyVarL = tcVarAz.l();
        defpackage.cxl cxlVar = (defpackage.cxl) tcVarAz.b;
        return ctyVarL.b(cxlVar.q(), cxlVar.u(), i);
    }

    @Override // defpackage.cyl, defpackage.cux
    public final void dD(long j, float f, defpackage.affc affcVar) {
        super.dD(j, f, affcVar);
        G();
    }

    @Override // defpackage.csy
    public final int e(int i) {
        defpackage.tc tcVarAz = this.t.az();
        defpackage.cty ctyVarL = tcVarAz.l();
        defpackage.cxl cxlVar = (defpackage.cxl) tcVarAz.b;
        return ctyVarL.c(cxlVar.q(), cxlVar.u(), i);
    }

    @Override // defpackage.csy
    public final int f(int i) {
        defpackage.tc tcVarAz = this.t.az();
        defpackage.cty ctyVarL = tcVarAz.l();
        defpackage.cxl cxlVar = (defpackage.cxl) tcVarAz.b;
        return ctyVarL.d(cxlVar.q(), cxlVar.u(), i);
    }

    @Override // defpackage.cxu
    public final int r(defpackage.csf csfVar) {
        defpackage.cxv cxvVar = this.g;
        if (cxvVar != null) {
            return cxvVar.r(csfVar);
        }
        defpackage.cxz cxzVar = (defpackage.cxz) ae();
        if (!cxzVar.l) {
            if (cxzVar.F() == 1) {
                defpackage.cwe cweVar = cxzVar.w;
                cweVar.f = true;
                if (cweVar.b) {
                    cxzVar.s();
                }
            } else {
                cxzVar.w.g = true;
            }
        }
        defpackage.cyl cylVarK = cxzVar.k();
        boolean z = cylVarK.m;
        cylVarK.m = true;
        cxzVar.m();
        cylVarK.m = z;
        java.lang.Integer num = (java.lang.Integer) cxzVar.w.h.get(csfVar);
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        return num.intValue();
    }

    @Override // defpackage.ctx
    public final defpackage.cux v(long j) {
        if (this.v) {
            defpackage.cxv cxvVar = this.g;
            cxvVar.getClass();
            j = cxvVar.d;
        }
        A(j);
        defpackage.cxl cxlVar = this.t;
        defpackage.bzc bzcVarK = cxlVar.k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.cxl) objArr[i2]).o().G = 3;
        }
        av(cxlVar.q.e(this, cxlVar.u(), j));
        an();
        return this;
    }

    @Override // defpackage.cyl, defpackage.cux
    public final void y(long j, float f, defpackage.cmq cmqVar) {
        super.y(j, f, cmqVar);
        G();
    }
}
