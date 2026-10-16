package androidx.car.app.hardware.climate;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes.dex */
public interface CarClimateProfileCallback {
    default void onCabinTemperatureProfileAvailable(CabinTemperatureProfile cabinTemperatureProfile) {
    }

    default void onCarZoneMappingInfoProfileAvailable(CarZoneMappingInfoProfile carZoneMappingInfoProfile) {
    }

    default void onDefrosterProfileAvailable(DefrosterProfile defrosterProfile) {
    }

    default void onElectricDefrosterProfileAvailable(ElectricDefrosterProfile electricDefrosterProfile) {
    }

    default void onFanDirectionProfileAvailable(FanDirectionProfile fanDirectionProfile) {
    }

    default void onFanSpeedLevelProfileAvailable(FanSpeedLevelProfile fanSpeedLevelProfile) {
    }

    default void onHvacAcProfileAvailable(HvacAcProfile hvacAcProfile) {
    }

    default void onHvacAutoModeProfileAvailable(HvacAutoModeProfile hvacAutoModeProfile) {
    }

    default void onHvacAutoRecirculationProfileAvailable(HvacAutoRecirculationProfile hvacAutoRecirculationProfile) {
    }

    default void onHvacDualModeProfileAvailable(HvacDualModeProfile hvacDualModeProfile) {
    }

    default void onHvacMaxAcModeProfileAvailable(HvacMaxAcModeProfile hvacMaxAcModeProfile) {
    }

    default void onHvacPowerProfileAvailable(HvacPowerProfile hvacPowerProfile) {
    }

    default void onHvacRecirculationProfileAvailable(HvacRecirculationProfile hvacRecirculationProfile) {
    }

    default void onMaxDefrosterProfileAvailable(MaxDefrosterProfile maxDefrosterProfile) {
    }

    default void onSeatTemperatureLevelProfileAvailable(SeatTemperatureProfile seatTemperatureProfile) {
    }

    default void onSeatVentilationLevelProfileAvailable(SeatVentilationProfile seatVentilationProfile) {
    }

    default void onSteeringWheelHeatProfileAvailable(SteeringWheelHeatProfile steeringWheelHeatProfile) {
    }
}
