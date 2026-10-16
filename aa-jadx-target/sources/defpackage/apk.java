package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class apk extends defpackage.afee implements defpackage.affg {
    int a;
    private /* synthetic */ java.lang.Object b;

    public apk(defpackage.afdk afdkVar) {
        super(2, afdkVar);
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.apk apkVar = new defpackage.apk(afdkVar);
        apkVar.b = obj;
        return apkVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        aiuw aiuwVar;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (this.a != 0) {
            aiuwVar = (aiuw) this.b;
            defpackage.afga.cz(obj);
        } else {
            defpackage.afga.cz(obj);
            aiuwVar = (aiuw) this.b;
        }
        while (defpackage.afgz.u(aiuwVar.c())) {
            defpackage.ajg ajgVar = new defpackage.ajg(15);
            this.b = aiuwVar;
            this.a = 1;
            if (defpackage.bxi.d(gT()).a(ajgVar, this) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.apk) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
