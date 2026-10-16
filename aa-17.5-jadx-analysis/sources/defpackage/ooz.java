package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final /* synthetic */ class ooz implements afeg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ bym d;
    public final /* synthetic */ bym e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ bym i;
    public final /* synthetic */ Object j;
    private final /* synthetic */ int k;

    public /* synthetic */ ooz(afdr afdrVar, AppWidgetProviderInfo appWidgetProviderInfo, afec afecVar, bwq bwqVar, bwq bwqVar2, List list, axr axrVar, List list2, bwq bwqVar3, kwp kwpVar, int i) {
        this.k = i;
        this.a = afdrVar;
        this.b = appWidgetProviderInfo;
        this.c = afecVar;
        this.d = bwqVar;
        this.e = bwqVar2;
        this.f = list;
        this.g = axrVar;
        this.h = list2;
        this.i = bwqVar3;
        this.j = kwpVar;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bwq, bym] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [bwq, bym] */
    /* JADX WARN: Type inference failed for: r7v5, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [bwq, bym] */
    /* JADX WARN: Type inference failed for: r9v0, types: [afec, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.k != 0) {
            cqu cquVar = (cqu) obj;
            cquVar.getClass();
            cquVar.b();
            float fFloatValue = ((Number) this.g.a()).floatValue() + Float.intBitsToFloat((int) (((cja) obj2).a & 4294967295L));
            bym bymVar = this.d;
            mlq.m(bymVar).invoke(Float.valueOf(fFloatValue));
            if (((Number) this.e.a()).intValue() > 0) {
                ?? r5 = this.f;
                ?? r6 = this.j;
                int iG = afpt.g(((Number) this.i.a()).intValue() + afgi.k(fFloatValue / ((Number) r4.a()).intValue()), 0, ((Number) r6.a()).intValue() - 1);
                if (iG != ((Number) r5.a()).intValue()) {
                    ?? r62 = this.a;
                    ?? r7 = this.h;
                    Object obj3 = this.c;
                    mlq.t((axr) this.b, ((Number) r5.a()).intValue(), iG, (afeg) r7.a());
                    mlq.m(bymVar).invoke(Float.valueOf(fFloatValue - ((iG - ((Number) r5.a()).intValue()) * ((Number) r4.a()).intValue())));
                    mlq.n(r62).invoke(Integer.valueOf(iG));
                    ((kwp) obj3).q(9);
                }
            }
            return afak.a;
        }
        bux buxVar = (bux) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
            Object obj4 = this.j;
            final ?? r2 = this.i;
            final ?? r3 = this.h;
            Object obj5 = this.g;
            final ?? r63 = this.f;
            final ?? r72 = this.e;
            final ?? r8 = this.d;
            final ?? r9 = this.c;
            Object obj6 = this.b;
            final ?? r15 = this.a;
            final AppWidgetProviderInfo appWidgetProviderInfo = (AppWidgetProviderInfo) obj6;
            final axr axrVar = (axr) obj5;
            final kwp kwpVar = (kwp) obj4;
            tl.c(awd.c(cfy.e, 1.0f), null, null, null, null, 0, czz.at(buxVar).F, 0L, null, bxc.i(1935013850, true, new afeh() { // from class: ooy
                @Override // defpackage.afeh
                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                    avp avpVar = (avp) obj7;
                    bux buxVar2 = (bux) obj8;
                    int iIntValue2 = ((Integer) obj9).intValue();
                    avpVar.getClass();
                    if ((iIntValue2 & 6) == 0) {
                        iIntValue2 |= true != buxVar2.C(avpVar) ? 2 : 4;
                    }
                    if (buxVar2.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                        cfv cfvVar = cfy.e;
                        cfy cfyVarG = asl.G(awd.c(cfvVar, 1.0f), avpVar);
                        ctp ctpVarA = atp.a(atd.c, cfl.j, buxVar2, 0);
                        int iG2 = a.g(buxVar2.b());
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
                        bwq bwqVar = r8;
                        afdr afdrVar2 = r15;
                        afeg afegVar = cwb.e;
                        byq.c(buxVar2, ctpVarA, afegVar);
                        afeg afegVar2 = cwb.d;
                        byq.c(buxVar2, ccxVarN, afegVar2);
                        Integer numValueOf = Integer.valueOf(iG2);
                        afeg afegVar3 = cwb.f;
                        byq.c(buxVar2, numValueOf, afegVar3);
                        afec afecVar = cwb.g;
                        byq.b(buxVar2, afecVar);
                        afeg afegVar4 = cwb.c;
                        byq.c(buxVar2, cfyVarJ, afegVar4);
                        mva.G(afdrVar2, buxVar2, 0);
                        String strD = mva.D(bwqVar);
                        Object objG = buxVar2.g();
                        Object obj10 = buw.a;
                        if (objG == obj10) {
                            objG = new nzf(bwqVar, 13);
                            buxVar2.x(objG);
                        }
                        final afec afecVar2 = r9;
                        AppWidgetProviderInfo appWidgetProviderInfo2 = appWidgetProviderInfo;
                        afec afecVar3 = (afec) objG;
                        boolean zE = buxVar2.E(appWidgetProviderInfo2) | buxVar2.C(afecVar2);
                        Object objG2 = buxVar2.g();
                        if (zE || objG2 == obj10) {
                            objG2 = new oot(appWidgetProviderInfo2, afecVar2, 5);
                            buxVar2.x(objG2);
                        }
                        bwq bwqVar2 = r72;
                        mva.M(strD, afecVar3, (afdr) objG2, appWidgetProviderInfo2 != null, null, buxVar2, 48);
                        opj opjVarC = mva.C(bwqVar2);
                        cfy cfyVarB = ats.b(cfvVar, 1.0f, true);
                        Object objG3 = buxVar2.g();
                        if (objG3 == obj10) {
                            objG3 = new oin(10);
                            buxVar2.x(objG3);
                        }
                        final bwq bwqVar3 = r2;
                        final List list = r3;
                        final axr axrVar2 = axrVar;
                        final List list2 = r63;
                        ca.V(opjVarC, cfyVarB, (afec) objG3, null, null, null, bxc.i(1758415506, true, new afei() { // from class: oox
                            @Override // defpackage.afei
                            public final Object invoke(Object obj11, Object obj12, Object obj13, Object obj14) {
                                opj opjVar = (opj) obj12;
                                bux buxVar3 = (bux) obj13;
                                int iIntValue3 = ((Integer) obj14).intValue();
                                ((abg) obj11).getClass();
                                opjVar.getClass();
                                if ((iIntValue3 & 48) == 0) {
                                    iIntValue3 |= true != buxVar3.A(opjVar.ordinal()) ? 16 : 32;
                                }
                                if (buxVar3.I((iIntValue3 & 145) != 144, iIntValue3 & 1)) {
                                    cfy cfyVarC = awd.c(cfy.e, 1.0f);
                                    ctp ctpVarB = atk.b(cfl.b, false);
                                    int iG3 = a.g(buxVar3.b());
                                    ccx ccxVarN2 = buxVar3.N();
                                    cfy cfyVarJ2 = bzi.j(buxVar3, cfyVarC);
                                    afdr afdrVar3 = cwb.a;
                                    buxVar3.M();
                                    buxVar3.w();
                                    if (buxVar3.G()) {
                                        buxVar3.j(afdrVar3);
                                    } else {
                                        buxVar3.y();
                                    }
                                    afec afecVar4 = afecVar2;
                                    byq.c(buxVar3, ctpVarB, cwb.e);
                                    byq.c(buxVar3, ccxVarN2, cwb.d);
                                    byq.c(buxVar3, Integer.valueOf(iG3), cwb.f);
                                    byq.b(buxVar3, cwb.g);
                                    byq.c(buxVar3, cfyVarJ2, cwb.c);
                                    if (opjVar == opj.b) {
                                        bwq bwqVar4 = bwqVar3;
                                        buxVar3.v(-598407161);
                                        Set set = (Set) bwqVar4.a();
                                        Object objG4 = buxVar3.g();
                                        if (objG4 == buw.a) {
                                            objG4 = new nzf(bwqVar4, 14);
                                            buxVar3.x(objG4);
                                        }
                                        mva.F(list2, set, (afec) objG4, afecVar4, axrVar2, buxVar3, 384);
                                        buxVar3.o();
                                    } else {
                                        List list3 = list;
                                        buxVar3.v(-598168523);
                                        mva.I(list3, afecVar4, buxVar3, 0);
                                        buxVar3.o();
                                    }
                                    buxVar3.n();
                                } else {
                                    buxVar3.s();
                                }
                                return afak.a;
                            }
                        }, buxVar2), buxVar2, 1573248, 56);
                        cfy cfyVarR = awd.r(cfvVar);
                        float f = gjk.b.k;
                        cfy cfyVarJ2 = asl.J(cfyVarR, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, f);
                        ctp ctpVarB = atk.b(cfl.e, false);
                        int iG3 = a.g(buxVar2.b());
                        ccx ccxVarN2 = buxVar2.N();
                        cfy cfyVarJ3 = bzi.j(buxVar2, cfyVarJ2);
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        kwp kwpVar2 = kwpVar;
                        byq.c(buxVar2, ctpVarB, afegVar);
                        byq.c(buxVar2, ccxVarN2, afegVar2);
                        byq.c(buxVar2, Integer.valueOf(iG3), afegVar3);
                        byq.b(buxVar2, afecVar);
                        byq.c(buxVar2, cfyVarJ3, afegVar4);
                        opj opjVarC2 = mva.C(bwqVar2);
                        boolean zE2 = buxVar2.E(kwpVar2);
                        Object objG4 = buxVar2.g();
                        byte[] bArr = null;
                        if (zE2 || objG4 == obj10) {
                            objG4 = new nje(kwpVar2, bwqVar2, 10, bArr);
                            buxVar2.x(objG4);
                        }
                        mva.N(opjVarC2, (afec) objG4, null, buxVar2, 0);
                        buxVar2.n();
                        buxVar2.n();
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVar), buxVar, 805306374, 446);
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    public /* synthetic */ ooz(axr axrVar, kwp kwpVar, bym bymVar, bym bymVar2, bym bymVar3, bym bymVar4, bym bymVar5, bym bymVar6, bym bymVar7, bym bymVar8, int i) {
        this.k = i;
        this.b = axrVar;
        this.c = kwpVar;
        this.g = bymVar;
        this.d = bymVar2;
        this.e = bymVar3;
        this.i = bymVar4;
        this.j = bymVar5;
        this.f = bymVar6;
        this.h = bymVar7;
        this.a = bymVar8;
    }
}
