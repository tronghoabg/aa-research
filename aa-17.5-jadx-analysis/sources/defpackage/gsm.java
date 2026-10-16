package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Distance;
import androidx.car.app.navigation.model.Step;
import java.util.List;

/* loaded from: classes2.dex */
public final class gsm {
    public static final void a(gbg gbgVar, gcq gcqVar, afdr afdrVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(464231805);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gbgVar) : buxVarC.E(gbgVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(gcqVar) : buxVarC.E(gcqVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            fwy fwyVar = new fwy(gcqVar, gcqVar == null ? gbgVar : null, afdrVar, true, new hjw(gux.c(buxVarC).P(), gux.c(buxVarC).P()), false, null);
            cfy cfyVarR = awd.r(cfy.e);
            ctp ctpVarA = avv.a(atd.a, cfl.m, buxVarC, 6);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarR);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            fww.c(fwyVar, null, fwx.f, null, null, null, null, false, null, null, buxVarC, fwy.a | 384, 1018);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gtu(gbgVar, gcqVar, afdrVar, i, 1);
        }
    }

    public static final void b(gsk gskVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(849313252);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gskVar) : buxVarC.E(gskVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i5 = 0;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            gva gvaVar = gskVar.a;
            int i6 = ((i2 >> 3) & 14) | 3072;
            if (gvaVar != null) {
                buxVarC.v(238960770);
                hge hgeVar = gskVar.c;
                hga hgaVar = gskVar.b;
                cct cctVarI = bxc.i(-229130592, true, new gsl(gvaVar, i5), buxVarC);
                cfyVar2 = cfyVar;
                hdt.e(cfyVar2, hgeVar, hgaVar, cctVarI, null, buxVarC, i6, 16);
                ((bvv) buxVarC).Y(false);
            } else {
                cfyVar2 = cfyVar;
                buxVarC.v(239190294);
                hdt.e(cfyVar2, gskVar.c, gskVar.b, bxc.i(2118458281, true, new gsl(gskVar, i4), buxVarC), null, buxVarC, i6, 16);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            cfyVar2 = cfyVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(gskVar, cfyVar2, i, 10);
        }
    }

    public static final gtk c(Step step, Distance distance, CarIcon carIcon) {
        CarText road = step.getRoad();
        gtk gtkVar = new gtk(null, step.getManeuver(), step.getLanes(), step.getLanesImage(), carIcon, step.getCue(), road, distance);
        gka.b(gtkVar, step);
        return gtkVar;
    }

    public static final void d(List list, afeg afegVar, cfy cfyVar, final int i, final int i2, afeg afegVar2, aizm aizmVar, bux buxVar, int i3) {
        int i4;
        bux buxVar2;
        int i5 = i3 & 6;
        bux buxVarC = buxVar.c(796527397);
        if (i5 == 0) {
            i4 = (true != ((i3 & 8) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != buxVarC.A(i) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != buxVarC.A(i2) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != buxVarC.E(afegVar2) ? 65536 : 131072;
        }
        if ((1572864 & i3) == 0) {
            i4 |= true != ((i3 & 2097152) == 0 ? buxVarC.C(aizmVar) : buxVarC.E(aizmVar)) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i4) != 599186, i4 & 1)) {
            Object[] objArr = new Object[0];
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new grl(3);
                bvvVar.ad(objS);
            }
            byd bydVar = (byd) byx.q(objArr, (afdr) objS, buxVarC);
            Object[] objArr2 = {list};
            boolean z = (i4 & 7168) == 2048;
            int i6 = i4;
            boolean z2 = (57344 & i4) == 16384;
            cdt cdtVar = axr.q;
            boolean z3 = z2;
            Object objS2 = bvvVar.S();
            if ((z | z3) || objS2 == obj) {
                objS2 = new afdr() { // from class: hbk
                    @Override // defpackage.afdr
                    public final Object invoke() {
                        return new axr(i, i2);
                    }
                };
                bvvVar.ad(objS2);
            }
            axr axrVar = (axr) byx.r(objArr2, cdtVar, (afdr) objS2, buxVarC, 0);
            Integer numValueOf = Integer.valueOf(axrVar.b());
            Integer numValueOf2 = Integer.valueOf(axrVar.c());
            boolean zC = ((i6 & 458752) == 131072) | buxVarC.C(axrVar);
            Object objS3 = bvvVar.S();
            if (zC || objS3 == obj) {
                objS3 = new dxa(afegVar2, axrVar, (afck) null, 10);
                bvvVar.ad(objS3);
            }
            bvq.f(numValueOf, numValueOf2, (afeg) objS3, buxVarC);
            boolean zC2 = buxVarC.C(axrVar) | ((i6 & 3670016) == 1048576 || ((i6 & 2097152) != 0 && buxVarC.E(aizmVar)));
            Object objS4 = bvvVar.S();
            if (zC2 || objS4 == obj) {
                objS4 = new ehs(aizmVar, axrVar, (afck) null, 15);
                bvvVar.ad(objS4);
            }
            bvq.f(axrVar, aizmVar, (afeg) objS4, buxVarC);
            if (afegVar != null) {
                buxVarC.v(-345572836);
                Object objS5 = bvvVar.S();
                if (objS5 == obj) {
                    gzm gzmVar = new gzm(axrVar, 4);
                    lah lahVar = byj.a;
                    bvk bvkVar = new bvk(gzmVar, null);
                    bvvVar.ad(bvkVar);
                    objS5 = bvkVar;
                }
                bym bymVar = (bym) objS5;
                List listAg = roc.ag(bymVar);
                int i7 = i6 & 112;
                Object objS6 = bvvVar.S();
                if (i7 == 32 || objS6 == obj) {
                    objS6 = new dxa(afegVar, bymVar, (afck) null, 11);
                    bvvVar.ad(objS6);
                }
                bvq.g(listAg, (afeg) objS6, buxVarC);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-345202851);
                bvvVar.Y(false);
            }
            Object objS7 = bvvVar.S();
            if (objS7 == obj) {
                objS7 = new cil();
                bvvVar.ad(objS7);
            }
            cil cilVar = (cil) objS7;
            ((ggg) buxVarC.f(ggh.a)).b(buxVarC);
            cfy cfyVarA = das.d(cfyVar, "filter-chip-row").a(new ciq(cil.a));
            hir hirVar = gux.e(buxVarC).c;
            int i8 = i6 & 14;
            asx asxVarG = atd.g(12.0f);
            boolean zC3 = (i8 == 4 || ((i6 & 8) != 0 && buxVarC.E(list))) | buxVarC.C(bydVar);
            Object objS8 = bvvVar.S();
            if (zC3 || objS8 == obj) {
                cib cibVar = new cib((Object) list, (Object) bydVar, (Object) cilVar, 17, (char[]) null);
                bvvVar.ad(cibVar);
                objS8 = cibVar;
            }
            buxVar2 = buxVarC;
            awx.d(cfyVarA, axrVar, null, asxVarG, null, null, false, null, (afec) objS8, buxVar2, 0);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nae(list, afegVar, cfyVar, i, i2, afegVar2, aizmVar, i3, 1);
        }
    }

    public static /* synthetic */ String e(int i) {
        return i != 1 ? i != 2 ? "LARGE" : "SMALL" : "ICON";
    }
}
