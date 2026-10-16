package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aqh extends defpackage.afee implements defpackage.affg {
    final /* synthetic */ long a;
    private /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqh(long j, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.a = j;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aqh aqhVar = new defpackage.aqh(this.a, afdkVar);
        aqhVar.b = obj;
        return aqhVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afga.cz(obj);
        ((defpackage.izq) this.b).p(this.a);
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aqh) b((defpackage.izq) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
