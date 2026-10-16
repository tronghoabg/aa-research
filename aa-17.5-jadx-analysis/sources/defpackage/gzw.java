package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.BannerElement;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class gzw {
    public static void a(fzj fzjVar, hcl hclVar, hju hjuVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        boolean z;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1631879004);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fzjVar) : buxVarC.E(fzjVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(hclVar) : buxVarC.E(hclVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(hjuVar) : buxVarC.E(hjuVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            final float fEA = ((dlg) buxVarC.f(dbc.d)).eA(108.0f);
            int i4 = i2 & 112;
            boolean z2 = (i4 == 32 || ((i2 & 64) != 0 && buxVarC.C(hclVar))) | buxVarC.z(fEA);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (z2 || objS == buw.a) {
                objS = Float.valueOf((hclVar.c > 0 || hclVar.d > 0) ? fEA : BitmapDescriptorFactory.HUE_RED);
                bvvVar.ad(objS);
            }
            float fFloatValue = ((Number) objS).floatValue();
            Object objS2 = bvvVar.S();
            Object obj = buw.a;
            if (objS2 == obj) {
                objS2 = new ParcelableSnapshotMutableFloatState(fFloatValue);
                bvvVar.ad(objS2);
            }
            final byb bybVar = (byb) objS2;
            if (i4 != 32) {
                z = (i2 & 64) != 0 && buxVarC.C(hclVar);
            } else {
                z = true;
                i4 = 32;
            }
            Object objS3 = bvvVar.S();
            if (z || objS3 == obj) {
                axr axrVar = new axr(hclVar.c, hclVar.d);
                bvvVar.ad(axrVar);
                objS3 = axrVar;
            }
            final axr axrVar2 = (axr) objS3;
            boolean z3 = buxVarC.z(bybVar.e()) | buxVarC.C(axrVar2);
            Object objS4 = bvvVar.S();
            if (z3 || objS4 == obj) {
                afdr afdrVar = new afdr() { // from class: gzu
                    @Override // defpackage.afdr
                    public final Object invoke() {
                        float f = fEA;
                        return Float.valueOf(1.0f - (Math.max(axrVar2.b() > 0 ? f : Math.min(f, r1.c()), bybVar.e()) / f));
                    }
                };
                lah lahVar = byj.a;
                objS4 = new bvk(afdrVar, null);
                bvvVar.ad(objS4);
            }
            bym bymVar = (bym) objS4;
            boolean z4 = (i4 == 32 || ((i2 & 64) != 0 && buxVarC.C(hclVar))) | buxVarC.z(fEA);
            Object objS5 = bvvVar.S();
            if (z4 || objS5 == obj) {
                objS5 = new gzv(fEA, bybVar);
                bvvVar.ad(objS5);
            }
            c(fzjVar, ((Number) bymVar.a()).floatValue(), hjuVar, ti.f(cfyVar, (gzv) objS5, null), bxc.i(-2021141234, true, new fun(hclVar, axrVar2, 9), buxVarC), buxVarC, (i2 & 896) | (i2 & 14) | 24576);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmh(fzjVar, hclVar, hjuVar, cfyVar, i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.fzj r12, defpackage.hcl r13, defpackage.hju r14, defpackage.cfy r15, defpackage.bux r16, int r17) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gzw.b(fzj, hcl, hju, cfy, bux, int):void");
    }

    public static void c(fzj fzjVar, float f, hju hjuVar, cfy cfyVar, afeh afehVar, bux buxVar, int i) {
        int i2;
        afeh afehVar2;
        hju hjuVar2;
        int i3;
        cil cilVar;
        afeg afegVar;
        bvv bvvVar;
        afdr afdrVar;
        afeg afegVar2;
        Object obj;
        cil cilVar2;
        afec afecVar;
        cil cilVar3;
        boolean z;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(1175594669);
        if (i4 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fzjVar) : buxVarC.E(fzjVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.z(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(hjuVar) : buxVarC.E(hjuVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 8192 : 16384;
        }
        if (buxVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            Object obj2 = buw.a;
            if (objS == obj2) {
                objS = new cil();
                bvvVar2.ad(objS);
            }
            cil cilVar4 = (cil) objS;
            Object objS2 = bvvVar2.S();
            if (objS2 == obj2) {
                objS2 = new cil();
                bvvVar2.ad(objS2);
            }
            cil cilVar5 = (cil) objS2;
            Object objS3 = bvvVar2.S();
            if (objS3 == obj2) {
                objS3 = new cil();
                bvvVar2.ad(objS3);
            }
            cil cilVar6 = (cil) objS3;
            cfv cfvVar = cfy.e;
            cfy cfyVarJ = bxc.j(awd.r(cfvVar), cilVar4);
            Object objS4 = bvvVar2.S();
            if (objS4 == obj2) {
                i3 = i2;
                objS4 = new goa(cilVar5, 15);
                bvvVar2.ad(objS4);
            } else {
                i3 = i2;
            }
            cfy cfyVarJ2 = fxi.j(cfyVarJ, (afec) objS4);
            Object objS5 = bvvVar2.S();
            if (objS5 == obj2) {
                objS5 = new gys(17);
                bvvVar2.ad(objS5);
            }
            cfy cfyVarBe = ca.be(bxc.k(cfyVarJ2, (afec) objS5));
            cfy cfyVarK = bxc.k(cfyVar, new goa(cilVar5, 14));
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVarC, 0);
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ3 = bzi.j(buxVarC, cfyVarK);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            afeg afegVar3 = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar3);
            afeg afegVar4 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar4);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar5 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar5);
            afec afecVar2 = cwb.g;
            byq.b(buxVarC, afecVar2);
            afeg afegVar6 = cwb.c;
            byq.c(buxVarC, cfyVarJ3, afegVar6);
            if (fzjVar != null) {
                buxVarC.v(708050762);
                if (fzjVar instanceof fzh) {
                    buxVarC.v(708093790);
                    afdrVar = afdrVar2;
                    afegVar2 = afegVar5;
                    obj = obj2;
                    cilVar2 = cilVar4;
                    afecVar = afecVar2;
                    afegVar = afegVar6;
                    fzc.a((fzh) fzjVar, das.d(cfyVarBe, "ExpandableHeader"), f, buxVarC, (i3 & 14) | ((i3 << 3) & 896), 0);
                    bvvVar2.Y(false);
                    cilVar5 = cilVar5;
                } else {
                    afegVar = afegVar6;
                    afdrVar = afdrVar2;
                    afegVar2 = afegVar5;
                    obj = obj2;
                    cilVar2 = cilVar4;
                    afecVar = afecVar2;
                    if (!(fzjVar instanceof fzi)) {
                        buxVarC.v(992671840);
                        bvvVar2.Y(false);
                        throw new aezs();
                    }
                    buxVarC.v(708297894);
                    gzj.a((fzi) fzjVar, das.d(cfyVarBe, "SearchHeader"), buxVarC, i3 & 14);
                    bvvVar2.Y(false);
                }
                if (((Boolean) buxVarC.f(gfo.a)).booleanValue()) {
                    buxVarC.v(708440742);
                    bvvVar = bvvVar2;
                    cilVar = cilVar5;
                    xb.a(null, BitmapDescriptorFactory.HUE_RED, 0L, buxVarC, 0, 7);
                    buxVarC = buxVarC;
                    z = false;
                    bvvVar.Y(false);
                } else {
                    cilVar = cilVar5;
                    bvvVar = bvvVar2;
                    z = false;
                    buxVarC.v(708476299);
                    bvvVar.Y(false);
                }
                bvvVar.Y(z);
            } else {
                cilVar = cilVar5;
                afegVar = afegVar6;
                bvvVar = bvvVar2;
                afdrVar = afdrVar2;
                afegVar2 = afegVar5;
                obj = obj2;
                cilVar2 = cilVar4;
                afecVar = afecVar2;
                buxVarC.v(708482251);
                bvvVar.Y(false);
            }
            asl.A(awd.d(cfvVar, gux.e(buxVarC).b.d), buxVarC);
            cfy cfyVarR = ((Boolean) buxVarC.f(gfo.a)).booleanValue() ? awd.r(cfvVar) : awd.r(ats.b(cfvVar, 1.0f, true));
            ctp ctpVarB = atk.b(cfl.a, false);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ4 = bzi.j(buxVarC, cfyVarR);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, afegVar3);
            byq.c(buxVarC, ccxVarAh2, afegVar4);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar2);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ4, afegVar);
            atn atnVar = atn.a;
            cfy cfyVarJ5 = bxc.j(cfvVar, cilVar);
            Object objS6 = bvvVar.S();
            Object obj3 = obj;
            if (objS6 == obj3) {
                objS6 = new gys(18);
                bvvVar.ad(objS6);
            }
            cfy cfyVarK2 = bxc.k(cfyVarJ5, (afec) objS6);
            Object objS7 = bvvVar.S();
            if (objS7 == obj3) {
                cilVar3 = cilVar6;
                objS7 = new grn(cilVar3, cilVar2, 8);
                bvvVar.ad(objS7);
            } else {
                cilVar3 = cilVar6;
            }
            afehVar2 = afehVar;
            afehVar2.invoke(ca.be(fxi.j(cfyVarK2, (afec) objS7)), buxVarC, Integer.valueOf((i3 >> 9) & 112));
            if (hjuVar == null) {
                buxVarC.v(-865482695);
                bvvVar.Y(false);
                hjuVar2 = hjuVar;
            } else {
                buxVarC.v(664817864);
                cfy cfyVarA = atnVar.a(cfvVar, cfl.i);
                hir hirVar = gux.e(buxVarC).c;
                hir hirVar2 = gux.e(buxVarC).c;
                cfy cfyVarJ6 = bxc.j(asl.G(cfyVarA, asl.L(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16.0f, 16.0f, 3)), cilVar3);
                Object objS8 = bvvVar.S();
                if (objS8 == obj3) {
                    objS8 = new goa(cilVar, 16);
                    bvvVar.ad(objS8);
                }
                hjuVar2 = hjuVar;
                gvq.g(hjuVar2, fxi.j(cfyVarJ6, (afec) objS8), buxVarC, (i3 >> 6) & 14, 0);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
            bvvVar.Y(true);
            fxi.i(cilVar, buxVarC, 6);
        } else {
            afehVar2 = afehVar;
            hjuVar2 = hjuVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gzt(fzjVar, f, hjuVar2, cfyVar, afehVar2, i, 0);
        }
    }

    public static void d(hcm hcmVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(607090610);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hcmVar) : buxVarC.E(hcmVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            czz.am(gfl.a.b(gfl.a(true, buxVarC)), bxc.i(-1097753870, true, new guk(cfyVar, hcmVar, 5), buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gul(hcmVar, cfyVar, i, 16, null);
        }
    }

    public static hab e(BannerElement bannerElement, geu geuVar) {
        CarIcon image;
        int type = bannerElement.getType();
        if (type == 1) {
            Action action = bannerElement.getAction();
            if (action != null) {
                return new gzx(fvr.e(action, geuVar, null));
            }
            return null;
        }
        if (type != 2 || (image = bannerElement.getImage()) == null) {
            return null;
        }
        int imageType = bannerElement.getImageType();
        if (imageType == 1) {
            ghw ghwVar = ghw.a;
            ghv ghvVar = ghv.a;
            ghvVar.getClass();
            return new gzy(gai.a(image, geuVar, ghwVar, ghvVar, null, 8));
        }
        if (imageType == 2) {
            ghw ghwVar2 = ghw.a;
            ghv ghvVar2 = ghv.a;
            ghvVar2.getClass();
            return new gzz(gai.a(image, geuVar, ghwVar2, ghvVar2, null, 8));
        }
        if (imageType != 3) {
            return null;
        }
        ghw ghwVar3 = ghw.a;
        ghv ghvVar3 = ghv.a;
        ghvVar3.getClass();
        return new haa(gai.a(image, geuVar, ghwVar3, ghvVar3, null, 8));
    }

    public static hjw f(CarColor carColor, bux buxVar) {
        return g(carColor, (jvb) buxVar.f(fvi.a));
    }

    public static hjw g(CarColor carColor, jvb jvbVar) {
        jvbVar.getClass();
        int type = carColor.getType();
        if (type == 0) {
            return new hjw(cjn.i(carColor.getColor()), cjn.i(carColor.getColorDark()));
        }
        switch (type) {
            case 2:
                return new hjw(cjn.i(jvbVar.d), cjn.i(jvbVar.a));
            case 3:
                return new hjw(cjn.i(jvbVar.c), cjn.i(jvbVar.b));
            case 4:
                return hjw.a;
            case 5:
                return hjw.b;
            case 6:
                return hjw.c;
            case 7:
                return hjw.d;
            default:
                return new hjw(cjn.n(), cjn.n());
        }
    }
}
