package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes.dex */
public final class mpt implements mps {
    private static final yph b = yph.c("GH.ClusterConfig");
    public static final ComponentName a = new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.cluster.ClusterTurnCardCarActivityService");

    public static mpt d() {
        return (mpt) mki.a.i(mpt.class);
    }

    public static final Intent e() {
        if (mme.f(kio.b().e())) {
            mme.b();
            if (mme.i(kio.b().e()) == jfe.ON) {
                mme.b();
                if (mme.h(kio.b().e()) == jfc.BATTERY_OPTIMIZED) {
                    ((ype) b.l().ai((char) 5180)).u("Power Saving is enabled and its currently set to Battery Optimized Launching gearhead cluster turn card activity.");
                    return new Intent().setComponent(a);
                }
            }
        }
        ComponentName componentNameA = map.a(kio.b().e(), true);
        if (componentNameA == null) {
            ((ype) b.l().ai((char) 5179)).u("No default navigation app. Launching placeholder cluster navigation activity.");
            return new Intent().setComponent(a);
        }
        ComponentName componentNameA2 = mam.a(kio.b().e(), rji.b, componentNameA.getPackageName());
        if (componentNameA2 != null) {
            ((ype) b.l().ai((char) 5178)).M("Cluster navigation service found for package %s. Launching cluster navigation activity %s.", componentNameA.getPackageName(), componentNameA2.flattenToShortString());
            return new Intent().setComponent(componentNameA2);
        }
        if (map.b(componentNameA)) {
            ((ype) b.l().ai((char) 5177)).y("No cluster navigation service found for package %s. Launching hard-coded GMM cluster navigation activity.", componentNameA.getPackageName());
            return new Intent().setComponent(new ComponentName(componentNameA.getPackageName(), "com.google.android.apps.gmm.car.projected.auxiliarymap.GmmCarAuxiliaryProjectionService"));
        }
        ((ype) b.l().ai((char) 5176)).y("No cluster navigation service found for package %s. Launching gearhead cluster turn card activity.", componentNameA.getPackageName());
        return new Intent().setComponent(a);
    }

    @Override // defpackage.mps
    public final ComponentName a() {
        return a;
    }

    @Override // defpackage.mps
    public final Intent b(qrn qrnVar) {
        return new Intent();
    }

    @Override // defpackage.mps
    public final /* synthetic */ yfq c() {
        int i = yfq.d;
        return yls.a;
    }
}
