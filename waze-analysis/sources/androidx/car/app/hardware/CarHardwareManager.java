package androidx.car.app.hardware;

import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import androidx.car.app.CarAppMetadataHolderService;
import androidx.car.app.CarContext;
import androidx.car.app.HostDispatcher;
import androidx.car.app.HostException;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.climate.CarClimate;
import androidx.car.app.hardware.info.CarInfo;
import androidx.car.app.hardware.info.CarSensors;
import androidx.car.app.managers.Manager;

/* compiled from: WazeSource */
@RequiresCarApi(3)
/* loaded from: classes2.dex */
public interface CarHardwareManager extends Manager {

    /* compiled from: WazeSource */
    /* renamed from: androidx.car.app.hardware.CarHardwareManager$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static CarClimate $default$getCarClimate(CarHardwareManager carHardwareManager) {
            throw new UnsupportedOperationException();
        }

        public static CarInfo $default$getCarInfo(CarHardwareManager carHardwareManager) {
            throw new UnsupportedOperationException();
        }

        public static CarSensors $default$getCarSensors(CarHardwareManager carHardwareManager) {
            throw new UnsupportedOperationException();
        }

        public static CarHardwareManager create(CarContext carContext, HostDispatcher hostDispatcher) throws ClassNotFoundException {
            if (carContext.getCarAppApiLevel() < 3) {
                throw new HostException("Create CarHardwareManager failed", new IllegalArgumentException("Attempted to retrieve CarHardwareManager service, but the host is less than 3"));
            }
            try {
                ServiceInfo serviceInfo = CarAppMetadataHolderService.getServiceInfo(carContext);
                String string = serviceInfo.metaData != null ? serviceInfo.metaData.getString("androidx.car.app.CarAppMetadataHolderService.CAR_HARDWARE_MANAGER") : null;
                if (string != null) {
                    return (CarHardwareManager) Class.forName(string).getConstructor(CarContext.class, HostDispatcher.class).newInstance(carContext, hostDispatcher);
                }
                throw new ClassNotFoundException("CarHardwareManager metadata could not be found");
            } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
                throw new IllegalStateException("CarHardwareManager not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
            }
        }
    }

    CarClimate getCarClimate();

    CarInfo getCarInfo();

    CarSensors getCarSensors();
}
