package cl.coders.faketraveler;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;

/* loaded from: classes.dex */
public class MockedLocationProvider {
    private static final int MAX_RETRY_COUNT = 3;
    private static final String TAG = "MockedLocationProvider";
    private final Context ctx;
    private final String providerName;

    public MockedLocationProvider(String str, Context context) {
        int i;
        int i2;
        this.providerName = str;
        this.ctx = context;
        if (Build.VERSION.SDK_INT >= 30) {
            i = 1;
            i2 = 2;
        } else {
            i = 0;
            i2 = 5;
        }
        startup((LocationManager) context.getSystemService("location"), i, i2);
    }

    private void startup(LocationManager locationManager, int i, int i2) {
        startup(locationManager, i, i2, 0);
    }

    private void startup(LocationManager locationManager, int i, int i2, int i3) {
        if (i3 < 3) {
            try {
                shutdown();
                locationManager.addTestProvider(this.providerName, false, false, false, false, false, true, true, i, i2);
                locationManager.setTestProviderEnabled(this.providerName, true);
                return;
            } catch (Throwable th) {
                Log.e(TAG, "startup: ", th);
                startup(locationManager, i, i2, i3 + 1);
                return;
            }
        }
        throw new SecurityException("Not allowed to perform MOCK_LOCATION");
    }

    public void pushLocation(double d, double d2) {
        LocationManager locationManager = (LocationManager) this.ctx.getSystemService("location");
        Location location = new Location(this.providerName);
        location.setLatitude(d);
        location.setLongitude(d2);
        location.setAltitude(3.0d);
        location.setTime(System.currentTimeMillis());
        location.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
        location.setSpeed(0.01f);
        location.setBearing(1.0f);
        location.setAccuracy(3.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            location.setBearingAccuracyDegrees(0.1f);
            location.setVerticalAccuracyMeters(0.1f);
            location.setSpeedAccuracyMetersPerSecond(0.01f);
        }
        Log.d(TAG, "pushLocation: " + d + ", " + d2);
        locationManager.setTestProviderLocation(this.providerName, location);
    }

    public void shutdown() {
        try {
            ((LocationManager) this.ctx.getSystemService("location")).removeTestProvider(this.providerName);
        } catch (Throwable unused) {
        }
    }
}
