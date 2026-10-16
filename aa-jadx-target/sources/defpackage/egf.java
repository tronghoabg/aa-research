package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class egf extends defpackage.afee implements defpackage.affc {
    int a;
    final /* synthetic */ defpackage.egk b;
    final /* synthetic */ defpackage.afdo c;
    final /* synthetic */ defpackage.affg d;
    final /* synthetic */ defpackage.fdm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egf(defpackage.egk egkVar, defpackage.fdm fdmVar, defpackage.afdo afdoVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        super(1, afdkVar);
        this.b = egkVar;
        this.e = fdmVar;
        this.c = afdoVar;
        this.d = affgVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i != 0) {
            return obj;
        }
        ege egeVar = new ege(this.b, this.c, this.d, (defpackage.afdk) null);
        this.a = 1;
        java.lang.Object objJ = dtg.j(egeVar, this);
        return objJ == afdrVar ? afdrVar : objJ;
    }

    @Override // defpackage.affc
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return new defpackage.egf(this.b, this.e, this.c, this.d, (defpackage.afdk) obj).hf(defpackage.afbk.a);
    }
}
