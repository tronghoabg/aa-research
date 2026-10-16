package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tcs implements defpackage.eqt {
    final /* synthetic */ defpackage.affc a;
    final /* synthetic */ defpackage.eqr b;
    private defpackage.eqp c;

    public tcs(defpackage.affc affcVar, defpackage.eqr eqrVar) {
        this.a = affcVar;
        this.b = eqrVar;
    }

    @Override // defpackage.eqt
    public final void ea(java.lang.Object obj) {
        defpackage.eqp eqpVar = (defpackage.eqp) this.a.invoke(obj);
        defpackage.eqp eqpVar2 = this.c;
        if (eqpVar2 == eqpVar) {
            return;
        }
        if (eqpVar2 != null) {
            this.b.s(eqpVar2);
        }
        defpackage.eqr eqrVar = this.b;
        eqrVar.r(eqpVar, new defpackage.kku(new defpackage.tcr(eqrVar, 0), 11));
        this.c = eqpVar;
    }
}
