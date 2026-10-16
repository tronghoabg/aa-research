package defpackage;

import android.content.Context;
import com.google.android.apps.auto.components.apphost.basewidgets.action.ui.MaterialActionButtonView;
import com.google.android.apps.auto.components.apphost.view.presenters.navigation.minimized.MinimizedTurnCardView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class juy implements afeg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ juy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v62, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [afeg, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        float f;
        dlg dlgVar;
        int i = 16;
        int i2 = 10;
        int i3 = 14;
        int i4 = 13;
        int i5 = 8;
        int i6 = 12;
        int i7 = 6;
        switch (this.b) {
            case 0:
                bux buxVar = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    fwn.i(czz.at(buxVar).p, czz.at(buxVar).q, this.a, buxVar, 0);
                } else {
                    buxVar.s();
                }
                break;
            case 1:
                bux buxVar2 = (bux) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (buxVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    MaterialActionButtonView materialActionButtonView = (MaterialActionButtonView) this.a;
                    fwi fwiVarA = materialActionButtonView.a();
                    if (fwiVarA == null) {
                        buxVar2.v(1062877226);
                    } else {
                        buxVar2.v(1062877227);
                        hjs.a.a(fwiVarA, (cfy) materialActionButtonView.a.a(), buxVar2, 392, 0);
                    }
                    buxVar2.o();
                } else {
                    buxVar2.s();
                }
                break;
            case 2:
                bux buxVar3 = (bux) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (buxVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    jva jvaVar = (jva) this.a;
                    jvaVar.i().getClass();
                    bvf bvfVar = dbc.d;
                    dlg dlgVar2 = (dlg) buxVar3.f(bvfVar);
                    geu geuVar = jvaVar.b;
                    if (!(affa.f(((gmh) geuVar.d()).a, kyg.b) && affa.f(geuVar.b().getSessionId(), "voice_plate")) && acob.R()) {
                        buxVar3.v(-140709551);
                        dlg dlhVar = (dlg) buxVar3.f(bvfVar);
                        boolean zC = buxVar3.C((dcf) buxVar3.f(dbc.o)) | buxVar3.C(dlhVar);
                        Object objG = buxVar3.g();
                        if (zC || objG == buw.a) {
                            f = 1.0f;
                            float fD = afpt.d((((int) (r8.a() & 4294967295L)) / dlhVar.a()) / 400.0f, 0.7f, 1.0f);
                            if (fD != 1.0f) {
                                dlhVar = new dlh(dlhVar.a() * fD, dlhVar.b() * fD);
                            }
                            buxVar3.x(dlhVar);
                        } else {
                            dlhVar = objG;
                            f = 1.0f;
                        }
                        dlgVar = dlhVar;
                        buxVar3.o();
                    } else {
                        f = 1.0f;
                        buxVar3.v(-140658370);
                        buxVar3.o();
                        dlgVar = dlgVar2;
                    }
                    long jA = ((dcf) buxVar3.f(dbc.o)).a();
                    float fA = dlgVar.a() == BitmapDescriptorFactory.HUE_RED ? f : dlgVar2.a() / dlgVar.a();
                    hjo hjoVarB = gvj.b(Math.max(0, (int) (((((int) (jA >> 32)) / dlgVar2.a()) - ((r0.a + r0.c) / dlgVar2.a())) * fA)), Math.max(0, (int) (((((int) (jA & 4294967295L)) / dlgVar2.a()) - ((r0.b + r0.d) / dlgVar2.a())) * fA)));
                    boolean zE = buxVar3.E(hjoVarB) | buxVar3.C(dlgVar);
                    Object objG2 = buxVar3.g();
                    if (zE || objG2 == buw.a) {
                        objG2 = new dxa(hjoVarB, dlgVar, (afck) null, 12);
                        buxVar3.x(objG2);
                    }
                    bvq.g(hjoVarB, (afeg) objG2, buxVar3);
                    aezu aezuVar = new aezu(dlgVar, hjoVarB);
                    Object obj3 = aezuVar.a;
                    hjo hjoVar = (hjo) aezuVar.b;
                    jvaVar.f(geuVar, hjoVar, bxc.i(-1155866269, true, new brf((dlg) obj3, jvaVar, hjoVar, i), buxVar3), buxVar3, 384);
                } else {
                    buxVar3.s();
                }
                break;
            case 3:
                bux buxVar4 = (bux) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (buxVar4.I((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    jvc jvcVar = (jvc) this.a;
                    jvcVar.f().getClass();
                    bvf bvfVar2 = dbc.d;
                    dlg dlgVar3 = (dlg) buxVar4.f(bvfVar2);
                    long jA2 = ((dcf) buxVar4.f(dbc.o)).a();
                    hjo hjoVarB2 = gvj.b(Math.max(0, (int) ((((int) (jA2 >> 32)) / dlgVar3.a()) - ((r1.a + r1.c) / dlgVar3.a()))), Math.max(0, (int) ((((int) (jA2 & 4294967295L)) / dlgVar3.a()) - ((r1.b + r1.d) / dlgVar3.a()))));
                    dlg dlgVar4 = (dlg) buxVar4.f(bvfVar2);
                    avr avrVar = new avr(dlgVar4.ey(jvcVar.f().a), dlgVar4.ey(jvcVar.f().b), dlgVar4.ey(jvcVar.f().c), dlgVar4.ey(jvcVar.f().d));
                    int i8 = jux.a;
                    jtr.b(jux.a(jvcVar.a), false, null, bxc.i(-1577661353, true, new brf(hjoVarB2, jvcVar, (avp) avrVar, 18), buxVar4), buxVar4, 3072, 6);
                } else {
                    buxVar4.s();
                }
                break;
            case 4:
                bux buxVar5 = (bux) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (buxVar5.I((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    gvq.g(((gvy) this.a).d, null, buxVar5, 8, 1);
                } else {
                    buxVar5.s();
                }
                break;
            case 5:
                bux buxVar6 = (bux) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (buxVar6.I((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    hjs.a.a((gva) ((MinimizedTurnCardView) this.a).a.a(), null, buxVar6, 392, 2);
                } else {
                    buxVar6.s();
                }
                break;
            case 6:
                bux buxVar7 = (bux) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (buxVar7.I((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    czz.an(new bxe[0], bxc.i(-1165639289, true, new juy(this.a, 5), buxVar7), buxVar7, 48);
                } else {
                    buxVar7.s();
                }
                break;
            case 7:
                kkf kkfVar = (kkf) obj;
                kkf kkfVar2 = (kkf) obj2;
                kkfVar.getClass();
                kkfVar2.getClass();
                if (!(kkfVar instanceof kkc) || !(kkfVar2 instanceof kkc)) {
                    if (!(kkfVar instanceof kkd) && !(kkfVar2 instanceof kkd)) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 8:
                break;
            case 9:
                bux buxVar8 = (bux) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (buxVar8.I((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    kmj.p((kmj) this.a, buxVar8);
                } else {
                    buxVar8.s();
                }
                break;
            case 10:
                bux buxVar9 = (bux) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (buxVar9.I((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    brp.b(((kun) this.a).name(), kvc.a(cfy.e, ckq.a, 0L, 0L, null, null, null, false, false, buxVar9, 54, 254), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar9, 0, 0, 262140);
                } else {
                    buxVar9.s();
                }
                break;
            case 11:
                bux buxVar10 = (bux) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (buxVar10.I((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    cfv cfvVar = cfy.e;
                    cfy cfyVarA = awd.c(cfvVar.a(new aix(kfn.i(buxVar10).M(), ckq.a)), 1.0f).a(new awg(awr.b));
                    ctp ctpVarA = atp.a(atd.c, cfl.j, buxVar10, 0);
                    int iG = a.g(buxVar10.b());
                    ccx ccxVarN = buxVar10.N();
                    cfy cfyVarJ = bzi.j(buxVar10, cfyVarA);
                    afdr afdrVar = cwb.a;
                    buxVar10.M();
                    buxVar10.w();
                    if (buxVar10.G()) {
                        buxVar10.j(afdrVar);
                    } else {
                        buxVar10.y();
                    }
                    ?? r0 = this.a;
                    afeg afegVar = cwb.e;
                    byq.c(buxVar10, ctpVarA, afegVar);
                    afeg afegVar2 = cwb.d;
                    byq.c(buxVar10, ccxVarN, afegVar2);
                    Integer numValueOf = Integer.valueOf(iG);
                    afeg afegVar3 = cwb.f;
                    byq.c(buxVar10, numValueOf, afegVar3);
                    afec afecVar = cwb.g;
                    byq.b(buxVar10, afecVar);
                    afeg afegVar4 = cwb.c;
                    byq.c(buxVar10, cfyVarJ, afegVar4);
                    tr.l(kum.a(r0).ordinal(), null, 0L, 0L, null, null, bxc.i(513972599, true, new juy(r0, i6), buxVar10), buxVar10, 1572864);
                    ctp ctpVarB = atk.b(cfl.a, false);
                    int iG2 = a.g(buxVar10.b());
                    ccx ccxVarN2 = buxVar10.N();
                    cfy cfyVarJ2 = bzi.j(buxVar10, cfvVar);
                    buxVar10.M();
                    buxVar10.w();
                    if (buxVar10.G()) {
                        buxVar10.j(afdrVar);
                    } else {
                        buxVar10.y();
                    }
                    byq.c(buxVar10, ctpVarB, afegVar);
                    byq.c(buxVar10, ccxVarN2, afegVar2);
                    byq.c(buxVar10, Integer.valueOf(iG2), afegVar3);
                    byq.b(buxVar10, afecVar);
                    byq.c(buxVar10, cfyVarJ2, afegVar4);
                    kum.a(r0).f.invoke(buxVar10, 0);
                    buxVar10.n();
                    buxVar10.n();
                } else {
                    buxVar10.s();
                }
                break;
            case 12:
                bux buxVar11 = (bux) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (buxVar11.I((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    afao afaoVar = new afao((afar) kun.e);
                    while (afaoVar.hasNext()) {
                        ?? r2 = this.a;
                        kun kunVar = (kun) afaoVar.next();
                        boolean z = kunVar == kum.a(r2);
                        boolean zA = buxVar11.A(kunVar.ordinal());
                        Object objG3 = buxVar11.g();
                        if (zA || objG3 == buw.a) {
                            objG3 = new kku(kunVar, r2, i7);
                            buxVar11.x(objG3);
                        }
                        brb.d(z, (afdr) objG3, null, false, bxc.i(1577921583, true, new juy(kunVar, i2), buxVar11), 0L, 0L, buxVar11, 24576);
                    }
                } else {
                    buxVar11.s();
                }
                break;
            case 13:
                bux buxVar12 = (bux) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (buxVar12.I((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    Object obj4 = this.a;
                    cct cctVarI = bxc.i(1539176732, false, new kup(i6), buxVar12);
                    boolean zE2 = buxVar12.E(obj4);
                    Object objG4 = buxVar12.g();
                    if (zE2 || objG4 == buw.a) {
                        objG4 = new kuq((Context) obj4, 5);
                        buxVar12.x(objG4);
                    }
                    mcd.f(cctVarI, null, null, (afdr) objG4, null, 0, null, buxVar12, 438, 112);
                } else {
                    buxVar12.s();
                }
                break;
            case 14:
                bux buxVar13 = (bux) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (buxVar13.I((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    Object obj5 = this.a;
                    cct cctVarI2 = bxc.i(-117931525, false, new kup(5), buxVar13);
                    cct cctVarI3 = bxc.i(535731696, false, new kup(i7), buxVar13);
                    cct cctVarI4 = bxc.i(-2026699920, false, new kbi(17), buxVar13);
                    boolean zE3 = buxVar13.E(obj5);
                    Object objG5 = buxVar13.g();
                    if (zE3 || objG5 == buw.a) {
                        objG5 = new kuq((Context) obj5, 0);
                        buxVar13.x(objG5);
                    }
                    mcd.f(cctVarI2, cctVarI3, cctVarI4, (afdr) objG5, null, 0, null, buxVar13, 438, 112);
                } else {
                    buxVar13.s();
                }
                break;
            case 15:
                bux buxVar14 = (bux) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (buxVar14.I((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    cfy cfyVarR = awd.r(cfy.e);
                    ctp ctpVarA2 = avv.a(asv.a(16.0f, cfl.k), cfl.m, buxVar14, 6);
                    int iG3 = a.g(buxVar14.b());
                    ccx ccxVarN3 = buxVar14.N();
                    cfy cfyVarJ3 = bzi.j(buxVar14, cfyVarR);
                    afdr afdrVar2 = cwb.a;
                    buxVar14.M();
                    buxVar14.w();
                    if (buxVar14.G()) {
                        buxVar14.j(afdrVar2);
                    } else {
                        buxVar14.y();
                    }
                    Object obj6 = this.a;
                    byq.c(buxVar14, ctpVarA2, cwb.e);
                    byq.c(buxVar14, ccxVarN3, cwb.d);
                    byq.c(buxVar14, Integer.valueOf(iG3), cwb.f);
                    byq.b(buxVar14, cwb.g);
                    byq.c(buxVar14, cfyVarJ3, cwb.c);
                    cmw cmwVarB = dao.b(R.drawable.ic_call, buxVar14, 0);
                    boolean zE4 = buxVar14.E(obj6);
                    Object objG6 = buxVar14.g();
                    if (zE4 || objG6 == buw.a) {
                        objG6 = new kjy(obj6, 15);
                        buxVar14.x(objG6);
                    }
                    aezr aezrVar = ktf.a;
                    khc.k(cmwVarB, "Answer", (afdr) objG6, null, null, false, null, kgq.e(kfn.i(buxVar14).d(), 0L, 0L, 0L, 0L, 0L, 0L, buxVar14, 254), null, null, buxVar14, 56, 0, 7672);
                    cmw cmwVarB2 = dao.b(R.drawable.ic_call, buxVar14, 0);
                    boolean zE5 = buxVar14.E(obj6);
                    Object objG7 = buxVar14.g();
                    if (zE5 || objG7 == buw.a) {
                        objG7 = new kjy(obj6, i);
                        buxVar14.x(objG7);
                    }
                    khc.k(cmwVarB2, "Decline", (afdr) objG7, null, null, false, null, kgq.e(kfn.i(buxVar14).C(), 0L, 0L, 0L, 0L, 0L, 0L, buxVar14, 254), null, null, buxVar14, 56, 0, 7672);
                    cmw cmwVarB3 = dao.b(2131233146, buxVar14, 0);
                    boolean zE6 = buxVar14.E(obj6);
                    Object objG8 = buxVar14.g();
                    if (zE6 || objG8 == buw.a) {
                        objG8 = new kjy(obj6, 17);
                        buxVar14.x(objG8);
                    }
                    khc.q(cmwVarB3, "Message", (afdr) objG8, null, null, false, false, null, null, null, null, null, buxVar14, 56, 0, 8184);
                    buxVar14.n();
                } else {
                    buxVar14.s();
                }
                break;
            case 16:
                bux buxVar15 = (bux) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (buxVar15.I((iIntValue15 & 3) != 2, iIntValue15 & 1)) {
                    cfy cfyVarR2 = awd.r(cfy.e);
                    ctp ctpVarA3 = avv.a(asv.a(16.0f, cfl.k), cfl.m, buxVar15, 6);
                    int iG4 = a.g(buxVar15.b());
                    ccx ccxVarN4 = buxVar15.N();
                    cfy cfyVarJ4 = bzi.j(buxVar15, cfyVarR2);
                    afdr afdrVar3 = cwb.a;
                    buxVar15.M();
                    buxVar15.w();
                    if (buxVar15.G()) {
                        buxVar15.j(afdrVar3);
                    } else {
                        buxVar15.y();
                    }
                    Object obj7 = this.a;
                    byq.c(buxVar15, ctpVarA3, cwb.e);
                    byq.c(buxVar15, ccxVarN4, cwb.d);
                    byq.c(buxVar15, Integer.valueOf(iG4), cwb.f);
                    byq.b(buxVar15, cwb.g);
                    byq.c(buxVar15, cfyVarJ4, cwb.c);
                    cmw cmwVarB4 = dao.b(2131233143, buxVar15, 0);
                    boolean zE7 = buxVar15.E(obj7);
                    Object objG9 = buxVar15.g();
                    if (zE7 || objG9 == buw.a) {
                        objG9 = new kjy(obj7, i2);
                        buxVar15.x(objG9);
                    }
                    khc.k(cmwVarB4, "Play Aloud", (afdr) objG9, null, null, false, null, null, null, null, buxVar15, 56, 0, 8184);
                    cmw cmwVarB5 = dao.b(2131233146, buxVar15, 0);
                    boolean zE8 = buxVar15.E(obj7);
                    Object objG10 = buxVar15.g();
                    if (zE8 || objG10 == buw.a) {
                        objG10 = new kjy(obj7, 11);
                        buxVar15.x(objG10);
                    }
                    khc.q(cmwVarB5, "Reply", (afdr) objG10, null, null, false, false, null, null, null, null, null, buxVar15, 56, 0, 8184);
                    cmw cmwVarB6 = dao.b(2131233135, buxVar15, 0);
                    boolean zE9 = buxVar15.E(obj7);
                    Object objG11 = buxVar15.g();
                    if (zE9 || objG11 == buw.a) {
                        objG11 = new kjy(obj7, i6);
                        buxVar15.x(objG11);
                    }
                    khc.q(cmwVarB6, "Mute", (afdr) objG11, null, null, false, false, null, null, null, null, null, buxVar15, 56, 0, 8184);
                    buxVar15.n();
                } else {
                    buxVar15.s();
                }
                break;
            case 17:
                bux buxVar16 = (bux) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (buxVar16.I((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    cfv cfvVar2 = cfy.e;
                    ctp ctpVarA4 = avv.a(atd.a, cfl.m, buxVar16, 0);
                    int iG5 = a.g(buxVar16.b());
                    ccx ccxVarN5 = buxVar16.N();
                    cfy cfyVarJ5 = bzi.j(buxVar16, cfvVar2);
                    afdr afdrVar4 = cwb.a;
                    buxVar16.M();
                    buxVar16.w();
                    if (buxVar16.G()) {
                        buxVar16.j(afdrVar4);
                    } else {
                        buxVar16.y();
                    }
                    Object obj8 = this.a;
                    byq.c(buxVar16, ctpVarA4, cwb.e);
                    byq.c(buxVar16, ccxVarN5, cwb.d);
                    byq.c(buxVar16, Integer.valueOf(iG5), cwb.f);
                    byq.b(buxVar16, cwb.g);
                    byq.c(buxVar16, cfyVarJ5, cwb.c);
                    cmw cmwVarB7 = dao.b(2131233163, buxVar16, 0);
                    boolean zE10 = buxVar16.E(obj8);
                    Object objG12 = buxVar16.g();
                    if (zE10 || objG12 == buw.a) {
                        objG12 = new kjy(obj8, i4);
                        buxVar16.x(objG12);
                    }
                    khc.r(cmwVarB7, (afdr) objG12, asl.J(cfvVar2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16.0f, BitmapDescriptorFactory.HUE_RED), null, false, false, null, null, null, null, null, buxVar16, 392, 0, 4088);
                    cmw cmwVarB8 = dao.b(2131233162, buxVar16, 0);
                    boolean zE11 = buxVar16.E(obj8);
                    Object objG13 = buxVar16.g();
                    if (zE11 || objG13 == buw.a) {
                        objG13 = new kjy(obj8, i3);
                        buxVar16.x(objG13);
                    }
                    khc.r(cmwVarB8, (afdr) objG13, null, null, false, false, null, null, null, null, null, buxVar16, 8, 0, 4092);
                    buxVar16.n();
                } else {
                    buxVar16.s();
                }
                break;
            case 18:
                bux buxVar17 = (bux) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (buxVar17.I((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    Object obj9 = this.a;
                    cmw cmwVarB9 = dao.b(R.drawable.ic_call, buxVar17, 0);
                    boolean zE12 = buxVar17.E(obj9);
                    Object objG14 = buxVar17.g();
                    if (zE12 || objG14 == buw.a) {
                        objG14 = new kuq((Context) obj9, 1);
                        buxVar17.x(objG14);
                    }
                    khc.r(cmwVarB9, (afdr) objG14, null, null, false, false, null, null, null, null, null, buxVar17, 8, 0, 4092);
                } else {
                    buxVar17.s();
                }
                break;
            case 19:
                bux buxVar18 = (bux) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (buxVar18.I((iIntValue18 & 3) != 2, iIntValue18 & 1)) {
                    Object obj10 = this.a;
                    cct cctVarI5 = bxc.i(-1775039782, false, new kup(7), buxVar18);
                    cct cctVarI6 = bxc.i(-1121376561, false, new kup(i5), buxVar18);
                    afeg afegVar5 = kum.i;
                    boolean zE13 = buxVar18.E(obj10);
                    Object objG15 = buxVar18.g();
                    if (zE13 || objG15 == buw.a) {
                        objG15 = new kuq((Context) obj10, 2);
                        buxVar18.x(objG15);
                    }
                    mcd.f(cctVarI5, cctVarI6, afegVar5, (afdr) objG15, null, 0, null, buxVar18, 438, 112);
                } else {
                    buxVar18.s();
                }
                break;
            default:
                bux buxVar19 = (bux) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (buxVar19.I((iIntValue19 & 3) != 2, iIntValue19 & 1)) {
                    Object obj11 = this.a;
                    cct cctVarI7 = bxc.i(862819257, false, new kup(i4), buxVar19);
                    cct cctVarI8 = bxc.i(1516482478, false, new kup(i3), buxVar19);
                    cct cctVarI9 = bxc.i(-1045949138, false, new kbi(20), buxVar19);
                    boolean zE14 = buxVar19.E(obj11);
                    Object objG16 = buxVar19.g();
                    if (zE14 || objG16 == buw.a) {
                        objG16 = new kuq((Context) obj11, 6);
                        buxVar19.x(objG16);
                    }
                    mcd.f(cctVarI7, cctVarI8, cctVarI9, (afdr) objG16, null, 0, null, buxVar19, 438, 112);
                } else {
                    buxVar19.s();
                }
                break;
        }
        return afak.a;
    }
}
