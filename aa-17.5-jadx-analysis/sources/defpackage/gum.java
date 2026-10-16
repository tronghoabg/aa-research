package defpackage;

import android.os.Build;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Distance;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class gum {
    public static final void a(gun gunVar, bux buxVar, int i) {
        int i2;
        bux buxVarC = buxVar.c(1948944297);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gunVar) : buxVarC.E(gunVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            gab gabVar = gunVar.e;
            if (gabVar != null) {
                buxVarC.v(1631758123);
                e(gabVar, null, buxVarC, 8);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(1631802329);
                ((bvv) buxVarC).Y(false);
            }
            gab gabVar2 = gunVar.a;
            cfy cfyVarI = asl.I(cfy.e, gjk.d.k, BitmapDescriptorFactory.HUE_RED);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !buxVarC.E(gunVar))) {
                z = false;
            }
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (z || objS == buw.a) {
                objS = new goa(gunVar, 10);
                bvvVar.ad(objS);
            }
            gui.c(cfyVarI, gabVar2, (afec) objS, buxVarC, 64);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(gunVar, i, 17);
        }
    }

    public static final void b(gun gunVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVarC = buxVar.c(-1439830579);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gunVar) : buxVarC.E(gunVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i3 = 20;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            gui.b(gui.d(ca.an(cfyVar, 1), false, buxVarC, 1), null, null, bxc.i(1442994647, true, new bol(gunVar, i3), buxVarC), buxVarC, 3072, 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(gunVar, cfyVar, i, 20);
        }
    }

    public static final void c(gab gabVar, gfa gfaVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(587731176);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gabVar) : buxVarC.E(gabVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(gfaVar) : buxVarC.E(gfaVar)) ? 16 : 32;
        }
        int i4 = 0;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            buxVarC.v(-2126017720);
            gjt gjtVar = new gjt((byte[]) null);
            gjtVar.c = guz.c;
            gjtVar.o(gabVar, false, bxc.i(-636872811, true, new guk(gfaVar, gjtVar, i4), buxVarC));
            ((bvv) buxVarC).Y(false);
            czz.am(ggf.a.b(new cjv(d(buxVarC))), bxc.i(-1039141848, true, new gsl(gjtVar, 5), buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gul(gabVar, gfaVar, i, 0);
        }
    }

    public static final long d(bux buxVar) {
        bvf bvfVar = ggf.a;
        long j = ((cjv) buxVar.f(bvfVar)).a;
        float[] fArr = clj.a;
        clh clhVar = clj.y[(int) (63 & j)];
        long j2 = clhVar.b;
        if (j2 != 12884901888L) {
            ckf.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(clg.a(j2)));
        }
        clhVar.getClass();
        clo cloVar = ((clv) clhVar).p;
        float fA = (float) ((cloVar.a(cjv.d(j)) * 0.2126d) + (cloVar.a(cjv.c(j)) * 0.7152d) + (cloVar.a(cjv.b(j)) * 0.0722d));
        if (fA < BitmapDescriptorFactory.HUE_RED) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            fA = 1.0f;
        }
        return cjn.l(fA < 0.015f ? cjv.h(-4294967296L, 0.18f) : cjv.h(-72057594037927936L, 0.2f), ((cjv) buxVar.f(bvfVar)).a);
    }

    public static final void e(gab gabVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        bvv bvvVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1601069308);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(gabVar) : buxVarC.E(gabVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (buxVarC.I((i4 & 19) != 18, i4 & 1)) {
            cfv cfvVar = cfy.e;
            cfy cfyVarR = awd.r(awd.d(cfvVar, 176.0f));
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarR);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            atn atnVar = atn.a;
            int i5 = i4 & 14;
            csi csiVar = csh.b;
            cfn cfnVar = cfl.e;
            fxp.c(gabVar, 176.0f, vq.b(awd.c(cfvVar, 1.0f), 10.0f), cfnVar, csiVar, null, false, false, null, buxVarC, i5 | 28088, 992);
            if (Build.VERSION.SDK_INT >= 31) {
                buxVarC.v(1434956658);
                fxp.c(gabVar, 176.0f, cdj.b(vq.b(atnVar.b(cfvVar), 1.0f), 100.0f), cfnVar, csh.g, null, false, false, null, buxVarC, i5 | 27704, 992);
                bvvVar = bvvVar2;
                bvvVar.Y(false);
            } else {
                bvvVar = bvvVar2;
                buxVarC.v(1435195172);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
            cfyVar2 = cfvVar;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gul(gabVar, cfyVar2, i, 1, null);
        }
    }

    public static final gva f(gtl gtlVar, geu geuVar, boolean z) {
        geu geuVar2;
        cjv cjvVar;
        hju gujVar;
        Maneuver maneuver;
        CarIcon icon;
        CarColor carColor = gtlVar.a;
        if (carColor != null) {
            ghv ghvVar = ghv.a;
            ghvVar.getClass();
            geuVar2 = geuVar;
            cjvVar = new cjv(cjn.i(gbt.j(gbt.k(geuVar2, carColor, fww.l(geuVar), -1, ghvVar, 0), 0.2f)));
        } else {
            geuVar2 = geuVar;
            cjvVar = null;
        }
        gti gtiVarA = gtlVar.a(1, new gbz(gtlVar, 16));
        if (gtiVarA == null) {
            gujVar = new gup(z);
        } else if (gtiVarA instanceof gtk) {
            gtk gtkVar = (gtk) gtiVarA;
            gtk gtkVar2 = (gtk) gtlVar.a(2, new gbz(gtlVar, 17));
            Distance distance = gtkVar.e;
            String strB = distance != null ? hly.b(geuVar2, distance) : null;
            CarText carText = gtkVar.d;
            Maneuver maneuver2 = gtkVar.a;
            CarIcon icon2 = maneuver2 != null ? maneuver2.getIcon() : null;
            CarIcon carIcon = gtkVar.b;
            CarIcon carIcon2 = gtkVar.c;
            boolean z2 = false;
            if ((z || carIcon2 == null) && carIcon != null) {
                z2 = true;
            }
            if (strB == null || (icon2 == null && !z2)) {
                gujVar = null;
            } else if (z) {
                gab gabVarI = icon2 != null ? i(icon2, geuVar2) : null;
                gfs gfsVarB = gey.b(strB);
                hlv hlvVar = hlv.a;
                hlu hluVar = new hlu();
                hluVar.g = true;
                gujVar = new guu(carIcon != null ? i(carIcon, geuVar2) : null, gabVarI, gfsVarB, gey.a(geuVar2, carText, hluVar.a()), false, 48);
            } else {
                gfs gfsVarB2 = gey.b(strB);
                gab gabVarI2 = carIcon != null ? i(carIcon, geuVar2) : null;
                gab gabVarI3 = carIcon2 != null ? i(carIcon2, geuVar2) : null;
                gfg gfgVarC = gey.c(geuVar2, carText);
                gab gabVarI4 = icon2 != null ? i(icon2, geuVar2) : null;
                CarText carText2 = gtkVar2 != null ? gtkVar2.d : null;
                hlv hlvVar2 = hlv.a;
                hlu hluVar2 = new hlu();
                hluVar2.g = true;
                gujVar = new gun(gabVarI2, gabVarI4, gfsVarB2, gfgVarC, gabVarI3, (gtkVar2 == null || (maneuver = gtkVar2.a) == null || (icon = maneuver.getIcon()) == null) ? null : i(icon, geuVar2), gey.a(geuVar2, carText2, hluVar2.a()));
            }
        } else {
            if (!(gtiVarA instanceof gtm)) {
                Objects.toString(gtiVarA);
                throw new RuntimeException("Unknown turn card instruction type ".concat(gtiVarA.toString()));
            }
            gtm gtmVar = (gtm) gtiVarA;
            if (z) {
                fzy fzyVar = gtmVar.a;
                gujVar = new gus(fzyVar != null ? fxy.e(fzyVar, geuVar2) : null, gey.c(geuVar2, gtmVar.c));
            } else {
                fzy fzyVar2 = gtmVar.a;
                gujVar = new guj(fzyVar2 != null ? fxy.e(fzyVar2, geuVar2) : null, gey.c(geuVar2, gtmVar.b), gey.c(geuVar2, gtmVar.c));
            }
        }
        if (gujVar != null) {
            return new gva(gujVar, cjvVar);
        }
        return null;
    }

    public static final void g(List list, cfy cfyVar, bux buxVar, int i) {
        bxf bxfVarJ;
        hcx hcxVar;
        cfy cfyVarR;
        int i2 = i & 6;
        bux buxVarC = buxVar.c(1381313826);
        int i3 = 2;
        int i4 = 1;
        int i5 = (i2 == 0 ? (true != ((i & 8) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 2 : 4) | i : i) | 48;
        boolean z = false;
        if (buxVarC.I((i5 & 19) != 18, i5 & 1)) {
            cfv cfvVar = cfy.e;
            if (list.isEmpty()) {
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    hcxVar = new hcx(list, cfvVar, i, 5);
                    bxfVarJ.c = hcxVar;
                }
                return;
            }
            cfy cfyVarR2 = awd.r(cfvVar);
            hir hirVar = gux.e(buxVarC).c;
            ctp ctpVarA = avv.a(atd.g(16.0f), cfl.m, buxVarC, 0);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarR2);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            avy avyVar = avy.a;
            buxVarC.v(-1680959508);
            int i6 = 0;
            for (Object obj : list) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    woy.bo();
                }
                fxo fxoVar = (fxo) obj;
                int size = list.size();
                if (size == i4) {
                    buxVarC.v(1967130557);
                    float f = gux.g(buxVarC).h;
                    cfyVarR = awd.r(awd.n(cfvVar, Float.NaN, 420.0f));
                    bvvVar.Y(z);
                } else if (size == i3) {
                    buxVarC.v(1967135517);
                    cfy cfyVarB = avyVar.b(cfvVar, 1.0f, z);
                    float f2 = gux.g(buxVarC).h;
                    cfyVarR = awd.r(awd.n(cfyVarB, Float.NaN, 420.0f));
                    bvvVar.Y(z);
                } else if (size != 3) {
                    buxVarC.v(1967145025);
                    if (i6 < i3) {
                        buxVarC.v(851966684);
                        float f3 = gux.g(buxVarC).h;
                        cfyVarR = awd.n(cfvVar, Float.NaN, 420.0f);
                        bvvVar.Y(z);
                    } else {
                        buxVarC.v(852057421);
                        bvvVar.Y(z);
                        cfyVarR = cfvVar;
                    }
                    bvvVar.Y(z);
                } else {
                    buxVarC.v(1967137067);
                    if (i6 < i3) {
                        buxVarC.v(851719986);
                        cfy cfyVarB2 = avyVar.b(cfvVar, 1.0f, z);
                        float f4 = gux.g(buxVarC).h;
                        cfyVarR = awd.r(awd.n(cfyVarB2, Float.NaN, 420.0f));
                        bvvVar.Y(z);
                    } else {
                        buxVarC.v(851881837);
                        bvvVar.Y(z);
                        cfyVarR = cfvVar;
                    }
                    bvvVar.Y(z);
                }
                fwl.b(fxoVar, fwx.b, cfyVarR, null, false, null, null, null, null, buxVarC, 48, 504);
                z = z;
                bvvVar = bvvVar;
                i6 = i7;
                avyVar = avyVar;
                i3 = 2;
                i4 = 1;
                cfvVar = cfvVar;
            }
            cfyVar = cfvVar;
            bvv bvvVar2 = bvvVar;
            bvvVar2.Y(z);
            bvvVar2.Y(true);
        } else {
            buxVarC.s();
        }
        cfy cfyVar2 = cfyVar;
        bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            hcxVar = new hcx(list, cfyVar2, i, 6);
            bxfVarJ.c = hcxVar;
        }
    }

    public static final void h(final hcz hczVar, final cfy cfyVar, bux buxVar, int i) {
        int i2;
        long jK;
        float f;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(88667707);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hczVar) : buxVarC.E(hczVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            fwl fwlVar = hczVar.j;
            cjv cjvVar = null;
            fyl fylVar = fwlVar instanceof fyl ? (fyl) fwlVar : null;
            hjw hjwVar = fylVar != null ? fylVar.a : null;
            if (hjwVar == null) {
                buxVarC.v(95171540);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-689666611);
                long jA = hjwVar.a(false, buxVarC, 0);
                ((bvv) buxVarC).Y(false);
                cjvVar = new cjv(jA);
            }
            if (cjvVar == null) {
                buxVarC.v(-689662769);
                jK = gux.c(buxVarC).K();
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-689664195);
                ((bvv) buxVarC).Y(false);
                jK = cjvVar.a;
            }
            final long jR = fww.r(new cjv(gux.c(buxVarC).T()), jK, buxVarC);
            final long jR2 = fww.r(new cjv(gux.c(buxVarC).U()), jK, buxVarC);
            hcw hcwVar = hczVar.d;
            if (hcwVar == null && hczVar.e == null) {
                buxVarC.v(95973170);
                ((bvv) buxVarC).Y(false);
                f = BitmapDescriptorFactory.HUE_RED;
            } else if (hcwVar == null) {
                buxVarC.v(96070231);
                hir hirVar = gux.e(buxVarC).c;
                ((bvv) buxVarC).Y(false);
                f = 8.0f;
            } else {
                buxVarC.v(96164502);
                hir hirVar2 = gux.e(buxVarC).c;
                ((bvv) buxVarC).Y(false);
                f = 12.0f;
            }
            final bcm bcmVarD = hbv.d(hczVar.i, buxVarC);
            final long j = jK;
            final float f2 = f;
            czz.an(new bxe[]{bnm.a.b(new cjv(jR)), ggf.a.b(new cjv(jK))}, bxc.i(-1628386565, true, new afeg() { // from class: hcy
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    float f3;
                    hjw hjwVar2;
                    afeg afegVar;
                    asw aswVar;
                    hcz hczVar2;
                    afec afecVar;
                    afdr afdrVar;
                    long j2;
                    afeg afegVar2;
                    float f4;
                    cfv cfvVar;
                    hcy hcyVar;
                    bux buxVar2;
                    float f5;
                    bux buxVar3 = (bux) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (buxVar3.I((iIntValue & 3) != 2, iIntValue & 1)) {
                        hcz hczVar3 = hczVar;
                        long j3 = jR;
                        hjw hjwVar3 = new hjw(j3, j3);
                        if (!affa.f(hczVar3.i, hjz.a) || hczVar3.h.isEmpty()) {
                            buxVar3.v(391702034);
                            f3 = gux.e(buxVar3).a.e;
                            buxVar3.o();
                        } else {
                            buxVar3.v(391647350);
                            hir hirVar3 = gux.e(buxVar3).c;
                            buxVar3.o();
                            f3 = 48.0f;
                        }
                        float f6 = f3;
                        long j4 = j;
                        bcm bcmVar = bcmVarD;
                        cfy cfyVarE = afp.E(cjn.g(cfyVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bcmVar, true, 0, 1042431), j4, bcmVar);
                        afdr afdrVar2 = hczVar3.c;
                        if (afdrVar2 != null) {
                            cfyVarE = afp.x(cfyVarE, true, null, null, afdrVar2);
                        }
                        cfy cfyVarAm = ca.am(cfyVarE, 1);
                        asw aswVar2 = atd.a;
                        ctp ctpVarA = avv.a(aswVar2, cfl.m, buxVar3, 0);
                        int iG = a.g(buxVar3.b());
                        ccx ccxVarN = buxVar3.N();
                        cfy cfyVarJ = bzi.j(buxVar3, cfyVarAm);
                        afdr afdrVar3 = cwb.a;
                        buxVar3.M();
                        buxVar3.w();
                        if (buxVar3.G()) {
                            buxVar3.j(afdrVar3);
                        } else {
                            buxVar3.y();
                        }
                        afeg afegVar3 = cwb.e;
                        byq.c(buxVar3, ctpVarA, afegVar3);
                        afeg afegVar4 = cwb.d;
                        byq.c(buxVar3, ccxVarN, afegVar4);
                        Integer numValueOf = Integer.valueOf(iG);
                        afeg afegVar5 = cwb.f;
                        byq.c(buxVar3, numValueOf, afegVar5);
                        afec afecVar2 = cwb.g;
                        byq.b(buxVar3, afecVar2);
                        afeg afegVar6 = cwb.c;
                        byq.c(buxVar3, cfyVarJ, afegVar6);
                        hcv hcvVar = hczVar3.e;
                        avy avyVar = avy.a;
                        if (hcvVar == null) {
                            buxVar3.v(429842521);
                            buxVar3.o();
                            afegVar = afegVar5;
                            hjwVar2 = hjwVar3;
                            hczVar2 = hczVar3;
                            j2 = j3;
                            aswVar = aswVar2;
                            afegVar2 = afegVar4;
                            afecVar = afecVar2;
                            afdrVar = afdrVar3;
                        } else {
                            buxVar3.v(290960552);
                            hjwVar2 = hjwVar3;
                            afegVar = afegVar5;
                            aswVar = aswVar2;
                            hczVar2 = hczVar3;
                            afecVar = afecVar2;
                            afdrVar = afdrVar3;
                            j2 = j3;
                            afegVar2 = afegVar4;
                            guc.g(null, false, null, hcvVar, buxVar3, 4096, 7);
                            buxVar3 = buxVar3;
                            buxVar3.o();
                        }
                        cfv cfvVar2 = cfy.e;
                        cfy cfyVarJ2 = asl.J(avyVar.b(cfvVar2, 1.0f, true), f6, gux.e(buxVar3).b.g, f6, gux.e(buxVar3).b.g);
                        hir hirVar4 = gux.e(buxVar3).c;
                        ctp ctpVarA2 = atp.a(atd.g(8.0f), cfl.j, buxVar3, 0);
                        int iG2 = a.g(buxVar3.b());
                        ccx ccxVarN2 = buxVar3.N();
                        cfy cfyVarJ3 = bzi.j(buxVar3, cfyVarJ2);
                        buxVar3.M();
                        buxVar3.w();
                        if (buxVar3.G()) {
                            buxVar3.j(afdrVar);
                        } else {
                            buxVar3.y();
                        }
                        byq.c(buxVar3, ctpVarA2, afegVar3);
                        byq.c(buxVar3, ccxVarN2, afegVar2);
                        byq.c(buxVar3, Integer.valueOf(iG2), afegVar);
                        byq.b(buxVar3, afecVar);
                        byq.c(buxVar3, cfyVarJ3, afegVar6);
                        cfy cfyVarR = awd.r(cfvVar2);
                        ctp ctpVarA3 = avv.a(aswVar, cfl.n, buxVar3, 48);
                        int iG3 = a.g(buxVar3.b());
                        ccx ccxVarN3 = buxVar3.N();
                        cfy cfyVarJ4 = bzi.j(buxVar3, cfyVarR);
                        buxVar3.M();
                        buxVar3.w();
                        if (buxVar3.G()) {
                            buxVar3.j(afdrVar);
                        } else {
                            buxVar3.y();
                        }
                        byq.c(buxVar3, ctpVarA3, afegVar3);
                        byq.c(buxVar3, ccxVarN3, afegVar2);
                        byq.c(buxVar3, Integer.valueOf(iG3), afegVar);
                        byq.b(buxVar3, afecVar);
                        byq.c(buxVar3, cfyVarJ4, afegVar6);
                        hcz hczVar4 = hczVar2;
                        hcw hcwVar2 = hczVar4.d;
                        if (hcwVar2 == null) {
                            buxVar3.v(1116305117);
                            buxVar3.o();
                            cfvVar = cfvVar2;
                            f4 = 1.0f;
                            buxVar2 = buxVar3;
                            hcyVar = this;
                        } else {
                            buxVar3.v(1698577828);
                            bux buxVar4 = buxVar3;
                            f4 = 1.0f;
                            cfvVar = cfvVar2;
                            guc.g(null, false, hjwVar2, hcwVar2, buxVar4, 0, 3);
                            buxVar4.o();
                            hcyVar = this;
                            buxVar2 = buxVar4;
                        }
                        hdb.b(hczVar4.a, j2, hczVar4.b, jR2, asl.J(avyVar.b(cfvVar, f4, true), f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), buxVar2, 520);
                        bux buxVar5 = buxVar2;
                        List list = hczVar4.f;
                        if (list.isEmpty()) {
                            buxVar5.v(1117274953);
                            buxVar5.o();
                        } else {
                            buxVar5.v(1116725261);
                            int size = list.size() - 1;
                            int i4 = 0;
                            for (Object obj3 : list) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    woy.bo();
                                }
                                hcw hcwVar3 = (hcw) obj3;
                                boolean z = i4 == size;
                                if (i4 == 0) {
                                    buxVar5.v(460758152);
                                    hir hirVar5 = gux.e(buxVar5).c;
                                    buxVar5.o();
                                    f5 = 12.0f;
                                } else {
                                    buxVar5.v(460759336);
                                    hir hirVar6 = gux.e(buxVar5).c;
                                    buxVar5.o();
                                    f5 = 16.0f;
                                }
                                guc.g(asl.J(cfvVar, f5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), z, hjwVar2, hcwVar3, buxVar5, 0, 0);
                                i4 = i5;
                            }
                            buxVar5.o();
                        }
                        buxVar5.n();
                        List list2 = hczVar4.h;
                        if (list2.isEmpty()) {
                            buxVar5.v(-1762972083);
                            buxVar5.o();
                        } else {
                            buxVar5.v(-1763026860);
                            gum.g(list2, null, buxVar5, 0);
                            buxVar5.o();
                        }
                        buxVar5.n();
                        hcv hcvVar2 = hczVar4.g;
                        if (hcvVar2 == null) {
                            buxVar5.v(431625145);
                        } else {
                            buxVar5.v(291018056);
                            guc.g(null, false, null, hcvVar2, buxVar5, 4096, 7);
                        }
                        buxVar5.o();
                        buxVar5.n();
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 48);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(hczVar, cfyVar, i, 4);
        }
    }

    private static final gab i(CarIcon carIcon, geu geuVar) {
        return fxy.e(fxp.e(carIcon, geuVar, new gqr(14), new gqr(15), null, 24), geuVar);
    }
}
