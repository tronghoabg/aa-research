package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class afm extends defpackage.afee implements defpackage.affg {
    /* synthetic */ float a;

    public afm(defpackage.afdk afdkVar) {
        super(2, afdkVar);
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.afm afmVar = new defpackage.afm(afdkVar);
        afmVar.a = ((java.lang.Number) obj).floatValue();
        return afmVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afga.cz(obj);
        return java.lang.Boolean.valueOf(this.a > 0.0f);
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.afm) b(java.lang.Float.valueOf(((java.lang.Number) obj).floatValue()), (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
