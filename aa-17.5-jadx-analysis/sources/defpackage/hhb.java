package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class hhb implements afeh {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ hhb(bpc bpcVar, hhd hhdVar, asf asfVar, int i) {
        this.d = i;
        this.a = bpcVar;
        this.b = hhdVar;
        this.c = asfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [hju, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v51, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v58, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jV;
        int i = 13;
        int i2 = 14;
        int i3 = 4;
        switch (this.d) {
            case 0:
                bux buxVar = (bux) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ats) obj).getClass();
                if (buxVar.I((iIntValue & 17) != 16, iIntValue & 1)) {
                    cfy cfyVarR = awd.r(cfy.e);
                    ctp ctpVarA = atp.a(atd.c, cfl.k, buxVar, 48);
                    int iG = a.g(buxVar.b());
                    ccx ccxVarN = buxVar.N();
                    cfy cfyVarJ = bzi.j(buxVar, cfyVarR);
                    afdr afdrVar = cwb.a;
                    buxVar.M();
                    buxVar.w();
                    if (buxVar.G()) {
                        buxVar.j(afdrVar);
                    } else {
                        buxVar.y();
                    }
                    Object obj4 = this.c;
                    Object obj5 = this.b;
                    Object obj6 = this.a;
                    byq.c(buxVar, ctpVarA, cwb.e);
                    byq.c(buxVar, ccxVarN, cwb.d);
                    byq.c(buxVar, Integer.valueOf(iG), cwb.f);
                    byq.b(buxVar, cwb.g);
                    byq.c(buxVar, cfyVarJ, cwb.c);
                    czz.am(bpe.b.b(obj6), bxc.i(-1803728827, true, new guk(obj5, obj4, i, null), buxVar), buxVar, 56);
                    hhd hhdVar = (hhd) obj5;
                    boolean z = hhdVar.c;
                    if (z) {
                        buxVar.v(-1504637346);
                        jV = gux.c(buxVar).G();
                        buxVar.o();
                    } else {
                        buxVar.v(-1504586537);
                        jV = gux.c(buxVar).v();
                        buxVar.o();
                    }
                    fzc.h(hhdVar.a, null, 0, 0, jV, hhc.e(z, buxVar), 0L, null, 0, 0, null, null, null, false, false, buxVar, 0, 0, 65486);
                    buxVar.n();
                } else {
                    buxVar.s();
                }
                break;
            case 1:
                atm atmVar = (atm) obj;
                bux buxVar2 = (bux) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                atmVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= true == buxVar2.C(atmVar) ? 4 : 2;
                }
                if (buxVar2.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    hju hjuVar = ((hcl) this.b).b;
                    if (hjuVar == null) {
                        buxVar2.v(64229541);
                        buxVar2.o();
                    } else {
                        Object obj7 = this.c;
                        buxVar2.v(-690664740);
                        cfy cfyVarJ2 = bxc.j(atmVar.a(cfy.e, cfl.e), (cil) obj7);
                        Object objG = buxVar2.g();
                        if (objG == buw.a) {
                            objG = new goa(this.a, 19);
                            buxVar2.x(objG);
                        }
                        gvq.g(hjuVar, fxi.j(cfyVarJ2, (afec) objG), buxVar2, 0, 0);
                        buxVar2.o();
                    }
                } else {
                    buxVar2.s();
                }
                break;
            case 2:
                kzt kztVar = (kzt) obj;
                bux buxVar3 = (bux) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kztVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= true == ((iIntValue3 & 8) == 0 ? buxVar3.C(kztVar) : buxVar3.E(kztVar)) ? 4 : 2;
                }
                if (buxVar3.I((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                    Object obj8 = kztVar.b;
                    if (obj8 == null) {
                        buxVar3.v(1389791153);
                        buxVar3.o();
                    } else {
                        ?? r4 = this.b;
                        buxVar3.v(1389791154);
                        Object obj9 = kztVar.a;
                        fxn fxnVar = (fxn) r4;
                        int i4 = fxnVar.f;
                        boolean z2 = fxnVar.e;
                        int i5 = i4 - 1;
                        ksy ksyVar = i5 != 0 ? i5 != 1 ? jts.c.e : jts.b.e : jts.a.e;
                        cfy cfyVarE = gut.e(this.a, r4);
                        bcm bcmVarB = i5 != 0 ? i5 != 1 ? bcr.b(jts.c.d) : bcr.b(jts.b.d) : bcr.b(jts.a.d);
                        boolean zE = buxVar3.E(r4);
                        Object objG2 = buxVar3.g();
                        if (zE || objG2 == buw.a) {
                            objG2 = new gzm(r4, 20);
                            buxVar3.x(objG2);
                        }
                        khc.i((cmw) obj8, (afdr) objG2, cfyVarE, ksyVar, z2, false, bcmVarB, null, (ktf) obj9, (bmr) this.c, null, null, buxVar3, 8, 0, 3232);
                        buxVar3.o();
                    }
                } else {
                    buxVar3.s();
                }
                break;
            case 3:
                cfy cfyVar = (cfy) obj;
                bux buxVar4 = (bux) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                cfyVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= true == buxVar4.C(cfyVar) ? 4 : 2;
                }
                if (buxVar4.I((iIntValue4 & 19) != 18, iIntValue4 & 1)) {
                    Object obj10 = this.c;
                    Object obj11 = this.b;
                    cfy cfyVarJ3 = bxc.j(cfyVar, (cil) obj10);
                    Object objG3 = buxVar4.g();
                    if (objG3 == buw.a) {
                        objG3 = new hku(this.a, i2);
                        buxVar4.x(objG3);
                    }
                    jup.c(((gdh) obj11).c, fxi.j(cfyVarJ3, (afec) objG3), buxVar4, 0);
                } else {
                    buxVar4.s();
                }
                break;
            case 4:
                cfy cfyVar2 = (cfy) obj;
                bux buxVar5 = (bux) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                cfyVar2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= true == buxVar5.C(cfyVar2) ? 4 : 2;
                }
                if (buxVar5.I((iIntValue5 & 19) != 18, iIntValue5 & 1)) {
                    Object obj12 = this.a;
                    Object obj13 = this.b;
                    Object objG4 = buxVar5.g();
                    if (objG4 == buw.a) {
                        objG4 = new hku(obj12, i);
                        buxVar5.x(objG4);
                    }
                    juq.a(((gdh) obj13).b, fxi.j(cfyVar2, (afec) objG4), (cil) this.c, (cil) obj12, buxVar5, 3456, 0);
                } else {
                    buxVar5.s();
                }
                break;
            case 5:
                tiw tiwVar = (tiw) obj;
                bux buxVar6 = (bux) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i6 = kkz.a;
                tiwVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= true == ((iIntValue6 & 8) == 0 ? buxVar6.C(tiwVar) : buxVar6.E(tiwVar)) ? 4 : 2;
                }
                if (buxVar6.I((iIntValue6 & 19) != 18, iIntValue6 & 1)) {
                    kkf kkfVarAo = roc.ao(this.c);
                    if (kkfVarAo instanceof kkc) {
                        ?? r5 = this.b;
                        buxVar6.v(-1713584928);
                        Iterator it = r5.iterator();
                        while (it.hasNext()) {
                            int i7 = iIntValue6 & 14;
                            Object obj14 = this.a;
                            int iIntValue7 = ((Number) it.next()).intValue();
                            std.f(tiwVar, jun.c(((kjz) obj14).a.a, iIntValue7), new tje(((Number) ((kkc) kkfVarAo).a).intValue() == iIntValue7), false, null, buxVar6, i7, 58);
                        }
                        buxVar6.o();
                    } else {
                        buxVar6.v(222349031);
                        Objects.toString(kkfVarAo);
                        std.f(tiwVar, "Current status: ".concat(String.valueOf(kkfVarAo)), null, false, null, buxVar6, iIntValue6 & 14, 62);
                        buxVar6.o();
                    }
                } else {
                    buxVar6.s();
                }
                break;
            case 6:
                bux buxVar7 = (bux) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((avx) obj).getClass();
                if (buxVar7.I((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    Object obj15 = this.b;
                    Object obj16 = this.a;
                    Object obj17 = this.c;
                    ksy ksyVar2 = ksy.a;
                    khc.f((cmw) obj17, (deu) obj16, (ksy) obj15, null, buxVar7, 8, 8);
                } else {
                    buxVar7.s();
                }
                break;
            default:
                bux buxVar8 = (bux) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((abu) obj).getClass();
                if (buxVar8.I((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    Object obj18 = this.a;
                    Object obj19 = this.c;
                    cfv cfvVar = cfy.e;
                    int i8 = mcr.a;
                    cfy cfyVarJ4 = bxc.j(awd.i(asl.J(cfvVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, mcq.a, BitmapDescriptorFactory.HUE_RED), 64.0f), (cil) obj19);
                    boolean zC = buxVar8.C(obj18);
                    Object objG5 = buxVar8.g();
                    if (zC || objG5 == buw.a) {
                        objG5 = new mcm(obj18, i3);
                        buxVar8.x(objG5);
                    }
                    cfy cfyVarL = bxc.l(cfyVarJ4, (afec) objG5);
                    ctp ctpVarB = atk.b(cfl.e, false);
                    int iG2 = a.g(buxVar8.b());
                    ccx ccxVarN2 = buxVar8.N();
                    cfy cfyVarJ5 = bzi.j(buxVar8, cfyVarL);
                    afdr afdrVar2 = cwb.a;
                    buxVar8.M();
                    buxVar8.w();
                    if (buxVar8.G()) {
                        buxVar8.j(afdrVar2);
                    } else {
                        buxVar8.y();
                    }
                    ?? r11 = this.b;
                    byq.c(buxVar8, ctpVarB, cwb.e);
                    byq.c(buxVar8, ccxVarN2, cwb.d);
                    byq.c(buxVar8, Integer.valueOf(iG2), cwb.f);
                    byq.b(buxVar8, cwb.g);
                    byq.c(buxVar8, cfyVarJ5, cwb.c);
                    khc.l(dao.b(R.drawable.ic_close_white, buxVar8, 0), r11, null, null, false, null, null, null, null, buxVar8, 8, 0, 4092);
                    buxVar8.n();
                } else {
                    buxVar8.s();
                }
                break;
        }
        return afak.a;
    }

    public /* synthetic */ hhb(Object obj, cil cilVar, cil cilVar2, int i) {
        this.d = i;
        this.b = obj;
        this.c = cilVar;
        this.a = cilVar2;
    }

    public /* synthetic */ hhb(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ hhb(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }
}
