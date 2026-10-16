package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.system.facetbar.ResizeButton;
import com.google.android.apps.auto.components.widgets.EarthCompanionActivity;
import com.google.android.apps.auto.components.widgets.EarthPickerActivity;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.util.Optional;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class njg implements afeg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ njg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kkf] */
    /* JADX WARN: Type inference failed for: r0v25, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v105, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v111, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v117, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v36 */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        ktf ktfVarJ;
        bux buxVar;
        ckv ckvVarD;
        afdr afdrVar;
        cfy cfyVarA;
        npt nptVar;
        Optional optionalB;
        int i = 1;
        switch (this.b) {
            case 0:
                ComponentName componentName = (ComponentName) obj;
                mqc mqcVar = (mqc) obj2;
                componentName.getClass();
                return ((njp) this.a).j(componentName, mqcVar != null ? mqcVar.a() : 0, njk.a, false, true);
            case 1:
                onv onvVar = (onv) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                onvVar.getClass();
                return zBooleanValue ? onu.l(onvVar.a) : ((nel) this.a).a;
            case 2:
                mqc mqcVar2 = (mqc) obj2;
                return ((njp) this.a).j((ComponentName) obj, mqcVar2 != null ? mqcVar2.a() : null, njk.c, false, true);
            case 3:
                bux buxVar2 = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (buxVar2.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    ResizeButton resizeButton = (ResizeButton) this.a;
                    boolean z = resizeButton.a;
                    if (z) {
                        buxVar2.v(1856369581);
                        aezr aezrVar = ktf.a;
                        ktfVarJ = kgq.j(kfn.i(buxVar2).G(), kfn.i(buxVar2).s(), kfn.i(buxVar2).s(), 0L, buxVar2, 248);
                        buxVar = buxVar2;
                        buxVar.o();
                    } else {
                        buxVar2.v(1856646504);
                        aezr aezrVar2 = ktf.a;
                        ktfVarJ = kgq.j(kfn.i(buxVar2).G(), kfn.i(buxVar2).s(), kfn.i(buxVar2).s(), cjn.i(resizeButton.getContext().getColor(R.color.gearhead_focus_blue)), buxVar2, 240);
                        buxVar = buxVar2;
                        buxVar.o();
                    }
                    ktf ktfVar = ktfVarJ;
                    if (z) {
                        buxVar.v(1857093028);
                        buxVar.o();
                        ckvVarD = bcr.b(84.0f);
                    } else {
                        buxVar.v(1857145449);
                        avp avpVar = bmo.a;
                        ckvVarD = bmo.d(buxVar);
                        buxVar.o();
                        i = 0;
                    }
                    ckv ckvVar = ckvVarD;
                    cfv cfvVar = cfy.e;
                    cfy cfyVarU = awd.u(cfvVar, null, 3);
                    ctp ctpVarB = atk.b(cfl.e, false);
                    int iG = a.g(buxVar.b());
                    ccx ccxVarN = buxVar.N();
                    cfy cfyVarJ = bzi.j(buxVar, cfyVarU);
                    afdr afdrVar2 = cwb.a;
                    buxVar.M();
                    buxVar.w();
                    if (buxVar.G()) {
                        buxVar.j(afdrVar2);
                    } else {
                        buxVar.y();
                    }
                    byq.c(buxVar, ctpVarB, cwb.e);
                    byq.c(buxVar, ccxVarN, cwb.d);
                    byq.c(buxVar, Integer.valueOf(iG), cwb.f);
                    byq.b(buxVar, cwb.g);
                    byq.c(buxVar, cfyVarJ, cwb.c);
                    cmw cmwVarB = dao.b(resizeButton.k().d, buxVar, 0);
                    afdr afdrVar3 = resizeButton.k().e;
                    buxVar.v(213689667);
                    cfy cfyVarM = awd.m(awd.d(cfvVar, resizeButton.a().d), resizeButton.a().c);
                    if (i != 0) {
                        afdrVar = afdrVar3;
                        cfyVarA = kvc.a(cfyVarM, ckvVar, ktfVar.j, 0L, null, null, null, true, false, buxVar, 12582912, 188);
                    } else {
                        afdrVar = afdrVar3;
                        cfyVarA = kvc.a(cfyVarM, ckvVar, ktfVar.j, 0L, ksy.c.o, null, null, true, false, buxVar, 12582912, 180);
                    }
                    buxVar.o();
                    bux buxVar3 = buxVar;
                    khc.i(cmwVarB, afdrVar, cfyVarA, new ksy(resizeButton.a().d, 28.0f, null, null, null, 508), false, false, ckvVar, null, ktfVar, null, null, null, buxVar3, 8, 0, 3760);
                    buxVar3.n();
                } else {
                    buxVar2.s();
                }
                return afak.a;
            case 4:
                bux buxVar4 = (bux) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (buxVar4.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    lvl.R((nko) this.a, buxVar4, 0);
                } else {
                    buxVar4.s();
                }
                return afak.a;
            case 5:
                bux buxVar5 = (bux) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (buxVar5.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    ?? r0 = this.a;
                    cfv cfvVar2 = cfy.e;
                    ksy ksyVar = nly.a;
                    lvl.V(r0, awd.k(cfvVar2, 74.0f, 38.0f), buxVar5, 0);
                } else {
                    buxVar5.s();
                }
                return afak.a;
            case 6:
                bux buxVar6 = (bux) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i2 = iIntValue4 & 3;
                int i3 = iIntValue4 & 1;
                int i4 = nny.a;
                if (buxVar6.I(i2 != 2, i3)) {
                    GhIcon ghIcon = ((nnl) this.a).d;
                    if (ghIcon != null) {
                        buxVar6.v(1011979842);
                        ca.bb(lgi.f(ghIcon, BitmapDescriptorFactory.HUE_RED, buxVar6, 3), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, buxVar6, 56, 124);
                        buxVar6.o();
                    } else {
                        buxVar6.v(1012071137);
                        buxVar6.o();
                    }
                } else {
                    buxVar6.s();
                }
                return afak.a;
            case 7:
                xqp xqpVar = (xqp) obj;
                xqpVar.getClass();
                ((Map) obj2).getClass();
                if (xqpVar == xqp.c) {
                    this.a.b(xqp.d);
                }
                return afak.a;
            case 8:
                xqp xqpVar2 = (xqp) obj;
                xqpVar2.getClass();
                ((Map) obj2).getClass();
                if (xqpVar2 == xqp.c) {
                    this.a.b(xqp.d);
                }
                return afak.a;
            case 9:
                xqp xqpVar3 = (xqp) obj;
                xqpVar3.getClass();
                ((Map) obj2).getClass();
                if (xqpVar3 == xqp.c) {
                    this.a.b(xqp.d);
                }
                return afak.a;
            case 10:
                float fFloatValue = ((Float) obj).floatValue();
                npt nptVar2 = (npt) obj2;
                nptVar2.getClass();
                npi npiVar = (npi) this.a;
                npp nppVarA = npiVar.b.a(fFloatValue);
                if (!(nppVarA instanceof npo) || nptVar2 != (nptVar = npt.b)) {
                    return nppVarA;
                }
                List list = npiVar.a;
                npk npkVarA = npj.a(list, npt.a);
                npk npkVarA2 = npj.a(list, nptVar);
                return new npo((npkVarA2.c() * Math.round((fFloatValue - npkVarA.b()) / npkVarA.c())) + npkVarA2.b());
            case 11:
                kkf kkfVar = (kkf) obj;
                Float f = (Float) obj2;
                kkfVar.getClass();
                if (!(kkfVar instanceof kkc)) {
                    return null;
                }
                Object obj3 = this.a;
                Number number = (Number) ((kkc) kkfVar).a;
                ugn ugnVar = (ugn) obj3;
                if (number.floatValue() == BitmapDescriptorFactory.HUE_RED) {
                    return ugnVar.a(f);
                }
                Object obj4 = ugnVar.k;
                if (obj4 != null) {
                    return ((npw) obj4).c(number.floatValue());
                }
                return null;
            case 12:
                kkf kkfVar2 = (kkf) obj;
                Float f2 = (Float) obj2;
                kkfVar2.getClass();
                if (!(kkfVar2 instanceof kkc)) {
                    return null;
                }
                Object obj5 = this.a;
                Number number2 = (Number) ((kkc) kkfVar2).a;
                ugn ugnVar2 = (ugn) obj5;
                if (number2.floatValue() == BitmapDescriptorFactory.HUE_RED) {
                    return ugnVar2.a(f2);
                }
                Object obj6 = ugnVar2.k;
                if (obj6 != null) {
                    return ((npw) obj6).b(number2.floatValue());
                }
                return null;
            case 13:
                bux buxVar7 = (bux) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (buxVar7.I((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    asw aswVarH = atd.h(gjk.d.k, cfl.k);
                    cfv cfvVar3 = cfy.e;
                    ctp ctpVarA = avv.a(aswVarH, cfl.m, buxVar7, 0);
                    int iG2 = a.g(buxVar7.b());
                    ccx ccxVarN2 = buxVar7.N();
                    cfy cfyVarJ2 = bzi.j(buxVar7, cfvVar3);
                    afdr afdrVar4 = cwb.a;
                    buxVar7.M();
                    buxVar7.w();
                    if (buxVar7.G()) {
                        buxVar7.j(afdrVar4);
                    } else {
                        buxVar7.y();
                    }
                    Object obj7 = this.a;
                    byq.c(buxVar7, ctpVarA, cwb.e);
                    byq.c(buxVar7, ccxVarN2, cwb.d);
                    byq.c(buxVar7, Integer.valueOf(iG2), cwb.f);
                    byq.b(buxVar7, cwb.g);
                    byq.c(buxVar7, cfyVarJ2, cwb.c);
                    nwr nwrVar = (nwr) obj7;
                    nwt nwtVar = nwrVar.n;
                    if (nwtVar == null) {
                        buxVar7.v(1457552851);
                        buxVar7.o();
                    } else {
                        buxVar7.v(1457552852);
                        boolean zE = buxVar7.E(obj7);
                        Object objG = buxVar7.g();
                        if (zE || objG == buw.a) {
                            objG = new npz(obj7, 20);
                            buxVar7.x(objG);
                        }
                        Runnable runnable = nwrVar.g;
                        afdr afdrVar5 = (afdr) objG;
                        runnable.getClass();
                        int i5 = nwtVar.d;
                        if (i5 == 0) {
                            throw null;
                        }
                        lxw.v(nwtVar, afdrVar5, runnable, lxw.y(i5, false, buxVar7, 2), das.d(cfvVar3, "primary_inline_action_button_tag"), false, buxVar7, 221184);
                        buxVar7.o();
                    }
                    nwt nwtVar2 = nwrVar.o;
                    if (nwtVar2 == null) {
                        buxVar7.v(1458280204);
                        buxVar7.o();
                    } else {
                        buxVar7.v(1458280205);
                        boolean zE2 = buxVar7.E(obj7);
                        Object objG2 = buxVar7.g();
                        if (zE2 || objG2 == buw.a) {
                            objG2 = new nxb(obj7, i);
                            buxVar7.x(objG2);
                        }
                        Runnable runnable2 = nwrVar.g;
                        afdr afdrVar6 = (afdr) objG2;
                        runnable2.getClass();
                        int i6 = nwtVar2.d;
                        if (i6 == 0) {
                            throw null;
                        }
                        lxw.v(nwtVar2, afdrVar6, runnable2, lxw.y(i6, false, buxVar7, 2), cfvVar3, false, buxVar7, 221184);
                        buxVar7.o();
                    }
                    buxVar7.n();
                } else {
                    buxVar7.s();
                }
                return afak.a;
            case 14:
                bux buxVar8 = (bux) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (buxVar8.I((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    nwz nwzVar = (nwz) this.a;
                    List listCd = woy.cd(nwzVar.d(), 10);
                    nxv nxvVarC = nwzVar.c();
                    boolean zE3 = buxVar8.E(nxvVarC);
                    Object objG3 = buxVar8.g();
                    if (zE3 || objG3 == buw.a) {
                        objG3 = new nwy(nxvVarC, 0);
                        buxVar8.x(objG3);
                    }
                    afec afecVar = (afec) objG3;
                    nxp nxpVarB = nwzVar.b();
                    boolean zE4 = buxVar8.E(nxpVarB);
                    Object objG4 = buxVar8.g();
                    if (zE4 || objG4 == buw.a) {
                        objG4 = new ehq(nxpVarB, 14, (char[][][]) null);
                        buxVar8.x(objG4);
                    }
                    nxm.a(listCd, afecVar, (afdr) objG4, buxVar8, 0);
                } else {
                    buxVar8.s();
                }
                return afak.a;
            case 15:
                bux buxVar9 = (bux) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (buxVar9.I((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    Object obj8 = this.a;
                    Context context = (Context) buxVar9.f(daa.b);
                    boolean zE5 = buxVar9.E(obj8) | buxVar9.E(context);
                    Object objG5 = buxVar9.g();
                    if (zE5 || objG5 == buw.a) {
                        objG5 = new nlh(obj8, context, 17, componentName);
                        buxVar9.x(objG5);
                    }
                    afdr afdrVar7 = (afdr) objG5;
                    oqc oqcVarA = ((EarthCompanionActivity) obj8).a();
                    boolean zE6 = buxVar9.E(obj8);
                    Object objG6 = buxVar9.g();
                    if (zE6 || objG6 == buw.a) {
                        objG6 = new nzf(obj8, 7);
                        buxVar9.x(objG6);
                    }
                    int i7 = oqc.c;
                    mlq.A(oqcVarA, null, afdrVar7, (afec) objG6, buxVar9, 8);
                } else {
                    buxVar9.s();
                }
                return afak.a;
            case 16:
                bux buxVar10 = (bux) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (buxVar10.I((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    czz.aw(this.a, null, false, null, null, null, null, null, null, ooi.j, buxVar10, 805306368, 510);
                } else {
                    buxVar10.s();
                }
                return afak.a;
            case 17:
                bux buxVar11 = (bux) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (buxVar11.I((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    czz.aw(this.a, null, false, null, null, null, null, null, null, ooi.e, buxVar11, 805306368, 510);
                } else {
                    buxVar11.s();
                }
                return afak.a;
            case 18:
                bux buxVar12 = (bux) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (buxVar12.I((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    czz.ax(this.a, null, false, null, null, null, null, ooi.f, buxVar12, 805306368);
                } else {
                    buxVar12.s();
                }
                return afak.a;
            case 19:
                bux buxVar13 = (bux) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (buxVar13.I((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    Object obj9 = this.a;
                    EarthPickerActivity earthPickerActivity = (EarthPickerActivity) obj9;
                    eqj eqjVar = earthPickerActivity.a().a;
                    afbe afbeVar = afbe.a;
                    bym bymVarF = bxc.f(eqjVar, afbeVar, buxVar13);
                    bym bymVarF2 = bxc.f(earthPickerActivity.a().b, afbeVar, buxVar13);
                    bym bymVarF3 = bxc.f(earthPickerActivity.a().c, null, buxVar13);
                    List listAg = roc.ag(bymVarF);
                    List listAg2 = roc.ag(bymVarF2);
                    AppWidgetProviderInfo appWidgetProviderInfo = (AppWidgetProviderInfo) bymVarF3.a();
                    boolean zE7 = buxVar13.E(obj9);
                    Object objG7 = buxVar13.g();
                    if (zE7 || objG7 == buw.a) {
                        objG7 = new nzf(obj9, 12);
                        buxVar13.x(objG7);
                    }
                    afec afecVar2 = (afec) objG7;
                    boolean zE8 = buxVar13.E(obj9);
                    Object objG8 = buxVar13.g();
                    if (zE8 || objG8 == buw.a) {
                        objG8 = new ooq(obj9, 5);
                        buxVar13.x(objG8);
                    }
                    mva.K(listAg, listAg2, appWidgetProviderInfo, afecVar2, (afdr) objG8, buxVar13, 0);
                } else {
                    buxVar13.s();
                }
                return afak.a;
            default:
                Optional optional = (Optional) obj;
                Optional optional2 = (Optional) obj2;
                Object obj10 = this.a;
                synchronized (obj10) {
                    optional.getClass();
                    optional2.getClass();
                    ((oqx) obj10).h = optional;
                    ((oqx) obj10).i = optional2;
                    optionalB = ((oqx) obj10).b();
                }
                return optionalB;
        }
    }
}
