package defpackage;

import android.content.ComponentName;
import com.google.android.gearhead.sdk.assistant.ClientStateSnapshot;
import com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot;
import com.google.android.gms.car.navigation.DestinationDistance;
import com.google.android.gms.car.navigation.Distance;
import com.google.android.gms.car.navigation.NavigationCurrentPosition;
import j$.time.Instant;

/* loaded from: classes.dex */
public final class laj {
    public static final yph a = yph.c("GH.AssistantUtils");

    /* JADX WARN: Multi-variable type inference failed */
    public static ClientStateSnapshot a(int i, String str) {
        yph yphVar;
        wer.c();
        ClientStateSnapshot clientStateSnapshot = new ClientStateSnapshot();
        oit.a();
        clientStateSnapshot.a = Instant.now().toEpochMilli();
        GearheadStateSnapshot gearheadStateSnapshot = new GearheadStateSnapshot();
        clientStateSnapshot.c = gearheadStateSnapshot;
        gearheadStateSnapshot.b = i;
        gearheadStateSnapshot.a = 2;
        gearheadStateSnapshot.g = str;
        ComponentName componentNameA = map.a(kio.b().e(), true);
        if (componentNameA != null) {
            gearheadStateSnapshot.h.f(2, componentNameA.getPackageName());
            yphVar = a;
            ((ype) yphVar.l().ai((char) 3686)).y("Using nav package %s for assistant", componentNameA);
        } else {
            yphVar = a;
            ((ype) ((ype) yphVar.g()).ai((char) 3683)).u("No nav component");
        }
        mad madVarE = mad.e();
        madVarE.b();
        Boolean bool = (Boolean) madVarE.b().e();
        bool.getClass();
        gearheadStateSnapshot.c = bool.equals(true);
        NavigationCurrentPosition navigationCurrentPosition = (NavigationCurrentPosition) mad.e().b.e();
        if (navigationCurrentPosition != null && !navigationCurrentPosition.a().isEmpty() && gearheadStateSnapshot.c) {
            DestinationDistance destinationDistance = (DestinationDistance) navigationCurrentPosition.a().get(0);
            gearheadStateSnapshot.d = destinationDistance.c;
            Distance distance = destinationDistance.a;
            if (distance != null) {
                gearheadStateSnapshot.f = distance.c;
                gearheadStateSnapshot.e = distance.b;
            }
        }
        ComponentName componentNameA2 = lnm.y().a();
        if (componentNameA2 != null) {
            aau aauVar = gearheadStateSnapshot.h;
            String packageName = componentNameA2.getPackageName();
            aauVar.f(1, packageName);
            ((ype) yphVar.l().ai((char) 3685)).y("Default media component %s", packageName);
        }
        mqc mqcVarF = mpd.b().f();
        if (str != null && mqcVarF != null && mqcVarF.b == mpz.d) {
            ((ype) yphVar.l().ai((char) 3684)).y("Providing foreground media app as default: %s", str);
            gearheadStateSnapshot.h.f(1, str);
        }
        if (mpl.f().a().f()) {
            gearheadStateSnapshot.i = lbh.c().b();
        }
        return clientStateSnapshot;
    }

    public static void b(Runnable runnable) {
        if (wer.g()) {
            runnable.run();
            return;
        }
        ((ype) ((ype) a.f()).ai((char) 3688)).u("Should be on main thread instead of background.");
        lah.a().h(206, null);
        wer.e(runnable);
    }

    public static void c(Runnable runnable) {
        if (!wer.g()) {
            wer.e(runnable);
        } else {
            lah.a().h(205, null);
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
