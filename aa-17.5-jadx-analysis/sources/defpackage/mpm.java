package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import com.google.android.gms.car.CarActivityLayoutParams;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.car.lifecycle.CarActivityLayoutConfig;
import com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig;
import com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig;
import j$.util.Collection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class mpm {
    public static final ComponentName a(CarDisplayId carDisplayId, rji rjiVar, nsn nsnVar) {
        wer.c();
        if (nsnVar == nsn.a || nsnVar == nsn.s) {
            return g(carDisplayId, rjiVar, nsnVar).a();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CarActivityLayoutConfig b(qrn qrnVar, Collection collection) throws Resources.NotFoundException {
        yfq ylsVar;
        yfq yfqVar;
        Intent intent;
        Iterator it;
        yfq yfqVar2;
        int i;
        qqk qqkVar;
        wer.c();
        int i2 = 4;
        yfl yflVar = new yfl(4);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            nso nsoVar = (nso) it2.next();
            int i3 = yfq.d;
            yfl yflVar2 = new yfl(i2);
            yfq yfqVarS = nsoVar.s();
            int size = yfqVarS.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                CarRegionId carRegionId = (CarRegionId) yfqVarS.get(i5);
                nsn nsnVarK = nsoVar.k(carRegionId);
                CarDisplayId carDisplayId = nsoVar.o;
                rji rjiVar = nsoVar.q;
                wer.c();
                nsn nsnVar = nsn.a;
                Intent intentB = (nsnVarK == nsnVar || nsnVarK == nsn.s || nsnVarK == nsn.t) ? g(carDisplayId, rjiVar, nsnVarK).b(qrnVar) : new Intent();
                intentB.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", intentB.getIntExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", i4) | 1);
                intentB.putExtra("com.google.android.projection.gearhead.system.projectiontrampoline.EXTRA_FOR_STARTUP", true);
                Intent component = new Intent().setComponent(a(carDisplayId, rjiVar, nsnVarK));
                component.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", component.getIntExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 0) | 1);
                Rect rectH = nsoVar.h(nsnVarK);
                if (rectH == null) {
                    qqkVar = null;
                    intent = component;
                    it = it2;
                    yfqVar2 = yfqVarS;
                    i = size;
                } else {
                    Rect rectI = nsoVar.i(nsnVarK);
                    nsoVar.N(rectI, nsnVarK);
                    intent = component;
                    dzi dziVarJ = nsoVar.j(nsnVarK);
                    it = it2;
                    yfqVar2 = yfqVarS;
                    i = size;
                    qqk qqkVar2 = new qqk(rectH.width(), rectH.height());
                    qqkVar2.c = rectH.left;
                    qqkVar2.d = rectH.top;
                    qqkVar2.f = rectI;
                    qqkVar2.l = ((Integer) nsoVar.t(nsnVarK, new kqm(13), 0)).intValue();
                    qqkVar2.i = (ProjectionWindowAnimationParams) dziVarJ.a;
                    qqkVar2.j = (ProjectionWindowAnimationParams) dziVarJ.b;
                    qqkVar2.g = nsoVar.u(nsnVarK);
                    qqkVar2.h = nsoVar.p(nsnVarK);
                    qqkVar2.e = nsoVar.f(nsnVarK);
                    qqkVar2.k = nsoVar.b(nsnVarK);
                    qqkVar = qqkVar2;
                }
                nsnVarK.toString();
                String.valueOf(carRegionId);
                qqkVar.getClass();
                yflVar2.i(new CarActivityRegionLayoutConfig(intentB, intent, carRegionId, new CarActivityLayoutParams(qqkVar.a, qqkVar.b, qqkVar.c, qqkVar.d, qqkVar.e, qqkVar.f, qqkVar.g, qqkVar.h, qqkVar.i, qqkVar.j, qqkVar.k, qqkVar.l), nsoVar.q(carRegionId), acur.a.gu().m() ? (nsnVarK == nsnVar || nsnVarK == nsn.s || nsnVarK == nsn.b) ? g(carDisplayId, rjiVar, nsnVarK).c() : yls.a : yls.a));
                i5++;
                it2 = it;
                yfqVarS = yfqVar2;
                size = i;
                i4 = 0;
            }
            Iterator it3 = it2;
            yfq yfqVarG = yflVar2.g();
            CarDisplayId carDisplayId2 = nsoVar.o;
            String string = nsoVar.v().toString();
            if (nsoVar.u) {
                ycc yccVarA = nsoVar.h.a();
                nsn nsnVar2 = nsn.B;
                if (yccVarA.get(nsnVar2) != 0) {
                    ylsVar = yfq.r(nsnVar2, nsn.z);
                } else {
                    Object[] objArr = {nsn.k};
                    yrm.B(objArr, 1);
                    ylsVar = new yls(objArr, 1);
                }
                yfqVar = (yfq) Collection.EL.stream(ylsVar).map(new mix(nsoVar, 8)).filter(new mrw(6)).collect(ycm.a);
            } else {
                yfqVar = yls.a;
            }
            yflVar.i(new CarDisplayLayoutConfig(carDisplayId2, yfqVarG, string, yfqVar));
            it2 = it3;
            i2 = 4;
        }
        return new CarActivityLayoutConfig(yflVar.g());
    }

    public static void c() {
        wer.c();
    }

    public static Bundle d(qrn qrnVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("MULTI_REGION_ENABLED", true);
        bundle.putInt("MULTI_REGION_EXPERIMENT_ID", -1);
        yph yphVar = nsr.a;
        bundle.putBoolean("MULTI_REGION_ELIGIBLE", ((nsr) mki.a.i(nsr.class)).j(nsv.e));
        bundle.putBoolean("COOLWALK_UI_ENABLED", true);
        bundle.putInt("REDUCED_STATUS_BAR_NOTIFICATION_RATE_EXPERIMENT_ID", 22168596);
        bundle.putBoolean("IGNORE_ON_ANDROID_AUTO_START_WHEN_FLUSHING", true);
        bundle.putBoolean("GH_CIELO_UI_ENABLED", ldz.a.a().c(qrnVar));
        bundle.putBoolean("EDGE_TO_EDGE_RENDERING_ENABLED", acxa.a.gu().ag());
        return bundle;
    }

    public static final eqj e() {
        yph yphVar = mpd.a;
        mpc mpcVar = ((mpd) mki.a.i(mpd.class)).h;
        ltk ltkVar = new ltk(8);
        afco afcoVar = tby.a;
        eqj eqjVarB = eqy.b(mpcVar, ltkVar);
        eqj eqjVarA = mud.h.a().a();
        muc mucVar = muc.a;
        eqjVarA.getClass();
        eqj eqjVarA2 = tby.a(eqjVarB, eqy.b(eqjVarA, new njq(mucVar, 13)));
        ComponentName componentName = nxo.a;
        return tby.a(eqjVarA2, eqy.b(((nxo) mki.a.i(nxo.class)).b, new nna(19)));
    }

    public static final eqj f() {
        yph yphVar = nsr.a;
        return eqy.c(((nsr) mki.a.i(nsr.class)).b().A, new ltk(7));
    }

    private static mps g(CarDisplayId carDisplayId, rji rjiVar, nsn nsnVar) {
        int iOrdinal = rjiVar.ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = nsnVar.ordinal();
            return iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 18 ? iOrdinal2 != 19 ? (mps) tss.q("GH.ALCFactory", "No configuration defined for region type %s", nsnVar.name()) : (mpw) mki.a.b(mpw.class, new lfu(9)) : (mpv) mki.a.b(mpv.class, new lfu(8)) : (mpp) mki.a.b(mpp.class, new may(12)) : (mpx) mki.a.i(mpx.class);
        }
        if (iOrdinal == 1) {
            woy.O(nsnVar == nsn.a, "Only the activity region is supported on the cluster display");
            return mpt.d();
        }
        if (iOrdinal != 2) {
            return (mps) tss.q("GH.ALCFactory", "No configuration defined for car display type: %s", rjiVar);
        }
        woy.O(nsnVar == nsn.a, "Only the activity region is supported on a auxiliary display");
        yph yphVar = mpr.a;
        mpr mprVar = (mpr) mki.a.i(mpr.class);
        mprVar.d();
        return mprVar.b(mprVar.c(carDisplayId));
    }
}
