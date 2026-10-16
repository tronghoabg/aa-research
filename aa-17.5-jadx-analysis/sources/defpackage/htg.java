package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class htg {
    public static final deb a = new deb("DisplayedDrawable");

    public static final hdo a(afeg afegVar) {
        afegVar.getClass();
        return new hti(afegVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.Object r20, defpackage.cfy r21, defpackage.cfn r22, defpackage.csi r23, float r24, defpackage.cjw r25, defpackage.hdo r26, defpackage.hdo r27, defpackage.afec r28, defpackage.bux r29, int r30) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htg.b(java.lang.Object, cfy, cfn, csi, float, cjw, hdo, hdo, afec, bux, int):void");
    }

    public static final void c(hdo hdoVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1753501208);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hdoVar) : buxVarC.E(hdoVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if (!buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            buxVarC.s();
        } else {
            if (hdoVar instanceof htj) {
                buxVarC.v(-1487474096);
                ((bvv) buxVarC).Y(false);
                throw null;
            }
            if (!(hdoVar instanceof htk)) {
                if (hdoVar instanceof hti) {
                    buxVarC.v(-1487468731);
                    ((bvv) buxVarC).Y(false);
                    throw new IllegalArgumentException("Composables should go through the production codepath");
                }
                buxVarC.v(-1487475851);
                ((bvv) buxVarC).Y(false);
                throw new aezs();
            }
            buxVarC.v(-1487471737);
            Drawable drawable = ((Context) buxVarC.f(daa.b)).getDrawable(R.drawable.media_suggestion_album_art_placeholder);
            ((bvv) buxVarC).Y(false);
            ca.bb(ijl.c(drawable, buxVarC), null, cfyVar, null, null, BitmapDescriptorFactory.HUE_RED, null, buxVarC, (i2 & 112) | 8 | (i2 & 896), 120);
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new heu((Object) hdoVar, cfyVar, i, 18);
        }
    }

    public static final void d(hsq hsqVar, hdq hdqVar, cfy cfyVar, cfn cfnVar, csi csiVar, float f, cjw cjwVar, afeg afegVar, afeg afegVar2, bux buxVar, int i) {
        int i2;
        float f2;
        cjw cjwVar2;
        bux buxVar2;
        int iOrdinal;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-2117822551);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(hsqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(hdqVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(null) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(cfnVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(csiVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            f2 = f;
            i2 |= true != buxVarC.z(f2) ? 524288 : 1048576;
        } else {
            f2 = f;
        }
        if ((12582912 & i) == 0) {
            cjwVar2 = cjwVar;
            i2 |= true != buxVarC.C(cjwVar2) ? 4194304 : 8388608;
        } else {
            cjwVar2 = cjwVar;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != buxVarC.E(afegVar2) ? 268435456 : 536870912;
        }
        if (buxVarC.I((306783379 & i2) != 306783378, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = bvq.a(afcp.a, buxVarC);
                bvvVar.ad(objS);
            }
            aitx aitxVar = (aitx) objS;
            eqa eqaVar = (eqa) buxVarC.f(erz.a);
            boolean zC = buxVarC.C(hsqVar) | buxVarC.C(hdqVar) | buxVarC.C(eqaVar);
            int i4 = i2;
            Object objS2 = bvvVar.S();
            if (zC || objS2 == obj) {
                objS2 = new hth(hsqVar, hdqVar, aitxVar, eqaVar);
                bvvVar.ad(objS2);
            }
            hth hthVar = (hth) objS2;
            if (afegVar != null && ((iOrdinal = hthVar.h().ordinal()) == 0 || iOrdinal == 1)) {
                buxVarC.v(1018641014);
                e(afegVar, cfyVar, buxVarC, (i4 >> 24) & 14);
                bvvVar.Y(false);
            } else if (afegVar2 == null || hthVar.h() != htx.d) {
                buxVarC.v(1018794061);
                cfv cfvVar = cfy.e;
                boolean zC2 = buxVarC.C(hthVar);
                Object objS3 = bvvVar.S();
                if (zC2 || objS3 == obj) {
                    objS3 = new hku(hthVar, 8);
                    bvvVar.ad(objS3);
                }
                cfy cfyVarA = cfyVar.a(dds.a(cfvVar, false, (afec) objS3));
                int i5 = i4 >> 3;
                int i6 = ((i4 >> 6) & 112) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016);
                buxVar2 = buxVarC;
                ca.bb(hthVar, null, cfyVarA, cfnVar, csiVar, f2, cjwVar2, buxVar2, i6, 0);
                bvvVar.Y(false);
            } else {
                buxVarC.v(1018737114);
                e(afegVar2, cfyVar, buxVarC, (i4 >> 27) & 14);
                bvvVar.Y(false);
            }
            buxVar2 = buxVarC;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new htf(hsqVar, hdqVar, cfyVar, cfnVar, csiVar, f, cjwVar, afegVar, afegVar2, i, 2);
        }
    }

    private static final void e(afeg afegVar, cfy cfyVar, bux buxVar, int i) {
        ctp ctpVarB = atk.b(cfl.a, false);
        bvv bvvVar = (bvv) buxVar;
        int iG = a.g(bvvVar.u);
        ccx ccxVarAh = bvvVar.ah();
        cfy cfyVarJ = bzi.j(buxVar, cfyVar);
        afdr afdrVar = cwb.a;
        buxVar.w();
        if (bvvVar.t) {
            buxVar.j(afdrVar);
        } else {
            buxVar.y();
        }
        byq.c(buxVar, ctpVarB, cwb.e);
        byq.c(buxVar, ccxVarAh, cwb.d);
        byq.c(buxVar, Integer.valueOf(iG), cwb.f);
        byq.b(buxVar, cwb.g);
        byq.c(buxVar, cfyVarJ, cwb.c);
        afegVar.invoke(buxVar, Integer.valueOf(i & 14));
        bvvVar.Y(true);
    }
}
