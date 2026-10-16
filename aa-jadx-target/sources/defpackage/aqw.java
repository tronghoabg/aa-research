package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aqw extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.cri b;
    final /* synthetic */ defpackage.affh c;
    final /* synthetic */ defpackage.affc d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqw(defpackage.cri criVar, defpackage.affh affhVar, defpackage.affc affcVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = criVar;
        this.c = affhVar;
        this.d = affcVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aqw aqwVar = new defpackage.aqw(this.b, this.c, this.d, afdkVar);
        aqwVar.e = obj;
        return aqwVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            aiuw aiuwVar = (aiuw) this.e;
            defpackage.cri criVar = this.b;
            defpackage.aqv aqvVar = new defpackage.aqv(aiuwVar, new defpackage.apq(criVar), this.c, this.d, null);
            this.a = 1;
            if (defpackage.ca.aK(criVar, aqvVar, this) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aqw) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
