package defpackage;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Map;

/* loaded from: classes2.dex */
public final class nih {
    public static final yph a = yph.c("GH.CompVertRailFrag");

    public static final nnl a(bym bymVar) {
        return (nnl) bymVar.a();
    }

    public static final nxs b(bym bymVar) {
        return (nxs) bymVar.a();
    }

    public static final void c(cfy cfyVar, njw njwVar, afec afecVar, asf asfVar, afec afecVar2, Map map, bwq bwqVar, boolean z, boolean z2, boolean z3, bux buxVar, int i, int i2) {
        cfy cfyVar2;
        int i3;
        boolean z4;
        boolean z5;
        cfy cfyVar3;
        float f;
        njwVar.getClass();
        asfVar.getClass();
        afecVar2.getClass();
        map.getClass();
        bwqVar.getClass();
        int i4 = i2 & 1;
        bux buxVarC = buxVar.c(-2110989139);
        if (i4 != 0) {
            i3 = i | 6;
            cfyVar2 = cfyVar;
        } else if ((i & 6) == 0) {
            cfyVar2 = cfyVar;
            i3 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i;
        } else {
            cfyVar2 = cfyVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? buxVarC.C(njwVar) : buxVarC.E(njwVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.E(afecVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.C(asfVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.E(afecVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != ((262144 & i) == 0 ? buxVarC.C(map) : buxVarC.E(map)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != buxVarC.C(bwqVar) ? 524288 : 1048576;
        }
        int i5 = i2 & 128;
        boolean z6 = i5 == 0;
        if (i5 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= true != buxVarC.D(z) ? 4194304 : 8388608;
        }
        int i6 = i2 & 256;
        boolean z7 = i6 == 0;
        if (i6 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= true != buxVarC.D(z2) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != buxVarC.D(z3) ? 268435456 : 536870912;
        }
        if (buxVarC.I((306783379 & i3) != 306783378, i3 & 1)) {
            cfy cfyVar4 = i4 != 0 ? cfy.e : cfyVar2;
            boolean z8 = z6 & z;
            boolean z9 = z7 & z2;
            if (z8) {
                ksc kscVar = nlw.a;
                f = 2.0f;
            } else if (z9) {
                ksy ksyVar = nly.a;
                f = 16.0f;
            } else {
                ksc kscVar2 = nlw.a;
                f = nlw.b;
            }
            ctp ctpVarA = atp.a(atd.i(f, cfl.o), cfl.k, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar4);
            cfy cfyVar5 = cfyVar4;
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
            int i7 = i3 & 57344;
            cfv cfvVar = cfy.e;
            Object objS = bvvVar.S();
            if (i7 == 16384 || objS == buw.a) {
                objS = new nar(afecVar2, 17);
                bvvVar.ad(objS);
            }
            cfy cfyVarA = crh.a(cfvVar, afak.a, new hgj((afec) objS, 4));
            Object obj = map.get(nii.c);
            obj.getClass();
            cfy cfyVarJ2 = bxc.j(cfyVarA, (cil) obj);
            int i8 = 3670016 & i3;
            Object objS2 = bvvVar.S();
            if (i8 == 1048576 || objS2 == buw.a) {
                objS2 = new nar(bwqVar, 18);
                bvvVar.ad(objS2);
            }
            cfy cfyVarB = ebf.B(bxc.l(cfyVarJ2, (afec) objS2), (nok) afecVar.invoke(nlz.c), asfVar);
            int i9 = i3 & 112;
            int i10 = i3 >> 15;
            int i11 = i10 & 896;
            e(cfyVarB, njwVar, z8, buxVarC, i9 | 64 | i11);
            cfy cfyVarD = das.d(cfvVar, "home");
            Object obj2 = map.get(nii.b);
            obj2.getClass();
            cfy cfyVarJ3 = bxc.j(cfyVarD, (cil) obj2);
            Object objS3 = bvvVar.S();
            if (i8 == 1048576 || objS3 == buw.a) {
                objS3 = new nar(bwqVar, 19);
                bvvVar.ad(objS3);
            }
            kfn.p(ebf.B(bxc.l(cfyVarJ3, (afec) objS3), (nok) afecVar.invoke(nlz.a), asfVar), njwVar, z8, false, z3, buxVarC, (i10 & 57344) | i9 | 3136 | i11);
            bvvVar.Y(true);
            z4 = z8;
            z5 = z9;
            cfyVar3 = cfyVar5;
        } else {
            buxVarC.s();
            z4 = z;
            z5 = z2;
            cfyVar3 = cfyVar2;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gay(cfyVar3, njwVar, afecVar, asfVar, afecVar2, map, bwqVar, z4, z5, z3, i, i2, 4);
        }
    }

    public static final void d(cfy cfyVar, njw njwVar, boolean z, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1594717369);
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
            lvl.ab(njwVar, z ? asl.H(cfyVar, gjk.a.k) : cfyVar, buxVarC, ((i2 >> 3) & 14) | 8);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gvo(cfyVar, njwVar, z, i, 7);
        }
    }

    public static final void e(cfy cfyVar, njw njwVar, boolean z, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(144800233);
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
                buxVarC.v(1596816898);
                d(cfyVar, njwVar, z, buxVarC, i5 | i4);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(1596877379);
                kfn.o(cfyVar, njwVar, z, buxVarC, i5 | i4);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gvo(cfyVar, njwVar, z, i, 8);
        }
    }

    public static final void f(final cfy cfyVar, final njp njpVar, final boolean z, final int i, final njw njwVar, final afec afecVar, final asf asfVar, final afec afecVar2, final Map map, final bwq bwqVar, final afdr afdrVar, final boolean z2, final boolean z3, final nnl nnlVar, final boolean z4, final boolean z5, final int i2, final boolean z6, bux buxVar, final int i3, final int i4) {
        int i5;
        boolean z7;
        int i6;
        int i7;
        afec afecVar3;
        int i8;
        int i9;
        bwq bwqVar2;
        int i10;
        bux buxVar2;
        float f;
        cfyVar.getClass();
        njwVar.getClass();
        asfVar.getClass();
        afecVar2.getClass();
        map.getClass();
        bwqVar.getClass();
        afdrVar.getClass();
        nnlVar.getClass();
        bux buxVarC = buxVar.c(1870905414);
        if ((i3 & 6) == 0) {
            i5 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != ((i3 & 64) == 0 ? buxVarC.C(njpVar) : buxVarC.E(njpVar)) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            z7 = z;
            i5 |= true != buxVarC.D(z7) ? 128 : 256;
        } else {
            z7 = z;
        }
        if ((i3 & 3072) == 0) {
            i6 = i;
            i5 |= true != buxVarC.A(i6) ? 1024 : 2048;
        } else {
            i6 = i;
        }
        if ((i3 & 24576) == 0) {
            i5 |= true != ((i3 & 32768) == 0 ? buxVarC.C(njwVar) : buxVarC.E(njwVar)) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i5 |= true != buxVarC.D(false) ? 65536 : 131072;
        }
        if ((i3 & 1572864) == 0) {
            i7 = 1572864;
            afecVar3 = afecVar;
            i5 |= true != buxVarC.E(afecVar3) ? 524288 : 1048576;
        } else {
            i7 = 1572864;
            afecVar3 = afecVar;
        }
        if ((i3 & 12582912) == 0) {
            i8 = 12582912;
            i5 |= true != buxVarC.C(asfVar) ? 4194304 : 8388608;
        } else {
            i8 = 12582912;
        }
        if ((i3 & 100663296) == 0) {
            i9 = 100663296;
            i5 |= true != buxVarC.E(afecVar2) ? 33554432 : 67108864;
        } else {
            i9 = 100663296;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= true != ((i3 & 1073741824) == 0 ? buxVarC.C(map) : buxVarC.E(map)) ? 268435456 : 536870912;
        }
        int i11 = i5;
        if ((i4 & 6) == 0) {
            bwqVar2 = bwqVar;
            i10 = i4 | (true != buxVarC.C(bwqVar2) ? 2 : 4);
        } else {
            bwqVar2 = bwqVar;
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= true != buxVarC.E(afdrVar) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i10 |= true == buxVarC.D(z2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i10 |= true == buxVarC.D(z3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i10 |= true != ((i4 & 32768) == 0 ? buxVarC.C(nnlVar) : buxVarC.E(nnlVar)) ? 8192 : 16384;
        }
        if ((i4 & i7) == 0) {
            i10 |= true == buxVarC.D(z5) ? 1048576 : 524288;
        }
        if ((i4 & i8) == 0) {
            i10 |= true != buxVarC.A(i2) ? 4194304 : 8388608;
        }
        if ((i4 & i9) == 0) {
            i10 |= true != buxVarC.D(z6) ? 33554432 : 67108864;
        }
        int i12 = i10;
        if (buxVarC.I(((i11 & 306783379) == 306783378 && (38282387 & i12) == 38282386) ? false : true, i11 & 1)) {
            if (z2) {
                ksc kscVar = nlw.a;
                f = 2.0f;
            } else {
                ksc kscVar2 = nlw.a;
                f = nlw.b;
            }
            ctp ctpVarA = atp.a(atd.i(f, cfl.o), cfl.k, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
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
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            final bwq bwqVar3 = bwqVar2;
            final int i13 = i6;
            final boolean z8 = z7;
            final afec afecVar4 = afecVar3;
            ca.V(Boolean.valueOf(z5), null, null, null, "RailWidget vs Hotseat", null, bxc.i(-958267603, true, new afei() { // from class: nhv
                @Override // defpackage.afei
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i14;
                    abg abgVar = (abg) obj;
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    bux buxVar3 = (bux) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    yph yphVar = nih.a;
                    abgVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        i14 = (true != ((iIntValue & 8) == 0 ? buxVar3.C(abgVar) : buxVar3.E(abgVar)) ? 2 : 4) | iIntValue;
                    } else {
                        i14 = iIntValue;
                    }
                    if ((iIntValue & 48) == 0) {
                        i14 |= true != buxVar3.D(zBooleanValue) ? 16 : 32;
                    }
                    if (buxVar3.I((i14 & 147) != 146, i14 & 1)) {
                        bwq bwqVar4 = bwqVar3;
                        Map map2 = map;
                        if (zBooleanValue) {
                            buxVar3.v(897531925);
                            Object obj5 = map2.get(nii.d);
                            obj5.getClass();
                            cil cilVar = (cil) obj5;
                            cfy cfyVarJ2 = bxc.j(das.d(awd.r(cfy.e), "railWidget"), cilVar);
                            boolean zC = buxVar3.C(bwqVar4);
                            Object objG = buxVar3.g();
                            if (zC || objG == buw.a) {
                                objG = new nar(bwqVar4, 15);
                                buxVar3.x(objG);
                            }
                            int i15 = i2;
                            nnl nnlVar2 = nnlVar;
                            cfy cfyVarL = bxc.l(cfyVarJ2, (afec) objG);
                            Object obj6 = map2.get(nii.i);
                            obj6.getClass();
                            nny.d(abgVar, nnlVar2, cfyVarL, (cil) obj6, cilVar, false, i15, buxVar3, (i14 & 14) | 64);
                            buxVar3.o();
                        } else {
                            boolean z9 = z6;
                            boolean z10 = z3;
                            boolean z11 = z2;
                            afdr afdrVar3 = afdrVar;
                            afec afecVar5 = afecVar4;
                            int i16 = i13;
                            njw njwVar2 = njwVar;
                            boolean z12 = z8;
                            njp njpVar2 = njpVar;
                            buxVar3.v(898327230);
                            nih.k(awd.r(cfy.e), njpVar2, z12, njwVar2, i16, (nok) afecVar5.invoke(nlz.e), map2, bwqVar4, afdrVar3, z11, z10, z9, buxVar3, 266310, 0);
                            buxVar3.o();
                        }
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, ((i12 >> 18) & 14) | 1597440, 46);
            buxVar2 = buxVarC;
            int i14 = i11 >> 12;
            c(null, njwVar, afecVar, asfVar, afecVar2, map, bwqVar, z2, false, z6, buxVar2, ((i11 >> 9) & 112) | 64 | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (3670016 & (i12 << 18)) | (29360128 & (i12 << 15)) | (1879048192 & (i12 << 3)), 257);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nhw
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cfy cfyVar2 = cfyVar;
                    njp njpVar2 = njpVar;
                    boolean z9 = z;
                    int i15 = i;
                    njw njwVar2 = njwVar;
                    afec afecVar5 = afecVar;
                    asf asfVar2 = asfVar;
                    afec afecVar6 = afecVar2;
                    Map map2 = map;
                    bwq bwqVar4 = bwqVar;
                    afdr afdrVar3 = afdrVar;
                    boolean z10 = z2;
                    boolean z11 = z3;
                    nnl nnlVar2 = nnlVar;
                    int i16 = i3;
                    boolean z12 = z4;
                    int i17 = i4;
                    int i18 = i16 | 1;
                    int i19 = i17 & 306783378;
                    int i20 = i19 + i19;
                    int i21 = i18 & 306783378;
                    int i22 = i2;
                    int i23 = i17 & 613566756;
                    int i24 = i18 & 613566756;
                    boolean z13 = z6;
                    nih.f(cfyVar2, njpVar2, z9, i15, njwVar2, afecVar5, asfVar2, afecVar6, map2, bwqVar4, afdrVar3, z10, z11, nnlVar2, z12, z5, i22, z13, (bux) obj, (i18 & (-920350135)) | i21 | (i24 >> 1) | ((i21 + i21) & i24), (i17 & (-920350135)) | i19 | (i23 >> 1) | (i20 & i23));
                    return afak.a;
                }
            };
        }
    }

    public static final void g(cfy cfyVar, njw njwVar, boolean z, oal oalVar, boolean z2, cil cilVar, cil cilVar2, boolean z3, bux buxVar, int i) {
        int i2;
        boolean z4;
        int i3;
        bym bymVar;
        bym bymVar2;
        Object obj;
        boolean z5;
        bvv bvvVar;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(1070932252);
        if (i4 == 0) {
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
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? buxVarC.C(oalVar) : buxVarC.E(oalVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.D(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(cilVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C(cilVar2) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            z4 = z3;
            i2 |= true != buxVarC.D(z4) ? 4194304 : 8388608;
        } else {
            z4 = z3;
        }
        if (buxVarC.I((4793491 & i2) != 4793490, i2 & 1)) {
            int i5 = i2 >> 3;
            int i6 = i2 & 3670016;
            bym bymVarE = bxc.e(nxo.b().d, buxVarC);
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            Object obj2 = buw.a;
            if (objS == obj2) {
                nav navVar = new nav(bymVarE, 15);
                lah lahVar = byj.a;
                i3 = i2;
                bvk bvkVar = new bvk(navVar, null);
                bvvVar2.ad(bvkVar);
                objS = bvkVar;
            } else {
                i3 = i2;
            }
            bym bymVar3 = (bym) objS;
            Object objS2 = bvvVar2.S();
            if (objS2 == obj2) {
                nav navVar2 = new nav(bymVarE, 16);
                lah lahVar2 = byj.a;
                bymVar = bymVarE;
                bvk bvkVar2 = new bvk(navVar2, null);
                bvvVar2.ad(bvkVar2);
                objS2 = bvkVar2;
            } else {
                bymVar = bymVarE;
            }
            bym bymVar4 = (bym) objS2;
            bym bymVarF = bxc.f(njwVar.e(), 0, buxVarC);
            Context context = (Context) buxVarC.f(daa.b);
            Object objS3 = bvvVar2.S();
            if (objS3 == obj2) {
                bymVar2 = bymVar3;
                mts mtsVar = new mts(njwVar, bymVarF, 12);
                mts mtsVar2 = new mts(njwVar, context, 13);
                obj = null;
                objS3 = new nmm(mtsVar, mtsVar2, null, null);
                bvvVar2.ad(objS3);
            } else {
                bymVar2 = bymVar3;
                obj = null;
            }
            git gitVarA = ((nmm) objS3).a(obj, obj, buxVarC, 3);
            if (njwVar.o) {
                int i7 = i5 & 7168;
                int i8 = (i3 >> 15) & 896;
                buxVarC.v(1126745890);
                nxs nxsVarB = b(bymVar);
                boolean z6 = nxsVarB != null ? nxsVarB.c : false;
                cfy cfyVarJ = bxc.j(cfyVar, cilVar);
                Object objS4 = bvvVar2.S();
                if (i6 == 1048576 || objS4 == obj2) {
                    objS4 = new nar(cilVar2, 20);
                    bvvVar2.ad(objS4);
                }
                cfy cfyVarK = bxc.k(cfyVarJ, (afec) objS4);
                if (z6) {
                    buxVarC.v(1126958891);
                    bvvVar = bvvVar2;
                    z5 = false;
                    oag.a.b(((Boolean) bymVar4.a()).booleanValue(), cfyVarK, z4, z2, null, kgq.p(z2, buxVarC, 0), gitVarA.e, buxVarC, i8 | 12582912 | i7, 16);
                    bvvVar.Y(false);
                } else {
                    z5 = false;
                    bvvVar = bvvVar2;
                    buxVarC.v(1127278160);
                    oag.a.k(((Boolean) bymVar4.a()).booleanValue(), cfyVarK, z3, z2, null, kgq.p(z2, buxVarC, 0), gitVarA.e, ((Number) bymVar2.a()).intValue(), false, 0, buxVarC, i8 | i7, 6, 784);
                    buxVarC = buxVarC;
                    bvvVar.Y(false);
                }
                bvvVar.Y(z5);
            } else {
                buxVarC.v(1127630630);
                cfy cfyVarJ2 = bxc.j(cfyVar, cilVar);
                Object objS5 = bvvVar2.S();
                if (i6 == 1048576 || objS5 == obj2) {
                    objS5 = new nia(cilVar2, 1);
                    bvvVar2.ad(objS5);
                }
                cfy cfyVarK2 = bxc.k(cfyVarJ2, (afec) objS5);
                asf asfVar = gitVarA.e;
                boolean zBooleanValue = ((Boolean) bymVar4.a()).booleanValue();
                ygr ygrVar = oal.a;
                int i9 = i3 << 3;
                nyx.b(cfyVarK2, asfVar, oalVar, z, zBooleanValue, false, z2, false, z3, false, buxVarC, (i5 & 896) | sk.AUDIO_CONTENT_BUFFER_SIZE | (i9 & 7168) | ((i3 << 6) & 3670016) | (i9 & 234881024), 672);
                bvvVar2.Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nhy(cfyVar, njwVar, z, oalVar, z2, cilVar, cilVar2, z3, i, 0);
        }
    }

    public static /* synthetic */ afak h(bwq bwqVar, cis cisVar) {
        cisVar.getClass();
        if (cisVar.b() || cisVar.a()) {
            a.l().u("VerticalRailWidget area focused");
            bwqVar.b(nii.d);
        }
        return afak.a;
    }

    public static /* synthetic */ afak i(bwq bwqVar, cis cisVar) {
        cisVar.getClass();
        if (cisVar.b()) {
            a.l().u("NotificationCenter focused");
            bwqVar.b(nii.i);
        }
        return afak.a;
    }

    /* JADX WARN: Type inference failed for: r39v1 */
    /* JADX WARN: Type inference failed for: r39v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r39v3 */
    public static final void j(final njp njpVar, final qrn qrnVar, njw njwVar, oal oalVar, nnu nnuVar, final afec afecVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        njw njwVar2;
        oal oalVar2;
        nnu nnuVar2;
        njw njwVar3;
        ?? r39;
        final oal oalVar3;
        nnu nnuVar3;
        int iIntValue;
        boolean z;
        bwq bwqVar;
        bwq bwqVar2;
        int i3;
        asf asfVar;
        nnu nnuVar4;
        bym bymVar;
        Map map;
        bwq bwqVar3;
        njpVar.getClass();
        qrnVar.getClass();
        afecVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(2086056160);
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
            i2 |= true != buxVarC.E(afecVar) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                njx njxVar = new njx(qrnVar, 0);
                eru eruVarA = esh.a(buxVarC);
                if (eruVarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                njwVar3 = (njw) epq.e(affw.b(njw.class), eruVarA, null, njxVar, ecw.g(eruVarA));
                oam oamVar = new oam(qrnVar);
                eru eruVarA2 = esh.a(buxVarC);
                if (eruVarA2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                r39 = 1;
                oal oalVar4 = (oal) epq.e(affw.b(oal.class), eruVarA2, null, oamVar, ecw.g(eruVarA2));
                njx njxVar2 = new njx(njwVar3.k, 2);
                eru eruVarA3 = esh.a(buxVarC);
                if (eruVarA3 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                oalVar3 = oalVar4;
                nnuVar3 = (nnu) epq.e(affw.b(nnu.class), eruVarA3, null, njxVar2, ecw.g(eruVarA3));
            } else {
                buxVarC.s();
                njwVar3 = njwVar;
                oalVar3 = oalVar;
                r39 = 1;
                nnuVar3 = nnuVar;
            }
            buxVarC.l();
            ((ype) a.f()).u("Compose Vertical Rail showing");
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = Boolean.valueOf(njwVar3.o);
                bvvVar.ad(objS);
            }
            final boolean zBooleanValue = ((Boolean) objS).booleanValue();
            if (zBooleanValue) {
                buxVarC.v(1817953587);
                bvvVar.Y(false);
                iIntValue = 0;
            } else {
                buxVarC.v(1817976372);
                iIntValue = ((Number) bxc.f(oalVar3.b(), Integer.valueOf((int) r39), buxVarC).a()).intValue();
                bvvVar.Y(false);
            }
            eqj eqjVar = njwVar3.l;
            Object objS2 = bvvVar.S();
            int i5 = 15;
            if (objS2 == obj) {
                objS2 = new ndo(i5);
                bvvVar.ad(objS2);
            }
            final bym bymVarF = bxc.f(eqy.b(eqjVar, (afec) objS2), false, buxVarC);
            boolean z2 = ((Number) bxc.f(njwVar3.m, 0, buxVarC).a()).intValue() != 0 ? r39 : false;
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS3 = parcelableSnapshotMutableState;
            }
            bwq bwqVar4 = (bwq) objS3;
            final bym bymVarF2 = bxc.f(njwVar3.h(), false, buxVarC);
            final bym bymVarF3 = bxc.f(njwVar3.e, false, buxVarC);
            final bym bymVarF4 = bxc.f(njwVar3.c, Boolean.valueOf((boolean) r39), buxVarC);
            Object[] objArr = new Object[0];
            Object objS4 = bvvVar.S();
            if (objS4 == obj) {
                z = z2;
                objS4 = new ngv(2);
                bvvVar.ad(objS4);
            } else {
                z = z2;
            }
            Map map2 = (Map) byx.q(objArr, (afdr) objS4, buxVarC);
            Object[] objArr2 = new Object[0];
            Object objS5 = bvvVar.S();
            if (objS5 == obj) {
                bwqVar = bwqVar4;
                objS5 = new ngv(3);
                bvvVar.ad(objS5);
            } else {
                bwqVar = bwqVar4;
            }
            bwq bwqVar5 = (bwq) byx.q(objArr2, (afdr) objS5, buxVarC);
            Object[] objArr3 = new Object[0];
            Object objS6 = bvvVar.S();
            if (objS6 == obj) {
                bwqVar2 = bwqVar5;
                i3 = 4;
                objS6 = new ngv(4);
                bvvVar.ad(objS6);
            } else {
                bwqVar2 = bwqVar5;
                i3 = 4;
            }
            bwq bwqVar6 = (bwq) byx.q(objArr3, (afdr) objS6, buxVarC);
            Object objS7 = bvvVar.S();
            if (objS7 == obj) {
                objS7 = new ParcelableSnapshotMutableIntState(i3);
                bvvVar.ad(objS7);
            }
            final byd bydVar = (byd) objS7;
            final boolean zC = nrd.a().c();
            Object objS8 = bvvVar.S();
            if (objS8 == obj) {
                objS8 = new asg();
                bvvVar.ad(objS8);
            }
            asf asfVar2 = (asf) objS8;
            bym bymVarF5 = bxc.f(njwVar3.i(), false, buxVarC);
            bym bymVarF6 = bxc.f(njwVar3.e(), 0, buxVarC);
            Object objS9 = bvvVar.S();
            if (objS9 == obj) {
                asfVar = asfVar2;
                nav navVar = new nav(bymVarF6, 19);
                lah lahVar = byj.a;
                bvk bvkVar = new bvk(navVar, null);
                bvvVar.ad(bvkVar);
                objS9 = bvkVar;
            } else {
                asfVar = asfVar2;
            }
            final bym bymVar2 = (bym) objS9;
            bym bymVarF7 = bxc.f(nnuVar3.k, nnl.a, buxVarC);
            Object objS10 = bvvVar.S();
            if (objS10 == obj) {
                nnuVar4 = nnuVar3;
                mts mtsVar = new mts(njwVar3, bymVarF7, 14);
                lah lahVar2 = byj.a;
                bvk bvkVar2 = new bvk(mtsVar, null);
                bvvVar.ad(bvkVar2);
                objS10 = bvkVar2;
            } else {
                nnuVar4 = nnuVar3;
            }
            final bym bymVar3 = (bym) objS10;
            Object objS11 = bvvVar.S();
            if (objS11 == obj) {
                mts mtsVar2 = new mts(bymVar3, bymVarF7, 15);
                lah lahVar3 = byj.a;
                bymVar = bymVarF7;
                bvk bvkVar3 = new bvk(mtsVar2, null);
                bvvVar.ad(bvkVar3);
                objS11 = bvkVar3;
            } else {
                bymVar = bymVarF7;
            }
            final bym bymVar4 = (bym) objS11;
            Boolean boolValueOf = Boolean.valueOf(((Boolean) bymVarF5.a()).booleanValue());
            boolean zC2 = buxVarC.C(bymVarF5);
            Object objS12 = bvvVar.S();
            if (zC2 || objS12 == obj) {
                objS12 = new nia(bymVarF5, 8);
                bvvVar.ad(objS12);
            }
            eee.i(boolValueOf, null, (afec) objS12, buxVarC, 0);
            if (zC) {
                buxVarC.v(1820223810);
                Integer numValueOf = Integer.valueOf(bydVar.e());
                boolean zE = buxVarC.E(map2) | buxVarC.C(bwqVar6);
                Object objS13 = bvvVar.S();
                if (zE || objS13 == obj) {
                    map = map2;
                    bwqVar3 = bwqVar6;
                    objS13 = new gqj(bydVar, map, bwqVar3, (afck) null, 3);
                    bvvVar.ad(objS13);
                } else {
                    map = map2;
                    bwqVar3 = bwqVar6;
                }
                bvq.g(numValueOf, (afeg) objS13, buxVarC);
                bvvVar.Y(false);
            } else {
                map = map2;
                bwqVar3 = bwqVar6;
                buxVarC.v(1820746594);
                bvvVar.Y(false);
            }
            final bym bymVar5 = bymVar;
            final int i6 = iIntValue;
            final bwq bwqVar7 = bwqVar;
            final boolean z3 = z;
            final Map map3 = map;
            final bwq bwqVar8 = bwqVar2;
            final asf asfVar3 = asfVar;
            final njw njwVar4 = njwVar3;
            final bwq bwqVar9 = bwqVar3;
            afeg afegVar = new afeg() { // from class: nht
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    bux buxVar3 = (bux) obj2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    int i7 = iIntValue2 & 3;
                    int i8 = iIntValue2 & 1;
                    yph yphVar = nih.a;
                    if (buxVar3.I(i7 != 2, i8)) {
                        final bwq bwqVar10 = bwqVar9;
                        final bym bymVar6 = bymVar5;
                        final njp njpVar2 = njpVar;
                        final bym bymVar7 = bymVar4;
                        final oal oalVar5 = oalVar3;
                        final asf asfVar4 = asfVar3;
                        final afec afecVar2 = afecVar;
                        final bwq bwqVar11 = bwqVar7;
                        final bym bymVar8 = bymVar2;
                        final bym bymVar9 = bymVarF4;
                        final bym bymVar10 = bymVarF3;
                        final bym bymVar11 = bymVarF2;
                        final njw njwVar5 = njwVar4;
                        final bym bymVar12 = bymVar3;
                        final byd bydVar2 = bydVar;
                        final bym bymVar13 = bymVarF;
                        final qrn qrnVar2 = qrnVar;
                        final Map map4 = map3;
                        final bwq bwqVar12 = bwqVar8;
                        final boolean z4 = zC;
                        final int i9 = i6;
                        final boolean z5 = z3;
                        final boolean z6 = zBooleanValue;
                        ca.at(awd.c(cfy.e, 1.0f), cfl.e, bxc.i(1927640178, true, new afeh() { // from class: nhz
                            /* JADX WARN: Code restructure failed: missing block: B:104:0x0178, code lost:
                            
                                if (defpackage.dlj.a(r7, 600.0f) < 0) goto L140;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:139:0x01e1, code lost:
                            
                                r5 = false;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
                            
                                if (defpackage.dlj.a(r7, 520.0f) >= 0) goto L76;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
                            
                                if (defpackage.dlj.a(r7, 559.0f) >= 0) goto L76;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:54:0x00e3, code lost:
                            
                                if (defpackage.dlj.a(r7, 480.0f) >= 0) goto L90;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:
                            
                                if (defpackage.dlj.a(r7, 480.0f) >= 0) goto L90;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:69:0x010c, code lost:
                            
                                if (defpackage.dlj.a(r7, 480.0f) >= 0) goto L76;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:75:0x011d, code lost:
                            
                                if (defpackage.dlj.a(r7, 500.0f) >= 0) goto L76;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:76:0x011f, code lost:
                            
                                r4 = true;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:77:0x0121, code lost:
                            
                                r14 = 2;
                                r4 = true;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:83:0x0133, code lost:
                            
                                if (defpackage.dlj.a(r7, 430.0f) >= 0) goto L90;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:89:0x0148, code lost:
                            
                                if (defpackage.dlj.a(r7, 450.0f) >= 0) goto L90;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:90:0x014a, code lost:
                            
                                r4 = false;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:91:0x014d, code lost:
                            
                                r14 = 2;
                                r4 = false;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:144:0x01ee  */
                            /* JADX WARN: Removed duplicated region for block: B:145:0x01f1 A[ADDED_TO_REGION] */
                            /* JADX WARN: Removed duplicated region for block: B:198:0x028f  */
                            /* JADX WARN: Removed duplicated region for block: B:203:0x02b7  */
                            /* JADX WARN: Removed duplicated region for block: B:206:0x02c4  */
                            /* JADX WARN: Removed duplicated region for block: B:211:0x030a  */
                            /* JADX WARN: Removed duplicated region for block: B:213:0x031b  */
                            /* JADX WARN: Removed duplicated region for block: B:214:0x0327  */
                            /* JADX WARN: Removed duplicated region for block: B:216:0x032d  */
                            /* JADX WARN: Removed duplicated region for block: B:217:0x0332  */
                            /* JADX WARN: Removed duplicated region for block: B:221:0x0353  */
                            /* JADX WARN: Removed duplicated region for block: B:224:0x0394  */
                            /* JADX WARN: Removed duplicated region for block: B:225:0x0398  */
                            /* JADX WARN: Removed duplicated region for block: B:228:0x03f1  */
                            /* JADX WARN: Removed duplicated region for block: B:229:0x03f5  */
                            /* JADX WARN: Removed duplicated region for block: B:232:0x041e  */
                            /* JADX WARN: Removed duplicated region for block: B:234:0x0443  */
                            /* JADX WARN: Removed duplicated region for block: B:303:0x082c  */
                            @Override // defpackage.afeh
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r43, java.lang.Object r44, java.lang.Object r45) {
                                /*
                                    Method dump skipped, instructions count: 2142
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.nhz.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, buxVar3), buxVar3, 3126, 4);
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            };
            buxVar2 = buxVarC;
            ksr.a(null, null, false, null, bxc.i(-520161656, true, afegVar, buxVar2), buxVar2, 24576, 15);
            njwVar2 = njwVar4;
            oalVar2 = oalVar3;
            nnuVar2 = nnuVar4;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            njwVar2 = njwVar;
            oalVar2 = oalVar;
            nnuVar2 = nnuVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bpj(njpVar, qrnVar, njwVar2, oalVar2, nnuVar2, afecVar, i, 7);
        }
    }

    public static final void k(final cfy cfyVar, final njp njpVar, final boolean z, final njw njwVar, final int i, final nok nokVar, final Map map, final bwq bwqVar, final afdr afdrVar, final boolean z2, final boolean z3, final boolean z4, bux buxVar, final int i2, final int i3) {
        int i4;
        int i5;
        bux buxVar2;
        float f;
        boolean z5;
        int i6;
        nii niiVar;
        int i7;
        boolean z6;
        char c;
        boolean z7;
        int i8 = i2 & 6;
        bux buxVarC = buxVar.c(566773901);
        if (i8 == 0) {
            i4 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != ((i2 & 64) == 0 ? buxVarC.C(njpVar) : buxVarC.E(njpVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != ((i2 & 4096) == 0 ? buxVarC.C(njwVar) : buxVarC.E(njwVar)) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != buxVarC.A(i) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != ((262144 & i2) == 0 ? buxVarC.C(nokVar) : buxVarC.E(nokVar)) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != ((2097152 & i2) == 0 ? buxVarC.C(map) : buxVarC.E(map)) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != buxVarC.C(bwqVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != buxVarC.E(afdrVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != buxVarC.D(z2) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (true != buxVarC.D(z3) ? 2 : 4);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true == buxVarC.D(z4) ? 32 : 16;
        }
        if (buxVarC.I(((i4 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true, i4 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new asg();
                bvvVar.ad(objS);
            }
            int i9 = i5;
            boolean z8 = njwVar.o;
            asf asfVar = (asf) objS;
            if (z8) {
                ksy ksyVar = nly.a;
                f = 16.0f;
            } else if (z2) {
                ksc kscVar = nlw.a;
                f = 2.0f;
            } else {
                ksc kscVar2 = nlw.a;
                f = 10.0f;
            }
            boolean z9 = z8;
            ctp ctpVarA = atp.a(atd.g(f), cfl.k, buxVarC, 48);
            int iG = a.g(bvvVar.u);
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
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            int i10 = 57344;
            if (z) {
                buxVarC.v(-268251407);
                boolean z10 = ((i4 & 7168) == 2048 || ((i4 & 4096) != 0 && buxVarC.C(njwVar))) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && buxVarC.C(njpVar)));
                boolean z11 = (i4 & 57344) == 16384;
                Object objS2 = bvvVar.S();
                if ((z10 | z11) || objS2 == obj) {
                    objS2 = njwVar.f(true, i, njpVar);
                    bvvVar.ad(objS2);
                }
                bym bymVarF = bxc.f((eqj) objS2, afbe.a, buxVarC);
                int i11 = 0;
                while (i11 < i) {
                    int i12 = i4 >> 12;
                    nmj nmjVar = (nmj) woy.bI(roc.ag(bymVarF), i11);
                    if (i11 != 0) {
                        i6 = 458752;
                        niiVar = i11 != 1 ? i11 != 2 ? nii.h : nii.g : nii.f;
                    } else {
                        i6 = 458752;
                        niiVar = nii.e;
                    }
                    nii niiVar2 = niiVar;
                    int i13 = i12 & i6;
                    int i14 = i12 & i10;
                    int i15 = i10;
                    buxVarC.v(-267547428);
                    cfv cfvVar = cfy.e;
                    Object obj2 = map.get(niiVar2);
                    obj2.getClass();
                    cfy cfyVarJ2 = bxc.j(cfvVar, (cil) obj2);
                    boolean zA = buxVarC.A(i11) | ((i4 & 29360128) == 8388608) | buxVarC.A(niiVar2.ordinal());
                    Object objS3 = bvvVar.S();
                    if (zA || objS3 == obj) {
                        i7 = 4;
                        objS3 = new fof(i11, bwqVar, niiVar2, i7);
                        bvvVar.ad(objS3);
                    } else {
                        i7 = 4;
                    }
                    cfy cfyVarL = bxc.l(cfyVarJ2, (afec) objS3);
                    int i16 = 3;
                    if (i11 == 3) {
                        cfyVarL = ebf.B(cfyVarL, nokVar, asfVar);
                    } else {
                        i16 = i11;
                    }
                    cfy cfyVar2 = cfyVarL;
                    if (z4) {
                        if (nmjVar != null) {
                            z6 = true;
                            if (nmjVar.e) {
                            }
                            bux buxVar3 = buxVarC;
                            boolean z12 = z9;
                            kgq.n(cfyVar2, nmjVar, z12, false, afdrVar, z2, z3, null, z7, buxVar3, i14 | 64 | i13 | ((i9 << 18) & 3670016), 136);
                            bvvVar.Y(false);
                            asfVar = asfVar;
                            z9 = z12;
                            obj = obj;
                            buxVarC = buxVar3;
                            i11 = i16 + 1;
                            i4 = i4;
                            i10 = i15;
                        } else {
                            z6 = true;
                        }
                        z7 = z6;
                        c = 18;
                        bux buxVar32 = buxVarC;
                        boolean z122 = z9;
                        kgq.n(cfyVar2, nmjVar, z122, false, afdrVar, z2, z3, null, z7, buxVar32, i14 | 64 | i13 | ((i9 << 18) & 3670016), 136);
                        bvvVar.Y(false);
                        asfVar = asfVar;
                        z9 = z122;
                        obj = obj;
                        buxVarC = buxVar32;
                        i11 = i16 + 1;
                        i4 = i4;
                        i10 = i15;
                    } else {
                        z6 = true;
                    }
                    c = 18;
                    z7 = false;
                    bux buxVar322 = buxVarC;
                    boolean z1222 = z9;
                    kgq.n(cfyVar2, nmjVar, z1222, false, afdrVar, z2, z3, null, z7, buxVar322, i14 | 64 | i13 | ((i9 << 18) & 3670016), 136);
                    bvvVar.Y(false);
                    asfVar = asfVar;
                    z9 = z1222;
                    obj = obj;
                    buxVarC = buxVar322;
                    i11 = i16 + 1;
                    i4 = i4;
                    i10 = i15;
                }
                z5 = true;
                bvvVar.Y(false);
                buxVar2 = buxVarC;
            } else {
                int i17 = i4;
                bux buxVar4 = buxVarC;
                z5 = true;
                buxVar4.v(-266673662);
                int i18 = 0;
                while (i18 < i) {
                    int i19 = i17 >> 12;
                    bux buxVar5 = buxVar4;
                    kgq.n(null, kgq.l(), false, false, afdrVar, z2, false, null, z4, buxVar5, (i19 & 57344) | 1572928 | (i19 & 458752) | (234881024 & (i9 << 21)), 141);
                    i18++;
                    buxVar4 = buxVar5;
                }
                buxVar2 = buxVar4;
                bvvVar.Y(false);
            }
            bvvVar.Y(z5);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nhu
                @Override // defpackage.afeg
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    cfy cfyVar3 = cfyVar;
                    njp njpVar2 = njpVar;
                    boolean z13 = z;
                    njw njwVar2 = njwVar;
                    int i20 = i;
                    nok nokVar2 = nokVar;
                    Map map2 = map;
                    bwq bwqVar2 = bwqVar;
                    int i21 = i2;
                    afdr afdrVar3 = afdrVar;
                    int i22 = i3;
                    int i23 = i21 | 1;
                    int i24 = i22 & 306783378;
                    int i25 = 306783378 & i23;
                    boolean z14 = z3;
                    int i26 = i22 & 613566756;
                    int i27 = i23 & 613566756;
                    boolean z15 = z4;
                    nih.k(cfyVar3, njpVar2, z13, njwVar2, i20, nokVar2, map2, bwqVar2, afdrVar3, z2, z14, z15, (bux) obj3, (i23 & (-920350135)) | i25 | (i27 >> 1) | ((i25 + i25) & i27), (i22 & (-920350135)) | i24 | (i26 >> 1) | ((i24 + i24) & i26));
                    return afak.a;
                }
            };
        }
    }
}
