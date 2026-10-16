package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class efn extends defpackage.afee implements defpackage.affh {
    int a;
    final /* synthetic */ defpackage.egk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efn(defpackage.egk egkVar, defpackage.afdk afdkVar) {
        super(3, afdkVar);
        this.b = egkVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            defpackage.egk egkVar = this.b;
            this.a = 1;
            if (egkVar.e(this) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affh
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return new defpackage.efn(this.b, (defpackage.afdk) obj3).hf(defpackage.afbk.a);
    }
}
