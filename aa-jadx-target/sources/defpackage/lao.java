package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lao {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.AssistantUtils");

    public static com.google.android.gearhead.sdk.assistant.ClientStateSnapshot a(int i, java.lang.String str) {
        defpackage.yqm yqmVar;
        defpackage.wfp.c();
        com.google.android.gearhead.sdk.assistant.ClientStateSnapshot clientStateSnapshot = new com.google.android.gearhead.sdk.assistant.ClientStateSnapshot();
        defpackage.ojm.a();
        clientStateSnapshot.a = j$.time.Instant.now().toEpochMilli();
        com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot gearheadStateSnapshot = new com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot();
        clientStateSnapshot.c = gearheadStateSnapshot;
        gearheadStateSnapshot.b = i;
        gearheadStateSnapshot.a = 2;
        gearheadStateSnapshot.g = str;
        android.content.ComponentName componentNameA = defpackage.maw.a(defpackage.kit.b().e(), true);
        if (componentNameA != null) {
            gearheadStateSnapshot.h.f(2, componentNameA.getPackageName());
            yqmVar = a;
            ((defpackage.yqj) yqmVar.l().ai((char) 3689)).y("Using nav package %s for assistant", componentNameA);
        } else {
            yqmVar = a;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 3686)).u("No nav component");
        }
        defpackage.mak makVarE = defpackage.mak.e();
        makVarE.b();
        java.lang.Boolean bool = (java.lang.Boolean) makVarE.b().e();
        bool.getClass();
        gearheadStateSnapshot.c = bool.equals(java.lang.Boolean.TRUE);
        com.google.android.gms.car.navigation.NavigationCurrentPosition navigationCurrentPosition = (com.google.android.gms.car.navigation.NavigationCurrentPosition) defpackage.mak.e().b.e();
        if (navigationCurrentPosition != null && !navigationCurrentPosition.a().isEmpty() && gearheadStateSnapshot.c) {
            com.google.android.gms.car.navigation.DestinationDistance destinationDistance = (com.google.android.gms.car.navigation.DestinationDistance) navigationCurrentPosition.a().get(0);
            gearheadStateSnapshot.d = destinationDistance.c;
            com.google.android.gms.car.navigation.Distance distance = destinationDistance.a;
            if (distance != null) {
                gearheadStateSnapshot.f = distance.c;
                gearheadStateSnapshot.e = distance.b;
            }
        }
        android.content.ComponentName componentNameA2 = defpackage.kzi.r().a();
        if (componentNameA2 != null) {
            defpackage.abb abbVar = gearheadStateSnapshot.h;
            java.lang.String packageName = componentNameA2.getPackageName();
            abbVar.f(1, packageName);
            ((defpackage.yqj) yqmVar.l().ai((char) 3688)).y("Default media component %s", packageName);
        }
        defpackage.mqj mqjVarF = defpackage.mpj.b().f();
        if (str != null && mqjVarF != null && mqjVarF.b == defpackage.mqg.MEDIA) {
            ((defpackage.yqj) yqmVar.l().ai((char) 3687)).y("Providing foreground media app as default: %s", str);
            gearheadStateSnapshot.h.f(1, str);
        }
        if (defpackage.mpr.f().a().f()) {
            gearheadStateSnapshot.i = defpackage.ler.b().b();
        }
        return clientStateSnapshot;
    }

    public static void b(java.lang.Runnable runnable) {
        if (defpackage.wfp.g()) {
            runnable.run();
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3691)).u("Should be on main thread instead of background.");
        defpackage.lam.a().h(206, null);
        defpackage.wfp.e(runnable);
    }

    public static void c(java.lang.Runnable runnable) {
        if (!defpackage.wfp.g()) {
            defpackage.wfp.e(runnable);
        } else {
            defpackage.lam.a().h(205, null);
            runnable.run();
        }
    }

    public static boolean d(int i) {
        return i == 5 || i == 9;
    }

    public static boolean e(int i) {
        return i == 5;
    }
}
