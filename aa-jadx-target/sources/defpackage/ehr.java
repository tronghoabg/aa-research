package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ehr extends defpackage.afee implements defpackage.affh {
    int a;
    private /* synthetic */ java.lang.Object b;

    public ehr(defpackage.afdk afdkVar) {
        super(3, afdkVar);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object obj2 = this.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i != 0) {
            return obj;
        }
        this.b = null;
        this.a = 1;
        defpackage.ego egoVar = (defpackage.ego) obj2;
        egoVar.b();
        java.lang.Object objC = defpackage.ebm.c(egoVar.a, new defpackage.egn(egoVar, null), this);
        return objC == afdrVar ? afdrVar : objC;
    }

    @Override // defpackage.affh
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ((java.lang.Boolean) obj2).booleanValue();
        defpackage.ehr ehrVar = new defpackage.ehr((defpackage.afdk) obj3);
        ehrVar.b = (defpackage.ego) obj;
        return ehrVar.hf(defpackage.afbk.a);
    }
}
