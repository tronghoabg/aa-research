package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mqa implements defpackage.mpz {
    private static final defpackage.yqm b = defpackage.yqm.c("GH.ClusterConfig");
    public static final android.content.ComponentName a = new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.cluster.ClusterTurnCardCarActivityService");

    public static defpackage.mqa d() {
        return (defpackage.mqa) defpackage.mkp.a.i(defpackage.mqa.class);
    }

    public static final android.content.Intent e() {
        if (defpackage.mmk.f(defpackage.kit.b().e())) {
            defpackage.mmk.b();
            if (defpackage.mmk.i(defpackage.kit.b().e()) == defpackage.jfm.ON) {
                defpackage.mmk.b();
                if (defpackage.mmk.h(defpackage.kit.b().e()) == defpackage.jfk.BATTERY_OPTIMIZED) {
                    ((defpackage.yqj) b.l().ai((char) 5182)).u("Power Saving is enabled and its currently set to Battery Optimized Launching gearhead cluster turn card activity.");
                    return new android.content.Intent().setComponent(a);
                }
            }
        }
        android.content.ComponentName componentNameA = defpackage.maw.a(defpackage.kit.b().e(), true);
        if (componentNameA == null) {
            ((defpackage.yqj) b.l().ai((char) 5181)).u("No default navigation app. Launching placeholder cluster navigation activity.");
            return new android.content.Intent().setComponent(a);
        }
        android.content.ComponentName componentNameA2 = defpackage.mat.a(defpackage.kit.b().e(), defpackage.rke.b, componentNameA.getPackageName());
        if (componentNameA2 != null) {
            ((defpackage.yqj) b.l().ai((char) 5180)).M("Cluster navigation service found for package %s. Launching cluster navigation activity %s.", componentNameA.getPackageName(), componentNameA2.flattenToShortString());
            return new android.content.Intent().setComponent(componentNameA2);
        }
        if (defpackage.maw.b(componentNameA)) {
            ((defpackage.yqj) b.l().ai((char) 5179)).y("No cluster navigation service found for package %s. Launching hard-coded GMM cluster navigation activity.", componentNameA.getPackageName());
            return new android.content.Intent().setComponent(new android.content.ComponentName(componentNameA.getPackageName(), "com.google.android.apps.gmm.car.projected.auxiliarymap.GmmCarAuxiliaryProjectionService"));
        }
        ((defpackage.yqj) b.l().ai((char) 5178)).y("No cluster navigation service found for package %s. Launching gearhead cluster turn card activity.", componentNameA.getPackageName());
        return new android.content.Intent().setComponent(a);
    }

    @Override // defpackage.mpz
    public final android.content.ComponentName a() {
        return a;
    }

    @Override // defpackage.mpz
    public final android.content.Intent b(defpackage.qsh qshVar) {
        return new android.content.Intent();
    }

    @Override // defpackage.mpz
    public final /* synthetic */ defpackage.ygw c() {
        int i = defpackage.ygw.d;
        return defpackage.ymx.a;
    }
}
