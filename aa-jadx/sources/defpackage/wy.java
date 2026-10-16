package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wy implements defpackage.epl {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public wy(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.epl
    public final void eE(defpackage.eqg eqgVar) {
        int i = this.b;
        if (i == 0) {
            defpackage.yq.a();
            ((defpackage.epy) this.a).d(this);
            return;
        }
        if (i == 1) {
            ((defpackage.epy) this.a).d(this);
            return;
        }
        if (i == 2) {
            ((defpackage.epy) this.a).d(this);
            return;
        }
        if (i == 3) {
            ((defpackage.erz) this.a).a();
            return;
        }
        defpackage.ype ypeVar = (defpackage.ype) defpackage.tlj.b.f().ai(9107);
        defpackage.tlf tlfVar = (defpackage.tlf) this.a;
        java.lang.String str = tlfVar.a;
        ypeVar.y("Unregister delegate %s", str);
        tlfVar.b.c.remove(str);
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eU() {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eD(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eF(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eG(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eT(defpackage.eqg eqgVar) {
    }
}
