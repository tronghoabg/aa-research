package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class maw {
    private static final defpackage.yqm b = defpackage.yqm.c("GH.NavPkgUtils");
    public static final defpackage.ygw a = defpackage.ygw.v("com.google.android.apps.gmm.dev", "com.google.android.apps.gmm.car", "com.google.android.apps.gmm.fishfood", "com.google.android.apps.gmm", "com.google.android.apps.gmm.qp", "com.google.android.apps.maps");
    private static final defpackage.yhx c = defpackage.yhx.p(new android.content.ComponentName("com.waze", "com.waze.android_auto.WazeCarService"), new android.content.ComponentName("com.waze.alpha", "com.waze.alpha.android_auto.WazeCarService"));

    /* JADX WARN: Multi-variable type inference failed */
    public static android.content.ComponentName a(defpackage.qsh qshVar, boolean z) {
        java.util.Collection collectionS;
        android.content.ComponentName componentNameA = z ? ((defpackage.lhh) defpackage.mkp.a.i(defpackage.lhh.class)).a(defpackage.mqg.NAVIGATION) : ((defpackage.lhh) defpackage.mkp.a.i(defpackage.lhh.class)).b(defpackage.mqg.NAVIGATION);
        if (componentNameA != null) {
            componentNameA.toShortString();
            return componentNameA;
        }
        android.content.ComponentName componentName = null;
        if (z) {
            android.content.ComponentName componentName2 = (android.content.ComponentName) j$.util.Collection.-EL.stream(((defpackage.lhd) defpackage.mkp.a.i(defpackage.lhd.class)).b(qshVar, defpackage.nze.a())).filter(new defpackage.lyk(5)).map(new defpackage.lvg(9)).findFirst().orElse((java.lang.Object) null);
            if (componentName2 != null) {
                componentName2.toShortString();
            }
            f(componentName2);
            return componentName2;
        }
        defpackage.yqm yqmVar = defpackage.lfr.a;
        int i = 1;
        if ("com.google.android.apps.maps".equals(((defpackage.lfr) defpackage.mkp.a.i(defpackage.lfr.class)).d())) {
            android.content.ComponentName componentName3 = new android.content.ComponentName("com.google.android.apps.maps", "com.google.android.apps.gmm.car.GmmCarProjectionService");
            int i2 = defpackage.ygw.d;
            java.lang.Object[] objArr = {componentName3};
            defpackage.ysr.B(objArr, 1);
            collectionS = new defpackage.ymx(objArr, 1);
        } else {
            collectionS = defpackage.ygw.s(new android.content.ComponentName("com.locnall.KimGiSa", "com.kakaomobility.common.auto.service.NavigationCarAppService"), new android.content.ComponentName("com.skt.tmap.ku", "com.skt.tmap.car.TmapCarAppService"), new android.content.ComponentName("com.nhn.android.nmap", "com.naver.map.auto.NaverMapCarAppService"));
        }
        defpackage.ygw ygwVar = (defpackage.ygw) j$.util.Collection.-EL.stream(collectionS).filter(new defpackage.iux(2)).collect(defpackage.yds.a);
        if (ygwVar.isEmpty()) {
            ((defpackage.yqj) ((defpackage.yqj) b.g()).ai((char) 4656)).u("No fallback navigation app installed.");
        } else {
            componentName = ygwVar.size() == 1 ? (android.content.ComponentName) ygwVar.get(0) : (android.content.ComponentName) ygwVar.get(((java.util.Random) defpackage.mkp.a.b(java.util.Random.class, new defpackage.mbf(i))).nextInt(ygwVar.size()));
        }
        ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 4658)).y("No default nav app found and we are out of lifetime, returning FRX app: %s since we can't query apps", componentName);
        f(componentName);
        return componentName;
    }

    public static boolean b(android.content.ComponentName componentName) {
        return c(componentName.getPackageName());
    }

    public static boolean c(java.lang.String str) {
        return str != null && a.contains(str);
    }

    public static boolean d(android.content.ComponentName componentName) {
        return (b(componentName) || c.contains(componentName)) ? false : true;
    }

    public static boolean e(android.content.ComponentName componentName) {
        return "com.waze".equals(componentName.getPackageName());
    }

    private static void f(android.content.ComponentName componentName) {
        android.content.pm.PackageManager packageManager = defpackage.mkp.a.c.getPackageManager();
        if (componentName == null || packageManager == null || defpackage.acpj.a.fF().b()) {
            return;
        }
        packageManager.setApplicationEnabledSetting(componentName.getPackageName(), 1, 1);
    }
}
