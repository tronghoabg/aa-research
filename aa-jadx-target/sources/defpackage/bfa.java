package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bfa extends defpackage.afee implements defpackage.affg {
    final /* synthetic */ defpackage.bwx a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfa(defpackage.bwx bwxVar, long j, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.a = bwxVar;
        this.b = j;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.bfa(this.a, this.b, afdkVar);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afga.cz(obj);
        defpackage.bwx bwxVar = this.a;
        if (((defpackage.asn) bwxVar.a()) != null) {
            bwxVar.b(null);
        }
        bwxVar.b(new defpackage.asn(this.b));
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bfa) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
