package androidx.camera.camera2.adapter;

import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.utils.ExifData;
import h.g.b.x;
import java.nio.BufferUnderflowException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CaptureResultAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraCaptureMetaData.AeMode getAeMode(FrameMetadata frameMetadata) {
        CaptureResult.Key key = CaptureResult.CONTROL_AE_MODE;
        x.e(key, "CONTROL_AE_MODE");
        Integer num = (Integer) frameMetadata.get(key);
        if (num != null && num.intValue() == 0) {
            return CameraCaptureMetaData.AeMode.OFF;
        }
        if (num != null && num.intValue() == 1) {
            return CameraCaptureMetaData.AeMode.ON;
        }
        if (num != null && num.intValue() == 2) {
            return CameraCaptureMetaData.AeMode.ON_AUTO_FLASH;
        }
        if (num != null && num.intValue() == 3) {
            return CameraCaptureMetaData.AeMode.ON_ALWAYS_FLASH;
        }
        if (num != null && num.intValue() == 4) {
            return CameraCaptureMetaData.AeMode.ON_AUTO_FLASH_REDEYE;
        }
        if (num == null) {
            return CameraCaptureMetaData.AeMode.UNKNOWN;
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, a.a(num, frameMetadata, "Unknown AE mode ("));
        }
        return CameraCaptureMetaData.AeMode.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraCaptureMetaData.AeState getAeState(FrameMetadata frameMetadata) {
        CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
        x.e(key, "CONTROL_AE_STATE");
        Integer num = (Integer) frameMetadata.get(key);
        if (num != null && num.intValue() == 0) {
            return CameraCaptureMetaData.AeState.INACTIVE;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 5)) {
            return CameraCaptureMetaData.AeState.SEARCHING;
        }
        if (num != null && num.intValue() == 4) {
            return CameraCaptureMetaData.AeState.FLASH_REQUIRED;
        }
        if (num != null && num.intValue() == 2) {
            return CameraCaptureMetaData.AeState.CONVERGED;
        }
        if (num != null && num.intValue() == 3) {
            return CameraCaptureMetaData.AeState.LOCKED;
        }
        if (num == null) {
            return CameraCaptureMetaData.AeState.UNKNOWN;
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, a.a(num, frameMetadata, "Unknown AE state ("));
        }
        return CameraCaptureMetaData.AeState.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraCaptureMetaData.AfMode getAfMode(FrameMetadata frameMetadata) {
        CaptureResult.Key key = CaptureResult.CONTROL_AF_MODE;
        x.e(key, "CONTROL_AF_MODE");
        Integer num = (Integer) frameMetadata.get(key);
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 5)) {
            return CameraCaptureMetaData.AfMode.OFF;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
            return CameraCaptureMetaData.AfMode.ON_MANUAL_AUTO;
        }
        if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 3)) {
            return CameraCaptureMetaData.AfMode.ON_CONTINUOUS_AUTO;
        }
        if (num == null) {
            return CameraCaptureMetaData.AfMode.UNKNOWN;
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, a.a(num, frameMetadata, "Unknown AF mode ("));
        }
        return CameraCaptureMetaData.AfMode.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraCaptureMetaData.AfState getAfState(FrameMetadata frameMetadata) {
        CaptureResult.Key key = CaptureResult.CONTROL_AF_STATE;
        x.e(key, "CONTROL_AF_STATE");
        Integer num = (Integer) frameMetadata.get(key);
        if (num != null && num.intValue() == 0) {
            return CameraCaptureMetaData.AfState.INACTIVE;
        }
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 1)) {
            return CameraCaptureMetaData.AfState.SCANNING;
        }
        if (num != null && num.intValue() == 4) {
            return CameraCaptureMetaData.AfState.LOCKED_FOCUSED;
        }
        if (num != null && num.intValue() == 5) {
            return CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED;
        }
        if (num != null && num.intValue() == 2) {
            return CameraCaptureMetaData.AfState.PASSIVE_FOCUSED;
        }
        if (num != null && num.intValue() == 6) {
            return CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED;
        }
        if (num == null) {
            return CameraCaptureMetaData.AfState.UNKNOWN;
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, a.a(num, frameMetadata, "Unknown AF state ("));
        }
        return CameraCaptureMetaData.AfState.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraCaptureMetaData.AwbMode getAwbMode(FrameMetadata frameMetadata) {
        CaptureResult.Key key = CaptureResult.CONTROL_AWB_MODE;
        x.e(key, "CONTROL_AWB_MODE");
        Integer num = (Integer) frameMetadata.get(key);
        if (num != null && num.intValue() == 0) {
            return CameraCaptureMetaData.AwbMode.OFF;
        }
        if (num != null && num.intValue() == 1) {
            return CameraCaptureMetaData.AwbMode.AUTO;
        }
        if (num != null && num.intValue() == 2) {
            return CameraCaptureMetaData.AwbMode.INCANDESCENT;
        }
        if (num != null && num.intValue() == 3) {
            return CameraCaptureMetaData.AwbMode.FLUORESCENT;
        }
        if (num != null && num.intValue() == 4) {
            return CameraCaptureMetaData.AwbMode.WARM_FLUORESCENT;
        }
        if (num != null && num.intValue() == 5) {
            return CameraCaptureMetaData.AwbMode.DAYLIGHT;
        }
        if (num != null && num.intValue() == 6) {
            return CameraCaptureMetaData.AwbMode.CLOUDY_DAYLIGHT;
        }
        if (num != null && num.intValue() == 7) {
            return CameraCaptureMetaData.AwbMode.TWILIGHT;
        }
        if (num != null && num.intValue() == 8) {
            return CameraCaptureMetaData.AwbMode.SHADE;
        }
        if (num == null) {
            return CameraCaptureMetaData.AwbMode.UNKNOWN;
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, a.a(num, frameMetadata, "Unknown AWB mode ("));
        }
        return CameraCaptureMetaData.AwbMode.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraCaptureMetaData.AwbState getAwbState(FrameMetadata frameMetadata) {
        CaptureResult.Key key = CaptureResult.CONTROL_AWB_STATE;
        x.e(key, "CONTROL_AWB_STATE");
        Integer num = (Integer) frameMetadata.get(key);
        if (num != null && num.intValue() == 0) {
            return CameraCaptureMetaData.AwbState.INACTIVE;
        }
        if (num != null && num.intValue() == 1) {
            return CameraCaptureMetaData.AwbState.METERING;
        }
        if (num != null && num.intValue() == 2) {
            return CameraCaptureMetaData.AwbState.CONVERGED;
        }
        if (num != null && num.intValue() == 3) {
            return CameraCaptureMetaData.AwbState.LOCKED;
        }
        if (num == null) {
            return CameraCaptureMetaData.AwbState.UNKNOWN;
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, a.a(num, frameMetadata, "Unknown AWB state ("));
        }
        return CameraCaptureMetaData.AwbState.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraCaptureMetaData.FlashState getFlashState(FrameMetadata frameMetadata) {
        CaptureResult.Key key = CaptureResult.FLASH_STATE;
        x.e(key, "FLASH_STATE");
        Integer num = (Integer) frameMetadata.get(key);
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 1)) {
            return CameraCaptureMetaData.FlashState.NONE;
        }
        if (num != null && num.intValue() == 2) {
            return CameraCaptureMetaData.FlashState.READY;
        }
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 4)) {
            return CameraCaptureMetaData.FlashState.FIRED;
        }
        if (num == null) {
            return CameraCaptureMetaData.FlashState.UNKNOWN;
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, a.a(num, frameMetadata, "Unknown flash state ("));
        }
        return CameraCaptureMetaData.FlashState.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getTimestamp(FrameMetadata frameMetadata) {
        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
        x.e(key, "SENSOR_TIMESTAMP");
        Object orDefault = frameMetadata.getOrDefault((CaptureResult.Key<CaptureResult.Key>) key, (CaptureResult.Key) (-1L));
        x.e(orDefault, "getOrDefault(...)");
        return ((Number) orDefault).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void populateExifData(FrameMetadata frameMetadata, ExifData.Builder builder) throws NumberFormatException {
        try {
            CaptureResult.Key key = CaptureResult.JPEG_ORIENTATION;
            x.e(key, "JPEG_ORIENTATION");
            Integer num = (Integer) frameMetadata.get(key);
            if (num != null) {
                builder.setOrientationDegrees(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isWarnEnabled(Log.TAG)) {
                android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Failed to get JPEG orientation.");
            }
        }
        CaptureResult.Key key2 = CaptureResult.SENSOR_EXPOSURE_TIME;
        x.e(key2, "SENSOR_EXPOSURE_TIME");
        Long l2 = (Long) frameMetadata.get(key2);
        if (l2 != null) {
            builder.setExposureTimeNanos(l2.longValue());
        }
        CaptureResult.Key key3 = CaptureResult.LENS_APERTURE;
        x.e(key3, "LENS_APERTURE");
        Float f2 = (Float) frameMetadata.get(key3);
        if (f2 != null) {
            builder.setLensFNumber(f2.floatValue());
        }
        CaptureResult.Key key4 = CaptureResult.SENSOR_SENSITIVITY;
        x.e(key4, "SENSOR_SENSITIVITY");
        Integer num2 = (Integer) frameMetadata.get(key4);
        if (num2 != null) {
            int iIntValue = num2.intValue();
            builder.setIso(iIntValue);
            CaptureResult.Key key5 = CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST;
            x.e(key5, "CONTROL_POST_RAW_SENSITIVITY_BOOST");
            if (((Integer) frameMetadata.get(key5)) != null) {
                builder.setIso(iIntValue * ((int) (r1.intValue() / 100.0f)));
            }
        }
        CaptureResult.Key key6 = CaptureResult.LENS_FOCAL_LENGTH;
        x.e(key6, "LENS_FOCAL_LENGTH");
        Float f3 = (Float) frameMetadata.get(key6);
        if (f3 != null) {
            builder.setFocalLength(f3.floatValue());
        }
        CaptureResult.Key key7 = CaptureResult.CONTROL_AWB_MODE;
        x.e(key7, "CONTROL_AWB_MODE");
        Integer num3 = (Integer) frameMetadata.get(key7);
        if (num3 != null) {
            int iIntValue2 = num3.intValue();
            ExifData.WhiteBalanceMode whiteBalanceMode = ExifData.WhiteBalanceMode.AUTO;
            if (iIntValue2 == 0) {
                whiteBalanceMode = ExifData.WhiteBalanceMode.MANUAL;
            }
            builder.setWhiteBalanceMode(whiteBalanceMode);
        }
    }
}
