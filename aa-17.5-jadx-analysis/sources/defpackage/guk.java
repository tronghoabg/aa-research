package defpackage;

import android.content.Context;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class guk implements afeg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ guk(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v94, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v61, types: [asw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v93, types: [avp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v80, types: [asf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.Object, uw] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object, uw] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Object, uw] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object, uw] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object, uw] */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.lang.Object, uw] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        bcm bcmVar;
        bux buxVar;
        int i = 8;
        byte[] bArr = null;
        boolean z = true;
        switch (this.c) {
            case 0:
                bux buxVar2 = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (buxVar2.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    Object obj3 = this.b;
                    ?? r1 = this.a;
                    dfw dfwVarV = dfw.v(czz.av(buxVar2).l, gux.c(buxVar2).T(), 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777214);
                    float f = ((guz) ((gjt) obj3).c).j;
                    fzc.h(r1, null, 0, 0, 0L, dfwVarV, 0L, null, 0, 0, null, new dlj(36.0f), null, false, false, buxVar2, 0, 0, 63454);
                } else {
                    buxVar2.s();
                }
                break;
            case 1:
                bux buxVar3 = (bux) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (buxVar3.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    Object obj4 = this.b;
                    ?? r0 = this.a;
                    int i2 = ((gud) obj4).k;
                    cfm cfmVar = cfl.k;
                    int i3 = i2 - 1;
                    cfy cfyVarR = r0;
                    if (i3 == 1) {
                        cfyVarR = awd.r(r0);
                    } else if (i3 == 2) {
                        cfyVarR = awd.v(r0, false, 3);
                    }
                    ctp ctpVarA = atp.a(atd.c, cfmVar, buxVar3, 48);
                    int iG = a.g(buxVar3.b());
                    ccx ccxVarN = buxVar3.N();
                    cfy cfyVarJ = bzi.j(buxVar3, cfyVarR);
                    afdr afdrVar = cwb.a;
                    buxVar3.M();
                    buxVar3.w();
                    if (buxVar3.G()) {
                        buxVar3.j(afdrVar);
                    } else {
                        buxVar3.y();
                    }
                    byq.c(buxVar3, ctpVarA, cwb.e);
                    byq.c(buxVar3, ccxVarN, cwb.d);
                    byq.c(buxVar3, Integer.valueOf(iG), cwb.f);
                    byq.b(buxVar3, cwb.g);
                    byq.c(buxVar3, cfyVarJ, cwb.c);
                    vy.a(null, gux.f(buxVar3).a.c, vs.c(((cjv) buxVar3.f(ggf.a)).a, 0L, buxVar3, 14), fxa.h(), afp.B(2.0f, czz.at(buxVar3).B), bxc.i(1963497069, true, new bol(obj4, 18), buxVar3), buxVar3, 196608, 1);
                    buxVar3.n();
                } else {
                    buxVar3.s();
                }
                break;
            case 2:
                bux buxVar4 = (bux) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (buxVar4.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    Object obj5 = this.a;
                    float f2 = ((guz) ((gjt) this.b).c).j;
                    guu guuVar = (guu) obj5;
                    gut.b(guuVar.c, guuVar.d, buxVar4, 0);
                } else {
                    buxVar4.s();
                }
                break;
            case 3:
                bux buxVar5 = (bux) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (buxVar5.I((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    Object obj6 = this.b;
                    cfy cfyVarB = heq.b(cfy.e, buxVar5);
                    if (((gva) obj6).a instanceof guu) {
                        buxVar5.v(1553724037);
                        bcmVar = gux.f(buxVar5).a.c;
                        buxVar5.o();
                    } else {
                        buxVar5.v(1553784580);
                        bcmVar = gux.f(buxVar5).a.d;
                        buxVar5.o();
                    }
                    vy.a(cfyVarB, bcmVar, vs.c(((cjv) buxVar5.f(ggf.a)).a, 0L, buxVar5, 14), fxa.h(), afp.B(2.0f, czz.at(buxVar5).B), bxc.i(-86687628, true, new fun(obj6, this.a, 7), buxVar5), buxVar5, 196608, 0);
                } else {
                    buxVar5.s();
                }
                break;
            case 4:
                bux buxVar6 = (bux) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (buxVar6.I((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    Object obj7 = this.b;
                    ?? r12 = this.a;
                    dfw dfwVarV2 = dfw.v(czz.av(buxVar6).l, gux.c(buxVar6).U(), 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777214);
                    float f3 = ((guz) ((gjt) obj7).c).j;
                    fzc.h(r12, null, 2, 0, 0L, dfwVarV2, 0L, null, 0, 0, null, new dlj(36.0f), null, false, false, buxVar6, 0, 0, 63450);
                } else {
                    buxVar6.s();
                }
                break;
            case 5:
                bux buxVar7 = (bux) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (buxVar7.I((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    ?? r2 = this.a;
                    gvk gvkVar = ((gvl) buxVar7.f(gfp.a)).f;
                    cfy cfyVarJ2 = r2;
                    if (((ggk) buxVar7.f(ggo.a)).A()) {
                        cfyVarJ2 = asl.J(r2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gvkVar.b, BitmapDescriptorFactory.HUE_RED);
                    }
                    cfy cfyVar = cfyVarJ2;
                    cfy cfyVarR2 = ((Boolean) buxVar7.f(gfo.a)).booleanValue() ? awd.r(cfy.e) : awd.c(cfy.e, 1.0f);
                    ctp ctpVarB = atk.b(cfl.a, false);
                    int iG2 = a.g(buxVar7.b());
                    ccx ccxVarN2 = buxVar7.N();
                    cfy cfyVarJ3 = bzi.j(buxVar7, cfyVarR2);
                    afdr afdrVar2 = cwb.a;
                    buxVar7.M();
                    buxVar7.w();
                    if (buxVar7.G()) {
                        buxVar7.j(afdrVar2);
                    } else {
                        buxVar7.y();
                    }
                    Object obj8 = this.b;
                    byq.c(buxVar7, ctpVarB, cwb.e);
                    byq.c(buxVar7, ccxVarN2, cwb.d);
                    byq.c(buxVar7, Integer.valueOf(iG2), cwb.f);
                    byq.b(buxVar7, cwb.g);
                    byq.c(buxVar7, cfyVarJ3, cwb.c);
                    hcm hcmVar = (hcm) obj8;
                    gab gabVar = hcmVar.d;
                    atn atnVar = atn.a;
                    if (gabVar == null) {
                        buxVar7.v(2121572351);
                        buxVar7.o();
                    } else {
                        buxVar7.v(2121572352);
                        fxp.c(gabVar, BitmapDescriptorFactory.HUE_RED, bxc.t(atnVar.b(cfy.e), hcmVar.e), null, csh.a, null, false, false, gzs.a, buxVar7, 805331000, 488);
                        buxVar7.o();
                    }
                    hju hjuVar = hcmVar.b;
                    if (hjuVar instanceof hcl) {
                        buxVar7.v(345545281);
                        gzw.b(hcmVar.a, (hcl) hjuVar, hcmVar.c, cfyVar, buxVar7, 0);
                        buxVar7 = buxVar7;
                        buxVar7.o();
                    } else {
                        buxVar7.v(2122078458);
                        gzw.c(hcmVar.a, 1.0f, hcmVar.c, cfyVar, bxc.i(-430663578, true, new guq(hjuVar, i), buxVar7), buxVar7, 24624);
                        buxVar7.o();
                    }
                    buxVar7.n();
                } else {
                    buxVar7.s();
                }
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                boolean z2 = false;
                bux buxVar8 = (bux) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i4 = iIntValue7 & 3;
                int i5 = iIntValue7 & 1;
                if (i4 != 2) {
                    z2 = true;
                }
                if (buxVar8.I(z2, i5)) {
                    ?? r13 = this.a;
                    cfv cfvVar = cfy.e;
                    cfy cfyVarT = awd.t(awd.r(cfvVar), null, 3);
                    ctp ctpVarA2 = avv.a(r13, cfl.n, buxVar8, 48);
                    int iG3 = a.g(buxVar8.b());
                    ccx ccxVarN3 = buxVar8.N();
                    cfy cfyVarJ4 = bzi.j(buxVar8, cfyVarT);
                    afdr afdrVar3 = cwb.a;
                    buxVar8.M();
                    buxVar8.w();
                    if (buxVar8.G()) {
                        buxVar8.j(afdrVar3);
                    } else {
                        buxVar8.y();
                    }
                    Object obj9 = this.b;
                    byq.c(buxVar8, ctpVarA2, cwb.e);
                    byq.c(buxVar8, ccxVarN3, cwb.d);
                    byq.c(buxVar8, Integer.valueOf(iG3), cwb.f);
                    byq.b(buxVar8, cwb.g);
                    byq.c(buxVar8, cfyVarJ4, cwb.c);
                    hhd hhdVar = (hhd) obj9;
                    fzp fzpVar = hhdVar.b;
                    if (fzpVar == null) {
                        buxVar8.v(170095286);
                        buxVar8.o();
                    } else {
                        buxVar8.v(170095287);
                        fzo.c(fzpVar, awd.i(cfvVar, gux.g(buxVar8).d.c), null, null, BitmapDescriptorFactory.HUE_RED, new cjp(hhc.d(hhdVar.c, buxVar8), 5), null, true, buxVar8, 805306376, 476);
                        buxVar8.o();
                    }
                    if (fzpVar == null || hhdVar.a == null) {
                        buxVar8.v(170502534);
                        buxVar8.o();
                    } else {
                        buxVar8.v(170417966);
                        hir hirVar = gux.e(buxVar8).c;
                        asl.A(awd.m(cfvVar, 8.0f), buxVar8);
                        buxVar8.o();
                    }
                    gfa gfaVar = hhdVar.a;
                    if (gfaVar == null) {
                        buxVar8.v(170532417);
                        buxVar8.o();
                        buxVar = buxVar8;
                    } else {
                        buxVar8.v(170532418);
                        boolean z3 = hhdVar.c;
                        buxVar = buxVar8;
                        fzc.h(gfaVar, null, 0, 0, hhc.d(z3, buxVar8), hhc.e(z3, buxVar8), 0L, null, 0, 0, null, null, null, false, false, buxVar, 0, 0, 65486);
                        buxVar.o();
                    }
                    buxVar.n();
                } else {
                    buxVar8.s();
                }
                break;
            case 13:
                bux buxVar9 = (bux) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (buxVar9.I((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    ?? r22 = this.a;
                    hhd hhdVar2 = (hhd) this.b;
                    fzp fzpVar2 = hhdVar2.b;
                    fzpVar2.getClass();
                    hhc.a(fzpVar2, hhdVar2.c, r22, buxVar9, 392);
                } else {
                    buxVar9.s();
                }
                break;
            case 14:
                bux buxVar10 = (bux) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (buxVar10.I((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    ksr.a((kso) this.a, null, false, null, bxc.i(669438725, true, new juy(this.b, z ? 1 : 0), buxVar10), buxVar10, 24576, 14);
                } else {
                    buxVar10.s();
                }
                break;
            case 15:
                bux buxVar11 = (bux) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (buxVar11.I((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    ((jvc) this.b).b.e(asl.G(cfy.e, this.a), null, buxVar11, sk.AUDIO_CONTENT_BUFFER_SIZE, 2);
                } else {
                    buxVar11.s();
                }
                break;
            case 16:
                yfq yfqVar = (yfq) obj2;
                yph yphVar = loy.a;
                ((ype) yphVar.l().ai(4125)).M("Potential MediaControllerConnection update: %s, %s", (yfy) obj, yfqVar);
                Stream stream = Collection.EL.stream(yfqVar);
                Object obj10 = this.a;
                lmb lmbVar = (lmb) stream.filter(new lou(obj10, z ? 1 : 0)).findFirst().orElse(null);
                Object obj11 = this.b;
                if (lmbVar == null) {
                    ((ype) ((ype) yphVar.f()).ai((char) 4126)).y("No active controller for %s, going inactive", obj10);
                    loy loyVar = (loy) obj11;
                    loyVar.g.remove(obj10);
                    break;
                } else {
                    break;
                }
            case 17:
                yfq yfqVar2 = (yfq) obj;
                Map map = (Map) obj2;
                yfqVar2.getClass();
                map.getClass();
                qn qnVar = ((qw) this.a).a;
                qnVar.getClass();
                break;
            case 18:
                kqt kqtVar = (kqt) obj;
                yzz yzzVar = (yzz) obj2;
                kqtVar.getClass();
                yzzVar.getClass();
                oct.g((qn) this.a, kqtVar, yzzVar);
                break;
            case 19:
                kqt kqtVar2 = (kqt) obj;
                yzz yzzVar2 = (yzz) obj2;
                kqtVar2.getClass();
                yzzVar2.getClass();
                oct.g((qn) this.a, kqtVar2, yzzVar2);
                break;
            default:
                kqt kqtVar3 = (kqt) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                yob yobVar = mer.a;
                kqtVar3.getClass();
                yfq yfqVar3 = kqtVar3.b;
                int i6 = ((yls) yfqVar3).c;
                yzz yzzVar3 = yzz.PHONE_BROWSE_FAVORITES;
                if (i6 > 1) {
                    this.b.invoke(kqtVar3, yzzVar3);
                } else if (i6 == 1) {
                    Object obj12 = this.a;
                    yfqVar3.getClass();
                    Object objBF = woy.bF(yfqVar3);
                    objBF.getClass();
                    lws.n((kqz) objBF, (Context) obj12, yzzVar3, iIntValue11);
                } else {
                    ((ynz) mex.a.h().ai(4818)).y("No phone numbers for contact %s", kqtVar3.a);
                }
                break;
        }
        return afak.a;
    }

    public /* synthetic */ guk(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
