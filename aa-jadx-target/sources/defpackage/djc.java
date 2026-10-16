package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class djc {
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public defpackage.dkd h;
    public defpackage.dga i;
    public defpackage.djv j;
    public defpackage.cjj l;
    public defpackage.cjj m;
    private final defpackage.cqp n;
    private final defpackage.ngb r;
    public final java.lang.Object a = new java.lang.Object();
    public defpackage.affc k = defpackage.aza.d;
    private final android.view.inputmethod.CursorAnchorInfo.Builder o = new android.view.inputmethod.CursorAnchorInfo.Builder();
    private final float[] p = defpackage.ckq.e();
    private final android.graphics.Matrix q = new android.graphics.Matrix();

    public djc(defpackage.cqp cqpVar, defpackage.ngb ngbVar) {
        this.n = cqpVar;
        this.r = ngbVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0163  */
    /* JADX WARN: Code duplicated, block: B:69:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a() throws java.io.IOException {
        boolean z;
        defpackage.ngb ngbVar;
        int iMin;
        int iMax;
        boolean z2;
        int i;
        boolean z3;
        defpackage.ngb ngbVar2 = this.r;
        android.view.inputmethod.InputMethodManager inputMethodManagerP = ngbVar2.p();
        android.view.View view = (android.view.View) ngbVar2.c;
        if (inputMethodManagerP.isActive(view)) {
            defpackage.affc affcVar = this.k;
            float[] fArr = this.p;
            affcVar.invoke(new defpackage.ckq(fArr));
            this.n.k(fArr);
            android.graphics.Matrix matrix = this.q;
            defpackage.bzo.q(matrix, fArr);
            android.view.inputmethod.CursorAnchorInfo.Builder builder = this.o;
            defpackage.dkd dkdVar = this.h;
            dkdVar.getClass();
            defpackage.djv djvVar = this.j;
            djvVar.getClass();
            defpackage.dga dgaVar = this.i;
            dgaVar.getClass();
            defpackage.cjj cjjVar = this.l;
            cjjVar.getClass();
            defpackage.cjj cjjVar2 = this.m;
            cjjVar2.getClass();
            boolean z4 = this.d;
            boolean z5 = this.e;
            boolean z6 = this.f;
            boolean z7 = this.g;
            builder.reset();
            builder.setMatrix(matrix);
            long j = dkdVar.b;
            long j2 = defpackage.dgc.a;
            int i2 = (int) (j >> 32);
            int i3 = (int) (j & 4294967295L);
            int iMin2 = java.lang.Math.min(i2, i3);
            builder.setSelectionRange(iMin2, java.lang.Math.max(i2, i3));
            if (!z4 || iMin2 < 0) {
                z = z7;
            } else {
                int iA = djvVar.a(iMin2);
                defpackage.cjj cjjVarM = dgaVar.m(iA);
                float fD = defpackage.afqt.d(cjjVarM.b, 0.0f, (int) (dgaVar.c >> 32));
                float f = cjjVarM.c;
                boolean zR = defpackage.day.r(cjjVar, fD, f);
                float f2 = cjjVarM.e;
                boolean zR2 = defpackage.day.r(cjjVar, fD, f2);
                int iP = dgaVar.p(iA);
                int i4 = 1;
                if (!zR && !zR2) {
                    i4 = 0;
                }
                if (!zR || !zR2) {
                    i4 |= 2;
                }
                if (iP == 2) {
                    i4 |= 4;
                }
                z = z7;
                builder.setInsertionMarkerLocation(fD, f, f2, f2, i4);
            }
            if (z5) {
                defpackage.dgc dgcVar = dkdVar.c;
                if (dgcVar != null) {
                    long j3 = dgcVar.b;
                    iMin = java.lang.Math.min((int) (j3 >> 32), (int) (j3 & 4294967295L));
                } else {
                    iMin = -1;
                }
                if (dgcVar != null) {
                    long j4 = dgcVar.b;
                    iMax = java.lang.Math.max((int) (j4 >> 32), (int) (j4 & 4294967295L));
                } else {
                    iMax = -1;
                }
                if (iMin >= 0 && iMin < iMax) {
                    builder.setComposingText(iMin, dkdVar.a().subSequence(iMin, iMax));
                    int iA2 = djvVar.a(iMin);
                    int iA3 = djvVar.a(iMax);
                    float[] fArr2 = new float[(iA3 - iA2) * 4];
                    dgaVar.b.l(defpackage.dax.g(iA2, iA3), fArr2);
                    int i5 = iMin;
                    while (i5 < iMax) {
                        int iA4 = djvVar.a(i5);
                        int i6 = (iA4 - iA2) * 4;
                        defpackage.ngb ngbVar3 = ngbVar2;
                        int i7 = iMax;
                        defpackage.cjj cjjVar3 = new defpackage.cjj(fArr2[i6], fArr2[i6 + 1], fArr2[i6 + 2], fArr2[i6 + 3]);
                        boolean zI = cjjVar.i(cjjVar3);
                        float[] fArr3 = fArr2;
                        float f3 = cjjVar3.b;
                        float f4 = cjjVar3.c;
                        if (defpackage.day.r(cjjVar, f3, f4)) {
                            z3 = zI;
                            if (defpackage.day.r(cjjVar, cjjVar3.d, cjjVar3.e)) {
                                z2 = z3;
                                i = z3 ? 1 : 0;
                            }
                            if (dgaVar.p(iA4) == 2) {
                                i = (i == true ? 1 : 0) | 4;
                            }
                            builder.addCharacterBounds(i5, f3, f4, cjjVar3.d, cjjVar3.e, i == true ? 1 : 0);
                            i5++;
                            fArr2 = fArr3;
                            ngbVar2 = ngbVar3;
                            iMax = i7;
                        } else {
                            z2 = zI;
                        }
                        z2 = z3;
                        i = z2 | 2;
                        if (dgaVar.p(iA4) == 2) {
                            i = (i == true ? 1 : 0) | 4;
                        }
                        builder.addCharacterBounds(i5, f3, f4, cjjVar3.d, cjjVar3.e, i == true ? 1 : 0);
                        i5++;
                        fArr2 = fArr3;
                        ngbVar2 = ngbVar3;
                        iMax = i7;
                    }
                }
                ngbVar = ngbVar2;
            } else {
                ngbVar = ngbVar2;
                z = z;
            }
            if (android.os.Build.VERSION.SDK_INT >= 33 && z6) {
                ag$.ExternalSyntheticApiModelOutline0.m(builder, ag$.ExternalSyntheticApiModelOutline0.m(ag$.ExternalSyntheticApiModelOutline0.m$1(ag$.ExternalSyntheticApiModelOutline0.m(new android.view.inputmethod.EditorBoundsInfo.Builder(), defpackage.ckn.c(cjjVar2)), defpackage.ckn.c(cjjVar2))));
            }
            if (android.os.Build.VERSION.SDK_INT >= 34 && z && !cjjVar.h()) {
                int iE = dgaVar.e() - 1;
                if (iE < 0) {
                    iE = 0;
                }
                int iG = defpackage.afqt.g(dgaVar.h(cjjVar.c), 0, iE);
                int iG2 = defpackage.afqt.g(dgaVar.h(cjjVar.e), 0, iE);
                if (iG <= iG2) {
                    while (true) {
                        axd$.ExternalSyntheticApiModelOutline0.m(builder, dgaVar.b(iG), dgaVar.d(iG), dgaVar.c(iG), dgaVar.a(iG));
                        if (iG == iG2) {
                            break;
                        } else {
                            iG++;
                        }
                    }
                }
            }
            ngbVar.p().updateCursorAnchorInfo(view, builder.build());
            this.c = false;
        }
    }
}
