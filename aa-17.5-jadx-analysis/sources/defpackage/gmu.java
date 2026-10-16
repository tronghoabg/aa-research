package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class gmu {
    public static final void a(gud gudVar, bux buxVar, int i) {
        int i2;
        bux buxVarC = buxVar.c(-381403148);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gudVar) : buxVarC.E(gudVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            avp avpVarD = fww.d(false, null, null, buxVarC, 6);
            fwm fwmVar = gudVar.i;
            if (fwmVar == null) {
                buxVarC.v(2102440784);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(2102440785);
                fwl.a(fwmVar, null, null, false, null, null, new dlj((avpVarD.b(dlr.a) - 2.0f) + BitmapDescriptorFactory.HUE_RED), new dlj((((avr) avpVarD).a - 2.0f) + BitmapDescriptorFactory.HUE_RED), buxVarC, 8, 62);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(gudVar, i, 16);
        }
    }

    public static final void b(gue gueVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        List listB;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(476201885);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gueVar) : buxVarC.E(gueVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            deu deuVar = gueVar.a;
            deuVar.getClass();
            dfw dfwVar = czz.av(buxVarC).i;
            hjw hjwVar = gueVar.b;
            if (hjwVar == null) {
                buxVarC.v(253551723);
                ((bvv) buxVarC).Y(false);
                listB = null;
            } else {
                buxVarC.v(-1931483562);
                listB = hjwVar.b(buxVarC);
                ((bvv) buxVarC).Y(false);
            }
            buxVar2 = buxVarC;
            fww.m(null, deuVar, listB, 1, 0, dfwVar, 0L, 3, null, 0, null, null, false, buxVar2, 3072, 0, 8017);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(gueVar, i, 15);
        }
    }

    public static final void c(gud gudVar, cfy cfyVar, bux buxVar, int i) {
        bux buxVar2;
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1494152643);
        int i4 = i3 == 0 ? (true != ((i & 8) == 0 ? buxVarC.C(gudVar) : buxVarC.E(gudVar)) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i4 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i4 & 19) != 18, i4 & 1)) {
            List listBi = woy.bi(new gue(gudVar.e, gudVar.f), new gue(fwl.v(null, null, null, false, gudVar.b, buxVarC, 0, 31).a, null), new gue(gudVar.c, gudVar.d), new gue(fwl.v(null, null, null, false, gudVar.g, buxVarC, 0, 31).a, null));
            ArrayList arrayList = new ArrayList();
            for (Object obj : listBi) {
                deu deuVar = ((gue) obj).a;
                if (deuVar != null && deuVar.a() != 0) {
                    arrayList.add(obj);
                }
            }
            buxVar2 = buxVarC;
            i2 = 18;
            ca.ao(cfyVar, atd.e, null, cfl.o, 0, 1, bxc.i(781974946, true, new bol(arrayList, 17), buxVarC), buxVar2, ((i4 >> 3) & 14) | 1772592, 20);
        } else {
            buxVar2 = buxVarC;
            i2 = 18;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(gudVar, cfyVar, i, i2);
        }
    }

    public static final void d(bux buxVar, int i) {
        bux buxVarC = buxVar.c(220036191);
        int i2 = 0;
        if (buxVarC.I(i != 0, i & 1)) {
            fww.n(asl.I(cfy.e, gjk.b.k, BitmapDescriptorFactory.HUE_RED), null, 0, 0, czz.av(buxVarC).i, 0L, null, 0, null, buxVarC, 48, 0, 4060);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gug(i, i2);
        }
    }

    public static final void e(gud gudVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(524565957);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gudVar) : buxVarC.E(gudVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            czz.am(ggf.a.b(new cjv(czz.at(buxVarC).p)), bxc.i(643449477, true, new guk(cfyVar, gudVar, i4), buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(gudVar, cfyVar, i, 17);
        }
    }

    public static final void f(gud gudVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        List listB;
        boolean z;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-501961180);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gudVar) : buxVarC.E(gudVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            deu deuVar = gudVar.e;
            List listB2 = null;
            if (deuVar == null) {
                buxVarC.v(1150690746);
                ((bvv) buxVarC).Y(false);
                z = false;
            } else {
                buxVarC.v(1150690747);
                dfw dfwVar = czz.av(buxVarC).i;
                hjw hjwVar = gudVar.f;
                if (hjwVar == null) {
                    buxVarC.v(475774504);
                    ((bvv) buxVarC).Y(false);
                    listB = null;
                } else {
                    buxVarC.v(430989561);
                    listB = hjwVar.b(buxVarC);
                    ((bvv) buxVarC).Y(false);
                }
                List list = listB;
                z = false;
                fww.m(null, deuVar, list, 1, 0, dfwVar, 0L, 0, null, 0, null, null, false, buxVarC, 3072, 0, 8145);
                buxVarC = buxVarC;
                ((bvv) buxVarC).Y(false);
            }
            buxVarC.v(-1348346728);
            des desVar = new des();
            buxVarC.v(-1348346548);
            int iA = desVar.a(new dfm(gux.c(buxVarC).T(), 0L, null, null, null, null, null, 0L, null, null, 0L, null, null, 65534));
            bux buxVar3 = buxVarC;
            try {
                desVar.i(fwl.v(null, null, null, false, gudVar.b, buxVar3, 0, 31).a);
                desVar.h(iA);
                bvv bvvVar = (bvv) buxVar3;
                bvvVar.Y(z);
                if (gudVar.c != null) {
                    buxVar3.v(-418587165);
                    iA = desVar.a(new dfm(gux.c(buxVar3).T(), 0L, null, null, null, null, null, 0L, null, null, 0L, null, null, 65534));
                    try {
                        desVar.f(" • ");
                        desVar.h(iA);
                        bvvVar.Y(z);
                    } finally {
                    }
                } else {
                    buxVar3.v(-418484338);
                    bvvVar.Y(z);
                }
                hjw hjwVar2 = gudVar.d;
                if (hjwVar2 == null) {
                    buxVar3.v(-418235564);
                } else {
                    buxVar3.v(-1260417459);
                    listB2 = hjwVar2.b(buxVar3);
                }
                bvvVar.Y(z);
                if (listB2 == null) {
                    listB2 = afbe.a;
                }
                iA = desVar.a(new dfm(fww.q(woy.bZ(listB2, new cjv(gux.c(buxVar3).U())), 0L, 0, buxVar3, 14), 0L, null, null, null, null, null, 0L, null, null, 0L, null, null, 65534));
                try {
                    desVar.i(gudVar.c);
                    desVar.h(iA);
                    deu deuVarB = desVar.b();
                    bvvVar.Y(z);
                    dfw dfwVar2 = czz.av(buxVar3).l;
                    buxVar2 = buxVar3;
                    fww.m(null, deuVarB, null, 1, 0, dfwVar2, 0L, 0, null, 0, null, null, false, buxVar2, 3072, 0, 8149);
                } finally {
                }
            } finally {
            }
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(gudVar, i, 14);
        }
    }

    public static final void g(gud gudVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1121734795);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gudVar) : buxVarC.E(gudVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            czz.am(ggf.a.b(new cjv(czz.at(buxVarC).p)), bxc.i(393471029, true, new bmc(cfyVar, gudVar, 20), buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(gudVar, cfyVar, i, 15);
        }
    }

    public static final void h(gud gudVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        afeg afegVar;
        afec afecVar;
        afeg afegVar2;
        afeg afegVar3;
        afdr afdrVar;
        afeg afegVar4;
        int i3;
        bvv bvvVar;
        bux buxVarC = buxVar.c(2073819929);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gudVar) : buxVarC.E(gudVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (buxVarC.I((i4 & 19) != 18, i4 & 1)) {
            cfv cfvVar = cfy.e;
            ctp ctpVarA = avv.a(atd.a, cfl.n, buxVarC, 48);
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfvVar);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            afeg afegVar5 = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar5);
            afeg afegVar6 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar6);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar7 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar7);
            afec afecVar2 = cwb.g;
            byq.b(buxVarC, afecVar2);
            afeg afegVar8 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar8);
            fwm fwmVar = gudVar.i;
            if (fwmVar == null) {
                buxVarC.v(-729199623);
                bvvVar2.Y(false);
                i3 = i4;
                cfyVar2 = cfvVar;
                bvvVar = bvvVar2;
                afecVar = afecVar2;
                afegVar2 = afegVar7;
                afegVar3 = afegVar6;
                afdrVar = afdrVar2;
                afegVar4 = afegVar5;
                afegVar = afegVar8;
            } else {
                buxVarC.v(-729199622);
                afegVar = afegVar8;
                cfyVar2 = cfvVar;
                afecVar = afecVar2;
                afegVar2 = afegVar7;
                afegVar3 = afegVar6;
                afdrVar = afdrVar2;
                afegVar4 = afegVar5;
                i3 = i4;
                bvvVar = bvvVar2;
                fwl.a(fwmVar, null, null, false, null, null, null, null, buxVarC, 8, 254);
                asl.A(awd.i(cfyVar2, gjk.d.k), buxVarC);
                bvvVar.Y(false);
            }
            ctp ctpVarA2 = atp.a(atd.c, cfl.j, buxVarC, 0);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVar2);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA2, afegVar4);
            byq.c(buxVarC, ccxVarAh2, afegVar3);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar2);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar);
            f(gudVar, buxVarC, (i3 & 14) | gud.a);
            bvvVar.Y(true);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(gudVar, cfyVar2, i, 16);
        }
    }

    public static final void i(cfy cfyVar, gfa gfaVar, gab gabVar, bux buxVar, int i) {
        bux buxVar2;
        cfy cfyVar2;
        cfv cfvVar;
        boolean z;
        bvv bvvVar;
        bux buxVarC = buxVar.c(-1260479349);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(gfaVar) : buxVarC.E(gfaVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(gabVar) : buxVarC.E(gabVar)) ? 128 : 256;
        }
        int i3 = i2;
        if (buxVarC.I((i3 & 147) != 146, i3 & 1)) {
            cfv cfvVar2 = cfy.e;
            cfr cfrVar = cfl.n;
            cfy cfyVarD = das.d(cfvVar2, "trip_info");
            ctp ctpVarA = avv.a(atd.a, cfrVar, buxVarC, 48);
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarD);
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
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar4);
            if (gabVar != null) {
                buxVarC.v(1707368151);
                cfy cfyVarI = awd.i(cfvVar2, 72.0f);
                ctp ctpVarB = atk.b(cfl.e, false);
                int iG2 = a.g(bvvVar2.u);
                ccx ccxVarAh2 = bvvVar2.ah();
                cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarI);
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
                cfvVar = cfvVar2;
                bvvVar = bvvVar2;
                fxp.c(gabVar, 56.0f, cjn.g(awd.i(cfvVar2, 56.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bcr.a, true, 0, 1042431), null, null, null, false, false, null, buxVarC, ((i3 >> 6) & 14) | 56, 1016);
                z = true;
                bvvVar.Y(true);
                asl.A(awd.i(cfvVar, gjk.d.k), buxVarC);
                bvvVar.Y(false);
            } else {
                cfvVar = cfvVar2;
                z = true;
                bvvVar = bvvVar2;
                buxVarC.v(1707648763);
                bvvVar.Y(false);
            }
            buxVar2 = buxVarC;
            fzc.h(gfaVar, gabVar == null ? asl.I(cfvVar, gjk.b.k, BitmapDescriptorFactory.HUE_RED) : cfvVar, 2, 0, 0L, czz.av(buxVarC).l, 0L, null, 0, 0, null, null, null, false, false, buxVar2, ((i3 >> 3) & 14) | 384, 0, 65496);
            bvvVar.Y(true);
            cfyVar2 = cfvVar;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gtu(cfyVar2, gfaVar, gabVar, i, 2);
        }
    }
}
