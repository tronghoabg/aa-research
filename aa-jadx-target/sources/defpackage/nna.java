package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nna extends defpackage.afee implements defpackage.affg {
    final /* synthetic */ defpackage.agn a;
    final /* synthetic */ defpackage.afer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nna(defpackage.agn agnVar, defpackage.afer aferVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.a = agnVar;
        this.b = aferVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.nna(this.a, this.b, afdkVar);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afga.cz(obj);
        defpackage.agn agnVar = this.a;
        if (defpackage.afga.f(agnVar.e(), agnVar.g())) {
            this.b.invoke();
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.nna) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
