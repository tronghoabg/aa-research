package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bkg extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.bki d;
    final /* synthetic */ defpackage.affg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkg(defpackage.bki bkiVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.d = bkiVar;
        this.e = affgVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.bkg(this.d, this.e, afdkVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008e A[RETURN] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.bki bkiVar;
        ajey ajeyVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        android.view.textclassifier.TextClassifier textClassifierM;
        java.lang.Object obj5;
        java.lang.Object objC;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.c;
        try {
            if (i == 0) {
                defpackage.afga.cz(obj);
                bkiVar = this.d;
                ajeyVar = bkiVar.e;
                this.a = ajeyVar;
                this.b = bkiVar;
                this.c = 1;
                if (ajeyVar.b(this) != afdrVar) {
                }
                obj3 = bkiVar;
                obj2 = ajeyVar;
                return afdrVar;
            }
            if (i != 1) {
                if (i != 2) {
                    defpackage.afga.cz(obj);
                    return obj;
                }
                obj4 = this.a;
                try {
                    defpackage.afga.cz(obj);
                    obj4 = obj4;
                    textClassifierM = a$.ExternalSyntheticApiModelOutline1.m(obj);
                    obj5 = obj4;
                    obj5 = obj2;
                    ((ajey) obj5).d();
                    long j = aitq.a;
                    long jF = agac.f(200L, aits.c);
                    defpackage.bkf bkfVar = new defpackage.bkf(textClassifierM, this.e, null);
                    this.a = null;
                    this.b = null;
                    this.c = 3;
                    objC = aibv.c(jF, bkfVar, this);
                    if (objC != afdrVar) {
                        return objC;
                    }
                    obj3 = bkiVar;
                    obj2 = ajeyVar;
                    return afdrVar;
                } catch (java.lang.Throwable th) {
                    th = th;
                    ((ajey) obj4).d();
                    throw th;
                }
            }
            java.lang.Object obj6 = this.b;
            java.lang.Object obj7 = this.a;
            defpackage.afga.cz(obj);
            obj2 = obj7;
            obj3 = obj6;
            obj3 = bkiVar;
            obj2 = ajeyVar;
            textClassifierM = ((defpackage.bki) obj3).c;
            if (textClassifierM == null || hh$.ExternalSyntheticApiModelOutline0.m(textClassifierM)) {
                obj5 = obj2;
                long j2 = aitq.a;
                long jF2 = agac.f(300L, aits.c);
                defpackage.aiv aivVar = new defpackage.aiv((defpackage.bki) obj3, (defpackage.afdk) null, 10);
                this.a = obj2;
                this.b = null;
                this.c = 2;
                java.lang.Object objC2 = aibv.c(jF2, aivVar, this);
                if (objC2 != afdrVar) {
                    obj4 = obj2;
                    obj = objC2;
                    textClassifierM = a$.ExternalSyntheticApiModelOutline1.m(obj);
                    obj5 = obj4;
                    obj5 = obj2;
                    ((ajey) obj5).d();
                    long j3 = aitq.a;
                    long jF3 = agac.f(200L, aits.c);
                    defpackage.bkf bkfVar2 = new defpackage.bkf(textClassifierM, this.e, null);
                    this.a = null;
                    this.b = null;
                    this.c = 3;
                    objC = aibv.c(jF3, bkfVar2, this);
                    if (objC != afdrVar) {
                        return objC;
                    }
                }
            } else {
                obj5 = obj2;
                ((ajey) obj5).d();
                long j4 = aitq.a;
                long jF4 = agac.f(200L, aits.c);
                defpackage.bkf bkfVar3 = new defpackage.bkf(textClassifierM, this.e, null);
                this.a = null;
                this.b = null;
                this.c = 3;
                objC = aibv.c(jF4, bkfVar3, this);
                if (objC != afdrVar) {
                    return objC;
                }
            }
            obj3 = bkiVar;
            obj2 = ajeyVar;
            return afdrVar;
        } catch (java.lang.Throwable th2) {
            th = th2;
            obj4 = obj2;
            ((ajey) obj4).d();
            throw th;
        }
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bkg) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
