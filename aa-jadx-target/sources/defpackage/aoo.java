package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aoo extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.aoq b;
    final /* synthetic */ long c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoo(defpackage.aoq aoqVar, long j, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = aoqVar;
        this.c = j;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aoo aooVar = new defpackage.aoo(this.b, this.c, afdkVar);
        aooVar.d = obj;
        return aooVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            aiuw aiuwVar = (aiuw) this.d;
            defpackage.aoq aoqVar = this.b;
            long j = this.c;
            defpackage.affh affhVar = aoqVar.b;
            defpackage.cji cjiVar = new defpackage.cji(j);
            this.a = 1;
            if (affhVar.invoke(aiuwVar, cjiVar, this) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aoo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
