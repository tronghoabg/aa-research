package androidx.car.app.hardware;

import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.car.app.CarAppMetadataHolderService;
import androidx.car.app.CarContext;
import androidx.car.app.HostDispatcher;
import androidx.car.app.HostException;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.climate.CarClimate;
import androidx.car.app.hardware.info.CarInfo;
import androidx.car.app.hardware.info.CarSensors;
import androidx.car.app.managers.Manager;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@RequiresCarApi(3)
/* loaded from: classes.dex */
public interface CarHardwareManager extends Manager {
    static CarHardwareManager create(CarContext carContext, HostDispatcher hostDispatcher) throws ClassNotFoundException {
        if (carContext.getCarAppApiLevel() < 3) {
            throw new HostException("Create CarHardwareManager failed", new IllegalArgumentException("Attempted to retrieve CarHardwareManager service, but the host is less than 3"));
        }
        try {
            Bundle bundle = CarAppMetadataHolderService.getServiceInfo(carContext).metaData;
            String string = bundle != null ? bundle.getString("androidx.car.app.CarAppMetadataHolderService.CAR_HARDWARE_MANAGER") : null;
            if (string != null) {
                return (CarHardwareManager) Class.forName(string).getConstructor(CarContext.class, HostDispatcher.class).newInstance(carContext, hostDispatcher);
            }
            throw new ClassNotFoundException("CarHardwareManager metadata could not be found");
        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
            throw new IllegalStateException("CarHardwareManager not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
        }
    }

    default CarClimate getCarClimate() {
        throw new UnsupportedOperationException();
    }

    default CarInfo getCarInfo() {
        throw new UnsupportedOperationException();
    }

    default CarSensors getCarSensors() {
        throw new UnsupportedOperationException();
    }
}
