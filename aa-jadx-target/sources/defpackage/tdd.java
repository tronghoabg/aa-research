package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tdd implements defpackage.eqt, defpackage.epl {
    final /* synthetic */ defpackage.eqt a;
    final /* synthetic */ defpackage.eqp b;
    private boolean c;

    public tdd(defpackage.eqt eqtVar, defpackage.eqp eqpVar) {
        this.a = eqtVar;
        this.b = eqpVar;
    }

    @Override // defpackage.epl
    public final void eT(defpackage.eqg eqgVar) {
        if (!this.c) {
            this.b.k(this);
            this.c = true;
        }
        eqgVar.getLifecycle().d(this);
    }

    @Override // defpackage.eqt
    public final void ea(java.lang.Object obj) {
        this.a.ea(obj);
        this.b.k(this);
        this.c = true;
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eU() {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eD(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eE(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eF(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eG(defpackage.eqg eqgVar) {
    }
}
