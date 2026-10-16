package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class jzg {
    public static final void a(final hex hexVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        hex hexVar2;
        cfy cfyVar2;
        bux buxVar2;
        long j;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1105364696);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(hexVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i4 = i2;
        if (buxVarC.I((i4 & 19) != 18, i4 & 1)) {
            final gku gkuVar = (gku) buxVarC.f(gfn.a);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(Boolean.valueOf(gkuVar.c()), bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            gcq gcqVar = hexVar.d;
            final bwq bwqVar = (bwq) objS;
            final boolean zA = gcqVar != null ? gcqVar.a.a() : false;
            if (zA) {
                buxVarC.v(-405049523);
                j = czz.at(buxVarC).w;
                bvvVar.Y(false);
            } else {
                buxVarC.v(-404998590);
                j = czz.at(buxVarC).s;
                bvvVar.Y(false);
            }
            final long j2 = j;
            final long j3 = czz.at(buxVarC).a;
            hexVar2 = hexVar;
            cfyVar2 = cfyVar;
            buxVar2 = buxVarC;
            hdo.b(cfyVar2, hexVar.a, hexVar.c, bxc.i(-651729712, true, new afeg() { // from class: jzf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bwq bwqVar2;
                    long j4;
                    afeg afegVar;
                    byte[] bArr;
                    bwq bwqVar3;
                    gku gkuVar2;
                    hex hexVar3;
                    Object obj3;
                    boolean z;
                    cfv cfvVar;
                    bux buxVar3 = (bux) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (buxVar3.I((iIntValue & 3) != 2, iIntValue & 1)) {
                        cfv cfvVar2 = cfy.e;
                        ctp ctpVarA = atp.a(atd.c, cfl.j, buxVar3, 0);
                        int iG = a.g(buxVar3.b());
                        ccx ccxVarN = buxVar3.N();
                        cfy cfyVarJ = bzi.j(buxVar3, cfvVar2);
                        afdr afdrVar = cwb.a;
                        buxVar3.M();
                        buxVar3.w();
                        if (buxVar3.G()) {
                            buxVar3.j(afdrVar);
                        } else {
                            buxVar3.y();
                        }
                        afeg afegVar2 = cwb.e;
                        byq.c(buxVar3, ctpVarA, afegVar2);
                        afeg afegVar3 = cwb.d;
                        byq.c(buxVar3, ccxVarN, afegVar3);
                        Integer numValueOf = Integer.valueOf(iG);
                        afeg afegVar4 = cwb.f;
                        byq.c(buxVar3, numValueOf, afegVar4);
                        afec afecVar = cwb.g;
                        byq.b(buxVar3, afecVar);
                        afeg afegVar5 = cwb.c;
                        byq.c(buxVar3, cfyVarJ, afegVar5);
                        ctp ctpVarB = atk.b(cfl.a, false);
                        int iG2 = a.g(buxVar3.b());
                        ccx ccxVarN2 = buxVar3.N();
                        cfy cfyVarJ2 = bzi.j(buxVar3, cfvVar2);
                        buxVar3.M();
                        buxVar3.w();
                        if (buxVar3.G()) {
                            buxVar3.j(afdrVar);
                        } else {
                            buxVar3.y();
                        }
                        byq.c(buxVar3, ctpVarB, afegVar2);
                        byq.c(buxVar3, ccxVarN2, afegVar3);
                        byq.c(buxVar3, Integer.valueOf(iG2), afegVar4);
                        byq.b(buxVar3, afecVar);
                        byq.c(buxVar3, cfyVarJ2, afegVar5);
                        atn atnVar = atn.a;
                        bvf bvfVar = dbc.d;
                        dlg dlgVar = (dlg) buxVar3.f(bvfVar);
                        Object objG = buxVar3.g();
                        Object obj4 = buw.a;
                        if (objG == obj4) {
                            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(Float.valueOf(BitmapDescriptorFactory.HUE_RED), bxp.c);
                            buxVar3.x(parcelableSnapshotMutableState2);
                            objG = parcelableSnapshotMutableState2;
                        }
                        bwq bwqVar4 = bwqVar;
                        bwq bwqVar5 = (bwq) objG;
                        if (((Boolean) bwqVar4.a()).booleanValue()) {
                            buxVar3.v(2107320449);
                            float fFloatValue = (100.0f - ((Number) bwqVar5.a()).floatValue()) / ((dlg) buxVar3.f(bvfVar)).a();
                            buxVar3.o();
                            bwqVar2 = bwqVar4;
                            j4 = ((int) fFloatValue) & 4294967295L;
                        } else {
                            bwqVar2 = bwqVar4;
                            buxVar3.v(2107893918);
                            buxVar3.o();
                            j4 = 0;
                        }
                        hex hexVar4 = hexVar;
                        bym bymVarC = ady.c(new dlo(j4), agm.g, ady.a, null, "offset", null, buxVar3, 24576, 8);
                        bux buxVar4 = buxVar3;
                        gcq gcqVar2 = hexVar4.b;
                        gez gezVarV = null;
                        gfa gfaVar = gcqVar2 != null ? gcqVar2.a : null;
                        if (gfaVar == null) {
                            buxVar4.v(2108146970);
                            buxVar4.o();
                            afegVar = afegVar2;
                            bArr = null;
                        } else {
                            buxVar4.v(-2010205241);
                            afegVar = afegVar2;
                            bArr = null;
                            gezVarV = fwl.v(null, null, null, false, gfaVar, buxVar4, 0, 31);
                            buxVar4 = buxVar4;
                            buxVar4.o();
                        }
                        Object obj5 = gezVarV != null ? gezVarV.a : bArr;
                        gku gkuVar3 = gkuVar;
                        boolean zE = buxVar4.E(gkuVar3);
                        Object objG2 = buxVar4.g();
                        if (zE || objG2 == obj4) {
                            objG2 = new hku(gkuVar3, 19);
                            buxVar4.x(objG2);
                        }
                        afec afecVar2 = (afec) objG2;
                        boolean zE2 = buxVar4.E(gkuVar3);
                        Object objG3 = buxVar4.g();
                        int i5 = 20;
                        if (zE2 || objG3 == obj4) {
                            bwqVar3 = bwqVar2;
                            objG3 = new grn(gkuVar3, bwqVar3, i5, bArr);
                            buxVar4.x(objG3);
                        } else {
                            bwqVar3 = bwqVar2;
                        }
                        afec afecVar3 = (afec) objG3;
                        boolean zE3 = buxVar4.E(gkuVar3) | buxVar4.E(hexVar4);
                        Object objG4 = buxVar4.g();
                        if (zE3 || objG4 == obj4) {
                            objG4 = new hgf((Object) gkuVar3, (Object) hexVar4, (Object) bwqVar3, 5, (char[]) null);
                            gkuVar2 = gkuVar3;
                            hexVar3 = hexVar4;
                            buxVar4.x(objG4);
                        } else {
                            gkuVar2 = gkuVar3;
                            hexVar3 = hexVar4;
                        }
                        afec afecVar4 = (afec) objG4;
                        cfy cfyVarE = gut.e(cfvVar2, hexVar3);
                        Object objG5 = buxVar4.g();
                        if (objG5 == obj4) {
                            obj3 = obj5;
                            objG5 = new hku(bwqVar5, 20);
                            buxVar4.x(objG5);
                        } else {
                            obj3 = obj5;
                        }
                        cfy cfyVarF = tt.f(cfyVarE, (afec) objG5);
                        boolean zC = buxVar4.C(bymVarC);
                        Object objG6 = buxVar4.g();
                        if (zC || objG6 == obj4) {
                            objG6 = new kaa(bymVarC, 1);
                            buxVar4.x(objG6);
                        }
                        cfy cfyVarR = awd.r(awd.n(ca.ak(cfyVarF, (afec) objG6), Float.NaN, 720.0f));
                        boolean zE4 = buxVar4.E(gkuVar2);
                        Object objG7 = buxVar4.g();
                        if (zE4 || objG7 == obj4) {
                            objG7 = new jzi(gkuVar2, bwqVar3, 1, null);
                            buxVar4.x(objG7);
                        }
                        boolean z2 = zA;
                        long j5 = j2;
                        bwq bwqVar6 = bwqVar3;
                        long j6 = j3;
                        cfy cfyVarL = bxc.l(cfyVarR, (afec) objG7);
                        boolean zB = buxVar4.B(j6) | buxVar4.B(j5) | buxVar4.C(dlgVar) | buxVar4.D(z2);
                        Object objG8 = buxVar4.g();
                        if (zB || objG8 == obj4) {
                            z = z2;
                            objG8 = new nku(j6, j5, dlgVar, bwqVar6, z, 1);
                            buxVar4.x(objG8);
                        } else {
                            z = z2;
                        }
                        hex hexVar5 = hexVar3;
                        afeg afegVar6 = afegVar;
                        bux buxVar5 = buxVar4;
                        jyw.d(gbt.e(hexVar3.e), obj3, afecVar2, afecVar3, afecVar4, bxc.r(cfyVarL, (afec) objG8), null, 0L, null, 0L, null, buxVar5, 0, 0);
                        bux buxVar6 = buxVar5;
                        if (!z || ((Boolean) bwqVar6.a()).booleanValue()) {
                            cfvVar = cfvVar2;
                            buxVar6.v(2110213710);
                            buxVar6.o();
                        } else {
                            buxVar6.v(2109857179);
                            cfvVar = cfvVar2;
                            cfy cfyVarA = atnVar.a(cfvVar, cfl.f);
                            ctp ctpVarA2 = avv.a(atd.a, cfl.m, buxVar6, 0);
                            int iG3 = a.g(buxVar6.b());
                            ccx ccxVarN3 = buxVar6.N();
                            cfy cfyVarJ3 = bzi.j(buxVar6, cfyVarA);
                            buxVar6.M();
                            buxVar6.w();
                            if (buxVar6.G()) {
                                buxVar6.j(afdrVar);
                            } else {
                                buxVar6.y();
                            }
                            byq.c(buxVar6, ctpVarA2, afegVar6);
                            byq.c(buxVar6, ccxVarN3, afegVar3);
                            byq.c(buxVar6, Integer.valueOf(iG3), afegVar4);
                            byq.b(buxVar6, afecVar);
                            byq.c(buxVar6, cfyVarJ3, afegVar5);
                            boc.a(dao.b(R.drawable.gs_error_fill1_vd_theme_24, buxVar6, 0), null, awd.i(cfvVar, 32.0f), czz.at(buxVar6).w, buxVar6, 440, 0);
                            asl.A(awd.i(cfvVar, gjk.e.k), buxVar6);
                            buxVar6.n();
                            buxVar6.o();
                        }
                        buxVar6.n();
                        gcq gcqVar3 = hexVar5.d;
                        if (gcqVar3 != null) {
                            buxVar6.v(-455350306);
                            float f = gjk.a.k;
                            asl.A(awd.i(cfvVar, f), buxVar6);
                            float f2 = gjk.e.k;
                            fzc.g(gcqVar3, asl.J(cfvVar, f + f2 + BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED), 1, 0, czz.at(buxVar6).w, czz.av(buxVar6).l, 0L, null, 0, 0, null, null, null, false, false, buxVar6, 392, 0, 65480);
                            buxVar6 = buxVar6;
                            buxVar6.o();
                        } else {
                            buxVar6.v(-454879416);
                            buxVar6.o();
                        }
                        buxVar6.n();
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVar2, ((i4 >> 3) & 14) | 3648);
        } else {
            hexVar2 = hexVar;
            cfyVar2 = cfyVar;
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kkt(hexVar2, cfyVar2, i, 1);
        }
    }

    public static final boolean b(geu geuVar) {
        geuVar.getClass();
        return affa.f(((gmh) geuVar.d()).a, kyg.a) && affa.f(geuVar.b().getSessionId(), "dashboard_card");
    }

    public static final bmv c(long j, bux buxVar, int i) {
        if ((i & 1) != 0) {
            j = kfn.i(buxVar).G();
        }
        long j2 = j;
        return new bmv(j2, bnh.d(j2, buxVar), cjn.l(cjv.h(kfn.i(buxVar).G(), 0.38f), bnh.b(czz.at(buxVar), BitmapDescriptorFactory.HUE_RED)), cjv.h(bnh.d(j2, buxVar), 0.38f));
    }

    public static final ckv d(ckv ckvVar, float f) {
        if (!(ckvVar instanceof bcm)) {
            return ckvVar;
        }
        bcm bcmVar = (bcm) ckvVar;
        return new bcm(new ktx(f, bcmVar.a), new ktx(f, bcmVar.b), new ktx(f, bcmVar.c), new ktx(f, bcmVar.d));
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.cmw r28, final boolean r29, final defpackage.afec r30, defpackage.cfy r31, defpackage.ksy r32, boolean r33, defpackage.brx r34, defpackage.kts r35, defpackage.bmr r36, defpackage.asf r37, defpackage.bux r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzg.e(cmw, boolean, afec, cfy, ksy, boolean, brx, kts, bmr, asf, bux, int, int, int):void");
    }

    public static final void f(final cmw cmwVar, final deu deuVar, final boolean z, final afec afecVar, final cfy cfyVar, final ksy ksyVar, final boolean z2, final brx brxVar, final kts ktsVar, final bmr bmrVar, final asf asfVar, bux buxVar, final int i, final int i2) {
        int i3;
        boolean z3;
        afec afecVar2;
        cfy cfyVar2;
        boolean z4;
        int i4;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(1839742527);
        if (i5 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(cmwVar) : buxVarC.E(cmwVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(deuVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i3 |= true != buxVarC.D(z3) ? 128 : 256;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            afecVar2 = afecVar;
            i3 |= true != buxVarC.E(afecVar2) ? 1024 : 2048;
        } else {
            afecVar2 = afecVar;
        }
        if ((i & 24576) == 0) {
            cfyVar2 = cfyVar;
            i3 |= true != buxVarC.C(cfyVar2) ? 8192 : 16384;
        } else {
            cfyVar2 = cfyVar;
        }
        if ((196608 & i) == 0) {
            i3 |= true != ((262144 & i) == 0 ? buxVarC.C(ksyVar) : buxVarC.E(ksyVar)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            z4 = z2;
            i3 |= true != buxVarC.D(z4) ? 524288 : 1048576;
        } else {
            z4 = z2;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != buxVarC.C(brxVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != buxVarC.C(ktsVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != buxVarC.C(bmrVar) ? 268435456 : 536870912;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != buxVarC.C(asfVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != buxVarC.C(null) ? 16 : 32;
        }
        if (buxVarC.I(((306783379 & i6) == 306783378 && (i4 & 19) == 18) ? false : true, i6 & 1)) {
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            avp avpVarD = khc.d(ksyVar, deuVar != null ? deuVar.a() : 0, cmwVar != null);
            cct cctVarI = bxc.i(1714381027, true, new hhb(cmwVar, deuVar, ksyVar, 6, null), buxVarC);
            ksy ksyVar2 = ksy.a;
            int i7 = i6 >> 3;
            afec afecVar3 = afecVar2;
            boolean z5 = z3;
            g(z5, afecVar3, cfyVar2, ksyVar, avpVarD, z4, brxVar, ktsVar, bmrVar, asfVar, false, cctVarI, buxVarC, ((i6 >> 6) & 8190) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (i7 & 234881024) | (1879048192 & (i4 << 27)), ((i4 >> 3) & 14) | 384, 2048);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: kuj
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cmw cmwVar2 = cmwVar;
                    deu deuVar2 = deuVar;
                    boolean z6 = z;
                    afec afecVar4 = afecVar;
                    cfy cfyVar3 = cfyVar;
                    ksy ksyVar3 = ksyVar;
                    boolean z7 = z2;
                    int i8 = i;
                    brx brxVar2 = brxVar;
                    int i9 = i2;
                    int i10 = i8 | 1;
                    int i11 = i9 & 306783378;
                    int i12 = 306783378 & i10;
                    bmr bmrVar2 = bmrVar;
                    int i13 = i9 & 613566756;
                    int i14 = i10 & 613566756;
                    asf asfVar2 = asfVar;
                    jzg.f(cmwVar2, deuVar2, z6, afecVar4, cfyVar3, ksyVar3, z7, brxVar2, ktsVar, bmrVar2, asfVar2, (bux) obj, (i10 & (-920350135)) | i12 | (i14 >> 1) | ((i12 + i12) & i14), (i9 & (-920350135)) | i11 | (i13 >> 1) | ((i11 + i11) & i13));
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final boolean r31, final defpackage.afec r32, defpackage.cfy r33, defpackage.ksy r34, defpackage.avp r35, boolean r36, defpackage.brx r37, defpackage.kts r38, defpackage.bmr r39, defpackage.asf r40, boolean r41, final defpackage.afeh r42, defpackage.bux r43, int r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzg.g(boolean, afec, cfy, ksy, avp, boolean, brx, kts, bmr, asf, boolean, afeh, bux, int, int, int):void");
    }

    public static final void h(cmw cmwVar, boolean z, afec afecVar, cfy cfyVar, ksy ksyVar, boolean z2, brx brxVar, kts ktsVar, bmr bmrVar, asf asfVar, bux buxVar, int i, int i2) {
        int i3;
        boolean z3;
        cfy cfyVar2;
        ksy ksyVar2;
        boolean z4;
        brx brxVar2;
        kts ktsVar2;
        bmr bmrVar2;
        asf asfVar2;
        cfy cfyVar3;
        bmr bmrVar3;
        int i4;
        int i5;
        cmwVar.getClass();
        afecVar.getClass();
        int i6 = i & 6;
        bux buxVarC = buxVar.c(1780460679);
        if (i6 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(cmwVar) : buxVarC.E(cmwVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i3 |= true != buxVarC.D(z3) ? 16 : 32;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.E(afecVar) ? 128 : 256;
        }
        int i7 = i3 | 3072;
        if ((i & 24576) == 0) {
            i7 = i3 | 11264;
        }
        int i8 = 196608 | i7;
        if ((1572864 & i) == 0) {
            i8 = i7 | 720896;
        }
        if ((12582912 & i) == 0) {
            i8 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i8 |= 33554432;
        }
        int i9 = i2 | 6;
        int i10 = i8 | 805306368;
        if (buxVarC.I(((306783379 & i10) == 306783378 && (i9 & 3) == 2) ? false : true, i10 & 1)) {
            int i11 = i10 >> 24;
            int i12 = (-267968513) & i10;
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                cfyVar3 = cfy.e;
                ksy ksyVar3 = ksy.c;
                int i13 = kug.a;
                brx brxVarA = kug.a(buxVarC);
                aezr aezrVar = kts.a;
                kts ktsVarJ = jyw.j(buxVarC);
                avp avpVar = bmo.a;
                bmrVar3 = new bmr(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
                Object objS = bvvVar.S();
                if (objS == buw.a) {
                    objS = new asg();
                    bvvVar.ad(objS);
                }
                asf asfVar3 = (asf) objS;
                i4 = i12;
                ksyVar2 = ksyVar3;
                brxVar2 = brxVarA;
                ktsVar2 = ktsVarJ;
                asfVar2 = asfVar3;
                i5 = i10;
                z4 = true;
            } else {
                buxVarC.s();
                cfyVar3 = cfyVar;
                ksyVar2 = ksyVar;
                ktsVar2 = ktsVar;
                bmrVar3 = bmrVar;
                asfVar2 = asfVar;
                i5 = i10;
                i4 = i12;
                z4 = z2;
                brxVar2 = brxVar;
            }
            buxVarC.l();
            int i14 = i4 << 3;
            ksy ksyVar4 = ksy.a;
            int i15 = (i9 & 14) | (i11 & 112);
            boolean z5 = z3;
            cfyVar2 = cfyVar3;
            bmrVar2 = bmrVar3;
            f(cmwVar, null, z5, afecVar, cfyVar2, ksyVar2, z4, brxVar2, ktsVar2, bmrVar2, asfVar2, buxVarC, (i5 & 14) | 56 | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 3670016), i15);
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
            ksyVar2 = ksyVar;
            z4 = z2;
            brxVar2 = brxVar;
            ktsVar2 = ktsVar;
            bmrVar2 = bmrVar;
            asfVar2 = asfVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kuh(cmwVar, z, afecVar, cfyVar2, ksyVar2, z4, brxVar2, ktsVar2, bmrVar2, asfVar2, i, i2, 0);
        }
    }

    public static final void i(cmw cmwVar, boolean z, afec afecVar, cfy cfyVar, ksy ksyVar, boolean z2, brx brxVar, kts ktsVar, bmr bmrVar, asf asfVar, bux buxVar, int i, int i2) {
        int i3;
        boolean z3;
        cfy cfyVar2;
        ksy ksyVar2;
        boolean z4;
        brx brxVar2;
        kts ktsVar2;
        bmr bmrVar2;
        asf asfVar2;
        cfy cfyVar3;
        kts ktsVarJ;
        boolean z5;
        afecVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-1790800555);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(cmwVar) : buxVarC.E(cmwVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.C("Label") ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i3 |= true != buxVarC.D(z3) ? 128 : 256;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.E(afecVar) ? 1024 : 2048;
        }
        int i5 = i3 | 24576;
        if ((196608 & i) == 0) {
            i5 = i3 | 90112;
        }
        int i6 = 1572864 | i5;
        if ((12582912 & i) == 0) {
            i6 = i5 | 5767168;
        }
        if ((100663296 & i) == 0) {
            i6 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i6 |= 268435456;
        }
        int i7 = i2 | 54;
        if (buxVarC.I(((306783379 & i6) == 306783378 && (i7 & 19) == 18) ? false : true, i6 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                cfyVar3 = cfy.e;
                ksy ksyVar3 = ksy.c;
                int i8 = kug.a;
                brx brxVarA = kug.a(buxVarC);
                aezr aezrVar = kts.a;
                ktsVarJ = jyw.j(buxVarC);
                avp avpVar = bmo.a;
                bmr bmrVar3 = new bmr(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
                Object objS = bvvVar.S();
                if (objS == buw.a) {
                    objS = new asg();
                    bvvVar.ad(objS);
                }
                ksyVar2 = ksyVar3;
                brxVar2 = brxVarA;
                bmrVar2 = bmrVar3;
                asfVar2 = (asf) objS;
                z5 = true;
            } else {
                buxVarC.s();
                cfyVar3 = cfyVar;
                ksyVar2 = ksyVar;
                z5 = z2;
                brxVar2 = brxVar;
                ktsVarJ = ktsVar;
                bmrVar2 = bmrVar;
                asfVar2 = asfVar;
            }
            buxVarC.l();
            deu deuVar = new deu("Label");
            int i9 = i6 & 7168;
            int i10 = i6 & 57344;
            ksy ksyVar4 = ksy.a;
            z4 = z5;
            cfyVar2 = cfyVar3;
            ktsVar2 = ktsVarJ;
            f(cmwVar, deuVar, z3, afecVar, cfyVar2, ksyVar2, z4, brxVar2, ktsVar2, bmrVar2, asfVar2, buxVarC, i9 | (i6 & 14) | 8 | (i6 & 896) | i10 | (i6 & 3670016), ((i7 >> 3) & 14) | ((i7 << 3) & 112));
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
            ksyVar2 = ksyVar;
            z4 = z2;
            brxVar2 = brxVar;
            ktsVar2 = ktsVar;
            bmrVar2 = bmrVar;
            asfVar2 = asfVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kuh(cmwVar, z, afecVar, cfyVar2, ksyVar2, z4, brxVar2, ktsVar2, bmrVar2, asfVar2, i, i2, 2);
        }
    }
}
