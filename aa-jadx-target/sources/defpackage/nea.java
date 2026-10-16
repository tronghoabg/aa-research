package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nea implements defpackage.epl {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public nea(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.epl
    public final void eG(defpackage.eqg eqgVar) {
        if (this.b != 0) {
            defpackage.lvi.a().b();
            defpackage.lvi.a().c((java.lang.String) this.a);
            return;
        }
        java.lang.Object obj = this.a;
        defpackage.afcg afcgVar = defpackage.afcg.a;
        defpackage.ned nedVar = (defpackage.ned) obj;
        nedVar.e.m(afcgVar);
        nedVar.d.m(afcgVar);
        defpackage.nuz.b().f(nedVar.c);
    }

    @Override // defpackage.epl
    public final void eT(defpackage.eqg eqgVar) {
        if (this.b != 0) {
            defpackage.lvi.a().b();
        } else {
            defpackage.nuz.b().k(((defpackage.ned) this.a).c);
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
}
