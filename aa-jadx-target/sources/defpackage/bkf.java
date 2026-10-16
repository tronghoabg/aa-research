package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bkf extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ android.view.textclassifier.TextClassifier b;
    final /* synthetic */ defpackage.affg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkf(android.view.textclassifier.TextClassifier textClassifier, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = textClassifier;
        this.c = affgVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.bkf(this.b, this.c, afdkVar);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i != 0) {
            return obj;
        }
        android.view.textclassifier.TextClassifier textClassifier = this.b;
        if (textClassifier == null) {
            return null;
        }
        defpackage.affg affgVar = this.c;
        this.a = 1;
        java.lang.Object objInvoke = affgVar.invoke(textClassifier, this);
        return objInvoke == afdrVar ? afdrVar : objInvoke;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bkf) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
