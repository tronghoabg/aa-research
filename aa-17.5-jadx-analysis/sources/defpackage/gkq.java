package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class gkq {
    public static Uri a(String str, String str2) {
        str.getClass();
        woy.N(!TextUtils.isEmpty(str2));
        return new Uri.Builder().authority("lettertile").appendPath("contact").appendQueryParameter("name", str).appendQueryParameter("lookupKey", str2).appendQueryParameter("renderingVersion", Integer.toString(4)).build();
    }

    public static final void b(gqh gqhVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        hjw hjwVar;
        fwm fwmVarA;
        fwd fwdVar;
        fwe fweVar;
        boolean z;
        fwd fwdVar2;
        fwd fwdVar3;
        fwd fwdVar4;
        fwd fwdVar5;
        fwd fwdVar6;
        fwd fwdVar7;
        bcm bcmVar;
        float f;
        fwd fwdVar8;
        gqhVar.getClass();
        bux buxVarC = buxVar.c(747346949);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gqhVar) : buxVarC.E(gqhVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarD = dyz.d(gqhVar.a, null, buxVarC);
            bym bymVarD2 = dyz.d(gqhVar.h, null, buxVarC);
            bym bymVarD3 = dyz.d(gqhVar.i, false, buxVarC);
            if (((ggk) buxVarC.f(ggo.a)).f()) {
                buxVarC.v(-896956568);
                fwe fweVarH = h(bymVarD2);
                hjw hjwVarB = (fweVarH == null || (fwdVar8 = fweVarH.b) == null) ? null : gjs.b(fwdVar8);
                hjw hjwVar2 = hjw.a;
                hjw hjwVarD = gjs.d(hjwVarB, buxVarC);
                ((bvv) buxVarC).Y(false);
                hjwVar = hjwVarD;
            } else {
                buxVarC.v(-896868808);
                ((bvv) buxVarC).Y(false);
                hjwVar = null;
            }
            fwm fwmVar = (fwm) bymVarD.a();
            if (fwmVar == null) {
                buxVarC.v(-896788549);
                ((bvv) buxVarC).Y(false);
                fwmVarA = null;
            } else {
                buxVarC.v(-896788548);
                fwi fwiVar = fwmVar.a;
                fxl fxlVar = fwiVar instanceof fxl ? (fxl) fwiVar : null;
                fxo fxoVar = fwmVar.b;
                fwy fwyVar = fxoVar instanceof fwy ? (fwy) fxoVar : null;
                if (fxlVar != null) {
                    buxVarC.v(-848309887);
                    buxVarC.v(-1822840966);
                    fwe fweVar2 = fxlVar.e;
                    if (fweVar2 == null || (fwdVar2 = fweVar2.a) == null || (fwdVar3 = fweVar2.b) == null || (fwdVar4 = fweVar2.c) == null || (fwdVar5 = fweVar2.f) == null || (fwdVar6 = fweVar2.d) == null || (fwdVar7 = fweVar2.e) == null) {
                        gks.d("CarApp.H.Media", "All ActionButtonColors parameters must be specified in order to apply the ActionButtonColors");
                        ((bvv) buxVarC).Y(false);
                        fweVar = null;
                    } else {
                        fwe fweVar3 = new fwe(gjs.c(fwdVar2, buxVarC), gjs.c(fwdVar3, buxVarC), gjs.c(fwdVar4, buxVarC), gjs.c(fwdVar6, buxVarC), gjs.c(fwdVar7, buxVarC), gjs.c(fwdVar5, buxVarC), null, null);
                        ((bvv) buxVarC).Y(false);
                        fweVar = fweVar3;
                    }
                    if (gqhVar.g) {
                        buxVarC.v(111186659);
                        boolean zBl = ca.bl(buxVarC);
                        ((bvv) buxVarC).Y(false);
                        z = zBl;
                    } else {
                        buxVarC.v(-848215007);
                        ((bvv) buxVarC).Y(false);
                        z = true;
                    }
                    fwmVarA = fwm.a(fwmVar, fxl.e(fxlVar, null, fweVar, z, gqhVar.j && ((Boolean) bymVarD3.a()).booleanValue(), 175), null, null, 6);
                    ((bvv) buxVarC).Y(false);
                } else if (fwyVar != null) {
                    buxVarC.v(-847851087);
                    fwe fweVarH2 = h(bymVarD2);
                    hjw hjwVarB2 = (fweVarH2 == null || (fwdVar = fweVarH2.a) == null) ? null : gjs.b(fwdVar);
                    hjw hjwVar3 = hjw.a;
                    fwmVarA = fwm.a(fwmVar, null, fwy.c(fwyVar, null, gjs.d(hjwVarB2, buxVarC), false, null, 111), null, 5);
                    ((bvv) buxVarC).Y(false);
                } else {
                    buxVarC.v(-847556433);
                    ((bvv) buxVarC).Y(false);
                    fwmVarA = null;
                }
                ((bvv) buxVarC).Y(false);
            }
            cfy cfyVarD = das.d(cfyVar, "playPauseButton");
            if (gqhVar.j) {
                buxVarC.v(940941055);
                if (((Boolean) bymVarD3.a()).booleanValue()) {
                    f = gjk.d.k;
                } else {
                    float f2 = gpp.a;
                    f = 100.0f;
                }
                bym bymVarA = ady.a(f, new aft(1.0f, 1500.0f, null), null, null, buxVarC, 48, 12);
                boolean z2 = buxVarC.z(((dlj) bymVarA.a()).a);
                bvv bvvVar = (bvv) buxVarC;
                Object objS = bvvVar.S();
                if (z2 || objS == buw.a) {
                    objS = bcr.b(((dlj) bymVarA.a()).a);
                    bvvVar.ad(objS);
                }
                bcmVar = (bcm) objS;
                bvvVar.Y(false);
            } else {
                buxVarC.v(940942953);
                bcmVar = gux.f(buxVarC).a.g;
                ((bvv) buxVarC).Y(false);
            }
            hjw hjwVar4 = hjw.a;
            gjy.b(fwmVarA, cfyVarD, hjwVar, bcmVar, buxVarC, 8, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gox(gqhVar, cfyVar, i, 15);
        }
    }

    public static final void c(gqc gqcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        boolean z;
        boolean z2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(460604537);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(gqcVar) : buxVarC.E(gqcVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            gpk gpkVar = gqcVar.b;
            aiyk aiykVar = gpkVar.a;
            gfs gfsVar = gey.b;
            bym bymVarD = dyz.d(aiykVar, gfsVar, buxVarC);
            bym bymVarD2 = dyz.d(gpkVar.b, gfsVar, buxVarC);
            bym bymVarD3 = dyz.d(gpkVar.c, null, buxVarC);
            bym bymVarD4 = dyz.d(gqcVar.f, null, buxVarC);
            bym bymVarD5 = dyz.d(gqcVar.e, false, buxVarC);
            cfm cfmVar = cfl.k;
            ctp ctpVarA = atp.a(atd.e, cfmVar, buxVarC, 54);
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
            cfv cfvVar = cfy.e;
            cfy cfyVarB = ats.b(cfvVar, 1.0f, true);
            ctp ctpVarB = atk.b(cfl.h, false);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarB);
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
            e(a.ae(bymVarD3), false, buxVarC, 56);
            bvvVar.Y(true);
            float f = gjk.e.k;
            cfy cfyVarJ3 = asl.J(cfvVar, f, f, f, BitmapDescriptorFactory.HUE_RED);
            float f2 = gpu.a;
            cfy cfyVarF = awd.f(cfyVarJ3, gpu.a);
            ctp ctpVarA2 = atp.a(atd.c, cfmVar, buxVarC, 54);
            int iG3 = a.g(bvvVar.u);
            ccx ccxVarAh3 = bvvVar.ah();
            cfy cfyVarJ4 = bzi.j(buxVarC, cfyVarF);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA2, afegVar);
            byq.c(buxVarC, ccxVarAh3, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG3), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ4, afegVar4);
            fzc.h(a.af(bymVarD), null, 0, 0, gux.c(buxVarC).T(), czz.av(buxVarC).d, 0L, null, 0, 3, null, null, null, false, false, buxVarC, 0, 0, 64974);
            bux buxVar3 = buxVarC;
            if (a.af(bymVarD2).a()) {
                buxVar3.v(-77404073);
                fzc.h(a.af(bymVarD2), asl.J(cfvVar, BitmapDescriptorFactory.HUE_RED, gjk.b.k, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), true != ((Boolean) bymVarD5.a()).booleanValue() ? 2 : 1, true != ((Boolean) bymVarD5.a()).booleanValue() ? 2 : 1, gux.c(buxVar3).U(), czz.av(buxVar3).l, 0L, null, 0, 3, null, null, null, false, false, buxVar3, 0, 0, 64960);
                buxVar3 = buxVar3;
                bvvVar.Y(false);
                z = false;
            } else if (((Boolean) bymVarD5.a()).booleanValue()) {
                z = false;
                buxVar3.v(-76767395);
                bvvVar.Y(false);
            } else {
                buxVar3.v(-77017503);
                z = false;
                brp.b("", asl.J(cfvVar, BitmapDescriptorFactory.HUE_RED, gjk.b.k, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), 0L, 0L, null, 0L, new dkt(3), 0L, 2, false, 0, 2, czz.av(buxVar3).l, buxVar3, 6, 196992, 93180);
                buxVar3 = buxVar3;
                bvvVar.Y(false);
            }
            gab gabVarAe = a.ae(bymVarD4);
            if (gabVarAe == null) {
                buxVar3.v(-76729204);
                bvvVar.Y(z);
                buxVar2 = buxVar3;
                z2 = true;
            } else {
                buxVar3.v(-76729203);
                cfy cfyVarJ5 = asl.J(cfvVar, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                ctp ctpVarB2 = atk.b(cfl.a, z);
                int iG4 = a.g(bvvVar.u);
                ccx ccxVarAh4 = bvvVar.ah();
                cfy cfyVarJ6 = bzi.j(buxVar3, cfyVarJ5);
                buxVar3.w();
                if (bvvVar.t) {
                    buxVar3.j(afdrVar);
                } else {
                    buxVar3.y();
                }
                byq.c(buxVar3, ctpVarB2, afegVar);
                byq.c(buxVar3, ccxVarAh4, afegVar2);
                byq.c(buxVar3, Integer.valueOf(iG4), afegVar3);
                byq.b(buxVar3, afecVar);
                byq.c(buxVar3, cfyVarJ6, afegVar4);
                float f3 = gpp.a;
                fxp.c(gabVarAe, BitmapDescriptorFactory.HUE_RED, awd.f(cfvVar, 20.0f), null, null, new cjv(gux.c(buxVar3).v()), false, false, null, buxVar3, 56, 984);
                buxVar2 = buxVar3;
                z2 = true;
                bvvVar.Y(true);
                bvvVar.Y(z);
            }
            bvvVar.Y(z2);
            bvvVar.Y(z2);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gox(gqcVar, cfyVar, i, 12);
        }
    }

    public static final void d(gqc gqcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(2027967676);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(gqcVar) : buxVarC.E(gqcVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarD = dyz.d(gqcVar.e, false, buxVarC);
            bym bymVarD2 = dyz.d(gqcVar.b.c, null, buxVarC);
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVarC, 0);
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
            cfv cfvVar = cfy.e;
            int i4 = i2;
            cfy cfyVarB = ats.b(cfvVar, 1.0f, true);
            float f = gjk.e.k;
            cfy cfyVarR = awd.r(asl.J(cfyVarB, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f));
            ctp ctpVarA2 = avv.a(atd.g, cfl.n, buxVarC, 54);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarR);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA2, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            gkd.h(gqcVar, avy.a.b(cfvVar, 1.0f, true), buxVarC, i4 & 14);
            asl.A(awd.m(cfvVar, gjk.f.k), buxVarC);
            e(a.ae(bymVarD2), true, buxVarC, 56);
            bvvVar.Y(true);
            if (((Boolean) bymVarD.a()).booleanValue()) {
                buxVarC.v(-1465541378);
                gvq.g(gqcVar.d, asl.J(cfvVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f), buxVarC, 0, 0);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1465451044);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gox(gqcVar, cfyVar, i, 11);
        }
    }

    public static final void e(gab gabVar, boolean z, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(371671564);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gabVar) : buxVarC.E(gabVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfv cfvVar = cfy.e;
            float f = gpu.a;
            cfy cfyVarAv = ca.av(awd.l(cjn.g(cfvVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gpu.b, true, 0, 1042431), Float.NaN, 176.0f, Float.NaN, z ? 400.0f : 520.0f), true);
            if (gabVar != null) {
                buxVarC.v(42334543);
                fxp.c(gabVar, BitmapDescriptorFactory.HUE_RED, cfyVarAv, null, null, null, false, false, null, buxVarC, (i2 & 14) | 56, 1016);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(42413903);
                gpm.b(cfyVarAv, buxVarC, 0);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gpv(gabVar, z, i, 0);
        }
    }

    public static final void f(gqc gqcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        gqc gqcVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-570421671);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gqcVar) : buxVarC.E(gqcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarD = dyz.d(gqcVar.e, false, buxVarC);
            bym bymVarD2 = dyz.d(gqcVar.b.c, null, buxVarC);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new ncp((byte[]) null);
                bvvVar.ad(objS);
            }
            ncp ncpVar = (ncp) objS;
            gqcVar2 = gqcVar;
            gjy.c(a.ae(bymVarD2), gka.f(cfyVar, ncpVar), bxc.i(1949043101, true, new brf(gqcVar2, ncpVar, bymVarD, 12, (short[]) null), buxVarC), buxVarC, 392);
        } else {
            gqcVar2 = gqcVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gox(gqcVar2, cfyVar, i, 13);
        }
    }

    public static final void g(gqc gqcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        gqc gqcVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(452469510);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gqcVar) : buxVarC.E(gqcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarD = dyz.d(gqcVar.e, false, buxVarC);
            bym bymVarD2 = dyz.d(gqcVar.b.c, null, buxVarC);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new ncp((byte[]) null);
                bvvVar.ad(objS);
            }
            ncp ncpVar = (ncp) objS;
            gqcVar2 = gqcVar;
            gjy.c(a.ae(bymVarD2), gka.f(cfyVar, ncpVar), bxc.i(2020400202, true, new brf(gqcVar2, ncpVar, bymVarD, 13, (short[]) null), buxVarC), buxVarC, 392);
        } else {
            gqcVar2 = gqcVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gox(gqcVar2, cfyVar, i, 14);
        }
    }

    private static final fwe h(bym bymVar) {
        return (fwe) bymVar.a();
    }
}
