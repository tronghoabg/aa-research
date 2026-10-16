package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bio {
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public defpackage.dkd h;
    public defpackage.dga i;
    public defpackage.djv j;
    public defpackage.cjj k;
    public defpackage.cjj l;
    private final defpackage.affc m;
    private final defpackage.bil q;
    public final java.lang.Object a = new java.lang.Object();
    private final android.view.inputmethod.CursorAnchorInfo.Builder n = new android.view.inputmethod.CursorAnchorInfo.Builder();
    private final float[] o = defpackage.ckq.e();
    private final android.graphics.Matrix p = new android.graphics.Matrix();

    public bio(defpackage.affc affcVar, defpackage.bil bilVar) {
        this.m = affcVar;
        this.q = bilVar;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x016d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0186  */
    /* JADX WARN: Code duplicated, block: B:77:0x016f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a() throws java.io.IOException {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        defpackage.bil bilVar = this.q;
        android.view.View view = (android.view.View) bilVar.a;
        if (!bilVar.a().isActive(view) || this.h == null || this.j == null || this.i == null || this.k == null || this.l == null) {
            return;
        }
        float[] fArr = this.o;
        defpackage.ckq.c(fArr);
        this.m.invoke(new defpackage.ckq(fArr));
        defpackage.cjj cjjVar = this.l;
        cjjVar.getClass();
        float f = cjjVar.b;
        cjjVar.getClass();
        defpackage.ckq.g(fArr, -f, -cjjVar.c);
        android.graphics.Matrix matrix = this.p;
        defpackage.bzo.q(matrix, fArr);
        android.view.inputmethod.CursorAnchorInfo.Builder builder = this.n;
        defpackage.dkd dkdVar = this.h;
        dkdVar.getClass();
        defpackage.djv djvVar = this.j;
        djvVar.getClass();
        defpackage.dga dgaVar = this.i;
        dgaVar.getClass();
        defpackage.cjj cjjVar2 = this.k;
        cjjVar2.getClass();
        defpackage.cjj cjjVar3 = this.l;
        cjjVar3.getClass();
        boolean z5 = this.d;
        boolean z6 = this.e;
        boolean z7 = this.f;
        boolean z8 = this.g;
        builder.reset();
        builder.setMatrix(matrix);
        long j = dkdVar.b;
        int iD = defpackage.dgc.d(j);
        builder.setSelectionRange(iD, defpackage.dgc.c(j));
        if (!z5 || iD < 0) {
            z = z7;
        } else {
            int iA = djvVar.a(iD);
            defpackage.cjj cjjVarM = dgaVar.m(iA);
            float fD = defpackage.afqt.d(cjjVarM.b, 0.0f, (int) (dgaVar.c >> 32));
            float f2 = cjjVarM.c;
            boolean zC = defpackage.axd.C(cjjVar2, fD, f2);
            float f3 = cjjVarM.e;
            boolean zC2 = defpackage.axd.C(cjjVar2, fD, f3);
            int iP = dgaVar.p(iA);
            int i2 = 1;
            if (!zC && !zC2) {
                i2 = 0;
            }
            if (!zC || !zC2) {
                i2 |= 2;
            }
            if (iP == 2) {
                i2 |= 4;
            }
            z = z7;
            builder.setInsertionMarkerLocation(fD, f2, f3, f3, i2);
        }
        if (z6) {
            defpackage.dgc dgcVar = dkdVar.c;
            int iD2 = dgcVar != null ? defpackage.dgc.d(dgcVar.b) : -1;
            int iC = dgcVar != null ? defpackage.dgc.c(dgcVar.b) : -1;
            if (iD2 >= 0 && iD2 < iC) {
                builder.setComposingText(iD2, dkdVar.a().subSequence(iD2, iC));
                int iA2 = djvVar.a(iD2);
                int iA3 = djvVar.a(iC);
                float[] fArr2 = new float[(iA3 - iA2) * 4];
                dgaVar.b.l(defpackage.dax.g(iA2, iA3), fArr2);
                while (iD2 < iC) {
                    int iA4 = djvVar.a(iD2);
                    int i3 = (iA4 - iA2) * 4;
                    int i4 = iA2;
                    defpackage.cjj cjjVar4 = new defpackage.cjj(fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3]);
                    boolean zI = cjjVar2.i(cjjVar4);
                    int i5 = iC;
                    int i6 = iD2;
                    float f4 = cjjVar4.b;
                    float f5 = cjjVar4.c;
                    if (defpackage.axd.C(cjjVar2, f4, f5)) {
                        z4 = zI;
                        if (defpackage.axd.C(cjjVar2, cjjVar4.d, cjjVar4.e)) {
                            z3 = z4;
                            i = z4 ? 1 : 0;
                        }
                        if (dgaVar.p(iA4) == 2) {
                            i = (i == true ? 1 : 0) | 4;
                        }
                        builder.addCharacterBounds(i6, f4, f5, cjjVar4.d, cjjVar4.e, i == true ? 1 : 0);
                        iD2 = i6 + 1;
                        fArr2 = fArr2;
                        iC = i5;
                        iA2 = i4;
                    } else {
                        z3 = zI;
                    }
                    z3 = z4;
                    i = z3 | 2;
                    if (dgaVar.p(iA4) == 2) {
                        i = (i == true ? 1 : 0) | 4;
                    }
                    builder.addCharacterBounds(i6, f4, f5, cjjVar4.d, cjjVar4.e, i == true ? 1 : 0);
                    iD2 = i6 + 1;
                    fArr2 = fArr2;
                    iC = i5;
                    iA2 = i4;
                }
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 33 && z) {
            ag$.ExternalSyntheticApiModelOutline0.m(builder, ag$.ExternalSyntheticApiModelOutline0.m(ag$.ExternalSyntheticApiModelOutline0.m$1(ag$.ExternalSyntheticApiModelOutline0.m(new android.view.inputmethod.EditorBoundsInfo.Builder(), defpackage.ckn.c(cjjVar3)), defpackage.ckn.c(cjjVar3))));
        }
        if (android.os.Build.VERSION.SDK_INT >= 34 && z8 && !cjjVar2.h()) {
            z2 = false;
            int iE = defpackage.afqt.e(dgaVar.e() - 1, 0);
            int iG = defpackage.afqt.g(dgaVar.h(cjjVar2.c), 0, iE);
            int iG2 = defpackage.afqt.g(dgaVar.h(cjjVar2.e), 0, iE);
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
        } else {
            z2 = false;
        }
        bilVar.a().updateCursorAnchorInfo(view, builder.build());
        this.c = z2;
    }
}
