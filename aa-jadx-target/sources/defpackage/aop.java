package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aop extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.aoq b;
    final /* synthetic */ defpackage.anw c;
    final /* synthetic */ defpackage.apn d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aop(defpackage.aoq aoqVar, defpackage.anw anwVar, defpackage.apn apnVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = aoqVar;
        this.c = anwVar;
        this.d = apnVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aop aopVar = new defpackage.aop(this.b, this.c, this.d, afdkVar);
        aopVar.e = obj;
        return aopVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            aiuw aiuwVar = (aiuw) this.e;
            defpackage.aoq aoqVar = this.b;
            long j = this.c.c;
            defpackage.affh affhVar = aoqVar.c;
            long jC = defpackage.dmd.c(j, aoqVar.i ? -1.0f : 1.0f);
            defpackage.apn apnVar = this.d;
            defpackage.affh affhVar2 = defpackage.aon.a;
            java.lang.Float f = new java.lang.Float(apnVar == defpackage.apn.a ? java.lang.Float.intBitsToFloat((int) (jC & 4294967295L)) : java.lang.Float.intBitsToFloat((int) (jC >> 32)));
            this.a = 1;
            if (affhVar.invoke(aiuwVar, f, this) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aop) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
