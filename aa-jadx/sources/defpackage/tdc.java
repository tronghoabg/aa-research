package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tdc implements defpackage.eqt, defpackage.epl {
    final /* synthetic */ defpackage.eqt a;
    private boolean b;

    public tdc(defpackage.eqt eqtVar) {
        this.a = eqtVar;
    }

    @Override // defpackage.epl
    public final void eT(defpackage.eqg eqgVar) {
        this.b = false;
    }

    @Override // defpackage.eqt
    public final void ea(java.lang.Object obj) {
        if (this.b) {
            this.a.ea(obj);
        } else {
            this.b = true;
        }
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
