package defpackage;

import android.view.textclassifier.TextClassifier;

/* loaded from: classes.dex */
final class bkb extends afde implements afeg {
    int a;
    final /* synthetic */ TextClassifier b;
    final /* synthetic */ afeg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkb(TextClassifier textClassifier, afeg afegVar, afck afckVar) {
        super(2, afckVar);
        this.b = textClassifier;
        this.c = afegVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new bkb(this.b, this.c, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i != 0) {
            return obj;
        }
        TextClassifier textClassifier = this.b;
        if (textClassifier == null) {
            return null;
        }
        afeg afegVar = this.c;
        this.a = 1;
        Object objInvoke = afegVar.invoke(textClassifier, this);
        return objInvoke == afcrVar ? afcrVar : objInvoke;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bkb) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
