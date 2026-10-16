package defpackage;

/* loaded from: classes.dex */
public final class ctk implements cva {
    final /* synthetic */ ctl a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ctk(ctl ctlVar, Object obj, int i) {
        this.c = i;
        this.a = ctlVar;
        this.b = obj;
    }

    private final ctc e() {
        ctl ctlVar = this.a;
        cxb cxbVar = (cxb) ctlVar.n.a(this.b);
        if (cxbVar != null) {
            return (ctc) ctlVar.l.a(cxbVar);
        }
        return null;
    }

    @Override // defpackage.cva
    public final cvb a() {
        if (this.c != 0) {
            return this.a.a(this.b);
        }
        ctc ctcVarE = e();
        if (ctcVarE != null) {
            this.a.f(ctcVarE, false);
        }
        return this.a.a(this.b);
    }

    @Override // defpackage.cva
    public final void b() {
        if (this.c != 0) {
            return;
        }
        ctc ctcVarE = e();
        if ((ctcVarE != null ? ctcVarE.h : null) != null) {
            this.a.j(this.b);
        }
    }

    @Override // defpackage.cva
    public final boolean c() {
        ctc ctcVarE;
        bxa bxaVar;
        if (this.c != 0 || (ctcVarE = e()) == null || (bxaVar = ctcVarE.h) == null) {
            return true;
        }
        return bxaVar.a();
    }

    @Override // defpackage.cva
    public final void d(bxw bxwVar) {
        if (this.c != 0) {
            return;
        }
        ctc ctcVarE = e();
        bxa bxaVar = ctcVarE != null ? ctcVarE.h : null;
        if (bxaVar == null || bxaVar.a()) {
            return;
        }
        cec cecVar = (cec) cek.i.j();
        afec afecVarI = cecVar != null ? cecVar.i() : null;
        cec cecVarI = byx.i(cecVar);
        try {
            bxaVar.b(bxwVar);
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                byx.l(cecVar, cecVarI, afecVarI);
            }
        }
    }
}
