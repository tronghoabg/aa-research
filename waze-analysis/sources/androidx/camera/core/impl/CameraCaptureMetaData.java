package androidx.camera.core.impl;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraCaptureMetaData {

    /* compiled from: WazeSource */
    public enum AeMode {
        UNKNOWN,
        OFF,
        ON,
        ON_AUTO_FLASH,
        ON_ALWAYS_FLASH,
        ON_AUTO_FLASH_REDEYE,
        ON_EXTERNAL_FLASH
    }

    /* compiled from: WazeSource */
    public enum AeState {
        UNKNOWN,
        INACTIVE,
        SEARCHING,
        FLASH_REQUIRED,
        CONVERGED,
        LOCKED
    }

    /* compiled from: WazeSource */
    public enum AfMode {
        UNKNOWN,
        OFF,
        ON_MANUAL_AUTO,
        ON_CONTINUOUS_AUTO
    }

    /* compiled from: WazeSource */
    public enum AfState {
        UNKNOWN,
        INACTIVE,
        SCANNING,
        PASSIVE_FOCUSED,
        PASSIVE_NOT_FOCUSED,
        LOCKED_FOCUSED,
        LOCKED_NOT_FOCUSED
    }

    /* compiled from: WazeSource */
    public enum AwbMode {
        UNKNOWN,
        OFF,
        AUTO,
        INCANDESCENT,
        FLUORESCENT,
        WARM_FLUORESCENT,
        DAYLIGHT,
        CLOUDY_DAYLIGHT,
        TWILIGHT,
        SHADE
    }

    /* compiled from: WazeSource */
    public enum AwbState {
        UNKNOWN,
        INACTIVE,
        METERING,
        CONVERGED,
        LOCKED
    }

    /* compiled from: WazeSource */
    public enum FlashState {
        UNKNOWN,
        NONE,
        READY,
        FIRED;

        public int toFlashState() {
            int iOrdinal = ordinal();
            if (iOrdinal == 1) {
                return 2;
            }
            if (iOrdinal != 2) {
                return iOrdinal != 3 ? 0 : 1;
            }
            return 3;
        }
    }

    private CameraCaptureMetaData() {
    }
}
