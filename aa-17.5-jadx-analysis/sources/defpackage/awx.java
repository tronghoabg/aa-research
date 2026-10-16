package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.HandwritingGesture;
import android.view.textclassifier.TextClassification;
import androidx.car.app.model.Alert;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class awx {
    public static cju a;
    public static cmb b;
    public static cjj c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087 A[Catch: all -> 0x004c, TryCatch #3 {all -> 0x004c, blocks: (B:20:0x0048, B:31:0x007f, B:33:0x0087, B:35:0x0093, B:37:0x009f), top: B:79:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0109 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0032, B:55:0x00f1, B:57:0x00f9, B:59:0x00fd, B:61:0x0109, B:63:0x0115), top: B:75:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [bjx] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [bjx] */
    /* JADX WARN: Type inference failed for: r1v16, types: [bjx] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [bjx] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(defpackage.crl r13, defpackage.bjx r14, defpackage.bwd r15, defpackage.cql r16, defpackage.afck r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awx.A(crl, bjx, bwd, cql, afck):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void B(bjy bjyVar, cfn cfnVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1090171650);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(bjyVar) : buxVarC.E(bjyVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 128 : 256;
        }
        boolean z2 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            boolean z3 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !buxVarC.C(bjyVar))) {
                z = false;
            }
            boolean z4 = z3 | z;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (z4 || objS == buw.a) {
                objS = new bjw(cfnVar, bjyVar);
                bvvVar.ad(objS);
            }
            dnb.b((bjw) objS, null, new dnu(z2, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 1920), afegVar, buxVarC, ((i2 << 3) & 7168) | 384, 2);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new alu(bjyVar, cfnVar, afegVar, i, 6, null);
        }
    }

    public static final void C(cfy cfyVar, afdr afdrVar, boolean z, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(2111672474);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        int i4 = 0;
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            asl.A(awd.k(cfyVar, 25.0f, 25.0f).a(new cfu(new bjp(afdrVar, z, i4))), buxVarC);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jvi(cfyVar, afdrVar, z, i, 1);
        }
    }

    public static final void D(final bjy bjyVar, final boolean z, final int i, final boolean z2, long j, final float f, final cfy cfyVar, bux buxVar, final int i2) {
        int i3;
        final long j2;
        long j3;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(-466280168);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? buxVarC.C(bjyVar) : buxVarC.E(bjyVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.A(i + (-1)) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != buxVarC.D(z2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 524288 : 1048576;
        }
        if (buxVarC.I((533651 & i3) != 533650, i3 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i2 & 1) == 0 || buxVarC.F()) {
                j3 = 9205357640488583168L;
            } else {
                buxVarC.s();
                j3 = j;
            }
            buxVarC.l();
            final boolean zB = z ? bla.b(i, z2) : !bla.b(i, z2);
            cfn cfnVar = zB ? cfk.b : cfk.a;
            int i5 = i3 & 14;
            boolean zD = ((i3 & 112) == 32) | (i5 == 4 || ((i3 & 8) != 0 && buxVarC.E(bjyVar))) | buxVarC.D(zB);
            Object objS = bvvVar.S();
            if (zD || objS == buw.a) {
                objS = new afec() { // from class: bjl
                    @Override // defpackage.afec
                    public final Object invoke(Object obj) {
                        boolean z3 = z;
                        dec decVar = (dec) obj;
                        long jA = bjyVar.a();
                        decVar.a(bla.a, new bkz(z3 ? bdt.b : bdt.c, jA, true != zB ? 3 : 1, (9223372034707292159L & jA) != 9205357640488583168L));
                        return afak.a;
                    }
                };
                bvvVar.ad(objS);
            }
            final cfy cfyVarA = dds.a(cfyVar, false, (afec) objS);
            final dcc dccVar = (dcc) buxVarC.f(dbc.n);
            j2 = j3;
            B(bjyVar, cfnVar, bxc.i(1365123137, true, new afeg() { // from class: bjm
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i6 = iIntValue & 3;
                    if (buxVar2.I(i6 != 2, iIntValue & 1)) {
                        final bjy bjyVar2 = bjyVar;
                        final cfy cfyVar2 = cfyVarA;
                        final boolean z3 = zB;
                        final long j4 = j2;
                        czz.am(dbc.n.b(dccVar), bxc.i(1260045569, true, new afeg() { // from class: bjo
                            @Override // defpackage.afeg
                            public final Object invoke(Object obj3, Object obj4) {
                                bux buxVar3 = (bux) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (buxVar3.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    bjy bjyVar3 = bjyVar2;
                                    cfy cfyVar3 = cfyVar2;
                                    boolean z4 = z3;
                                    long j5 = j4;
                                    if (j5 != 9205357640488583168L) {
                                        buxVar3.v(3458246);
                                        asw aswVar = z4 ? asv.b : asv.a;
                                        cfy cfyVarS = awd.s(cfyVar3, dll.b(j5), dll.a(j5), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12);
                                        ctp ctpVarA = avv.a(aswVar, cfl.m, buxVar3, 0);
                                        int iG = a.g(buxVar3.b());
                                        ccx ccxVarN = buxVar3.N();
                                        cfy cfyVarJ = bzi.j(buxVar3, cfyVarS);
                                        afdr afdrVar = cwb.a;
                                        buxVar3.M();
                                        buxVar3.w();
                                        if (buxVar3.G()) {
                                            buxVar3.j(afdrVar);
                                        } else {
                                            buxVar3.y();
                                        }
                                        byq.c(buxVar3, ctpVarA, cwb.e);
                                        byq.c(buxVar3, ccxVarN, cwb.d);
                                        byq.c(buxVar3, Integer.valueOf(iG), cwb.f);
                                        byq.b(buxVar3, cwb.g);
                                        byq.c(buxVar3, cfyVarJ, cwb.c);
                                        cfv cfvVar = cfy.e;
                                        boolean zE = buxVar3.E(bjyVar3);
                                        Object objG = buxVar3.g();
                                        if (zE || objG == buw.a) {
                                            objG = new bih(bjyVar3, 10);
                                            buxVar3.x(objG);
                                        }
                                        awx.C(cfvVar, (afdr) objG, z4, buxVar3, 6);
                                        buxVar3.n();
                                        buxVar3.o();
                                    } else {
                                        buxVar3.v(4389176);
                                        boolean zE2 = buxVar3.E(bjyVar3);
                                        Object objG2 = buxVar3.g();
                                        if (zE2 || objG2 == buw.a) {
                                            objG2 = new bih(bjyVar3, 11);
                                            buxVar3.x(objG2);
                                        }
                                        awx.C(cfyVar3, (afdr) objG2, z4, buxVar3, 0);
                                        buxVar3.o();
                                    }
                                } else {
                                    buxVar3.s();
                                }
                                return afak.a;
                            }
                        }, buxVar2), buxVar2, 56);
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, i5 | 384);
        } else {
            buxVarC.s();
            j2 = j;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            final long j4 = j2;
            bxfVarJ.c = new afeg() { // from class: bjn
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    bjy bjyVar2 = bjyVar;
                    boolean z3 = z;
                    int i6 = i;
                    int i7 = i2 | 1;
                    int i8 = 306783378 & i7;
                    int i9 = 613566756 & i7;
                    awx.D(bjyVar2, z3, i6, z2, j4, f, cfyVar, buxVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
                    return afak.a;
                }
            };
        }
    }

    public static final cjj E(cgz cgzVar, float f) {
        float fCeil = (float) Math.ceil(f);
        cjj cjjVarY = c;
        cju cjuVarB = a;
        cmb cmbVar = b;
        int i = (int) fCeil;
        int i2 = i + i;
        if (cjjVarY == null || cjuVarB == null || i2 > cjjVarY.c() || i2 > cjjVarY.b()) {
            cjjVarY = czz.Y(i2, i2, 1, 24);
            c = cjjVarY;
            cjuVarB = cjf.b(cjjVarY);
            a = cjuVarB;
        }
        cjj cjjVar = cjjVarY;
        cju cjuVar = cjuVarB;
        if (cmbVar == null) {
            cmbVar = new cmb();
            b = cmbVar;
        }
        cmb cmbVar2 = cmbVar;
        dlr dlrVarO = cgzVar.o();
        float fC = cjjVar.c();
        float fB = cjjVar.b();
        long jFloatToRawIntBits = Float.floatToRawIntBits(fC);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fB);
        clz clzVar = cmbVar2.a;
        dlg dlgVar = clzVar.a;
        dlr dlrVar = clzVar.b;
        cju cjuVar2 = clzVar.c;
        long j = clzVar.d;
        clzVar.a = cgzVar;
        clzVar.b = dlrVarO;
        clzVar.c = cjuVar;
        clzVar.d = (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
        cjuVar.g();
        czz.I(cmbVar2, -72057594037927936L, 0L, cmbVar2.b.a(), BitmapDescriptorFactory.HUE_RED, null, 58);
        czz.I(cmbVar2, -72057594037927936L, 0L, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), BitmapDescriptorFactory.HUE_RED, null, 120);
        czz.aH(cmbVar2, -72057594037927936L, f, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), null, 120);
        cjuVar.e();
        clzVar.a = dlgVar;
        clzVar.b = dlrVar;
        clzVar.c = cjuVar2;
        clzVar.d = j;
        return cjjVar;
    }

    public static final int F(boolean z, int i, int i2) {
        if ((z || !H(i)) && i2 > 0) {
            return i2;
        }
        return 1;
    }

    public static final int G(long j, boolean z, int i, float f) {
        int iB = Alert.DURATION_SHOW_INDEFINITELY;
        if ((z || H(i)) && dle.h(j)) {
            iB = dle.b(j);
        }
        if (dle.d(j) == iB) {
            return iB;
        }
        return afpt.g(Math.round((float) Math.ceil(f)), dle.d(j), iB);
    }

    public static final boolean H(int i) {
        return i == 2 || i == 4;
    }

    public static final boolean I(cjb cjbVar, float f, float f2) {
        if (f > cjbVar.d || cjbVar.b > f) {
            return false;
        }
        return f2 <= cjbVar.e && cjbVar.c <= f2;
    }

    public static final bis J(bis bisVar, dlr dlrVar, dfw dfwVar, dlg dlgVar, wci wciVar) {
        return (bisVar != null && dlrVar == bisVar.a && affa.f(dao.g(dfwVar, dlrVar), bisVar.b) && dlgVar.a() == ((dlh) bisVar.c).a && wciVar == bisVar.d) ? bisVar : new bis(dlrVar, dao.g(dfwVar, dlrVar), new dlh(dlgVar.a(), dlgVar.b()), wciVar);
    }

    public static final int K(dfb dfbVar, long j, dcc dccVar) {
        float fA = dccVar != null ? dccVar.a() : BitmapDescriptorFactory.HUE_RED;
        int i = (int) (4294967295L & j);
        int iE = dfbVar.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) >= dfbVar.b(iE) - fA && Float.intBitsToFloat(i) <= dfbVar.a(iE) + fA) {
            int i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) >= (-fA)) {
                if (Float.intBitsToFloat(i2) <= dfbVar.d + fA) {
                    return iE;
                }
            }
        }
        return -1;
    }

    public static final int L(bed bedVar, long j, dcc dccVar) {
        cst cstVarE;
        long jM;
        dfb dfbVar;
        int iK;
        bff bffVarD = bedVar.d();
        if (bffVarD == null || (cstVarE = bedVar.e()) == null || (iK = K((dfbVar = bffVarD.a.b), (jM = cstVarE.m(j)), dccVar)) == -1) {
            return -1;
        }
        return dfbVar.f(cja.e(jM, (dfbVar.b(iK) + dfbVar.a(iK)) / 2.0f, 1));
    }

    public static final long M(bed bedVar, cjb cjbVar, int i, dfr dfrVar) {
        bff bffVarD = bedVar.d();
        dfb dfbVar = bffVarD != null ? bffVarD.a.b : null;
        cst cstVarE = bedVar.e();
        return (dfbVar == null || cstVarE == null) ? dfv.a : dfbVar.g(cjbVar.f(cstVarE.m(0L)), i, dfrVar);
    }

    public static final long N(bed bedVar, cjb cjbVar, cjb cjbVar2, int i, dfr dfrVar) {
        long jM = M(bedVar, cjbVar, i, dfrVar);
        if (dfv.i(jM)) {
            return dfv.a;
        }
        long jM2 = M(bedVar, cjbVar2, i, dfrVar);
        if (dfv.i(jM2)) {
            return dfv.a;
        }
        return czz.t(Math.min(dfv.e(jM), dfv.e(jM)), Math.max(dfv.a(jM2), dfv.a(jM2)));
    }

    public static final long O(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final boolean P(dft dftVar, int i) {
        int iG = dftVar.g(i);
        return (i == dftVar.i(iG) || i == dftVar.f(iG, false)) ? dftVar.q(i) != dftVar.p(i) : dftVar.p(i) != dftVar.p(i + (-1));
    }

    public static final boolean Q(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean R(int i) {
        int type;
        return (!Q(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static final int S(HandwritingGesture handwritingGesture, afec afecVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        afecVar.invoke(new diu(fallbackText, 1));
        return 5;
    }

    public static final void T(long j, deu deuVar, boolean z, afec afecVar) {
        if (z) {
            int iE = dfv.e(j);
            int iA = dfv.a(j);
            int iCodePointBefore = iE > 0 ? Character.codePointBefore(deuVar, iE) : 10;
            int iCodePointAt = iA < deuVar.a() ? Character.codePointAt(deuVar, iA) : 10;
            if (R(iCodePointBefore) && (Q(iCodePointAt) || aclh.x(iCodePointAt))) {
                do {
                    iE -= Character.charCount(iCodePointBefore);
                    if (iE == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(deuVar, iE);
                    }
                } while (R(iCodePointBefore));
                j = czz.t(iE, iA);
            } else if (R(iCodePointAt) && (Q(iCodePointBefore) || aclh.x(iCodePointBefore))) {
                do {
                    iA += Character.charCount(iCodePointAt);
                    if (iA == deuVar.a()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(deuVar, iA);
                    }
                } while (R(iCodePointAt));
                j = czz.t(iE, iA);
            }
        }
        afecVar.invoke(new big(new diz[]{new dju(dfv.a(j), dfv.a(j)), new dix(dfv.b(j), 0)}));
    }

    public static final void U(int i, String str, afec afecVar) {
        afecVar.invoke(new big(new diz[]{new dju(i, i), new diu(str, 1)}));
    }

    public static final void V(long j, blr blrVar, afec afecVar) {
        afecVar.invoke(new dju(dfv.e(j), dfv.a(j)));
        if (blrVar != null) {
            blrVar.j(true);
        }
    }

    public static final int W(int i) {
        return i != 1 ? 0 : 1;
    }

    public static final bhl X(afej afejVar, bux buxVar, int i) {
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !buxVar.C(afejVar)) && (i & 6) != 4) {
            z = false;
        }
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        if (z || objS == buw.a) {
            objS = new bhl(afejVar);
            bvvVar.ad(objS);
        }
        bhl bhlVar = (bhl) objS;
        boolean zC = buxVar.C(bhlVar);
        Object objS2 = bvvVar.S();
        if (zC || objS2 == buw.a) {
            objS2 = new bgb(bhlVar, 11);
            bvvVar.ad(objS2);
        }
        bvq.c(bhlVar, (afec) objS2, buxVar);
        return bhlVar;
    }

    public static final void Y(cfy cfyVar, bvf bvfVar, afej afejVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-714464401);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(bvfVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afejVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(null, bxp.b);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            bhl bhlVarX = X(afejVar, buxVarC, (i2 >> 6) & 14);
            czz.am(bvfVar.b(bhlVarX), bxc.i(274270255, true, new bhm(cfyVar, (bwq) objS, afegVar, bhlVarX, 0), buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bhn(cfyVar, bvfVar, afejVar, afegVar, i, 0);
        }
    }

    public static final bfu Z(cwd cwdVar) {
        bii biiVar = new bii((char[]) null);
        czz.o(cwdVar, bhb.a, new bgb(new bgb(biiVar, 10), 9));
        aag aagVar = new aag(16);
        aag aagVar2 = (aag) biiVar.b;
        Object[] objArr = aagVar2.a;
        int i = aagVar2.b;
        bft bftVar = null;
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            bft bftVar2 = (bft) objArr[i2];
            if (z && bftVar2 == bfx.b) {
                z = true;
            } else {
                if (asl.Q(bftVar2) && asl.Q(bftVar)) {
                    z = false;
                    break;
                    break;
                }
                if (!asl.Q(bftVar2)) {
                    aag aagVar3 = (aag) biiVar.a;
                    Object[] objArr2 = aagVar3.a;
                    int i3 = aagVar3.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (!((Boolean) ((afec) objArr2[i4]).invoke(bftVar2)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                aagVar.p(bftVar2);
                z = false;
                bftVar = bftVar2;
            }
        }
        if (asl.Q((bft) (aagVar.f() ? null : aagVar.a[aagVar.b - 1]))) {
            aagVar.h(aagVar.b - 1);
        }
        return new bfu(aagVar.j());
    }

    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final ActionMode aa(View view, bgd bgdVar) {
        return view.startActionMode(new bgn(bgdVar), 1);
    }

    public static final void ab(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        if (Build.VERSION.SDK_INT >= 34) {
            ad(pendingIntent);
        } else {
            pendingIntent.send();
        }
    }

    public static final void ac(Context context, TextClassification textClassification) throws PendingIntent.CanceledException {
        String text = textClassification.getText();
        ab(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
    }

    public static final void ad(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        try {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            if (Build.VERSION.SDK_INT >= 36) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(activityOptionsMakeBasic.toBundle());
        } catch (PendingIntent.CanceledException e) {
            Log.e("TextClassification", a.bt(e, pendingIntent, "error sending pendingIntent: ", " error: "));
        }
    }

    public static final void ae(cfy cfyVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(790527681);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(null, bxp.b);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new beg(bwqVar, 10);
                bvvVar.ad(objS2);
            }
            afdr afdrVar = (afdr) objS2;
            bhl bhlVarX = X(bgj.b, buxVarC, 6);
            czz.an(new bxe[]{bhq.b.b(asl.O(afdrVar, buxVarC)), bhq.a.b(bhlVarX)}, bxc.i(1070596993, true, new ltb(cfyVar, bwqVar, afegVar, bhlVarX, afdrVar, 1), buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afz(cfyVar, afegVar, i, 13);
        }
    }

    public static final void af(cfy cfyVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(155925518);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        int i4 = 14;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            boolean z = buxVarC.f(bhq.a) != null;
            boolean z2 = buxVarC.f(bhq.b) != null;
            if (z && z2) {
                buxVarC.v(-1977187922);
                ctp ctpVarB = atk.b(cfl.a, true);
                bvv bvvVar = (bvv) buxVarC;
                int iG = a.g(bvvVar.u);
                ccx ccxVarAh = bvvVar.ah();
                cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
                afdr afdrVar = cwb.a;
                buxVarC.w();
                if (bvvVar.t) {
                    buxVarC.j(afdrVar);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarB, cwb.e);
                byq.c(buxVarC, ccxVarAh, cwb.d);
                byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
                byq.b(buxVarC, cwb.g);
                byq.c(buxVarC, cfyVarJ, cwb.c);
                afegVar.invoke(buxVarC, Integer.valueOf((i2 >> 3) & 14));
                bvvVar.Y(true);
                bvvVar.Y(false);
            } else {
                int i5 = (i2 & 14) | (i2 & 112);
                if (z) {
                    buxVarC.v(-1976997706);
                    asl.N(cfyVar, afegVar, buxVarC, i5);
                    ((bvv) buxVarC).Y(false);
                } else if (z2) {
                    buxVarC.v(-1976846922);
                    bgm.d(cfyVar, afegVar, buxVarC, i5);
                    ((bvv) buxVarC).Y(false);
                } else {
                    buxVarC.v(-1976716505);
                    ae(cfyVar, afegVar, buxVarC, i5);
                    ((bvv) buxVarC).Y(false);
                }
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afz(cfyVar, afegVar, i, i4);
        }
    }

    public static final zf ag(azh azhVar, azq azqVar, kwp kwpVar) {
        int i;
        int iMin;
        List listE = ((SnapshotStateList) azqVar.a).e();
        if (!kwpVar.u() && listE.isEmpty()) {
            return zg.a;
        }
        zf zfVar = new zf(16);
        if (kwpVar.u()) {
            byw bywVar = (byw) kwpVar.a;
            i = ((ayp) bywVar.b()).a;
            Object[] objArr = bywVar.a;
            int i2 = bywVar.b;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = ((ayp) objArr[i3]).a;
                if (i4 < i) {
                    i = i4;
                }
            }
            if (i < 0) {
                asl.c("negative minIndex");
            }
            int i5 = ((ayp) bywVar.b()).b;
            Object[] objArr2 = bywVar.a;
            int i6 = bywVar.b;
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = ((ayp) objArr2[i7]).b;
                if (i8 > i5) {
                    i5 = i8;
                }
            }
            iMin = Math.min(i5, azhVar.b() - 1);
        } else {
            i = 1;
            iMin = 0;
        }
        int size = listE.size();
        for (int i9 = 0; i9 < size; i9++) {
            azp azpVar = (azp) listE.get(i9);
            int iO = o(azhVar, azpVar.a, azpVar.b);
            if ((i > iO || iO > iMin) && iO >= 0 && iO < azhVar.b()) {
                zfVar.e(iO);
            }
        }
        if (i <= iMin) {
            while (true) {
                zfVar.e(i);
                if (i == iMin) {
                    break;
                }
                i++;
            }
        }
        zfVar.d();
        return zfVar;
    }

    private static final bkj ah(aezr aezrVar) {
        return (bkj) aezrVar.a();
    }

    private static final bkj ai(bkh bkhVar, boolean z, boolean z2, bjt bjtVar) {
        long jA = bjtVar.a(bkhVar, z2 ? bkhVar.a : bkhVar.b);
        return bkhVar.a(z ^ z2 ? dfv.e(jA) : dfv.a(jA));
    }

    public static final void b(String str) {
        throw new IllegalStateException("All weights <= 0 should have placeables");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.cfy r28, defpackage.axr r29, defpackage.avp r30, defpackage.atc r31, defpackage.cfm r32, defpackage.aom r33, boolean r34, defpackage.aiu r35, defpackage.afec r36, defpackage.bux r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awx.c(cfy, axr, avp, atc, cfm, aom, boolean, aiu, afec, bux, int, int):void");
    }

    public static final void d(final cfy cfyVar, final axr axrVar, avp avpVar, final asw aswVar, cfr cfrVar, aom aomVar, boolean z, aiu aiuVar, final afec afecVar, bux buxVar, final int i) {
        cfy cfyVar2;
        int i2;
        asw aswVar2;
        bux buxVar2;
        final avp avpVar2;
        final cfr cfrVar2;
        final aom aomVar2;
        final boolean z2;
        final aiu aiuVar2;
        boolean z3;
        cfr cfrVar3;
        aom aomVarAB;
        aiu aiuVarA;
        avp avpVar3;
        bux buxVarC = buxVar.c(-1884325601);
        if ((i & 6) == 0) {
            cfyVar2 = cfyVar;
            i2 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i;
        } else {
            cfyVar2 = cfyVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(axrVar) ? 16 : 32;
        }
        int i3 = i2 | 3456;
        if ((i & 24576) == 0) {
            aswVar2 = aswVar;
            i3 |= true != buxVarC.C(aswVar2) ? 8192 : 16384;
        } else {
            aswVar2 = aswVar;
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
            i5 |= true != buxVarC.E(afecVar) ? 268435456 : 536870912;
        }
        if (buxVarC.I((306783379 & i5) != 306783378, i5 & 1)) {
            int i6 = i5 >> 18;
            int i7 = (-238551041) & i5;
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                avr avrVar = new avr(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                z3 = true;
                cfrVar3 = cfl.m;
                aomVarAB = ca.aB(buxVarC);
                aiuVarA = akx.a(buxVarC);
                avpVar3 = avrVar;
            } else {
                buxVarC.s();
                avpVar3 = avpVar;
                cfrVar3 = cfrVar;
                aomVarAB = aomVar;
                z3 = z;
                aiuVarA = aiuVar;
            }
            buxVarC.l();
            buxVar2 = buxVarC;
            e(cfyVar2, axrVar, avpVar3, false, aomVarAB, z3, aiuVarA, null, null, cfrVar3, aswVar2, afecVar, buxVar2, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (3670016 & (i7 >> 3)), ((i7 >> 12) & 112) | ((i7 >> 6) & 896) | (i6 & 7168), 1792);
            avpVar2 = avpVar3;
            aomVar2 = aomVarAB;
            z2 = z3;
            aiuVar2 = aiuVarA;
            cfrVar2 = cfrVar3;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            avpVar2 = avpVar;
            cfrVar2 = cfrVar;
            aomVar2 = aomVar;
            z2 = z;
            aiuVar2 = aiuVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: axa
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar3 = (bux) obj;
                    ((Integer) obj2).intValue();
                    cfy cfyVar3 = cfyVar;
                    axr axrVar2 = axrVar;
                    avp avpVar4 = avpVar2;
                    asw aswVar3 = aswVar;
                    cfr cfrVar4 = cfrVar2;
                    int i8 = i | 1;
                    int i9 = 306783378 & i8;
                    int i10 = 613566756 & i8;
                    awx.d(cfyVar3, axrVar2, avpVar4, aswVar3, cfrVar4, aomVar2, z2, aiuVar2, afecVar, buxVar3, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 + i9) & i10));
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:335:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.cfy r37, defpackage.axr r38, final defpackage.avp r39, final boolean r40, final defpackage.aom r41, final boolean r42, final defpackage.aiu r43, defpackage.cfm r44, defpackage.atc r45, defpackage.cfr r46, defpackage.asw r47, final defpackage.afec r48, defpackage.bux r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 1389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awx.e(cfy, axr, avp, boolean, aom, boolean, aiu, cfm, atc, cfr, asw, afec, bux, int, int, int):void");
    }

    public static /* synthetic */ cfy f() {
        aft aftVar = new aft(1.0f, 400.0f, null);
        Map map = ahc.a;
        return new ayn(aftVar, new aft(1.0f, 400.0f, new dlo(4294967297L)), new aft(1.0f, 400.0f, null));
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

    public static final int h(axj axjVar) {
        List list = axjVar.j;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((axk) list.get(i2)).i;
        }
        return (i / list.size()) + axjVar.p;
    }

    public static final int i(axk axkVar, boolean z) {
        long jB = axkVar.b(0);
        return (int) (z ? 4294967295L & jB : jB >> 32);
    }

    public static final boolean j(azu azuVar, int i) {
        return i <= azuVar.e() && azuVar.b() <= i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0 A[Catch: aym -> 0x018a, TryCatch #6 {aym -> 0x018a, blocks: (B:32:0x00bc, B:34:0x00c0, B:36:0x00c6, B:38:0x00d3, B:44:0x00e5, B:48:0x0112), top: B:101:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3 A[Catch: aym -> 0x018a, TryCatch #6 {aym -> 0x018a, blocks: (B:32:0x00bc, B:34:0x00c0, B:36:0x00c6, B:38:0x00d3, B:44:0x00e5, B:48:0x0112), top: B:101:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0162 -> B:99:0x016a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.azu r27, int r28, int r29, defpackage.dlg r30, defpackage.afck r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awx.k(azu, int, int, dlg, afck):java.lang.Object");
    }

    public static final boolean l(boolean z, azu azuVar, int i) {
        if (z) {
            if (azuVar.b() > i) {
                return true;
            }
            return azuVar.b() == i && azuVar.c() > 0;
        }
        if (azuVar.b() < i) {
            return true;
        }
        return azuVar.b() == i && azuVar.c() < 0;
    }

    public static final void m(Object obj, int i, azq azqVar, afeg afegVar, bux buxVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(872548579);
        if (i4 == 0) {
            i3 = (true != buxVarC.E(obj) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 16;
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.A(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.E(azqVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != buxVarC.E(afegVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i3 & 1171) != 1170, i3 & 1)) {
            boolean zC = buxVarC.C(obj) | buxVarC.C(azqVar);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                objS = new azp(obj, azqVar);
                bvvVar.ad(objS);
            }
            azp azpVar = (azp) objS;
            azpVar.b = i;
            azp azpVar2 = (azp) buxVarC.f(cum.a);
            cec cecVar = (cec) cek.i.j();
            afec afecVarI = cecVar != null ? cecVar.i() : null;
            cec cecVarI = byx.i(cecVar);
            try {
                if (azpVar2 != azpVar.c()) {
                    azpVar.e.b(azpVar2);
                    if (azpVar.c > 0) {
                        azp azpVar3 = azpVar.f;
                        if (azpVar3 != null) {
                            azpVar3.a();
                        }
                        if (azpVar2 != null) {
                            azpVar2.d();
                        } else {
                            azpVar2 = null;
                        }
                        azpVar.f = azpVar2;
                    }
                }
                byx.l(cecVar, cecVarI, afecVarI);
                boolean zC2 = buxVarC.C(azpVar);
                Object objS2 = bvvVar.S();
                if (zC2 || objS2 == buw.a) {
                    objS2 = new aui(azpVar, i5);
                    bvvVar.ad(objS2);
                }
                bvq.c(azpVar, (afec) objS2, buxVarC);
                czz.am(cum.a.b(azpVar), afegVar, buxVarC, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                byx.l(cecVar, cecVarI, afecVarI);
                throw th;
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new azg(obj, i, azqVar, afegVar, i2, 2);
        }
    }

    public static final void n(afdr afdrVar, cfy cfyVar, azt aztVar, azj azjVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1055276397);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afdrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(aztVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? buxVarC.C(azjVar) : buxVarC.E(azjVar)) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            afp.ae(bxc.i(-933153643, true, new abt(aztVar, cfyVar, azjVar, byx.c(afdrVar, buxVarC), 2), buxVarC), buxVarC, 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bhn(afdrVar, cfyVar, aztVar, azjVar, i, 1);
        }
    }

    public static final int o(azh azhVar, Object obj, int i) {
        int iA;
        return (obj == null || azhVar.b() == 0 || (i < azhVar.b() && affa.f(obj, azhVar.d(i))) || (iA = azhVar.a(obj)) == -1) ? i : iA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(azh azhVar, Object obj, int i, Object obj2, bux buxVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(1439843069);
        if (i4 == 0) {
            i3 = (true != buxVarC.C(azhVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.C(obj) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.A(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != buxVarC.C(obj2) ? 1024 : 2048;
        }
        if (buxVarC.I((i3 & 1171) != 1170, i3 & 1)) {
            obj.c(obj2, bxc.i(980966366, true, new afz(azhVar, i, obj2, 5), buxVarC), buxVarC, 48);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new azg(azhVar, obj, i, obj2, i2, 0);
        }
    }

    public static final int q(byw bywVar, int i) {
        int i2 = bywVar.b - 1;
        int i3 = 0;
        while (i3 < i2) {
            Object[] objArr = bywVar.a;
            int i4 = ((i2 - i3) / 2) + i3;
            int i5 = ((os) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((os) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final Object r(cqz cqzVar, bjx bjxVar, ben benVar, afck afckVar) {
        Object objAK = ca.aK(cqzVar, new bks(new bwd(cqzVar.n()), bjxVar, benVar, null), afckVar);
        return objAK == afcr.a ? objAK : afak.a;
    }

    public static final boolean s(dcc dccVar, cqu cquVar, cqu cquVar2) {
        return cja.a(aclh.y(cquVar.c, cquVar2.c)) < ca.aM(dccVar, cquVar.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.crl r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.bkr
            if (r0 == 0) goto L13
            r0 = r8
            bkr r0 = (defpackage.bkr) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            bkr r0 = new bkr
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            crl r7 = r0.c
            defpackage.woy.dF(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.woy.dF(r8)
        L34:
            cqm r8 = defpackage.cqm.b
            r0.c = r7
            r0.b = r3
            java.lang.Object r8 = r7.r(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            cql r8 = (defpackage.cql) r8
            java.util.List r2 = r8.a
            int r4 = r2.size()
            r5 = 0
        L4a:
            if (r5 >= r4) goto L5c
            java.lang.Object r6 = r2.get(r5)
            cqu r6 = (defpackage.cqu) r6
            boolean r6 = defpackage.tl.j(r6)
            if (r6 != 0) goto L59
            goto L34
        L59:
            int r5 = r5 + 1
            goto L4a
        L5c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awx.t(crl, afck):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        if (r11 != r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.crl r8, defpackage.ben r9, defpackage.cql r10, defpackage.afck r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof defpackage.bku
            if (r0 == 0) goto L13
            r0 = r11
            bku r0 = (defpackage.bku) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bku r0 = new bku
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r9 = r0.a
            crl r8 = r0.e
            defpackage.woy.dF(r11)     // Catch: java.util.concurrent.CancellationException -> L43
            goto L8e
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            cqu r8 = r0.d
            java.lang.Object r9 = r0.a
            crl r10 = r0.e
            defpackage.woy.dF(r11)     // Catch: java.util.concurrent.CancellationException -> L43
            r7 = r10
            r10 = r8
            r8 = r7
            goto L62
        L43:
            r8 = move-exception
            goto Lc1
        L46:
            defpackage.woy.dF(r11)
            java.util.List r10 = r10.a     // Catch: java.util.concurrent.CancellationException -> L43
            java.lang.Object r10 = defpackage.woy.bF(r10)     // Catch: java.util.concurrent.CancellationException -> L43
            cqu r10 = (defpackage.cqu) r10     // Catch: java.util.concurrent.CancellationException -> L43
            long r5 = r10.a     // Catch: java.util.concurrent.CancellationException -> L43
            r0.e = r8     // Catch: java.util.concurrent.CancellationException -> L43
            r0.a = r9     // Catch: java.util.concurrent.CancellationException -> L43
            r0.d = r10     // Catch: java.util.concurrent.CancellationException -> L43
            r0.c = r4     // Catch: java.util.concurrent.CancellationException -> L43
            java.lang.Object r11 = defpackage.ca.aP(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L43
            if (r11 != r1) goto L62
            goto Lbd
        L62:
            cqu r11 = (defpackage.cqu) r11     // Catch: java.util.concurrent.CancellationException -> L43
            if (r11 == 0) goto Lbe
            dcc r2 = r8.q()     // Catch: java.util.concurrent.CancellationException -> L43
            boolean r10 = s(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L43
            if (r10 == 0) goto Lbe
            long r4 = r11.c     // Catch: java.util.concurrent.CancellationException -> L43
            bko r10 = defpackage.bky.a     // Catch: java.util.concurrent.CancellationException -> L43
            r9.c(r4, r10)     // Catch: java.util.concurrent.CancellationException -> L43
            long r10 = r11.a     // Catch: java.util.concurrent.CancellationException -> L43
            bji r2 = new bji     // Catch: java.util.concurrent.CancellationException -> L43
            r4 = 6
            r2.<init>(r9, r4)     // Catch: java.util.concurrent.CancellationException -> L43
            r0.e = r8     // Catch: java.util.concurrent.CancellationException -> L43
            r0.a = r9     // Catch: java.util.concurrent.CancellationException -> L43
            r4 = 0
            r0.d = r4     // Catch: java.util.concurrent.CancellationException -> L43
            r0.c = r3     // Catch: java.util.concurrent.CancellationException -> L43
            java.lang.Object r11 = defpackage.ca.aS(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L43
            if (r11 == r1) goto Lbd
        L8e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L43
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L43
            if (r10 == 0) goto Lb9
            cql r8 = r8.p()     // Catch: java.util.concurrent.CancellationException -> L43
            java.util.List r8 = r8.a     // Catch: java.util.concurrent.CancellationException -> L43
            int r10 = r8.size()     // Catch: java.util.concurrent.CancellationException -> L43
            r11 = 0
        La1:
            if (r11 >= r10) goto Lb5
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L43
            cqu r0 = (defpackage.cqu) r0     // Catch: java.util.concurrent.CancellationException -> L43
            boolean r1 = defpackage.tl.l(r0)     // Catch: java.util.concurrent.CancellationException -> L43
            if (r1 == 0) goto Lb2
            r0.b()     // Catch: java.util.concurrent.CancellationException -> L43
        Lb2:
            int r11 = r11 + 1
            goto La1
        Lb5:
            r9.d()     // Catch: java.util.concurrent.CancellationException -> L43
            goto Lbe
        Lb9:
            r9.a()     // Catch: java.util.concurrent.CancellationException -> L43
            goto Lbe
        Lbd:
            return r1
        Lbe:
            afak r8 = defpackage.afak.a
            return r8
        Lc1:
            r9.a()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awx.u(crl, ben, cql, afck):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c5, code lost:
    
        if (r14 != r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(defpackage.crl r10, defpackage.ben r11, defpackage.cql r12, int r13, defpackage.afck r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awx.v(crl, ben, cql, int, afck):java.lang.Object");
    }

    public static final int w(aezr aezrVar) {
        return ((Number) aezrVar.a()).intValue();
    }

    public static final bkj x(bkj bkjVar, bkh bkhVar, int i) {
        int iP = bkhVar.d.p(i);
        long j = bkjVar.b;
        return new bkj(iP, i);
    }

    public static final bkj y(final blf blfVar, final bkh bkhVar, bkj bkjVar) {
        boolean z = blfVar.a;
        final int i = z ? bkhVar.a : bkhVar.b;
        final aezr aezrVarDH = woy.dH(3, new bkp(bkhVar, i, 0));
        final int i2 = z ? bkhVar.b : bkhVar.a;
        aezr aezrVarDH2 = woy.dH(3, new afdr() { // from class: bkq
            @Override // defpackage.afdr
            public final Object invoke() {
                bkh bkhVar2 = bkhVar;
                dft dftVar = bkhVar2.d;
                int iW = awx.w(aezrVarDH);
                blf blfVar2 = blfVar;
                int iA = blfVar2.a();
                int i3 = i;
                long jK = dftVar.k(i3);
                int iE = dftVar.g(dfv.e(jK)) == iW ? dfv.e(jK) : iW >= dftVar.e() ? dftVar.i(dftVar.e() - 1) : dftVar.i(iW);
                int iA2 = dftVar.g(dfv.a(jK)) == iW ? dfv.a(jK) : iW >= dftVar.e() ? dftVar.f(dftVar.e() - 1, false) : dftVar.f(iW, false);
                int i4 = i2;
                if (iE == i4) {
                    return bkhVar2.a(iA2);
                }
                if (iA2 == i4) {
                    return bkhVar2.a(iE);
                }
                if (!(blfVar2.a ^ (iA == 1)) ? i3 >= iE : i3 > iA2) {
                    iE = iA2;
                }
                return bkhVar2.a(iE);
            }
        });
        long j = bkjVar.b;
        int i3 = bkhVar.c;
        if (i == i3) {
            return bkjVar;
        }
        dft dftVar = bkhVar.d;
        if (w(aezrVarDH) != dftVar.g(i3)) {
            return ah(aezrVarDH2);
        }
        int i4 = bkjVar.a;
        long jK = dftVar.k(i4);
        if (i3 != -1) {
            if (i != i3) {
                if (((z ? 1 : 0) ^ (bkhVar.c() == 1 ? 1 : 0)) == 0) {
                }
            }
            return bkhVar.a(i);
        }
        return (i4 == dfv.e(jK) || i4 == dfv.a(jK)) ? ah(aezrVarDH2) : bkhVar.a(i);
    }

    public static final bkk z(blf blfVar, bjt bjtVar) {
        boolean z = blfVar.a() == 1;
        bkh bkhVar = blfVar.c;
        return new bkk(ai(bkhVar, z, true, bjtVar), ai(bkhVar, z, false, bjtVar), z);
    }
}
