package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class nqk implements afeh {
    private final /* synthetic */ int a;

    public /* synthetic */ nqk(int i) {
        this.a = i;
    }

    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2;
        switch (this.a) {
            case 0:
                ats atsVar = (ats) obj;
                bux buxVar = (bux) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                atsVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= true != buxVar.C(atsVar) ? 2 : 4;
                }
                if (buxVar.I((iIntValue & 19) != 18, iIntValue & 1)) {
                    ca.bb(dao.b(R.drawable.gs_swipe_down_vd_theme_24, buxVar, 0), null, awd.i(ats.a(cfy.e, cfl.k), 46.0f), null, null, BitmapDescriptorFactory.HUE_RED, new cjp(kfn.i(buxVar).s(), 5), buxVar, 56, 56);
                } else {
                    buxVar.s();
                }
                break;
            case 1:
                nko nkoVar = (nko) obj;
                bux buxVar2 = (bux) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                nkoVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= true != buxVar2.A(nkoVar.ordinal()) ? 2 : 4;
                }
                if (buxVar2.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    lws.x((String) nkoVar.g.invoke(buxVar2, 0), null, cjv.h(ksp.j(krr.D, buxVar2), true != nkoVar.h ? 0.5f : 1.0f), buxVar2, 0);
                } else {
                    buxVar2.s();
                }
                break;
            case 2:
                bux buxVar3 = (bux) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((avx) obj).getClass();
                if (!buxVar3.I((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    buxVar3.s();
                }
                break;
            case 3:
                bux buxVar4 = (bux) obj2;
                ((Integer) obj3).intValue();
                yph yphVar = nxm.a;
                ((bii) obj).getClass();
                buxVar4.v(1770983587);
                cfy cfyVarF = awx.f();
                buxVar4.o();
                break;
            case 4:
                bux buxVar5 = (bux) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((avx) obj).getClass();
                if (buxVar5.I((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    cfv cfvVar = cfy.e;
                    ksc kscVar = nlw.a;
                    cfy cfyVarE = afp.E(awd.i(cfvVar, 32.0f), ksp.j(krr.a, buxVar5), bcr.a);
                    ctp ctpVarB = atk.b(cfl.e, false);
                    int iG = a.g(buxVar5.b());
                    ccx ccxVarN = buxVar5.N();
                    cfy cfyVarJ = bzi.j(buxVar5, cfyVarE);
                    afdr afdrVar = cwb.a;
                    buxVar5.M();
                    buxVar5.w();
                    if (buxVar5.G()) {
                        buxVar5.j(afdrVar);
                    } else {
                        buxVar5.y();
                    }
                    byq.c(buxVar5, ctpVarB, cwb.e);
                    byq.c(buxVar5, ccxVarN, cwb.d);
                    byq.c(buxVar5, Integer.valueOf(iG), cwb.f);
                    byq.b(buxVar5, cwb.g);
                    byq.c(buxVar5, cfyVarJ, cwb.c);
                    vja.j(dao.b(R.drawable.gs_spark_vd_theme_24, buxVar5, 0), awd.i(cfvVar, 16.0f), ksp.j(krr.b, buxVar5), buxVar5, 440, 0);
                    buxVar5.n();
                } else {
                    buxVar5.s();
                }
                break;
            case 5:
                agc agcVar = (agc) obj;
                bux buxVar6 = (bux) obj2;
                ((Integer) obj3).intValue();
                agcVar.getClass();
                buxVar6.v(1900332283);
                Object afrVar = (agcVar.f() == nym.a && agcVar.g() == nym.b) ? new afr(0) : (agcVar.f() == nym.b && agcVar.g() == nym.c) ? new afr(300) : ca.F(200, 0, null, 6);
                buxVar6.o();
                break;
            case 6:
                agc agcVar2 = (agc) obj;
                bux buxVar7 = (bux) obj2;
                ((Integer) obj3).intValue();
                agcVar2.getClass();
                buxVar7.v(1909056087);
                Object objF = agcVar2.f();
                nym nymVar = nym.a;
                Object afrVar2 = (objF == nymVar && agcVar2.g() == nym.b) ? new afr(0) : (agcVar2.f() == nym.b && agcVar2.g() == nym.c) ? ca.F(300, 0, aev.b, 2) : (agcVar2.f() == nymVar && agcVar2.g() == nym.c) ? new afr(0) : new afr(200);
                buxVar7.o();
                break;
            case 7:
                agc agcVar3 = (agc) obj;
                bux buxVar8 = (bux) obj2;
                ((Integer) obj3).intValue();
                agcVar3.getClass();
                buxVar8.v(-1515089610);
                Object objF2 = agcVar3.f();
                nym nymVar2 = nym.a;
                Object afrVar3 = (objF2 == nymVar2 && agcVar3.g() == nym.b) ? new afr(0) : (agcVar3.f() == nym.b && agcVar3.g() == nym.c) ? ca.F(300, 0, aev.b, 2) : (agcVar3.f() == nymVar2 && agcVar3.g() == nym.c) ? new afr(0) : new afr(200);
                buxVar8.o();
                break;
            case 8:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                ygr ygrVar = oal.a;
                if (!zBooleanValue || (!zBooleanValue2 && !zBooleanValue3)) {
                    i = 1;
                }
                break;
            case 9:
                bux buxVar9 = (bux) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((avx) obj).getClass();
                if (buxVar9.I((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    brp.b(vq.e(R.string.widget_limit_reached_ok, buxVar9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar9, 0, 0, 262142);
                } else {
                    buxVar9.s();
                }
                break;
            case 10:
                bux buxVar10 = (bux) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((avx) obj).getClass();
                if (buxVar10.I((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    cfr cfrVar = cfl.n;
                    cfv cfvVar2 = cfy.e;
                    ctp ctpVarA = avv.a(atd.a, cfrVar, buxVar10, 48);
                    int iG2 = a.g(buxVar10.b());
                    ccx ccxVarN2 = buxVar10.N();
                    cfy cfyVarJ2 = bzi.j(buxVar10, cfvVar2);
                    afdr afdrVar2 = cwb.a;
                    buxVar10.M();
                    buxVar10.w();
                    if (buxVar10.G()) {
                        buxVar10.j(afdrVar2);
                    } else {
                        buxVar10.y();
                    }
                    byq.c(buxVar10, ctpVarA, cwb.e);
                    byq.c(buxVar10, ccxVarN2, cwb.d);
                    byq.c(buxVar10, Integer.valueOf(iG2), cwb.f);
                    byq.b(buxVar10, cwb.g);
                    byq.c(buxVar10, cfyVarJ2, cwb.c);
                    boc.a(dao.b(R.drawable.gs_add_vd_theme_24, buxVar10, 0), null, asl.J(cfvVar2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gjk.b.k, BitmapDescriptorFactory.HUE_RED), 0L, buxVar10, 56, 8);
                    brp.b(vq.e(R.string.add, buxVar10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, dfw.v(czz.av(buxVar10).m, 0L, 0L, die.l, null, dao.k(dao.j(R.font.google_sans_text)), null, 0L, null, 0, 0, 0L, null, null, 16777179), buxVar10, 0, 0, 131070);
                    buxVar10.n();
                } else {
                    buxVar10.s();
                }
                break;
            case 11:
                bux buxVar11 = (bux) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((avx) obj).getClass();
                if (buxVar11.I((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    brp.b(vq.e(R.string.remove_widget_dialog_remove, buxVar11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar11, 0, 0, 262142);
                } else {
                    buxVar11.s();
                }
                break;
            case 12:
                bux buxVar12 = (bux) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((avx) obj).getClass();
                if (buxVar12.I((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    brp.b(vq.e(R.string.remove_widget_dialog_cancel, buxVar12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar12, 0, 0, 262142);
                } else {
                    buxVar12.s();
                }
                break;
            case 13:
                bux buxVar13 = (bux) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((avx) obj).getClass();
                if (buxVar13.I((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    boc.a(dao.b(R.drawable.gs_pen_spark_vd_theme_24, buxVar13, 0), null, null, 0L, buxVar13, 56, 12);
                    asl.A(awd.m(cfy.e, gjk.b.k), buxVar13);
                    brp.b(vq.e(R.string.create, buxVar13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar13, 0, 0, 262142);
                } else {
                    buxVar13.s();
                }
                break;
            case 14:
                bux buxVar14 = (bux) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((avx) obj).getClass();
                if (buxVar14.I((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    boc.a(dao.b(R.drawable.gs_add_vd_theme_24, buxVar14, 0), null, null, 0L, buxVar14, 56, 12);
                    asl.A(awd.m(cfy.e, gjk.b.k), buxVar14);
                    brp.b(vq.e(R.string.add, buxVar14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar14, 0, 0, 262142);
                } else {
                    buxVar14.s();
                }
                break;
            case 15:
                bux buxVar15 = (bux) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((tiw) obj).getClass();
                if (!buxVar15.I((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    buxVar15.s();
                }
                break;
        }
        return tia.a((tjb) obj, (bux) obj2, ((Integer) obj3).intValue());
    }
}
