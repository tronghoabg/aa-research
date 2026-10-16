package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aiv extends defpackage.afee implements defpackage.affg {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiv(defpackage.aiw aiwVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = aiwVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.aiv((defpackage.aiw) this.a, afdkVar, 0);
            case 1:
                return new defpackage.aiv((defpackage.aiw) this.a, afdkVar, 1, (byte[]) null);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.aiv((defpackage.apq) this.a, afdkVar, 2);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.aiv((defpackage.apq) this.a, afdkVar, 3, (byte[]) null);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.aiv((defpackage.apq) this.a, afdkVar, 4, (char[]) null);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new defpackage.aiv((defpackage.apq) this.a, afdkVar, 5, (short[]) null);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.aiv((defpackage.apq) this.a, afdkVar, 6, (int[]) null);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.aiv((defpackage.apq) this.a, afdkVar, 7, (boolean[]) null);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.aiv((defpackage.apq) this.a, afdkVar, 8, (float[]) null);
            case 9:
                return new defpackage.aiv((defpackage.apq) this.a, afdkVar, 9, (byte[][]) null);
            default:
                return new defpackage.aiv((defpackage.bki) this.a, afdkVar, 10);
        }
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.String str;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.afga.cz(obj);
                java.lang.Object obj2 = this.a;
                defpackage.aiw aiwVar = (defpackage.aiw) obj2;
                defpackage.asf asfVar = aiwVar.f;
                if (asfVar != null) {
                    defpackage.asg asgVar = new defpackage.asg(asfVar);
                    defpackage.ask askVar = aiwVar.a;
                    if (askVar != null) {
                        ahoc.d(((defpackage.cge) obj2).N(), (defpackage.afdo) null, 0, new defpackage.ais(askVar, asgVar, (defpackage.afdk) null, 0), 3);
                    }
                    aiwVar.f = null;
                }
                return defpackage.afbk.a;
            case 1:
                defpackage.afga.cz(obj);
                java.lang.Object obj3 = this.a;
                defpackage.aiw aiwVar2 = (defpackage.aiw) obj3;
                if (aiwVar2.f == null) {
                    defpackage.asf asfVar2 = new defpackage.asf();
                    defpackage.ask askVar2 = aiwVar2.a;
                    if (askVar2 != null) {
                        ahoc.d(((defpackage.cge) obj3).N(), (defpackage.afdo) null, 0, new defpackage.ais(askVar2, asfVar2, (defpackage.afdk) null, 1), 3);
                    }
                    aiwVar2.f = asfVar2;
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.afga.cz(obj);
                ((defpackage.apq) this.a).p();
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.afga.cz(obj);
                ((defpackage.apq) this.a).q();
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.afga.cz(obj);
                ((defpackage.apq) this.a).q();
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.afga.cz(obj);
                ((defpackage.apq) this.a).p();
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.afga.cz(obj);
                ((defpackage.apq) this.a).q();
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.afga.cz(obj);
                ((defpackage.apq) this.a).q();
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.afga.cz(obj);
                ((defpackage.apq) this.a).p();
                return defpackage.afbk.a;
            case 9:
                defpackage.afga.cz(obj);
                ((defpackage.apq) this.a).q();
                return defpackage.afbk.a;
            default:
                defpackage.afga.cz(obj);
                defpackage.bki bkiVar = (defpackage.bki) this.a;
                android.content.Context context = bkiVar.a;
                defpackage.bkm bkmVar = bkiVar.b;
                android.view.textclassifier.TextClassificationManager textClassificationManagerM = a$.ExternalSyntheticApiModelOutline1.m(context.getSystemService(a$.ExternalSyntheticApiModelOutline1.m()));
                int iOrdinal = bkmVar.ordinal();
                if (iOrdinal == 0) {
                    str = "edittext";
                } else {
                    if (iOrdinal != 1) {
                        throw new defpackage.afas();
                    }
                    str = "textview";
                }
                android.view.textclassifier.TextClassifier textClassifierM = hh$.ExternalSyntheticApiModelOutline0.m(textClassificationManagerM, hh$.ExternalSyntheticApiModelOutline0.m(new android.view.textclassifier.TextClassificationContext.Builder(context.getPackageName(), str)));
                bkiVar.c = textClassifierM;
                return textClassifierM;
        }
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return ((defpackage.aiv) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 1:
                return ((defpackage.aiv) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((defpackage.aiv) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.aiv) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.aiv) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.aiv) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.aiv) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.aiv) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.aiv) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 9:
                return ((defpackage.aiv) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            default:
                return ((defpackage.aiv) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiv(defpackage.aiw aiwVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.b = i;
        this.a = aiwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiv(defpackage.apq apqVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = apqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiv(defpackage.apq apqVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.b = i;
        this.a = apqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiv(defpackage.apq apqVar, defpackage.afdk afdkVar, int i, char[] cArr) {
        super(2, afdkVar);
        this.b = i;
        this.a = apqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiv(defpackage.apq apqVar, defpackage.afdk afdkVar, int i, float[] fArr) {
        super(2, afdkVar);
        this.b = i;
        this.a = apqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiv(defpackage.apq apqVar, defpackage.afdk afdkVar, int i, int[] iArr) {
        super(2, afdkVar);
        this.b = i;
        this.a = apqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiv(defpackage.apq apqVar, defpackage.afdk afdkVar, int i, short[] sArr) {
        super(2, afdkVar);
        this.b = i;
        this.a = apqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiv(defpackage.apq apqVar, defpackage.afdk afdkVar, int i, boolean[] zArr) {
        super(2, afdkVar);
        this.b = i;
        this.a = apqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiv(defpackage.apq apqVar, defpackage.afdk afdkVar, int i, byte[][] bArr) {
        super(2, afdkVar);
        this.b = i;
        this.a = apqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiv(defpackage.bki bkiVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = bkiVar;
    }
}
