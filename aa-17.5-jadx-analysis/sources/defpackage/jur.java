package defpackage;

import android.content.res.Configuration;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class jur {
    public static final void a(gdh gdhVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(2056674781);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != buxVarC.E(gdhVar) ? 2 : 4) | i;
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
            cil cilVar = (cil) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new cil();
                bvvVar.ad(objS2);
            }
            hju hjuVar = gdhVar.a;
            cil cilVar2 = (cil) objS2;
            cfyVar2 = cfyVar;
            hbx.f(hjuVar != null ? gvq.f(hjuVar) : null, bxc.i(1118555386, true, new hhb((Object) gdhVar, cilVar2, cilVar, 3), buxVarC), bxc.i(-1152912359, true, new hhb((Object) gdhVar, cilVar, cilVar2, i4), buxVarC), cfyVar2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, asl.L(BitmapDescriptorFactory.HUE_RED, gjk.d.k, BitmapDescriptorFactory.HUE_RED, gjk.e.k, 5), buxVarC, ((i2 << 6) & 7168) | 1573296);
        } else {
            cfyVar2 = cfyVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jtt(gdhVar, cfyVar2, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.afeg r16, defpackage.bux r17, int r18) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jur.b(afeg, bux, int):void");
    }

    public static final int c(bux buxVar) {
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        if (objS == buw.a) {
            objS = (CarDisplay) khc.t(new wci("GH.CarDpiConfiguration", yzz.DASHBOARD, yzy.r, "Car no longer connected.", new Object[0]), new kbh(8));
            bvvVar.ad(objS);
        }
        return ((CarDisplay) objS).c;
    }

    public static final float d(int i, bux buxVar, int i2) {
        if (i2 != 0) {
            i = c(buxVar);
        }
        return ((Configuration) buxVar.f(daa.a)).densityDpi / i;
    }

    public static final int e(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 17) {
            return 3;
        }
        if (i == 33) {
            return 5;
        }
        if (i == 66) {
            return 4;
        }
        if (i == 130) {
            return 6;
        }
        throw new IllegalArgumentException(a.bp(i, "Unknown focus direction: "));
    }

    public static final void f(afec afecVar, cfy cfyVar, afec afecVar2, bux buxVar, int i) {
        int i2;
        afecVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1785998498);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afecVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afecVar2) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            dmj.b(new kaa(afecVar, i4), cfyVar, afecVar2, buxVarC, i2 & 1008, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg((Object) afecVar, cfyVar, (Object) afecVar2, i, 0);
        }
    }
}
