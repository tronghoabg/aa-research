package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public class cwe extends cfx {
    public final int B;
    public cfx C;

    public cwe(byte[] bArr) {
        this();
        W(new ciu(2, false, null, 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [cfx] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    private final void ed(int i, boolean z) {
        cfx cfxVar;
        int i2 = this.r;
        this.r = i;
        if (i2 != i) {
            if (M() == this) {
                this.s = i;
            }
            if (this.A) {
                cfx cfxVar2 = this.q;
                ?? r2 = this;
                while (r2 != 0) {
                    i |= r2.r;
                    r2.r = i;
                    if (r2 == cfxVar2) {
                        break;
                    } else {
                        r2 = r2.t;
                    }
                }
                if (z && r2 == cfxVar2) {
                    i = cyd.c(cfxVar2);
                    cfxVar2.r = i;
                }
                int i3 = 0;
                if (r2 != 0 && (cfxVar = r2.u) != null) {
                    i3 = cfxVar.s;
                }
                int i4 = i | i3;
                for (cfx cfxVar3 = r2; cfxVar3 != null; cfxVar3 = cfxVar3.t) {
                    i4 |= cfxVar3.r;
                    cfxVar3.s = i4;
                }
            }
        }
    }

    @Override // defpackage.cfx
    public final void O() {
        super.O();
        for (cfx cfxVar = this.C; cfxVar != null; cfxVar = cfxVar.u) {
            cfxVar.U(this.w);
            if (!cfxVar.A) {
                cfxVar.O();
            }
        }
    }

    @Override // defpackage.cfx
    public final void P() {
        for (cfx cfxVar = this.C; cfxVar != null; cfxVar = cfxVar.u) {
            cfxVar.P();
        }
        super.P();
    }

    @Override // defpackage.cfx
    public final void Q() {
        super.Q();
        for (cfx cfxVar = this.C; cfxVar != null; cfxVar = cfxVar.u) {
            cfxVar.Q();
        }
    }

    @Override // defpackage.cfx
    public final void R() {
        for (cfx cfxVar = this.C; cfxVar != null; cfxVar = cfxVar.u) {
            cfxVar.R();
        }
        super.R();
    }

    @Override // defpackage.cfx
    public final void S() {
        super.S();
        for (cfx cfxVar = this.C; cfxVar != null; cfxVar = cfxVar.u) {
            cfxVar.S();
        }
    }

    @Override // defpackage.cfx
    public final void T(cfx cfxVar) {
        this.q = cfxVar;
        for (cfx cfxVar2 = this.C; cfxVar2 != null; cfxVar2 = cfxVar2.u) {
            cfxVar2.T(cfxVar);
        }
    }

    @Override // defpackage.cfx
    public final void U(cyc cycVar) {
        this.w = cycVar;
        for (cfx cfxVar = this.C; cfxVar != null; cfxVar = cfxVar.u) {
            cfxVar.U(cycVar);
        }
    }

    public final void V(cwd cwdVar) {
        cfx cfxVar = null;
        for (cfx cfxVar2 = this.C; cfxVar2 != null; cfxVar2 = cfxVar2.u) {
            if (cfxVar2 == cwdVar) {
                if (cfxVar2.A) {
                    cyd.f(cfxVar2);
                    cfxVar2.S();
                    cfxVar2.P();
                }
                cfxVar2.T(cfxVar2);
                cfxVar2.s = 0;
                if (cfxVar == null) {
                    this.C = cfxVar2.u;
                } else {
                    cfxVar.u = cfxVar2.u;
                }
                cfxVar2.u = null;
                cfxVar2.t = null;
                int i = this.r;
                int iC = cyd.c(this);
                ed(iC, true);
                if (this.A && (i & 2) != 0 && (iC & 2) == 0) {
                    cxx cxxVar = bzi.q(this).v;
                    this.q.U(null);
                    cxxVar.h();
                    return;
                }
                return;
            }
            cfxVar = cfxVar2;
        }
        Objects.toString(cwdVar);
        throw new IllegalStateException("Could not find delegate: ".concat(String.valueOf(cwdVar)));
    }

    public final void W(cwd cwdVar) {
        cfx cfxVarM = cwdVar.M();
        if (cfxVarM != cwdVar) {
            if (true != (cwdVar instanceof cfx)) {
                cwdVar = null;
            }
            cfx cfxVar = cwdVar != null ? ((cfx) cwdVar).t : null;
            if (cfxVarM != this.q || !affa.f(cfxVar, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (cfxVarM.A) {
            crt.c("Cannot delegate to an already attached node");
        }
        cfxVarM.T(this.q);
        int i = this.r;
        int iC = cyd.c(cfxVarM);
        cfxVarM.r = iC;
        int i2 = iC & 2;
        int i3 = this.r;
        if (i2 != 0 && (i3 & 2) != 0 && !(this instanceof cwu)) {
            crt.c(a.bt(cfxVarM, this, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ", "\nDelegate Node: "));
        }
        cfxVarM.u = this.C;
        this.C = cfxVarM;
        cfxVarM.t = this;
        ed(iC | this.r, false);
        if (this.A) {
            if (i2 == 0 || (i & 2) != 0) {
                U(this.w);
            } else {
                cxx cxxVar = bzi.q(this).v;
                this.q.U(null);
                cxxVar.h();
            }
            cfxVarM.O();
            cfxVarM.R();
            cyd.d(cfxVarM);
        }
    }

    public cwe(ase aseVar, boolean z, float f, cjy cjyVar, afdr afdrVar) {
        this();
        W(new btp(aseVar, z, f, cjyVar, afdrVar));
    }

    public cwe() {
        this.B = cyd.b(this);
    }
}
