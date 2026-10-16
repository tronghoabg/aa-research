import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.SystemClock;

import java.lang.reflect.Method;

public class WynMock {
    public static void main(String[] args) throws Exception {
        Class<?> activityThread = Class.forName("android.app.ActivityThread");
        Object thread = activityThread.getMethod("systemMain").invoke(null);
        Method getSystemContext = activityThread.getDeclaredMethod("getSystemContext");
        getSystemContext.setAccessible(true);
        Context context = (Context) getSystemContext.invoke(thread);
        LocationManager manager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);

        try {
            manager.removeTestProvider(LocationManager.GPS_PROVIDER);
        } catch (Exception ignored) {
        }
        manager.addTestProvider(LocationManager.GPS_PROVIDER, false, false, false, false,
                true, true, true, 1, 1);
        manager.setTestProviderEnabled(LocationManager.GPS_PROVIDER, true);

        for (int step = 0; step < 40; step++) {
            Location location = new Location(LocationManager.GPS_PROVIDER);
            location.setLatitude(21.365806 + step * 0.00001);
            location.setLongitude(106.089767 + step * 0.00003);
            location.setAccuracy(3.0f);
            location.setBearing(70.0f);
            location.setSpeed(10.0f);
            location.setTime(System.currentTimeMillis());
            location.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
            manager.setTestProviderLocation(LocationManager.GPS_PROVIDER, location);
            Thread.sleep(500);
        }

        manager.removeTestProvider(LocationManager.GPS_PROVIDER);
    }
}
