package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class egj extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.egk b;
    final /* synthetic */ defpackage.afgt c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ boolean e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egj(defpackage.egk egkVar, defpackage.afgt afgtVar, java.lang.Object obj, boolean z, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = egkVar;
        this.c = afgtVar;
        this.d = obj;
        this.e = z;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.egj egjVar = new defpackage.egj(this.b, this.c, this.d, this.e, afdkVar);
        egjVar.f = obj;
        return egjVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.ego egoVar = (defpackage.ego) this.f;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            egi egiVar = new egi(this.c, this.b, egoVar, this.d, this.e, (defpackage.afdk) null);
            this.f = null;
            this.a = 1;
            if (dtg.j(egiVar, this) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.egj) b((defpackage.ego) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
