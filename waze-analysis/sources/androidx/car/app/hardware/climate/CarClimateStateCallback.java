package androidx.car.app.hardware.climate;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarValue;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public interface CarClimateStateCallback {
    void onCabinTemperatureStateAvailable(CarValue<Float> carValue);

    void onDefrosterStateAvailable(CarValue<Boolean> carValue);

    void onElectricDefrosterStateAvailable(CarValue<Boolean> carValue);

    void onFanDirectionStateAvailable(CarValue<Integer> carValue);

    void onFanSpeedLevelStateAvailable(CarValue<Integer> carValue);

    void onHvacAcStateAvailable(CarValue<Boolean> carValue);

    void onHvacAutoModeStateAvailable(CarValue<Boolean> carValue);

    void onHvacAutoRecirculationStateAvailable(CarValue<Boolean> carValue);

    void onHvacDualModeStateAvailable(CarValue<Boolean> carValue);

    void onHvacMaxAcModeStateAvailable(CarValue<Boolean> carValue);

    void onHvacPowerStateAvailable(CarValue<Boolean> carValue);

    void onHvacRecirculationStateAvailable(CarValue<Boolean> carValue);

    void onMaxDefrosterStateAvailable(CarValue<Boolean> carValue);

    void onSeatTemperatureLevelStateAvailable(CarValue<Integer> carValue);

    void onSeatVentilationLevelStateAvailable(CarValue<Integer> carValue);

    void onSteeringWheelHeatStateAvailable(CarValue<Boolean> carValue);

    /* compiled from: WazeSource */
    /* renamed from: androidx.car.app.hardware.climate.CarClimateStateCallback$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onCabinTemperatureStateAvailable(CarClimateStateCallback carClimateStateCallback, CarValue carValue) {
        }

        public static void $default$onDefrosterStateAvailable(CarClimateStateCallback carClimateStateCallback, CarValue carValue) {
        }

        public static void $default$onElectricDefrosterStateAvailable(CarClimateStateCallback carClimateStateCallback, CarValue carValue) {
        }

        public static void $default$onFanDirectionStateAvailable(CarClimateStateCallback carClimateStateCallback, CarValue carValue) {
        }

        public static void $default$onFanSpeedLevelStateAvailable(CarClimateStateCallback carClimateStateCallback, CarValue carValue) {
        }

        public static void $default$onHvacAcStateAvailable(CarClimateStateCallback carClimateStateCallback, CarValue carValue) {
        }

        public static void $default$onHvacAutoModeStateAvailable(CarClimateStateCallback carClimateStateCallback, CarValue carValue) {
        }

        public static void $default$onHvacAutoRecirculationStateAvailable(CarClimateStateCallback carClimateStateCallback, CarValue carValue) {
        }

        public static void $default$onHvacDualModeStateAvailable(CarClimateStateCallback carClimateStateCallback, CarValue carValue) {
        }

        public static void $default$onHvacMaxAcModeStateAvailable(CarClimateStateCallback carClimateStateCallback, CarValue carValue) {
        }

        public static void $default$onHvacPowerStateAvailable(CarClimateStateCallback carClimateStateCallback, CarValue carValue) {
        }

        public static void $default$onHvacRecirculationStateAvailable(CarClimateStateCallback carClimateStateCallback, CarValue carValue) {
        }

        public static void $default$onMaxDefrosterStateAvailable(CarClimateStateCallback carClimateStateCallback, CarValue carValue) {
        }

        public static void $default$onSeatTemperatureLevelStateAvailable(CarClimateStateCallback carClimateStateCallback, CarValue carValue) {
        }

        public static void $default$onSeatVentilationLevelStateAvailable(CarClimateStateCallback carClimateStateCallback, CarValue carValue) {
        }

        public static void $default$onSteeringWheelHeatStateAvailable(CarClimateStateCallback carClimateStateCallback, CarValue carValue) {
        }
    }
}
