package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class agm extends defpackage.afee implements defpackage.affg {
    float a;
    int b;
    final /* synthetic */ defpackage.agn c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agm(defpackage.agn agnVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.c = agnVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.agm agmVar = new defpackage.agm(this.c, afdkVar);
        agmVar.d = obj;
        return agmVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        aiuw aiuwVar;
        float fC;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (this.b != 0) {
            fC = this.a;
            aiuwVar = (aiuw) this.d;
            defpackage.afga.cz(obj);
        } else {
            defpackage.afga.cz(obj);
            aiuwVar = (aiuw) this.d;
            fC = defpackage.afw.c(aiuwVar.c());
        }
        while (ahoi.g(aiuwVar)) {
            defpackage.alj aljVar = new defpackage.alj(this.c, fC, 1);
            this.d = aiuwVar;
            this.a = fC;
            this.b = 1;
            if (defpackage.bxi.d(gT()).a(aljVar, this) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.agm) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
