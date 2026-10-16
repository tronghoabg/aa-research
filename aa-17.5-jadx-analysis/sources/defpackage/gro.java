package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class gro {
    public static final yob a = yob.c("com/android/car/libraries/apphost/media/overlay/ui/OverlayLayoutKt");

    public static final void a(fwm fwmVar, grh grhVar, bux buxVar, int i) {
        int i2;
        grh grhVar2;
        cil cilVar;
        cil cilVar2;
        cfv cfvVar;
        cil cilVar3;
        cil cilVar4;
        bvv bvvVar;
        bux buxVarC = buxVar.c(89426576);
        if ((i & 6) == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(fwmVar) : buxVarC.E(fwmVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(grhVar) : buxVarC.E(grhVar)) ? 16 : 32;
        }
        int i3 = 0;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new cil();
                bvvVar2.ad(objS);
            }
            cil cilVar5 = (cil) objS;
            boolean zD = buxVarC.D(fwmVar == null);
            Object objS2 = bvvVar2.S();
            if (zD || objS2 == obj) {
                objS2 = fwmVar != null ? new cil() : null;
                bvvVar2.ad(objS2);
            }
            cil cilVar6 = (cil) objS2;
            cfv cfvVar2 = cfy.e;
            boolean zC = buxVarC.C(cilVar6);
            Object objS3 = bvvVar2.S();
            if (zC || objS3 == obj) {
                objS3 = new grn(cilVar6, cilVar5, i3);
                bvvVar2.ad(objS3);
            }
            cfy cfyVarBe = ca.be(bxc.k(cfvVar2, (afec) objS3));
            float f = gjk.d.k;
            ctp ctpVarA = atp.a(atd.g(f), cfl.j, buxVarC, 0);
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarBe);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
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
            int i4 = i2;
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar4);
            cfy cfyVarR = awd.r(cfvVar2);
            ctp ctpVarB = atk.b(cfl.a, false);
            int iG2 = a.g(bvvVar2.u);
            ccx ccxVarAh2 = bvvVar2.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarR);
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            atn atnVar = atn.a;
            if (fwmVar == null) {
                buxVarC.v(-616099873);
                bvvVar2.Y(false);
                bvvVar = bvvVar2;
                cilVar3 = cilVar5;
                cilVar2 = cilVar6;
                cfvVar = cfvVar2;
                cilVar4 = null;
            } else {
                buxVarC.v(-616099872);
                gvl gvlVar = (gvl) buxVarC.f(gfp.a);
                fwm fwmVarA = fwm.a(fwmVar, null, null, fwx.e, 3);
                cfy cfyVarM = bxc.m(atnVar.a(cfvVar2, cfl.c).a(!gvlVar.g ? asl.J(cfvVar2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED) : cfvVar2), gip.c.g, gux.f(buxVarC).a.d);
                if (cilVar6 != null) {
                    cilVar = null;
                    cfyVarM = ca.be(fxi.k(bxc.j(cfyVarM, cilVar6), null, cilVar5, null, null));
                } else {
                    cilVar = null;
                }
                cfy cfyVarD = das.d(cfyVarM, "overlayAction");
                cilVar2 = cilVar6;
                cfvVar = cfvVar2;
                cilVar3 = cilVar5;
                cilVar4 = cilVar;
                bvvVar = bvvVar2;
                fwl.a(fwmVarA, cfyVarD, null, false, null, null, null, null, buxVarC, 8, 252);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
            grhVar2 = grhVar;
            gks.l(grhVar2, ca.be(fxi.k(bxc.j(awd.r(cfvVar), cilVar3), cilVar2, cilVar4, cilVar4, cilVar4)), buxVarC, (i4 >> 3) & 14);
            bvvVar.Y(true);
        } else {
            grhVar2 = grhVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(fwmVar, grhVar2, i, 5);
        }
    }

    public static final void b(fwm fwmVar, grh grhVar, bux buxVar, int i) {
        int i2;
        cfv cfvVar;
        int i3;
        bvv bvvVar;
        bux buxVarC = buxVar.c(2066284750);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fwmVar) : buxVarC.E(fwmVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(grhVar) : buxVarC.E(grhVar)) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfv cfvVar2 = cfy.e;
            ctp ctpVarA = atp.a(atd.g(gjk.d.k), cfl.j, buxVarC, 0);
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfvVar2);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            if (fwmVar == null) {
                buxVarC.v(1990939141);
                bvvVar2.Y(false);
                i3 = i2;
                cfvVar = cfvVar2;
                bvvVar = bvvVar2;
            } else {
                buxVarC.v(1990939142);
                cfvVar = cfvVar2;
                i3 = i2;
                bvvVar = bvvVar2;
                fwl.a(fwm.a(fwmVar, null, null, fwx.e, 3), das.d(bxc.m(cfvVar2, gip.c.g, gux.f(buxVarC).a.d), "overlayAction"), null, false, null, null, null, null, buxVarC, 8, 252);
                bvvVar.Y(false);
            }
            gmk.j(grhVar, das.d(cfvVar, "mediaFab"), buxVarC, ((i3 >> 3) & 14) | 48);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(fwmVar, grhVar, i, 7);
        }
    }

    public static final void c(fwm fwmVar, grh grhVar, bux buxVar, int i) {
        int i2;
        grh grhVar2;
        int i3;
        cil cilVar;
        cil cilVar2;
        cfv cfvVar;
        bvv bvvVar;
        bux buxVarC = buxVar.c(-315961152);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(fwmVar) : buxVarC.E(fwmVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(grhVar) : buxVarC.E(grhVar)) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new cil();
                bvvVar2.ad(objS);
            }
            cil cilVar3 = (cil) objS;
            boolean zD = buxVarC.D(fwmVar == null);
            Object objS2 = bvvVar2.S();
            if (zD || objS2 == obj) {
                objS2 = fwmVar != null ? new cil() : null;
                bvvVar2.ad(objS2);
            }
            cil cilVar4 = (cil) objS2;
            cfv cfvVar2 = cfy.e;
            boolean zC = buxVarC.C(cilVar4);
            Object objS3 = bvvVar2.S();
            if (zC || objS3 == obj) {
                objS3 = new grn(cilVar4, cilVar3, i4);
                bvvVar2.ad(objS3);
            }
            cfy cfyVarBe = ca.be(bxc.k(cfvVar2, (afec) objS3));
            ctp ctpVarA = avv.a(atd.g(gjk.d.k), cfl.o, buxVarC, 48);
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarBe);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            if (fwmVar != null) {
                buxVarC.v(-2118682506);
                fwm fwmVarA = fwm.a(fwmVar, null, null, fwx.e, 3);
                cfy cfyVarM = bxc.m(cfvVar2, gip.c.g, gux.f(buxVarC).a.d);
                if (cilVar4 != null) {
                    cfyVarM = ca.be(fxi.k(bxc.j(cfyVarM, cilVar4), null, null, null, cilVar3));
                }
                i3 = i2;
                bvvVar = bvvVar2;
                cilVar = cilVar3;
                cilVar2 = cilVar4;
                cfvVar = cfvVar2;
                fwl.a(fwmVarA, das.d(cfyVarM, "overlayAction"), null, false, null, null, null, null, buxVarC, 8, 252);
                bvvVar.Y(false);
            } else {
                i3 = i2;
                cilVar = cilVar3;
                cilVar2 = cilVar4;
                cfvVar = cfvVar2;
                bvvVar = bvvVar2;
                buxVarC.v(-2118275042);
                bvvVar.Y(false);
            }
            grhVar2 = grhVar;
            gmk.g(grhVar2, ca.be(fxi.k(bxc.j(awd.b(cfvVar, 1.0f), cilVar), null, null, cilVar2, null)), buxVarC, (i3 >> 3) & 14);
            bvvVar.Y(true);
        } else {
            grhVar2 = grhVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(fwmVar, grhVar2, i, 6);
        }
    }

    public static final void d(gvi gviVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        fwm fwmVarA;
        boolean z;
        int i3;
        bux buxVarC = buxVar.c(-2048027904);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gviVar) : buxVarC.E(gviVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            gvl gvlVar = (gvl) buxVarC.f(gfp.a);
            gri griVar = (gri) gviVar;
            hju hjuVar = griVar.a;
            hju hjuVar2 = griVar.b;
            long jK = gux.c(buxVarC).K();
            hjw hjwVar = new hjw(jK, jK);
            ctp ctpVarB = atk.b(cfl.a, false);
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
            byq.c(buxVarC, ctpVarB, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar4);
            buxVarC.v(-393067925);
            fwm fwmVar = hjuVar2 instanceof fwm ? (fwm) hjuVar2 : null;
            if (fwmVar != null) {
                fxo fxoVarC = fwmVar.b;
                if (fxoVarC instanceof fwy) {
                    fwy fwyVar = (fwy) fxoVarC;
                    hjw hjwVar2 = fwyVar.f;
                    fxoVarC = fwy.c(fwyVar, null, hjwVar2 != null ? hjwVar2 : hjwVar, false, null, 111);
                }
                fwmVarA = fwm.a(fwmVar, null, fxoVarC, null, 5);
            } else {
                fwmVarA = null;
            }
            if (hjuVar instanceof grh) {
                buxVarC.v(-392665732);
                bvvVar.Y(false);
                boolean zA = buxVarC.A(gvlVar.ordinal());
                Object objS = bvvVar.S();
                if (zA || objS == buw.a) {
                    objS = new dxi(gvlVar, (afck) null, 11);
                    bvvVar.ad(objS);
                }
                bvq.g(gvlVar, (afeg) objS, buxVarC);
                gvl gvlVar2 = gvl.a;
                int iOrdinal = gvlVar.ordinal();
                if (iOrdinal == 1 || iOrdinal == 2) {
                    z = false;
                    buxVarC.v(-1536680595);
                    a(fwmVarA, (grh) hjuVar, buxVarC, 8);
                    bvvVar.Y(false);
                } else if (iOrdinal == 3) {
                    z = false;
                    buxVarC.v(-1536678296);
                    c(fwmVarA, (grh) hjuVar, buxVarC, 8);
                    bvvVar.Y(false);
                } else if (iOrdinal != 4) {
                    buxVarC.v(-392258950);
                    z = false;
                    bvvVar.Y(false);
                } else {
                    z = false;
                    buxVarC.v(-1536675921);
                    b(fwmVarA, (grh) hjuVar, buxVarC, 8);
                    bvvVar.Y(false);
                }
            } else {
                buxVarC.v(-392941539);
                cfv cfvVar = cfy.e;
                ctp ctpVarA = atp.a(atd.g(gjk.d.k), cfl.k, buxVarC, 48);
                int iG2 = a.g(bvvVar.u);
                ccx ccxVarAh2 = bvvVar.ah();
                cfy cfyVarJ2 = bzi.j(buxVarC, cfvVar);
                buxVarC.w();
                if (bvvVar.t) {
                    buxVarC.j(afdrVar);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarA, afegVar);
                byq.c(buxVarC, ccxVarAh2, afegVar2);
                byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
                byq.b(buxVarC, afecVar);
                byq.c(buxVarC, cfyVarJ2, afegVar4);
                if (hjuVar2 == null) {
                    buxVarC.v(-426058983);
                    z = false;
                    bvvVar.Y(false);
                    i3 = 48;
                } else {
                    z = false;
                    buxVarC.v(-1953406488);
                    i3 = 48;
                    gvq.g(hjuVar2, cfvVar, buxVarC, 48, 0);
                    bvvVar.Y(false);
                }
                gvq.g(hjuVar, cfvVar, buxVarC, i3, z ? 1 : 0);
                bvvVar.Y(true);
                bvvVar.Y(z);
            }
            bvvVar.Y(z);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(gviVar, cfyVar, i, 8);
        }
    }
}
