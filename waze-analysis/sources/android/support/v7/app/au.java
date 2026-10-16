package android.support.v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.core.content.PermissionChecker;
import java.util.Calendar;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class au {

    /* renamed from: a, reason: collision with root package name */
    private static au f552a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f553b;

    /* renamed from: c, reason: collision with root package name */
    private final LocationManager f554c;

    /* renamed from: d, reason: collision with root package name */
    private final at f555d = new at();

    au(Context context, LocationManager locationManager) {
        this.f553b = context;
        this.f554c = locationManager;
    }

    static au a(Context context) {
        au auVar = f552a;
        if (auVar != null) {
            return auVar;
        }
        Context applicationContext = context.getApplicationContext();
        au auVar2 = new au(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        f552a = auVar2;
        return auVar2;
    }

    private final Location c(String str) {
        try {
            LocationManager locationManager = this.f554c;
            if (locationManager.isProviderEnabled(str)) {
                return locationManager.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    final boolean b() {
        long j2;
        at atVar = this.f555d;
        if (atVar.f551b > System.currentTimeMillis()) {
            return atVar.f550a;
        }
        Context context = this.f553b;
        Location locationC = PermissionChecker.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = PermissionChecker.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null ? locationC2 != null : locationC2.getTime() > locationC.getTime()) {
            locationC = locationC2;
        }
        if (locationC == null) {
            Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
            int i2 = Calendar.getInstance().get(11);
            return i2 < 6 || i2 >= 22;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        as asVarA = as.a();
        asVarA.b(jCurrentTimeMillis - 86400000, locationC.getLatitude(), locationC.getLongitude());
        asVarA.b(jCurrentTimeMillis, locationC.getLatitude(), locationC.getLongitude());
        int i3 = asVarA.f549c;
        long j3 = asVarA.f548b;
        long j4 = asVarA.f547a;
        asVarA.b(CalendarModelKt.MillisecondsIn24Hours + jCurrentTimeMillis, locationC.getLatitude(), locationC.getLongitude());
        long j5 = asVarA.f548b;
        if (j3 == -1 || j4 == -1) {
            j2 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j4) {
                j3 = j5;
            } else if (jCurrentTimeMillis > j3) {
                j3 = j4;
            }
            j2 = j3 + 60000;
        }
        boolean z = 1 == i3;
        atVar.f550a = z;
        atVar.f551b = j2;
        return z;
    }
}
