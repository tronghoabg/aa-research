package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.car.app.model.Badge;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class fxi {
    public static final void a(fxj fxjVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-362809275);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fxjVar) : buxVarC.E(fxjVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            b(cfyVar, fxjVar.a, fxjVar.b, BitmapDescriptorFactory.HUE_RED, buxVarC, (i2 >> 3) & 14, 8);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(fxjVar, cfyVar, i, 9, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.cfy r14, java.util.List r15, int r16, float r17, defpackage.bux r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxi.b(cfy, java.util.List, int, float, bux, int, int):void");
    }

    public static final fwd c(CarColor carColor, geu geuVar) {
        if (carColor.getType() == 0) {
            return fww.l(geuVar) ? new fwd(carColor.getColor(), carColor.getColorDark()) : new fwd(carColor.getColorDark(), carColor.getColor());
        }
        ghv ghvVar = ghv.b;
        ghvVar.getClass();
        ghvVar.getClass();
        cjv cjvVar = (((ggk) geuVar.F(ggk.class)).u() && affa.f(carColor, CarColor.DEFAULT)) ? null : new cjv(cjn.i(gbt.k(geuVar, carColor, fww.l(geuVar), -1, ghvVar, 0)));
        int iH = cjvVar != null ? cjn.h(cjvVar.a) : -1;
        return new fwd(iH, iH);
    }

    public static final int d(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            applicationInfo.getClass();
            int i = applicationInfo.metaData != null ? applicationInfo.metaData.getInt("androidx.car.app.theme") : 0;
            if (i == 0) {
                i = applicationInfo.theme;
            }
            zu zuVar = fzx.a;
            fzx.a.c(str, Integer.valueOf(i));
            return i;
        } catch (PackageManager.NameNotFoundException e) {
            zu zuVar2 = fzx.a;
            ((ynz) fzx.b.h().o(ypi.a, "CarApp.H.ThemedResCtx").ai(8)).M("Package not found %s: %s", str, e.getMessage());
            fzx.a.c(str, 0);
            return 0;
        } catch (Exception e2) {
            zu zuVar3 = fzx.a;
            ((ynz) fzx.b.h().o(ypi.a, "CarApp.H.ThemedResCtx").ai(9)).M("Failed to fetch theme for %s: %s", str, e2.getMessage());
            fzx.a.c(str, 0);
            return 0;
        }
    }

    public static final fzw e(CarIcon carIcon, geu geuVar, Badge badge, afec afecVar) {
        fzy fzyVarD;
        ewc ewcVar = new ewc(18);
        ghw ghwVar = ghw.a;
        ghv ghvVar = ghv.a;
        ghvVar.getClass();
        fzy fzyVarD2 = fxp.d(carIcon, geuVar, ewcVar, afecVar, ghwVar, ghvVar);
        if (badge == null) {
            return new fzw(fzyVarD2, false, null, null, null);
        }
        boolean zHasDot = badge.hasDot();
        CarColor dotColor = badge.getDotColor();
        CarIcon icon = badge.getIcon();
        if (icon != null) {
            ewc ewcVar2 = new ewc(19);
            ghw ghwVar2 = ghw.b;
            ghv ghvVar2 = ghv.c;
            ghvVar2.getClass();
            fzyVarD = fxp.d(icon, geuVar, ewcVar2, afecVar, ghwVar2, ghvVar2);
        } else {
            fzyVarD = null;
        }
        return new fzw(fzyVarD2, zHasDot, dotColor, fzyVarD, badge.getIconBackgroundColor());
    }

    public static final cfy f(cfy cfyVar, afec afecVar) {
        cfyVar.getClass();
        afecVar.getClass();
        return cfyVar.a(new gjg(afecVar));
    }

    public static final cfy g(cfy cfyVar, afec afecVar) {
        cfyVar.getClass();
        afecVar.getClass();
        return cfyVar.a(new gji(afecVar));
    }

    public static final gjf h() {
        return (gjf) gjf.a.a();
    }

    public static final void i(cil cilVar, bux buxVar, int i) {
        int i2;
        cilVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-349745460);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cilVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            int i4 = i2 & 14;
            afak afakVar = afak.a;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (i4 == 4 || objS == buw.a) {
                objS = new giy(cilVar, (afck) null, 0);
                bvvVar.ad(objS);
            }
            bvq.g(afakVar, (afeg) objS, buxVarC);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(cilVar, i, 8);
        }
    }

    public static final cfy j(cfy cfyVar, afec afecVar) {
        cfyVar.getClass();
        afecVar.getClass();
        return ti.h(cfyVar, new dmz(afecVar, 9));
    }

    public static final cfy k(cfy cfyVar, cil cilVar, cil cilVar2, cil cilVar3, cil cilVar4) {
        cfyVar.getClass();
        return j(cfyVar, new gaz(cilVar2, cilVar, cilVar3, cilVar4, 3));
    }
}
