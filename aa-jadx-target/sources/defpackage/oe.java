package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class oe implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public oe(defpackage.agn agnVar, int i) {
        this.b = i;
        this.a = agnVar;
    }

    /* JADX WARN: Type inference failed for: r9v27, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v43, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v46, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v49, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v52, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v55, types: [cwu, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        defpackage.afer aferVar;
        defpackage.bvk bvkVar;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.bil(new defpackage.ku(this.a, 10, null));
            case 1:
                defpackage.exc excVar = new defpackage.exc();
                ((defpackage.of) this.a).r().aa().s(excVar);
                return excVar;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((defpackage.agn) this.a).g();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.agn) this.a).g();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.agn) this.a).g();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int i = bmn.a;
                return new defpackage.cli(((defpackage.cli) ((btb) this.a).a.a()).a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.agn) this.a).g();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.agn) this.a).g();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aeu aeuVar = bpf.a;
                float fFloatValue = ((java.lang.Number) this.a.invoke()).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                return java.lang.Float.valueOf(fFloatValue);
            case 9:
                bqp bqpVar = (bqp) this.a;
                if (!bqpVar.k() && (aferVar = bqpVar.a) != null) {
                    aferVar.invoke();
                }
                return defpackage.afbk.a;
            case 10:
                return ((defpackage.agn) this.a).g();
            case 11:
                ?? r9 = this.a;
                defpackage.aej aejVar = bsj.a;
                return java.lang.Float.valueOf(((java.lang.Number) r9.a()).floatValue());
            case 12:
                ?? r10 = this.a;
                defpackage.aej aejVar2 = bsj.a;
                return java.lang.Float.valueOf(((java.lang.Number) r10.a()).floatValue());
            case 13:
                ?? r11 = this.a;
                defpackage.aej aejVar3 = bsj.a;
                return java.lang.Float.valueOf(((java.lang.Number) r11.a()).floatValue());
            case 14:
                ?? r12 = this.a;
                defpackage.aej aejVar4 = bsj.a;
                return java.lang.Float.valueOf(((java.lang.Number) r12.a()).floatValue());
            case 15:
                defpackage.dai.G(this.a);
                return defpackage.afbk.a;
            case 16:
                ((defpackage.cjc) this.a).b();
                return defpackage.afbk.a;
            case 17:
                return ((defpackage.tu) this.a).d;
            case 18:
                return ((defpackage.cqi) this.a).g();
            case 19:
                defpackage.ctl ctlVar = (defpackage.ctl) this.a;
                if (!ctlVar.a() && (bvkVar = ctlVar.g) != null) {
                    bvkVar.n();
                }
                return defpackage.afbk.a;
            default:
                defpackage.cvz cvzVar = (defpackage.cvz) this.a;
                cvzVar.a = false;
                java.util.HashSet hashSet = new java.util.HashSet();
                defpackage.aan aanVar = cvzVar.d;
                if (aanVar != null) {
                    java.lang.Object[] objArr = aanVar.a;
                    int i2 = aanVar.b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        defpackage.cxl cxlVar = (defpackage.cxl) objArr[i3];
                        defpackage.cjv cjvVar = (defpackage.cjv) cvzVar.d().c(i3);
                        defpackage.cge cgeVar = cxlVar.v.f;
                        if (cgeVar.A) {
                            defpackage.cvz.e(cgeVar, cjvVar, hashSet);
                        }
                    }
                    aanVar.k();
                    defpackage.aan aanVar2 = cvzVar.e;
                    if (aanVar2 != null) {
                        aanVar2.k();
                    }
                }
                defpackage.aan aanVar3 = cvzVar.b;
                if (aanVar3 != null) {
                    java.lang.Object[] objArr2 = aanVar3.a;
                    int i4 = aanVar3.b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        defpackage.cwi cwiVar = (defpackage.cwi) objArr2[i5];
                        defpackage.cjv cjvVar2 = (defpackage.cjv) cvzVar.c().c(i5);
                        if (cwiVar.A) {
                            defpackage.cvz.e(cwiVar, cjvVar2, hashSet);
                        }
                    }
                    aanVar3.k();
                    defpackage.aan aanVar4 = cvzVar.c;
                    if (aanVar4 != null) {
                        aanVar4.k();
                    }
                }
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((defpackage.cwi) it.next()).v();
                }
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ oe(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
