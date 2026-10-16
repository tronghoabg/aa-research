package j;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class t extends J4.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38482d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f38483e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f38484f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, Dd.c cVar) {
        super(wVar);
        this.f38483e = wVar;
        this.f38484f = cVar;
    }

    @Override // J4.d
    public final IntentFilter e() {
        switch (this.f38482d) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // J4.d
    public final int g() {
        Location location;
        boolean z2;
        long j8;
        switch (this.f38482d) {
            case 0:
                return ((PowerManager) this.f38484f).isPowerSaveMode() ? 2 : 1;
            default:
                Dd.c cVar = (Dd.c) this.f38484f;
                E e7 = (E) cVar.f2644d;
                if (e7.f38376c > System.currentTimeMillis()) {
                    z2 = e7.f38375b;
                } else {
                    Context context = (Context) cVar.f2642b;
                    int iV = Fe.g.v(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location lastKnownLocation = null;
                    LocationManager locationManager = (LocationManager) cVar.f2643c;
                    if (iV == 0) {
                        try {
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (Fe.g.v(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e11) {
                            Log.d("TwilightManager", "Failed to get last known location", e11);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (C3063D.f38370d == null) {
                            C3063D.f38370d = new C3063D();
                        }
                        C3063D c3063d = C3063D.f38370d;
                        c3063d.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c3063d.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = c3063d.f38373c == 1;
                        long j10 = c3063d.f38372b;
                        long j11 = c3063d.f38371a;
                        c3063d.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j12 = c3063d.f38372b;
                        if (j10 == -1 || j11 == -1) {
                            j8 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis <= j11) {
                                j12 = jCurrentTimeMillis > j10 ? j11 : j10;
                            }
                            j8 = j12 + 60000;
                        }
                        e7.f38375b = z2;
                        e7.f38376c = j8;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i5 = Calendar.getInstance().get(11);
                        if (i5 < 6 || i5 >= 22) {
                            z2 = true;
                        }
                    }
                }
                return z2 ? 2 : 1;
        }
    }

    @Override // J4.d
    public final void k() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        switch (this.f38482d) {
            case 0:
                this.f38483e.m(true, true);
                break;
            default:
                this.f38483e.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, Context context) {
        super(wVar);
        this.f38483e = wVar;
        this.f38484f = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
