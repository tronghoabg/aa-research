package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.Banner;
import androidx.car.app.model.BannerSection;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Chip;
import androidx.car.app.model.ChipSection;
import androidx.car.app.model.ChipStyle;
import androidx.car.app.model.CondensedItem;
import androidx.car.app.model.CondensedSection;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.GridSection;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.RowSection;
import androidx.car.app.model.Section;
import androidx.car.app.model.SectionHeader;
import androidx.car.app.model.SectionedItemList;
import androidx.car.app.model.SectionedItemTemplate;
import androidx.car.app.model.SpotlightSection;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class grx {
    public static final void a(gry gryVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        boolean z;
        bux buxVarC = buxVar.c(-554812746);
        if ((i & 6) == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(gryVar) : buxVarC.E(gryVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfy cfyVarC = awd.c(cfyVar, 1.0f);
            ctp ctpVarB = atk.b(cfl.e, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarC);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            afeg afegVar = cwb.e;
            byq.c(buxVarC, ctpVarB, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar4);
            cfv cfvVar = cfy.e;
            cfy cfyVarU = awd.u(cfvVar, null, 3);
            ctp ctpVarA = atp.a(atd.c, cfl.k, buxVarC, 48);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarU);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            grv.a(gryVar.a, null, buxVarC, 8, 2);
            hju hjuVar = gryVar.b;
            if (hjuVar != null) {
                buxVarC.v(-1185358777);
                asl.A(awd.d(cfvVar, gux.e(buxVarC).b.h), buxVarC);
                z = true;
                gvq.g(hjuVar, asl.G(cfvVar, asl.K(BitmapDescriptorFactory.HUE_RED, gux.e(buxVarC).b.f, 1)), buxVarC, 0, 0);
                bvvVar.Y(false);
            } else {
                z = true;
                buxVarC.v(-1185142552);
                bvvVar.Y(false);
            }
            bvvVar.Y(z);
            bvvVar.Y(z);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(gryVar, cfyVar, i, 9);
        }
    }

    public static int b(int i, int i2) {
        if (i > 0 && i2 > 0) {
            return i2 < 640 ? i < 690 ? 1 : 2 : i < 690 ? 3 : 4;
        }
        gks.c("CarApp.H.Tem", "Safe area width and height are invalid, width: %d, height: %d", Integer.valueOf(i), Integer.valueOf(i2));
        return 0;
    }

    public static boolean c(int i) {
        return i == 1 || i == 3;
    }

    public static boolean d(int i) {
        return i == 1 || i == 2;
    }

    public static final void e(final hbj hbjVar, final cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        long jI;
        long j;
        hbjVar.getClass();
        bux buxVarC = buxVar.c(-1708024807);
        if ((i & 6) == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(hbjVar) : buxVarC.E(hbjVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            final bcm bcmVarD = hbv.d(hbjVar.g, buxVarC);
            fyt fytVar = hbjVar.f;
            if (fytVar instanceof fyl) {
                buxVarC.v(674364090);
                jI = ((fyl) fytVar).a.a(false, buxVarC, 1);
                ((bvv) buxVarC).Y(false);
            } else if (affa.f(fytVar, fym.a)) {
                buxVarC.v(674372282);
                jI = gux.c(buxVarC).K();
                ((bvv) buxVarC).Y(false);
            } else if (affa.f(fytVar, fyo.a)) {
                buxVarC.v(674375062);
                jI = gux.c(buxVarC).D();
                ((bvv) buxVarC).Y(false);
            } else if (affa.f(fytVar, fyq.a)) {
                buxVarC.v(674377784);
                jI = gux.c(buxVarC).H();
                ((bvv) buxVarC).Y(false);
            } else if (affa.f(fytVar, fyk.a)) {
                buxVarC.v(674380403);
                jI = gux.c(buxVarC).c();
                ((bvv) buxVarC).Y(false);
            } else if (affa.f(fytVar, fyn.a)) {
                buxVarC.v(674382900);
                jI = gux.c(buxVarC).f();
                ((bvv) buxVarC).Y(false);
            } else if (affa.f(fytVar, fyp.a)) {
                buxVarC.v(674385362);
                jI = gux.c(buxVarC).F();
                ((bvv) buxVarC).Y(false);
            } else if (affa.f(fytVar, fys.a)) {
                buxVarC.v(674387861);
                jI = gux.c(buxVarC).W();
                ((bvv) buxVarC).Y(false);
            } else {
                if (!affa.f(fytVar, fyr.a)) {
                    buxVarC.v(674362881);
                    ((bvv) buxVarC).Y(false);
                    throw new aezs();
                }
                buxVarC.v(674389969);
                ((bvv) buxVarC).Y(false);
                jI = cjn.i(0);
            }
            cjv cjvVar = new cjv(jI);
            if (true == fwn.h(cjvVar.a)) {
                cjvVar = null;
            }
            final cjv cjvVar2 = cjvVar;
            if (cjvVar2 == null) {
                buxVarC.v(-734323584);
                j = ((cjv) buxVarC.f(ggf.a)).a;
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-734324979);
                ((bvv) buxVarC).Y(false);
                j = cjvVar2.a;
            }
            long j2 = j;
            bvf bvfVar = bnm.a;
            long jQ = fww.q(woy.bi(new cjv(gux.c(buxVarC).u()), new cjv(gux.c(buxVarC).g()), (cjv) buxVarC.f(bvfVar)), j2, 0, buxVarC, 12);
            buxVar2 = buxVarC;
            bvv bvvVar = (bvv) buxVar2;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new bca();
                bvvVar.ad(objS);
            }
            final bca bcaVar = (bca) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = bvq.a(afcp.a, buxVar2);
                bvvVar.ad(objS2);
            }
            final aitx aitxVar = (aitx) objS2;
            czz.an(new bxe[]{ggf.a.b(new cjv(j2)), bvfVar.b(new cjv(jQ))}, bxc.i(-192818983, true, new afeg() { // from class: hbh
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    long jA;
                    bcm bcmVar;
                    gcb gcbVar;
                    gcq gcqVar;
                    afdr afdrVar;
                    afeg afegVar;
                    afeg afegVar2;
                    afeg afegVar3;
                    afec afecVar;
                    afeg afegVar4;
                    hbj hbjVar2;
                    float f;
                    cfv cfvVar;
                    bux buxVar3 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (buxVar3.I((iIntValue & 3) != 2, iIntValue & 1)) {
                        hbj hbjVar3 = hbjVar;
                        cfy cfyVarAm = ca.am(cfyVar, 1);
                        afdr afdrVar2 = hbjVar3.i;
                        if (afdrVar2 != null) {
                            buxVar3.v(-615442336);
                            jA = ((ggg) buxVar3.f(ggh.a)).a(buxVar3);
                            buxVar3.o();
                        } else {
                            buxVar3.v(-615441731);
                            buxVar3.o();
                            jA = -33626879508348928L;
                        }
                        aitx aitxVar2 = aitxVar;
                        bca bcaVar2 = bcaVar;
                        bcm bcmVar2 = bcmVarD;
                        int i3 = 2;
                        cfy cfyVarA = ggh.a(cfyVarAm, bcmVar2, jA, 0L, null, null, null, true, true, buxVar3, 113246208, 60);
                        bux buxVar4 = buxVar3;
                        cfy cfyVarR = afp.R(cfyVarA, bcaVar2);
                        boolean zE = buxVar4.E(aitxVar2) | buxVar4.E(bcaVar2);
                        Object objG = buxVar4.g();
                        byte[] bArr = null;
                        if (zE || objG == buw.a) {
                            objG = new grn(aitxVar2, bcaVar2, 9, bArr);
                            buxVar4.x(objG);
                        }
                        cjv cjvVar3 = cjvVar2;
                        cfy cfyVarL = bxc.l(cfyVarR, (afec) objG);
                        if (cjvVar3 != null) {
                            cfyVarL = cfyVarL.a(new aix(cjvVar3.a, ckq.a));
                        }
                        cfy cfyVarA2 = cfyVarL.a(afdrVar2 != null ? afp.x(cfy.e, true, null, null, afdrVar2) : ca.bf(cfy.e, true, null));
                        cfr cfrVar = cfl.n;
                        hir hirVar = gux.e(buxVar4).c;
                        ctp ctpVarA = avv.a(atd.g(4.0f), cfrVar, buxVar4, 48);
                        int iG = a.g(buxVar4.b());
                        ccx ccxVarN = buxVar4.N();
                        cfy cfyVarJ = bzi.j(buxVar4, cfyVarA2);
                        afdr afdrVar3 = cwb.a;
                        buxVar4.M();
                        buxVar4.w();
                        if (buxVar4.G()) {
                            buxVar4.j(afdrVar3);
                        } else {
                            buxVar4.y();
                        }
                        afeg afegVar5 = cwb.e;
                        byq.c(buxVar4, ctpVarA, afegVar5);
                        afeg afegVar6 = cwb.d;
                        byq.c(buxVar4, ccxVarN, afegVar6);
                        Integer numValueOf = Integer.valueOf(iG);
                        afeg afegVar7 = cwb.f;
                        byq.c(buxVar4, numValueOf, afegVar7);
                        afec afecVar2 = cwb.g;
                        byq.b(buxVar4, afecVar2);
                        afeg afegVar8 = cwb.c;
                        byq.c(buxVar4, cfyVarJ, afegVar8);
                        gbg gbgVar = hbjVar3.d;
                        avy avyVar = avy.a;
                        if (gbgVar != null) {
                            buxVar4.v(-2053038740);
                            grx.f(gbgVar, hbjVar3.j, bcmVar2, 1, null, buxVar4, 3072);
                            bcmVar = bcmVar2;
                            buxVar4.o();
                        } else {
                            bcmVar = bcmVar2;
                            if (affa.f(hbjVar3.g, hjz.a)) {
                                buxVar4.v(-2052768079);
                                cfv cfvVar2 = cfy.e;
                                hir hirVar2 = gux.e(buxVar4).c;
                                asl.A(awd.m(cfvVar2, 12.0f), buxVar4);
                                buxVar4.o();
                            } else {
                                buxVar4.v(-2052687355);
                                buxVar4.o();
                            }
                        }
                        gcb gcbVar2 = hbjVar3.h;
                        gcq gcqVar2 = hbjVar3.c;
                        dlg dlgVar = (dlg) buxVar4.f(dbc.d);
                        buxVar4.v(-2005873340);
                        float fEw = dlgVar.ew(czz.av(buxVar4).i.h());
                        buxVar4.o();
                        buxVar4.v(-2005870301);
                        float fEw2 = dlgVar.ew(czz.av(buxVar4).l.h());
                        buxVar4.o();
                        cfv cfvVar3 = cfy.e;
                        cfy cfyVarB = avyVar.b(cfvVar3, 1.0f, true);
                        hir hirVar3 = gux.e(buxVar4).c;
                        float f2 = gux.e(buxVar4).a.d;
                        hir hirVar4 = gux.e(buxVar4).c;
                        cfy cfyVarD = awd.d(asl.I(cfyVarB, f2 + 8.0f + BitmapDescriptorFactory.HUE_RED, gux.e(buxVar4).b.d + 8.0f + BitmapDescriptorFactory.HUE_RED), fEw + fEw2 + BitmapDescriptorFactory.HUE_RED);
                        ctp ctpVarA2 = atp.a(atd.e, cfl.j, buxVar4, 6);
                        int iG2 = a.g(buxVar4.b());
                        ccx ccxVarN2 = buxVar4.N();
                        cfy cfyVarJ2 = bzi.j(buxVar4, cfyVarD);
                        buxVar4.M();
                        buxVar4.w();
                        if (buxVar4.G()) {
                            buxVar4.j(afdrVar3);
                        } else {
                            buxVar4.y();
                        }
                        byq.c(buxVar4, ctpVarA2, afegVar5);
                        byq.c(buxVar4, ccxVarN2, afegVar6);
                        byq.c(buxVar4, Integer.valueOf(iG2), afegVar7);
                        byq.b(buxVar4, afecVar2);
                        byq.c(buxVar4, cfyVarJ2, afegVar8);
                        gcq gcqVar3 = hbjVar3.b;
                        if (gcqVar3 == null) {
                            buxVar4.v(-1708221508);
                            buxVar4.o();
                            cfvVar = cfvVar3;
                            f = fEw2;
                            gcbVar = gcbVar2;
                            afdrVar = afdrVar3;
                            afegVar = afegVar5;
                            afegVar2 = afegVar6;
                            afegVar3 = afegVar7;
                            afecVar = afecVar2;
                            afegVar4 = afegVar8;
                            hbjVar2 = hbjVar3;
                            gcqVar = gcqVar2;
                        } else {
                            buxVar4.v(-1708221507);
                            if (gcqVar2 != null || gcbVar2 != null) {
                                i3 = 1;
                            }
                            gcbVar = gcbVar2;
                            gcqVar = gcqVar2;
                            afdrVar = afdrVar3;
                            afegVar = afegVar5;
                            afegVar2 = afegVar6;
                            afegVar3 = afegVar7;
                            afecVar = afecVar2;
                            afegVar4 = afegVar8;
                            hbjVar2 = hbjVar3;
                            f = fEw2;
                            cfvVar = cfvVar3;
                            fzc.g(gcqVar3, null, i3, 0, 0L, czz.av(buxVar4).i, 0L, null, 0, 0, null, null, null, false, false, buxVar4, 8, 0, 65498);
                            buxVar4 = buxVar4;
                            buxVar4.o();
                        }
                        if (gcqVar != null) {
                            buxVar4.v(-1707927720);
                            bux buxVar5 = buxVar4;
                            fzc.g(gcqVar, null, 0, 0, 0L, czz.av(buxVar4).l, 0L, null, 0, 0, null, null, null, false, false, buxVar5, 8, 0, 65502);
                            buxVar4 = buxVar5;
                            buxVar4.o();
                        } else {
                            buxVar4.v(-1707844113);
                            buxVar4.o();
                        }
                        if (gcbVar != null) {
                            buxVar4.v(-1707805921);
                            cfv cfvVar4 = cfvVar;
                            cfy cfyVarD2 = awd.d(cfvVar4, f);
                            ctp ctpVarB = atk.b(cfl.d, false);
                            int iG3 = a.g(buxVar4.b());
                            ccx ccxVarN3 = buxVar4.N();
                            cfy cfyVarJ3 = bzi.j(buxVar4, cfyVarD2);
                            buxVar4.M();
                            buxVar4.w();
                            if (buxVar4.G()) {
                                buxVar4.j(afdrVar);
                            } else {
                                buxVar4.y();
                            }
                            byq.c(buxVar4, ctpVarB, afegVar);
                            byq.c(buxVar4, ccxVarN3, afegVar2);
                            byq.c(buxVar4, Integer.valueOf(iG3), afegVar3);
                            byq.b(buxVar4, afecVar);
                            byq.c(buxVar4, cfyVarJ3, afegVar4);
                            bux buxVar6 = buxVar4;
                            gca.a(gcbVar, awd.r(cfvVar4), 0, buxVar6, 48, 4);
                            buxVar4 = buxVar6;
                            buxVar4.n();
                            buxVar4.o();
                        } else {
                            buxVar4.v(-1707606033);
                            buxVar4.o();
                        }
                        buxVar4.n();
                        hbj hbjVar4 = hbjVar2;
                        gbg gbgVar2 = hbjVar4.e;
                        if (gbgVar2 == null) {
                            buxVar4.v(-2051265355);
                            buxVar4.o();
                        } else {
                            buxVar4.v(-2051265354);
                            grx.f(gbgVar2, hbjVar4.k, bcmVar, 2, null, buxVar4, 3072);
                            buxVar4.o();
                        }
                        buxVar4.n();
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            }, buxVar2), buxVar2, 48);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gul(hbjVar, cfyVar, i, 17, null);
        }
    }

    public static final void f(final gbg gbgVar, int i, final bcm bcmVar, final int i2, cfy cfyVar, bux buxVar, final int i3) {
        int i4;
        bcm bcmVar2;
        final cfy cfyVar2;
        final int i5;
        int i6;
        cfy cfyVarI;
        cfv cfvVar;
        int i7 = i3 & 6;
        bux buxVarC = buxVar.c(-1798497326);
        if (i7 == 0) {
            i4 = (true != ((i3 & 8) == 0 ? buxVarC.C(gbgVar) : buxVarC.E(gbgVar)) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != buxVarC.A(i + (-1)) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            bcmVar2 = bcmVar;
            i4 |= true != buxVarC.C(bcmVar2) ? 128 : 256;
        } else {
            bcmVar2 = bcmVar;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != buxVarC.A(i2 + (-1)) ? 1024 : 2048;
        }
        int i8 = i4 | 24576;
        if (buxVarC.I((i8 & 9363) != 9362, i8 & 1)) {
            int i9 = i8 & 14;
            boolean z = i == 1;
            cfv cfvVar2 = cfy.e;
            csi csiVar = !z ? csh.a : csh.b;
            bcm bcmVar3 = i != 3 ? bcmVar2 : null;
            buxVarC.v(-1779061603);
            if (i != 3) {
                buxVarC.v(-1779051317);
                buxVarC.v(-1779055540);
                hir hirVar = gux.e(buxVarC).c;
                hir hirVar2 = gux.e(buxVarC).c;
                cfyVarI = asl.I(cfvVar2, 8.0f, gux.e(buxVarC).b.d + 8.0f + BitmapDescriptorFactory.HUE_RED);
                if (i2 == 1) {
                    cfyVarI = asl.J(cfyVarI, gux.e(buxVarC).a.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                bvv bvvVar = (bvv) buxVarC;
                bvvVar.Y(false);
                if (i2 == 2) {
                    cfyVarI = asl.J(cfyVarI, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gux.e(buxVarC).a.d, BitmapDescriptorFactory.HUE_RED);
                }
                bvvVar.Y(false);
                i6 = i;
            } else {
                i6 = 3;
                cfyVarI = cfvVar2;
            }
            int i10 = i9 | 1572864;
            bvv bvvVar2 = (bvv) buxVarC;
            bvvVar2.Y(false);
            if (z) {
                cfvVar = cfvVar2;
                buxVarC.v(684560127);
                gbf.d(gbgVar, awd.i(cfyVarI, gux.g(buxVarC).d.d), null, csiVar, (cjv) buxVarC.f(bnm.a), false, false, null, null, false, buxVarC, i10, 932);
                bvvVar2.Y(false);
            } else {
                buxVarC.v(684136357);
                cfy cfyVarAv = ca.av(awd.b(cfyVarI, 1.0f), true);
                if (bcmVar3 != null) {
                    cfyVarAv = cjn.g(cfyVarAv, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bcmVar3, true, 0, 1042431);
                }
                ctp ctpVarB = atk.b(cfl.a, false);
                csi csiVar2 = csiVar;
                int iG = a.g(bvvVar2.u);
                ccx ccxVarAh = bvvVar2.ah();
                cfy cfyVarJ = bzi.j(buxVarC, cfyVarAv);
                afdr afdrVar = cwb.a;
                buxVarC.w();
                if (bvvVar2.t) {
                    buxVarC.j(afdrVar);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarB, cwb.e);
                byq.c(buxVarC, ccxVarAh, cwb.d);
                byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
                byq.b(buxVarC, cwb.g);
                byq.c(buxVarC, cfyVarJ, cwb.c);
                cfvVar = cfvVar2;
                gbf.d(gbgVar, atn.a.b(cfvVar2), null, csiVar2, (cjv) buxVarC.f(bnm.a), false, false, null, null, false, buxVarC, i10, 932);
                bvvVar2.Y(true);
                bvvVar2.Y(false);
            }
            cfyVar2 = cfvVar;
            i5 = i6;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
            i5 = i;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: hbi
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    gbg gbgVar2 = gbgVar;
                    int i11 = i3 | 1;
                    int i12 = 306783378 & i11;
                    int i13 = 613566756 & i11;
                    grx.f(gbgVar2, i5, bcmVar, i2, cfyVar2, buxVar2, (i11 & (-920350135)) | i12 | (i13 >> 1) | ((i12 + i12) & i13));
                    return afak.a;
                }
            };
        }
    }

    public static final hay g(ListTemplate listTemplate, geu geuVar) {
        List listBg;
        List<SectionedItemList> sectionedLists = listTemplate.getSectionedLists();
        sectionedLists.getClass();
        if (!sectionedLists.isEmpty()) {
            List<SectionedItemList> sectionedLists2 = listTemplate.getSectionedLists();
            sectionedLists2.getClass();
            listBg = new ArrayList(woy.bp(sectionedLists2, 10));
            for (SectionedItemList sectionedItemList : sectionedLists2) {
                sectionedItemList.getClass();
                listBg.add(gqk.i(sectionedItemList, geuVar));
            }
        } else if (listTemplate.getSingleList() != null) {
            ItemList singleList = listTemplate.getSingleList();
            singleList.getClass();
            listBg = woy.bg(gqk.h(singleList, geuVar));
        } else {
            listBg = afbe.a;
        }
        List list = listBg;
        Header header = listTemplate.getHeader();
        fzg fzgVarJ = header != null ? fww.j(header, geuVar) : null;
        boolean zIsLoading = listTemplate.isLoading();
        List<Action> actions = listTemplate.getActions();
        actions.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(actions, 10));
        for (Action action : actions) {
            action.getClass();
            geu geuVar2 = geuVar;
            arrayList.add(fvl.c(action, geuVar2, i(geuVar), null, false, 12));
            geuVar = geuVar2;
        }
        return new hay(zIsLoading, fzgVarJ, list, arrayList, 1, j(geuVar), null, false, BitmapDescriptorFactory.HUE_RED, 448);
    }

    public static final hay h(SectionedItemTemplate sectionedItemTemplate, geu geuVar, boolean z) {
        Object hadVar;
        int i;
        SectionHeader sectionHeader;
        SectionHeader sectionHeader2;
        geu geuVar2 = geuVar;
        if (z) {
            List<Section<?>> sections = sectionedItemTemplate.getSections();
            sections.getClass();
            if (!sections.isEmpty()) {
                Iterator<T> it = sections.iterator();
                while (it.hasNext()) {
                    if (((Section) it.next()) instanceof BannerSection) {
                        throw new IllegalArgumentException("Banners are only supported in fullscreen SectionedItemTemplates");
                    }
                }
            }
        }
        boolean zIsLoading = sectionedItemTemplate.isLoading();
        Header header = sectionedItemTemplate.getHeader();
        byte[] bArr = null;
        fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
        List<Section<?>> sections2 = sectionedItemTemplate.getSections();
        sections2.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(sections2, 10));
        Iterator<T> it2 = sections2.iterator();
        while (true) {
            int i2 = 3;
            if (!it2.hasNext()) {
                List<Action> actions = sectionedItemTemplate.getActions();
                actions.getClass();
                ArrayList arrayList2 = new ArrayList(woy.bp(actions, 10));
                for (Action action : actions) {
                    action.getClass();
                    arrayList2.add(fvl.c(action, geuVar2, i(geuVar2), null, false, 12));
                    geuVar2 = geuVar;
                }
                int alphabeticalIndexingStrategy = sectionedItemTemplate.getAlphabeticalIndexingStrategy();
                if (alphabeticalIndexingStrategy == 1) {
                    i2 = 2;
                } else if (alphabeticalIndexingStrategy != 2) {
                    i2 = 1;
                }
                return new hay(zIsLoading, fzgVarJ, arrayList, arrayList2, i2, k(sectionedItemTemplate.getScrollStatePersistenceStrategy()), null, false, BitmapDescriptorFactory.HUE_RED, 448);
            }
            Section section = (Section) it2.next();
            section.getClass();
            if (section instanceof RowSection) {
                RowSection rowSection = (RowSection) section;
                int initialSelectedIndex = rowSection.getInitialSelectedIndex();
                afbe afbeVar = afbe.a;
                xs<Row> itemsDelegate = rowSection.getItemsDelegate();
                CarText title = rowSection.getTitle();
                hat hatVarD = (!gcx.g(geuVar2) || (sectionHeader2 = rowSection.getSectionHeader()) == null) ? null : grv.d(sectionHeader2, geuVar2);
                CarText noItemsMessage = rowSection.getNoItemsMessage();
                uw onItemVisibilityChangedDelegate = rowSection.getOnItemVisibilityChangedDelegate();
                hadVar = new har(title, hatVarD, noItemsMessage, onItemVisibilityChangedDelegate != null ? new guk(geuVar2, onItemVisibilityChangedDelegate, 9, bArr) : null, initialSelectedIndex, afbeVar, itemsDelegate);
            } else if (section instanceof GridSection) {
                GridSection gridSection = (GridSection) section;
                CarText title2 = gridSection.getTitle();
                hat hatVarD2 = (!gcx.g(geuVar2) || (sectionHeader = gridSection.getSectionHeader()) == null) ? null : grv.d(sectionHeader, geuVar2);
                CarText noItemsMessage2 = gridSection.getNoItemsMessage();
                int itemSize = gridSection.getItemSize();
                if (itemSize == 1) {
                    i = 2;
                } else if (itemSize == 2) {
                    i = i2;
                } else if (itemSize == 3) {
                    i = 4;
                } else {
                    if (itemSize != 4) {
                        throw new IllegalArgumentException(a.bp(itemSize, "Invalid GridTemplate item size: "));
                    }
                    i2 = 5;
                    i = i2;
                }
                int itemImageShape = gridSection.getItemImageShape();
                int i3 = (itemImageShape == 1 || itemImageShape != 2) ? 1 : 2;
                afbe afbeVar2 = afbe.a;
                xs<GridItem> itemsDelegate2 = gridSection.getItemsDelegate();
                uw onItemVisibilityChangedDelegate2 = gridSection.getOnItemVisibilityChangedDelegate();
                hadVar = new hal(title2, hatVarD2, noItemsMessage2, i, i3, onItemVisibilityChangedDelegate2 != null ? new guk(geuVar2, onItemVisibilityChangedDelegate2, 8, bArr) : null, afbeVar2, itemsDelegate2);
            } else if (section instanceof ChipSection) {
                if (gcx.g(geuVar2)) {
                    ChipSection chipSection = (ChipSection) section;
                    CarText title3 = chipSection.getTitle();
                    ChipStyle style = chipSection.getStyle();
                    haj hajVarD = style != null ? gnz.d(style) : null;
                    afbe afbeVar3 = afbe.a;
                    xs<Chip> itemsDelegate3 = chipSection.getItemsDelegate();
                    SectionHeader sectionHeader3 = chipSection.getSectionHeader();
                    hat hatVarD3 = sectionHeader3 != null ? grv.d(sectionHeader3, geuVar2) : null;
                    uw onItemVisibilityChangedDelegate3 = chipSection.getOnItemVisibilityChangedDelegate();
                    hadVar = new hai(title3, hajVarD, onItemVisibilityChangedDelegate3 != null ? new guk(geuVar2, onItemVisibilityChangedDelegate3, 7, bArr) : null, afbeVar3, itemsDelegate3, hatVarD3);
                } else {
                    hadVar = null;
                }
                if (hadVar == null) {
                    throw new IllegalArgumentException("ChipSection is only supported in API 9 and above.");
                }
            } else if (section instanceof SpotlightSection) {
                if (gcx.g(geuVar2)) {
                    SpotlightSection spotlightSection = (SpotlightSection) section;
                    CarText title4 = spotlightSection.getTitle();
                    SectionHeader sectionHeader4 = spotlightSection.getSectionHeader();
                    hat hatVarD4 = sectionHeader4 != null ? grv.d(sectionHeader4, geuVar2) : null;
                    CarIcon image = spotlightSection.getImage();
                    ghw ghwVar = ghw.a;
                    ghv ghvVar = ghv.a;
                    ghvVar.getClass();
                    gag gagVarA = gai.a(image, geuVar2, ghwVar, ghvVar, null, 8);
                    afbe afbeVar4 = afbe.a;
                    xs<CondensedItem> itemsDelegate4 = spotlightSection.getItemsDelegate();
                    uw onItemVisibilityChangedDelegate4 = spotlightSection.getOnItemVisibilityChangedDelegate();
                    hadVar = new hba(title4, gagVarA, hatVarD4, onItemVisibilityChangedDelegate4 != null ? new guk(geuVar2, onItemVisibilityChangedDelegate4, 11, bArr) : null, afbeVar4, itemsDelegate4);
                } else {
                    hadVar = null;
                }
                if (hadVar == null) {
                    throw new IllegalArgumentException("SpotlightSection is only supported in API 9 and above.");
                }
            } else if (section instanceof CondensedSection) {
                if (gcx.g(geuVar2)) {
                    CondensedSection condensedSection = (CondensedSection) section;
                    CarText title5 = condensedSection.getTitle();
                    gcs gcsVarF = title5 != null ? fzo.f(title5) : null;
                    CarText noItemsMessage3 = condensedSection.getNoItemsMessage();
                    gcs gcsVarF2 = noItemsMessage3 != null ? fzo.f(noItemsMessage3) : null;
                    xs<CondensedItem> itemsDelegate5 = condensedSection.getItemsDelegate();
                    SectionHeader sectionHeader5 = condensedSection.getSectionHeader();
                    hat hatVarD5 = sectionHeader5 != null ? grv.d(sectionHeader5, geuVar2) : null;
                    uw onItemVisibilityChangedDelegate5 = condensedSection.getOnItemVisibilityChangedDelegate();
                    hadVar = new hag(gcsVarF, gcsVarF2, itemsDelegate5, hatVarD5, onItemVisibilityChangedDelegate5 != null ? new guk(geuVar2, onItemVisibilityChangedDelegate5, 6, bArr) : null, 8);
                } else {
                    hadVar = null;
                }
                if (hadVar == null) {
                    throw new IllegalArgumentException("CondensedSection is only supported in API 9 and above.");
                }
            } else {
                if (!(section instanceof BannerSection)) {
                    Objects.toString(section);
                    throw new IllegalArgumentException("Unknown section type: ".concat(section.toString()));
                }
                if (gcx.g(geuVar2)) {
                    BannerSection bannerSection = (BannerSection) section;
                    afbe afbeVar5 = afbe.a;
                    xs<Banner> itemsDelegate6 = bannerSection.getItemsDelegate();
                    SectionHeader sectionHeader6 = bannerSection.getSectionHeader();
                    hadVar = new had(afbeVar5, itemsDelegate6, sectionHeader6 != null ? grv.d(sectionHeader6, geuVar2) : null);
                } else {
                    hadVar = null;
                }
                if (hadVar == null) {
                    throw new IllegalArgumentException("BannerSection is only supported in API 9 and above.");
                }
            }
            arrayList.add(hadVar);
        }
    }

    public static final boolean i(geu geuVar) {
        return ((ggk) geuVar.F(ggk.class)).f();
    }

    public static final int j(geu geuVar) {
        return geuVar.i().c() >= 8 ? 2 : 1;
    }

    public static final int k(int i) {
        return i == 1 ? 2 : 1;
    }
}
