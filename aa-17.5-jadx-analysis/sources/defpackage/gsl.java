package defpackage;

import com.google.android.apps.auto.components.apphost.basewidgets.action.ui.ContentActionsViewShim;
import com.google.android.apps.auto.components.apphost.basewidgets.action.ui.MaterialActionButtonView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class gsl implements afeg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gsl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [hju, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [afeg, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        cfy cfyVarA;
        switch (this.b) {
            case 0:
                bux buxVar = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    gux.a((gva) this.a, null, buxVar, 8, 2);
                } else {
                    buxVar.s();
                }
                return afak.a;
            case 1:
                bux buxVar2 = (bux) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (buxVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    Object obj3 = this.a;
                    fwn.f(obj3 != null, 0, 0, bxc.i(-1672429004, true, new bol(obj3, 11), buxVar2), buxVar2, 3072, 6);
                } else {
                    buxVar2.s();
                }
                return afak.a;
            case 2:
                bux buxVar3 = (bux) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (buxVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    gsk gskVar = (gsk) this.a;
                    gsm.a(gskVar.e, gskVar.f ? gcr.a("See Update") : null, gskVar.d, buxVar3, 64);
                } else {
                    buxVar3.s();
                }
                return afak.a;
            case 3:
                bux buxVar4 = (bux) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (buxVar4.I((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    cfr cfrVar = cfl.m;
                    asz aszVar = new asz(gjk.c.k, false, null);
                    cfv cfvVar = cfy.e;
                    ctp ctpVarA = avv.a(aszVar, cfrVar, buxVar4, 48);
                    int iG = a.g(buxVar4.b());
                    ccx ccxVarN = buxVar4.N();
                    cfy cfyVarJ = bzi.j(buxVar4, cfvVar);
                    afdr afdrVar = cwb.a;
                    buxVar4.M();
                    buxVar4.w();
                    if (buxVar4.G()) {
                        buxVar4.j(afdrVar);
                    } else {
                        buxVar4.y();
                    }
                    ?? r0 = this.a;
                    byq.c(buxVar4, ctpVarA, cwb.e);
                    byq.c(buxVar4, ccxVarN, cwb.d);
                    byq.c(buxVar4, Integer.valueOf(iG), cwb.f);
                    byq.b(buxVar4, cwb.g);
                    byq.c(buxVar4, cfyVarJ, cwb.c);
                    r0.invoke(buxVar4, 0);
                    buxVar4.n();
                } else {
                    buxVar4.s();
                }
                return afak.a;
            case 4:
                bux buxVar5 = (bux) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (buxVar5.I((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    gud gudVar = ((gtw) this.a).d;
                    if (gudVar == null) {
                        buxVar5.v(251851158);
                    } else {
                        buxVar5.v(146671563);
                        gvq.g(gudVar, null, buxVar5, gud.a, 1);
                    }
                    buxVar5.o();
                } else {
                    buxVar5.s();
                }
                return afak.a;
            case 5:
                bux buxVar6 = (bux) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (buxVar6.I((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    cfy cfyVarD = awd.d(awd.r(cfy.e), 56.0f);
                    if (((ggk) buxVar6.f(ggo.a)).k()) {
                        buxVar6.v(57345117);
                        cfyVarA = cfyVarD.a(new aix(gum.d(buxVar6), ckq.a));
                        buxVar6.o();
                    } else {
                        buxVar6.v(57400049);
                        cfyVarA = cfyVarD.a(new aix(cjn.m(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2f), ckq.a));
                        buxVar6.o();
                    }
                    float f = gjk.d.k;
                    cfy cfyVarJ2 = asl.J(cfyVarA, f, gjk.b.k, f, gjk.c.k);
                    ctp ctpVarB = atk.b(cfl.a, false);
                    int iG2 = a.g(buxVar6.b());
                    ccx ccxVarN2 = buxVar6.N();
                    cfy cfyVarJ3 = bzi.j(buxVar6, cfyVarJ2);
                    afdr afdrVar2 = cwb.a;
                    buxVar6.M();
                    buxVar6.w();
                    if (buxVar6.G()) {
                        buxVar6.j(afdrVar2);
                    } else {
                        buxVar6.y();
                    }
                    Object obj4 = this.a;
                    byq.c(buxVar6, ctpVarB, cwb.e);
                    byq.c(buxVar6, ccxVarN2, cwb.d);
                    byq.c(buxVar6, Integer.valueOf(iG2), cwb.f);
                    byq.b(buxVar6, cwb.g);
                    byq.c(buxVar6, cfyVarJ3, cwb.c);
                    ((gjt) obj4).m().invoke(buxVar6, 0);
                    buxVar6.n();
                } else {
                    buxVar6.s();
                }
                return afak.a;
            case 6:
                bux buxVar7 = (bux) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (buxVar7.I((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    fzc.h(((gun) this.a).c, null, 0, 0, 0L, dfw.v(czz.av(buxVar7).c, gux.c(buxVar7).T(), 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777214), 0L, null, 0, 0, null, null, null, false, false, buxVar7, 0, 0, 65502);
                } else {
                    buxVar7.s();
                }
                return afak.a;
            case 7:
                return roc.aD(this.a, (bux) obj, ((Integer) obj2).intValue());
            case 8:
                geu geuVar = (geu) obj2;
                obj.getClass();
                geuVar.getClass();
                return this.a.invoke(obj, geuVar);
            case 9:
                return hdd.c((hdy) this.a, (bux) obj, ((Integer) obj2).intValue());
            case 10:
                return hdd.c((hdy) this.a, (bux) obj, ((Integer) obj2).intValue());
            case 11:
                bux buxVar8 = (bux) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (buxVar8.I((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    gax.a.b(0L, ((hec) this.a).b, buxVar8, 384);
                } else {
                    buxVar8.s();
                }
                return afak.a;
            case 12:
                bux buxVar9 = (bux) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (buxVar9.I((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    gax.a.b(0L, ((hee) this.a).b, buxVar9, 384);
                } else {
                    buxVar9.s();
                }
                return afak.a;
            case 13:
                Integer num = (Integer) obj;
                num.intValue();
                Integer num2 = (Integer) obj2;
                num2.intValue();
                this.a.invoke(num, num2);
                return afak.a;
            case 14:
                Integer num3 = (Integer) obj;
                num3.intValue();
                Integer num4 = (Integer) obj2;
                num4.intValue();
                int i = hej.a;
                this.a.invoke(num3, num4);
                return afak.a;
            case 15:
                bux buxVar10 = (bux) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (buxVar10.I((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    ?? r02 = this.a;
                    long j = czz.at(buxVar10).q;
                    dlg dlgVar = (dlg) buxVar10.f(dbc.d);
                    float f2 = gjk.b.k;
                    fzc.g(((hey) r02).a, asl.I(awd.r(awd.n(afp.E(gut.e(cfy.e, r02), czz.at(buxVar10).r, bcr.b(gjk.c.k)), Float.NaN, 720.0f)), gjk.e.k, f2), 1, 0, j, czz.av(buxVar10).j, dlgVar.eI(f2), null, 1, 3, null, null, null, false, false, buxVar10, 100663688, 0, 64648);
                } else {
                    buxVar10.s();
                }
                return afak.a;
            case 16:
                bux buxVar11 = (bux) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (buxVar11.I((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    gvq.g(((hez) this.a).a, null, buxVar11, 8, 1);
                } else {
                    buxVar11.s();
                }
                return afak.a;
            case 17:
                bux buxVar12 = (bux) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (buxVar12.I((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    Iterator it = ((hha) this.a).b.iterator();
                    while (it.hasNext()) {
                        hhc.f((hhd) it.next(), null, 1, buxVar12, 392);
                    }
                } else {
                    buxVar12.s();
                }
                return afak.a;
            case 18:
                return roc.aD(this.a, (bux) obj, ((Integer) obj2).intValue());
            case 19:
                bux buxVar13 = (bux) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (buxVar13.I((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    Object obj5 = this.a;
                    ContentActionsViewShim contentActionsViewShim = (ContentActionsViewShim) obj5;
                    hju hjuVarD = contentActionsViewShim.a.d();
                    if (hjuVarD == null) {
                        buxVar13.v(1455170650);
                    } else {
                        buxVar13.v(-1754174329);
                        gvq.g(hjuVarD, bxc.j(cfy.e, contentActionsViewShim.c), buxVar13, 0, 0);
                    }
                    buxVar13.o();
                    afak afakVar = afak.a;
                    boolean zE = buxVar13.E(obj5);
                    Object objG = buxVar13.g();
                    if (zE || objG == buw.a) {
                        objG = new dxi(contentActionsViewShim, (afck) null, 15);
                        buxVar13.x(objG);
                    }
                    bvq.g(afakVar, (afeg) objG, buxVar13);
                } else {
                    buxVar13.s();
                }
                return afak.a;
            default:
                bux buxVar14 = (bux) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                int i2 = iIntValue14 & 3;
                if (buxVar14.I(i2 != 2, iIntValue14 & 1)) {
                    Object obj6 = this.a;
                    czz.am(fwg.a.b((fwf) ((MaterialActionButtonView) obj6).b.a()), bxc.i(-2019064621, true, new juy(obj6, true ? 1 : 0), buxVar14), buxVar14, 56);
                } else {
                    buxVar14.s();
                }
                return afak.a;
        }
    }
}
