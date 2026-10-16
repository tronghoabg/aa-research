package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bci extends defpackage.afee implements defpackage.affg {
    final /* synthetic */ defpackage.bcj a;
    final /* synthetic */ defpackage.ctc b;
    final /* synthetic */ defpackage.afer c;
    final /* synthetic */ defpackage.afer d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bci(defpackage.bcj bcjVar, defpackage.ctc ctcVar, defpackage.afer aferVar, defpackage.afer aferVar2, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.a = bcjVar;
        this.b = ctcVar;
        this.c = aferVar;
        this.d = aferVar2;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.bci bciVar = new defpackage.bci(this.a, this.b, this.c, this.d, afdkVar);
        bciVar.e = obj;
        return bciVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afga.cz(obj);
        aiuw aiuwVar = (aiuw) this.e;
        defpackage.bcj bcjVar = this.a;
        ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new defpackage.ait(bcjVar, this.b, this.c, (defpackage.afdk) null, 11), 3);
        return ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new defpackage.ais(bcjVar, this.d, (defpackage.afdk) null, 17), 3);
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bci) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
