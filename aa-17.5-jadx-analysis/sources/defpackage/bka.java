package defpackage;

import android.view.textclassifier.TextClassifier;

/* loaded from: classes.dex */
final class bka extends afde implements afeg {
    int a;
    final /* synthetic */ bke b;
    final /* synthetic */ CharSequence c;
    final /* synthetic */ long d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bka(bke bkeVar, CharSequence charSequence, long j, afck afckVar) {
        super(2, afckVar);
        this.b = bkeVar;
        this.c = charSequence;
        this.d = j;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        bka bkaVar = new bka(this.b, this.c, this.d, afckVar);
        bkaVar.e = obj;
        return bkaVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            TextClassifier textClassifierM11m = a$$ExternalSyntheticApiModelOutline0.m11m(this.e);
            bke bkeVar = this.b;
            CharSequence charSequence = this.c;
            long j = this.d;
            this.a = 1;
            if (bkeVar.d(charSequence, j, textClassifierM11m, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bka) b(a$$ExternalSyntheticApiModelOutline0.m11m(obj), (afck) obj2)).hT(afak.a);
    }
}
