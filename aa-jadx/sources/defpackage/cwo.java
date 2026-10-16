package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class cwo extends defpackage.cge {
    public final int B;
    public defpackage.cge C;

    public cwo(byte[] bArr) {
        this();
        W(new defpackage.cjc(2, false, null, 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [cge] */
    /* JADX WARN: Type inference failed for: r2v2, types: [cge] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    private final void dl(int i, boolean z) {
        ?? r2;
        defpackage.cge cgeVar;
        int i2 = this.r;
        this.r = i;
        if (i2 != i) {
            if (M() == this) {
                this.s = i;
            }
            if (this.A) {
                defpackage.cge cgeVar2 = this.q;
                while (r2 != 0) {
                    i |= r2.r;
                    r2.r = i;
                    if (r2 == cgeVar2) {
                        break;
                    }
                    this = this;
                    r2 = r2.t;
                }
                if (z && r2 == cgeVar2) {
                    i = defpackage.cym.c(cgeVar2);
                    cgeVar2.r = i;
                }
                this = this;
                this = this;
                int i3 = 0;
                if (r2 != 0 && (cgeVar = r2.u) != null) {
                    i3 = cgeVar.s;
                }
                int i4 = i | i3;
                for (?? r3 = r2; r3 != 0; r3 = r3.t) {
                    i4 |= r3.r;
                    r3.s = i4;
                }
            }
        }
    }

    @Override // defpackage.cge
    public final void O() {
        super.O();
        for (defpackage.cge cgeVar = this.C; cgeVar != null; cgeVar = cgeVar.u) {
            cgeVar.U(this.w);
            if (!cgeVar.A) {
                cgeVar.O();
            }
        }
    }

    @Override // defpackage.cge
    public final void P() {
        for (defpackage.cge cgeVar = this.C; cgeVar != null; cgeVar = cgeVar.u) {
            cgeVar.P();
        }
        super.P();
    }

    @Override // defpackage.cge
    public final void Q() {
        super.Q();
        for (defpackage.cge cgeVar = this.C; cgeVar != null; cgeVar = cgeVar.u) {
            cgeVar.Q();
        }
    }

    @Override // defpackage.cge
    public final void R() {
        for (defpackage.cge cgeVar = this.C; cgeVar != null; cgeVar = cgeVar.u) {
            cgeVar.R();
        }
        super.R();
    }

    @Override // defpackage.cge
    public final void S() {
        super.S();
        for (defpackage.cge cgeVar = this.C; cgeVar != null; cgeVar = cgeVar.u) {
            cgeVar.S();
        }
    }

    @Override // defpackage.cge
    public final void T(defpackage.cge cgeVar) {
        this.q = cgeVar;
        for (defpackage.cge cgeVar2 = this.C; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
            cgeVar2.T(cgeVar);
        }
    }

    @Override // defpackage.cge
    public final void U(defpackage.cyl cylVar) {
        this.w = cylVar;
        for (defpackage.cge cgeVar = this.C; cgeVar != null; cgeVar = cgeVar.u) {
            cgeVar.U(cylVar);
        }
    }

    public final void V(defpackage.cwn cwnVar) {
        defpackage.cge cgeVar = null;
        for (defpackage.cge cgeVar2 = this.C; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
            if (cgeVar2 == cwnVar) {
                if (cgeVar2.A) {
                    defpackage.cym.f(cgeVar2);
                    cgeVar2.S();
                    cgeVar2.P();
                }
                cgeVar2.T(cgeVar2);
                cgeVar2.s = 0;
                if (cgeVar == null) {
                    this.C = cgeVar2.u;
                } else {
                    cgeVar.u = cgeVar2.u;
                }
                cgeVar2.u = null;
                cgeVar2.t = null;
                int i = this.r;
                int iC = defpackage.cym.c(this);
                dl(iC, true);
                if (this.A && (i & 2) != 0 && (iC & 2) == 0) {
                    defpackage.cyg cygVar = defpackage.cjv.r(this).v;
                    this.q.U(null);
                    cygVar.h();
                    return;
                }
                return;
            }
            cgeVar = cgeVar2;
        }
        java.util.Objects.toString(cwnVar);
        throw new java.lang.IllegalStateException("Could not find delegate: ".concat(java.lang.String.valueOf(cwnVar)));
    }

    public final void W(defpackage.cwn cwnVar) {
        defpackage.cge cgeVarM = cwnVar.M();
        if (cgeVarM != cwnVar) {
            if (true != (cwnVar instanceof defpackage.cge)) {
                cwnVar = null;
            }
            defpackage.cge cgeVar = cwnVar != null ? ((defpackage.cge) cwnVar).t : null;
            if (cgeVarM != this.q || !defpackage.afga.f(cgeVar, this)) {
                throw new java.lang.IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (cgeVarM.A) {
            defpackage.csc.c("Cannot delegate to an already attached node");
        }
        cgeVarM.T(this.q);
        int i = this.r;
        int iC = defpackage.cym.c(cgeVarM);
        cgeVarM.r = iC;
        int i2 = iC & 2;
        int i3 = this.r;
        if (i2 != 0 && (i3 & 2) != 0 && !(this instanceof defpackage.cxe)) {
            defpackage.csc.c(defpackage.a.bs(cgeVarM, this, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ", "\nDelegate Node: "));
        }
        cgeVarM.u = this.C;
        this.C = cgeVarM;
        cgeVarM.t = this;
        dl(iC | this.r, false);
        if (this.A) {
            if (i2 == 0 || (i & 2) != 0) {
                U(this.w);
            } else {
                defpackage.cyg cygVar = defpackage.cjv.r(this).v;
                this.q.U(null);
                cygVar.h();
            }
            cgeVarM.O();
            cgeVarM.R();
            defpackage.cym.d(cgeVarM);
        }
    }

    public cwo(defpackage.asj asjVar, boolean z, float f, defpackage.ckg ckgVar, defpackage.afer aferVar) {
        this();
        W(new defpackage.btw(asjVar, z, f, ckgVar, aferVar));
    }

    public cwo() {
        this.B = defpackage.cym.b(this);
    }
}
