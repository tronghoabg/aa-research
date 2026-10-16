package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bic extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.affc b;
    final /* synthetic */ defpackage.bie c;
    final /* synthetic */ defpackage.dal d;
    final /* synthetic */ defpackage.bin e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bic(defpackage.dal dalVar, defpackage.affc affcVar, defpackage.bie bieVar, defpackage.bin binVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.d = dalVar;
        this.b = affcVar;
        this.c = bieVar;
        this.e = binVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.bic bicVar = new defpackage.bic(this.d, this.b, this.c, this.e, afdkVar);
        bicVar.f = obj;
        return bicVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        try {
            if (this.a == 0) {
                defpackage.afga.cz(obj);
                aiuw aiuwVar = (aiuw) this.f;
                defpackage.dal dalVar = this.d;
                defpackage.affc affcVar = defpackage.bir.a;
                android.view.View view = dalVar.a;
                defpackage.bil bilVar = (defpackage.bil) affcVar.invoke(view);
                defpackage.bis bisVar = new defpackage.bis(view, new defpackage.bib(this.e), bilVar);
                if (defpackage.bhz.a) {
                    ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new defpackage.bej(this.c, bilVar, (defpackage.afdk) null, 2), 3);
                }
                defpackage.affc affcVar2 = this.b;
                if (affcVar2 != null) {
                    affcVar2.invoke(bisVar);
                }
                this.c.a = bisVar;
                this.a = 1;
                if (dalVar.a(bisVar, this) == afdrVar) {
                    return afdrVar;
                }
            } else {
                defpackage.afga.cz(obj);
            }
            throw new defpackage.afap();
        } catch (java.lang.Throwable th) {
            this.c.a = null;
            throw th;
        }
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bic) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
