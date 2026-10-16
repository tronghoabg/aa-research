package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class hhf {
    public static final void a(hhg hhgVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        final hhg hhgVar2;
        final cfy cfyVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(921036608);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hhgVar) : buxVarC.E(hhgVar)) ? 2 : 4) | i;
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
            final cil cilVar = (cil) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new cil();
                bvvVar.ad(objS2);
            }
            final cil cilVar2 = (cil) objS2;
            boolean zC = buxVarC.C(hhgVar.d);
            Object objS3 = bvvVar.S();
            if (zC || objS3 == obj) {
                objS3 = adv.a(BitmapDescriptorFactory.HUE_RED);
                bvvVar.ad(objS3);
            }
            final adu aduVar = (adu) objS3;
            boolean zE = buxVarC.E(aduVar);
            Object objS4 = bvvVar.S();
            if (zE || objS4 == obj) {
                objS4 = new gfw(aduVar, (afck) null, 13, (byte[]) null);
                bvvVar.ad(objS4);
            }
            bvq.g(aduVar, (afeg) objS4, buxVarC);
            hhgVar2 = hhgVar;
            cfyVar2 = cfyVar;
            czz.am(gfl.a.b(gfl.a(true, buxVarC)), bxc.i(-45208576, true, new afeg() { // from class: hhe
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    bux buxVar2 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    int i4 = iIntValue & 3;
                    if (buxVar2.I(i4 != 2, iIntValue & 1)) {
                        cfy cfyVarC = awd.c(cfyVar2, 1.0f);
                        ctp ctpVarB = atk.b(cfl.a, false);
                        int iG = a.g(buxVar2.b());
                        ccx ccxVarN = buxVar2.N();
                        cfy cfyVarJ = bzi.j(buxVar2, cfyVarC);
                        afdr afdrVar = cwb.a;
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        adu aduVar2 = aduVar;
                        cil cilVar3 = cilVar2;
                        cil cilVar4 = cilVar;
                        hhg hhgVar3 = hhgVar2;
                        afeg afegVar = cwb.e;
                        byq.c(buxVar2, ctpVarB, afegVar);
                        afeg afegVar2 = cwb.d;
                        byq.c(buxVar2, ccxVarN, afegVar2);
                        Integer numValueOf = Integer.valueOf(iG);
                        afeg afegVar3 = cwb.f;
                        byq.c(buxVar2, numValueOf, afegVar3);
                        afec afecVar = cwb.g;
                        byq.b(buxVar2, afecVar);
                        afeg afegVar4 = cwb.c;
                        byq.c(buxVar2, cfyVarJ, afegVar4);
                        int i5 = hhgVar3.e;
                        if (i5 != 0 ? i5 != 2 : ((hjo) buxVar2.f(hjp.a)).a.compareTo(hjn.a) <= 0) {
                            buxVar2.v(-833137326);
                            cfv cfvVar = cfy.e;
                            cfy cfyVarC2 = awd.c(cfvVar, 1.0f);
                            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVar2, 0);
                            int iG2 = a.g(buxVar2.b());
                            ccx ccxVarN2 = buxVar2.N();
                            cfy cfyVarJ2 = bzi.j(buxVar2, cfyVarC2);
                            buxVar2.M();
                            buxVar2.w();
                            if (buxVar2.G()) {
                                buxVar2.j(afdrVar);
                            } else {
                                buxVar2.y();
                            }
                            byq.c(buxVar2, ctpVarA, afegVar);
                            byq.c(buxVar2, ccxVarN2, afegVar2);
                            byq.c(buxVar2, Integer.valueOf(iG2), afegVar3);
                            byq.b(buxVar2, afecVar);
                            byq.c(buxVar2, cfyVarJ2, afegVar4);
                            hha hhaVar = hhgVar3.b;
                            cfy cfyVarJ3 = bxc.j(cfvVar, cilVar4);
                            Object objG = buxVar2.g();
                            Object obj4 = buw.a;
                            if (objG == obj4) {
                                objG = new hfl(cilVar3, 11);
                                buxVar2.x(objG);
                            }
                            hhf.b(hhaVar, fxi.j(cfyVarJ3, (afec) objG), buxVar2, hha.a);
                            hju hjuVar = hhgVar3.c;
                            if (hjuVar == null) {
                                buxVar2.v(-539470876);
                                buxVar2.o();
                            } else {
                                buxVar2.v(-710138947);
                                cfy cfyVarJ4 = bxc.j(awd.c(ats.b(cfvVar, 1.0f, true), 1.0f), cilVar3);
                                Object objG2 = buxVar2.g();
                                if (objG2 == obj4) {
                                    objG2 = new hfl(cilVar4, 12);
                                    buxVar2.x(objG2);
                                }
                                gvq.g(hjuVar, bxc.t(fxi.j(cfyVarJ4, (afec) objG2), ((Number) aduVar2.d()).floatValue()), buxVar2, 0, 0);
                                buxVar2.o();
                            }
                            buxVar2.n();
                            buxVar2.o();
                        } else {
                            buxVar2.v(-833911148);
                            cfv cfvVar2 = cfy.e;
                            cfy cfyVarC3 = awd.c(cfvVar2, 1.0f);
                            ctp ctpVarA2 = avv.a(atd.a, cfl.m, buxVar2, 0);
                            int iG3 = a.g(buxVar2.b());
                            ccx ccxVarN3 = buxVar2.N();
                            cfy cfyVarJ5 = bzi.j(buxVar2, cfyVarC3);
                            buxVar2.M();
                            buxVar2.w();
                            if (buxVar2.G()) {
                                buxVar2.j(afdrVar);
                            } else {
                                buxVar2.y();
                            }
                            byq.c(buxVar2, ctpVarA2, afegVar);
                            byq.c(buxVar2, ccxVarN3, afegVar2);
                            byq.c(buxVar2, Integer.valueOf(iG3), afegVar3);
                            byq.b(buxVar2, afecVar);
                            byq.c(buxVar2, cfyVarJ5, afegVar4);
                            hha hhaVar2 = hhgVar3.b;
                            avy avyVar = avy.a;
                            cfy cfyVarJ6 = bxc.j(cfvVar2, cilVar4);
                            Object objG3 = buxVar2.g();
                            Object obj5 = buw.a;
                            if (objG3 == obj5) {
                                objG3 = new hfl(cilVar3, 9);
                                buxVar2.x(objG3);
                            }
                            hhf.c(hhaVar2, fxi.j(cfyVarJ6, (afec) objG3), buxVar2, hha.a);
                            hju hjuVar2 = hhgVar3.c;
                            if (hjuVar2 == null) {
                                buxVar2.v(1189602813);
                                buxVar2.o();
                            } else {
                                buxVar2.v(-238720380);
                                cfy cfyVarJ7 = bxc.j(asl.J(awd.c(avyVar.b(cfvVar2, 1.0f, true), 1.0f), BitmapDescriptorFactory.HUE_RED, gux.e(buxVar2).b.g, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), cilVar3);
                                Object objG4 = buxVar2.g();
                                if (objG4 == obj5) {
                                    objG4 = new hfl(cilVar4, 10);
                                    buxVar2.x(objG4);
                                }
                                gvq.g(hjuVar2, bxc.t(fxi.j(cfyVarJ7, (afec) objG4), ((Number) aduVar2.d()).floatValue()), buxVar2, 0, 0);
                                buxVar2.o();
                            }
                            buxVar2.n();
                            buxVar2.o();
                        }
                        buxVar2.n();
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 56);
            fxi.i(cilVar2, buxVarC, 6);
        } else {
            hhgVar2 = hhgVar;
            cfyVar2 = cfyVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new heu((Object) hhgVar2, cfyVar2, i, 9);
        }
    }

    public static final void b(hha hhaVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        Integer num;
        int i3;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(474722631);
        if (i4 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(hhaVar) : buxVarC.E(hhaVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfy cfyVarT = awd.t(asl.J(awd.r(cfyVar), gux.e(buxVarC).a.d, BitmapDescriptorFactory.HUE_RED, gux.e(buxVarC).a.g, BitmapDescriptorFactory.HUE_RED), null, 3);
            ctp ctpVarA = avv.a(atd.a, cfl.n, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarT);
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
            fxb fxbVar = hhaVar.c;
            if (fxbVar == null) {
                buxVarC.v(-1767281240);
                bvvVar.Y(false);
                num = null;
                i3 = 0;
            } else {
                buxVarC.v(-1767281239);
                cfv cfvVar = cfy.e;
                cfy cfyVarI = awd.i(cfvVar, gux.g(buxVarC).g.c);
                ctp ctpVarB = atk.b(cfl.e, false);
                int iG2 = a.g(bvvVar.u);
                ccx ccxVarAh2 = bvvVar.ah();
                cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarI);
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
                num = null;
                fxa.a(fxbVar, null, buxVarC, fxb.a, 2);
                bvvVar.Y(true);
                asl.A(awd.m(cfvVar, gux.e(buxVarC).a.g), buxVarC);
                i3 = 0;
                bvvVar.Y(false);
            }
            Iterator it = hhaVar.b.iterator();
            int i5 = i3;
            while (true) {
                if (!it.hasNext()) {
                    i5 = -1;
                    break;
                } else if (((hhd) it.next()).c) {
                    break;
                } else {
                    i5++;
                }
            }
            Integer numValueOf2 = Integer.valueOf(i5);
            Integer num2 = numValueOf2.intValue() == -1 ? num : numValueOf2;
            tr.k(num2 != null ? num2.intValue() : i3, awd.n(cfy.e, Float.NaN, 720.0f), 0L, 0L, hgz.a, hgz.b, bxc.i(768110433, true, new gsl(hhaVar, 17), buxVarC), buxVarC, 1794096);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new heu((Object) hhaVar, cfyVar, i, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020c A[LOOP:0: B:77:0x0206->B:79:0x020c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.hha r18, defpackage.cfy r19, defpackage.bux r20, int r21) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhf.c(hha, cfy, bux, int):void");
    }
}
