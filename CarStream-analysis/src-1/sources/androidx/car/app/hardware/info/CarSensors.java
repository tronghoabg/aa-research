package androidx.car.app.hardware.info;

import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.OnCarDataAvailableListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@RequiresCarApi(3)
/* loaded from: classes.dex */
public interface CarSensors {
    public static final int UPDATE_RATE_FASTEST = 3;
    public static final int UPDATE_RATE_NORMAL = 1;
    public static final int UPDATE_RATE_UI = 2;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface UpdateRate {
    }

    void addAccelerometerListener(int i, Executor executor, OnCarDataAvailableListener<Accelerometer> onCarDataAvailableListener);

    void addCarHardwareLocationListener(int i, Executor executor, OnCarDataAvailableListener<CarHardwareLocation> onCarDataAvailableListener);

    void addCompassListener(int i, Executor executor, OnCarDataAvailableListener<Compass> onCarDataAvailableListener);

    void addGyroscopeListener(int i, Executor executor, OnCarDataAvailableListener<Gyroscope> onCarDataAvailableListener);

    void removeAccelerometerListener(OnCarDataAvailableListener<Accelerometer> onCarDataAvailableListener);

    void removeCarHardwareLocationListener(OnCarDataAvailableListener<CarHardwareLocation> onCarDataAvailableListener);

    void removeCompassListener(OnCarDataAvailableListener<Compass> onCarDataAvailableListener);

    void removeGyroscopeListener(OnCarDataAvailableListener<Gyroscope> onCarDataAvailableListener);
}
