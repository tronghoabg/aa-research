package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bek extends defpackage.afee implements defpackage.affg {
    final /* synthetic */ defpackage.cri a;
    final /* synthetic */ defpackage.beq b;
    private /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bek(defpackage.cri criVar, defpackage.beq beqVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.a = criVar;
        this.b = beqVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.bek bekVar = new defpackage.bek(this.a, this.b, afdkVar);
        bekVar.c = obj;
        return bekVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afga.cz(obj);
        aiuw aiuwVar = (aiuw) this.c;
        defpackage.cri criVar = this.a;
        defpackage.beq beqVar = this.b;
        ahoc.d(aiuwVar, (defpackage.afdo) null, 4, new defpackage.bej(criVar, beqVar, null, 1, null), 1);
        return ahoc.d(aiuwVar, (defpackage.afdo) null, 4, new defpackage.bej(criVar, beqVar, (defpackage.afdk) null, 0), 1);
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bek) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
