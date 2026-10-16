package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes2.dex */
public final class fup {
    private static final yob a = yob.c("com/android/car/libraries/apphost/actionswidget/ActionsWidgetKt");

    public static final void a(List list, cfy cfyVar, afeh afehVar, bux buxVar, int i, int i2) {
        int i3;
        cfy cfyVar2;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(1983633732);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.E(afehVar) ? 128 : 256;
        }
        if (buxVarC.I((i3 & 147) != 146, i3 & 1)) {
            if (i5 != 0) {
                cfyVar = cfy.e;
            }
            cfy cfyVar3 = cfyVar;
            ca.M(!list.isEmpty(), cfyVar3, acl.a(new agl(200, 0, aev.d), 0.1f), null, null, afehVar, buxVarC, (i3 & 112) | ((i3 << 9) & 458752), 24);
            cfyVar2 = cfyVar3;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmi(list, cfyVar2, afehVar, i, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.fuq r20, defpackage.cfy r21, float r22, defpackage.dlj r23, defpackage.cil r24, defpackage.bux r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fup.b(fuq, cfy, float, dlj, cil, bux, int, int):void");
    }

    public static final void c(fuq fuqVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-854665444);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fuqVar) : buxVarC.E(fuqVar)) ? 2 : 4) | i;
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
            List list = fuqVar.f;
            cil cilVar = (cil) objS;
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && buxVarC.E(fuqVar));
            Object objS2 = bvvVar.S();
            if (z || objS2 == obj) {
                objS2 = new dxa(fuqVar, cilVar, (afck) null, 6);
                bvvVar.ad(objS2);
            }
            bvq.g(list, (afeg) objS2, buxVarC);
            cfy cfyVarC = awd.c(cfyVar, 1.0f);
            hga hgaVar = fuqVar.g;
            cfy cfyVarB = hdv.b(hdv.c(cfyVarC, hgaVar, false), hgaVar, false);
            if (fuqVar.h) {
                cfyVarB = cfyVarB.a(new aix(cjn.i(0), ckq.a));
            }
            ca.at(cfyVarB, cfl.e, bxc.i(-1073052282, true, new fun(fuqVar, cilVar, i4), buxVarC), buxVarC, 3120, 4);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(fuqVar, cfyVar, i, 4, null);
        }
    }

    public static final void d(fuq fuqVar, cfy cfyVar, cil cilVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-386735798);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fuqVar) : buxVarC.E(fuqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cilVar) ? 128 : 256;
        }
        boolean z = false;
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            ctp ctpVarA = atp.a(atd.g, cfl.k, buxVarC, 54);
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
            if (fuqVar.e != null || fuqVar.d.a()) {
                buxVarC.v(-1899950139);
                ((ynz) a.h().o(ypi.a, "CarApp.H.ActionsWidget").ai(1)).u("Trying to set ActionsWidget with icon or secondary text in a narrow short layout. This isn't supported.");
                ((gns) buxVarC.f(gnt.a)).b();
                z = false;
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1899553246);
                bvvVar.Y(false);
            }
            hdd.i(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, fuqVar.c, null, buxVarC, 0, 223);
            cfy cfyVarC = hdv.c(awd.r(ats.b(cfy.e, 1.0f, true)), fuqVar.g, false);
            ctp ctpVarB = atk.b(cfl.a, false);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarC);
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
            bvvVar.Y(true);
            a(fuqVar.f, null, bxc.i(-2114203579, true, new fun(fuqVar, cilVar, 3), buxVarC), buxVarC, 384, 2);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw((Object) fuqVar, cfyVar, (Object) cilVar, i, 7);
        }
    }

    public static final void e(fuq fuqVar, cfy cfyVar, cil cilVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        boolean z;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(754475090);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fuqVar) : buxVarC.E(fuqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cilVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            atc atcVar = atd.c;
            cfm cfmVar = cfl.j;
            ctp ctpVarA = atp.a(atcVar, cfmVar, buxVarC, 0);
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
            ctp ctpVarA2 = avv.a(atd.g(gjk.a.k), cfl.m, buxVarC, 0);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarB);
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
            fzv fzvVar = fuqVar.e;
            gfa gfaVar = fuqVar.c;
            gfa gfaVar2 = fuqVar.d;
            avy avyVar = avy.a;
            buxVar2 = buxVarC;
            hdd.h(64.0f, avyVar.c(avyVar.b(cfvVar, 1.0f, true), cfl.n), fzvVar, new dlj(24.0f), gfaVar, gfaVar2, buxVar2, (fzv.a << 6) | 3078, 0);
            hju hjuVar = fuqVar.b;
            if (hjuVar == null) {
                buxVar2.v(2010666380);
                bvvVar.Y(false);
                z = true;
            } else {
                buxVar2.v(-766423787);
                z = true;
                gvq.g(hjuVar, null, buxVar2, 0, 1);
                bvvVar.Y(false);
            }
            bvvVar.Y(z);
            cfy cfyVarC = hdv.c(awd.r(cfvVar), fuqVar.g, false);
            ctp ctpVarB = atk.b(cfl.a, false);
            int iG3 = a.g(bvvVar.u);
            ccx ccxVarAh3 = bvvVar.ah();
            cfy cfyVarJ3 = bzi.j(buxVar2, cfyVarC);
            buxVar2.w();
            if (bvvVar.t) {
                buxVar2.j(afdrVar);
            } else {
                buxVar2.y();
            }
            byq.c(buxVar2, ctpVarB, afegVar);
            byq.c(buxVar2, ccxVarAh3, afegVar2);
            byq.c(buxVar2, Integer.valueOf(iG3), afegVar3);
            byq.b(buxVar2, afecVar);
            byq.c(buxVar2, cfyVarJ3, afegVar4);
            bvvVar.Y(true);
            dlj dljVar = ((ggk) buxVar2.f(ggo.a)).x() ? new dlj(124.0f) : null;
            a(fuqVar.f, null, bxc.i(64410125, true, new fum(fuqVar, cilVar, dljVar == null ? cfl.k : cfmVar, dljVar, 0), buxVar2), buxVar2, 384, 2);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw((Object) fuqVar, cfyVar, (Object) cilVar, i, 6);
        }
    }

    public static final void f(fuq fuqVar, cfy cfyVar, cil cilVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(662570981);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fuqVar) : buxVarC.E(fuqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cilVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            cfr cfrVar = cfl.n;
            cfy cfyVarR = awd.r(cfyVar);
            ctp ctpVarA = avv.a(atd.a, cfrVar, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarR);
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
            List list = fuqVar.f;
            avy avyVar = avy.a;
            cfv cfvVar = cfy.e;
            a(list, avyVar.b(cfvVar, 1.5f, true), bxc.i(860536028, true, new fun(fuqVar, cilVar, 4), buxVarC), buxVarC, 384, 0);
            cfy cfyVarC = hdv.c(awd.b(avyVar.b(cfvVar, 1.0f, true), 1.0f), fuqVar.g, false);
            ctp ctpVarB = atk.b(cfl.a, false);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarC);
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
            atn atnVar = atn.a;
            buxVarC = buxVarC;
            hdd.i(atnVar.a(asl.H(cfvVar, gjk.f.k), cfl.e), 128.0f, BitmapDescriptorFactory.HUE_RED, new dlj(36.0f), fuqVar.e, fuqVar.c, fuqVar.d, buxVarC, (fzv.a << 12) | 3120, 132);
            hju hjuVar = fuqVar.b;
            if (hjuVar == null) {
                buxVarC.v(2137686877);
            } else {
                buxVarC.v(-1177968348);
                gvq.g(hjuVar, atnVar.a(cfvVar, cfl.c), buxVarC, 0, 0);
            }
            bvvVar.Y(false);
            bvvVar.Y(true);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw((Object) fuqVar, cfyVar, (Object) cilVar, i, 8);
        }
    }
}
