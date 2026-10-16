package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bke extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.bki b;
    final /* synthetic */ java.lang.CharSequence c;
    final /* synthetic */ long d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bke(defpackage.bki bkiVar, java.lang.CharSequence charSequence, long j, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = bkiVar;
        this.c = charSequence;
        this.d = j;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.bke bkeVar = new defpackage.bke(this.b, this.c, this.d, afdkVar);
        bkeVar.e = obj;
        return bkeVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            android.view.textclassifier.TextClassifier textClassifierM = a$.ExternalSyntheticApiModelOutline1.m(this.e);
            defpackage.bki bkiVar = this.b;
            java.lang.CharSequence charSequence = this.c;
            long j = this.d;
            this.a = 1;
            if (bkiVar.d(charSequence, j, textClassifierM, this) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bke) b(a$.ExternalSyntheticApiModelOutline1.m(obj), (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
