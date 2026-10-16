package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aqu extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.cri b;
    final /* synthetic */ defpackage.affh c;
    final /* synthetic */ defpackage.affc d;
    final /* synthetic */ defpackage.apq e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqu(defpackage.cri criVar, defpackage.affh affhVar, defpackage.affc affcVar, defpackage.apq apqVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = criVar;
        this.c = affhVar;
        this.d = affcVar;
        this.e = apqVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aqu aquVar = new defpackage.aqu(this.b, this.c, this.d, this.e, afdkVar);
        aquVar.f = obj;
        return aquVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            aiuw aiuwVar = (aiuw) this.f;
            defpackage.cri criVar = this.b;
            defpackage.aqt aqtVar = new defpackage.aqt(aiuwVar, this.c, this.d, this.e, null);
            this.a = 1;
            if (defpackage.ca.aK(criVar, aqtVar, this) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aqu) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
