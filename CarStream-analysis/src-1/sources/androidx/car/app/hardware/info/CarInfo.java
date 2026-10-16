package androidx.car.app.hardware.info;

import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.OnCarDataAvailableListener;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@RequiresCarApi(3)
/* loaded from: classes.dex */
public interface CarInfo {
    void addEnergyLevelListener(Executor executor, OnCarDataAvailableListener<EnergyLevel> onCarDataAvailableListener);

    void addEvStatusListener(Executor executor, OnCarDataAvailableListener<EvStatus> onCarDataAvailableListener);

    void addMileageListener(Executor executor, OnCarDataAvailableListener<Mileage> onCarDataAvailableListener);

    void addSpeedListener(Executor executor, OnCarDataAvailableListener<Speed> onCarDataAvailableListener);

    void addTollListener(Executor executor, OnCarDataAvailableListener<TollCard> onCarDataAvailableListener);

    void fetchEnergyProfile(Executor executor, OnCarDataAvailableListener<EnergyProfile> onCarDataAvailableListener);

    void fetchModel(Executor executor, OnCarDataAvailableListener<Model> onCarDataAvailableListener);

    void removeEnergyLevelListener(OnCarDataAvailableListener<EnergyLevel> onCarDataAvailableListener);

    void removeEvStatusListener(OnCarDataAvailableListener<EvStatus> onCarDataAvailableListener);

    void removeMileageListener(OnCarDataAvailableListener<Mileage> onCarDataAvailableListener);

    void removeSpeedListener(OnCarDataAvailableListener<Speed> onCarDataAvailableListener);

    void removeTollListener(OnCarDataAvailableListener<TollCard> onCarDataAvailableListener);

    @RequiresCarApi(7)
    default void fetchExteriorDimensions(Executor executor, OnCarDataAvailableListener<ExteriorDimensions> onCarDataAvailableListener) {
    }
}
