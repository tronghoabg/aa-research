package cl.coders.faketraveler;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class MockedLocationService extends Service {
    private static final String TAG = "MockedLocationService";
    protected final MutableLiveData<MockState> mockState = new MutableLiveData<>();
    protected final MutableLiveData<Location> mockedLocation = new MutableLiveData<>();
    private final List<MockedLocationProvider> providers = new ArrayList();
    private final Timer timer = new Timer();
    private final Set<TimerTask> tasks = Collections.synchronizedSet(new HashSet());

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        indicateBinding();
        return new MockedBinder(this);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        Log.d(TAG, "Mock is finished");
        Iterator<TimerTask> it = this.tasks.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.tasks.clear();
        Iterator<MockedLocationProvider> it2 = this.providers.iterator();
        while (it2.hasNext()) {
            it2.next().shutdown();
        }
        this.providers.clear();
        this.mockState.postValue(MockState.NOT_MOCKED);
        return super.onUnbind(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void indicateBinding() {
        this.mockState.postValue(MockState.SERVICE_BOUND);
    }

    protected void startMockedService(double d, double d2, double d3, double d4, long j, int i, float f) {
        try {
            this.providers.clear();
            this.providers.add(new MockedLocationProvider("gps", this));
            this.providers.add(new MockedLocationProvider("network", this));
            if (Build.VERSION.SDK_INT >= 31) {
                this.providers.add(new MockedLocationProvider("fused", this));
            }
            MockedTask mockedTask = new MockedTask(d, d2, d3, d4, i, f);
            this.timer.schedule(mockedTask, 0L, j);
            this.tasks.add(mockedTask);
            this.mockState.postValue(MockState.MOCKED);
        } catch (SecurityException e) {
            Log.e(TAG, "Could not construct mock location providers!", e);
            this.mockState.postValue(MockState.MOCK_ERROR);
        }
    }

    class MockedTask extends TimerTask {
        private int currentTimes = 0;
        private double latitude;
        private final double latitudeMockedDistance;
        private double longitude;
        private final double longitudeMockedDistance;
        private final int maxLocationTimes;
        private final float speed;

        public MockedTask(double d, double d2, double d3, double d4, int i, float f) {
            this.longitude = d;
            this.latitude = d2;
            this.longitudeMockedDistance = d3;
            this.latitudeMockedDistance = d4;
            this.maxLocationTimes = i;
            this.speed = f;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Location location = new Location("gps");
            location.setLongitude(this.longitude);
            location.setLatitude(this.latitude);
            float f = this.speed;
            if (f > 0.0f) {
                location.setSpeed(f);
                location.setAccuracy(0.1f);
                location.setTime(System.currentTimeMillis());
                if (Build.VERSION.SDK_INT >= 26) {
                    location.setSpeedAccuracyMetersPerSecond(0.01f);
                }
            }
            MockedLocationService.this.mockedLocation.postValue(location);
            Iterator it = MockedLocationService.this.providers.iterator();
            while (it.hasNext()) {
                ((MockedLocationProvider) it.next()).pushLocation(this.latitude, this.longitude);
            }
            int i = this.currentTimes + 1;
            this.currentTimes = i;
            int i2 = this.maxLocationTimes;
            if (i2 != 0 && i2 == i) {
                cancel();
                MockedLocationService.this.stopSelf();
                MockedLocationService.this.mockState.postValue(MockState.NOT_MOCKED);
            }
            this.latitude += this.latitudeMockedDistance;
            this.longitude += this.longitudeMockedDistance;
        }
    }

    public static class MockedBinder extends Binder {
        public final LiveData<MockState> mockState;
        public final LiveData<Location> mockedLocation;
        private final MockedLocationService service;

        public MockedBinder(MockedLocationService mockedLocationService) {
            this.service = mockedLocationService;
            this.mockState = mockedLocationService.mockState;
            this.mockedLocation = mockedLocationService.mockedLocation;
        }

        public void continueMock() {
            this.service.indicateBinding();
        }

        public void startMock(double d, double d2, double d3, double d4, long j, int i, float f) {
            this.service.startMockedService(d, d2, d3, d4, j, i, f);
        }
    }
}
