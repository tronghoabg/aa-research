package androidx.car.app.hardware.climate;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarValue;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes.dex */
public interface CarClimateStateCallback {
    default void onCabinTemperatureStateAvailable(CarValue<Float> carValue) {
    }

    default void onDefrosterStateAvailable(CarValue<Boolean> carValue) {
    }

    default void onElectricDefrosterStateAvailable(CarValue<Boolean> carValue) {
    }

    default void onFanDirectionStateAvailable(CarValue<Integer> carValue) {
    }

    default void onFanSpeedLevelStateAvailable(CarValue<Integer> carValue) {
    }

    default void onHvacAcStateAvailable(CarValue<Boolean> carValue) {
    }

    default void onHvacAutoModeStateAvailable(CarValue<Boolean> carValue) {
    }

    default void onHvacAutoRecirculationStateAvailable(CarValue<Boolean> carValue) {
    }

    default void onHvacDualModeStateAvailable(CarValue<Boolean> carValue) {
    }

    default void onHvacMaxAcModeStateAvailable(CarValue<Boolean> carValue) {
    }

    default void onHvacPowerStateAvailable(CarValue<Boolean> carValue) {
    }

    default void onHvacRecirculationStateAvailable(CarValue<Boolean> carValue) {
    }

    default void onMaxDefrosterStateAvailable(CarValue<Boolean> carValue) {
    }

    default void onSeatTemperatureLevelStateAvailable(CarValue<Integer> carValue) {
    }

    default void onSeatVentilationLevelStateAvailable(CarValue<Integer> carValue) {
    }

    default void onSteeringWheelHeatStateAvailable(CarValue<Boolean> carValue) {
    }
}
