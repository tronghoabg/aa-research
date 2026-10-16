package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bkh extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    java.lang.Object b;
    long c;
    int d;
    final /* synthetic */ java.lang.CharSequence e;
    final /* synthetic */ long f;
    final /* synthetic */ defpackage.bki g;
    private /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkh(java.lang.CharSequence charSequence, long j, defpackage.bki bkiVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.e = charSequence;
        this.f = j;
        this.g = bkiVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.bkh bkhVar = new defpackage.bkh(this.e, this.f, this.g, afdkVar);
        bkhVar.h = obj;
        return bkhVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        long j;
        defpackage.bll bllVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.d;
        if (i == 0) {
            defpackage.afga.cz(obj);
            android.view.textclassifier.TextClassifier textClassifierM = a$.ExternalSyntheticApiModelOutline1.m(this.h);
            java.lang.CharSequence charSequence = this.e;
            long j2 = this.f;
            android.view.textclassifier.TextSelection.Request.Builder builder = new android.view.textclassifier.TextSelection.Request.Builder(charSequence, defpackage.dgc.d(j2), defpackage.dgc.c(j2));
            defpackage.bki bkiVar = this.g;
            android.view.textclassifier.TextSelection.Request.Builder builderM = hh$.ExternalSyntheticApiModelOutline0.m(builder, bkiVar.a());
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                a$.ExternalSyntheticApiModelOutline0.m(builderM, true);
            }
            android.view.textclassifier.TextSelection textSelectionM = hh$.ExternalSyntheticApiModelOutline0.m(textClassifierM, hh$.ExternalSyntheticApiModelOutline0.m(builderM));
            long jG = defpackage.dax.g(a$.ExternalSyntheticApiModelOutline1.m(textSelectionM), a$.ExternalSyntheticApiModelOutline1.m$1(textSelectionM));
            if (android.os.Build.VERSION.SDK_INT < 31 || a$.ExternalSyntheticApiModelOutline0.m(textSelectionM) == null) {
                defpackage.bki bkiVar2 = this.g;
                java.lang.CharSequence charSequence2 = this.e;
                this.c = jG;
                this.d = 2;
                if (bkiVar2.d(charSequence2, jG, textClassifierM, this) != afdrVar) {
                    j = jG;
                }
            } else {
                android.view.textclassifier.TextClassification textClassificationM = a$.ExternalSyntheticApiModelOutline0.m(textSelectionM);
                textClassificationM.getClass();
                defpackage.bll bllVarB = bkiVar.b(charSequence, jG, textClassificationM);
                ajey ajeyVar = bkiVar.e;
                this.h = bllVarB;
                this.a = ajeyVar;
                this.b = bkiVar;
                this.c = jG;
                this.d = 1;
                if (ajeyVar.b(this) != afdrVar) {
                    bllVar = bllVarB;
                    obj2 = bkiVar;
                    j = jG;
                    obj3 = ajeyVar;
                    ((defpackage.bki) obj2).g(bllVar);
                }
            }
            return afdrVar;
        }
        j = this.c;
        if (i != 1) {
            defpackage.afga.cz(obj);
        } else {
            obj2 = this.b;
            java.lang.Object obj4 = this.a;
            bllVar = (defpackage.bll) this.h;
            defpackage.afga.cz(obj);
            obj3 = obj4;
            try {
                ((defpackage.bki) obj2).g(bllVar);
            } finally {
                ((ajey) obj3).d();
            }
        }
        return new defpackage.dgc(j);
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bkh) b(a$.ExternalSyntheticApiModelOutline1.m(obj), (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
