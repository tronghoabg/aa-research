package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bdw extends defpackage.afee implements defpackage.affg {
    final /* synthetic */ defpackage.cri a;
    final /* synthetic */ defpackage.beq b;
    final /* synthetic */ defpackage.blw c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdw(defpackage.cri criVar, defpackage.beq beqVar, defpackage.blw blwVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.a = criVar;
        this.b = beqVar;
        this.c = blwVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.bdw bdwVar = new defpackage.bdw(this.a, this.b, this.c, afdkVar);
        bdwVar.d = obj;
        return bdwVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afga.cz(obj);
        aiuw aiuwVar = (aiuw) this.d;
        defpackage.cri criVar = this.a;
        ahoc.d(aiuwVar, (defpackage.afdo) null, 4, new defpackage.ais(criVar, this.b, (defpackage.afdk) null, 19), 1);
        ahoc.d(aiuwVar, (defpackage.afdo) null, 4, new defpackage.ais(criVar, this.c, (defpackage.afdk) null, 20), 1);
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bdw) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
