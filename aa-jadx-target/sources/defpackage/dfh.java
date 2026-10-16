package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class dfh implements defpackage.affc {
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ dfh(long j, float[] fArr, defpackage.afgt afgtVar, afgs afgsVar, int i) {
        this.e = i;
        this.a = j;
        this.b = fArr;
        this.c = afgtVar;
        this.d = afgsVar;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z;
        defpackage.dgp dgpVar;
        float fA;
        float fA2;
        if (this.e != 0) {
            defpackage.cxn cxnVar = (defpackage.cxn) obj;
            cxnVar.q();
            defpackage.izq izqVar = cxnVar.r().c;
            defpackage.cjj cjjVar = (defpackage.cjj) this.d;
            float f = cjjVar.b;
            float f2 = cjjVar.c;
            izqVar.l(f, f2);
            float f3 = -f2;
            float f4 = -f;
            try {
                defpackage.dai.V(cxnVar, (defpackage.cjr) ((defpackage.afgv) this.b).a, 0L, this.a, 0L, 0.0f, (defpackage.cke) this.c, 0, 890);
                return defpackage.afbk.a;
            } finally {
                cxnVar.r().c.l(f4, f3);
            }
        }
        defpackage.dfk dfkVar = (defpackage.dfk) obj;
        int iMin = dfkVar.a;
        long j = this.a;
        long j2 = defpackage.dgc.a;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (iMin <= java.lang.Math.min(i, i2)) {
            iMin = java.lang.Math.min(i, i2);
        }
        int iMax = dfkVar.b;
        if (iMax >= java.lang.Math.max(i, i2)) {
            iMax = java.lang.Math.max(i, i2);
        }
        java.lang.Object obj2 = this.c;
        long jG = defpackage.dax.g(dfkVar.e(iMin), dfkVar.e(iMax));
        defpackage.deu deuVar = dfkVar.g;
        defpackage.dgp dgpVar2 = deuVar.b;
        defpackage.afgt afgtVar = (defpackage.afgt) obj2;
        int i3 = afgtVar.a;
        int i4 = (int) (jG >> 32);
        int i5 = (int) (4294967295L & jG);
        int iMin2 = java.lang.Math.min(i4, i5);
        int iMax2 = java.lang.Math.max(i4, i5);
        int length = dgpVar2.o().length();
        if (iMin2 < 0) {
            defpackage.dki.c("startOffset must be > 0");
        }
        if (iMin2 >= length) {
            defpackage.dki.c("startOffset must be less than text length");
        }
        if (iMax2 <= iMin2) {
            defpackage.dki.c("endOffset must be greater than startOffset");
        }
        if (iMax2 > length) {
            defpackage.dki.c("endOffset must be smaller or equal to text length");
        }
        float[] fArr = (float[]) this.b;
        if (fArr.length - i3 < (iMax2 - iMin2) * 4) {
            defpackage.dki.c("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iK = dgpVar2.k(iMin2);
        int iK2 = dgpVar2.k(iMax2 - 1);
        defpackage.lfo lfoVar = new defpackage.lfo(dgpVar2);
        if (iK <= iK2) {
            while (true) {
                int iL = dgpVar2.l(iK);
                int iJ = dgpVar2.j(iK);
                int iMax3 = java.lang.Math.max(iMin2, iL);
                int iMin3 = java.lang.Math.min(iMax2, iJ);
                float fD = dgpVar2.d(iK);
                float fB = dgpVar2.b(iK);
                int i6 = i3;
                int i7 = iMin2;
                boolean z2 = dgpVar2.m(iK) == 1;
                while (iMax3 < iMin3) {
                    int i8 = iMax3 + 1;
                    boolean zQ = dgpVar2.q(iMax3);
                    if (z2) {
                        if (zQ) {
                            z = true;
                            zQ = true;
                        } else {
                            dgpVar = dgpVar2;
                            i6 = i6;
                            z = true;
                            fA = lfoVar.a(iMax3, false, false, true);
                            fA2 = lfoVar.a(i8, true, true, true);
                        }
                        fArr[i6] = fA;
                        fArr[i6 + 1] = fD;
                        fArr[i6 + 2] = fA2;
                        fArr[i6 + 3] = fB;
                        i6 += 4;
                        iMax3 = i8;
                        dgpVar2 = dgpVar;
                    } else {
                        z = true;
                    }
                    dgpVar = dgpVar2;
                    if (z2) {
                        fA2 = lfoVar.a(iMax3, false, false, false);
                        fA = lfoVar.a(i8, z, z, false);
                    } else if (zQ) {
                        fA2 = lfoVar.a(iMax3, false, false, z);
                        fA = lfoVar.a(i8, z, z, z);
                    } else {
                        fA = lfoVar.a(iMax3, false, false, false);
                        fA2 = lfoVar.a(i8, z, z, false);
                    }
                    fArr[i6] = fA;
                    fArr[i6 + 1] = fD;
                    fArr[i6 + 2] = fA2;
                    fArr[i6 + 3] = fB;
                    i6 += 4;
                    iMax3 = i8;
                    dgpVar2 = dgpVar;
                }
                defpackage.dgp dgpVar3 = dgpVar2;
                int i9 = i6;
                if (iK == iK2) {
                    break;
                }
                iK++;
                i3 = i9;
                iMin2 = i7;
                dgpVar2 = dgpVar3;
            }
        }
        int iMax4 = afgtVar.a + ((java.lang.Math.max(i4, i5) - java.lang.Math.min(i4, i5)) * 4);
        int i10 = afgtVar.a;
        while (true) {
            java.lang.Object obj3 = this.d;
            if (i10 >= iMax4) {
                afgtVar.a = iMax4;
                ((afgs) obj3).a += deuVar.d;
                return defpackage.afbk.a;
            }
            int i11 = i10 + 1;
            float f5 = fArr[i11];
            float f6 = ((afgs) obj3).a;
            fArr[i11] = f5 + f6;
            int i12 = i10 + 3;
            fArr[i12] = fArr[i12] + f6;
            i10 += 4;
        }
    }

    public /* synthetic */ dfh(defpackage.cjj cjjVar, defpackage.afgv afgvVar, long j, defpackage.cke ckeVar, int i) {
        this.e = i;
        this.d = cjjVar;
        this.b = afgvVar;
        this.a = j;
        this.c = ckeVar;
    }
}
