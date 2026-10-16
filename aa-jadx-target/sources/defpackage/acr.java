package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class acr extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ defpackage.adi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acr(boolean z, boolean z2, defpackage.adi adiVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = z;
        this.c = z2;
        this.d = adiVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.acr(this.b, this.c, this.d, afdkVar);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0 && this.b && !this.c) {
            defpackage.adi adiVar = this.d;
            this.a = 1;
            if (adiVar.f(this) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.acr) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
