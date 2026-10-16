package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import j$.util.Collection;
import java.util.Collection;
import java.util.Random;

/* loaded from: classes.dex */
public final class map {
    private static final yph b = yph.c("GH.NavPkgUtils");
    public static final yfq a = yfq.v("com.google.android.apps.gmm.dev", "com.google.android.apps.gmm.car", "com.google.android.apps.gmm.fishfood", "com.google.android.apps.gmm", "com.google.android.apps.gmm.qp", "com.google.android.apps.maps");
    private static final ygr c = ygr.p(new ComponentName("com.waze", "com.waze.android_auto.WazeCarService"), new ComponentName("com.waze.alpha", "com.waze.alpha.android_auto.WazeCarService"));

    /* JADX WARN: Multi-variable type inference failed */
    public static ComponentName a(qrn qrnVar, boolean z) {
        Collection collectionS;
        ComponentName componentNameA = z ? ((lha) mki.a.i(lha.class)).a(mpz.b) : ((lha) mki.a.i(lha.class)).b(mpz.b);
        if (componentNameA != null) {
            componentNameA.toShortString();
            return componentNameA;
        }
        ComponentName componentName = null;
        if (z) {
            ComponentName componentName2 = (ComponentName) Collection.EL.stream(((lgw) mki.a.i(lgw.class)).b(qrnVar, nyj.a())).filter(new lye(4)).map(new lyd(8)).findFirst().orElse(null);
            if (componentName2 != null) {
                componentName2.toShortString();
            }
            f(componentName2);
            return componentName2;
        }
        yph yphVar = lfm.a;
        int i = 1;
        if ("com.google.android.apps.maps".equals(((lfm) mki.a.i(lfm.class)).d())) {
            ComponentName componentName3 = new ComponentName("com.google.android.apps.maps", "com.google.android.apps.gmm.car.GmmCarProjectionService");
            int i2 = yfq.d;
            Object[] objArr = {componentName3};
            yrm.B(objArr, 1);
            collectionS = new yls(objArr, 1);
        } else {
            collectionS = yfq.s(new ComponentName("com.locnall.KimGiSa", "com.kakaomobility.common.auto.service.NavigationCarAppService"), new ComponentName("com.skt.tmap.ku", "com.skt.tmap.car.TmapCarAppService"), new ComponentName("com.nhn.android.nmap", "com.naver.map.auto.NaverMapCarAppService"));
        }
        yfq yfqVar = (yfq) Collection.EL.stream(collectionS).filter(new iup(3)).collect(ycm.a);
        if (yfqVar.isEmpty()) {
            ((ype) ((ype) b.g()).ai((char) 4653)).u("No fallback navigation app installed.");
        } else {
            componentName = yfqVar.size() == 1 ? (ComponentName) yfqVar.get(0) : (ComponentName) yfqVar.get(((Random) mki.a.b(Random.class, new may(i))).nextInt(yfqVar.size()));
        }
        ((ype) ((ype) b.h()).ai((char) 4655)).y("No default nav app found and we are out of lifetime, returning FRX app: %s since we can't query apps", componentName);
        f(componentName);
        return componentName;
    }

    public static boolean b(ComponentName componentName) {
        return c(componentName.getPackageName());
    }

    public static boolean c(String str) {
        return str != null && a.contains(str);
    }

    public static boolean d(ComponentName componentName) {
        return (b(componentName) || c.contains(componentName)) ? false : true;
    }

    public static boolean e(ComponentName componentName) {
        return "com.waze".equals(componentName.getPackageName());
    }

    private static void f(ComponentName componentName) {
        PackageManager packageManager = mki.a.c.getPackageManager();
        if (componentName == null || packageManager == null || acoh.a.gu().b()) {
            return;
        }
        packageManager.setApplicationEnabledSetting(componentName.getPackageName(), 1, 1);
    }
}
