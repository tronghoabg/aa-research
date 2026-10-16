package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ctt implements defpackage.cvj {
    final /* synthetic */ defpackage.ctu a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public ctt(defpackage.ctu ctuVar, java.lang.Object obj, int i) {
        this.c = i;
        this.a = ctuVar;
        this.b = obj;
    }

    private final defpackage.ctl e() {
        defpackage.ctu ctuVar = this.a;
        defpackage.cxl cxlVar = (defpackage.cxl) ctuVar.n.a(this.b);
        if (cxlVar != null) {
            return (defpackage.ctl) ctuVar.l.a(cxlVar);
        }
        return null;
    }

    @Override // defpackage.cvj
    public final defpackage.cvk a() {
        if (this.c != 0) {
            return this.a.a(this.b);
        }
        defpackage.ctl ctlVarE = e();
        if (ctlVarE != null) {
            this.a.f(ctlVarE, false);
        }
        return this.a.a(this.b);
    }

    @Override // defpackage.cvj
    public final void b() {
        if (this.c != 0) {
            return;
        }
        defpackage.ctl ctlVarE = e();
        if ((ctlVarE != null ? ctlVarE.h : null) != null) {
            this.a.j(this.b);
        }
    }

    @Override // defpackage.cvj
    public final boolean c() {
        defpackage.ctl ctlVarE;
        defpackage.bxg bxgVar;
        if (this.c != 0 || (ctlVarE = e()) == null || (bxgVar = ctlVarE.h) == null) {
            return true;
        }
        return bxgVar.a();
    }

    @Override // defpackage.cvj
    public final void d(defpackage.byc bycVar) {
        if (this.c != 0) {
            return;
        }
        defpackage.ctl ctlVarE = e();
        defpackage.bxg bxgVar = ctlVarE != null ? ctlVarE.h : null;
        if (bxgVar == null || bxgVar.a()) {
            return;
        }
        defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
        defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
        defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
        try {
            bxgVar.b(bycVar);
            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                throw th2;
            }
        }
    }
}
