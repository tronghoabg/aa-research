package defpackage;

import android.view.KeyEvent;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class afp {
    public static final void A(cfy cfyVar, afec afecVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1162737955);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C("") ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            cfy cfyVarA = cfyVar.a(new chb(afecVar));
            int i4 = i2 & 112;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (i4 == 32 || objS == buw.a) {
                objS = new acm(7);
                bvvVar.ad(objS);
            }
            AtomicInteger atomicInteger = dds.a;
            asl.A(cfyVarA.a(new ddg(false, (afec) objS)), buxVarC);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afz(cfyVar, afecVar, i, 3);
        }
    }

    public static final ajh B(float f, long j) {
        return new ajh(f, new ckx(j));
    }

    public static final long C(long j, float f) {
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    public static final cfy D(cfy cfyVar, float f, long j, ckv ckvVar) {
        return cfyVar.a(new ajg(f, new ckx(j), ckvVar));
    }

    public static final cfy E(cfy cfyVar, long j, ckv ckvVar) {
        return cfyVar.a(new aix(j, ckvVar));
    }

    public static final void G(blr blrVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(2080741862);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(blrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            H(blrVar, afegVar, buxVarC, i2 & 126);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afz(blrVar, afegVar, i, 8);
        }
    }

    public static final void H(blr blrVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1533506138);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(blrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            buxVarC.v(-885604480);
            awx.af(!blrVar.v() ? cfy.e : new bhc(new beo(blrVar, (afck) null, 3)).a(new bhh(blrVar.w, new blh(blrVar, (afck) null, 0), new bli(blrVar, (afck) null, 0), new bji(blrVar, 9))), afegVar, buxVarC, i2 & 112);
            ((bvv) buxVarC).Y(false);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afz(blrVar, afegVar, i, 7);
        }
    }

    public static final List I(List list, afdr afdrVar) {
        int iB;
        int iA;
        Object begVar;
        if (!((Boolean) afdrVar.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cto ctoVar = (cto) list.get(i);
            Object objG = ctoVar.g();
            objG.getClass();
            cdt cdtVar = ((bfk) objG).a;
            dft dftVarA = ((bfh) cdtVar.b).a();
            if (dftVarA == null) {
                begVar = new acf(16);
            } else {
                det detVarD = bfh.d((det) cdtVar.a, dftVarA);
                if (detVarD == null) {
                    begVar = new acf(17);
                } else {
                    dlp dlpVarQ = dlf.q(dftVarA.r(detVarD.b, detVarD.c).b());
                    iB = dlpVarQ.b();
                    iA = dlpVarQ.a();
                    begVar = new beg(dlpVarQ, 6);
                    arrayList.add(new aezu(ctoVar.v(dlf.u(iB, iB, iA, iA)), begVar));
                }
            }
            iB = 0;
            iA = 0;
            arrayList.add(new aezu(ctoVar.v(dlf.u(iB, iB, iA, iA)), begVar));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void J(final java.lang.String r32, defpackage.cfy r33, defpackage.dfw r34, int r35, boolean r36, int r37, int r38, defpackage.bux r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afp.J(java.lang.String, cfy, dfw, int, boolean, int, int, bux, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void K(final defpackage.deu r29, final defpackage.cfy r30, final defpackage.dfw r31, final defpackage.afec r32, final int r33, final boolean r34, final int r35, final int r36, final java.util.Map r37, defpackage.bux r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afp.K(deu, cfy, dfw, afec, int, boolean, int, int, java.util.Map, bux, int, int):void");
    }

    public static final void L(final djv djvVar, final afec afecVar, final cfy cfyVar, final dfw dfwVar, bec becVar, beb bebVar, int i, int i2, dka dkaVar, afec afecVar2, final cjs cjsVar, final afeh afehVar, bux buxVar, final int i3, final int i4) {
        int i5;
        final bec becVar2;
        final beb bebVar2;
        final int i6;
        final int i7;
        final dka dkaVar2;
        final afec afecVar3;
        afec afecVar4;
        bec becVar3;
        beb bebVar3;
        dka dkaVar3;
        int i8;
        int i9;
        bec becVar4;
        bux buxVarC = buxVar.c(-971111025);
        if ((i3 & 6) == 0) {
            i5 = (true != buxVarC.C(djvVar) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != buxVarC.E(afecVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i5 |= true != buxVarC.D(false) ? 1024 : 2048;
        }
        int i10 = i5 | 24576;
        if ((i3 & 196608) == 0) {
            i10 |= true != buxVarC.C(dfwVar) ? 65536 : 131072;
        }
        int i11 = i10 | 14155776;
        if ((100663296 & i3) == 0) {
            i11 |= true != buxVarC.D(true) ? 33554432 : 67108864;
        }
        if ((805306368 & i3) == 0) {
            i11 |= 268435456;
        }
        int i12 = i4 | 3510;
        if ((i4 & 24576) == 0) {
            i12 |= true != buxVarC.C(cjsVar) ? 8192 : 16384;
        }
        if ((i4 & 196608) == 0) {
            i12 |= true != buxVarC.E(afehVar) ? 65536 : 131072;
        }
        if (buxVarC.I(((306783379 & i11) == 306783378 && (74899 & i12) == 74898) ? false : true, i11 & 1)) {
            int i13 = (-1879048193) & i11;
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i3 & 1) == 0 || buxVarC.F()) {
                bec becVar5 = bec.a;
                beb bebVar4 = beb.a;
                dka dkaVar4 = djz.a;
                Object objS = bvvVar.S();
                if (objS == buw.a) {
                    objS = new awf(13);
                    bvvVar.ad(objS);
                }
                afecVar4 = (afec) objS;
                becVar3 = becVar5;
                bebVar3 = bebVar4;
                dkaVar3 = dkaVar4;
                i8 = 1;
                i9 = 1;
            } else {
                buxVarC.s();
                becVar3 = becVar;
                bebVar3 = bebVar;
                i8 = i;
                i9 = i2;
                dkaVar3 = dkaVar;
                afecVar4 = afecVar2;
            }
            buxVarC.l();
            boolean z = (i11 & 14) == 4;
            boolean z2 = (i11 & 112) == 32;
            dje djeVarA = becVar3.a(true);
            Object objS2 = bvvVar.S();
            if ((z || z2) || objS2 == buw.a) {
                becVar4 = becVar3;
                objS2 = new aju(djvVar, afecVar, 19, null);
                bvvVar.ad(objS2);
            } else {
                becVar4 = becVar3;
            }
            int i14 = i12 << 9;
            int i15 = ((i13 >> 6) & 7168) | (i11 & 910) | (i14 & 57344) | (i14 & 458752) | (3670016 & i14) | (i14 & 29360128);
            int i16 = ((i13 >> 15) & 896) | (i11 & 7168) | (i11 & 57344) | (i12 & 458752);
            dka dkaVar5 = dkaVar3;
            afec afecVar5 = afecVar4;
            asl.ao(djvVar, (afec) objS2, cfyVar, dfwVar, dkaVar5, afecVar5, cjsVar, false, 1, 1, djeVarA, bebVar3, false, afehVar, buxVarC, i15, i16);
            dkaVar2 = dkaVar5;
            afecVar3 = afecVar5;
            bebVar2 = bebVar3;
            becVar2 = becVar4;
            i6 = i8;
            i7 = i9;
        } else {
            buxVarC.s();
            becVar2 = becVar;
            bebVar2 = bebVar;
            i6 = i;
            i7 = i2;
            dkaVar2 = dkaVar;
            afecVar3 = afecVar2;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bcx
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djv djvVar2 = djvVar;
                    afec afecVar6 = afecVar;
                    cfy cfyVar2 = cfyVar;
                    dfw dfwVar2 = dfwVar;
                    bec becVar6 = becVar2;
                    beb bebVar5 = bebVar2;
                    int i17 = i6;
                    int i18 = i7;
                    int i19 = i3;
                    dka dkaVar6 = dkaVar2;
                    int i20 = i4;
                    int i21 = i19 | 1;
                    int i22 = i20 & 306783378;
                    int i23 = 306783378 & i21;
                    cjs cjsVar2 = cjsVar;
                    int i24 = i20 & 613566756;
                    int i25 = i21 & 613566756;
                    afeh afehVar2 = afehVar;
                    afp.L(djvVar2, afecVar6, cfyVar2, dfwVar2, becVar6, bebVar5, i17, i18, dkaVar6, afecVar3, cjsVar2, afehVar2, (bux) obj, (i21 & (-920350135)) | i23 | (i25 >> 1) | ((i23 + i23) & i25), (i20 & (-920350135)) | i22 | (i24 >> 1) | ((i22 + i22) & i24));
                    return afak.a;
                }
            };
        }
    }

    public static final void M(final String str, final afec afecVar, final cfy cfyVar, boolean z, final dfw dfwVar, bec becVar, beb bebVar, int i, int i2, dka dkaVar, afec afecVar2, cjs cjsVar, final afeh afehVar, bux buxVar, final int i3, final int i4) {
        int i5;
        bux buxVar2;
        final boolean z2;
        final bec becVar2;
        final beb bebVar2;
        final int i6;
        final int i7;
        final dka dkaVar2;
        final afec afecVar3;
        final cjs cjsVar2;
        bec becVar3;
        dka dkaVar3;
        cjs ckxVar;
        int i8;
        afec afecVar4;
        beb bebVar3;
        int i9;
        boolean z3;
        int i10;
        bec becVar4;
        int i11 = i3 & 6;
        bux buxVarC = buxVar.c(2026950908);
        if (i11 == 0) {
            i5 = (true != buxVarC.C(str) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != buxVarC.E(afecVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        int i12 = i5 | 27648;
        if ((i3 & 196608) == 0) {
            i12 |= true != buxVarC.C(dfwVar) ? 65536 : 131072;
        }
        int i13 = 114819072 | i12;
        if ((805306368 & i3) == 0) {
            i13 = i12 | 383254528;
        }
        int i14 = i4 | 28086;
        if ((196608 & i4) == 0) {
            i14 |= true == buxVarC.E(afehVar) ? 131072 : 65536;
        }
        if (buxVarC.I(((306783379 & i13) == 306783378 && (74899 & i14) == 74898) ? false : true, i13 & 1)) {
            int i15 = (-1879048193) & i13;
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i3 & 1) == 0 || buxVarC.F()) {
                becVar3 = bec.a;
                beb bebVar4 = beb.a;
                dkaVar3 = djz.a;
                Object objS = bvvVar.S();
                if (objS == buw.a) {
                    objS = new awf(12);
                    bvvVar.ad(objS);
                }
                ckxVar = new ckx(-72057594037927936L);
                i8 = Integer.MAX_VALUE;
                afecVar4 = (afec) objS;
                bebVar3 = bebVar4;
                i9 = 1;
                z3 = true;
            } else {
                buxVarC.s();
                z3 = z;
                becVar3 = becVar;
                bebVar3 = bebVar;
                i8 = i;
                i9 = i2;
                dkaVar3 = dkaVar;
                afecVar4 = afecVar2;
                ckxVar = cjsVar;
            }
            buxVarC.l();
            Object objS2 = bvvVar.S();
            Object obj = buw.a;
            if (objS2 == obj) {
                becVar4 = becVar3;
                i10 = i14;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(new djv(str, 0L, 6), bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS2 = parcelableSnapshotMutableState;
            } else {
                i10 = i14;
                becVar4 = becVar3;
            }
            bwq bwqVar = (bwq) objS2;
            djv djvVar = (djv) bwqVar.a();
            djv djvVar2 = new djv(new deu(str), djvVar.b, djvVar.c);
            boolean zC = buxVarC.C(djvVar2);
            Object objS3 = bvvVar.S();
            if (zC || objS3 == obj) {
                objS3 = new aiy(djvVar2, bwqVar, 9, null);
                bvvVar.ad(objS3);
            }
            buxVarC.r((afdr) objS3);
            int i16 = i13 & 14;
            Object objS4 = bvvVar.S();
            if (i16 == 4 || objS4 == obj) {
                objS4 = new ParcelableSnapshotMutableState(str, bxp.c);
                bvvVar.ad(objS4);
            }
            bwq bwqVar2 = (bwq) objS4;
            dje djeVarA = becVar4.a(false);
            boolean zC2 = buxVarC.C(bwqVar2) | ((i13 & 112) == 32);
            Object objS5 = bvvVar.S();
            if (zC2 || objS5 == obj) {
                objS5 = new acg(afecVar, bwqVar, bwqVar2, 4);
                bvvVar.ad(objS5);
            }
            int i17 = i10 << 9;
            buxVar2 = buxVarC;
            dka dkaVar4 = dkaVar3;
            asl.ao(djvVar2, (afec) objS5, cfyVar, dfwVar, dkaVar4, afecVar4, ckxVar, true, i8, i9, djeVarA, bebVar3, z3, afehVar, buxVar2, (i13 & 896) | ((i15 >> 6) & 7168) | (i17 & 57344) | (i17 & 458752) | (3670016 & i17) | (i17 & 29360128), ((i15 >> 15) & 896) | (i13 & 7168) | (i13 & 57344) | (i10 & 458752));
            becVar2 = becVar4;
            dkaVar2 = dkaVar4;
            afecVar3 = afecVar4;
            cjsVar2 = ckxVar;
            i6 = i8;
            i7 = i9;
            bebVar2 = bebVar3;
            z2 = z3;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            z2 = z;
            becVar2 = becVar;
            bebVar2 = bebVar;
            i6 = i;
            i7 = i2;
            dkaVar2 = dkaVar;
            afecVar3 = afecVar2;
            cjsVar2 = cjsVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bcw
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    String str2 = str;
                    afec afecVar5 = afecVar;
                    cfy cfyVar2 = cfyVar;
                    boolean z4 = z2;
                    dfw dfwVar2 = dfwVar;
                    bec becVar5 = becVar2;
                    beb bebVar5 = bebVar2;
                    int i18 = i6;
                    int i19 = i7;
                    int i20 = i3;
                    dka dkaVar5 = dkaVar2;
                    int i21 = i4;
                    int i22 = i20 | 1;
                    int i23 = i21 & 306783378;
                    int i24 = 306783378 & i22;
                    cjs cjsVar3 = cjsVar2;
                    int i25 = i21 & 613566756;
                    int i26 = i22 & 613566756;
                    afeh afehVar2 = afehVar;
                    afp.M(str2, afecVar5, cfyVar2, z4, dfwVar2, becVar5, bebVar5, i18, i19, dkaVar5, afecVar3, cjsVar3, afehVar2, (bux) obj2, (i22 & (-920350135)) | i24 | (i26 >> 1) | ((i24 + i24) & i26), (i21 & (-920350135)) | i23 | (i25 >> 1) | ((i23 + i23) & i25));
                    return afak.a;
                }
            };
        }
    }

    public static final void N(final cfy cfyVar, bux buxVar, final int i, final int i2) {
        int i3;
        bux buxVarC = buxVar.c(694251107);
        int i4 = 1;
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if (buxVarC.I((i3 & 3) != 2, i3 & 1)) {
            if (i2 != 0) {
                cfyVar = cfy.e;
            }
            asl.A(cfyVar.a(new awc(20.710678f, 25.0f, 20.710678f, 25.0f, true)).a(new che(new bdg(((blu) buxVarC.f(blw.a)).a, i4))), buxVarC);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bcs
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i | 1;
                    int i6 = 306783378 & i5;
                    int i7 = 613566756 & i5;
                    cfy cfyVar2 = cfyVar;
                    afp.N(cfyVar2, (bux) obj, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7), i2);
                    return afak.a;
                }
            };
        }
    }

    public static final void O(bjy bjyVar, cfy cfyVar, final long j, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1776202187);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(bjyVar) : buxVarC.E(bjyVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                j = 9205357640488583168L;
            } else {
                buxVarC.s();
            }
            buxVarC.l();
            int i4 = i2 & 14;
            boolean z = i4 == 4 || ((i2 & 8) != 0 && buxVarC.E(bjyVar));
            Object objS = bvvVar.S();
            if (z || objS == buw.a) {
                objS = new bbn(bjyVar, 5);
                bvvVar.ad(objS);
            }
            AtomicInteger atomicInteger = dds.a;
            final cfy cfyVarA = cfyVar.a(new ddg(false, (afec) objS));
            awx.B(bjyVar, cfl.b, bxc.i(-1653527038, true, new afeg() { // from class: bct
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i5 = iIntValue & 3;
                    if (buxVar2.I(i5 != 2, iIntValue & 1)) {
                        cfy cfyVar2 = cfyVarA;
                        long j2 = j;
                        if (j2 != 9205357640488583168L) {
                            buxVar2.v(-1244013944);
                            cfy cfyVarS = awd.s(cfyVar2, Float.intBitsToFloat((int) (j2 >> 32)) + BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (j2 & 4294967295L)) + BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12);
                            ctp ctpVarB = atk.b(cfl.b, false);
                            long jB = buxVar2.b();
                            long j3 = jB ^ (jB >>> 32);
                            ccx ccxVarN = buxVar2.N();
                            cfy cfyVarJ = bzi.j(buxVar2, cfyVarS);
                            afdr afdrVar = cwb.a;
                            buxVar2.M();
                            buxVar2.w();
                            if (buxVar2.G()) {
                                buxVar2.j(afdrVar);
                            } else {
                                buxVar2.y();
                            }
                            byq.c(buxVar2, ctpVarB, cwb.e);
                            byq.c(buxVar2, ccxVarN, cwb.d);
                            byq.c(buxVar2, Integer.valueOf((int) j3), cwb.f);
                            buxVar2.i(afak.a, new alx(cwb.g, 16));
                            byq.c(buxVar2, cfyVarJ, cwb.c);
                            afp.N(null, buxVar2, 0, 1);
                            buxVar2.n();
                            buxVar2.o();
                        } else {
                            buxVar2.v(-1243644858);
                            afp.N(cfyVar2, buxVar2, 0, 0);
                            buxVar2.o();
                        }
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, i4 | 432);
        } else {
            buxVarC.s();
        }
        long j2 = j;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new btf(bjyVar, cfyVar, j2, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final cfy P(cfy cfyVar, boolean z, asf asfVar, akg akgVar, boolean z2, ddo ddoVar, afdr afdrVar) {
        return cfyVar.a(akgVar instanceof akm ? new bcf(z, asfVar, akgVar, z2, ddoVar, afdrVar) : akgVar == 0 ? new bcf(z, asfVar, null, z2, ddoVar, afdrVar) : asfVar != null ? aki.a(cfy.e, asfVar, akgVar).a(new bcf(z, asfVar, null, z2, ddoVar, afdrVar)) : new cfu(new bcg(akgVar, z, z2, ddoVar, afdrVar)));
    }

    public static final cfy Q(cfy cfyVar) {
        awf awfVar = new awf(11);
        AtomicInteger atomicInteger = dds.a;
        return cfyVar.a(new ddg(false, awfVar));
    }

    public static final cfy R(cfy cfyVar, bca bcaVar) {
        return cfyVar.a(new bby(bcaVar));
    }

    public static final void S(final cfy cfyVar, final deu deuVar, final afec afecVar, final boolean z, final Map map, final dfw dfwVar, final int i, final boolean z2, final int i2, final int i3, final wci wciVar, final biy biyVar, final afec afecVar2, bux buxVar, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        bfh bfhVar;
        afdr afdrVar;
        afdr afdrVar2;
        aezu aezuVar;
        Object obj;
        afec afecVar3;
        Object bfiVar;
        boolean z4;
        List arrayList;
        afdr afdrVar3;
        int i10;
        Map map2 = map;
        int i11 = i4 & 6;
        bux buxVarC = buxVar.c(-2118572703);
        if (i11 == 0) {
            i6 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= true != buxVarC.C(deuVar) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i6 |= true != buxVarC.E(afecVar) ? 128 : 256;
        }
        if ((i4 & 3072) == 0) {
            i6 |= true != buxVarC.D(z) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            i6 |= true != buxVarC.E(map2) ? 8192 : 16384;
        }
        if ((196608 & i4) == 0) {
            i6 |= true != buxVarC.C(dfwVar) ? 65536 : 131072;
        }
        if ((1572864 & i4) == 0) {
            i6 |= true != buxVarC.A(i) ? 524288 : 1048576;
        }
        if ((12582912 & i4) == 0) {
            i6 |= true != buxVarC.D(z2) ? 4194304 : 8388608;
        }
        if ((100663296 & i4) == 0) {
            i7 = i2;
            i6 |= true != buxVarC.A(i7) ? 33554432 : 67108864;
        } else {
            i7 = i2;
        }
        if ((805306368 & i4) == 0) {
            i8 = i3;
            i6 |= true != buxVarC.A(i8) ? 268435456 : 536870912;
        } else {
            i8 = i3;
        }
        int i12 = i6;
        if ((i5 & 6) == 0) {
            i9 = (true != buxVarC.E(wciVar) ? 2 : 4) | i5;
        } else {
            i9 = i5;
        }
        if ((i5 & 48) == 0) {
            i9 |= true != buxVarC.E(biyVar) ? 16 : 32;
        }
        if ((i5 & 384) == 0) {
            z3 = true;
            i9 |= true != buxVarC.E(null) ? 128 : 256;
        } else {
            z3 = true;
        }
        if ((i5 & 3072) == 0) {
            i9 |= z3 == buxVarC.E(afecVar2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i9 |= true == ((32768 & i5) == 0 ? buxVarC.C(null) : buxVarC.E(null)) ? 16384 : 8192;
        }
        if (buxVarC.I(((306783379 & i12) == 306783378 && (i9 & 9363) == 9362) ? false : true, i12 & 1)) {
            int i13 = i12 & 112;
            if (deuVar.h(deuVar.a())) {
                buxVarC.v(145641571);
                bvv bvvVar = (bvv) buxVarC;
                Object objS = bvvVar.S();
                if (i13 == 32 || objS == buw.a) {
                    objS = new bfh(deuVar);
                    bvvVar.ad(objS);
                }
                bvvVar.Y(false);
                bfhVar = (bfh) objS;
            } else {
                buxVarC.v(145707228);
                ((bvv) buxVarC).Y(false);
                bfhVar = null;
            }
            if (deuVar.h(deuVar.a())) {
                buxVarC.v(145905443);
                boolean zC = (i13 == 32) | buxVarC.C(bfhVar);
                bvv bvvVar2 = (bvv) buxVarC;
                Object objS2 = bvvVar2.S();
                if (zC || objS2 == buw.a) {
                    objS2 = new aiy(bfhVar, deuVar, 10);
                    bvvVar2.ad(objS2);
                }
                afdrVar = (afdr) objS2;
                bvvVar2.Y(false);
            } else {
                buxVarC.v(146002721);
                bvv bvvVar3 = (bvv) buxVarC;
                Object objS3 = bvvVar3.S();
                if (i13 == 32 || objS3 == buw.a) {
                    objS3 = new bap(deuVar, 9);
                    bvvVar3.ad(objS3);
                }
                afdrVar = (afdr) objS3;
                bvvVar3.Y(false);
            }
            if (!z) {
                afdrVar2 = afdrVar;
                aezuVar = new aezu(null, null);
            } else if (map2 == null || map2.isEmpty()) {
                afdrVar2 = afdrVar;
                aezuVar = bcu.a;
            } else {
                int length = deuVar.b.length();
                List list = deuVar.a;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    int size = list.size();
                    int i14 = 0;
                    while (i14 < size) {
                        int i15 = size;
                        det detVar = (det) list.get(i14);
                        List list2 = list;
                        if (detVar.a instanceof dfo) {
                            i10 = i14;
                            if (affa.f("androidx.compose.foundation.text.inlineContent", detVar.d)) {
                                int i16 = detVar.b;
                                int i17 = detVar.c;
                                deu deuVar2 = dev.a;
                                boolean z5 = i16 < length;
                                if ((((i16 == i17) | (length == 0)) & (i16 == 0)) | ((i17 > 0) & z5)) {
                                    arrayList.add(czz.v(detVar));
                                }
                            }
                        } else {
                            i10 = i14;
                        }
                        i14 = i10 + 1;
                        list = list2;
                        size = i15;
                    }
                } else {
                    arrayList = afbe.a;
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList.size();
                int i18 = 0;
                while (i18 < size2) {
                    int i19 = size2;
                    det detVar2 = (det) arrayList.get(i18);
                    List list3 = arrayList;
                    bii biiVar = (bii) map2.get(detVar2.a);
                    int i20 = i18;
                    if (biiVar != null) {
                        afdrVar3 = afdrVar;
                        int i21 = detVar2.b;
                        int i22 = detVar2.c;
                        arrayList2.add(new det(biiVar.a, i21, i22, ""));
                        arrayList3.add(new det(biiVar.b, i21, i22, ""));
                    } else {
                        afdrVar3 = afdrVar;
                    }
                    i18 = i20 + 1;
                    map2 = map;
                    arrayList = list3;
                    size2 = i19;
                    afdrVar = afdrVar3;
                }
                afdrVar2 = afdrVar;
                aezuVar = new aezu(arrayList2, arrayList3);
            }
            Object obj2 = aezuVar.b;
            List list4 = (List) aezuVar.a;
            List list5 = (List) obj2;
            if (z) {
                buxVarC.v(146318828);
                bvv bvvVar4 = (bvv) buxVarC;
                Object objS4 = bvvVar4.S();
                if (objS4 == buw.a) {
                    Object parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(null, bxp.c);
                    bvvVar4.ad(parcelableSnapshotMutableState);
                    objS4 = parcelableSnapshotMutableState;
                }
                bvvVar4.Y(false);
                obj = (bwq) objS4;
            } else {
                buxVarC.v(146406588);
                ((bvv) buxVarC).Y(false);
                obj = null;
            }
            if (z) {
                buxVarC.v(146499837);
                boolean zC2 = buxVarC.C(obj);
                bvv bvvVar5 = (bvv) buxVarC;
                Object objS5 = bvvVar5.S();
                if (zC2 || objS5 == buw.a) {
                    objS5 = new bbn(obj, 8);
                    bvvVar5.ad(objS5);
                }
                bvvVar5.Y(false);
                afecVar3 = (afec) objS5;
            } else {
                buxVarC.v(146571260);
                ((bvv) buxVarC).Y(false);
                afecVar3 = null;
            }
            int i23 = i12 >> 3;
            bdd.b(deuVar, dfwVar, wciVar, list4, z2, buxVarC);
            deu deuVar3 = (deu) afdrVar2.invoke();
            boolean zE = buxVarC.E(bfhVar) | ((i12 & 896) == 256);
            bvv bvvVar6 = (bvv) buxVarC;
            Object objS6 = bvvVar6.S();
            if (zE || objS6 == buw.a) {
                objS6 = new aju(bfhVar, afecVar, 20, null);
                bvvVar6.ad(objS6);
            }
            cfy cfyVarAj = aj(cfyVar, deuVar3, dfwVar, (afec) objS6, i, z2, i7, i8, wciVar, list4, afecVar3, biyVar, afecVar2);
            if (z) {
                buxVarC.v(147956465);
                boolean zE2 = buxVarC.E(bfhVar);
                Object objS7 = bvvVar6.S();
                if (zE2 || objS7 == buw.a) {
                    objS7 = new bap(bfhVar, 11);
                    bvvVar6.ad(objS7);
                }
                afdr afdrVar4 = (afdr) objS7;
                boolean zC3 = buxVarC.C(obj);
                Object objS8 = bvvVar6.S();
                if (zC3 || objS8 == buw.a) {
                    objS8 = new bap(obj, 12);
                    bvvVar6.ad(objS8);
                }
                bfiVar = new bfi(afdrVar4, (afdr) objS8);
                bvvVar6.Y(false);
            } else {
                buxVarC.v(147779703);
                boolean zE3 = buxVarC.E(bfhVar);
                Object objS9 = bvvVar6.S();
                if (zE3 || objS9 == buw.a) {
                    objS9 = new bap(bfhVar, 10);
                    bvvVar6.ad(objS9);
                }
                bfiVar = new bef((afdr) objS9);
                bvvVar6.Y(false);
            }
            long j = bvvVar6.u;
            long j2 = j ^ (j >>> 32);
            ccx ccxVarAh = bvvVar6.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarAj);
            afdr afdrVar5 = cwb.a;
            buxVarC.w();
            if (bvvVar6.t) {
                buxVarC.j(afdrVar5);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, bfiVar, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf((int) j2), cwb.f);
            buxVarC.i(afak.a, new alx(cwb.g, 16));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            if (bfhVar == null) {
                buxVarC.v(-433557001);
                z4 = false;
            } else {
                z4 = false;
                buxVarC.v(-291080374);
                bfhVar.b(buxVarC, 0);
            }
            bvvVar6.Y(z4);
            if (list5 == null) {
                buxVarC.v(-433506223);
            } else {
                buxVarC.v(-433506222);
                bcu.a(deuVar, list5, buxVarC, i23 & 14);
            }
            bvvVar6.Y(z4);
            bvvVar6.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bcz
                @Override // defpackage.afeg
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    cfy cfyVar2 = cfyVar;
                    deu deuVar4 = deuVar;
                    afec afecVar4 = afecVar;
                    boolean z6 = z;
                    Map map3 = map;
                    dfw dfwVar2 = dfwVar;
                    int i24 = i;
                    boolean z7 = z2;
                    int i25 = i2;
                    int i26 = i4;
                    int i27 = i3;
                    int i28 = i5;
                    int i29 = i26 | 1;
                    int i30 = i28 & 306783378;
                    int i31 = 306783378 & i29;
                    biy biyVar2 = biyVar;
                    int i32 = i28 & 613566756;
                    int i33 = i29 & 613566756;
                    afec afecVar5 = afecVar2;
                    afp.S(cfyVar2, deuVar4, afecVar4, z6, map3, dfwVar2, i24, z7, i25, i27, wciVar, biyVar2, afecVar5, (bux) obj3, (i29 & (-920350135)) | i31 | (i33 >> 1) | ((i31 + i31) & i33), (i28 & (-920350135)) | i30 | (i32 >> 1) | ((i30 + i30) & i32));
                    return afak.a;
                }
            };
        }
    }

    public static final long T(bbt bbtVar) {
        return (bbtVar.j() * bbtVar.l()) + afgi.m(bbtVar.c() * bbtVar.l());
    }

    public static final bav U(azk azkVar, int i, long j, bbf bbfVar, long j2, api apiVar, cfm cfmVar, cfr cfrVar, dlr dlrVar, zh zhVar) {
        List list;
        Object objD = bbfVar.d(i);
        List list2 = (List) zhVar.a(i);
        if (list2 != null) {
            list = list2;
        } else {
            List listR = azkVar.r(i);
            int size = listR.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((cto) listR.get(i2)).v(j));
            }
            zhVar.g(i, arrayList);
            list = arrayList;
        }
        return new bav(i, list, j2, objD, apiVar, cfmVar, cfrVar, dlrVar);
    }

    public static final int V(bbj bbjVar) {
        return (int) (bbjVar.e == api.a ? bbjVar.d() & 4294967295L : bbjVar.d() >> 32);
    }

    public static final boolean W(bbt bbtVar, aitx aitxVar) {
        if (!bbtVar.g()) {
            return false;
        }
        ahnc.d(aitxVar, null, 0, new ada(bbtVar, (afck) null, 19), 3);
        return true;
    }

    public static final boolean X(bbt bbtVar, aitx aitxVar) {
        if (!bbtVar.h()) {
            return false;
        }
        ahnc.d(aitxVar, null, 0, new ada(bbtVar, (afck) null, 20, (byte[]) null), 3);
        return true;
    }

    public static final void Y(bbt bbtVar, cfy cfyVar, avp avpVar, baw bawVar, float f, cfr cfrVar, arn arnVar, boolean z, cpt cptVar, art artVar, aiu aiuVar, amy amyVar, afei afeiVar, bux buxVar, int i, int i2) {
        int i3;
        int i4;
        avp avpVar2;
        baw bawVar2;
        cfr cfrVar2;
        boolean z2;
        cpt cptVarAc;
        art artVar2;
        aiu aiuVar2;
        amy amyVar2;
        avp avrVar;
        baw bawVar3;
        cfr cfrVar3;
        art artVar3;
        aiu aiuVarA;
        amy amyVarAa;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(-1864473085);
        boolean z3 = true;
        if (i5 == 0) {
            i3 = i | (true != buxVarC.C(bbtVar) ? 2 : 4);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i6 = i3 | 28032;
        if ((i & 196608) == 0) {
            i6 |= true != buxVarC.z(f) ? 65536 : 131072;
        }
        int i7 = i6 | 1572864;
        if ((i & 12582912) == 0) {
            i7 |= true != buxVarC.C(arnVar) ? 4194304 : 8388608;
        }
        if ((i2 & 6) == 0) {
            i4 = (true == buxVarC.E(null) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= 16;
        }
        int i8 = i4 | 384;
        if ((i2 & 3072) == 0) {
            i8 = i4 | 1408;
        }
        if ((i2 & 24576) == 0) {
            i8 |= 8192;
        }
        if ((i2 & 196608) == 0) {
            i8 |= true == buxVarC.E(afeiVar) ? 131072 : 65536;
        }
        int i9 = i7 | 905969664;
        if (buxVarC.I(((306783379 & i9) == 306783378 && (74899 & i8) == 74898) ? false : true, i9 & 1)) {
            int i10 = (-64625) & i8;
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                avrVar = new avr(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                int i11 = i9 & 14;
                baw bawVar4 = baw.a;
                bawVar3 = bawVar4;
                cfrVar3 = cfl.n;
                cptVarAc = ac(bbtVar, api.b, buxVarC, i11 | 432);
                artVar3 = ars.a;
                aiuVarA = akx.a(buxVarC);
                amyVarAa = aa(bbtVar, buxVarC, i11 | 48);
            } else {
                buxVarC.s();
                avrVar = avpVar;
                bawVar3 = bawVar;
                cfrVar3 = cfrVar;
                z3 = z;
                cptVarAc = cptVar;
                artVar3 = artVar;
                aiuVarA = aiuVar;
                amyVarAa = amyVar;
            }
            buxVarC.l();
            int i12 = i9 >> 6;
            int i13 = i9 << 12;
            int i14 = i10 << 6;
            int i15 = ((i9 >> 18) & 7168) | ((i9 >> 3) & 14) | 24576 | ((i9 << 3) & 112) | (i9 & 896) | (i12 & 458752) | (i12 & 3670016) | (i13 & 234881024) | (i13 & 1879048192);
            int i16 = ((i9 >> 9) & 14) | 3072 | (i14 & 896) | (i12 & 57344) | ((i10 << 9) & 458752) | (29360128 & i14);
            avp avpVar3 = avrVar;
            ad(cfyVar, bbtVar, avpVar3, api.b, arnVar, z3, aiuVarA, f, bawVar3, cptVarAc, cfl.k, cfrVar3, artVar3, amyVarAa, afeiVar, buxVarC, i15, i16);
            cfr cfrVar4 = cfrVar3;
            aiuVar2 = aiuVarA;
            cfrVar2 = cfrVar4;
            avpVar2 = avpVar3;
            bawVar2 = bawVar3;
            artVar2 = artVar3;
            amyVar2 = amyVarAa;
            z2 = z3;
        } else {
            buxVarC.s();
            avpVar2 = avpVar;
            bawVar2 = bawVar;
            cfrVar2 = cfrVar;
            z2 = z;
            cptVarAc = cptVar;
            artVar2 = artVar;
            aiuVar2 = aiuVar;
            amyVar2 = amyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bbc(bbtVar, cfyVar, avpVar2, bawVar2, f, cfrVar2, arnVar, z2, cptVarAc, artVar2, aiuVar2, amyVar2, afeiVar, i, i2, 0);
        }
    }

    public static final void Z(bbt bbtVar, cfy cfyVar, avp avpVar, baw bawVar, float f, cfm cfmVar, arn arnVar, boolean z, cpt cptVar, art artVar, aiu aiuVar, amy amyVar, afei afeiVar, bux buxVar, int i, int i2) {
        int i3;
        int i4;
        avp avpVar2;
        baw bawVar2;
        cfm cfmVar2;
        boolean z2;
        cpt cptVarAc;
        art artVar2;
        aiu aiuVar2;
        amy amyVar2;
        avp avrVar;
        cfm cfmVar3;
        baw bawVar3;
        art artVar3;
        aiu aiuVarA;
        amy amyVarAa;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(1378394499);
        boolean z3 = true;
        if (i5 == 0) {
            i3 = i | (true != buxVarC.C(bbtVar) ? 2 : 4);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i6 = i3 | 28032;
        if ((i & 196608) == 0) {
            i6 |= true != buxVarC.z(f) ? 65536 : 131072;
        }
        int i7 = i6 | 1572864;
        if ((i & 12582912) == 0) {
            i7 |= true != buxVarC.C(arnVar) ? 4194304 : 8388608;
        }
        if ((i2 & 6) == 0) {
            i4 = (true == buxVarC.E(null) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= 16;
        }
        int i8 = i4 | 384;
        if ((i2 & 3072) == 0) {
            i8 = i4 | 1408;
        }
        if ((i2 & 24576) == 0) {
            i8 |= 8192;
        }
        if ((i2 & 196608) == 0) {
            i8 |= true == buxVarC.E(afeiVar) ? 131072 : 65536;
        }
        int i9 = i7 | 905969664;
        if (buxVarC.I(((306783379 & i9) == 306783378 && (74899 & i8) == 74898) ? false : true, i9 & 1)) {
            int i10 = (-64625) & i8;
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                avrVar = new avr(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                int i11 = i9 & 14;
                baw bawVar4 = baw.a;
                cfmVar3 = cfl.k;
                bawVar3 = bawVar4;
                cptVarAc = ac(bbtVar, api.a, buxVarC, i11 | 432);
                artVar3 = ars.a;
                aiuVarA = akx.a(buxVarC);
                amyVarAa = aa(bbtVar, buxVarC, i11 | 48);
            } else {
                buxVarC.s();
                avrVar = avpVar;
                bawVar3 = bawVar;
                cfmVar3 = cfmVar;
                z3 = z;
                cptVarAc = cptVar;
                artVar3 = artVar;
                aiuVarA = aiuVar;
                amyVarAa = amyVar;
            }
            buxVarC.l();
            int i12 = ((i9 >> 3) & 14) | 24576;
            int i13 = i9 << 3;
            int i14 = i9 & 896;
            int i15 = i9 >> 18;
            int i16 = i9 >> 6;
            int i17 = i9 << 12;
            int i18 = i9 >> 9;
            int i19 = i10 << 6;
            int i20 = (i18 & 7168) | (i18 & 14) | 24576 | (i19 & 896) | ((i10 << 9) & 458752) | (29360128 & i19);
            avp avpVar3 = avrVar;
            ad(cfyVar, bbtVar, avpVar3, api.a, arnVar, z3, aiuVarA, f, bawVar3, cptVarAc, cfmVar3, cfl.n, artVar3, amyVarAa, afeiVar, buxVarC, (i15 & 7168) | i12 | (i13 & 112) | i14 | (i16 & 458752) | (i16 & 3670016) | (i17 & 234881024) | (i17 & 1879048192), i20);
            avpVar2 = avpVar3;
            aiuVar2 = aiuVarA;
            bawVar2 = bawVar3;
            cfmVar2 = cfmVar3;
            artVar2 = artVar3;
            amyVar2 = amyVarAa;
            z2 = z3;
        } else {
            buxVarC.s();
            avpVar2 = avpVar;
            bawVar2 = bawVar;
            cfmVar2 = cfmVar;
            z2 = z;
            cptVarAc = cptVar;
            artVar2 = artVar;
            aiuVar2 = aiuVar;
            amyVar2 = amyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bbc(bbtVar, cfyVar, avpVar2, bawVar2, f, cfmVar2, arnVar, z2, cptVarAc, artVar2, aiuVar2, amyVar2, afeiVar, i, i2, 1);
        }
    }

    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final amy aa(bbt bbtVar, bux buxVar, int i) {
        amy amyVar = (amy) buxVar.f(ana.b);
        dlr dlrVar = (dlr) buxVar.f(dbc.i);
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !buxVar.C(bbtVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean zC = buxVar.C(amyVar) | z | buxVar.A(dlrVar.ordinal());
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        if (zC || objS == buw.a) {
            objS = new ban(bbtVar, amyVar, dlrVar);
            bvvVar.ad(objS);
        }
        return (ban) objS;
    }

    public static final arn ab(final bbt bbtVar, final float f, bux buxVar, int i, int i2) {
        aft aftVar = null;
        Object bbmVar = (i2 & 2) != 0 ? new bbm() : null;
        kwp kwpVarA = (i2 & 4) != 0 ? adl.a(buxVar) : null;
        if ((i2 & 8) != 0) {
            Map map = ahc.a;
            aftVar = new aft(1.0f, 400.0f, Float.valueOf(1.0f));
        }
        if ((i2 & 16) != 0) {
            f = 0.5f;
        }
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            asl.c(a.bG(f, "snapPositionalThreshold should be a number between 0 and 1. You've specified "));
        }
        Object obj = (dlg) buxVar.f(dbc.d);
        final dlr dlrVar = (dlr) buxVar.f(dbc.i);
        boolean zC = ((((i & 14) ^ 6) > 4 && buxVar.C(bbtVar)) || (i & 6) == 4) | buxVar.C(kwpVarA) | buxVar.C(aftVar) | ((((i & 112) ^ 48) > 32 && buxVar.C(bbmVar)) || (i & 48) == 32) | buxVar.C(obj) | buxVar.A(dlrVar.ordinal());
        Object objG = buxVar.g();
        if (zC || objG == buw.a) {
            objG = new arn(new ari(bbtVar, new afeh() { // from class: baz
                /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
                @Override // defpackage.afeh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
                    /*
                        r5 = this;
                        java.lang.Float r6 = (java.lang.Float) r6
                        float r6 = r6.floatValue()
                        java.lang.Float r7 = (java.lang.Float) r7
                        float r7 = r7.floatValue()
                        java.lang.Float r8 = (java.lang.Float) r8
                        float r8 = r8.floatValue()
                        bbt r0 = r1
                        boolean r1 = defpackage.asl.p(r0, r6)
                        bbj r2 = r0.x()
                        api r2 = r2.e
                        api r3 = defpackage.api.a
                        r4 = 1
                        if (r2 != r3) goto L24
                        goto L2f
                    L24:
                        dlr r2 = r2
                        dlr r3 = defpackage.dlr.a
                        if (r2 == r3) goto L2f
                        if (r1 != 0) goto L2e
                        r1 = r4
                        goto L2f
                    L2e:
                        r1 = 0
                    L2f:
                        bbj r2 = r0.x()
                        int r2 = r2.b
                        if (r2 != 0) goto L39
                        r2 = 0
                        goto L40
                    L39:
                        float r3 = defpackage.asl.o(r0)
                        float r2 = (float) r2
                        float r2 = r3 / r2
                    L40:
                        dlg r3 = r0.o
                        int r6 = defpackage.ca.aw(r3, r6)
                        if (r6 != 0) goto L79
                        float r5 = r3
                        int r6 = (int) r2
                        float r6 = (float) r6
                        float r6 = r2 - r6
                        float r6 = java.lang.Math.abs(r6)
                        int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
                        if (r5 <= 0) goto L59
                        if (r1 == 0) goto L7c
                        goto L7b
                    L59:
                        float r5 = java.lang.Math.abs(r2)
                        float r6 = r0.d()
                        float r6 = java.lang.Math.abs(r6)
                        int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                        if (r5 < 0) goto L6c
                        if (r1 == 0) goto L7b
                        goto L7c
                    L6c:
                        float r5 = java.lang.Math.abs(r7)
                        float r6 = java.lang.Math.abs(r8)
                        int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                        if (r5 >= 0) goto L7b
                        goto L7c
                    L79:
                        if (r6 != r4) goto L7c
                    L7b:
                        r7 = r8
                    L7c:
                        java.lang.Float r5 = java.lang.Float.valueOf(r7)
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.baz.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }), kwpVarA, aftVar);
            buxVar.x(objG);
        }
        return (arn) objG;
    }

    public static final cpt ac(bbt bbtVar, api apiVar, bux buxVar, int i) {
        dlr dlrVar = (dlr) buxVar.f(dbc.i);
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !buxVar.C(bbtVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean zA = buxVar.A(dlrVar.ordinal()) | z;
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        if (zA || objS == buw.a) {
            objS = new bao(bbtVar, apiVar, dlrVar);
            bvvVar.ad(objS);
        }
        return (bao) objS;
    }

    /* JADX WARN: Removed duplicated region for block: B:255:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x040a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04d5  */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(defpackage.cfy r30, defpackage.bbt r31, final defpackage.avp r32, final defpackage.api r33, defpackage.arn r34, final boolean r35, final defpackage.aiu r36, final float r37, final defpackage.baw r38, defpackage.cpt r39, final defpackage.cfm r40, final defpackage.cfr r41, final defpackage.art r42, final defpackage.amy r43, final defpackage.afei r44, defpackage.bux r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afp.ad(cfy, bbt, avp, api, arn, boolean, aiu, float, baw, cpt, cfm, cfr, art, amy, afei, bux, int, int):void");
    }

    public static final void ae(afeh afehVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-709502251);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afehVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 3;
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            bvf bvfVar = cdr.a;
            cdp cdpVar = (cdp) buxVarC.f(bvfVar);
            buxVarC.v(1967007413);
            Object[] objArr = new Object[0];
            cdt cdtVar = cdo.d;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new blv(12);
                bvvVar.ad(objS);
            }
            cdo cdoVar = (cdo) byx.r(objArr, cdtVar, (afdr) objS, buxVarC, 384);
            cdoVar.b = (cdp) buxVarC.f(bvfVar);
            bvvVar.Y(false);
            Object[] objArr2 = {cdpVar};
            cdt cdtVar2 = new cdt(new abp(5), new aju(cdpVar, cdoVar, 16));
            boolean zE = buxVarC.E(cdpVar) | buxVarC.E(cdoVar);
            Object objS2 = bvvVar.S();
            if (zE || objS2 == obj) {
                objS2 = new aiy(cdpVar, cdoVar, i4, null);
                bvvVar.ad(objS2);
            }
            bab babVar = (bab) byx.r(objArr2, cdtVar2, (afdr) objS2, buxVarC, 0);
            czz.am(bvfVar.b(babVar), bxc.i(-412824043, true, new apn(afehVar, babVar, 6), buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new ati(afehVar, i, i4);
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [afec, java.lang.Object] */
    public static final bym af(agg aggVar, Object obj, Object obj2, aew aewVar, bii biiVar, bux buxVar, int i) {
        Object obj3;
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = (i3 > 4 && buxVar.C(aggVar)) || (i & 6) == 4;
        Object objG = buxVar.g();
        if (z || objG == buw.a) {
            cec cecVar = (cec) cek.i.j();
            afec afecVarI = cecVar != null ? cecVar.i() : null;
            cec cecVarI = byx.i(cecVar);
            try {
                obj3 = obj2;
                aei aeiVar = (aei) biiVar.b.invoke(obj2);
                aeiVar.d();
                Object ageVar = new age(aggVar, obj, aeiVar, biiVar);
                byx.l(cecVar, cecVarI, afecVarI);
                buxVar.x(ageVar);
                objG = ageVar;
            } catch (Throwable th) {
                byx.l(cecVar, cecVarI, afecVarI);
                throw th;
            }
        } else {
            obj3 = obj2;
        }
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        int i6 = (i4 << 9) | i2 | (i4 << 6) | (i5 & 896) | (i5 & 7168) | (57344 & i5);
        age ageVar2 = (age) objG;
        q(aggVar, ageVar2, obj, obj3, aewVar, buxVar, i6);
        boolean zC = buxVar.C(ageVar2) | ((i3 > 4 && buxVar.C(aggVar)) || (i & 6) == 4);
        Object objG2 = buxVar.g();
        if (zC || objG2 == buw.a) {
            objG2 = new abi(aggVar, ageVar2, 18);
            buxVar.x(objG2);
        }
        bvq.c(ageVar2, (afec) objG2, buxVar);
        return ageVar2;
    }

    public static final agb ag(agg aggVar, bii biiVar, bux buxVar, int i) {
        aga agaVarA;
        int i2 = (i & 14) ^ 6;
        boolean z = (i2 > 4 && buxVar.C(aggVar)) || (i & 6) == 4;
        Object objG = buxVar.g();
        if (z || objG == buw.a) {
            objG = new agb(aggVar, biiVar);
            buxVar.x(objG);
        }
        agb agbVar = (agb) objG;
        boolean zE = buxVar.E(agbVar) | ((i2 > 4 && buxVar.C(aggVar)) || (i & 6) == 4);
        Object objG2 = buxVar.g();
        if (zE || objG2 == buw.a) {
            objG2 = new abi(aggVar, agbVar, 17);
            buxVar.x(objG2);
        }
        bvq.c(agbVar, (afec) objG2, buxVar);
        if (aggVar.w() && (agaVarA = agbVar.a()) != null) {
            agg aggVar2 = agbVar.a;
            agaVarA.a.j(agaVarA.c.invoke(aggVar2.d().f()), agaVarA.c.invoke(aggVar2.d().g()), (aew) agaVarA.b.invoke(aggVar2.d()));
        }
        return agbVar;
    }

    public static final Object ah(aed aedVar, kwp kwpVar, boolean z, afec afecVar, afck afckVar) throws Throwable {
        Object objD = d(aedVar, new aeo(kwpVar, aedVar.e, aedVar.a(), aedVar.a), z ? aedVar.b : Long.MIN_VALUE, afecVar, afckVar);
        return objD == afcr.a ? objD : afak.a;
    }

    private static final Object ai(adz adzVar, afec afecVar, afck afckVar) {
        if (adzVar.e()) {
            return m(afecVar, afckVar);
        }
        return czz.ah(afckVar.hH()).a(new acm(afecVar, 4), afckVar);
    }

    private static final cfy aj(cfy cfyVar, deu deuVar, dfw dfwVar, afec afecVar, int i, boolean z, int i2, int i3, wci wciVar, List list, afec afecVar2, biy biyVar, afec afecVar3) {
        if (biyVar == null) {
            return cfyVar.a(cfy.e).a(new bje(deuVar, dfwVar, wciVar, afecVar, i, z, i2, i3, list, afecVar2, afecVar3));
        }
        return cfyVar.a(biyVar.e).a(new biw(deuVar, dfwVar, wciVar, afecVar, i, z, i2, i3, list, afecVar2, biyVar));
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final float c(afco afcoVar) {
        cga cgaVar = (cga) afcoVar.get(cga.a);
        float fA = cgaVar != null ? cgaVar.a() : 1.0f;
        if (fA < BitmapDescriptorFactory.HUE_RED) {
            b("negative scale factor");
        }
        return fA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(final defpackage.aed r21, final defpackage.adz r22, long r23, final defpackage.afec r25, defpackage.afck r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afp.d(aed, adz, long, afec, afck):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [afec, java.lang.Object] */
    public static final Object e(float f, float f2, float f3, aec aecVar, afeg afegVar, afck afckVar) throws Throwable {
        bii biiVar = agm.a;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        ?? r10 = biiVar.b;
        aei aeiVarC = (aei) r10.invoke(f6);
        if (aeiVarC == null) {
            aeiVarC = ((aei) r10.invoke(f4)).c();
        }
        aei aeiVar = aeiVarC;
        Object objD = d(new aed(biiVar, f4, aeiVar, Long.MIN_VALUE, Long.MIN_VALUE, false), new afy(aecVar, biiVar, f4, f5, aeiVar), Long.MIN_VALUE, new abi(afegVar, biiVar, 14), afckVar);
        afcr afcrVar = afcr.a;
        if (objD != afcrVar) {
            objD = afak.a;
        }
        return objD == afcrVar ? objD : afak.a;
    }

    public static final Object f(aed aedVar, Object obj, aec aecVar, boolean z, afec afecVar, afck afckVar) throws Throwable {
        Object objD = d(aedVar, new afy(aecVar, aedVar.e, aedVar.a(), obj, aedVar.a), z ? aedVar.b : Long.MIN_VALUE, afecVar, afckVar);
        return objD == afcr.a ? objD : afak.a;
    }

    public static final void g(aeb aebVar, long j, float f, adz adzVar, aed aedVar, afec afecVar) {
        long jA = f == BitmapDescriptorFactory.HUE_RED ? adzVar.a() : (long) ((j - aebVar.a) / f);
        aebVar.d = j;
        aebVar.b.b(adzVar.c(jA));
        aebVar.c = adzVar.b(jA);
        if (adzVar.d(jA)) {
            aebVar.e = aebVar.d;
            aebVar.d();
        }
        h(aebVar, aedVar);
        afecVar.invoke(aebVar);
    }

    public static final void h(aeb aebVar, aed aedVar) {
        aedVar.c(aebVar.a());
        aei aeiVar = aedVar.a;
        aei aeiVar2 = aebVar.c;
        int iB = aeiVar.b();
        for (int i = 0; i < iB; i++) {
            aeiVar.e(i, aeiVar2.a(i));
        }
        aedVar.c = aebVar.e;
        aedVar.b = aebVar.d;
        aedVar.d = aebVar.c();
    }

    public static /* synthetic */ Object i(float f, aec aecVar, afeg afegVar, afck afckVar, int i) {
        if ((i & 8) != 0) {
            aecVar = new aft(1.0f, 1500.0f, null);
        }
        return e(BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, aecVar, afegVar, afckVar);
    }

    public static /* synthetic */ Object j(aed aedVar, Object obj, aec aecVar, boolean z, afec afecVar, afck afckVar, int i) {
        if ((i & 2) != 0) {
            aecVar = new aft(1.0f, 1500.0f, null);
        }
        aec aecVar2 = aecVar;
        boolean z2 = ((i & 4) == 0) & z;
        if ((i & 8) != 0) {
            afecVar = new acj(3);
        }
        return f(aedVar, obj, aecVar2, z2, afecVar, afckVar);
    }

    public static final bym k(afh afhVar, float f, float f2, afc afcVar, bux buxVar, int i) {
        afc afcVar2;
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(f2);
        bii biiVar = agm.a;
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        Object obj = buw.a;
        if (objS == obj) {
            afd afdVar = new afd(afhVar, fValueOf, fValueOf2, biiVar, afcVar);
            fValueOf = fValueOf;
            afcVar2 = afcVar;
            bvvVar.ad(afdVar);
            objS = afdVar;
        } else {
            afcVar2 = afcVar;
        }
        int i2 = i << 3;
        int i3 = (i2 & 458752) | (i & 1022) | (i2 & 57344);
        afd afdVar2 = (afd) objS;
        boolean z = ((((i3 & 112) ^ 48) > 32 && buxVar.E(fValueOf)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) > 256 && buxVar.E(fValueOf2)) || (i3 & 384) == 256) | ((((i3 & 57344) ^ 24576) > 16384 && buxVar.E(afcVar2)) || (i3 & 24576) == 16384);
        Object objS2 = bvvVar.S();
        if (z || objS2 == obj) {
            bvs bvsVar = new bvs(fValueOf, afdVar2, fValueOf2, afcVar2, 1);
            bvvVar.ad(bvsVar);
            objS2 = bvsVar;
        }
        buxVar.r((afdr) objS2);
        boolean zE = buxVar.E(afhVar);
        Object objS3 = bvvVar.S();
        if (zE || objS3 == obj) {
            objS3 = new abi(afhVar, afdVar2, 13);
            bvvVar.ad(objS3);
        }
        bvq.c(afdVar2, (afec) objS3, buxVar);
        return afdVar2;
    }

    public static final afh l(bux buxVar) {
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        if (objS == buw.a) {
            objS = new afh();
            bvvVar.ad(objS);
        }
        afh afhVar = (afh) objS;
        afhVar.a(buxVar, 0);
        return afhVar;
    }

    public static final Object m(afec afecVar, afck afckVar) {
        dbm dbmVar = (dbm) afckVar.hH().get(dbm.a);
        if (dbmVar == null) {
            return czz.ah(afckVar.hH()).a(afecVar, afckVar);
        }
        new blh(afecVar, (afck) null, 1);
        return dbmVar.a();
    }

    public static long n(agq agqVar) {
        return (agqVar.f() + agqVar.g()) * 1000000;
    }

    public static aei o(agn agnVar, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return agnVar.d(agnVar.a(aeiVar, aeiVar2, aeiVar3), aeiVar, aeiVar2, aeiVar3);
    }

    public static final agg p(Object obj, String str, bux buxVar, int i, int i2) {
        Object objG = buxVar.g();
        Object obj2 = buw.a;
        if (objG == obj2) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            agg aggVar = new agg(new afm(obj), null, str);
            buxVar.x(aggVar);
            objG = aggVar;
        }
        agg aggVar2 = (agg) objG;
        aggVar2.h(obj, buxVar, (i & 8) | 48 | (i & 14));
        Object objG2 = buxVar.g();
        if (objG2 == obj2) {
            objG2 = new acm(aggVar2, 6);
            buxVar.x(objG2);
        }
        bvq.c(aggVar2, (afec) objG2, buxVar);
        return aggVar2;
    }

    public static final void q(agg aggVar, age ageVar, Object obj, Object obj2, aew aewVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(867041821);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(aggVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(ageVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(obj) : buxVarC.E(obj)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? buxVarC.C(obj2) : buxVarC.E(obj2)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? buxVarC.C(aewVar) : buxVarC.E(aewVar)) ? 8192 : 16384;
        }
        if (!buxVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            buxVarC.s();
        } else if (aggVar.w()) {
            ageVar.j(obj, obj2, aewVar);
        } else {
            ageVar.k(obj2, aewVar, null, null);
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new agh(aggVar, ageVar, obj, obj2, aewVar, i, 0);
        }
    }

    public static final agg r(agk agkVar, String str, bux buxVar, int i) {
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !buxVar.C(agkVar)) && (i & 6) != 4) {
            z = false;
        }
        Object objG = buxVar.g();
        if (z || objG == buw.a) {
            cec cecVar = (cec) cek.i.j();
            afec afecVarI = cecVar != null ? cecVar.i() : null;
            cec cecVarI = byx.i(cecVar);
            try {
                Object aggVar = new agg(agkVar, null, str);
                byx.l(cecVar, cecVarI, afecVarI);
                buxVar.x(aggVar);
                objG = aggVar;
            } catch (Throwable th) {
                byx.l(cecVar, cecVarI, afecVarI);
                throw th;
            }
        }
        agg aggVar2 = (agg) objG;
        buxVar.v(-1356407283);
        aggVar2.h(agkVar.b(), buxVar, 0);
        buxVar.o();
        boolean zC = buxVar.C(aggVar2);
        Object objG2 = buxVar.g();
        if (zC || objG2 == buw.a) {
            objG2 = new acm(aggVar2, 5);
            buxVar.x(objG2);
        }
        bvq.c(aggVar2, (afec) objG2, buxVar);
        return aggVar2;
    }

    public static boolean s(agc agcVar, Object obj, Object obj2) {
        return affa.f(obj, agcVar.f()) && affa.f(obj2, agcVar.g());
    }

    public static final cfy t(cfy cfyVar, api apiVar) {
        return cfyVar.a(apiVar == api.a ? cjn.g(cfy.e, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, alm.a, true, 0, 1042431) : cjn.g(cfy.e, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, alm.b, true, 0, 1042431));
    }

    public static final boolean u(cpl cplVar) {
        return (cplVar.g || !cplVar.f || cplVar.d) ? false : true;
    }

    public static final boolean v(KeyEvent keyEvent) {
        long jF = rl.f(keyEvent);
        return jF == ti.g(23) || jF == ti.g(66) || jF == ti.g(160) || jF == ti.g(62);
    }

    public static final cfy w(cfy cfyVar, asf asfVar, akg akgVar, boolean z, ddo ddoVar, afdr afdrVar) {
        return cfyVar.a(akgVar instanceof akm ? new aji(asfVar, (akm) akgVar, false, z, null, ddoVar, afdrVar) : akgVar == null ? new aji(asfVar, null, false, z, null, ddoVar, afdrVar) : asfVar != null ? aki.a(cfy.e, asfVar, akgVar).a(new aji(asfVar, null, false, z, null, ddoVar, afdrVar)) : new cfu(new ajj(akgVar, z, ddoVar, afdrVar)));
    }

    public static final cfy x(cfy cfyVar, boolean z, String str, asf asfVar, afdr afdrVar) {
        return cfyVar.a(new aji(asfVar, null, true, z, str, null, afdrVar));
    }

    public static final void y(long j, api apiVar) {
        if (apiVar == api.a) {
            if (dle.a(j) != Integer.MAX_VALUE) {
                return;
            }
            asl.d("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else if (dle.b(j) == Integer.MAX_VALUE) {
            asl.d("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final void z(cfy cfyVar, afec afecVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-932836462);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            asl.A(cfyVar.a(new chb(afecVar)), buxVarC);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afz(cfyVar, afecVar, i, i4);
        }
    }
}
