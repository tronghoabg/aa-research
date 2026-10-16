package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.car.app.model.CarIcon;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class nde implements afeh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nde(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [bym, java.lang.Object] */
    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long jAA;
        int i = this.b;
        if (i == 0) {
            int i2 = 4;
            cfy cfyVar = (cfy) obj;
            bux buxVar = (bux) obj2;
            int iIntValue = ((Number) obj3).intValue();
            cfyVar.getClass();
            if ((iIntValue & 6) == 0) {
                if (true != buxVar.C(cfyVar)) {
                    i2 = 2;
                }
                iIntValue |= i2;
            }
            if (buxVar.I((iIntValue & 19) != 18, iIntValue & 1)) {
                ca.bc(new cjj((Bitmap) this.a), cfyVar, csh.a, buxVar, ((iIntValue << 6) & 896) | 24624, 232);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        if (i == 1) {
            int i3 = 4;
            ato atoVar = (ato) obj;
            bux buxVar2 = (bux) obj2;
            int iIntValue2 = ((Number) obj3).intValue();
            if ((iIntValue2 & 6) == 0) {
                if (true != buxVar2.C(atoVar)) {
                    i3 = 2;
                }
                iIntValue2 |= i3;
            }
            if (buxVar2.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                if (ldz.a.a().b()) {
                    float f = gjk.b.k;
                    jAA = roc.aA(f, f);
                } else {
                    jAA = 0;
                }
                float fD = atoVar.d() - dll.b(jAA);
                float fC = atoVar.c() - dll.a(jAA);
                float f2 = fD + BitmapDescriptorFactory.HUE_RED;
                float f3 = fC + BitmapDescriptorFactory.HUE_RED;
                mcd.z(f2, f3);
                bym bymVarC = byx.c(null, buxVar2);
                sx sxVarF = tl.f(buxVar2);
                bvq.g(sxVarF, new gfw(sxVarF, (afck) null, 19), buxVar2);
                cct cctVarI = bxc.i(1115281302, false, mtk.a, buxVar2);
                cfv cfvVar = cfy.e;
                String str = mwb.a;
                tl.e(sxVarF, cctVarI, das.d(cfvVar, mwb.b), false, false, false, new hko(bymVarC, 12), bxc.i(1835273884, true, new mti(f2, f3, (Bundle) this.a), buxVar2), buxVar2, 12583352, 32);
            } else {
                buxVar2.s();
            }
            return afak.a;
        }
        if (i == 2) {
            int i4 = 4;
            cfy cfyVar2 = (cfy) obj;
            bux buxVar3 = (bux) obj2;
            int iIntValue3 = ((Number) obj3).intValue();
            cfyVar2.getClass();
            if ((iIntValue3 & 6) == 0) {
                if (true != buxVar3.C(cfyVar2)) {
                    i4 = 2;
                }
                iIntValue3 |= i4;
            }
            if (buxVar3.I((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                CarIcon carIconB = ndj.b(this.a);
                if (carIconB == null) {
                    buxVar3.v(1395704525);
                    buxVar3.o();
                } else {
                    buxVar3.v(1395704526);
                    ca.bb(lnm.E(carIconB, buxVar3), null, cfyVar2, null, null, BitmapDescriptorFactory.HUE_RED, null, buxVar3, ((iIntValue3 << 6) & 896) | 56, 120);
                    buxVar3.o();
                }
            } else {
                buxVar3.s();
            }
            return afak.a;
        }
        if (i == 3) {
            int i5 = 4;
            cfy cfyVar3 = (cfy) obj;
            bux buxVar4 = (bux) obj2;
            int iIntValue4 = ((Number) obj3).intValue();
            cfyVar3.getClass();
            if ((iIntValue4 & 6) == 0) {
                if (true != buxVar4.C(cfyVar3)) {
                    i5 = 2;
                }
                iIntValue4 |= i5;
            }
            if (buxVar4.I((iIntValue4 & 19) != 18, iIntValue4 & 1)) {
                GhIcon ghIconD = ndj.d(this.a);
                if (ghIconD == null) {
                    buxVar4.v(939866153);
                    buxVar4.o();
                } else {
                    buxVar4.v(939866154);
                    ca.bb(lgi.f(ghIconD, BitmapDescriptorFactory.HUE_RED, buxVar4, 3), null, cfyVar3, null, null, BitmapDescriptorFactory.HUE_RED, null, buxVar4, ((iIntValue4 << 6) & 896) | 56, 120);
                    buxVar4.o();
                }
            } else {
                buxVar4.s();
            }
            return afak.a;
        }
        if (i == 4) {
            cfy cfyVar4 = (cfy) obj;
            bux buxVar5 = (bux) obj2;
            int iIntValue5 = ((Number) obj3).intValue();
            cfyVar4.getClass();
            if ((iIntValue5 & 6) == 0) {
                iIntValue5 |= true != buxVar5.C(cfyVar4) ? 2 : 4;
            }
            if (buxVar5.I((iIntValue5 & 19) != 18, iIntValue5 & 1)) {
                lnm.L((gjo) this.a.a(), cfyVar4, null, null, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, buxVar5, (iIntValue5 << 3) & 112, 0, 2044);
            } else {
                buxVar5.s();
            }
            return afak.a;
        }
        bux buxVar6 = (bux) obj2;
        int iIntValue6 = ((Number) obj3).intValue();
        ((abu) obj).getClass();
        if (buxVar6.I((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
            Object obj4 = this.a;
            cfv cfvVar2 = cfy.e;
            ctp ctpVarA = avv.a(atd.a, cfl.m, buxVar6, 0);
            int iG = a.g(buxVar6.b());
            ccx ccxVarN = buxVar6.N();
            cfy cfyVarJ = bzi.j(buxVar6, cfvVar2);
            afdr afdrVar = cwb.a;
            buxVar6.M();
            buxVar6.w();
            if (buxVar6.G()) {
                buxVar6.j(afdrVar);
            } else {
                buxVar6.y();
            }
            byq.c(buxVar6, ctpVarA, cwb.e);
            byq.c(buxVar6, ccxVarN, cwb.d);
            byq.c(buxVar6, Integer.valueOf(iG), cwb.f);
            byq.b(buxVar6, cwb.g);
            byq.c(buxVar6, cfyVarJ, cwb.c);
            nel nelVar = (nel) obj4;
            bym bymVarF = bxc.f(nelVar.d, "", buxVar6);
            bym bymVarF2 = bxc.f(nelVar.e, "", buxVar6);
            brp.b(roc.aq(bymVarF).toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, czz.av(buxVar6).l, buxVar6, 0, 0, 131070);
            asl.A(awd.i(cfvVar2, gjk.b.k), buxVar6);
            brp.b(roc.aq(bymVarF2).toString(), bxc.t(cfvVar2, 0.72f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, czz.av(buxVar6).l, buxVar6, 48, 0, 131068);
            asl.A(awd.i(cfvVar2, gjk.d.k), buxVar6);
            buxVar6.n();
        } else {
            buxVar6.s();
        }
        return afak.a;
    }
}
