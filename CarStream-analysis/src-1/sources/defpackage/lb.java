package defpackage;

import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import androidx.car.app.CarContext;
import androidx.car.app.model.DateTimeWithZone;
import androidx.car.app.model.Distance;
import androidx.car.app.navigation.NavigationManager;
import androidx.car.app.navigation.model.Maneuver;
import androidx.car.app.navigation.model.Step;
import androidx.car.app.navigation.model.TravelEstimate;
import androidx.car.app.navigation.model.Trip;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class lb {
    public final CarContext a;
    public NavigationManager c;
    public boolean d;
    public boolean e;
    public boolean g;
    public final Handler b = new Handler(Looper.getMainLooper());
    public String f = "";
    public final t7 h = new t7(this, 8);
    public final h2 i = new h2(this, 3);
    public final i2 j = new i2(this, 3);

    public lb(CarContext carContext) {
        this.a = carContext;
    }

    public final void a() {
        CarContext carContext = this.a;
        boolean zE = xc.e(carContext, "hudSend", false);
        if (!zE || this.d || this.e) {
            if (zE || !this.d) {
                return;
            }
            d();
            return;
        }
        try {
            NavigationManager navigationManager = (NavigationManager) carContext.getCarService(NavigationManager.class);
            this.c = navigationManager;
            navigationManager.setNavigationManagerCallback(new c1(this, 10));
            this.c.navigationStarted();
            this.d = true;
            this.e = false;
            this.f = "";
        } catch (Throwable th) {
            String.valueOf(th);
            this.c = null;
            this.d = false;
        }
    }

    public final void b(boolean z) {
        ab abVar;
        if (z == this.g) {
            return;
        }
        this.g = z;
        i2 i2Var = this.j;
        h2 h2Var = this.i;
        if (z) {
            cb.a(this.a, h2Var);
            w7.a(i2Var);
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = cb.e;
        copyOnWriteArrayList.remove(h2Var);
        if (copyOnWriteArrayList.isEmpty() && cb.f.isEmpty()) {
            LocationManager locationManager = cb.h;
            if (locationManager != null && (abVar = cb.i) != null) {
                try {
                    locationManager.removeUpdates(abVar);
                } catch (Throwable unused) {
                }
            }
            cb.i = null;
        }
        w7.l.remove(i2Var);
    }

    public final void c() {
        String strI;
        a();
        if (!this.d || this.c == null || (strI = xc.i(this.a, w7.g())) == null || strI.equals(this.f)) {
            return;
        }
        try {
            this.c.updateTrip(new Trip.Builder().setCurrentRoad(strI).addStep(new Step.Builder(strI).setManeuver(new Maneuver.Builder(36).build()).setRoad(strI).setCue(strI).build(), new TravelEstimate.Builder(Distance.create(0.0d, 2), DateTimeWithZone.create(System.currentTimeMillis(), TimeZone.getDefault())).setRemainingTimeSeconds(-1L).build()).build());
            this.f = strI;
        } catch (Throwable th) {
            String.valueOf(th);
            d();
        }
    }

    public final void d() {
        NavigationManager navigationManager = this.c;
        this.c = null;
        boolean z = this.d;
        this.d = false;
        this.f = "";
        if (navigationManager == null || !z) {
            return;
        }
        try {
            navigationManager.navigationEnded();
            navigationManager.clearNavigationManagerCallback();
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }
}
