package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aqv extends defpackage.afed implements defpackage.affg {
    int a;
    final /* synthetic */ aiuw b;
    final /* synthetic */ defpackage.apq c;
    final /* synthetic */ defpackage.affh d;
    final /* synthetic */ defpackage.affc e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqv(aiuw aiuwVar, defpackage.apq apqVar, defpackage.affh affhVar, defpackage.affc affcVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = aiuwVar;
        this.c = apqVar;
        this.d = affhVar;
        this.e = affcVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aqv aqvVar = new defpackage.aqv(this.b, this.c, this.d, this.e, afdkVar);
        aqvVar.f = obj;
        return aqvVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            defpackage.cru cruVar = (defpackage.cru) this.f;
            aiuw aiuwVar = this.b;
            defpackage.apq apqVar = this.c;
            defpackage.affh affhVar = this.d;
            defpackage.affc affcVar = this.e;
            this.a = 1;
            if (defpackage.arc.g(cruVar, aiuwVar, apqVar, affhVar, affcVar, this) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aqv) b((defpackage.cru) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
