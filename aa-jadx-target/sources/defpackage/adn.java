package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adn extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.adm b;
    final /* synthetic */ long c;
    final /* synthetic */ defpackage.ado d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adn(defpackage.adm admVar, long j, defpackage.ado adoVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = admVar;
        this.c = j;
        this.d = adoVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.adn(this.b, this.c, this.d, afdkVar);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.adn adnVar;
        defpackage.affg affgVar;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i != 0) {
            adnVar = this;
        } else {
            defpackage.adm admVar = this.b;
            defpackage.dly dlyVar = new defpackage.dly(this.c);
            defpackage.aej aejVar = this.d.a;
            this.a = 1;
            adnVar = this;
            obj = defpackage.aeb.k(admVar.a, dlyVar, aejVar, null, adnVar, 12);
            if (obj == afdrVar) {
                return afdrVar;
            }
        }
        defpackage.aeh aehVar = (defpackage.aeh) obj;
        if (aehVar.b == 2 && (affgVar = adnVar.d.c) != null) {
            affgVar.invoke(new defpackage.dly(adnVar.b.b), aehVar.a.a());
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.adn) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
