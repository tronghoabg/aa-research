package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class bnf {
    public static final float a;
    private static final bmx b;

    static {
        float f = bqk.a;
        float f2 = bqk.a;
        b = new bmx(f2, f2);
        a = 1000.0f;
    }

    public static /* synthetic */ afak a(long j, afeg afegVar, bux buxVar, int i) {
        if (buxVar.I((i & 3) != 2, i & 1)) {
            czz.am(bnm.a.b(new cjv(j)), afegVar, buxVar, 8);
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    public static final bym b(Object obj, bux buxVar) {
        Object objG = buxVar.g();
        if (objG == buw.a) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(obj, bxp.c);
            buxVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        bwq bwqVar = (bwq) objG;
        if (obj != null) {
            bwqVar.b(obj);
        }
        return bwqVar;
    }

    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    public static final void c(final afeg afegVar, final dfw dfwVar, final long j, final afeg afegVar2, final afeg afegVar3, final long j2, final long j3, final asw aswVar, final avp avpVar, final aew aewVar, final aew aewVar2, final aew aewVar3, final aew aewVar4, bux buxVar, final int i, final int i2) {
        int i3;
        afeg afegVar4;
        int i4;
        asw aswVar2;
        avp avpVar2;
        int i5;
        int i6;
        aew aewVar5;
        int i7;
        ?? r1;
        boolean z;
        int i8 = i & 6;
        bux buxVarC = buxVar.c(-1255048750);
        if (i8 == 0) {
            i3 = (true != buxVarC.E(afegVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(dfwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.B(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.E(afegVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.E(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            afegVar4 = afegVar3;
            i3 |= true != buxVarC.E(afegVar4) ? 65536 : 131072;
        } else {
            afegVar4 = afegVar3;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != buxVarC.B(j2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i4 = i3 | (true != buxVarC.B(j3) ? 4194304 : 8388608);
        } else {
            i4 = i3;
        }
        if ((100663296 & i) == 0) {
            i4 |= true != buxVarC.z(32.0f) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            aswVar2 = aswVar;
            i4 |= true != buxVarC.C(aswVar2) ? 268435456 : 536870912;
        } else {
            aswVar2 = aswVar;
        }
        if ((i2 & 6) == 0) {
            avpVar2 = avpVar;
            i5 = (true != buxVarC.C(avpVar2) ? 2 : 4) | i2;
        } else {
            avpVar2 = avpVar;
            i5 = i2;
        }
        int i9 = i5;
        if ((i2 & 48) == 0) {
            i6 = i9 | (true != buxVarC.E(aewVar) ? 16 : 32);
        } else {
            i6 = i9;
        }
        if ((i2 & 384) == 0) {
            aewVar5 = aewVar2;
            i7 = i6 | (true != buxVarC.E(aewVar5) ? 128 : 256);
        } else {
            aewVar5 = aewVar2;
            i7 = i6;
        }
        if ((i2 & 3072) == 0) {
            i7 |= true == buxVarC.E(aewVar3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i7 |= true == buxVarC.E(aewVar4) ? 16384 : 8192;
        }
        if ((306783379 & i4) == 306783378 && (i7 & 9363) == 9362) {
            z = false;
            r1 = 1;
        } else {
            r1 = 1;
            z = true;
        }
        if (buxVarC.I(z, i4 & 1)) {
            bxe[] bxeVarArr = new bxe[2];
            bxeVarArr[0] = bnm.a.b(new cjv(j));
            bxeVarArr[r1] = brp.a.b(dfwVar);
            final afeg afegVar5 = afegVar4;
            final avp avpVar3 = avpVar2;
            final aew aewVar6 = aewVar5;
            final asw aswVar3 = aswVar2;
            czz.an(bxeVarArr, bxc.i(-881676654, r1, new afeg() { // from class: bmy
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    afeg afegVar6;
                    avy avyVar;
                    boolean z2;
                    cfv cfvVar;
                    bux buxVar2 = (bux) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i10 = iIntValue & 3;
                    int i11 = iIntValue & 1;
                    float f = bnf.a;
                    if (buxVar2.I(i10 != 2, i11)) {
                        asw aswVar4 = aswVar3;
                        avp avpVar4 = avpVar3;
                        cfv cfvVar2 = cfy.e;
                        cfy cfyVarG = asl.G(awd.q(awd.n(cfvVar2, Float.NaN, bnf.a), BitmapDescriptorFactory.HUE_RED, 32.0f, 1), avpVar4);
                        cfr cfrVar = cfl.n;
                        ctp ctpVarA = avv.a(aswVar4, cfrVar, buxVar2, 48);
                        int iG = a.g(buxVar2.b());
                        ccx ccxVarN = buxVar2.N();
                        cfy cfyVarJ = bzi.j(buxVar2, cfyVarG);
                        afdr afdrVar = cwb.a;
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        afeg afegVar7 = cwb.e;
                        byq.c(buxVar2, ctpVarA, afegVar7);
                        afeg afegVar8 = cwb.d;
                        byq.c(buxVar2, ccxVarN, afegVar8);
                        Integer numValueOf = Integer.valueOf(iG);
                        afeg afegVar9 = cwb.f;
                        byq.c(buxVar2, numValueOf, afegVar9);
                        afec afecVar = cwb.g;
                        byq.b(buxVar2, afecVar);
                        afeg afegVar10 = cwb.c;
                        byq.c(buxVar2, cfyVarJ, afegVar10);
                        avy avyVar2 = avy.a;
                        cfn cfnVar = cfl.a;
                        ctp ctpVarB = atk.b(cfnVar, false);
                        int iG2 = a.g(buxVar2.b());
                        ccx ccxVarN2 = buxVar2.N();
                        cfy cfyVarJ2 = bzi.j(buxVar2, cfvVar2);
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        afeg afegVar11 = afegVar2;
                        byq.c(buxVar2, ctpVarB, afegVar7);
                        byq.c(buxVar2, ccxVarN2, afegVar8);
                        byq.c(buxVar2, Integer.valueOf(iG2), afegVar9);
                        byq.b(buxVar2, afecVar);
                        byq.c(buxVar2, cfyVarJ2, afegVar10);
                        if (afegVar11 != null) {
                            afegVar6 = afegVar8;
                            avyVar = avyVar2;
                            z2 = true;
                        } else {
                            afegVar6 = afegVar8;
                            avyVar = avyVar2;
                            z2 = false;
                        }
                        long j4 = j2;
                        aew aewVar7 = aewVar6;
                        aew aewVar8 = aewVar4;
                        aew aewVar9 = aewVar;
                        aew aewVar10 = aewVar3;
                        avy avyVar3 = avyVar;
                        cfm cfmVar = cfl.j;
                        afeg afegVar12 = afegVar6;
                        ca.N(avyVar3, z2, null, acl.n(aewVar10, cfmVar, 12).a(acl.B(aewVar9, 2)), acl.s(aewVar8, cfmVar, 12).a(acl.C(aewVar7, 2)), null, bxc.i(-181659180, true, new bne(afegVar11, j4, 1), buxVar2), buxVar2, 1572870, 18);
                        if (afegVar11 == null) {
                            buxVar2.v(-37113233);
                            cfvVar = cfvVar2;
                            asl.A(awd.m(cfvVar, BitmapDescriptorFactory.HUE_RED), buxVar2);
                            buxVar2.o();
                        } else {
                            cfvVar = cfvVar2;
                            buxVar2.v(-37029626);
                            buxVar2.o();
                        }
                        buxVar2.n();
                        cfy cfyVarB = avyVar3.b(cfvVar, 1.0f, false);
                        ctp ctpVarA2 = avv.a(atd.a, cfrVar, buxVar2, 54);
                        int iG3 = a.g(buxVar2.b());
                        ccx ccxVarN3 = buxVar2.N();
                        cfy cfyVarJ3 = bzi.j(buxVar2, cfyVarB);
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        afeg afegVar13 = afegVar;
                        byq.c(buxVar2, ctpVarA2, afegVar7);
                        byq.c(buxVar2, ccxVarN3, afegVar12);
                        byq.c(buxVar2, Integer.valueOf(iG3), afegVar9);
                        byq.b(buxVar2, afecVar);
                        byq.c(buxVar2, cfyVarJ3, afegVar10);
                        afegVar13.invoke(buxVar2, 0);
                        buxVar2.n();
                        ctp ctpVarB2 = atk.b(cfnVar, false);
                        int iG4 = a.g(buxVar2.b());
                        ccx ccxVarN4 = buxVar2.N();
                        cfy cfyVarJ4 = bzi.j(buxVar2, cfvVar);
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        long j5 = j3;
                        afeg afegVar14 = afegVar5;
                        byq.c(buxVar2, ctpVarB2, afegVar7);
                        byq.c(buxVar2, ccxVarN4, afegVar12);
                        byq.c(buxVar2, Integer.valueOf(iG4), afegVar9);
                        byq.b(buxVar2, afecVar);
                        byq.c(buxVar2, cfyVarJ4, afegVar10);
                        boolean z3 = afegVar14 != null;
                        cfm cfmVar2 = cfl.l;
                        ca.N(avyVar3, z3, null, acl.n(aewVar10, cfmVar2, 12).a(acl.B(aewVar9, 2)), acl.s(aewVar8, cfmVar2, 12).a(acl.C(aewVar7, 2)), null, bxc.i(-1090690805, true, new bne(afegVar14, j5, 0), buxVar2), buxVar2, 1572870, 18);
                        if (afegVar14 == null) {
                            buxVar2.v(-1514776840);
                            asl.A(awd.m(cfvVar, BitmapDescriptorFactory.HUE_RED), buxVar2);
                            buxVar2.o();
                        } else {
                            buxVar2.v(-1514693233);
                            buxVar2.o();
                        }
                        buxVar2.n();
                        buxVar2.n();
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bmz
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    afeg afegVar6 = afegVar;
                    dfw dfwVar2 = dfwVar;
                    long j4 = j;
                    afeg afegVar7 = afegVar2;
                    afeg afegVar8 = afegVar3;
                    long j5 = j2;
                    long j6 = j3;
                    asw aswVar4 = aswVar;
                    avp avpVar4 = avpVar;
                    int i10 = i;
                    aew aewVar7 = aewVar;
                    int i11 = i2;
                    int i12 = i10 | 1;
                    int i13 = i11 & 306783378;
                    int i14 = i12 & 306783378;
                    aew aewVar8 = aewVar3;
                    int i15 = i11 & 613566756;
                    int i16 = i12 & 613566756;
                    aew aewVar9 = aewVar4;
                    bnf.c(afegVar6, dfwVar2, j4, afegVar7, afegVar8, j5, j6, aswVar4, avpVar4, aewVar7, aewVar2, aewVar8, aewVar9, (bux) obj, (i12 & (-920350135)) | i14 | (i16 >> 1) | ((i14 + i14) & i16), (i11 & (-920350135)) | i13 | (i15 >> 1) | ((i13 + i13) & i15));
                    return afak.a;
                }
            };
        }
    }

    public static final void d(final boolean z, final afdr afdrVar, final afeg afegVar, final cfy cfyVar, boolean z2, final afeg afegVar2, final afeg afegVar3, final ckv ckvVar, final bpq bpqVar, bps bpsVar, final ajh ajhVar, asw aswVar, final avp avpVar, final asf asfVar, bux buxVar, final int i, final int i2) {
        int i3;
        afdr afdrVar2;
        afeg afegVar4;
        cfy cfyVar2;
        afeg afegVar5;
        int i4;
        bpq bpqVar2;
        ajh ajhVar2;
        int i5;
        avp avpVar2;
        bux buxVar2;
        final boolean z3;
        final bps bpsVar2;
        final asw aswVar2;
        bps bpsVar3;
        asw aswVar3;
        boolean z4;
        int i6 = i & 6;
        bux buxVarC = buxVar.c(1511159815);
        if (i6 == 0) {
            i3 = (true != buxVarC.D(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            afdrVar2 = afdrVar;
            i3 |= true != buxVarC.E(afdrVar2) ? 16 : 32;
        } else {
            afdrVar2 = afdrVar;
        }
        if ((i & 384) == 0) {
            afegVar4 = afegVar;
            i3 |= true != buxVarC.E(afegVar4) ? 128 : 256;
        } else {
            afegVar4 = afegVar;
        }
        if ((i & 3072) == 0) {
            cfyVar2 = cfyVar;
            i3 |= true != buxVarC.C(cfyVar2) ? 1024 : 2048;
        } else {
            cfyVar2 = cfyVar;
        }
        int i7 = i3 | 24576;
        if ((196608 & i) == 0) {
            afegVar5 = afegVar2;
            i7 |= true != buxVarC.E(afegVar5) ? 65536 : 131072;
        } else {
            afegVar5 = afegVar2;
        }
        if ((1572864 & i) == 0) {
            i7 |= true != buxVarC.E(afegVar3) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i4 = 12582912;
            i7 |= true != buxVarC.C(ckvVar) ? 4194304 : 8388608;
        } else {
            i4 = 12582912;
        }
        if ((100663296 & i) == 0) {
            bpqVar2 = bpqVar;
            i7 |= true != buxVarC.C(bpqVar2) ? 33554432 : 67108864;
        } else {
            bpqVar2 = bpqVar;
        }
        if ((805306368 & i) == 0) {
            i7 |= 268435456;
        }
        if ((i2 & 6) == 0) {
            ajhVar2 = ajhVar;
            i5 = i2 | (true != buxVarC.C(ajhVar2) ? 2 : 4);
        } else {
            ajhVar2 = ajhVar;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= 16;
        }
        if ((i2 & 384) == 0) {
            avpVar2 = avpVar;
            i5 |= true != buxVarC.C(avpVar2) ? 128 : 256;
        } else {
            avpVar2 = avpVar;
        }
        if ((i2 & 3072) == 0) {
            i5 |= true != buxVarC.C(asfVar) ? 1024 : 2048;
        }
        if (buxVarC.I(((306783379 & i7) == 306783378 && (i5 & 1171) == 1170) ? false : true, i7 & 1)) {
            int i8 = i5 & (-113);
            int i9 = i7 >> 24;
            int i10 = (-1879048193) & i7;
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                int i11 = bnr.a;
                bpsVar3 = new bps();
                aswVar3 = b;
                z4 = true;
            } else {
                buxVarC.s();
                z4 = z2;
                bpsVar3 = bpsVar;
                aswVar3 = aswVar;
            }
            buxVarC.l();
            dfw dfwVarAp = czz.ap(10, buxVarC);
            int i12 = bnr.a;
            int i13 = i10 << 3;
            int i14 = i10 << 6;
            int i15 = i8 << 9;
            buxVar2 = buxVarC;
            afdr afdrVar3 = afdrVar2;
            afeg afegVar6 = afegVar4;
            bpq bpqVar3 = bpqVar2;
            ajh ajhVar3 = ajhVar2;
            cfy cfyVar3 = cfyVar2;
            avp avpVar3 = avpVar2;
            afeg afegVar7 = afegVar5;
            e(z, cfyVar3, afdrVar3, z4, afegVar6, dfwVarAp, afegVar7, afegVar3, ckvVar, bpqVar3, bpsVar3, ajhVar3, aswVar3, avpVar3, asfVar, buxVar2, (i7 & 14) | i4 | ((i10 >> 6) & 112) | (i13 & 896) | ((i10 >> 3) & 7168) | (57344 & i14) | (i13 & 3670016) | (234881024 & i14) | (1879048192 & i14), ((i8 << 6) & 896) | (i9 & 14) | 3072 | (i15 & 458752) | (i15 & 3670016));
            z3 = z4;
            bpsVar2 = bpsVar3;
            aswVar2 = aswVar3;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            z3 = z2;
            bpsVar2 = bpsVar;
            aswVar2 = aswVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bnd
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z5 = z;
                    afdr afdrVar4 = afdrVar;
                    afeg afegVar8 = afegVar;
                    cfy cfyVar4 = cfyVar;
                    boolean z6 = z3;
                    afeg afegVar9 = afegVar2;
                    afeg afegVar10 = afegVar3;
                    ckv ckvVar2 = ckvVar;
                    bpq bpqVar4 = bpqVar;
                    bps bpsVar4 = bpsVar2;
                    int i16 = i;
                    ajh ajhVar4 = ajhVar;
                    int i17 = i2;
                    int i18 = i16 | 1;
                    int i19 = i17 & 306783378;
                    int i20 = i18 & 306783378;
                    avp avpVar4 = avpVar;
                    int i21 = i17 & 613566756;
                    int i22 = i18 & 613566756;
                    asf asfVar2 = asfVar;
                    bnf.d(z5, afdrVar4, afegVar8, cfyVar4, z6, afegVar9, afegVar10, ckvVar2, bpqVar4, bpsVar4, ajhVar4, aswVar2, avpVar4, asfVar2, (bux) obj, (i18 & (-920350135)) | i20 | (i22 >> 1) | ((i20 + i20) & i22), (i17 & (-920350135)) | i19 | (i21 >> 1) | ((i19 + i19) & i21));
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final boolean r36, final defpackage.cfy r37, final defpackage.afdr r38, final boolean r39, final defpackage.afeg r40, final defpackage.dfw r41, final defpackage.afeg r42, final defpackage.afeg r43, final defpackage.ckv r44, final defpackage.bpq r45, final defpackage.bps r46, final defpackage.ajh r47, final defpackage.asw r48, final defpackage.avp r49, final defpackage.asf r50, defpackage.bux r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnf.e(boolean, cfy, afdr, boolean, afeg, dfw, afeg, afeg, ckv, bpq, bps, ajh, asw, avp, asf, bux, int, int):void");
    }
}
