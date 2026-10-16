package androidx.car.app.hardware.common;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes2.dex */
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

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface StatusCode {
    }

    void onSetCarClimateStateCabinTemperature(int i2);

    void onSetCarClimateStateDefroster(int i2);

    void onSetCarClimateStateElectricDefroster(int i2);

    void onSetCarClimateStateFanDirection(int i2);

    void onSetCarClimateStateFanSpeedLevel(int i2);

    void onSetCarClimateStateHvacAc(int i2);

    void onSetCarClimateStateHvacAutoMode(int i2);

    void onSetCarClimateStateHvacAutoRecirculation(int i2);

    void onSetCarClimateStateHvacDualMode(int i2);

    void onSetCarClimateStateHvacMaxAcMode(int i2);

    void onSetCarClimateStateHvacPower(int i2);

    void onSetCarClimateStateHvacRecirculation(int i2);

    void onSetCarClimateStateMaxDefroster(int i2);

    void onSetCarClimateStateSeatTemperatureLevel(int i2);

    void onSetCarClimateStateSeatVentilationLevel(int i2);

    void onSetCarClimateStateSteeringWheelHeat(int i2);

    /* compiled from: WazeSource */
    /* renamed from: androidx.car.app.hardware.common.CarSetOperationStatusCallback$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static String toString(int i2) {
            switch (i2) {
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

        public static void $default$onSetCarClimateStateCabinTemperature(CarSetOperationStatusCallback carSetOperationStatusCallback, int i2) {
        }

        public static void $default$onSetCarClimateStateDefroster(CarSetOperationStatusCallback carSetOperationStatusCallback, int i2) {
        }

        public static void $default$onSetCarClimateStateElectricDefroster(CarSetOperationStatusCallback carSetOperationStatusCallback, int i2) {
        }

        public static void $default$onSetCarClimateStateFanDirection(CarSetOperationStatusCallback carSetOperationStatusCallback, int i2) {
        }

        public static void $default$onSetCarClimateStateFanSpeedLevel(CarSetOperationStatusCallback carSetOperationStatusCallback, int i2) {
        }

        public static void $default$onSetCarClimateStateHvacAc(CarSetOperationStatusCallback carSetOperationStatusCallback, int i2) {
        }

        public static void $default$onSetCarClimateStateHvacAutoMode(CarSetOperationStatusCallback carSetOperationStatusCallback, int i2) {
        }

        public static void $default$onSetCarClimateStateHvacAutoRecirculation(CarSetOperationStatusCallback carSetOperationStatusCallback, int i2) {
        }

        public static void $default$onSetCarClimateStateHvacDualMode(CarSetOperationStatusCallback carSetOperationStatusCallback, int i2) {
        }

        public static void $default$onSetCarClimateStateHvacMaxAcMode(CarSetOperationStatusCallback carSetOperationStatusCallback, int i2) {
        }

        public static void $default$onSetCarClimateStateHvacPower(CarSetOperationStatusCallback carSetOperationStatusCallback, int i2) {
        }

        public static void $default$onSetCarClimateStateHvacRecirculation(CarSetOperationStatusCallback carSetOperationStatusCallback, int i2) {
        }

        public static void $default$onSetCarClimateStateMaxDefroster(CarSetOperationStatusCallback carSetOperationStatusCallback, int i2) {
        }

        public static void $default$onSetCarClimateStateSeatTemperatureLevel(CarSetOperationStatusCallback carSetOperationStatusCallback, int i2) {
        }

        public static void $default$onSetCarClimateStateSeatVentilationLevel(CarSetOperationStatusCallback carSetOperationStatusCallback, int i2) {
        }

        public static void $default$onSetCarClimateStateSteeringWheelHeat(CarSetOperationStatusCallback carSetOperationStatusCallback, int i2) {
        }
    }
}
