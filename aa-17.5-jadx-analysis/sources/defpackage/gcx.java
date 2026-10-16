package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class gcx {
    public static final void a(cfy cfyVar, gcz gczVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1184298125);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(gczVar) : buxVarC.E(gczVar)) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            ctp ctpVarA = avv.a(atd.g(gjk.f.k), cfl.n, buxVarC, 48);
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
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            fzp fzpVar = gczVar.e;
            if (fzpVar == null) {
                buxVarC.v(-1276334888);
            } else {
                buxVarC.v(-1980834743);
                gvq.g(fzpVar, awd.i(cfy.e, 128.0f), buxVarC, 56, 0);
            }
            bvvVar.Y(false);
            c(gczVar, cfl.j, buxVarC, ((i2 >> 3) & 14) | 56);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(cfyVar, gczVar, i, i4);
        }
    }

    public static final void b(cfy cfyVar, gcz gczVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1846306783);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(gczVar) : buxVarC.E(gczVar)) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfy cfyVarU = awd.u(cfyVar, cfl.e, 2);
            asx asxVarG = atd.g(gjk.d.k);
            cfm cfmVar = cfl.k;
            ctp ctpVarA = atp.a(asxVarG, cfmVar, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarU);
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
            fzp fzpVar = gczVar.e;
            if (fzpVar == null) {
                buxVarC.v(-1680652874);
            } else {
                buxVarC.v(-192761941);
                gvq.g(fzpVar, awd.i(cfy.e, 96.0f), buxVarC, 56, 0);
            }
            bvvVar.Y(false);
            c(gczVar, cfmVar, buxVarC, ((i2 >> 3) & 14) | 56);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(cfyVar, gczVar, i, 17);
        }
    }

    public static final void c(gcz gczVar, cfm cfmVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        bux buxVar3;
        bvv bvvVar;
        boolean z;
        bux buxVarC = buxVar.c(-519138036);
        if ((i & 6) == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(gczVar) : buxVarC.E(gczVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfmVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            asx asxVarG = atd.g(gjk.a.k);
            cfv cfvVar = cfy.e;
            ctp ctpVarA = atp.a(asxVarG, cfmVar, buxVarC, (((i2 << 3) & 896) >> 3) & 112);
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfvVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            gcq gcqVar = gczVar.b;
            if (gcqVar != null) {
                buxVarC.v(-741209964);
                dfw dfwVar = czz.av(buxVarC).d;
                bvvVar = bvvVar2;
                z = false;
                fzc.g(gcqVar, null, 0, 0, 0L, dfwVar, 0L, null, 0, 0, null, null, null, false, false, buxVarC, 8, 0, 65502);
                buxVar3 = buxVarC;
                bvvVar.Y(false);
            } else {
                buxVar3 = buxVarC;
                bvvVar = bvvVar2;
                z = false;
                buxVar3.v(-741136928);
                bvvVar.Y(false);
            }
            buxVar3.v(945923971);
            Iterator it = gczVar.c.iterator();
            while (it.hasNext()) {
                bux buxVar4 = buxVar3;
                fzc.g((gcq) it.next(), null, 0, 0, czz.at(buxVar3).s, czz.av(buxVar3).l, 0L, null, 0, 0, null, null, null, false, false, buxVar4, 8, 0, 65486);
                buxVar3 = buxVar4;
            }
            buxVar2 = buxVar3;
            bvvVar.Y(z);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(gczVar, cfmVar, i, 14, null);
        }
    }

    public static final void d(cfy cfyVar, gcz gczVar, bux buxVar, int i) {
        Object next;
        int i2 = i & 6;
        bux buxVarC = buxVar.c(513297563);
        int i3 = i2 == 0 ? (true != buxVarC.C(cfyVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? buxVarC.C(gczVar) : buxVarC.E(gczVar)) ? 16 : 32;
        }
        if (buxVarC.I((i3 & 19) != 18, i3 & 1)) {
            int i4 = (i3 & 112) | 64;
            cfy cfyVarC = awd.c(asl.J(cfyVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gjk.e.k), 1.0f);
            ctp ctpVarA = atp.a(atd.h, cfl.j, buxVarC, 6);
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
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            if (gczVar.a == null) {
                buxVarC.v(-1803078281);
                b(asl.I(awd.b(awd.r(cfy.e), 0.5f), gjk.i.k, BitmapDescriptorFactory.HUE_RED), gczVar, buxVarC, i4);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1802919499);
                a(asl.I(awd.b(awd.r(cfy.e), 0.5f), gjk.i.k, BitmapDescriptorFactory.HUE_RED), gczVar, buxVarC, i4);
                bvvVar.Y(false);
            }
            List list = gczVar.d;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (f((fwm) next)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            final fwm fwmVar = (fwm) next;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!f((fwm) obj)) {
                    arrayList.add(obj);
                }
            }
            final List listCd = woy.cd(arrayList, 2);
            final List listBR = woy.bR(arrayList, 2);
            czz.am(fwg.a.b(fwf.d), bxc.i(824092753, true, new afeg() { // from class: gcw
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    bux buxVar2 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    int i5 = iIntValue & 3;
                    if (buxVar2.I(i5 != 2, iIntValue & 1)) {
                        cfv cfvVar = cfy.e;
                        cfy cfyVarR = awd.r(cfvVar);
                        ctp ctpVarA2 = avv.a(atd.a, cfl.n, buxVar2, 48);
                        int iG2 = a.g(buxVar2.b());
                        ccx ccxVarN = buxVar2.N();
                        cfy cfyVarJ2 = bzi.j(buxVar2, cfyVarR);
                        afdr afdrVar2 = cwb.a;
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar2);
                        } else {
                            buxVar2.y();
                        }
                        afeg afegVar = cwb.e;
                        byq.c(buxVar2, ctpVarA2, afegVar);
                        afeg afegVar2 = cwb.d;
                        byq.c(buxVar2, ccxVarN, afegVar2);
                        Integer numValueOf = Integer.valueOf(iG2);
                        afeg afegVar3 = cwb.f;
                        byq.c(buxVar2, numValueOf, afegVar3);
                        afec afecVar = cwb.g;
                        byq.b(buxVar2, afecVar);
                        afeg afegVar4 = cwb.c;
                        byq.c(buxVar2, cfyVarJ2, afegVar4);
                        avy avyVar = avy.a;
                        cfy cfyVarB = avyVar.b(cfvVar, 1.0f, true);
                        asx asxVar = atd.f;
                        cfr cfrVar = cfl.m;
                        ctp ctpVarA3 = avv.a(asxVar, cfrVar, buxVar2, 6);
                        int iG3 = a.g(buxVar2.b());
                        ccx ccxVarN2 = buxVar2.N();
                        cfy cfyVarJ3 = bzi.j(buxVar2, cfyVarB);
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar2);
                        } else {
                            buxVar2.y();
                        }
                        List list2 = listCd;
                        byq.c(buxVar2, ctpVarA3, afegVar);
                        byq.c(buxVar2, ccxVarN2, afegVar2);
                        byq.c(buxVar2, Integer.valueOf(iG3), afegVar3);
                        byq.b(buxVar2, afecVar);
                        byq.c(buxVar2, cfyVarJ3, afegVar4);
                        char c = 0;
                        if (list2.size() == 1) {
                            buxVar2.v(1613800867);
                            asl.A(awd.i(cfvVar, 48.0f), buxVar2);
                            buxVar2.o();
                        } else {
                            buxVar2.v(1613868137);
                            buxVar2.o();
                        }
                        buxVar2.v(-1471959931);
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            fwl.a((fwm) it2.next(), null, null, false, null, null, null, null, buxVar2, 8, 254);
                            afdrVar2 = afdrVar2;
                            avyVar = avyVar;
                            asxVar = asxVar;
                            cfrVar = cfrVar;
                            afegVar2 = afegVar2;
                            it2 = it2;
                            afegVar3 = afegVar3;
                            afecVar = afecVar;
                            afegVar4 = afegVar4;
                            c = 0;
                            afegVar = afegVar;
                        }
                        avy avyVar2 = avyVar;
                        afeg afegVar5 = afegVar2;
                        afec afecVar2 = afecVar;
                        afeg afegVar6 = afegVar3;
                        afeg afegVar7 = afegVar4;
                        cfr cfrVar2 = cfrVar;
                        afdr afdrVar3 = afdrVar2;
                        afeg afegVar8 = afegVar;
                        asx asxVar2 = asxVar;
                        fwm fwmVar2 = fwmVar;
                        buxVar2.o();
                        buxVar2.n();
                        if (fwmVar2 != null) {
                            buxVar2.v(-139652708);
                            fwl.a(fwmVar2, ((ggk) buxVar2.f(ggo.a)).f() ? awd.m(cfvVar, 152.0f) : cfvVar, null, false, null, null, null, null, buxVar2, 8, 252);
                            buxVar2.o();
                        } else {
                            buxVar2.v(-139298099);
                            buxVar2.o();
                        }
                        cfy cfyVarB2 = avyVar2.b(cfvVar, 1.0f, true);
                        ctp ctpVarA4 = avv.a(asxVar2, cfrVar2, buxVar2, 6);
                        int iG4 = a.g(buxVar2.b());
                        ccx ccxVarN3 = buxVar2.N();
                        cfy cfyVarJ4 = bzi.j(buxVar2, cfyVarB2);
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar3);
                        } else {
                            buxVar2.y();
                        }
                        List list3 = listBR;
                        byq.c(buxVar2, ctpVarA4, afegVar8);
                        byq.c(buxVar2, ccxVarN3, afegVar5);
                        byq.c(buxVar2, Integer.valueOf(iG4), afegVar6);
                        byq.b(buxVar2, afecVar2);
                        byq.c(buxVar2, cfyVarJ4, afegVar7);
                        buxVar2.v(1312190717);
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            bux buxVar3 = buxVar2;
                            fwl.a((fwm) it3.next(), null, null, false, null, null, null, null, buxVar3, 8, 254);
                            buxVar2 = buxVar3;
                        }
                        buxVar2.o();
                        if (list3.size() == 1) {
                            buxVar2.v(2023362092);
                            asl.A(awd.i(cfvVar, 48.0f), buxVar2);
                            buxVar2.o();
                        } else {
                            buxVar2.v(2023429362);
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
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(cfyVar, gczVar, i, 15);
        }
    }

    public static final void e(gcz gczVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-39983910);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gczVar) : buxVarC.E(gczVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new cil();
                bvvVar.ad(objS);
            }
            cil cilVar = (cil) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new dxi(cilVar, (afck) null, 10);
                bvvVar.ad(objS2);
            }
            bvq.g(gczVar, (afeg) objS2, buxVarC);
            if (gczVar.a == null) {
                buxVarC.v(-1454509311);
                d(bxc.j(cfyVar, cilVar), gczVar, buxVarC, ((i2 << 3) & 112) | 64);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1454429982);
                hkw.g(cfyVar, bxc.i(943157848, true, new bly(gczVar, 14), buxVarC), bxc.i(1136089049, true, new bmc(cilVar, gczVar, 15), buxVarC), buxVarC, ((i2 >> 3) & 14) | 432, 0);
                bvvVar.Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(gczVar, cfyVar, i, 18, null);
        }
    }

    public static final boolean f(fwm fwmVar) {
        fwmVar.getClass();
        fxo fxoVar = fwmVar.b;
        fwy fwyVar = fxoVar instanceof fwy ? (fwy) fxoVar : null;
        if (fwyVar != null && fwyVar.g) {
            return true;
        }
        fwi fwiVar = fwmVar.a;
        gcv gcvVar = fwiVar instanceof gcv ? (gcv) fwiVar : null;
        return gcvVar != null && gcvVar.b;
    }

    public static final boolean g(geu geuVar) {
        geuVar.getClass();
        return geuVar.i().c() >= 9;
    }
}
