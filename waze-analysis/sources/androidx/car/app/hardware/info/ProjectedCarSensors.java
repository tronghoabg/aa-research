package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarHardwareHostDispatcher;
import androidx.car.app.hardware.common.CarResultStubMap;
import androidx.car.app.hardware.common.CarValue;
import androidx.car.app.hardware.common.OnCarDataAvailableListener;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ProjectedCarSensors implements CarSensors {
    private static final CarValue<List<Float>> UNIMPLEMENTED_FLOAT_LIST = new CarValue<>(null, 0, 2);
    private final CarResultStubMap<Accelerometer, Integer> mAccelerometerCarResultStubMap;
    final CarHardwareHostDispatcher mCarHardwareHostDispatcher;
    private final CarResultStubMap<CarHardwareLocation, Integer> mCarHardwareLocationCarResultStubMap;
    private final CarResultStubMap<Compass, Integer> mCompassCarResultStubMap;
    private final CarResultStubMap<Gyroscope, Integer> mGyroscopeCarResultStubMap;

    public ProjectedCarSensors(CarHardwareHostDispatcher carHardwareHostDispatcher) {
        this.mCarHardwareHostDispatcher = (CarHardwareHostDispatcher) Objects.requireNonNull(carHardwareHostDispatcher);
        CarValue<List<Float>> carValue = UNIMPLEMENTED_FLOAT_LIST;
        this.mAccelerometerCarResultStubMap = new CarResultStubMap<>(20, new Accelerometer(carValue), carHardwareHostDispatcher);
        this.mGyroscopeCarResultStubMap = new CarResultStubMap<>(22, new Gyroscope(carValue), carHardwareHostDispatcher);
        this.mCompassCarResultStubMap = new CarResultStubMap<>(21, new Compass(carValue), carHardwareHostDispatcher);
        this.mCarHardwareLocationCarResultStubMap = new CarResultStubMap<>(23, new CarHardwareLocation(new CarValue(null, 0L, 2)), carHardwareHostDispatcher);
    }

    @Override // androidx.car.app.hardware.info.CarSensors
    public void addAccelerometerListener(int i2, Executor executor, OnCarDataAvailableListener<Accelerometer> onCarDataAvailableListener) {
        this.mAccelerometerCarResultStubMap.addListener(Integer.valueOf(i2), (Executor) Objects.requireNonNull(executor), (OnCarDataAvailableListener) Objects.requireNonNull(onCarDataAvailableListener));
    }

    @Override // androidx.car.app.hardware.info.CarSensors
    public void addCarHardwareLocationListener(int i2, Executor executor, OnCarDataAvailableListener<CarHardwareLocation> onCarDataAvailableListener) {
        this.mCarHardwareLocationCarResultStubMap.addListener(Integer.valueOf(i2), (Executor) Objects.requireNonNull(executor), (OnCarDataAvailableListener) Objects.requireNonNull(onCarDataAvailableListener));
    }

    @Override // androidx.car.app.hardware.info.CarSensors
    public void addCompassListener(int i2, Executor executor, OnCarDataAvailableListener<Compass> onCarDataAvailableListener) {
        this.mCompassCarResultStubMap.addListener(Integer.valueOf(i2), (Executor) Objects.requireNonNull(executor), (OnCarDataAvailableListener) Objects.requireNonNull(onCarDataAvailableListener));
    }

    @Override // androidx.car.app.hardware.info.CarSensors
    public void addGyroscopeListener(int i2, Executor executor, OnCarDataAvailableListener<Gyroscope> onCarDataAvailableListener) {
        this.mGyroscopeCarResultStubMap.addListener(Integer.valueOf(i2), (Executor) Objects.requireNonNull(executor), (OnCarDataAvailableListener) Objects.requireNonNull(onCarDataAvailableListener));
    }

    @Override // androidx.car.app.hardware.info.CarSensors
    public void removeAccelerometerListener(OnCarDataAvailableListener<Accelerometer> onCarDataAvailableListener) {
        this.mAccelerometerCarResultStubMap.removeListener((OnCarDataAvailableListener) Objects.requireNonNull(onCarDataAvailableListener));
    }

    @Override // androidx.car.app.hardware.info.CarSensors
    public void removeCarHardwareLocationListener(OnCarDataAvailableListener<CarHardwareLocation> onCarDataAvailableListener) {
        this.mCarHardwareLocationCarResultStubMap.removeListener((OnCarDataAvailableListener) Objects.requireNonNull(onCarDataAvailableListener));
    }

    @Override // androidx.car.app.hardware.info.CarSensors
    public void removeCompassListener(OnCarDataAvailableListener<Compass> onCarDataAvailableListener) {
        this.mCompassCarResultStubMap.removeListener((OnCarDataAvailableListener) Objects.requireNonNull(onCarDataAvailableListener));
    }

    @Override // androidx.car.app.hardware.info.CarSensors
    public void removeGyroscopeListener(OnCarDataAvailableListener<Gyroscope> onCarDataAvailableListener) {
        this.mGyroscopeCarResultStubMap.removeListener((OnCarDataAvailableListener) Objects.requireNonNull(onCarDataAvailableListener));
    }
}
