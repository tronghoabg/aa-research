package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* loaded from: classes.dex */
final class bkd extends afde implements afeg {
    Object a;
    Object b;
    long c;
    int d;
    final /* synthetic */ CharSequence e;
    final /* synthetic */ long f;
    final /* synthetic */ bke g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkd(CharSequence charSequence, long j, bke bkeVar, afck afckVar) {
        super(2, afckVar);
        this.e = charSequence;
        this.f = j;
        this.g = bkeVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        bkd bkdVar = new bkd(this.e, this.f, this.g, afckVar);
        bkdVar.h = obj;
        return bkdVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        long j;
        blg blgVar;
        Object obj2;
        Object obj3;
        afcr afcrVar = afcr.a;
        int i = this.d;
        if (i == 0) {
            woy.dF(obj);
            TextClassifier textClassifierM11m = a$$ExternalSyntheticApiModelOutline0.m11m(this.h);
            CharSequence charSequence = this.e;
            long j2 = this.f;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence, dfv.d(j2), dfv.c(j2));
            bke bkeVar = this.g;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(bkeVar.a());
            if (Build.VERSION.SDK_INT >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifierM11m.suggestSelection(defaultLocales.build());
            long jT = czz.t(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (Build.VERSION.SDK_INT < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                bke bkeVar2 = this.g;
                CharSequence charSequence2 = this.e;
                this.c = jT;
                this.d = 2;
                if (bkeVar2.d(charSequence2, jT, textClassifierM11m, this) != afcrVar) {
                    j = jT;
                }
            } else {
                TextClassification textClassification = textSelectionSuggestSelection.getTextClassification();
                textClassification.getClass();
                blg blgVarB = bkeVar.b(charSequence, jT, textClassification);
                ajdz ajdzVar = bkeVar.e;
                this.h = blgVarB;
                this.a = ajdzVar;
                this.b = bkeVar;
                this.c = jT;
                this.d = 1;
                if (ajdzVar.b(this) != afcrVar) {
                    blgVar = blgVarB;
                    obj2 = bkeVar;
                    j = jT;
                    obj3 = ajdzVar;
                    ((bke) obj2).g(blgVar);
                }
            }
            return afcrVar;
        }
        j = this.c;
        if (i != 1) {
            woy.dF(obj);
        } else {
            obj2 = this.b;
            Object obj4 = this.a;
            blgVar = (blg) this.h;
            woy.dF(obj);
            obj3 = obj4;
            try {
                ((bke) obj2).g(blgVar);
            } finally {
                ((ajdz) obj3).d();
            }
        }
        return new dfv(j);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bkd) b(a$$ExternalSyntheticApiModelOutline0.m11m(obj), (afck) obj2)).hT(afak.a);
    }
}
