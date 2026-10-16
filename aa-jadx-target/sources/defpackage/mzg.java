package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class mzg extends defpackage.afee implements defpackage.affg {
    final /* synthetic */ long a;
    final /* synthetic */ boolean b;
    private /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzg(long j, boolean z, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.mzg mzgVar = new defpackage.mzg(this.a, this.b, afdkVar);
        mzgVar.c = obj;
        return mzgVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afga.cz(obj);
        ((defpackage.bxj) this.c).b(java.lang.Boolean.valueOf(defpackage.mzk.l(defpackage.dlt.a(this.a), this.b)));
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.mzg) b((defpackage.bxj) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
