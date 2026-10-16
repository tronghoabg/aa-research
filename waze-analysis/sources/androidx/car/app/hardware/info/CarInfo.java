package androidx.car.app.hardware.info;

import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.OnCarDataAvailableListener;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
@RequiresCarApi(3)
/* loaded from: classes2.dex */
public interface CarInfo {
    void addEnergyLevelListener(Executor executor, OnCarDataAvailableListener<EnergyLevel> onCarDataAvailableListener);

    void addEvStatusListener(Executor executor, OnCarDataAvailableListener<EvStatus> onCarDataAvailableListener);

    void addMileageListener(Executor executor, OnCarDataAvailableListener<Mileage> onCarDataAvailableListener);

    void addSpeedListener(Executor executor, OnCarDataAvailableListener<Speed> onCarDataAvailableListener);

    void addTollListener(Executor executor, OnCarDataAvailableListener<TollCard> onCarDataAvailableListener);

    void fetchEnergyProfile(Executor executor, OnCarDataAvailableListener<EnergyProfile> onCarDataAvailableListener);

    @RequiresCarApi(7)
    void fetchExteriorDimensions(Executor executor, OnCarDataAvailableListener<ExteriorDimensions> onCarDataAvailableListener);

    void fetchModel(Executor executor, OnCarDataAvailableListener<Model> onCarDataAvailableListener);

    void removeEnergyLevelListener(OnCarDataAvailableListener<EnergyLevel> onCarDataAvailableListener);

    void removeEvStatusListener(OnCarDataAvailableListener<EvStatus> onCarDataAvailableListener);

    void removeMileageListener(OnCarDataAvailableListener<Mileage> onCarDataAvailableListener);

    void removeSpeedListener(OnCarDataAvailableListener<Speed> onCarDataAvailableListener);

    void removeTollListener(OnCarDataAvailableListener<TollCard> onCarDataAvailableListener);

    /* compiled from: WazeSource */
    /* renamed from: androidx.car.app.hardware.info.CarInfo$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        @RequiresCarApi(7)
        public static void $default$fetchExteriorDimensions(CarInfo carInfo, Executor executor, OnCarDataAvailableListener onCarDataAvailableListener) {
        }
    }
}
