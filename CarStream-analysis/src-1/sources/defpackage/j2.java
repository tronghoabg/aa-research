package defpackage;

import android.location.LocationManager;
import android.os.Handler;
import com.carstream.tech.car.CarScreen;
import com.google.android.gms.car.CarActivityHost;
import com.google.android.gms.car.CarNavigationStatusManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class j2 {
    public static final String j = xc.b("KBtrnDDuVIhh/D8Tdq0B/EeTcPQoHw==");
    public static boolean k;
    public final CarScreen a;
    public final Handler b;
    public CarNavigationStatusManager c;
    public boolean d;
    public boolean e;
    public String f = "";
    public final g2 g = new g2(this);
    public final h2 h;
    public final i2 i;

    public j2(CarScreen carScreen, Handler handler) {
        int i = 0;
        this.h = new h2(this, i);
        this.i = new i2(this, i);
        this.a = carScreen;
        this.b = handler;
    }

    public final void a(CarActivityHost carActivityHost) {
        CarScreen carScreen = this.a;
        boolean z = xc.l(carScreen).getBoolean(xc.h("hudSend"), false);
        if (z == this.d) {
            return;
        }
        if (!z) {
            c();
            return;
        }
        if (carActivityHost == null || k) {
            return;
        }
        try {
            Object carManager = carActivityHost.getCarManager(j);
            if (carManager instanceof CarNavigationStatusManager) {
                CarNavigationStatusManager carNavigationStatusManager = (CarNavigationStatusManager) carManager;
                this.c = carNavigationStatusManager;
                carNavigationStatusManager.registerListener(this.g);
                this.c.sendNavigationStatus(1);
                this.d = true;
                this.e = false;
                this.f = "";
                cb.a(carScreen, this.h);
                w7.a(this.i);
                b();
            }
        } catch (SecurityException e) {
            k = true;
            e.getMessage();
            this.c = null;
        } catch (Throwable th) {
            String.valueOf(th);
            this.c = null;
        }
    }

    public final void b() {
        CarNavigationStatusManager carNavigationStatusManager = this.c;
        if (carNavigationStatusManager == null || this.e) {
            return;
        }
        String strI = xc.i(this.a, w7.g());
        if (strI == null) {
            return;
        }
        try {
            if (strI.equals(this.f)) {
                return;
            }
            carNavigationStatusManager.sendNavigationTurnEvent(14, strI, 0, 0, null, 3);
            this.f = strI;
        } catch (Throwable th) {
            String.valueOf(th);
            c();
        }
    }

    public final void c() {
        ab abVar;
        CopyOnWriteArrayList copyOnWriteArrayList = cb.e;
        copyOnWriteArrayList.remove(this.h);
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
        w7.l.remove(this.i);
        this.d = false;
        CarNavigationStatusManager carNavigationStatusManager = this.c;
        this.c = null;
        if (carNavigationStatusManager == null) {
            return;
        }
        try {
            carNavigationStatusManager.unregisterListener();
            carNavigationStatusManager.sendNavigationStatus(2);
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }
}
