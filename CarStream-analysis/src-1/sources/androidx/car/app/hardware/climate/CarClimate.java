package androidx.car.app.hardware.climate;

import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarSetOperationStatusCallback;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@RequiresCarApi(5)
/* loaded from: classes.dex */
public interface CarClimate {
    void fetchClimateProfile(Executor executor, ClimateProfileRequest climateProfileRequest, CarClimateProfileCallback carClimateProfileCallback);

    void registerClimateStateCallback(Executor executor, RegisterClimateStateRequest registerClimateStateRequest, CarClimateStateCallback carClimateStateCallback);

    <E> void setClimateState(Executor executor, ClimateStateRequest<E> climateStateRequest, CarSetOperationStatusCallback carSetOperationStatusCallback);

    void unregisterClimateStateCallback(CarClimateStateCallback carClimateStateCallback);
}
