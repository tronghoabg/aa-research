package androidx.car.app.hardware.common;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes.dex */
public interface CarSetOperationStatusCallback {
    public static final int OPERATION_STATUS_FEATURE_SETTING_NOT_ALLOWED = 4;
    public static final int OPERATION_STATUS_FEATURE_TEMPORARILY_UNAVAILABLE = 3;
    public static final int OPERATION_STATUS_FEATURE_UNIMPLEMENTED = 1;
    public static final int OPERATION_STATUS_FEATURE_UNSUPPORTED = 2;
    public static final int OPERATION_STATUS_ILLEGAL_CAR_HARDWARE_STATE = 7;
    public static final int OPERATION_STATUS_INSUFFICIENT_PERMISSION = 6;
    public static final int OPERATION_STATUS_SUCCESS = 0;
    public static final int OPERATION_STATUS_UNSUPPORTED_VALUE = 5;
    public static final int OPERATION_STATUS_UPDATE_TIMEOUT = 8;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface StatusCode {
    }

    static String toString(int i) {
        switch (i) {
            case 0:
                return "OPERATION_STATUS_SUCCESS";
            case 1:
                return "OPERATION_STATUS_FEATURE_UNIMPLEMENTED";
            case 2:
                return "OPERATION_STATUS_FEATURE_UNSUPPORTED";
            case 3:
                return "OPERATION_STATUS_FEATURE_TEMPORARILY_UNAVAILABLE";
            case 4:
                return "OPERATION_STATUS_FEATURE_SETTING_NOT_ALLOWED";
            case 5:
                return "OPERATION_STATUS_UNSUPPORTED_VALUE";
            case 6:
                return "OPERATION_STATUS_INSUFFICIENT_PERMISSION";
            case 7:
                return "OPERATION_STATUS_ILLEGAL_CAR_HARDWARE_STATE";
            case 8:
                return "OPERATION_STATUS_UPDATE_TIMEOUT";
            default:
                throw new IllegalArgumentException("Invalid status code");
        }
    }

    default void onSetCarClimateStateCabinTemperature(int i) {
    }

    default void onSetCarClimateStateDefroster(int i) {
    }

    default void onSetCarClimateStateElectricDefroster(int i) {
    }

    default void onSetCarClimateStateFanDirection(int i) {
    }

    default void onSetCarClimateStateFanSpeedLevel(int i) {
    }

    default void onSetCarClimateStateHvacAc(int i) {
    }

    default void onSetCarClimateStateHvacAutoMode(int i) {
    }

    default void onSetCarClimateStateHvacAutoRecirculation(int i) {
    }

    default void onSetCarClimateStateHvacDualMode(int i) {
    }

    default void onSetCarClimateStateHvacMaxAcMode(int i) {
    }

    default void onSetCarClimateStateHvacPower(int i) {
    }

    default void onSetCarClimateStateHvacRecirculation(int i) {
    }

    default void onSetCarClimateStateMaxDefroster(int i) {
    }

    default void onSetCarClimateStateSeatTemperatureLevel(int i) {
    }

    default void onSetCarClimateStateSeatVentilationLevel(int i) {
    }

    default void onSetCarClimateStateSteeringWheelHeat(int i) {
    }
}
