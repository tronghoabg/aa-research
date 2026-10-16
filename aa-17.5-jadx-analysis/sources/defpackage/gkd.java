package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.SectionedItemList;
import com.android.car.libraries.apphost.internal.model.GoogleListTemplate;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class gkd {
    public static final gmp a(ListTemplate listTemplate) {
        listTemplate.getClass();
        boolean zIsLoading = listTemplate.isLoading();
        ItemList singleList = listTemplate.getSingleList();
        List<SectionedItemList> sectionedLists = listTemplate.getSectionedLists();
        sectionedLists.getClass();
        List<Action> actions = listTemplate.getActions();
        actions.getClass();
        gmp gmpVar = new gmp(zIsLoading, singleList, sectionedLists, actions, listTemplate.getHeader());
        gka.b(gmpVar, listTemplate);
        return gmpVar;
    }

    public static final gmp b(GoogleListTemplate googleListTemplate) {
        googleListTemplate.getClass();
        gmp gmpVar = new gmp(googleListTemplate.getIsLoading(), googleListTemplate.getSingleList(), googleListTemplate.getSectionedLists(), googleListTemplate.getActions(), googleListTemplate.getHeader());
        gka.b(gmpVar, googleListTemplate);
        return gmpVar;
    }

    public static final void c(gab gabVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(8693722);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gabVar) : buxVarC.E(gabVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            cfv cfvVar = cfy.e;
            bcm bcmVar = gpr.a;
            cfy cfyVarAv = ca.av(awd.l(cjn.g(cfvVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gpr.a, true, 0, 1042431), Float.NaN, 184.0f, Float.NaN, 350.0f), true);
            if (gabVar != null) {
                buxVarC.v(1296981761);
                fxp.c(gabVar, BitmapDescriptorFactory.HUE_RED, cfyVarAv, null, null, null, false, false, null, buxVarC, (i2 & 14) | 440, 1016);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(1297061121);
                gpm.b(cfyVarAv, buxVarC, 6);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(gabVar, i, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final void d(gqc gqcVar, cfy cfyVar, boolean z, bux buxVar, int i) {
        int i2;
        gqc gqcVar2;
        afec afecVar;
        afeg afegVar;
        cfv cfvVar;
        afeg afegVar2;
        ?? r4;
        cfy cfyVar2;
        ?? r13;
        afeg afegVar3;
        int i3;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(335688593);
        if (i4 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gqcVar) : buxVarC.E(gqcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            gpk gpkVar = gqcVar.b;
            aiyk aiykVar = gpkVar.a;
            gfs gfsVar = gey.b;
            bym bymVarD = dyz.d(aiykVar, gfsVar, buxVarC);
            bym bymVarD2 = dyz.d(gpkVar.b, gfsVar, buxVarC);
            bym bymVarD3 = dyz.d(gqcVar.f, null, buxVarC);
            bym bymVarD4 = dyz.d(gqcVar.e, false, buxVarC);
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVarC, 0);
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
            afeg afegVar4 = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar4);
            afeg afegVar5 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar5);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar6 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar6);
            afec afecVar2 = cwb.g;
            byq.b(buxVarC, afecVar2);
            afeg afegVar7 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar7);
            gfa gfaVarAf = a.af(bymVarD);
            int i5 = true != z ? 2 : 1;
            fzc.h(gfaVarAf, null, i5, 0, gux.c(buxVarC).T(), czz.av(buxVarC).d, 0L, null, 0, 0, null, null, null, false, false, buxVarC, 0, 0, 65482);
            buxVarC = buxVarC;
            cfv cfvVar2 = cfy.e;
            cfy cfyVarJ2 = asl.J(awd.r(cfvVar2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ((Boolean) bymVarD4.a()).booleanValue() ? gjk.c.k : 0.0f);
            ctp ctpVarA2 = avv.a(atd.g, cfl.m, buxVarC, 6);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ3 = bzi.j(buxVarC, cfyVarJ2);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA2, afegVar4);
            byq.c(buxVarC, ccxVarAh2, afegVar5);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar6);
            byq.b(buxVarC, afecVar2);
            byq.c(buxVarC, cfyVarJ3, afegVar7);
            avy avyVar = avy.a;
            if (a.af(bymVarD2).a()) {
                buxVarC.v(710180914);
                gfa gfaVarAf2 = a.af(bymVarD2);
                cfy cfyVarJ4 = asl.J(avyVar.a(avyVar.b(cfvVar2, 1.0f, true), crz.b), BitmapDescriptorFactory.HUE_RED, gjk.b.k, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                if (((Boolean) bymVarD4.a()).booleanValue() || z) {
                    afegVar3 = afegVar7;
                    i3 = 1;
                } else {
                    afegVar3 = afegVar7;
                    i3 = 2;
                }
                afecVar = afecVar2;
                afegVar = afegVar6;
                cfvVar = cfvVar2;
                afegVar2 = afegVar3;
                fzc.h(gfaVarAf2, cfyVarJ4, i5, i3, gux.c(buxVarC).U(), czz.av(buxVarC).l, 0L, null, 0, 0, null, null, null, false, false, buxVarC, 0, 0, 65472);
                buxVarC = buxVarC;
                bvvVar.Y(false);
                r4 = 0;
            } else {
                afecVar = afecVar2;
                afegVar = afegVar6;
                cfvVar = cfvVar2;
                afegVar2 = afegVar7;
                if (((Boolean) bymVarD4.a()).booleanValue()) {
                    r4 = 0;
                    buxVarC.v(710873175);
                    bvvVar.Y(false);
                } else {
                    buxVarC.v(710568290);
                    r4 = 0;
                    brp.b("", asl.J(avyVar.a(avyVar.b(cfvVar, 1.0f, true), crz.b), BitmapDescriptorFactory.HUE_RED, gjk.b.k, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), 0L, 0L, null, 0L, null, 0L, 2, false, i5, i5, czz.av(buxVarC).l, buxVarC, 6, 384, 77820);
                    buxVarC = buxVarC;
                    bvvVar.Y(false);
                }
            }
            gab gabVarAe = a.ae(bymVarD3);
            if (gabVarAe == null) {
                buxVarC.v(710917659);
                bvvVar.Y(r4);
                cfyVar2 = null;
                r13 = 1;
            } else {
                buxVarC.v(710917660);
                cfy cfyVarJ5 = asl.J(cfvVar, gjk.a.k, gjk.b.k, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                Object objS = bvvVar.S();
                if (objS == buw.a) {
                    objS = new gah(17);
                    bvvVar.ad(objS);
                }
                cfy cfyVarA = cfyVarJ5.a(new aws(new izj((afec) objS, null)));
                ctp ctpVarB = atk.b(cfl.a, r4);
                int iG3 = a.g(bvvVar.u);
                ccx ccxVarAh3 = bvvVar.ah();
                cfy cfyVarJ6 = bzi.j(buxVarC, cfyVarA);
                buxVarC.w();
                if (bvvVar.t) {
                    buxVarC.j(afdrVar);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarB, afegVar4);
                byq.c(buxVarC, ccxVarAh3, afegVar5);
                byq.c(buxVarC, Integer.valueOf(iG3), afegVar);
                byq.b(buxVarC, afecVar);
                byq.c(buxVarC, cfyVarJ6, afegVar2);
                float f = gpp.a;
                cfyVar2 = null;
                fxp.c(gabVarAe, BitmapDescriptorFactory.HUE_RED, awd.f(cfvVar, 20.0f), null, null, new cjv(gux.c(buxVarC).v()), false, false, null, buxVarC, 56, 984);
                r13 = 1;
                bvvVar.Y(true);
                bvvVar.Y(r4);
            }
            bvvVar.Y(r13);
            if (((Boolean) bymVarD4.a()).booleanValue()) {
                buxVarC.v(-83824819);
                gqcVar2 = gqcVar;
                gvq.g(gqcVar2.d, cfyVar2, buxVarC, r4, r13);
                bvvVar.Y(r4);
            } else {
                gqcVar2 = gqcVar;
                buxVarC.v(-83780613);
                bvvVar.Y(r4);
            }
            bvvVar.Y(r13);
        } else {
            gqcVar2 = gqcVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gvo((Object) gqcVar2, cfyVar, z, i, 1);
        }
    }

    public static final void e(gqc gqcVar, gpn gpnVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1922947562);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gqcVar) : buxVarC.E(gqcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.A(gpnVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            bym bymVarD = dyz.d(gqcVar.e, false, buxVarC);
            bym bymVarD2 = dyz.d(gqcVar.b.c, null, buxVarC);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new ncp((byte[]) null);
                bvvVar.ad(objS);
            }
            ncp ncpVar = (ncp) objS;
            gjy.c(a.ae(bymVarD2), gka.f(cfyVar, ncpVar), bxc.i(-2109846746, true, new gps(gqcVar, ncpVar, gpnVar, bymVarD2, bymVarD, 0), buxVarC), buxVarC, 392);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw(gqcVar, (Object) gpnVar, cfyVar, i, 19);
        }
    }

    public static final void f(final gqc gqcVar, final gpn gpnVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1177754007);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gqcVar) : buxVarC.E(gqcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.A(gpnVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            final bym bymVarD = dyz.d(gqcVar.e, false, buxVarC);
            final bym bymVarD2 = dyz.d(gqcVar.b.c, null, buxVarC);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new ncp((byte[]) null);
                bvvVar.ad(objS);
            }
            final ncp ncpVar = (ncp) objS;
            gjy.c(a.ae(bymVarD2), gka.f(cfyVar, ncpVar), bxc.i(-1048539949, true, new afeg() { // from class: gpt
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (buxVar2.I((iIntValue & 3) != 2, iIntValue & 1)) {
                        cfv cfvVar = cfy.e;
                        atc atcVar = atd.c;
                        cfm cfmVar = cfl.j;
                        ctp ctpVarA = atp.a(atcVar, cfmVar, buxVar2, 0);
                        int iG = a.g(buxVar2.b());
                        ccx ccxVarN = buxVar2.N();
                        cfy cfyVarJ = bzi.j(buxVar2, cfvVar);
                        afdr afdrVar = cwb.a;
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        ncp ncpVar2 = ncpVar;
                        gqc gqcVar2 = gqcVar;
                        afeg afegVar = cwb.e;
                        byq.c(buxVar2, ctpVarA, afegVar);
                        afeg afegVar2 = cwb.d;
                        byq.c(buxVar2, ccxVarN, afegVar2);
                        Integer numValueOf = Integer.valueOf(iG);
                        afeg afegVar3 = cwb.f;
                        byq.c(buxVar2, numValueOf, afegVar3);
                        afec afecVar = cwb.g;
                        byq.b(buxVar2, afecVar);
                        afeg afegVar4 = cwb.c;
                        byq.c(buxVar2, cfyVarJ, afegVar4);
                        gvq.g(gqcVar2.a, gka.e(cfvVar, ncpVar2), buxVar2, 0, 0);
                        float f = gjk.f.k;
                        cfy cfyVarD = gka.d(ats.b(asl.I(cfvVar, f, gjk.e.k), 1.0f, true), ncpVar2);
                        ctp ctpVarA2 = atp.a(atd.d, cfmVar, buxVar2, 6);
                        int iG2 = a.g(buxVar2.b());
                        ccx ccxVarN2 = buxVar2.N();
                        cfy cfyVarJ2 = bzi.j(buxVar2, cfyVarD);
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        byq.c(buxVar2, ctpVarA2, afegVar);
                        byq.c(buxVar2, ccxVarN2, afegVar2);
                        byq.c(buxVar2, Integer.valueOf(iG2), afegVar3);
                        byq.b(buxVar2, afecVar);
                        byq.c(buxVar2, cfyVarJ2, afegVar4);
                        cfr cfrVar = cfl.o;
                        ctp ctpVarA3 = avv.a(atd.a, cfrVar, buxVar2, 48);
                        int iG3 = a.g(buxVar2.b());
                        ccx ccxVarN3 = buxVar2.N();
                        cfy cfyVarJ3 = bzi.j(buxVar2, cfvVar);
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        byq.c(buxVar2, ctpVarA3, afegVar);
                        byq.c(buxVar2, ccxVarN3, afegVar2);
                        byq.c(buxVar2, Integer.valueOf(iG3), afegVar3);
                        byq.b(buxVar2, afecVar);
                        byq.c(buxVar2, cfyVarJ3, afegVar4);
                        avy avyVar = avy.a;
                        cfy cfyVarC = avyVar.c(avyVar.b(cfvVar, 1.0f, true), cfrVar);
                        ctp ctpVarA4 = atp.a(atcVar, cfmVar, buxVar2, 0);
                        int iG4 = a.g(buxVar2.b());
                        ccx ccxVarN4 = buxVar2.N();
                        cfy cfyVarJ4 = bzi.j(buxVar2, cfyVarC);
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        bym bymVar = bymVarD2;
                        bym bymVar2 = bymVarD;
                        gpn gpnVar2 = gpnVar;
                        byq.c(buxVar2, ctpVarA4, afegVar);
                        byq.c(buxVar2, ccxVarN4, afegVar2);
                        byq.c(buxVar2, Integer.valueOf(iG4), afegVar3);
                        byq.b(buxVar2, afecVar);
                        byq.c(buxVar2, cfyVarJ4, afegVar4);
                        gkd.d(gqcVar2, ats.b(asl.J(cfvVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gjk.d.k), 1.0f, false), gpnVar2 == gpn.a, buxVar2, 0);
                        gqk.k(gqcVar2.c, ncpVar2, null, false, !((Boolean) bymVar2.a()).booleanValue(), 0, buxVar2, 0, 44);
                        buxVar2.n();
                        asl.A(awd.m(cfvVar, f), buxVar2);
                        gkd.c(a.ae(bymVar), buxVar2, 8);
                        buxVar2.n();
                        buxVar2.n();
                        buxVar2.n();
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 392);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw(gqcVar, (Object) gpnVar, cfyVar, i, 20);
        }
    }

    public static final void g(gab gabVar, boolean z, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(172151532);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gabVar) : buxVarC.E(gabVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfv cfvVar = cfy.e;
            bcm bcmVar = gpq.a;
            cfy cfyVarAv = ca.av(awd.l(cjn.g(cfvVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gpq.a, true, 0, 1042431), Float.NaN, 190.0f, Float.NaN, z ? 400.0f : 300.0f), true);
            if (gabVar != null) {
                buxVarC.v(375822703);
                fxp.c(gabVar, BitmapDescriptorFactory.HUE_RED, cfyVarAv, null, null, null, false, false, null, buxVarC, (i2 & 14) | 56, 1016);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(375902063);
                gpm.b(cfyVarAv, buxVarC, 0);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gpv(gabVar, z, i, 1);
        }
    }

    public static final void h(gqc gqcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        boolean z;
        boolean z2;
        cfyVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-860189913);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(gqcVar) : buxVarC.E(gqcVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            gpk gpkVar = gqcVar.b;
            aiyk aiykVar = gpkVar.a;
            gfs gfsVar = gey.b;
            bym bymVarD = dyz.d(aiykVar, gfsVar, buxVarC);
            bym bymVarD2 = dyz.d(gpkVar.b, gfsVar, buxVarC);
            bym bymVarD3 = dyz.d(gqcVar.f, null, buxVarC);
            bym bymVarD4 = dyz.d(gqcVar.e, false, buxVarC);
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVarC, 0);
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
            afeg afegVar = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar4);
            fzc.h(a.af(bymVarD), null, 2, 0, gux.c(buxVarC).T(), czz.av(buxVarC).d, 0L, null, 0, 0, null, null, null, false, false, buxVarC, 384, 0, 65482);
            bux buxVar3 = buxVarC;
            if (a.af(bymVarD2).a()) {
                buxVar3.v(1774547730);
                fzc.h(a.af(bymVarD2), asl.J(cfy.e, BitmapDescriptorFactory.HUE_RED, gjk.b.k, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), 2, true != ((Boolean) bymVarD4.a()).booleanValue() ? 2 : 1, gux.c(buxVar3).U(), czz.av(buxVar3).l, 0L, null, 0, 0, null, null, null, false, false, buxVar3, 384, 0, 65472);
                buxVar3 = buxVar3;
                bvvVar.Y(false);
                z = false;
            } else if (((Boolean) bymVarD4.a()).booleanValue()) {
                z = false;
                buxVar3.v(1775070917);
                bvvVar.Y(false);
            } else {
                buxVar3.v(1774851623);
                z = false;
                brp.b("", asl.J(cfy.e, BitmapDescriptorFactory.HUE_RED, gjk.b.k, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), 0L, 0L, null, 0L, null, 0L, 2, false, 2, 2, czz.av(buxVar3).l, buxVar3, 6, 221568, 77820);
                buxVar3 = buxVar3;
                bvvVar.Y(false);
            }
            gab gabVarAe = a.ae(bymVarD3);
            if (gabVarAe == null) {
                buxVar3.v(1775106504);
                bvvVar.Y(z);
                buxVar2 = buxVar3;
                z2 = true;
            } else {
                buxVar3.v(1775106505);
                cfv cfvVar = cfy.e;
                cfy cfyVarJ2 = asl.J(cfvVar, BitmapDescriptorFactory.HUE_RED, gjk.e.k, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                ctp ctpVarB = atk.b(cfl.a, z);
                int iG2 = a.g(bvvVar.u);
                ccx ccxVarAh2 = bvvVar.ah();
                cfy cfyVarJ3 = bzi.j(buxVar3, cfyVarJ2);
                buxVar3.w();
                if (bvvVar.t) {
                    buxVar3.j(afdrVar);
                } else {
                    buxVar3.y();
                }
                byq.c(buxVar3, ctpVarB, afegVar);
                byq.c(buxVar3, ccxVarAh2, afegVar2);
                byq.c(buxVar3, Integer.valueOf(iG2), afegVar3);
                byq.b(buxVar3, afecVar);
                byq.c(buxVar3, cfyVarJ3, afegVar4);
                float f = gpp.a;
                fxp.c(gabVarAe, BitmapDescriptorFactory.HUE_RED, awd.f(cfvVar, 20.0f), null, null, new cjv(gux.c(buxVar3).v()), false, false, null, buxVar3, 56, 984);
                buxVar2 = buxVar3;
                z2 = true;
                bvvVar.Y(true);
                bvvVar.Y(z);
            }
            bvvVar.Y(z2);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gox(gqcVar, cfyVar, i, 5);
        }
    }

    public static final void i(gqc gqcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1905399840);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(gqcVar) : buxVarC.E(gqcVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarD = dyz.d(gqcVar.e, false, buxVarC);
            bym bymVarD2 = dyz.d(gqcVar.b.c, null, buxVarC);
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVarC, 0);
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
            afeg afegVar = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar);
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
            int i4 = i2;
            cfy cfyVarB = ats.b(cfvVar, 1.0f, true);
            float f = gjk.e.k;
            cfy cfyVarR = awd.r(asl.J(cfyVarB, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f));
            ctp ctpVarA2 = avv.a(atd.g, cfl.n, buxVarC, 54);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarR);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA2, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            h(gqcVar, avy.a.b(cfvVar, 1.0f, true), buxVarC, i4 & 14);
            asl.A(awd.m(cfvVar, f), buxVarC);
            g(a.ae(bymVarD2), false, buxVarC, 56);
            bvvVar.Y(true);
            if (((Boolean) bymVarD.a()).booleanValue()) {
                buxVarC.v(1014707214);
                gvq.g(gqcVar.d, asl.J(cfvVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f), buxVarC, 0, 0);
                bvvVar.Y(false);
            } else {
                buxVarC.v(1014797548);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gox(gqcVar, cfyVar, i, 10);
        }
    }

    public static final void j(gqc gqcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1149853811);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(gqcVar) : buxVarC.E(gqcVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarD = dyz.d(gqcVar.e, false, buxVarC);
            bym bymVarD2 = dyz.d(gqcVar.b.c, null, buxVarC);
            asx asxVar = atd.g;
            ctp ctpVarA = avv.a(asxVar, cfl.o, buxVarC, 54);
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
            afeg afegVar = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar4);
            avy avyVar = avy.a;
            int i4 = i2;
            cfv cfvVar = cfy.e;
            cfy cfyVarB = avyVar.b(cfvVar, 1.0f, true);
            ctp ctpVarA2 = atp.a(asxVar, cfl.j, buxVarC, 6);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarB);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA2, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            cfy cfyVarB2 = ats.b(cfvVar, 1.0f, true);
            ctp ctpVarB = atk.b(cfl.d, false);
            int iG3 = a.g(bvvVar.u);
            ccx ccxVarAh3 = bvvVar.ah();
            cfy cfyVarJ3 = bzi.j(buxVarC, cfyVarB2);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, afegVar);
            byq.c(buxVarC, ccxVarAh3, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG3), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ3, afegVar4);
            h(gqcVar, cfvVar, buxVarC, (i4 & 14) | 48);
            bvvVar.Y(true);
            if (((Boolean) bymVarD.a()).booleanValue()) {
                buxVarC.v(-1520789239);
                gvq.g(gqcVar.d, null, buxVarC, 0, 1);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1520741189);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
            asl.A(awd.m(cfvVar, gjk.e.k), buxVarC);
            g(a.ae(bymVarD2), true, buxVarC, 56);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gox(gqcVar, cfyVar, i, 6);
        }
    }

    public static final void k(gqc gqcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        gqc gqcVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1641479183);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gqcVar) : buxVarC.E(gqcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarD = dyz.d(gqcVar.e, false, buxVarC);
            bym bymVarD2 = dyz.d(gqcVar.b.c, null, buxVarC);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new ncp((byte[]) null);
                bvvVar.ad(objS);
            }
            ncp ncpVar = (ncp) objS;
            gqcVar2 = gqcVar;
            gjy.c(a.ae(bymVarD2), gka.f(cfyVar, ncpVar), bxc.i(-1085557421, true, new brf(gqcVar2, ncpVar, bymVarD, 9, (short[]) null), buxVarC), buxVarC, 392);
        } else {
            gqcVar2 = gqcVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gox(gqcVar2, cfyVar, i, 7);
        }
    }

    public static final void l(gqc gqcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        gqc gqcVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(871430246);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gqcVar) : buxVarC.E(gqcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarD = dyz.d(gqcVar.b.c, null, buxVarC);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new ncp((byte[]) null);
                bvvVar.ad(objS);
            }
            ncp ncpVar = (ncp) objS;
            gqcVar2 = gqcVar;
            gjy.c(a.ae(bymVarD), gka.f(cfyVar, ncpVar), bxc.i(-1278595670, true, new brf(gqcVar2, ncpVar, bymVarD, 10, (short[]) null), buxVarC), buxVarC, 392);
        } else {
            gqcVar2 = gqcVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gox(gqcVar2, cfyVar, i, 8);
        }
    }

    public static final void m(gqc gqcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        gqc gqcVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1975120892);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gqcVar) : buxVarC.E(gqcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarD = dyz.d(gqcVar.e, false, buxVarC);
            bym bymVarD2 = dyz.d(gqcVar.b.c, null, buxVarC);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new ncp((byte[]) null);
                bvvVar.ad(objS);
            }
            ncp ncpVar = (ncp) objS;
            gqcVar2 = gqcVar;
            gjy.c(a.ae(bymVarD2), gka.f(cfyVar, ncpVar), bxc.i(736652096, true, new brf(gqcVar2, ncpVar, bymVarD, 11, (short[]) null), buxVarC), buxVarC, 392);
        } else {
            gqcVar2 = gqcVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gox(gqcVar2, cfyVar, i, 9);
        }
    }

    public static final void n(gqc gqcVar, ncp ncpVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1506720594);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gqcVar) : buxVarC.E(gqcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(ncpVar) : buxVarC.E(ncpVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            bym bymVarD = dyz.d(gqcVar.e, false, buxVarC);
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVarC, 0);
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
            afeg afegVar = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar);
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
            cfy cfyVarB = ats.b(cfvVar, 1.0f, true);
            ctp ctpVarB = atk.b(cfl.d, false);
            int i4 = i2;
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarB);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            h(gqcVar, cfvVar, buxVarC, (i4 & 14) | 48);
            bvvVar.Y(true);
            if (((Boolean) bymVarD.a()).booleanValue()) {
                buxVarC.v(-665624528);
                gvq.g(gqcVar.d, null, buxVarC, 0, 1);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-665580322);
                bvvVar.Y(false);
            }
            gqk.k(gqcVar.c, ncpVar, asl.J(cfvVar, BitmapDescriptorFactory.HUE_RED, gjk.e.k, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), false, !((Boolean) bymVarD.a()).booleanValue(), 0, buxVarC, i4 & 112, 40);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw(gqcVar, (Object) ncpVar, cfyVar, i, 18);
        }
    }
}
