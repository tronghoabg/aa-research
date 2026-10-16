package defpackage;

import androidx.car.app.model.CarColor;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class guc {
    public static final void a(gud gudVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1941946133);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gudVar) : buxVarC.E(gudVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            int i4 = i2 & 14;
            int i5 = i2 & 112;
            if (gudVar.k - 1 != 0) {
                buxVarC.v(-2100532147);
                gmu.e(gudVar, cfyVar, buxVarC, i5 | i4 | gud.a);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-2100535988);
                gmu.g(gudVar, cfyVar, buxVarC, i5 | i4 | gud.a);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(gudVar, cfyVar, i, 14);
        }
    }

    public static final gub b(gth gthVar) {
        gfs gfsVarB = gey.b(gthVar.d);
        String str = gthVar.e;
        deu deuVar = str != null ? new deu(str) : null;
        CarColor carColor = gthVar.f;
        String str2 = gthVar.c;
        return new gub(gfsVarB, deuVar, carColor, str2 != null ? new deu(str2) : null, gthVar.g);
    }

    public static final fwm c(geu geuVar, afdr afdrVar, boolean z) {
        gfu gfuVar = new gfu(geuVar.getDrawable(R.drawable.gs_close_vd_theme_24));
        return new fwm(z ? new fyf(gey.b, gfuVar, afdrVar, false, null, false, false, 504) : new fxq(gfuVar, afdrVar, 252), null, null);
    }

    public static final fwm d(geu geuVar, afdr afdrVar, boolean z) {
        return new fwm(null, new fwy(null, gax.c(geuVar, R.drawable.gs_close_vd_theme_24, null), afdrVar, true, null, false, null), z ? fwx.b : fwx.d);
    }

    public static final boolean e(geu geuVar) {
        return ((ggk) geuVar.F(ggk.class)).f();
    }

    public static final void f(hct hctVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-811938365);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hctVar) : buxVarC.E(hctVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfy cfyVarI = awd.i(cfyVar, gux.g(buxVarC).g.c);
            ctp ctpVarB = atk.b(cfl.e, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarI);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            gbf.d(hctVar.a, cjn.g(awd.i(cfy.e, gux.g(buxVarC).d.e), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gux.f(buxVarC).a.c, true, 0, 1042431), null, null, new cjv(((cjv) buxVarC.f(bnm.a)).a), false, true, null, null, false, buxVarC, 1572864, 940);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(hctVar, cfyVar, i, 0);
        }
    }

    public static final void g(cfy cfyVar, boolean z, hjw hjwVar, hcw hcwVar, bux buxVar, int i, int i2) {
        int i3;
        bux buxVar2;
        cfy cfyVar2;
        boolean z2;
        hjw hjwVar2;
        hcwVar.getClass();
        int i4 = i2 & 1;
        bux buxVarC = buxVar.c(-1051547949);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != buxVarC.D(z) ? 16 : 32;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(hjwVar) : buxVarC.E(hjwVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != ((i & 4096) == 0 ? buxVarC.C(hcwVar) : buxVarC.E(hcwVar)) ? 1024 : 2048;
        }
        if (buxVarC.I((i3 & 1171) != 1170, i3 & 1)) {
            if (i4 != 0) {
                cfyVar = cfy.e;
            }
            cfyVar2 = cfyVar;
            boolean z4 = z & z3;
            hjwVar2 = i6 != 0 ? null : hjwVar;
            hjw hjwVar3 = hjw.a;
            buxVar2 = buxVarC;
            z2 = z4;
            hcwVar.a(cfyVar2, z2, hjwVar2, buxVar2, i3 & 8190);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            cfyVar2 = cfyVar;
            z2 = z;
            hjwVar2 = hjwVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nbi(cfyVar2, z2, hjwVar2, hcwVar, i, i2, 1);
        }
    }
}
