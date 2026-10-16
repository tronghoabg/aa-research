package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class nhm {
    public static final yph a = yph.c("GH.CompHoriRailFrag");

    public static final cfy a(cfy cfyVar, cil cilVar, cil cilVar2, boolean z) {
        return cfyVar.a(new cfu(new kkx(cilVar, z, cilVar2, 3)));
    }

    public static final void b(cfy cfyVar, njw njwVar, boolean z, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1166531879);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(njwVar) : buxVarC.E(njwVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            cfy cfyVarI = z ? asl.I(cfyVar, gjk.a.k, BitmapDescriptorFactory.HUE_RED) : cfyVar;
            yph yphVar = njw.a;
            lvl.ab(njwVar, cfyVarI, buxVarC, ((i2 >> 3) & 14) | 8);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gvo(cfyVar, njwVar, z, i, 6);
        }
    }

    public static final void c(bux buxVar, int i) {
        bux buxVarC = buxVar.c(1901099176);
        if (buxVarC.I(i != 0, i & 1)) {
            cmw cmwVarB = dao.b(R.drawable.ic_close, buxVarC, 0);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new ngv(0);
                bvvVar.ad(objS);
            }
            khc.l(cmwVarB, (afdr) objS, null, null, false, null, null, null, null, buxVarC, 56, 0, 4092);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gug(i, 9);
        }
    }

    public static final void d(cfy cfyVar, njw njwVar, boolean z, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-232394501);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(njwVar) : buxVarC.E(njwVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            int i4 = i2 & 896;
            int i5 = (i2 & 14) | 64 | (i2 & 112);
            if (((Boolean) bxc.f(njwVar.j(), false, buxVarC).a()).booleanValue()) {
                buxVarC.v(222942640);
                b(cfyVar, njwVar, z, buxVarC, i5 | i4);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(223003121);
                kfn.o(cfyVar, njwVar, z, buxVarC, i5 | i4);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jvi(cfyVar, njwVar, z, i, 2);
        }
    }

    public static final void e(final cfy cfyVar, final boolean z, final boolean z2, final njw njwVar, final njp njpVar, final boolean z3, final boolean z4, final afec afecVar, final nnl nnlVar, final cil cilVar, final cil cilVar2, final cil cilVar3, final Map map, final bwq bwqVar, final afdr afdrVar, final boolean z5, final boolean z6, final boolean z7, bux buxVar, final int i, final int i2) {
        int i3;
        boolean z8;
        int i4;
        int i5;
        int i6;
        boolean z9;
        int i7;
        afec afecVar2;
        cil cilVar4;
        int i8;
        boolean z10;
        final bwq bwqVar2;
        boolean z11;
        bux buxVar2;
        int i9 = i & 6;
        bux buxVarC = buxVar.c(2001643110);
        if (i9 == 0) {
            i3 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z8 = z;
            i3 |= true != buxVarC.D(z8) ? 16 : 32;
        } else {
            z8 = z;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.D(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != ((i & 4096) == 0 ? buxVarC.C(njwVar) : buxVarC.E(njwVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != ((32768 & i) == 0 ? buxVarC.C(njpVar) : buxVarC.E(njpVar)) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i4 = 196608;
            i3 |= true != buxVarC.D(z3) ? 65536 : 131072;
        } else {
            i4 = 196608;
        }
        if ((i & 1572864) == 0) {
            i5 = 1572864;
            i6 = 32;
            z9 = z4;
            i3 |= true != buxVarC.D(z9) ? 524288 : 1048576;
        } else {
            i5 = 1572864;
            i6 = 32;
            z9 = z4;
        }
        if ((i & 12582912) == 0) {
            i7 = 12582912;
            afecVar2 = afecVar;
            i3 |= true != buxVarC.E(afecVar2) ? 4194304 : 8388608;
        } else {
            i7 = 12582912;
            afecVar2 = afecVar;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != ((134217728 & i) == 0 ? buxVarC.C(nnlVar) : buxVarC.E(nnlVar)) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            cilVar4 = cilVar;
            i3 |= true != buxVarC.C(cilVar4) ? 268435456 : 536870912;
        } else {
            cilVar4 = cilVar;
        }
        if ((i2 & 6) == 0) {
            i8 = i2 | (true != buxVarC.C(cilVar2) ? 2 : 4);
        } else {
            i8 = i2;
        }
        int i10 = i8;
        if ((i2 & 48) == 0) {
            i8 = i10 | (true != buxVarC.C(cilVar3) ? 16 : i6);
        }
        if ((i2 & 384) == 0) {
            z10 = true;
            i8 |= true == ((i2 & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(map) : buxVarC.E(map)) ? 256 : 128;
        } else {
            z10 = true;
        }
        if ((i2 & 3072) == 0) {
            bwqVar2 = bwqVar;
            i8 |= z10 == buxVarC.C(bwqVar2) ? 2048 : 1024;
        } else {
            bwqVar2 = bwqVar;
        }
        if ((i2 & 24576) == 0) {
            z11 = true;
            i8 |= true != buxVarC.E(afdrVar) ? 8192 : 16384;
        } else {
            z11 = true;
        }
        if ((i2 & i4) == 0) {
            i8 |= z11 == buxVarC.D(z5) ? 131072 : 65536;
        }
        int i11 = i8;
        if ((i2 & i5) == 0) {
            i8 = i11 | (z11 == buxVarC.D(z6) ? 1048576 : 524288);
        }
        if ((i2 & i7) == 0) {
            i8 |= z11 != buxVarC.D(z7) ? 4194304 : 8388608;
        }
        if (buxVarC.I(((306783379 & i3) == 306783378 && (4793491 & i8) == 4793490) ? false : true, i3 & 1)) {
            ctp ctpVarA = avv.a(atd.e, cfl.m, buxVarC, 6);
            bvv bvvVar = (bvv) buxVarC;
            long j = bvvVar.u;
            long j2 = j ^ (j >>> i6);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf((int) j2), cwb.f);
            buxVarC.i(afak.a, new alx(cwb.g, 16));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            final boolean z12 = z9;
            final boolean z13 = z8;
            final cil cilVar5 = cilVar4;
            final afec afecVar3 = afecVar2;
            buxVar2 = buxVarC;
            ca.V(Boolean.valueOf(z2 && !lxr.x(nnlVar)), null, null, null, "RailWidget vs Hotseat", null, bxc.i(-26520243, true, new afei() { // from class: nhf
                @Override // defpackage.afei
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i12;
                    Object obj5;
                    bux buxVar3;
                    final abg abgVar = (abg) obj;
                    final boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    bux buxVar4 = (bux) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    yph yphVar = nhm.a;
                    abgVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        i12 = (true != ((iIntValue & 8) == 0 ? buxVar4.C(abgVar) : buxVar4.E(abgVar)) ? 2 : 4) | iIntValue;
                    } else {
                        i12 = iIntValue;
                    }
                    if ((iIntValue & 48) == 0) {
                        i12 |= true != buxVar4.D(zBooleanValue) ? 16 : 32;
                    }
                    if (buxVar4.I((i12 & 147) != 146, i12 & 1)) {
                        final boolean z14 = z13;
                        final boolean z15 = z7;
                        final boolean z16 = z6;
                        final boolean z17 = z5;
                        final afdr afdrVar3 = afdrVar;
                        final bwq bwqVar3 = bwqVar2;
                        final Map map2 = map;
                        final afec afecVar4 = afecVar3;
                        final boolean z18 = z12;
                        int i13 = i12;
                        final boolean z19 = z3;
                        final njp njpVar2 = njpVar;
                        final njw njwVar2 = njwVar;
                        boolean zE = buxVar4.E(njwVar2) | buxVar4.E(njpVar2) | buxVar4.D(z19) | buxVar4.D(z18) | buxVar4.C(afecVar4) | buxVar4.E(map2) | buxVar4.C(bwqVar3) | buxVar4.C(afdrVar3) | buxVar4.D(z17) | buxVar4.D(z16) | buxVar4.D(z15) | buxVar4.D(z14);
                        boolean z20 = (i13 & 14) == 4 || ((i13 & 8) != 0 && buxVar4.E(abgVar));
                        final cil cilVar6 = cilVar3;
                        boolean z21 = z20;
                        final cil cilVar7 = cilVar2;
                        final cil cilVar8 = cilVar5;
                        final nnl nnlVar2 = nnlVar;
                        boolean zE2 = zE | z21 | buxVar4.E(nnlVar2) | buxVar4.C(cilVar8) | buxVar4.C(cilVar7) | buxVar4.C(cilVar6);
                        boolean z22 = (i13 & 112) == 32;
                        Object objG = buxVar4.g();
                        if ((zE2 || z22) || objG == buw.a) {
                            obj5 = new afeg() { // from class: nhd
                                @Override // defpackage.afeg
                                public final Object invoke(Object obj6, Object obj7) {
                                    cvd cvdVar = (cvd) obj6;
                                    final dle dleVar = (dle) obj7;
                                    yph yphVar2 = nhm.a;
                                    cvdVar.getClass();
                                    nka nkaVar = nka.a;
                                    njw njwVar3 = njwVar2;
                                    njp njpVar3 = njpVar2;
                                    boolean z23 = z19;
                                    boolean z24 = z18;
                                    afec afecVar5 = afecVar4;
                                    final Map map3 = map2;
                                    final bwq bwqVar4 = bwqVar3;
                                    cto ctoVar = (cto) woy.bF(cvdVar.r(nkaVar, new cct(-433002860, true, new nhb(njwVar3, njpVar3, z23, z24, afecVar5, map3, bwqVar4, afdrVar3, z17, z16, z15, 1))));
                                    long j3 = dleVar.a;
                                    final cuo cuoVarV = ctoVar.v(j3);
                                    final int i14 = cuoVarV.a;
                                    int i15 = cuoVarV.b;
                                    final abg abgVar2 = abgVar;
                                    final nnl nnlVar3 = nnlVar2;
                                    final cil cilVar9 = cilVar8;
                                    final cil cilVar10 = cilVar7;
                                    nka nkaVar2 = nka.b;
                                    final boolean z25 = z14;
                                    final cil cilVar11 = cilVar6;
                                    final cuo cuoVarV2 = ((cto) woy.bF(cvdVar.r(nkaVar2, new cct(-30945492, true, new afeg() { // from class: ngq
                                        @Override // defpackage.afeg
                                        public final Object invoke(Object obj8, Object obj9) {
                                            bux buxVar5 = (bux) obj8;
                                            int iIntValue2 = ((Integer) obj9).intValue();
                                            int i16 = iIntValue2 & 3;
                                            int i17 = iIntValue2 & 1;
                                            yph yphVar3 = nhm.a;
                                            if (buxVar5.I(i16 != 2, i17)) {
                                                cfn cfnVar = cfl.e;
                                                cfv cfvVar = cfy.e;
                                                ctp ctpVarB = atk.b(cfnVar, false);
                                                long jB = buxVar5.b();
                                                long j4 = jB ^ (jB >>> 32);
                                                ccx ccxVarN = buxVar5.N();
                                                cfy cfyVarJ2 = bzi.j(buxVar5, cfvVar);
                                                afdr afdrVar4 = cwb.a;
                                                buxVar5.M();
                                                buxVar5.w();
                                                if (buxVar5.G()) {
                                                    buxVar5.j(afdrVar4);
                                                } else {
                                                    buxVar5.y();
                                                }
                                                boolean z26 = z25;
                                                byq.c(buxVar5, ctpVarB, cwb.e);
                                                byq.c(buxVar5, ccxVarN, cwb.d);
                                                byq.c(buxVar5, Integer.valueOf((int) j4), cwb.f);
                                                buxVar5.i(afak.a, new alx(cwb.g, 16));
                                                byq.c(buxVar5, cfyVarJ2, cwb.c);
                                                cfy cfyVarV = z26 ? awd.v(cfvVar, false, 3) : awd.a;
                                                bwq bwqVar5 = bwqVar4;
                                                Map map4 = map3;
                                                cfy cfyVarA = cfyVarV.a(new dca("railWidget"));
                                                Object obj10 = map4.get(nii.d);
                                                obj10.getClass();
                                                cfy cfyVarA2 = cfyVarA.a(new cim((cil) obj10));
                                                boolean zC = buxVar5.C(bwqVar5);
                                                Object objG2 = buxVar5.g();
                                                if (zC || objG2 == buw.a) {
                                                    objG2 = new ltd(bwqVar5, 17);
                                                    buxVar5.x(objG2);
                                                }
                                                cil cilVar12 = cilVar11;
                                                cil cilVar13 = cilVar10;
                                                cil cilVar14 = cilVar9;
                                                Object obj11 = objG2;
                                                nnl nnlVar4 = nnlVar3;
                                                abg abgVar3 = abgVar2;
                                                cfy cfyVarA3 = cfyVarA2.a(new chp((afec) obj11));
                                                nnl nnlVar5 = nnl.a;
                                                nni.f(abgVar3, nnlVar4, cfyVarA3, cilVar14, null, z26, cilVar13, cilVar12, false, buxVar5, 64);
                                                buxVar5.n();
                                            } else {
                                                buxVar5.s();
                                            }
                                            return afak.a;
                                        }
                                    })))).v(dle.l(i14, z25 ? i14 : dle.b(j3), i15, i15));
                                    int iB = z25 ? i14 : dle.b(j3);
                                    final boolean z26 = zBooleanValue;
                                    return cvdVar.eK(iB, i15, afbf.a, new afec() { // from class: ngr
                                        @Override // defpackage.afec
                                        public final Object invoke(Object obj8) {
                                            int iB2;
                                            cun cunVar = (cun) obj8;
                                            yph yphVar3 = nhm.a;
                                            cunVar.getClass();
                                            boolean z27 = z26;
                                            if (z25 || z27) {
                                                iB2 = 0;
                                            } else {
                                                iB2 = (dle.b(dleVar.a) >> 1) - (i14 / 2);
                                            }
                                            cuo cuoVar = cuoVarV;
                                            cuo cuoVar2 = cuoVarV2;
                                            if (true == z27) {
                                                cuoVar = cuoVar2;
                                            }
                                            cunVar.x(cuoVar, iB2, 0);
                                            return afak.a;
                                        }
                                    });
                                }
                            };
                            buxVar3 = buxVar4;
                            buxVar3.x(obj5);
                        } else {
                            obj5 = objG;
                            buxVar3 = buxVar4;
                        }
                        cuy.a(null, (afeg) obj5, buxVar3, 0, 1);
                    } else {
                        buxVar4.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVar2, 1597440, 46);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nhg
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cfy cfyVar2 = cfyVar;
                    boolean z14 = z;
                    boolean z15 = z2;
                    njw njwVar2 = njwVar;
                    njp njpVar2 = njpVar;
                    boolean z16 = z3;
                    boolean z17 = z4;
                    afec afecVar4 = afecVar;
                    nnl nnlVar2 = nnlVar;
                    cil cilVar6 = cilVar;
                    cil cilVar7 = cilVar2;
                    cil cilVar8 = cilVar3;
                    Map map2 = map;
                    bwq bwqVar3 = bwqVar;
                    int i12 = i;
                    afdr afdrVar3 = afdrVar;
                    int i13 = i2;
                    int i14 = i12 | 1;
                    int i15 = i13 & 306783378;
                    int i16 = i15 + i15;
                    int i17 = i14 & 306783378;
                    boolean z18 = z6;
                    int i18 = i13 & 613566756;
                    int i19 = i14 & 613566756;
                    boolean z19 = z7;
                    nhm.e(cfyVar2, z14, z15, njwVar2, njpVar2, z16, z17, afecVar4, nnlVar2, cilVar6, cilVar7, cilVar8, map2, bwqVar3, afdrVar3, z5, z18, z19, (bux) obj, (i14 & (-920350135)) | i17 | (i19 >> 1) | ((i17 + i17) & i19), (i13 & (-920350135)) | i15 | (i18 >> 1) | (i16 & i18));
                    return afak.a;
                }
            };
        }
    }

    public static final void f(List list, cfm cfmVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(28755062);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            cfy cfyVarR = awd.r(awd.b(cfyVar, 1.0f));
            ksy ksyVar = nly.a;
            ctp ctpVarA = avv.a(asv.a(15.0f, cfmVar), cfl.n, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarR);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            buxVarC.v(-491785000);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kjl kjlVar = (kjl) it.next();
                if (kjlVar instanceof kjk) {
                    buxVarC.v(1934686489);
                    kjk kjkVar = (kjk) kjlVar;
                    int i4 = kjkVar.a.a.a;
                    if (a.Y(i4, 320865540)) {
                        buxVarC.v(-491778072);
                        kjlVar.getClass();
                        lvl.Y(kjkVar, null, buxVarC, 0);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 356517120)) {
                        buxVarC.v(-491774043);
                        kjlVar.getClass();
                        lvl.T(kjkVar, false, buxVarC, 0, 2);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 354419976)) {
                        buxVarC.v(-491770105);
                        kjlVar.getClass();
                        lvl.P(kjkVar, null, buxVarC, 0);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 356517131)) {
                        buxVarC.v(-491765876);
                        kjlVar.getClass();
                        lvl.I(kjkVar, null, false, buxVarC, 0, 6);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 289408269)) {
                        buxVarC.v(-491761387);
                        kjlVar.getClass();
                        lws.F(kjkVar, null, false, buxVarC, 0, 6);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 358614275) || a.Y(i4, 627081341)) {
                        buxVarC.v(-491754422);
                        kjlVar.getClass();
                        lws.z(kjkVar, null, false, buxVarC, 0, 6);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 356517121)) {
                        buxVarC.v(-491750199);
                        kjlVar.getClass();
                        nkl.d(kjkVar, buxVarC, 0);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 624984185)) {
                        buxVarC.v(-491745808);
                        kjlVar.getClass();
                        nkx.d(kjkVar, false, buxVarC, 0, 2);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 354419973)) {
                        buxVarC.v(-491741659);
                        kjlVar.getClass();
                        lvl.aa(kjkVar, null, buxVarC, 0);
                        bvvVar.Y(false);
                    } else if (a.Y(i4, 354419977)) {
                        buxVarC.v(-491737787);
                        kjlVar.getClass();
                        lws.E(kjkVar, null, buxVarC, 0);
                        bvvVar.Y(false);
                    } else {
                        buxVarC.v(-491735521);
                        c(buxVarC, 0);
                        bvvVar.Y(false);
                    }
                    bvvVar.Y(false);
                } else if (kjlVar instanceof kji) {
                    buxVarC.v(1936147302);
                    lvl.Z((kji) kjlVar, 1, buxVarC, 48);
                    bvvVar.Y(false);
                } else {
                    buxVarC.v(-491730113);
                    c(buxVarC, 0);
                    bvvVar.Y(false);
                }
            }
            bvvVar.Y(false);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg(list, cfmVar, cfyVar, i, 8, (char[]) null);
        }
    }

    public static final void g(final cfy cfyVar, final asw aswVar, final njw njwVar, final boolean z, final boolean z2, final boolean z3, final boolean z4, final cil cilVar, final cil cilVar2, final afec afecVar, final asf asfVar, final afec afecVar2, final Map map, final bwq bwqVar, final boolean z5, bux buxVar, final int i, final int i2) {
        int i3;
        boolean z6;
        boolean z7;
        cil cilVar3;
        int i4;
        final cil cilVar4;
        afec afecVar3;
        int i5;
        boolean z8;
        bwq bwqVar2;
        bux buxVar2;
        int i6 = i & 6;
        bux buxVarC = buxVar.c(879638391);
        if (i6 == 0) {
            i3 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(aswVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(njwVar) : buxVarC.E(njwVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.D(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.D(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            z6 = z3;
            i3 |= true != buxVarC.D(z6) ? 65536 : 131072;
        } else {
            z6 = z3;
        }
        if ((1572864 & i) == 0) {
            z7 = z4;
            i3 |= true != buxVarC.D(z7) ? 524288 : 1048576;
        } else {
            z7 = z4;
        }
        if ((12582912 & i) == 0) {
            cilVar3 = cilVar;
            i4 = 32;
            i3 |= true != buxVarC.C(cilVar3) ? 4194304 : 8388608;
        } else {
            cilVar3 = cilVar;
            i4 = 32;
        }
        if ((100663296 & i) == 0) {
            cilVar4 = cilVar2;
            i3 |= true != buxVarC.C(cilVar4) ? 33554432 : 67108864;
        } else {
            cilVar4 = cilVar2;
        }
        if ((805306368 & i) == 0) {
            afecVar3 = afecVar;
            i3 |= true != buxVarC.E(afecVar3) ? 268435456 : 536870912;
        } else {
            afecVar3 = afecVar;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (true != buxVarC.C(asfVar) ? 2 : 4);
        } else {
            i5 = i2;
        }
        int i7 = i5;
        if ((i2 & 48) == 0) {
            i5 = i7 | (true != buxVarC.E(afecVar2) ? 16 : i4);
        }
        if ((i2 & 384) == 0) {
            z8 = true;
            i5 |= true == ((i2 & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(map) : buxVarC.E(map)) ? 256 : 128;
        } else {
            z8 = true;
        }
        if ((i2 & 3072) == 0) {
            bwqVar2 = bwqVar;
            i5 |= z8 == buxVarC.C(bwqVar2) ? 2048 : 1024;
        } else {
            bwqVar2 = bwqVar;
        }
        if ((i2 & 24576) == 0) {
            i5 |= true == buxVarC.D(z5) ? 16384 : 8192;
        }
        boolean z9 = false;
        if (buxVarC.I(((i3 & 306783379) == 306783378 && (i5 & 9363) == 9362) ? false : true, i3 & 1)) {
            bym bymVarF = bxc.f(njwVar.j(), false, buxVarC);
            int iIntValue = ((Number) bxc.f(njwVar.e(), 0, buxVarC).a()).intValue();
            if (((Boolean) bymVarF.a()).booleanValue() || (iIntValue != 3 && z2)) {
                z9 = true;
            }
            ctp ctpVarA = avv.a(aswVar, cfl.m, buxVarC, ((i3 & 126) >> 3) & 14);
            bvv bvvVar = (bvv) buxVarC;
            long j = bvvVar.u;
            long j2 = j ^ (j >>> i4);
            ccx ccxVarAh = bvvVar.ah();
            final boolean z10 = z9;
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf((int) j2), cwb.f);
            buxVarC.i(afak.a, new alx(cwb.g, 16));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            buxVar2 = buxVarC;
            final bwq bwqVar3 = bwqVar2;
            final boolean z11 = z6;
            final afec afecVar4 = afecVar3;
            final boolean z12 = z7;
            final cil cilVar5 = cilVar3;
            cct cctVarI = bxc.i(1924129094, true, new afeg() { // from class: ngw
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    cfy cfyVarA;
                    bux buxVar3 = (bux) obj;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    int i8 = iIntValue2 & 3;
                    int i9 = iIntValue2 & 1;
                    yph yphVar = nhm.a;
                    if (buxVar3.I(i8 != 2, i9)) {
                        Map map2 = map;
                        boolean z13 = z10;
                        boolean z14 = z;
                        cfy cfyVarL = kfn.l(new dca("home"), z14);
                        if (z13 || !z11) {
                            Object obj3 = map2.get(nii.b);
                            obj3.getClass();
                            cfyVarA = cfyVarL.a(new cim((cil) obj3));
                        } else {
                            cil cilVar6 = cilVar4;
                            cil cilVar7 = cilVar5;
                            Object obj4 = map2.get(nii.b);
                            obj4.getClass();
                            cfyVarA = nhm.a(new cim((cil) obj4), cilVar7, cilVar6, z14);
                        }
                        bwq bwqVar4 = bwqVar3;
                        boolean zC = buxVar3.C(bwqVar4);
                        Object objG = buxVar3.g();
                        if (zC || objG == buw.a) {
                            objG = new ltd(bwqVar4, 14);
                            buxVar3.x(objG);
                        }
                        boolean z15 = z5;
                        boolean z16 = z12;
                        Object obj5 = objG;
                        njw njwVar2 = njwVar;
                        cfy cfyVarB = ebf.B(cfyVarA.a(new chp((afec) obj5)), (nok) afecVar4.invoke(nlz.a), asfVar);
                        yph yphVar2 = njw.a;
                        kfn.p(cfyVarB, njwVar2, z16, false, z15, buxVar3, 3136);
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            }, buxVar2);
            cct cctVarI2 = bxc.i(-1811288926, true, new afeg() { // from class: ngx
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar3 = (bux) obj;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    int i8 = iIntValue2 & 3;
                    int i9 = iIntValue2 & 1;
                    yph yphVar = nhm.a;
                    if (buxVar3.I(i8 != 2, i9)) {
                        afec afecVar5 = afecVar2;
                        boolean zC = buxVar3.C(afecVar5);
                        Object objG = buxVar3.g();
                        if (zC || objG == buw.a) {
                            objG = new ltd(afecVar5, 18);
                            buxVar3.x(objG);
                        }
                        boolean z13 = z3;
                        afak afakVar = afak.a;
                        bas basVar = new bas((afec) objG, 8);
                        cql cqlVar = crh.a;
                        cfy crgVar = new crg(afakVar, null, basVar);
                        if (z13 && z10) {
                            crgVar = nhm.a(crgVar, cilVar, cilVar2, z);
                        }
                        bwq bwqVar4 = bwqVar;
                        Object obj3 = map.get(nii.c);
                        obj3.getClass();
                        cfy cfyVarA = crgVar.a(new cim((cil) obj3));
                        boolean zC2 = buxVar3.C(bwqVar4);
                        Object objG2 = buxVar3.g();
                        if (zC2 || objG2 == buw.a) {
                            objG2 = new ltd(bwqVar4, 19);
                            buxVar3.x(objG2);
                        }
                        boolean z14 = z4;
                        njw njwVar2 = njwVar;
                        cfy cfyVarB = ebf.B(cfyVarA.a(new chp((afec) objG2)), (nok) afecVar.invoke(nlz.c), asfVar);
                        yph yphVar2 = njw.a;
                        nhm.d(cfyVarB, njwVar2, z14, buxVar3, 64);
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            }, buxVar2);
            if (z) {
                buxVar2.v(-379590641);
                cctVarI2.invoke(buxVar2, 6);
                cctVarI.invoke(buxVar2, 6);
                bvvVar.Y(false);
            } else {
                buxVar2.v(-379529137);
                cctVarI.invoke(buxVar2, 6);
                cctVarI2.invoke(buxVar2, 6);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: ngy
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cfy cfyVar2 = cfyVar;
                    asw aswVar2 = aswVar;
                    njw njwVar2 = njwVar;
                    boolean z13 = z;
                    boolean z14 = z2;
                    boolean z15 = z3;
                    boolean z16 = z4;
                    cil cilVar6 = cilVar;
                    cil cilVar7 = cilVar2;
                    afec afecVar5 = afecVar;
                    asf asfVar2 = asfVar;
                    int i8 = i;
                    afec afecVar6 = afecVar2;
                    int i9 = i2;
                    int i10 = i8 | 1;
                    int i11 = i9 & 306783378;
                    int i12 = i10 & 306783378;
                    bwq bwqVar4 = bwqVar;
                    int i13 = i9 & 613566756;
                    int i14 = i10 & 613566756;
                    boolean z17 = z5;
                    nhm.g(cfyVar2, aswVar2, njwVar2, z13, z14, z15, z16, cilVar6, cilVar7, afecVar5, asfVar2, afecVar6, map, bwqVar4, z17, (bux) obj, (i10 & (-920350135)) | i12 | (i14 >> 1) | ((i12 + i12) & i14), (i9 & (-920350135)) | i11 | (i13 >> 1) | ((i11 + i11) & i13));
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2, types: [int] */
    /* JADX WARN: Type inference failed for: r24v3 */
    public static final void h(final cfy cfyVar, final njw njwVar, final oal oalVar, final boolean z, final boolean z2, bux buxVar, final int i) {
        int i2;
        boolean z3;
        bux buxVar2;
        boolean z4;
        byte[] bArr;
        boolean z5;
        bvv bvvVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(44933458);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(njwVar) : buxVarC.E(njwVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(oalVar) : buxVarC.E(oalVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.D(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            z3 = z2;
            i2 |= true != buxVarC.D(z3) ? 8192 : 16384;
        } else {
            z3 = z2;
        }
        if (buxVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            ComponentName componentName = nxo.a;
            eqj eqjVar = ((nxo) mki.a.i(nxo.class)).d;
            bym bymVarF = bxc.f(eqjVar, eqjVar.e(), buxVarC);
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            Object obj = buw.a;
            if (objS == obj) {
                ngz ngzVar = new ngz(bymVarF, i4);
                lah lahVar = byj.a;
                bvk bvkVar = new bvk(ngzVar, null);
                bvvVar2.ad(bvkVar);
                objS = bvkVar;
            }
            bym bymVar = (bym) objS;
            Object objS2 = bvvVar2.S();
            int i5 = 3;
            if (objS2 == obj) {
                ngz ngzVar2 = new ngz(bymVarF, i5);
                lah lahVar2 = byj.a;
                z4 = 0;
                bvk bvkVar2 = new bvk(ngzVar2, null);
                bvvVar2.ad(bvkVar2);
                objS2 = bvkVar2;
            } else {
                z4 = 0;
            }
            bym bymVar2 = (bym) objS2;
            bym bymVarF2 = bxc.f(njwVar.e(), Integer.valueOf((int) z4), buxVarC);
            Context context = (Context) buxVarC.f(daa.b);
            Object objS3 = bvvVar2.S();
            if (objS3 == obj) {
                bArr = null;
                objS3 = new nmm(new bws(njwVar, bymVarF2, 18, bArr), new bws(njwVar, context, 19, bArr), null, null);
                bvvVar2.ad(objS3);
            } else {
                bArr = null;
            }
            git gitVarA = ((nmm) objS3).a(bArr, bArr, buxVarC, 3);
            if (njwVar.p) {
                int i6 = i2 & 7168;
                int i7 = (i2 >> 6) & 896;
                int i8 = i2 << 3;
                buxVarC.v(-1416168015);
                nxs nxsVar = (nxs) bymVarF.a();
                int i9 = i8 & 112;
                if (nxsVar == null || !nxsVar.c) {
                    z5 = z4;
                    buxVarC.v(-1415758753);
                    buxVar2 = buxVarC;
                    int i10 = i9 | i7 | i6;
                    bvvVar = bvvVar2;
                    oag.a.k(((Boolean) bymVar2.a()).booleanValue(), cfyVar, z2, z, null, kgq.p(z, buxVar2, z5 ? 1 : 0), gitVarA.e, ((Number) bymVar.a()).intValue(), false, 0, buxVar2, i10, 6, 784);
                    bvvVar.Y(z5);
                } else {
                    buxVarC.v(-1416073062);
                    z5 = z4;
                    int i11 = i9 | 12582912 | i7 | i6;
                    bvvVar = bvvVar2;
                    oag.a.b(((Boolean) bymVar2.a()).booleanValue(), cfyVar, z3, z, null, kgq.p(z, buxVarC, z5 ? 1 : 0), gitVarA.e, buxVarC, i11, 16);
                    bvvVar.Y(z5);
                    buxVar2 = buxVarC;
                }
                bvvVar.Y(z5);
            } else {
                buxVar2 = buxVarC;
                buxVar2.v(-1415416265);
                asf asfVar = gitVarA.e;
                boolean zBooleanValue = ((Boolean) bymVar2.a()).booleanValue();
                ygr ygrVar = oal.a;
                int i12 = (i2 & 14) | sk.AUDIO_CONTENT_BUFFER_SIZE;
                int i13 = i2 & 896;
                int i14 = i2 << 6;
                nyx.e(cfyVar, asfVar, oalVar, zBooleanValue, false, z, z2, buxVarC, i12 | i13 | (458752 & i14) | (i14 & 3670016));
                bvvVar2.Y(z4);
            }
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nhh
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    bux buxVar3 = (bux) obj2;
                    ((Integer) obj3).intValue();
                    cfy cfyVar2 = cfyVar;
                    int i15 = i | 1;
                    int i16 = 306783378 & i15;
                    int i17 = 613566756 & i15;
                    nhm.h(cfyVar2, njwVar, oalVar, z, z2, buxVar3, (i15 & (-920350135)) | i16 | (i17 >> 1) | ((i16 + i16) & i17));
                    return afak.a;
                }
            };
        }
    }

    public static final void i(final cfy cfyVar, final boolean z, final boolean z2, final boolean z3, final boolean z4, final cil cilVar, final cil cilVar2, final afec afecVar, final asf asfVar, final njw njwVar, final Map map, final bwq bwqVar, final oal oalVar, final boolean z5, bux buxVar, final int i, final int i2) {
        int i3;
        int i4;
        boolean z6;
        boolean z7;
        int i5;
        boolean z8;
        int i6 = i & 6;
        bux buxVarC = buxVar.c(-1162059523);
        if (i6 == 0) {
            i3 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i4 = 32;
            i3 |= true != buxVarC.D(z) ? 16 : 32;
        } else {
            i4 = 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.D(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            z6 = true;
            i3 |= true != buxVarC.D(z3) ? 1024 : 2048;
        } else {
            z6 = true;
        }
        if ((i & 24576) == 0) {
            i3 |= z6 != buxVarC.D(z4) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != buxVarC.C(cilVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != buxVarC.C(cilVar2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != buxVarC.E(afecVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != buxVarC.C(asfVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != ((1073741824 & i) == 0 ? buxVarC.C(njwVar) : buxVarC.E(njwVar)) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            z7 = true;
            i5 = i2 | (true != ((i2 & 8) == 0 ? buxVarC.C(map) : buxVarC.E(map)) ? 2 : 4);
        } else {
            z7 = true;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= z7 != buxVarC.C(bwqVar) ? 16 : i4;
        }
        if ((i2 & 384) == 0) {
            z8 = true;
            i5 |= true != ((i2 & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(oalVar) : buxVarC.E(oalVar)) ? 128 : 256;
        } else {
            z8 = true;
        }
        if ((i2 & 3072) == 0) {
            i5 |= z8 != buxVarC.D(z5) ? 1024 : 2048;
        }
        if (buxVarC.I(((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true, i3 & 1)) {
            asw aswVar = (z || z2) ? atd.a : atd.b;
            ctp ctpVarA = avv.a(aswVar, cfl.m, buxVarC, 0);
            bvv bvvVar = (bvv) buxVarC;
            long j = bvvVar.u;
            long j2 = j ^ (j >>> i4);
            ccx ccxVarAh = bvvVar.ah();
            int i7 = i3;
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf((int) j2), cwb.f);
            buxVarC.i(afak.a, new alx(cwb.g, 16));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            cfy dcaVar = new dca("notificationCenter");
            if (z3) {
                dcaVar = a(dcaVar, cilVar, cilVar2, !z2);
            }
            Object obj = map.get(nii.i);
            obj.getClass();
            cfy cfyVarA = dcaVar.a(new cim((cil) obj));
            int i8 = i5 & 112;
            Object objS = bvvVar.S();
            if (i8 == i4 || objS == buw.a) {
                objS = new ltd(bwqVar, 16);
                bvvVar.ad(objS);
            }
            cfy cfyVarB = ebf.B(cfyVarA.a(new chp((afec) objS)), (nok) afecVar.invoke(nlz.b), asfVar);
            yph yphVar = njw.a;
            ygr ygrVar = oal.a;
            h(cfyVarB, njwVar, oalVar, z4, z5, buxVarC, ((i7 >> 24) & 112) | 576 | (i5 & 896) | ((i7 >> 3) & 7168) | (57344 & (i5 << 3)));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nhe
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    cfy cfyVar2 = cfyVar;
                    boolean z9 = z;
                    boolean z10 = z2;
                    boolean z11 = z3;
                    boolean z12 = z4;
                    cil cilVar3 = cilVar;
                    cil cilVar4 = cilVar2;
                    afec afecVar2 = afecVar;
                    asf asfVar2 = asfVar;
                    njw njwVar2 = njwVar;
                    int i9 = i;
                    Map map2 = map;
                    int i10 = i2;
                    int i11 = i9 | 1;
                    int i12 = i10 & 306783378;
                    int i13 = i11 & 306783378;
                    oal oalVar2 = oalVar;
                    int i14 = i10 & 613566756;
                    int i15 = i11 & 613566756;
                    boolean z13 = z5;
                    nhm.i(cfyVar2, z9, z10, z11, z12, cilVar3, cilVar4, afecVar2, asfVar2, njwVar2, map2, bwqVar, oalVar2, z13, (bux) obj2, (i11 & (-920350135)) | i13 | (i15 >> 1) | ((i13 + i13) & i15), (i10 & (-920350135)) | i12 | (i14 >> 1) | ((i12 + i12) & i14));
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r16v3 */
    public static final void j(final njp njpVar, final qrn qrnVar, njw njwVar, njs njsVar, nnu nnuVar, oal oalVar, final afec afecVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        njw njwVar2;
        njs njsVar2;
        nnu nnuVar2;
        oal oalVar2;
        int i3;
        njw njwVar3;
        boolean z;
        njs njsVar3;
        final nnu nnuVar3;
        final oal oalVar3;
        bym bymVar;
        bwq bwqVar;
        njw njwVar4;
        njpVar.getClass();
        qrnVar.getClass();
        afecVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-710141606);
        if (i4 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(njpVar) : buxVarC.E(njpVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(qrnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i2) != 599186, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                njx njxVar = new njx(qrnVar, 0);
                bvf bvfVar = esh.a;
                eru eruVar = (eru) buxVarC.f(bvfVar);
                if (eruVar == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                esc escVarG = ecw.g(eruVar);
                affx affxVar = affw.a;
                i3 = 0;
                njwVar3 = (njw) epq.e(affxVar.getOrCreateKotlinClass(njw.class), eruVar, null, njxVar, escVarG);
                njx njxVar2 = new njx(qrnVar, 1);
                eru eruVar2 = (eru) buxVarC.f(bvfVar);
                if (eruVar2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                z = true;
                njsVar3 = (njs) epq.e(affxVar.getOrCreateKotlinClass(njs.class), eruVar2, null, njxVar2, ecw.g(eruVar2));
                njx njxVar3 = new njx(njwVar3.k, 2);
                eru eruVar3 = (eru) buxVarC.f(bvfVar);
                if (eruVar3 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                nnu nnuVar4 = (nnu) epq.e(affxVar.getOrCreateKotlinClass(nnu.class), eruVar3, null, njxVar3, ecw.g(eruVar3));
                oam oamVar = new oam(qrnVar);
                eru eruVar4 = (eru) buxVarC.f(bvfVar);
                if (eruVar4 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                nnuVar3 = nnuVar4;
                oalVar3 = (oal) epq.e(affxVar.getOrCreateKotlinClass(oal.class), eruVar4, null, oamVar, ecw.g(eruVar4));
            } else {
                buxVarC.s();
                njwVar3 = njwVar;
                nnuVar3 = nnuVar;
                oalVar3 = oalVar;
                z = true;
                i3 = 0;
                njsVar3 = njsVar;
            }
            buxVarC.l();
            ((ype) a.f()).u("Compose Horizontal Rail showing");
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(Boolean.valueOf((boolean) i3), bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            final bwq bwqVar2 = (bwq) objS;
            final bym bymVarF = bxc.f(njwVar3.c, Boolean.valueOf(z), buxVarC);
            eqj eqjVarH = njwVar3.h();
            Boolean boolValueOf = Boolean.valueOf((boolean) i3);
            bym bymVarF2 = bxc.f(eqjVarH, boolValueOf, buxVarC);
            final bym bymVarF3 = bxc.f(njwVar3.e, boolValueOf, buxVarC);
            yph yphVar = nsr.a;
            final boolean zJ = ((nsr) mki.a.i(nsr.class)).b().J();
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new asg();
                bvvVar.ad(objS2);
            }
            final asf asfVar = (asf) objS2;
            bym bymVarF4 = bxc.f(njwVar3.i(), boolValueOf, buxVarC);
            bym bymVarF5 = bxc.f(njwVar3.e(), Integer.valueOf(i3), buxVarC);
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                bymVar = bymVarF2;
                ngz ngzVar = new ngz(bymVarF5, z ? 1 : 0);
                lah lahVar = byj.a;
                bvk bvkVar = new bvk(ngzVar, null);
                bvvVar.ad(bvkVar);
                objS3 = bvkVar;
            } else {
                bymVar = bymVarF2;
            }
            final boolean z2 = njwVar3.n;
            final bym bymVar2 = (bym) objS3;
            Object[] objArr = new Object[i3];
            Object objS4 = bvvVar.S();
            final njs njsVar4 = njsVar3;
            int i5 = 13;
            if (objS4 == obj) {
                objS4 = new mkj(i5);
                bvvVar.ad(objS4);
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 0);
            cdt cdtVar = cdu.a;
            final Map map = (Map) byx.s(objArrCopyOf, cdtVar, (afdr) objS4, buxVarC, 3456);
            Object[] objArr2 = new Object[0];
            Object objS5 = bvvVar.S();
            if (objS5 == obj) {
                objS5 = new mkj(14);
                bvvVar.ad(objS5);
            }
            bwq bwqVar3 = (bwq) byx.s(Arrays.copyOf(objArr2, 0), cdtVar, (afdr) objS5, buxVarC, 3456);
            Object[] objArr3 = new Object[0];
            Object objS6 = bvvVar.S();
            if (objS6 == obj) {
                bwqVar = bwqVar3;
                objS6 = new mkj(15);
                bvvVar.ad(objS6);
            } else {
                bwqVar = bwqVar3;
            }
            final bwq bwqVar4 = (bwq) byx.s(Arrays.copyOf(objArr3, 0), cdtVar, (afdr) objS6, buxVarC, 3456);
            Object objS7 = bvvVar.S();
            if (objS7 == obj) {
                objS7 = new ParcelableSnapshotMutableIntState(4);
                bvvVar.ad(objS7);
            }
            final byd bydVar = (byd) objS7;
            final boolean zC = ((nrd) ((msd) mki.a.i(msd.class)).i().i(nrd.class)).c();
            Boolean bool = (Boolean) bymVarF4.a();
            bool.booleanValue();
            boolean zC2 = buxVarC.C(bymVarF4);
            Object objS8 = bvvVar.S();
            if (zC2 || objS8 == obj) {
                njwVar4 = njwVar3;
                objS8 = new ltd(bymVarF4, 13);
                bvvVar.ad(objS8);
            } else {
                njwVar4 = njwVar3;
            }
            eee.i(bool, null, (afec) objS8, buxVarC, 0);
            if (zC) {
                buxVarC.v(1182577512);
                Integer numValueOf = Integer.valueOf(bydVar.e());
                boolean zE = buxVarC.E(map) | buxVarC.C(bwqVar4);
                Object objS9 = bvvVar.S();
                if (zE || objS9 == obj) {
                    objS9 = new nhi(bydVar, map, bwqVar4, null);
                    bvvVar.ad(objS9);
                }
                bvq.g(numValueOf, (afeg) objS9, buxVarC);
                bvvVar.Y(false);
            } else {
                buxVarC.v(1183100296);
                bvvVar.Y(false);
            }
            final bym bymVar3 = bymVar;
            final njw njwVar5 = njwVar4;
            final bwq bwqVar5 = bwqVar;
            afeg afegVar = new afeg() { // from class: ngu
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    bux buxVar3 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    int i6 = iIntValue & 3;
                    int i7 = iIntValue & 1;
                    yph yphVar2 = nhm.a;
                    if (buxVar3.I(i6 != 2, i7)) {
                        final oal oalVar4 = oalVar3;
                        final bwq bwqVar6 = bwqVar4;
                        final njp njpVar2 = njpVar;
                        final asf asfVar2 = asfVar;
                        final afec afecVar2 = afecVar;
                        final bym bymVar4 = bymVarF;
                        final nnu nnuVar5 = nnuVar3;
                        final boolean z3 = zJ;
                        final bwq bwqVar7 = bwqVar2;
                        final bym bymVar5 = bymVar2;
                        final njw njwVar6 = njwVar5;
                        final bym bymVar6 = bymVar3;
                        final bym bymVar7 = bymVarF3;
                        final qrn qrnVar2 = qrnVar;
                        final byd bydVar2 = bydVar;
                        final Map map2 = map;
                        final bwq bwqVar8 = bwqVar5;
                        final njs njsVar5 = njsVar4;
                        final boolean z4 = zC;
                        final boolean z5 = z2;
                        ca.at(awd.c(cfy.e, 1.0f), cfl.e, bxc.i(1707082604, true, new afeh() { // from class: ngt
                            /* JADX WARN: Removed duplicated region for block: B:102:0x02f9  */
                            /* JADX WARN: Removed duplicated region for block: B:105:0x036b  */
                            /* JADX WARN: Removed duplicated region for block: B:113:0x03c3  */
                            /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
                            /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
                            /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
                            /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
                            /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
                            /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
                            /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
                            /* JADX WARN: Removed duplicated region for block: B:60:0x0134  */
                            /* JADX WARN: Removed duplicated region for block: B:63:0x0155  */
                            /* JADX WARN: Removed duplicated region for block: B:66:0x0170  */
                            /* JADX WARN: Removed duplicated region for block: B:67:0x0175  */
                            /* JADX WARN: Removed duplicated region for block: B:69:0x017b  */
                            /* JADX WARN: Removed duplicated region for block: B:70:0x01c7  */
                            /* JADX WARN: Removed duplicated region for block: B:72:0x01de  */
                            /* JADX WARN: Removed duplicated region for block: B:73:0x01e9  */
                            /* JADX WARN: Removed duplicated region for block: B:79:0x020d  */
                            /* JADX WARN: Removed duplicated region for block: B:82:0x022c  */
                            /* JADX WARN: Removed duplicated region for block: B:83:0x022f  */
                            /* JADX WARN: Removed duplicated region for block: B:86:0x025b  */
                            /* JADX WARN: Removed duplicated region for block: B:87:0x025f  */
                            /* JADX WARN: Removed duplicated region for block: B:90:0x028d  */
                            @Override // defpackage.afeh
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r33, java.lang.Object r34, java.lang.Object r35) {
                                /*
                                    Method dump skipped, instructions count: 982
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.ngt.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, buxVar3), buxVar3, 3126, 4);
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            };
            buxVar2 = buxVarC;
            ksr.a(null, null, false, null, bxc.i(-617664254, true, afegVar, buxVar2), buxVar2, 24576, 15);
            njsVar2 = njsVar4;
            nnuVar2 = nnuVar3;
            oalVar2 = oalVar3;
            njwVar2 = njwVar4;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            njwVar2 = njwVar;
            njsVar2 = njsVar;
            nnuVar2 = nnuVar;
            oalVar2 = oalVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new ccs(njpVar, qrnVar, njwVar2, njsVar2, nnuVar2, oalVar2, afecVar, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0330 A[LOOP:0: B:167:0x027d->B:196:0x0330, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0340 A[EDGE_INSN: B:206:0x0340->B:198:0x0340 BREAK  A[LOOP:0: B:167:0x027d->B:196:0x0330], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v20, types: [afgy] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(defpackage.njw r28, defpackage.njp r29, boolean r30, boolean r31, defpackage.nok r32, defpackage.cfy r33, java.util.Map r34, defpackage.bwq r35, defpackage.afdr r36, boolean r37, boolean r38, boolean r39, defpackage.bux r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhm.k(njw, njp, boolean, boolean, nok, cfy, java.util.Map, bwq, afdr, boolean, boolean, boolean, bux, int, int):void");
    }

    public static final void l(final njw njwVar, final njp njpVar, boolean z, boolean z2, final nok nokVar, cfy cfyVar, final Map map, bwq bwqVar, afdr afdrVar, boolean z3, final boolean z4, final boolean z5, bux buxVar, int i, int i2) {
        int i3;
        boolean z6;
        boolean z7;
        bwq bwqVar2;
        afdr afdrVar2;
        final boolean z8;
        int i4;
        int i5;
        int i6 = i & 6;
        bux buxVarC = buxVar.c(1076495896);
        if (i6 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(njwVar) : buxVarC.E(njwVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? buxVarC.C(njpVar) : buxVarC.E(njpVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z6 = z;
            i3 |= true != buxVarC.D(z6) ? 128 : 256;
        } else {
            z6 = z;
        }
        if ((i & 3072) == 0) {
            z7 = z2;
            i3 |= true != buxVarC.D(z7) ? 1024 : 2048;
        } else {
            z7 = z2;
        }
        if ((i & 24576) == 0) {
            i3 |= true != ((i & 32768) == 0 ? buxVarC.C(nokVar) : buxVarC.E(nokVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != ((i & 2097152) == 0 ? buxVarC.C(map) : buxVarC.E(map)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            bwqVar2 = bwqVar;
            i3 |= true != buxVarC.C(bwqVar2) ? 4194304 : 8388608;
        } else {
            bwqVar2 = bwqVar;
        }
        if ((100663296 & i) == 0) {
            afdrVar2 = afdrVar;
            i3 |= true != buxVarC.E(afdrVar2) ? 33554432 : 67108864;
        } else {
            afdrVar2 = afdrVar;
        }
        if ((805306368 & i) == 0) {
            z8 = z3;
            i3 |= true != buxVarC.D(z8) ? 268435456 : 536870912;
        } else {
            z8 = z3;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != buxVarC.D(z4) ? 2 : 4);
        } else {
            i4 = i2;
        }
        int i7 = i4;
        if ((i2 & 48) == 0) {
            i5 = i7 | (true != buxVarC.D(z5) ? 16 : 32);
        } else {
            i5 = i7;
        }
        if (buxVarC.I(((i3 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true, i3 & 1)) {
            final boolean z9 = njwVar.n;
            boolean zD = ((i3 & 7168) == 2048) | buxVarC.D(z9) | ((i3 & 14) == 4 || ((i3 & 8) != 0 && buxVarC.E(njwVar))) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && buxVarC.E(njpVar)));
            boolean z10 = (i3 & 896) == 256;
            int i8 = i3;
            boolean z11 = (57344 & i3) == 16384 || ((i8 & 32768) != 0 && buxVarC.E(nokVar));
            boolean z12 = zD | z10;
            boolean z13 = (i8 & 3670016) == 1048576 || ((i8 & 2097152) != 0 && buxVarC.E(map));
            boolean z14 = z11 | z12;
            boolean z15 = (i8 & 29360128) == 8388608;
            boolean z16 = (i8 & 234881024) == 67108864;
            boolean z17 = (i8 & 1879048192) == 536870912;
            boolean z18 = (i5 & 14) == 4;
            boolean z19 = (i5 & 112) == 32;
            bvv bvvVar = (bvv) buxVarC;
            boolean z20 = z18;
            Object objS = bvvVar.S();
            if ((z15 | z14 | z13 | z16 | z17 | z20 | z19) || objS == buw.a) {
                final boolean z21 = z6;
                final bwq bwqVar3 = bwqVar2;
                final afdr afdrVar3 = afdrVar2;
                final boolean z22 = z7;
                objS = new afeg() { // from class: ngp
                    @Override // defpackage.afeg
                    public final Object invoke(Object obj, Object obj2) {
                        cvd cvdVar = (cvd) obj;
                        yph yphVar = nhm.a;
                        cvdVar.getClass();
                        nkb nkbVar = nkb.a;
                        final boolean z23 = z9;
                        final boolean z24 = z22;
                        cto ctoVar = (cto) woy.bF(cvdVar.r(nkbVar, new cct(453697755, true, new afeg() { // from class: nha
                            @Override // defpackage.afeg
                            public final Object invoke(Object obj3, Object obj4) {
                                float f;
                                bux buxVar2 = (bux) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                int i9 = iIntValue & 3;
                                int i10 = iIntValue & 1;
                                yph yphVar2 = nhm.a;
                                if (buxVar2.I(i9 != 2, i10)) {
                                    boolean z25 = z23;
                                    cfr cfrVar = cfl.n;
                                    if (z25) {
                                        ksy ksyVar = nly.a;
                                        f = 16.0f;
                                    } else {
                                        ksc kscVar = nlw.a;
                                        f = 10.0f;
                                    }
                                    asz aszVar = new asz(f, true, new ast());
                                    cfv cfvVar = cfy.e;
                                    ctp ctpVarA = avv.a(aszVar, cfrVar, buxVar2, 48);
                                    long jB = buxVar2.b();
                                    long j = jB ^ (jB >>> 32);
                                    ccx ccxVarN = buxVar2.N();
                                    cfy cfyVarJ = bzi.j(buxVar2, cfvVar);
                                    afdr afdrVar4 = cwb.a;
                                    buxVar2.M();
                                    buxVar2.w();
                                    if (buxVar2.G()) {
                                        buxVar2.j(afdrVar4);
                                    } else {
                                        buxVar2.y();
                                    }
                                    boolean z26 = z24;
                                    byq.c(buxVar2, ctpVarA, cwb.e);
                                    byq.c(buxVar2, ccxVarN, cwb.d);
                                    byq.c(buxVar2, Integer.valueOf((int) j), cwb.f);
                                    int i11 = 16;
                                    buxVar2.i(afak.a, new alx(cwb.g, 16));
                                    byq.c(buxVar2, cfyVarJ, cwb.c);
                                    int i12 = true != z26 ? 3 : 4;
                                    buxVar2.v(-484896947);
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        nmj nmjVarL = kgq.l();
                                        Object objG = buxVar2.g();
                                        if (objG == buw.a) {
                                            objG = new mkj(i11);
                                            buxVar2.x(objG);
                                        }
                                        kgq.n(null, nmjVarL, z25, true, (afdr) objG, false, false, null, false, buxVar2, 1600576, 417);
                                    }
                                    buxVar2.o();
                                    buxVar2.n();
                                } else {
                                    buxVar2.s();
                                }
                                return afak.a;
                            }
                        })));
                        long j = ((dle) obj2).a;
                        cuo cuoVarV = ctoVar.v(j);
                        int i9 = cuoVarV.a;
                        int i10 = cuoVarV.b;
                        nok nokVar2 = nokVar;
                        Map map2 = map;
                        bwq bwqVar4 = bwqVar3;
                        afdr afdrVar4 = afdrVar3;
                        boolean z25 = z8;
                        nkb nkbVar2 = nkb.b;
                        njw njwVar2 = njwVar;
                        boolean z26 = z4;
                        return cvdVar.eK(i9, i10, afbf.a, new auv(i9, ((cto) woy.bF(cvdVar.r(nkbVar2, new cct(1768866904, true, new nhb(njwVar2, njpVar, z21, z24, nokVar2, map2, bwqVar4, afdrVar4, z25, z26, z5, 0))))).v(j), i10, 5));
                    }
                };
                bvvVar.ad(objS);
            }
            cuy.a(cfyVar, (afeg) objS, buxVarC, (i8 >> 15) & 14, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new ngs(njwVar, njpVar, z, z2, nokVar, cfyVar, map, bwqVar, afdrVar, z3, z4, z5, i, i2, 1);
        }
    }
}
