package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class nib extends defpackage.afee implements defpackage.affg {
    final /* synthetic */ java.util.Map a;
    final /* synthetic */ defpackage.bwx b;
    final /* synthetic */ defpackage.byj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nib(defpackage.byj byjVar, java.util.Map map, defpackage.bwx bwxVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.c = byjVar;
        this.a = map;
        this.b = bwxVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.nib(this.c, this.a, this.b, afdkVar);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afga.cz(obj);
        if (this.c.e() == 0) {
            defpackage.nif.a.l().u("All animations finished, requesting focus on HOME");
            java.lang.Object obj2 = this.a.get(defpackage.nje.b);
            obj2.getClass();
            ((defpackage.cit) obj2).a(7);
            this.b.b(java.lang.Boolean.TRUE);
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.nib) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
