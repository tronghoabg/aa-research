package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarHardwareHostDispatcher;
import androidx.car.app.hardware.common.CarResultStub;
import androidx.car.app.hardware.common.OnCarDataAvailableListener;
import androidx.car.app.hardware.info.EnergyLevel;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.hardware.info.EvStatus;
import androidx.car.app.hardware.info.Mileage;
import androidx.car.app.hardware.info.Model;
import androidx.car.app.hardware.info.Speed;
import androidx.car.app.hardware.info.TollCard;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ProjectedCarInfo implements CarInfo {
    private final CarResultStub<EnergyLevel> mEnergyLevelCarResultStub;
    private final CarResultStub<EnergyProfile> mEnergyProfileCarResultStub;
    private final CarResultStub<EvStatus> mEvStatusCarResultStub;
    private final CarResultStub<Mileage> mMileageCarResultStub;
    private final CarResultStub<Model> mModelCarResultStub;
    private final CarResultStub<Speed> mSpeedCarResultStub;
    private final CarResultStub<TollCard> mTollCarResultStub;

    public ProjectedCarInfo(CarHardwareHostDispatcher carHardwareHostDispatcher) {
        this.mModelCarResultStub = new CarResultStub<>(1, null, true, new Model.Builder().build(), carHardwareHostDispatcher);
        this.mEnergyProfileCarResultStub = new CarResultStub<>(2, null, true, new EnergyProfile.Builder().build(), carHardwareHostDispatcher);
        this.mTollCarResultStub = new CarResultStub<>(3, null, false, new TollCard.Builder().build(), carHardwareHostDispatcher);
        this.mEnergyLevelCarResultStub = new CarResultStub<>(4, null, false, new EnergyLevel.Builder().build(), carHardwareHostDispatcher);
        this.mSpeedCarResultStub = new CarResultStub<>(5, null, false, new Speed.Builder().build(), carHardwareHostDispatcher);
        this.mMileageCarResultStub = new CarResultStub<>(6, null, false, new Mileage.Builder().build(), carHardwareHostDispatcher);
        this.mEvStatusCarResultStub = new CarResultStub<>(7, null, false, new EvStatus.Builder().build(), carHardwareHostDispatcher);
    }

    @Override // androidx.car.app.hardware.info.CarInfo
    public void addEnergyLevelListener(Executor executor, OnCarDataAvailableListener<EnergyLevel> onCarDataAvailableListener) {
        this.mEnergyLevelCarResultStub.addListener(executor, onCarDataAvailableListener);
    }

    @Override // androidx.car.app.hardware.info.CarInfo
    public void addEvStatusListener(Executor executor, OnCarDataAvailableListener<EvStatus> onCarDataAvailableListener) {
        this.mEvStatusCarResultStub.addListener(executor, onCarDataAvailableListener);
    }

    @Override // androidx.car.app.hardware.info.CarInfo
    public void addMileageListener(Executor executor, OnCarDataAvailableListener<Mileage> onCarDataAvailableListener) {
        this.mMileageCarResultStub.addListener(executor, onCarDataAvailableListener);
    }

    @Override // androidx.car.app.hardware.info.CarInfo
    public void addSpeedListener(Executor executor, OnCarDataAvailableListener<Speed> onCarDataAvailableListener) {
        this.mSpeedCarResultStub.addListener(executor, onCarDataAvailableListener);
    }

    @Override // androidx.car.app.hardware.info.CarInfo
    public void addTollListener(Executor executor, OnCarDataAvailableListener<TollCard> onCarDataAvailableListener) {
        this.mTollCarResultStub.addListener(executor, onCarDataAvailableListener);
    }

    @Override // androidx.car.app.hardware.info.CarInfo
    public void fetchEnergyProfile(Executor executor, OnCarDataAvailableListener<EnergyProfile> onCarDataAvailableListener) {
        this.mEnergyProfileCarResultStub.addListener(executor, onCarDataAvailableListener);
    }

    @Override // androidx.car.app.hardware.info.CarInfo
    public void fetchExteriorDimensions(Executor executor, final OnCarDataAvailableListener<ExteriorDimensions> onCarDataAvailableListener) {
        executor.execute(new Runnable() { // from class: androidx.car.app.hardware.info.ProjectedCarInfo$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                onCarDataAvailableListener.onCarDataAvailable(new ExteriorDimensions());
            }
        });
    }

    @Override // androidx.car.app.hardware.info.CarInfo
    public void fetchModel(Executor executor, OnCarDataAvailableListener<Model> onCarDataAvailableListener) {
        this.mModelCarResultStub.addListener(executor, onCarDataAvailableListener);
    }

    @Override // androidx.car.app.hardware.info.CarInfo
    public void removeEnergyLevelListener(OnCarDataAvailableListener<EnergyLevel> onCarDataAvailableListener) {
        this.mEnergyLevelCarResultStub.removeListener(onCarDataAvailableListener);
    }

    @Override // androidx.car.app.hardware.info.CarInfo
    public void removeEvStatusListener(OnCarDataAvailableListener<EvStatus> onCarDataAvailableListener) {
        this.mEvStatusCarResultStub.removeListener(onCarDataAvailableListener);
    }

    @Override // androidx.car.app.hardware.info.CarInfo
    public void removeMileageListener(OnCarDataAvailableListener<Mileage> onCarDataAvailableListener) {
        this.mMileageCarResultStub.removeListener(onCarDataAvailableListener);
    }

    @Override // androidx.car.app.hardware.info.CarInfo
    public void removeSpeedListener(OnCarDataAvailableListener<Speed> onCarDataAvailableListener) {
        this.mSpeedCarResultStub.removeListener(onCarDataAvailableListener);
    }

    @Override // androidx.car.app.hardware.info.CarInfo
    public void removeTollListener(OnCarDataAvailableListener<TollCard> onCarDataAvailableListener) {
        this.mTollCarResultStub.removeListener(onCarDataAvailableListener);
    }
}
