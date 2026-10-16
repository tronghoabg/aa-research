package androidx.car.app.hardware;

import androidx.car.app.CarContext;
import androidx.car.app.HostDispatcher;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.hardware.CarHardwareManager;
import androidx.car.app.hardware.climate.CarClimate;
import androidx.car.app.hardware.common.CarHardwareHostDispatcher;
import androidx.car.app.hardware.info.CarInfo;
import androidx.car.app.hardware.info.CarSensors;
import androidx.car.app.hardware.info.ProjectedCarInfo;
import androidx.car.app.hardware.info.ProjectedCarSensors;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public class ProjectedCarHardwareManager implements CarHardwareManager {
    private final ProjectedCarInfo mVehicleInfo;
    private final ProjectedCarSensors mVehicleSensors;

    public ProjectedCarHardwareManager(CarContext carContext, HostDispatcher hostDispatcher) {
        CarHardwareHostDispatcher carHardwareHostDispatcher = new CarHardwareHostDispatcher(hostDispatcher);
        this.mVehicleInfo = new ProjectedCarInfo(carHardwareHostDispatcher);
        this.mVehicleSensors = new ProjectedCarSensors(carHardwareHostDispatcher);
    }

    @Override // androidx.car.app.hardware.CarHardwareManager
    public /* synthetic */ CarClimate getCarClimate() {
        return CarHardwareManager.CC.$default$getCarClimate(this);
    }

    @Override // androidx.car.app.hardware.CarHardwareManager
    public CarInfo getCarInfo() {
        return this.mVehicleInfo;
    }

    @Override // androidx.car.app.hardware.CarHardwareManager
    public CarSensors getCarSensors() {
        return this.mVehicleSensors;
    }
}
