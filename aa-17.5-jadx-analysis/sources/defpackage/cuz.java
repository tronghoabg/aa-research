package defpackage;

import android.graphics.RectF;
import com.google.android.apps.auto.components.coolwalk.compose.viewcompat.CarButton;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class cuz implements afeg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cuz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [dfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [afec, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        cmw cmwVarB = null;
        switch (this.b) {
            case 0:
                cxb cxbVar = (cxb) obj;
                ctl ctlVar = cxbVar.x;
                Object obj3 = this.a;
                if (ctlVar == null) {
                    ctl ctlVar2 = new ctl(cxbVar, ((cvc) obj3).a);
                    cxbVar.x = ctlVar2;
                    ctlVar = ctlVar2;
                }
                cvc cvcVar = (cvc) obj3;
                cvcVar.b = ctlVar;
                cvcVar.a().k();
                ctl ctlVarA = cvcVar.a();
                cvf cvfVar = cvcVar.a;
                if (ctlVarA.c != cvfVar) {
                    ctlVarA.c = cvfVar;
                    ctlVarA.l(false);
                    ctlVarA.a.X(false, true, true);
                }
                return afak.a;
            case 1:
                return Float.valueOf(tt.d((cun) obj, true, (cuu[]) this.a, ((Float) obj2).floatValue()));
            case 2:
                ((cvc) this.a).a().b = (bvb) obj2;
                return afak.a;
            case 3:
                ctl ctlVarA2 = ((cvc) this.a).a();
                ((cxb) obj).ad(new cth(ctlVarA2, (afeg) obj2, ctlVarA2.k));
                return afak.a;
            case 4:
                return Float.valueOf(tt.d((cun) obj, false, (cuu[]) this.a, ((Float) obj2).floatValue()));
            case 5:
                return Float.valueOf(tt.d((cun) obj, true, (cuu[]) this.a, ((Float) obj2).floatValue()));
            case 6:
                bux buxVar = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    ((czd) this.a).b(buxVar, 0);
                } else {
                    buxVar.s();
                }
                return afak.a;
            case 7:
                return Boolean.valueOf(this.a.a(ckf.g((RectF) obj), ckf.g((RectF) obj2)));
            case 8:
                bux buxVar2 = (bux) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (buxVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    ((kmb) this.a).q(buxVar2, 0);
                } else {
                    buxVar2.s();
                }
                return afak.a;
            case 9:
                bux buxVar3 = (bux) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (buxVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    Object obj4 = this.a;
                    cfv cfvVar = cfy.e;
                    boolean zE = buxVar3.E(obj4);
                    Object objG = buxVar3.g();
                    if (zE || objG == buw.a) {
                        objG = new daz(obj4, 13);
                        buxVar3.x(objG);
                    }
                    cfy cfyVarA = bxc.k(cfvVar, (afec) objG).a(ajs.a);
                    ctp ctpVarB = atk.b(cfl.a, false);
                    long jB = buxVar3.b();
                    long j = jB ^ (jB >>> 32);
                    ccx ccxVarN = buxVar3.N();
                    cfy cfyVarJ = bzi.j(buxVar3, cfyVarA);
                    afdr afdrVar = cwb.a;
                    buxVar3.M();
                    buxVar3.w();
                    if (buxVar3.G()) {
                        buxVar3.j(afdrVar);
                    } else {
                        buxVar3.y();
                    }
                    byq.c(buxVar3, ctpVarB, cwb.e);
                    byq.c(buxVar3, ccxVarN, cwb.d);
                    byq.c(buxVar3, Integer.valueOf((int) j), cwb.f);
                    buxVar3.i(afak.a, new alx(cwb.g, 16));
                    byq.c(buxVar3, cfyVarJ, cwb.c);
                    afeg afegVar = (afeg) ((kmf) obj4).b.a();
                    if (afegVar == null) {
                        buxVar3.v(57824944);
                    } else {
                        buxVar3.v(278959985);
                        afegVar.invoke(buxVar3, 0);
                    }
                    buxVar3.o();
                    buxVar3.n();
                } else {
                    buxVar3.s();
                }
                return afak.a;
            case 10:
                bux buxVar4 = (bux) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (buxVar4.I((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    ((kmh) this.a).a(buxVar4, 0);
                } else {
                    buxVar4.s();
                }
                return afak.a;
            case 11:
                bux buxVar5 = (bux) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (buxVar5.I((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    Object obj5 = this.a;
                    czz.am(kmi.a.b(obj5), bxc.i(316376156, true, new cuz(obj5, 10), buxVar5), buxVar5, 48);
                } else {
                    buxVar5.s();
                }
                return afak.a;
            case 12:
                int iIntValue6 = ((Integer) obj2).intValue();
                ?? r0 = this.a;
                bpc bpcVar = ksr.a;
                return roc.aD(r0, (bux) obj, iIntValue6);
            case 13:
                return roc.aD(this.a, (bux) obj, ((Integer) obj2).intValue());
            case 14:
                bux buxVar6 = (bux) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (buxVar6.I((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    Object obj6 = this.a;
                    CarButton carButton = (CarButton) obj6;
                    kvx kvxVar = ((kwb) carButton.b.a()).f;
                    Integer numValueOf = Integer.valueOf(carButton.g.e());
                    if (numValueOf.intValue() <= 0) {
                        numValueOf = null;
                    }
                    if (numValueOf == null) {
                        buxVar6.v(-1684764028);
                    } else {
                        buxVar6.v(-1684764027);
                        cmwVarB = dao.b(numValueOf.intValue(), buxVar6, 0);
                    }
                    buxVar6.o();
                    String str = (String) carButton.d.a();
                    ksy ksyVar = (ksy) carButton.c.a();
                    long j2 = ((cjv) carButton.e.a()).a;
                    long j3 = ((cjv) carButton.f.a()).a;
                    boolean zE2 = buxVar6.E(obj6);
                    Object objG2 = buxVar6.g();
                    if (zE2 || objG2 == buw.a) {
                        objG2 = new deh(obj6, 15);
                        buxVar6.x(objG2);
                    }
                    ksy ksyVar2 = ksy.a;
                    kvxVar.a(cmwVarB, str, ksyVar, j2, j3, (afdr) objG2, buxVar6, 8);
                } else {
                    buxVar6.s();
                }
                return afak.a;
            case 15:
                bux buxVar7 = (bux) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (buxVar7.I((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    GhIcon ghIcon = ((nmj) this.a).c;
                    if (ghIcon != null) {
                        buxVar7.v(-2133633113);
                        ca.bb(lgi.f(ghIcon, BitmapDescriptorFactory.HUE_RED, buxVar7, 3), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, buxVar7, 56, 124);
                        buxVar7.o();
                    } else {
                        buxVar7.v(-2133553350);
                        buxVar7.o();
                    }
                } else {
                    buxVar7.s();
                }
                return afak.a;
            case 16:
                bux buxVar8 = (bux) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i = iIntValue9 & 3;
                int i2 = iIntValue9 & 1;
                int i3 = nni.a;
                if (buxVar8.I(i != 2, i2)) {
                    GhIcon ghIcon2 = ((nnl) this.a).d;
                    if (ghIcon2 != null) {
                        buxVar8.v(1424007276);
                        ca.bb(lgi.f(ghIcon2, BitmapDescriptorFactory.HUE_RED, buxVar8, 3), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, buxVar8, 56, 124);
                        buxVar8.o();
                    } else {
                        buxVar8.v(1424098571);
                        buxVar8.o();
                    }
                } else {
                    buxVar8.s();
                }
                return afak.a;
            default:
                afco afcoVar = tby.a;
                if (((Boolean) this.a.invoke(obj)).booleanValue()) {
                    return obj2;
                }
                return null;
        }
    }
}
