package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class dcs extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.afgv b;
    final /* synthetic */ defpackage.bxt c;
    final /* synthetic */ defpackage.eqg d;
    final /* synthetic */ defpackage.dct e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcs(defpackage.afgv afgvVar, defpackage.bxt bxtVar, defpackage.eqg eqgVar, defpackage.dct dctVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = afgvVar;
        this.c = bxtVar;
        this.d = eqgVar;
        this.e = dctVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.dcs(this.b, this.c, this.d, this.e, afdkVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [afbk, java.lang.Object] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        try {
            if (this.a != 0) {
                defpackage.afga.cz(obj);
            } else {
                defpackage.afga.cz(obj);
                defpackage.dcb dcbVar = (defpackage.dcb) this.b.a;
                if (dcbVar != null) {
                    dcbVar.b = ahoi.b(this.c.j);
                }
                defpackage.bxt bxtVar = this.c;
                this.a = 1;
                if (bxtVar.y(this) == afdrVar) {
                    return afdrVar;
                }
            }
            defpackage.eqg eqgVar = this.d;
            eqgVar.getLifecycle().d(this.e);
            this = defpackage.afbk.a;
            return this;
        } catch (java.lang.Throwable th) {
            defpackage.eqg eqgVar2 = this.d;
            eqgVar2.getLifecycle().d(this.e);
            throw th;
        }
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.dcs) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
