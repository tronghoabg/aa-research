package e1;

import Y4.g;
import android.location.Location;
import android.location.LocationManager;
import android.location.LocationRequest;
import x4.f;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2466a {
    public static boolean a(Location location) {
        return location.isMock();
    }

    public static void b(LocationManager locationManager, String str, LocationRequest locationRequest, g gVar, f fVar) {
        locationManager.requestLocationUpdates(str, locationRequest, gVar, fVar);
    }

    public static LocationRequest c(d dVar) {
        LocationRequest.Builder quality = new LocationRequest.Builder(dVar.f34400b).setQuality(dVar.f34399a);
        long j8 = dVar.f34401c;
        if (j8 == -1) {
            j8 = dVar.f34400b;
        }
        return quality.setMinUpdateIntervalMillis(j8).setDurationMillis(Long.MAX_VALUE).setMaxUpdates(com.google.android.gms.common.api.f.API_PRIORITY_OTHER).setMinUpdateDistanceMeters(dVar.f34402d).setMaxUpdateDelayMillis(0L).build();
    }
}
