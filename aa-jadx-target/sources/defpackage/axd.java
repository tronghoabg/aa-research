package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class axd {
    public static defpackage.ckc a;
    public static defpackage.cmj b;
    public static defpackage.cjr c;

    public static final int A(long j, boolean z, int i, float f) {
        int iB = Integer.MAX_VALUE;
        if ((z || B(i)) && defpackage.dlm.h(j)) {
            iB = defpackage.dlm.b(j);
        }
        if (defpackage.dlm.d(j) == iB) {
            return iB;
        }
        return defpackage.afqt.g(java.lang.Math.round((float) java.lang.Math.ceil(f)), defpackage.dlm.d(j), iB);
    }

    public static final boolean B(int i) {
        return i == 2 || i == 4;
    }

    public static final boolean C(defpackage.cjj cjjVar, float f, float f2) {
        if (f > cjjVar.d || cjjVar.b > f) {
            return false;
        }
        return f2 <= cjjVar.e && cjjVar.c <= f2;
    }

    public static final int D(defpackage.dfi dfiVar, long j, defpackage.dck dckVar) {
        float fA = dckVar != null ? dckVar.a() : 0.0f;
        int i = (int) (4294967295L & j);
        int iE = dfiVar.e(java.lang.Float.intBitsToFloat(i));
        if (java.lang.Float.intBitsToFloat(i) >= dfiVar.b(iE) - fA && java.lang.Float.intBitsToFloat(i) <= dfiVar.a(iE) + fA) {
            int i2 = (int) (j >> 32);
            if (java.lang.Float.intBitsToFloat(i2) >= (-fA)) {
                if (java.lang.Float.intBitsToFloat(i2) <= dfiVar.d + fA) {
                    return iE;
                }
            }
        }
        return -1;
    }

    public static final int E(defpackage.beg begVar, long j, defpackage.dck dckVar) {
        defpackage.ctc ctcVarF;
        long jM;
        defpackage.dfi dfiVar;
        int iD;
        defpackage.bfi bfiVarE = begVar.e();
        if (bfiVarE == null || (ctcVarF = begVar.f()) == null || (iD = D((dfiVar = bfiVarE.a.b), (jM = ctcVarF.m(j)), dckVar)) == -1) {
            return -1;
        }
        return dfiVar.f(defpackage.cji.e(jM, (dfiVar.b(iD) + dfiVar.a(iD)) / 2.0f, 1));
    }

    public static final long F(defpackage.beg begVar, defpackage.cjj cjjVar, int i, defpackage.dfy dfyVar) {
        defpackage.bfi bfiVarE = begVar.e();
        defpackage.dfi dfiVar = bfiVarE != null ? bfiVarE.a.b : null;
        defpackage.ctc ctcVarF = begVar.f();
        return (dfiVar == null || ctcVarF == null) ? defpackage.dgc.a : dfiVar.g(cjjVar.f(ctcVarF.m(0L)), i, dfyVar);
    }

    public static final long G(defpackage.beg begVar, defpackage.cjj cjjVar, defpackage.cjj cjjVar2, int i, defpackage.dfy dfyVar) {
        long jF = F(begVar, cjjVar, i, dfyVar);
        if (defpackage.dgc.i(jF)) {
            return defpackage.dgc.a;
        }
        long jF2 = F(begVar, cjjVar2, i, dfyVar);
        if (defpackage.dgc.i(jF2)) {
            return defpackage.dgc.a;
        }
        return defpackage.dax.g(java.lang.Math.min(defpackage.dgc.e(jF), defpackage.dgc.e(jF)), java.lang.Math.max(defpackage.dgc.a(jF2), defpackage.dgc.a(jF2)));
    }

    public static final long H(android.graphics.PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final boolean I(defpackage.dga dgaVar, int i) {
        int iG = dgaVar.g(i);
        if (i == dgaVar.i(iG) || i == dgaVar.f(iG, false)) {
            return dgaVar.q(i) != dgaVar.p(i);
        }
        return dgaVar.p(i) != dgaVar.p(i + (-1));
    }

    public static final boolean J(int i) {
        return java.lang.Character.isWhitespace(i) || i == 160;
    }

    public static final boolean K(int i) {
        int type;
        return (!J(i) || (type = java.lang.Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static final defpackage.biv L(defpackage.biv bivVar, defpackage.dlz dlzVar, defpackage.dgd dgdVar, defpackage.dlo dloVar, defpackage.wde wdeVar) {
        return (bivVar != null && dlzVar == bivVar.a && defpackage.afga.f(defpackage.dax.f(dgdVar, dlzVar), bivVar.b) && dloVar.a() == ((defpackage.dlp) bivVar.c).a && wdeVar == bivVar.d) ? bivVar : new defpackage.biv(dlzVar, defpackage.dax.f(dgdVar, dlzVar), new defpackage.dlp(dloVar.a(), dloVar.b()), wdeVar);
    }

    public static final int M(android.view.inputmethod.HandwritingGesture handwritingGesture, defpackage.affc affcVar) {
        java.lang.String strM = axd$.ExternalSyntheticApiModelOutline0.m(handwritingGesture);
        if (strM == null) {
            return 3;
        }
        affcVar.invoke(new defpackage.djb(strM, 1));
        return 5;
    }

    public static final void N(long j, defpackage.dfb dfbVar, boolean z, defpackage.affc affcVar) {
        if (z) {
            int iE = defpackage.dgc.e(j);
            int iA = defpackage.dgc.a(j);
            int iCodePointBefore = iE > 0 ? java.lang.Character.codePointBefore(dfbVar, iE) : 10;
            int iCodePointAt = iA < dfbVar.a() ? java.lang.Character.codePointAt(dfbVar, iA) : 10;
            if (K(iCodePointBefore) && (J(iCodePointAt) || defpackage.acmj.q(iCodePointAt))) {
                do {
                    iE -= java.lang.Character.charCount(iCodePointBefore);
                    if (iE == 0) {
                        break;
                    } else {
                        iCodePointBefore = java.lang.Character.codePointBefore(dfbVar, iE);
                    }
                } while (K(iCodePointBefore));
                j = defpackage.dax.g(iE, iA);
            } else if (K(iCodePointAt) && (J(iCodePointBefore) || defpackage.acmj.q(iCodePointBefore))) {
                do {
                    iA += java.lang.Character.charCount(iCodePointAt);
                    if (iA == dfbVar.a()) {
                        break;
                    } else {
                        iCodePointAt = java.lang.Character.codePointAt(dfbVar, iA);
                    }
                } while (K(iCodePointAt));
                j = defpackage.dax.g(iE, iA);
            }
        }
        affcVar.invoke(new defpackage.bik(new defpackage.djg[]{new defpackage.dkc(defpackage.dgc.a(j), defpackage.dgc.a(j)), new defpackage.dje(defpackage.dgc.b(j), 0)}));
    }

    public static final void O(int i, java.lang.String str, defpackage.affc affcVar) {
        affcVar.invoke(new defpackage.bik(new defpackage.djg[]{new defpackage.dkc(i, i), new defpackage.djb(str, 1)}));
    }

    public static final void P(long j, defpackage.blw blwVar, defpackage.affc affcVar) {
        affcVar.invoke(new defpackage.dkc(defpackage.dgc.e(j), defpackage.dgc.a(j)));
        if (blwVar != null) {
            blwVar.j(true);
        }
    }

    public static final int Q(int i) {
        return i != 1 ? 0 : 1;
    }

    public static final defpackage.bhp R(defpackage.affj affjVar, defpackage.bve bveVar, int i) {
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !bveVar.C(affjVar)) && (i & 6) != 4) {
            z = false;
        }
        defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
        java.lang.Object objS = bwcVar.S();
        if (z || objS == defpackage.bvd.a) {
            objS = new defpackage.bhp(affjVar);
            bwcVar.ad(objS);
        }
        defpackage.bhp bhpVar = (defpackage.bhp) objS;
        boolean zC = bveVar.C(bhpVar);
        java.lang.Object objS2 = bwcVar.S();
        if (zC || objS2 == defpackage.bvd.a) {
            objS2 = new defpackage.bge(bhpVar, 10);
            bwcVar.ad(objS2);
        }
        defpackage.bvx.c(bhpVar, (defpackage.affc) objS2, bveVar);
        return bhpVar;
    }

    public static final void S(defpackage.cgf cgfVar, defpackage.bvm bvmVar, defpackage.affj affjVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-714464401);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(bvmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(affjVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 1024 : 2048;
        }
        if (bveVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.b);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            defpackage.bhp bhpVarR = R(affjVar, bveVarC, (i2 >> 6) & 14);
            defpackage.dai.aA(bvmVar.b(bhpVarR), defpackage.dai.as(274270255, true, new defpackage.bhq(cgfVar, (defpackage.bwx) objS, affgVar, bhpVarR, 0), bveVarC), bveVarC, 56);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.bhr(cgfVar, bvmVar, affjVar, affgVar, i, 0);
        }
    }

    public static final defpackage.bfx T(defpackage.cwn cwnVar) {
        defpackage.bil bilVar = new defpackage.bil((char[]) null);
        defpackage.dai.o(cwnVar, defpackage.bhf.a, new defpackage.bge(new defpackage.bge(bilVar, 9), 8));
        defpackage.aan aanVar = new defpackage.aan(16);
        defpackage.aan aanVar2 = (defpackage.aan) bilVar.b;
        java.lang.Object[] objArr = aanVar2.a;
        int i = aanVar2.b;
        defpackage.bfw bfwVar = null;
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.bfw bfwVar2 = (defpackage.bfw) objArr[i2];
            if (z && bfwVar2 == defpackage.bga.b) {
                z = true;
            } else if (defpackage.asq.N(bfwVar2) && defpackage.asq.N(bfwVar)) {
                z = false;
            } else {
                if (!defpackage.asq.N(bfwVar2)) {
                    defpackage.aan aanVar3 = (defpackage.aan) bilVar.a;
                    java.lang.Object[] objArr2 = aanVar3.a;
                    int i3 = aanVar3.b;
                    int i4 = 0;
                    while (true) {
                        if (i4 < i3) {
                            if (((java.lang.Boolean) ((defpackage.affc) objArr2[i4]).invoke(bfwVar2)).booleanValue()) {
                                i4++;
                            } else {
                                z = false;
                            }
                        }
                    }
                }
                aanVar.p(bfwVar2);
                z = false;
                bfwVar = bfwVar2;
            }
        }
        if (defpackage.asq.N((defpackage.bfw) (aanVar.f() ? null : aanVar.a[aanVar.b - 1]))) {
            aanVar.h(aanVar.b - 1);
        }
        return new defpackage.bfx(aanVar.j());
    }

    public static final android.view.ActionMode U(android.view.View view, defpackage.bgh bghVar) {
        return view.startActionMode(new defpackage.bgr(bghVar), 1);
    }

    public static final void V(android.app.PendingIntent pendingIntent) throws android.app.PendingIntent.CanceledException {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            X(pendingIntent);
        } else {
            pendingIntent.send();
        }
    }

    public static final void W(android.content.Context context, android.view.textclassifier.TextClassification textClassification) throws android.app.PendingIntent.CanceledException {
        java.lang.String strM = a$.ExternalSyntheticApiModelOutline1.m(textClassification);
        V(android.app.PendingIntent.getActivity(context, strM != null ? strM.hashCode() : 0, a$.ExternalSyntheticApiModelOutline1.m(textClassification), 201326592));
    }

    public static final void X(android.app.PendingIntent pendingIntent) {
        try {
            android.app.ActivityOptions activityOptionsMakeBasic = android.app.ActivityOptions.makeBasic();
            if (android.os.Build.VERSION.SDK_INT >= 36) {
                axd$.ExternalSyntheticApiModelOutline0.m(activityOptionsMakeBasic, 4);
            } else {
                axd$.ExternalSyntheticApiModelOutline0.m(activityOptionsMakeBasic, 1);
            }
            axd$.ExternalSyntheticApiModelOutline0.m(pendingIntent, activityOptionsMakeBasic.toBundle());
        } catch (android.app.PendingIntent.CanceledException e) {
            android.util.Log.e("TextClassification", defpackage.a.bs(e, pendingIntent, "error sending pendingIntent: ", " error: "));
        }
    }

    public static final void Y(defpackage.cgf cgfVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(790527681);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.b);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS;
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == obj) {
                objS2 = new defpackage.bfd(bwxVar, 7);
                bwcVar.ad(objS2);
            }
            defpackage.afer aferVar = (defpackage.afer) objS2;
            int i4 = defpackage.bgq.a;
            defpackage.bhp bhpVarR = R(defpackage.bgn.b, bveVarC, 6);
            defpackage.dai.aB(new defpackage.bxk[]{defpackage.bhu.b.b(ac(aferVar, bveVarC)), defpackage.bhu.a.b(bhpVarR)}, defpackage.dai.as(1070596993, true, new defpackage.lth(cgfVar, bwxVar, affgVar, bhpVarR, aferVar, 1), bveVarC), bveVarC, 56);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(cgfVar, affgVar, i, 13);
        }
    }

    public static final void Z(defpackage.cgf cgfVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(155925518);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 16 : 32;
        }
        int i4 = 14;
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            boolean z = bveVarC.f(defpackage.bhu.a) != null;
            boolean z2 = bveVarC.f(defpackage.bhu.b) != null;
            if (z && z2) {
                bveVarC.v(-1977187922);
                defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, true);
                defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
                int iF = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh = bwcVar.ah();
                defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
                defpackage.afer aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                defpackage.byw.b(bveVarC, defpackage.cwl.g);
                defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
                affgVar.invoke(bveVarC, java.lang.Integer.valueOf((i2 >> 3) & 14));
                bwcVar.Y(true);
                bwcVar.Y(false);
            } else {
                int i5 = (i2 & 14) | (i2 & 112);
                if (z) {
                    bveVarC.v(-1976997706);
                    ab(cgfVar, affgVar, bveVarC, i5);
                    ((defpackage.bwc) bveVarC).Y(false);
                } else if (z2) {
                    bveVarC.v(-1976846922);
                    defpackage.bgq.d(cgfVar, affgVar, bveVarC, i5);
                    ((defpackage.bwc) bveVarC).Y(false);
                } else {
                    bveVarC.v(-1976716505);
                    Y(cgfVar, affgVar, bveVarC, i5);
                    ((defpackage.bwc) bveVarC).Y(false);
                }
            }
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(cgfVar, affgVar, i, i4);
        }
    }

    public static final void a(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void aa(defpackage.cgf cgfVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(771959668);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 128 : 256;
        }
        int i4 = 0;
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.b);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS;
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == obj) {
                objS2 = new defpackage.bfd(bwxVar, 5);
                bwcVar.ad(objS2);
            }
            defpackage.dai.aA(defpackage.bhu.b.b(ac((defpackage.afer) objS2, bveVarC)), defpackage.dai.as(-291176396, true, new defpackage.bgl(cgfVar, bwxVar, affgVar, i4), bveVarC), bveVarC, 56);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(cgfVar, affgVar, i, 10);
        }
    }

    public static final void ab(defpackage.cgf cgfVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(2064964257);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            aa(cgfVar, affgVar, bveVarC, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(cgfVar, affgVar, i, 9);
        }
    }

    public static final defpackage.bht ac(defpackage.afer aferVar, defpackage.bve bveVar) {
        android.view.View view = (android.view.View) bveVar.f(defpackage.daj.f);
        boolean zC = bveVar.C(view);
        defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
        java.lang.Object objS = bwcVar.S();
        if (zC || objS == defpackage.bvd.a) {
            objS = new defpackage.bgk(view, aferVar);
            bwcVar.ad(objS);
        }
        defpackage.bgk bgkVar = (defpackage.bgk) objS;
        boolean zE = bveVar.E(bgkVar);
        java.lang.Object objS2 = bwcVar.S();
        if (zE || objS2 == defpackage.bvd.a) {
            objS2 = new defpackage.bge(bgkVar, 4);
            bwcVar.ad(objS2);
        }
        defpackage.bvx.c(bgkVar, (defpackage.affc) objS2, bveVar);
        return bgkVar;
    }

    public static final defpackage.zm ad(defpackage.azm azmVar, defpackage.azv azvVar, defpackage.kwv kwvVar) {
        int i;
        int iMin;
        java.util.List listE = ((androidx.compose.runtime.snapshots.SnapshotStateList) azvVar.a).e();
        if (!kwvVar.R() && listE.isEmpty()) {
            return defpackage.zn.a;
        }
        defpackage.zm zmVar = new defpackage.zm(16);
        if (kwvVar.R()) {
            defpackage.bzc bzcVar = (defpackage.bzc) kwvVar.a;
            i = ((defpackage.ayu) bzcVar.b()).a;
            java.lang.Object[] objArr = bzcVar.a;
            int i2 = bzcVar.b;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = ((defpackage.ayu) objArr[i3]).a;
                if (i4 < i) {
                    i = i4;
                }
            }
            if (i < 0) {
                defpackage.asq.c("negative minIndex");
            }
            int i5 = ((defpackage.ayu) bzcVar.b()).b;
            java.lang.Object[] objArr2 = bzcVar.a;
            int i6 = bzcVar.b;
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = ((defpackage.ayu) objArr2[i7]).b;
                if (i8 > i5) {
                    i5 = i8;
                }
            }
            iMin = java.lang.Math.min(i5, azmVar.b() - 1);
        } else {
            i = 1;
            iMin = 0;
        }
        int size = listE.size();
        for (int i9 = 0; i9 < size; i9++) {
            defpackage.azu azuVar = (defpackage.azu) listE.get(i9);
            int iO = o(azmVar, azuVar.a, azuVar.b);
            if ((i > iO || iO > iMin) && iO >= 0 && iO < azmVar.b()) {
                zmVar.e(iO);
            }
        }
        if (i <= iMin) {
            while (true) {
                zmVar.e(i);
                if (i == iMin) {
                    break;
                }
                i++;
            }
        }
        zmVar.d();
        return zmVar;
    }

    private static final defpackage.bkn ae(defpackage.afar afarVar) {
        return (defpackage.bkn) afarVar.a();
    }

    private static final defpackage.bkn af(defpackage.bkl bklVar, boolean z, boolean z2, defpackage.bjx bjxVar) {
        long jA = bjxVar.a(bklVar, z2 ? bklVar.a : bklVar.b);
        return bklVar.a(z ^ z2 ? defpackage.dgc.e(jA) : defpackage.dgc.a(jA));
    }

    public static final void b(java.lang.String str) {
        throw new java.lang.IllegalStateException("All weights <= 0 should have placeables");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0116  */
    /* JADX WARN: Code duplicated, block: B:103:0x011e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0121  */
    /* JADX WARN: Code duplicated, block: B:106:0x0125  */
    /* JADX WARN: Code duplicated, block: B:109:0x0132  */
    /* JADX WARN: Code duplicated, block: B:110:0x0135  */
    /* JADX WARN: Code duplicated, block: B:113:0x013e  */
    /* JADX WARN: Code duplicated, block: B:115:0x015d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x018a  */
    /* JADX WARN: Code duplicated, block: B:133:0x018f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0198  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:147:0x021d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0231  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x0107  */
    /* JADX WARN: Code duplicated, block: B:98:0x010c  */
    public static final void c(defpackage.cgf cgfVar, defpackage.axx axxVar, defpackage.avv avvVar, defpackage.ath athVar, defpackage.cft cftVar, defpackage.aor aorVar, boolean z, defpackage.aiz aizVar, defpackage.affc affcVar, defpackage.bve bveVar, int i, int i2) {
        defpackage.cgf cgfVar2;
        int i3;
        defpackage.axx axxVarA;
        defpackage.avv avxVar;
        int i4;
        defpackage.ath athVar2;
        int i5;
        defpackage.cft cftVar2;
        int i6;
        defpackage.aor aorVarAB;
        int i7;
        boolean z2;
        int i8;
        defpackage.aiz aizVar2;
        boolean z3;
        defpackage.bve bveVar2;
        boolean z4;
        defpackage.cgf cgfVar3;
        defpackage.axx axxVar2;
        defpackage.avv avvVar2;
        defpackage.ath athVar3;
        defpackage.aiz aizVar3;
        defpackage.cft cftVar3;
        defpackage.aor aorVar2;
        defpackage.bxl bxlVarJ;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z5;
        boolean z6;
        defpackage.aiz aizVarA;
        defpackage.cgf cgfVar4;
        defpackage.axx axxVar3;
        defpackage.ath athVar4;
        defpackage.cft cftVar4;
        defpackage.aor aorVar3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i2 & 1;
        defpackage.bve bveVarC = bveVar.c(53695811);
        if (i17 != 0) {
            i3 = i | 6;
            cgfVar2 = cgfVar;
        } else if ((i & 6) == 0) {
            cgfVar2 = cgfVar;
            i3 = (true != bveVarC.C(cgfVar2) ? 2 : 4) | i;
        } else {
            cgfVar2 = cgfVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i18 = 16;
            if ((i2 & 2) == 0) {
                axxVarA = axxVar;
                if (bveVarC.C(axxVarA)) {
                    i18 = 32;
                }
            } else {
                axxVarA = axxVar;
            }
            i3 |= i18;
        } else {
            axxVarA = axxVar;
        }
        int i19 = i2 & 4;
        if (i19 == 0) {
            if ((i & 384) == 0) {
                avxVar = avvVar;
                i3 |= true != bveVarC.C(avxVar) ? 128 : 256;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (true != bveVarC.D(false)) {
                    i4 = 1024;
                } else {
                    i4 = 2048;
                }
                i3 |= i4;
            }
            if ((i & 24576) == 0) {
                i16 = 8192;
                if ((i2 & 16) == 0) {
                    athVar2 = athVar;
                    if (bveVarC.C(athVar2)) {
                        i16 = 16384;
                    }
                } else {
                    athVar2 = athVar;
                }
                i3 |= i16;
            } else {
                athVar2 = athVar;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    cftVar2 = cftVar;
                    if (true != bveVarC.C(cftVar2)) {
                        i6 = 65536;
                    } else {
                        i6 = 131072;
                    }
                    i3 |= i6;
                }
                if ((1572864 & i) == 0) {
                    i15 = 524288;
                    if ((i2 & 64) == 0) {
                        aorVarAB = aorVar;
                        if (bveVarC.C(aorVarAB)) {
                            i15 = 1048576;
                        }
                    } else {
                        aorVarAB = aorVar;
                    }
                    i3 |= i15;
                } else {
                    aorVarAB = aorVar;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (true != bveVarC.D(z)) {
                        i8 = 4194304;
                    } else {
                        i8 = 8388608;
                    }
                    i3 |= i8;
                }
                if ((100663296 & i) == 0) {
                    i14 = 33554432;
                    if ((i2 & 256) == 0) {
                        aizVar2 = aizVar;
                        if (bveVarC.C(aizVar2)) {
                            i14 = 67108864;
                        }
                    } else {
                        aizVar2 = aizVar;
                    }
                    i3 |= i14;
                } else {
                    aizVar2 = aizVar;
                }
                if ((i & 805306368) != 0) {
                    if (true != bveVarC.E(affcVar)) {
                        i13 = 268435456;
                    } else {
                        i13 = 536870912;
                    }
                    i3 |= i13;
                }
                if ((306783379 & i3) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bveVarC.I(z3, i3 & 1)) {
                    i9 = i2 & 256;
                    i10 = i2 & 64;
                    i11 = i2 & 16;
                    i12 = i2 & 2;
                    bveVar2 = bveVarC;
                    ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
                    if ((i & 1) != 0 || bveVar2.F()) {
                        if (i17 != 0) {
                            cgfVar2 = defpackage.cgf.e;
                        }
                        if (i12 != 0) {
                            i3 &= -113;
                            axxVarA = defpackage.axy.a(bveVar2);
                        }
                        if (i19 != 0) {
                            avxVar = new defpackage.avx(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if (i11 != 0) {
                            i3 &= -57345;
                            athVar2 = defpackage.ati.c;
                        }
                        if (i5 != 0) {
                            cftVar2 = defpackage.cfs.j;
                        }
                        if (i10 != 0) {
                            aorVarAB = defpackage.ca.aB(bveVar2);
                            i3 = (-3670017) & i3;
                        }
                        z5 = (!z2) | z;
                        if (i9 != 0) {
                            i3 &= -234881025;
                            z6 = z5;
                            aizVarA = defpackage.alc.a(bveVar2);
                            cgfVar4 = cgfVar2;
                            axxVar3 = axxVarA;
                            athVar4 = athVar2;
                            cftVar4 = cftVar2;
                            aorVar3 = aorVarAB;
                        } else {
                            z6 = z5;
                        }
                        defpackage.avv avvVar3 = avxVar;
                        bveVar2.l();
                        int i20 = i3 >> 3;
                        e(cgfVar4, axxVar3, avvVar3, true, aorVar3, z6, aizVarA, cftVar4, athVar4, null, null, affcVar, bveVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i20) | (3670016 & i20) | (i20 & 29360128) | (1879048192 & (i3 << 12)), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                        cgfVar3 = cgfVar4;
                        axxVar2 = axxVar3;
                        avvVar2 = avvVar3;
                        aorVar2 = aorVar3;
                        z4 = z6;
                        aizVar3 = aizVarA;
                        cftVar3 = cftVar4;
                        athVar3 = athVar4;
                    } else {
                        bveVar2.s();
                        if (i12 != 0) {
                            i3 &= -113;
                        }
                        if (i11 != 0) {
                            i3 &= -57345;
                        }
                        if (i10 != 0) {
                            i3 &= -3670017;
                        }
                        if (i9 != 0) {
                            i3 &= -234881025;
                        }
                        z6 = z;
                    }
                    axxVar3 = axxVarA;
                    athVar4 = athVar2;
                    aizVarA = aizVar2;
                    cftVar4 = cftVar2;
                    aorVar3 = aorVarAB;
                    cgfVar4 = cgfVar2;
                    defpackage.avv avvVar4 = avxVar;
                    bveVar2.l();
                    int i21 = i3 >> 3;
                    e(cgfVar4, axxVar3, avvVar4, true, aorVar3, z6, aizVarA, cftVar4, athVar4, null, null, affcVar, bveVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i21) | (3670016 & i21) | (i21 & 29360128) | (1879048192 & (i3 << 12)), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                    cgfVar3 = cgfVar4;
                    axxVar2 = axxVar3;
                    avvVar2 = avvVar4;
                    aorVar2 = aorVar3;
                    z4 = z6;
                    aizVar3 = aizVarA;
                    cftVar3 = cftVar4;
                    athVar3 = athVar4;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    z4 = z;
                    cgfVar3 = cgfVar2;
                    axxVar2 = axxVarA;
                    avvVar2 = avxVar;
                    athVar3 = athVar2;
                    aizVar3 = aizVar2;
                    cftVar3 = cftVar2;
                    aorVar2 = aorVarAB;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.axf(cgfVar3, axxVar2, avvVar2, athVar3, cftVar3, aorVar2, z4, aizVar3, affcVar, i, i2, 0);
                }
            }
            i3 |= 196608;
            cftVar2 = cftVar;
            if ((1572864 & i) == 0) {
                i15 = 524288;
                if ((i2 & 64) == 0) {
                    aorVarAB = aorVar;
                    if (bveVarC.C(aorVarAB)) {
                        i15 = 1048576;
                    }
                } else {
                    aorVarAB = aorVar;
                }
                i3 |= i15;
            } else {
                aorVarAB = aorVar;
            }
            i7 = i2 & 128;
            if (i7 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i7 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (true != bveVarC.D(z)) {
                    i8 = 4194304;
                } else {
                    i8 = 8388608;
                }
                i3 |= i8;
            }
            if ((100663296 & i) == 0) {
                i14 = 33554432;
                if ((i2 & 256) == 0) {
                    aizVar2 = aizVar;
                    if (bveVarC.C(aizVar2)) {
                        i14 = 67108864;
                    }
                } else {
                    aizVar2 = aizVar;
                }
                i3 |= i14;
            } else {
                aizVar2 = aizVar;
            }
            if ((i & 805306368) != 0) {
                if (true != bveVarC.E(affcVar)) {
                    i13 = 268435456;
                } else {
                    i13 = 536870912;
                }
                i3 |= i13;
            }
            if ((306783379 & i3) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i3 & 1)) {
                i9 = i2 & 256;
                i10 = i2 & 64;
                i11 = i2 & 16;
                i12 = i2 & 2;
                bveVar2 = bveVarC;
                ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    if (i12 != 0) {
                        i3 &= -113;
                        axxVarA = defpackage.axy.a(bveVar2);
                    }
                    if (i19 != 0) {
                        avxVar = new defpackage.avx(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (i11 != 0) {
                        i3 &= -57345;
                        athVar2 = defpackage.ati.c;
                    }
                    if (i5 != 0) {
                        cftVar2 = defpackage.cfs.j;
                    }
                    if (i10 != 0) {
                        aorVarAB = defpackage.ca.aB(bveVar2);
                        i3 = (-3670017) & i3;
                    }
                    z5 = (!z2) | z;
                    if (i9 != 0) {
                        i3 &= -234881025;
                        z6 = z5;
                        aizVarA = defpackage.alc.a(bveVar2);
                        cgfVar4 = cgfVar2;
                        axxVar3 = axxVarA;
                        athVar4 = athVar2;
                        cftVar4 = cftVar2;
                        aorVar3 = aorVarAB;
                    } else {
                        z6 = z5;
                        axxVar3 = axxVarA;
                        athVar4 = athVar2;
                        aizVarA = aizVar2;
                        cftVar4 = cftVar2;
                        aorVar3 = aorVarAB;
                        cgfVar4 = cgfVar2;
                    }
                } else {
                    if (i17 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    if (i12 != 0) {
                        i3 &= -113;
                        axxVarA = defpackage.axy.a(bveVar2);
                    }
                    if (i19 != 0) {
                        avxVar = new defpackage.avx(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (i11 != 0) {
                        i3 &= -57345;
                        athVar2 = defpackage.ati.c;
                    }
                    if (i5 != 0) {
                        cftVar2 = defpackage.cfs.j;
                    }
                    if (i10 != 0) {
                        aorVarAB = defpackage.ca.aB(bveVar2);
                        i3 = (-3670017) & i3;
                    }
                    z5 = (!z2) | z;
                    if (i9 != 0) {
                        i3 &= -234881025;
                        z6 = z5;
                        aizVarA = defpackage.alc.a(bveVar2);
                        cgfVar4 = cgfVar2;
                        axxVar3 = axxVarA;
                        athVar4 = athVar2;
                        cftVar4 = cftVar2;
                        aorVar3 = aorVarAB;
                    } else {
                        z6 = z5;
                        axxVar3 = axxVarA;
                        athVar4 = athVar2;
                        aizVarA = aizVar2;
                        cftVar4 = cftVar2;
                        aorVar3 = aorVarAB;
                        cgfVar4 = cgfVar2;
                    }
                }
                defpackage.avv avvVar5 = avxVar;
                bveVar2.l();
                int i22 = i3 >> 3;
                e(cgfVar4, axxVar3, avvVar5, true, aorVar3, z6, aizVarA, cftVar4, athVar4, null, null, affcVar, bveVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i22) | (3670016 & i22) | (i22 & 29360128) | (1879048192 & (i3 << 12)), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                cgfVar3 = cgfVar4;
                axxVar2 = axxVar3;
                avvVar2 = avvVar5;
                aorVar2 = aorVar3;
                z4 = z6;
                aizVar3 = aizVarA;
                cftVar3 = cftVar4;
                athVar3 = athVar4;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                z4 = z;
                cgfVar3 = cgfVar2;
                axxVar2 = axxVarA;
                avvVar2 = avxVar;
                athVar3 = athVar2;
                aizVar3 = aizVar2;
                cftVar3 = cftVar2;
                aorVar2 = aorVarAB;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.axf(cgfVar3, axxVar2, avvVar2, athVar3, cftVar3, aorVar2, z4, aizVar3, affcVar, i, i2, 0);
            }
        }
        i3 |= 384;
        avxVar = avvVar;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (true != bveVarC.D(false)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i3 |= i4;
        }
        if ((i & 24576) == 0) {
            i16 = 8192;
            if ((i2 & 16) == 0) {
                athVar2 = athVar;
                if (bveVarC.C(athVar2)) {
                    i16 = 16384;
                }
            } else {
                athVar2 = athVar;
            }
            i3 |= i16;
        } else {
            athVar2 = athVar;
        }
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                cftVar2 = cftVar;
                if (true != bveVarC.C(cftVar2)) {
                    i6 = 65536;
                } else {
                    i6 = 131072;
                }
                i3 |= i6;
            }
            if ((1572864 & i) == 0) {
                i15 = 524288;
                if ((i2 & 64) == 0) {
                    aorVarAB = aorVar;
                    if (bveVarC.C(aorVarAB)) {
                        i15 = 1048576;
                    }
                } else {
                    aorVarAB = aorVar;
                }
                i3 |= i15;
            } else {
                aorVarAB = aorVar;
            }
            i7 = i2 & 128;
            if (i7 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i7 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (true != bveVarC.D(z)) {
                    i8 = 4194304;
                } else {
                    i8 = 8388608;
                }
                i3 |= i8;
            }
            if ((100663296 & i) == 0) {
                i14 = 33554432;
                if ((i2 & 256) == 0) {
                    aizVar2 = aizVar;
                    if (bveVarC.C(aizVar2)) {
                        i14 = 67108864;
                    }
                } else {
                    aizVar2 = aizVar;
                }
                i3 |= i14;
            } else {
                aizVar2 = aizVar;
            }
            if ((i & 805306368) != 0) {
                if (true != bveVarC.E(affcVar)) {
                    i13 = 268435456;
                } else {
                    i13 = 536870912;
                }
                i3 |= i13;
            }
            if ((306783379 & i3) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i3 & 1)) {
                i9 = i2 & 256;
                i10 = i2 & 64;
                i11 = i2 & 16;
                i12 = i2 & 2;
                bveVar2 = bveVarC;
                ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    if (i12 != 0) {
                        i3 &= -113;
                        axxVarA = defpackage.axy.a(bveVar2);
                    }
                    if (i19 != 0) {
                        avxVar = new defpackage.avx(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (i11 != 0) {
                        i3 &= -57345;
                        athVar2 = defpackage.ati.c;
                    }
                    if (i5 != 0) {
                        cftVar2 = defpackage.cfs.j;
                    }
                    if (i10 != 0) {
                        aorVarAB = defpackage.ca.aB(bveVar2);
                        i3 = (-3670017) & i3;
                    }
                    z5 = (!z2) | z;
                    if (i9 != 0) {
                        i3 &= -234881025;
                        z6 = z5;
                        aizVarA = defpackage.alc.a(bveVar2);
                        cgfVar4 = cgfVar2;
                        axxVar3 = axxVarA;
                        athVar4 = athVar2;
                        cftVar4 = cftVar2;
                        aorVar3 = aorVarAB;
                    } else {
                        z6 = z5;
                        axxVar3 = axxVarA;
                        athVar4 = athVar2;
                        aizVarA = aizVar2;
                        cftVar4 = cftVar2;
                        aorVar3 = aorVarAB;
                        cgfVar4 = cgfVar2;
                    }
                } else {
                    if (i17 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    if (i12 != 0) {
                        i3 &= -113;
                        axxVarA = defpackage.axy.a(bveVar2);
                    }
                    if (i19 != 0) {
                        avxVar = new defpackage.avx(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (i11 != 0) {
                        i3 &= -57345;
                        athVar2 = defpackage.ati.c;
                    }
                    if (i5 != 0) {
                        cftVar2 = defpackage.cfs.j;
                    }
                    if (i10 != 0) {
                        aorVarAB = defpackage.ca.aB(bveVar2);
                        i3 = (-3670017) & i3;
                    }
                    z5 = (!z2) | z;
                    if (i9 != 0) {
                        i3 &= -234881025;
                        z6 = z5;
                        aizVarA = defpackage.alc.a(bveVar2);
                        cgfVar4 = cgfVar2;
                        axxVar3 = axxVarA;
                        athVar4 = athVar2;
                        cftVar4 = cftVar2;
                        aorVar3 = aorVarAB;
                    } else {
                        z6 = z5;
                        axxVar3 = axxVarA;
                        athVar4 = athVar2;
                        aizVarA = aizVar2;
                        cftVar4 = cftVar2;
                        aorVar3 = aorVarAB;
                        cgfVar4 = cgfVar2;
                    }
                }
                defpackage.avv avvVar6 = avxVar;
                bveVar2.l();
                int i23 = i3 >> 3;
                e(cgfVar4, axxVar3, avvVar6, true, aorVar3, z6, aizVarA, cftVar4, athVar4, null, null, affcVar, bveVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i23) | (3670016 & i23) | (i23 & 29360128) | (1879048192 & (i3 << 12)), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                cgfVar3 = cgfVar4;
                axxVar2 = axxVar3;
                avvVar2 = avvVar6;
                aorVar2 = aorVar3;
                z4 = z6;
                aizVar3 = aizVarA;
                cftVar3 = cftVar4;
                athVar3 = athVar4;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                z4 = z;
                cgfVar3 = cgfVar2;
                axxVar2 = axxVarA;
                avvVar2 = avxVar;
                athVar3 = athVar2;
                aizVar3 = aizVar2;
                cftVar3 = cftVar2;
                aorVar2 = aorVarAB;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.axf(cgfVar3, axxVar2, avvVar2, athVar3, cftVar3, aorVar2, z4, aizVar3, affcVar, i, i2, 0);
            }
        }
        i3 |= 196608;
        cftVar2 = cftVar;
        if ((1572864 & i) == 0) {
            i15 = 524288;
            if ((i2 & 64) == 0) {
                aorVarAB = aorVar;
                if (bveVarC.C(aorVarAB)) {
                    i15 = 1048576;
                }
            } else {
                aorVarAB = aorVar;
            }
            i3 |= i15;
        } else {
            aorVarAB = aorVar;
        }
        i7 = i2 & 128;
        if (i7 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i7 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (true != bveVarC.D(z)) {
                i8 = 4194304;
            } else {
                i8 = 8388608;
            }
            i3 |= i8;
        }
        if ((100663296 & i) == 0) {
            i14 = 33554432;
            if ((i2 & 256) == 0) {
                aizVar2 = aizVar;
                if (bveVarC.C(aizVar2)) {
                    i14 = 67108864;
                }
            } else {
                aizVar2 = aizVar;
            }
            i3 |= i14;
        } else {
            aizVar2 = aizVar;
        }
        if ((i & 805306368) != 0) {
            if (true != bveVarC.E(affcVar)) {
                i13 = 268435456;
            } else {
                i13 = 536870912;
            }
            i3 |= i13;
        }
        if ((306783379 & i3) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bveVarC.I(z3, i3 & 1)) {
            i9 = i2 & 256;
            i10 = i2 & 64;
            i11 = i2 & 16;
            i12 = i2 & 2;
            bveVar2 = bveVarC;
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i17 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                if (i12 != 0) {
                    i3 &= -113;
                    axxVarA = defpackage.axy.a(bveVar2);
                }
                if (i19 != 0) {
                    avxVar = new defpackage.avx(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (i11 != 0) {
                    i3 &= -57345;
                    athVar2 = defpackage.ati.c;
                }
                if (i5 != 0) {
                    cftVar2 = defpackage.cfs.j;
                }
                if (i10 != 0) {
                    aorVarAB = defpackage.ca.aB(bveVar2);
                    i3 = (-3670017) & i3;
                }
                z5 = (!z2) | z;
                if (i9 != 0) {
                    i3 &= -234881025;
                    z6 = z5;
                    aizVarA = defpackage.alc.a(bveVar2);
                    cgfVar4 = cgfVar2;
                    axxVar3 = axxVarA;
                    athVar4 = athVar2;
                    cftVar4 = cftVar2;
                    aorVar3 = aorVarAB;
                } else {
                    z6 = z5;
                    axxVar3 = axxVarA;
                    athVar4 = athVar2;
                    aizVarA = aizVar2;
                    cftVar4 = cftVar2;
                    aorVar3 = aorVarAB;
                    cgfVar4 = cgfVar2;
                }
            } else {
                if (i17 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                if (i12 != 0) {
                    i3 &= -113;
                    axxVarA = defpackage.axy.a(bveVar2);
                }
                if (i19 != 0) {
                    avxVar = new defpackage.avx(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (i11 != 0) {
                    i3 &= -57345;
                    athVar2 = defpackage.ati.c;
                }
                if (i5 != 0) {
                    cftVar2 = defpackage.cfs.j;
                }
                if (i10 != 0) {
                    aorVarAB = defpackage.ca.aB(bveVar2);
                    i3 = (-3670017) & i3;
                }
                z5 = (!z2) | z;
                if (i9 != 0) {
                    i3 &= -234881025;
                    z6 = z5;
                    aizVarA = defpackage.alc.a(bveVar2);
                    cgfVar4 = cgfVar2;
                    axxVar3 = axxVarA;
                    athVar4 = athVar2;
                    cftVar4 = cftVar2;
                    aorVar3 = aorVarAB;
                } else {
                    z6 = z5;
                    axxVar3 = axxVarA;
                    athVar4 = athVar2;
                    aizVarA = aizVar2;
                    cftVar4 = cftVar2;
                    aorVar3 = aorVarAB;
                    cgfVar4 = cgfVar2;
                }
            }
            defpackage.avv avvVar7 = avxVar;
            bveVar2.l();
            int i24 = i3 >> 3;
            e(cgfVar4, axxVar3, avvVar7, true, aorVar3, z6, aizVarA, cftVar4, athVar4, null, null, affcVar, bveVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i24) | (3670016 & i24) | (i24 & 29360128) | (1879048192 & (i3 << 12)), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
            cgfVar3 = cgfVar4;
            axxVar2 = axxVar3;
            avvVar2 = avvVar7;
            aorVar2 = aorVar3;
            z4 = z6;
            aizVar3 = aizVarA;
            cftVar3 = cftVar4;
            athVar3 = athVar4;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            z4 = z;
            cgfVar3 = cgfVar2;
            axxVar2 = axxVarA;
            avvVar2 = avxVar;
            athVar3 = athVar2;
            aizVar3 = aizVar2;
            cftVar3 = cftVar2;
            aorVar2 = aorVarAB;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.axf(cgfVar3, axxVar2, avvVar2, athVar3, cftVar3, aorVar2, z4, aizVar3, affcVar, i, i2, 0);
        }
    }

    public static final void d(final defpackage.cgf cgfVar, final defpackage.axx axxVar, defpackage.avv avvVar, final defpackage.atb atbVar, defpackage.cfy cfyVar, defpackage.aor aorVar, boolean z, defpackage.aiz aizVar, final defpackage.affc affcVar, defpackage.bve bveVar, final int i) {
        defpackage.cgf cgfVar2;
        int i2;
        defpackage.atb atbVar2;
        defpackage.bve bveVar2;
        final defpackage.avv avvVar2;
        final defpackage.cfy cfyVar2;
        final defpackage.aor aorVar2;
        final boolean z2;
        final defpackage.aiz aizVar2;
        boolean z3;
        defpackage.cfy cfyVar3;
        defpackage.aor aorVarAB;
        defpackage.aiz aizVarA;
        defpackage.avv avvVar3;
        defpackage.bve bveVarC = bveVar.c(-1884325601);
        if ((i & 6) == 0) {
            cgfVar2 = cgfVar;
            i2 = (true != bveVarC.C(cgfVar2) ? 2 : 4) | i;
        } else {
            cgfVar2 = cgfVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(axxVar) ? 16 : 32;
        }
        int i3 = i2 | 3456;
        if ((i & 24576) == 0) {
            atbVar2 = atbVar;
            i3 |= true != bveVarC.C(atbVar2) ? 8192 : 16384;
        } else {
            atbVar2 = atbVar;
        }
        int i4 = 196608 | i3;
        if ((1572864 & i) == 0) {
            i4 = i3 | 720896;
        }
        int i5 = 12582912 | i4;
        if ((100663296 & i) == 0) {
            i5 = i4 | 46137344;
        }
        if ((805306368 & i) == 0) {
            i5 |= true != bveVarC.E(affcVar) ? 268435456 : 536870912;
        }
        if (bveVarC.I((306783379 & i5) != 306783378, i5 & 1)) {
            int i6 = i5 >> 18;
            int i7 = (-238551041) & i5;
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                defpackage.avx avxVar = new defpackage.avx(0.0f, 0.0f, 0.0f, 0.0f);
                z3 = true;
                cfyVar3 = defpackage.cfs.m;
                aorVarAB = defpackage.ca.aB(bveVarC);
                aizVarA = defpackage.alc.a(bveVarC);
                avvVar3 = avxVar;
            } else {
                bveVarC.s();
                avvVar3 = avvVar;
                cfyVar3 = cfyVar;
                aorVarAB = aorVar;
                z3 = z;
                aizVarA = aizVar;
            }
            bveVarC.l();
            bveVar2 = bveVarC;
            e(cgfVar2, axxVar, avvVar3, false, aorVarAB, z3, aizVarA, null, null, cfyVar3, atbVar2, affcVar, bveVar2, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (3670016 & (i7 >> 3)), ((i7 >> 12) & 112) | ((i7 >> 6) & 896) | (i6 & 7168), 1792);
            avvVar2 = avvVar3;
            aorVar2 = aorVarAB;
            z2 = z3;
            aizVar2 = aizVarA;
            cfyVar2 = cfyVar3;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            avvVar2 = avvVar;
            cfyVar2 = cfyVar;
            aorVar2 = aorVar;
            z2 = z;
            aizVar2 = aizVar;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: axg
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar3 = (defpackage.bve) obj;
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.cgf cgfVar3 = cgfVar;
                    defpackage.axx axxVar2 = axxVar;
                    defpackage.avv avvVar4 = avvVar2;
                    defpackage.atb atbVar3 = atbVar;
                    defpackage.cfy cfyVar4 = cfyVar2;
                    int i8 = i | 1;
                    int i9 = 306783378 & i8;
                    int i10 = 613566756 & i8;
                    defpackage.axd.d(cgfVar3, axxVar2, avvVar4, atbVar3, cfyVar4, aorVar2, z2, aizVar2, affcVar, bveVar3, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 + i9) & i10));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r10v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v23 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v24 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v25 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r20v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v1 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r20v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v2 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r20v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v4 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r29v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r29v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r29v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v32 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v32 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r30v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r30v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r31v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r31v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r33v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r33v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r49v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r49v0 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r50v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r50v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r51v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r51v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v129 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v129 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v39 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v39 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v1 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r49v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r49v0 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r50v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r50v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r51v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r51v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void e(defpackage.cgf r37, defpackage.axx r38, defpackage.avv r39, boolean r40, defpackage.aor r41, boolean r42, defpackage.aiz r43, defpackage.cft r44, defpackage.ath r45, defpackage.cfy r46, defpackage.atb r47, defpackage.affc r48, defpackage.bve r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instruction units count: 1404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axd.e(cgf, axx, avv, boolean, aor, boolean, aiz, cft, ath, cfy, atb, affc, bve, int, int, int):void");
    }

    public static /* synthetic */ defpackage.cgf f() {
        return new defpackage.ays(new defpackage.aga(1.0f, 400.0f, null), new defpackage.aga(1.0f, 400.0f, new defpackage.dlw(4294967297L)), new defpackage.aga(1.0f, 400.0f, null));
    }

    public static final int g(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = Integer.MIN_VALUE;
        int i3 = -1;
        while (i < length) {
            int i4 = iArr[i];
            int i5 = i4 > i2 ? i4 : i2;
            if (i4 > i2) {
                i3 = i;
            }
            i++;
            i2 = i5;
        }
        return i3;
    }

    public static final int h(defpackage.axo axoVar) {
        java.util.List list = axoVar.j;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((defpackage.axp) list.get(i2)).i;
        }
        return (i / list.size()) + axoVar.p;
    }

    public static final int i(defpackage.axp axpVar, boolean z) {
        long jB = axpVar.b(0);
        return (int) (z ? 4294967295L & jB : jB >> 32);
    }

    public static final boolean j(defpackage.azz azzVar, int i) {
        return i <= azzVar.e() && azzVar.b() <= i;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c0 A[Catch: ayr -> 0x018a, TryCatch #6 {ayr -> 0x018a, blocks: (B:32:0x00bc, B:34:0x00c0, B:36:0x00c6, B:38:0x00d3, B:44:0x00e5, B:48:0x0112), top: B:101:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3 A[Catch: ayr -> 0x018a, TryCatch #6 {ayr -> 0x018a, blocks: (B:32:0x00bc, B:34:0x00c0, B:36:0x00c6, B:38:0x00d3, B:44:0x00e5, B:48:0x0112), top: B:101:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0111  */
    /* JADX WARN: Code duplicated, block: B:50:0x0116  */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:60:0x0162  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1, types: [azz] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [azz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [azz] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [azz] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0162 -> B:99:0x016a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object k(defpackage.azz r27, int r28, int r29, defpackage.dlo r30, defpackage.afdk r31) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axd.k(azz, int, int, dlo, afdk):java.lang.Object");
    }

    public static final boolean l(boolean z, defpackage.azz azzVar, int i) {
        if (z) {
            if (azzVar.b() > i) {
                return true;
            }
            return azzVar.b() == i && azzVar.c() > 0;
        }
        if (azzVar.b() < i) {
            return true;
        }
        return azzVar.b() == i && azzVar.c() < 0;
    }

    public static final void m(java.lang.Object obj, int i, defpackage.azv azvVar, defpackage.affg affgVar, defpackage.bve bveVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(872548579);
        if (i4 == 0) {
            i3 = (true != bveVarC.E(obj) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 16;
        if ((i2 & 48) == 0) {
            i3 |= true != bveVarC.A(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != bveVarC.E(azvVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != bveVarC.E(affgVar) ? 1024 : 2048;
        }
        if (bveVarC.I((i3 & 1171) != 1170, i3 & 1)) {
            boolean zC = bveVarC.C(obj) | bveVarC.C(azvVar);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                objS = new defpackage.azu(obj, azvVar);
                bwcVar.ad(objS);
            }
            defpackage.azu azuVar = (defpackage.azu) objS;
            azuVar.b = i;
            defpackage.azu azuVar2 = (defpackage.azu) bveVarC.f(defpackage.cuv.a);
            defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
            defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
            defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
            try {
                if (azuVar2 != azuVar.c()) {
                    azuVar.e.b(azuVar2);
                    if (azuVar.c > 0) {
                        defpackage.azu azuVar3 = azuVar.f;
                        if (azuVar3 != null) {
                            azuVar3.a();
                        }
                        if (azuVar2 != null) {
                            azuVar2.d();
                        } else {
                            azuVar2 = null;
                        }
                        azuVar.f = azuVar2;
                    }
                }
                defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                boolean zC2 = bveVarC.C(azuVar);
                java.lang.Object objS2 = bwcVar.S();
                if (zC2 || objS2 == defpackage.bvd.a) {
                    objS2 = new defpackage.aun(azuVar, i5);
                    bwcVar.ad(objS2);
                }
                defpackage.bvx.c(azuVar, (defpackage.affc) objS2, bveVarC);
                defpackage.dai.aA(defpackage.cuv.a.b(azuVar), affgVar, bveVarC, ((i3 >> 6) & 112) | 8);
            } catch (java.lang.Throwable th) {
                defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                throw th;
            }
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.azl(obj, i, azvVar, affgVar, i2, 2);
        }
    }

    public static final void n(defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.azy azyVar, defpackage.azo azoVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1055276397);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(aferVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.C(azyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? bveVarC.C(azoVar) : bveVarC.E(azoVar)) ? 1024 : 2048;
        }
        if (bveVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            defpackage.afw.ae(defpackage.dai.as(-933153643, true, new defpackage.aca(azyVar, cgfVar, azoVar, defpackage.bzd.c(aferVar, bveVarC), 2), bveVarC), bveVarC, 6);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.bhr(aferVar, cgfVar, azyVar, azoVar, i, 1);
        }
    }

    public static final int o(defpackage.azm azmVar, java.lang.Object obj, int i) {
        int iA;
        return (obj == null || azmVar.b() == 0 || (i < azmVar.b() && defpackage.afga.f(obj, azmVar.d(i))) || (iA = azmVar.a(obj)) == -1) ? i : iA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(defpackage.azm azmVar, java.lang.Object obj, int i, java.lang.Object obj2, defpackage.bve bveVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(1439843069);
        if (i4 == 0) {
            i3 = (true != bveVarC.C(azmVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != bveVarC.C(obj) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != bveVarC.A(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != bveVarC.C(obj2) ? 1024 : 2048;
        }
        if (bveVarC.I((i3 & 1171) != 1170, i3 & 1)) {
            obj.c(obj2, defpackage.dai.as(980966366, true, new defpackage.agg(azmVar, i, obj2, 5), bveVarC), bveVarC, 48);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.azl(azmVar, obj, i, obj2, i2, 0);
        }
    }

    public static final int q(defpackage.bzc bzcVar, int i) {
        int i2 = bzcVar.b - 1;
        int i3 = 0;
        while (i3 < i2) {
            java.lang.Object[] objArr = bzcVar.a;
            int i4 = ((i2 - i3) / 2) + i3;
            int i5 = ((defpackage.ov) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((defpackage.ov) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final int r(defpackage.afar afarVar) {
        return ((java.lang.Number) afarVar.a()).intValue();
    }

    public static final defpackage.bkn s(defpackage.bkn bknVar, defpackage.bkl bklVar, int i) {
        int iP = bklVar.d.p(i);
        long j = bknVar.b;
        return new defpackage.bkn(iP, i);
    }

    public static final defpackage.bkn t(final defpackage.blk blkVar, final defpackage.bkl bklVar, defpackage.bkn bknVar) {
        boolean z = blkVar.a;
        final int i = z ? bklVar.a : bklVar.b;
        final defpackage.afar afarVarCB = defpackage.afga.cB(3, new defpackage.bkt(bklVar, i, 0));
        final int i2 = z ? bklVar.b : bklVar.a;
        defpackage.afar afarVarCB2 = defpackage.afga.cB(3, new defpackage.afer() { // from class: bku
            @Override // defpackage.afer
            public final java.lang.Object invoke() {
                int i3;
                int iF;
                defpackage.bkl bklVar2 = bklVar;
                defpackage.dga dgaVar = bklVar2.d;
                int iR = defpackage.axd.r(afarVarCB);
                defpackage.blk blkVar2 = blkVar;
                int iA = blkVar2.a();
                int i4 = i;
                long jK = dgaVar.k(i4);
                if (dgaVar.g(defpackage.dgc.e(jK)) == iR) {
                    i3 = defpackage.dgc.e(jK);
                } else {
                    i3 = iR >= dgaVar.e() ? dgaVar.i(dgaVar.e() - 1) : dgaVar.i(iR);
                }
                if (dgaVar.g(defpackage.dgc.a(jK)) == iR) {
                    iF = defpackage.dgc.a(jK);
                } else {
                    iF = iR >= dgaVar.e() ? dgaVar.f(dgaVar.e() - 1, false) : dgaVar.f(iR, false);
                }
                int i5 = i2;
                if (i3 == i5) {
                    return bklVar2.a(iF);
                }
                if (iF == i5) {
                    return bklVar2.a(i3);
                }
                if (!(blkVar2.a ^ (iA == 1)) ? i4 >= i3 : i4 > iF) {
                    i3 = iF;
                }
                return bklVar2.a(i3);
            }
        });
        long j = bknVar.b;
        int i3 = bklVar.c;
        if (i == i3) {
            return bknVar;
        }
        defpackage.dga dgaVar = bklVar.d;
        if (r(afarVarCB) != dgaVar.g(i3)) {
            return ae(afarVarCB2);
        }
        int i4 = bknVar.a;
        long jK = dgaVar.k(i4);
        if (i3 != -1) {
            if (i != i3) {
                if (((z ? 1 : 0) ^ (bklVar.c() == 1 ? 1 : 0)) == 0) {
                }
            }
            return bklVar.a(i);
        }
        return (i4 == defpackage.dgc.e(jK) || i4 == defpackage.dgc.a(jK)) ? ae(afarVarCB2) : bklVar.a(i);
    }

    public static final defpackage.bko u(defpackage.blk blkVar, defpackage.bjx bjxVar) {
        boolean z = blkVar.a() == 1;
        defpackage.bkl bklVar = blkVar.c;
        return new defpackage.bko(af(bklVar, z, true, bjxVar), af(bklVar, z, false, bjxVar), z);
    }

    public static final void v(defpackage.bkc bkcVar, defpackage.cfu cfuVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1090171650);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(bkcVar) : bveVarC.E(bkcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cfuVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !bveVarC.C(bkcVar))) {
                z = false;
            }
            boolean z3 = z2 | z;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (z3 || objS == defpackage.bvd.a) {
                objS = new defpackage.bka(cfuVar, bkcVar);
                bwcVar.ad(objS);
            }
            dnj.b((defpackage.bka) objS, (defpackage.afer) null, new doc(false, false, 0, 1920), affgVar, bveVarC, ((i2 << 3) & 7168) | 384, 2);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.alz(bkcVar, cfuVar, affgVar, i, 6, null);
        }
    }

    public static final void w(defpackage.cgf cgfVar, defpackage.afer aferVar, boolean z, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(2111672474);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(aferVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z) ? 128 : 256;
        }
        int i4 = 0;
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.asq.A(defpackage.awj.k(cgfVar, 25.0f, 25.0f).a(new defpackage.cgb(new defpackage.bjt(aferVar, z, i4))), bveVarC);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.nhv(cgfVar, aferVar, z, i, 1);
        }
    }

    public static final void x(final defpackage.bkc bkcVar, final boolean z, final int i, final boolean z2, long j, final float f, final defpackage.cgf cgfVar, defpackage.bve bveVar, final int i2) {
        int i3;
        final long j2;
        long j3;
        final boolean zB;
        int i4 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(-466280168);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? bveVarC.C(bkcVar) : bveVarC.E(bkcVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != bveVarC.A(i + (-1)) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != bveVarC.D(z2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != bveVarC.C(cgfVar) ? 524288 : 1048576;
        }
        if (bveVarC.I((533651 & i3) != 533650, i3 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i2 & 1) == 0 || bveVarC.F()) {
                j3 = 9205357640488583168L;
            } else {
                bveVarC.s();
                j3 = j;
            }
            bveVarC.l();
            if (z) {
                zB = defpackage.ble.b(i, z2);
            } else {
                zB = !defpackage.ble.b(i, z2);
            }
            defpackage.cfu cfuVar = zB ? defpackage.cfr.b : defpackage.cfr.a;
            int i5 = i3 & 14;
            boolean zD = ((i3 & 112) == 32) | (i5 == 4 || ((i3 & 8) != 0 && bveVarC.E(bkcVar))) | bveVarC.D(zB);
            java.lang.Object objS = bwcVar.S();
            if (zD || objS == defpackage.bvd.a) {
                objS = new defpackage.affc() { // from class: bjp
                    @Override // defpackage.affc
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        boolean z3 = z;
                        defpackage.dek dekVar = (defpackage.dek) obj;
                        long jA = bkcVar.a();
                        dekVar.a(defpackage.ble.a, new defpackage.bld(z3 ? defpackage.bdy.b : defpackage.bdy.c, jA, true != zB ? 3 : 1, (9223372034707292159L & jA) != 9205357640488583168L));
                        return defpackage.afbk.a;
                    }
                };
                bwcVar.ad(objS);
            }
            final defpackage.cgf cgfVarA = defpackage.dea.a(cgfVar, false, (defpackage.affc) objS);
            final defpackage.dck dckVar = (defpackage.dck) bveVarC.f(defpackage.dbl.n);
            j2 = j3;
            v(bkcVar, cfuVar, defpackage.dai.as(1365123137, true, new defpackage.affg() { // from class: bjq
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    int i6 = iIntValue & 3;
                    if (bveVar2.I(i6 != 2, iIntValue & 1)) {
                        final defpackage.bkc bkcVar2 = bkcVar;
                        final defpackage.cgf cgfVar2 = cgfVarA;
                        final boolean z3 = zB;
                        final long j4 = j2;
                        defpackage.dai.aA(defpackage.dbl.n.b(dckVar), defpackage.dai.as(1260045569, true, new defpackage.affg() { // from class: bjs
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                                defpackage.bve bveVar3 = (defpackage.bve) obj3;
                                int iIntValue2 = ((java.lang.Integer) obj4).intValue();
                                if (bveVar3.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    defpackage.bkc bkcVar3 = bkcVar2;
                                    defpackage.cgf cgfVar3 = cgfVar2;
                                    boolean z4 = z3;
                                    long j5 = j4;
                                    if (j5 != 9205357640488583168L) {
                                        bveVar3.v(3458246);
                                        defpackage.atb atbVar = z4 ? defpackage.ata.b : defpackage.ata.a;
                                        defpackage.cgf cgfVarS = defpackage.awj.s(cgfVar3, defpackage.dlt.b(j5), defpackage.dlt.a(j5), 0.0f, 0.0f, 12);
                                        defpackage.cty ctyVarA = defpackage.awb.a(atbVar, defpackage.cfs.m, bveVar3, 0);
                                        int iF = defpackage.a.f(bveVar3.b());
                                        defpackage.cdd cddVarN = bveVar3.N();
                                        defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar3, cgfVarS);
                                        defpackage.afer aferVar = defpackage.cwl.a;
                                        bveVar3.M();
                                        bveVar3.w();
                                        if (bveVar3.G()) {
                                            bveVar3.j(aferVar);
                                        } else {
                                            bveVar3.y();
                                        }
                                        defpackage.byw.c(bveVar3, ctyVarA, defpackage.cwl.e);
                                        defpackage.byw.c(bveVar3, cddVarN, defpackage.cwl.d);
                                        defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                                        defpackage.byw.b(bveVar3, defpackage.cwl.g);
                                        defpackage.byw.c(bveVar3, cgfVarN, defpackage.cwl.c);
                                        defpackage.cgc cgcVar = defpackage.cgf.e;
                                        boolean zE = bveVar3.E(bkcVar3);
                                        java.lang.Object objG = bveVar3.g();
                                        if (zE || objG == defpackage.bvd.a) {
                                            objG = new defpackage.bjd(bkcVar3, 7);
                                            bveVar3.x(objG);
                                        }
                                        defpackage.axd.w(cgcVar, (defpackage.afer) objG, z4, bveVar3, 6);
                                        bveVar3.n();
                                        bveVar3.o();
                                    } else {
                                        bveVar3.v(4389176);
                                        boolean zE2 = bveVar3.E(bkcVar3);
                                        java.lang.Object objG2 = bveVar3.g();
                                        if (zE2 || objG2 == defpackage.bvd.a) {
                                            objG2 = new defpackage.bjd(bkcVar3, 8);
                                            bveVar3.x(objG2);
                                        }
                                        defpackage.axd.w(cgfVar3, (defpackage.afer) objG2, z4, bveVar3, 0);
                                        bveVar3.o();
                                    }
                                } else {
                                    bveVar3.s();
                                }
                                return defpackage.afbk.a;
                            }
                        }, bveVar2), bveVar2, 56);
                    } else {
                        bveVar2.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVarC), bveVarC, i5 | 384);
        } else {
            bveVarC.s();
            j2 = j;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            final long j4 = j2;
            bxlVarJ.c = new defpackage.affg() { // from class: bjr
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj;
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.bkc bkcVar2 = bkcVar;
                    boolean z3 = z;
                    int i6 = i;
                    int i7 = i2 | 1;
                    int i8 = 306783378 & i7;
                    int i9 = 613566756 & i7;
                    defpackage.axd.x(bkcVar2, z3, i6, z2, j4, f, cgfVar, bveVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final defpackage.cjr y(defpackage.chg chgVar, float f) {
        float fCeil = (float) java.lang.Math.ceil(f);
        defpackage.cjr cjrVarF = c;
        defpackage.ckc ckcVarB = a;
        defpackage.cmj cmjVar = b;
        int i = (int) fCeil;
        int i2 = i + i;
        if (cjrVarF == null || ckcVarB == null || i2 > cjrVarF.c() || i2 > cjrVarF.b()) {
            cjrVarF = defpackage.cjv.f(i2, i2, 1, 24);
            c = cjrVarF;
            ckcVarB = defpackage.cjn.b(cjrVarF);
            a = ckcVarB;
        }
        defpackage.cjr cjrVar = cjrVarF;
        defpackage.ckc ckcVar = ckcVarB;
        if (cmjVar == null) {
            cmjVar = new defpackage.cmj();
            b = cmjVar;
        }
        defpackage.cmj cmjVar2 = cmjVar;
        defpackage.dlz dlzVarO = chgVar.o();
        float fC = cjrVar.c();
        float fB = cjrVar.b();
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fC);
        long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fB);
        defpackage.cmh cmhVar = cmjVar2.a;
        defpackage.dlo dloVar = cmhVar.a;
        defpackage.dlz dlzVar = cmhVar.b;
        defpackage.ckc ckcVar2 = cmhVar.c;
        long j = cmhVar.d;
        cmhVar.a = chgVar;
        cmhVar.b = dlzVarO;
        cmhVar.c = ckcVar;
        cmhVar.d = (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
        ckcVar.g();
        defpackage.dai.U(cmjVar2, -72057594037927936L, 0L, cmjVar2.b.a(), 0.0f, null, 58);
        defpackage.dai.U(cmjVar2, -72057594037927936L, 0L, (((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, null, 120);
        defpackage.dai.aF(cmjVar2, -72057594037927936L, f, (((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f)) & 4294967295L), null, 120);
        ckcVar.e();
        cmhVar.a = dloVar;
        cmhVar.b = dlzVar;
        cmhVar.c = ckcVar2;
        cmhVar.d = j;
        return cjrVar;
    }

    public static final int z(boolean z, int i, int i2) {
        if ((z || !B(i)) && i2 > 0) {
            return i2;
        }
        return 1;
    }
}
