package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lnk extends defpackage.kfp {
    final /* synthetic */ defpackage.lnl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnk(defpackage.lnl lnlVar) {
        super(null);
        this.a = lnlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [qsr] */
    @Override // defpackage.kfp
    public final void a(defpackage.qsh qshVar) {
        char c;
        try {
            try {
                defpackage.lnl lnlVar = this.a;
                defpackage.mkp.a.g();
                defpackage.rei reiVarD = ((defpackage.qtv) qshVar).d();
                lnlVar.n = (defpackage.qsr) reiVarD.f.a(new defpackage.rdg(reiVarD, 10));
                c = 4044;
            } catch (java.lang.Throwable th) {
                if (this.a.n == null) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.lnl.m.f()).ai((char) 4047)).u("CarMediaManager not available, no playback status.");
                }
                throw th;
            }
        } catch (java.lang.IllegalStateException | java.lang.SecurityException | defpackage.qst | defpackage.qsu e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.lnl.m.h()).p(e)).ai(4045)).u("Unable to connect to car.");
            c = 4046;
        }
        this = this.a.n;
        if (this == 0) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.lnl.m.f()).ai(c)).u("CarMediaManager not available, no playback status.");
        }
    }

    @Override // defpackage.kfp
    public final void b() {
        this.a.n = null;
    }

    @Override // defpackage.kfp
    public final void c(defpackage.qsh qshVar) {
        ((defpackage.yqj) defpackage.lnl.m.l().ai((char) 4048)).u("Car service connected.");
    }
}
