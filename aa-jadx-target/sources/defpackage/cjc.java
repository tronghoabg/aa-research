package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cjc extends defpackage.cge implements defpackage.cwm, defpackage.cyp, defpackage.cwb, defpackage.czj, defpackage.cwn {
    public final boolean a;
    public boolean b;
    public boolean c;
    public java.lang.Integer d;
    public defpackage.der e;
    public defpackage.rqj f;
    private final defpackage.affg g;
    private final int h;

    public /* synthetic */ cjc(int i, boolean z, defpackage.affg affgVar, int i2) {
        this.a = z & ((i2 & 2) == 0);
        this.g = (i2 & 4) != 0 ? null : affgVar;
        this.h = 1 == (i2 & 1) ? 1 : i;
    }

    private final void m() {
        if (defpackage.bzo.a && this.e == null) {
            this.e = defpackage.cjv.A(this, new defpackage.chq(this, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [cge] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [cge] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [bzc] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [bzc] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final defpackage.cim b() {
        boolean z;
        defpackage.cyg cygVar;
        defpackage.cio cioVar = new defpackage.cio();
        int i = this.h;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((defpackage.kwv) defpackage.cjv.y(this, defpackage.dbl.h)).L() == 1);
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("Unknown Focusability");
            }
            z = false;
        }
        cioVar.a = z;
        defpackage.cge cgeVar = this.q;
        if (!cgeVar.A) {
            defpackage.csc.c("visitAncestors called on an unattached node");
        }
        defpackage.cge cgeVar2 = this.q;
        defpackage.cxl cxlVarR = defpackage.cjv.r(this);
        loop0: while (cxlVarR != null) {
            if ((cxlVarR.v.f.s & 3072) != 0) {
                while (cgeVar2 != null) {
                    int i2 = cgeVar2.r;
                    if ((i2 & 3072) != 0) {
                        if (cgeVar2 != cgeVar && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? O = cgeVar2;
                            ?? bzcVar = 0;
                            while (O != 0) {
                                if (O instanceof defpackage.ciq) {
                                    ((defpackage.ciq) O).c(cioVar);
                                } else if ((O.r & 2048) != 0 && (O instanceof defpackage.cwo)) {
                                    defpackage.cge cgeVar3 = ((defpackage.cwo) O).C;
                                    int i3 = 0;
                                    while (cgeVar3 != null) {
                                        if ((cgeVar3.r & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                O = O;
                                                bzcVar = bzcVar;
                                                bzcVar = bzcVar;
                                                O = cgeVar3;
                                            } else {
                                                if (bzcVar == 0) {
                                                    bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (O != 0) {
                                                    bzcVar.n(O);
                                                }
                                                bzcVar.n(cgeVar3);
                                                O = 0;
                                            }
                                        } else {
                                            O = O;
                                            bzcVar = bzcVar;
                                        }
                                        cgeVar3 = cgeVar3.u;
                                        O = O;
                                        bzcVar = bzcVar;
                                    }
                                    if (i3 != 1) {
                                        O = O;
                                        bzcVar = bzcVar;
                                    } else {
                                        O = O;
                                        bzcVar = bzcVar;
                                    }
                                }
                                O = defpackage.cjv.o(bzcVar);
                            }
                        }
                    }
                    cgeVar2 = cgeVar2.t;
                }
            }
            cxlVarR = cxlVarR.l();
            cgeVar2 = (cxlVarR == null || (cygVar = cxlVarR.v) == null) ? null : cygVar.e;
        }
        return cioVar;
    }

    @Override // defpackage.cwb
    public final /* synthetic */ defpackage.cwa d() {
        return defpackage.cvx.a;
    }

    @Override // defpackage.cge
    public final void du() {
        if (g().b()) {
            ((defpackage.czz) defpackage.cjv.t(this)).J.k(true, true, 8);
        }
    }

    @Override // defpackage.czj
    public final void dv() {
        m();
    }

    @Override // defpackage.cge
    public final void dz() {
        m();
    }

    public final defpackage.cja g() {
        defpackage.cjc cjcVarB;
        defpackage.cyg cygVar;
        if (!this.A || (cjcVarB = ((defpackage.czz) defpackage.cjv.t(this)).J.b()) == null) {
            return defpackage.cja.d;
        }
        if (this == cjcVarB) {
            return defpackage.cja.a;
        }
        if (cjcVarB.A) {
            if (!cjcVarB.q.A) {
                defpackage.csc.c("visitAncestors called on an unattached node");
            }
            defpackage.cge cgeVar = cjcVarB.q.t;
            defpackage.cxl cxlVarR = defpackage.cjv.r(cjcVarB);
            while (cxlVarR != null) {
                if ((cxlVarR.v.f.s & 1024) != 0) {
                    while (cgeVar != null) {
                        if ((cgeVar.r & 1024) != 0) {
                            defpackage.cge cgeVarO = cgeVar;
                            defpackage.bzc bzcVar = null;
                            while (cgeVarO != null) {
                                if (cgeVarO instanceof defpackage.cjc) {
                                    if (this == ((defpackage.cjc) cgeVarO)) {
                                        return defpackage.cja.b;
                                    }
                                } else if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                    int i = 0;
                                    for (defpackage.cge cgeVar2 = ((defpackage.cwo) cgeVarO).C; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
                                        if ((cgeVar2.r & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cgeVarO = cgeVar2;
                                            } else {
                                                if (bzcVar == null) {
                                                    bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (cgeVarO != null) {
                                                    bzcVar.n(cgeVarO);
                                                }
                                                bzcVar.n(cgeVar2);
                                                cgeVarO = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                cgeVarO = defpackage.cjv.o(bzcVar);
                            }
                        }
                        cgeVar = cgeVar.t;
                    }
                }
                cxlVarR = cxlVarR.l();
                cgeVar = (cxlVarR == null || (cygVar = cxlVarR.v) == null) ? null : cygVar.e;
            }
        }
        return defpackage.cja.d;
    }

    public final defpackage.cjj h(defpackage.ctc ctcVar) {
        defpackage.cjj cjjVar = ((defpackage.cio) b()).l;
        if (cjjVar != defpackage.cil.a) {
            return ctcVar == null ? cjjVar : cjjVar.f(ctcVar.u(defpackage.cjv.p(this), 0L));
        }
        return ctcVar != null ? ctcVar.o(defpackage.cjv.p(this), false) : defpackage.bzo.C(0L, defpackage.dlv.f(defpackage.cjv.p(this).h()));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    public final void i() throws afbj {
        defpackage.cim cimVar;
        int iOrdinal = g().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new defpackage.afas();
                }
                return;
            }
        }
        defpackage.afgv afgvVar = new defpackage.afgv();
        defpackage.dai.z(this, new defpackage.bso(afgvVar, this, 4));
        java.lang.Object obj = afgvVar.a;
        if (obj == null) {
            defpackage.afga.d("focusProperties");
            cimVar = null;
        } else {
            cimVar = (defpackage.cim) obj;
        }
        if (cimVar.l()) {
            return;
        }
        ((defpackage.czz) defpackage.cjv.t(this)).J.k(true, true, 8);
    }

    public final boolean j(int i) {
        int iS = defpackage.mw.s(this, i);
        int i2 = iS - 1;
        if (iS == 0) {
            throw null;
        }
        if (i2 == 0) {
            return defpackage.mw.p(this);
        }
        if (i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            return true;
        }
        throw new defpackage.afas();
    }

    public final boolean k(int i) {
        return ((defpackage.cio) b()).a ? j(i) : defpackage.rj.k(this, i, new defpackage.cii(i, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [cge] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [cge] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [bzc] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [bzc] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void l(defpackage.cja cjaVar, defpackage.cja cjaVar2) {
        defpackage.cyg cygVar;
        defpackage.affg affgVar;
        defpackage.cik cikVar = ((defpackage.czz) defpackage.cjv.t(this)).J;
        defpackage.cjc cjcVarB = cikVar.b();
        if (!defpackage.afga.f(cjaVar, cjaVar2) && (affgVar = this.g) != null) {
            affgVar.invoke(cjaVar, cjaVar2);
        }
        defpackage.cge cgeVar = this.q;
        if (!cgeVar.A) {
            defpackage.csc.c("visitAncestors called on an unattached node");
        }
        defpackage.cge cgeVar2 = this.q;
        defpackage.cxl cxlVarR = defpackage.cjv.r(this);
        while (cxlVarR != null) {
            if ((cxlVarR.v.f.s & 5120) != 0) {
                while (cgeVar2 != null) {
                    int i = cgeVar2.r;
                    if ((i & 5120) != 0) {
                        if (cgeVar2 != cgeVar && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? O = cgeVar2;
                            ?? bzcVar = 0;
                            while (O != 0) {
                                if (O instanceof defpackage.cic) {
                                    defpackage.cic cicVar = (defpackage.cic) O;
                                    if (cjcVarB == cikVar.b()) {
                                        cicVar.dC(cjaVar2);
                                    }
                                } else if ((O.r & 4096) != 0 && (O instanceof defpackage.cwo)) {
                                    defpackage.cge cgeVar3 = ((defpackage.cwo) O).C;
                                    int i2 = 0;
                                    O = O;
                                    bzcVar = bzcVar;
                                    while (cgeVar3 != null) {
                                        if ((cgeVar3.r & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                bzcVar = bzcVar;
                                                O = cgeVar3;
                                            } else {
                                                if (bzcVar == 0) {
                                                    bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (O != 0) {
                                                    bzcVar.n(O);
                                                }
                                                bzcVar.n(cgeVar3);
                                                O = 0;
                                            }
                                        }
                                        cgeVar3 = cgeVar3.u;
                                        O = O;
                                        bzcVar = bzcVar;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                O = defpackage.cjv.o(bzcVar);
                            }
                        }
                    }
                    cgeVar2 = cgeVar2.t;
                }
            }
            cxlVarR = cxlVarR.l();
            cgeVar2 = (cxlVarR == null || (cygVar = cxlVarR.v) == null) ? null : cygVar.e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    @Override // defpackage.cge
    public final void q() {
        defpackage.cik cikVar;
        int iOrdinal = g().ordinal();
        if (iOrdinal == 0) {
            cikVar = ((defpackage.czz) defpackage.cjv.t(this)).J;
            cikVar.k(true, false, 8);
            if (this.a) {
                cikVar.m();
            }
            cikVar.f();
        } else if (iOrdinal == 1) {
            defpackage.cik cikVar2 = ((defpackage.czz) defpackage.cjv.t(this)).J;
            defpackage.cjc cjcVarL = defpackage.mw.l(this);
            if (cjcVarL != null && cjcVarL.a) {
                cikVar2.m();
                cikVar2.f();
            }
        } else if (iOrdinal == 2) {
            cikVar = ((defpackage.czz) defpackage.cjv.t(this)).J;
            cikVar.k(true, false, 8);
            if (this.a) {
                cikVar.m();
            }
            cikVar.f();
        } else if (iOrdinal != 3) {
            throw new defpackage.afas();
        }
        this.d = null;
        defpackage.der derVar = this.e;
        if (derVar != null) {
            derVar.b();
        }
        defpackage.rqj rqjVar = this.f;
        if (rqjVar != null) {
            rqjVar.b();
        }
        this.f = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    @Override // defpackage.cyp
    public final void r() throws afbj {
        i();
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }
}
