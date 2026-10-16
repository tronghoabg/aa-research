package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DeviceInfoLogger {
    public static final DeviceInfoLogger INSTANCE = new DeviceInfoLogger();

    private DeviceInfoLogger() {
    }

    private final void logDeviceLevel(CameraProperties cameraProperties) {
        String strConcat;
        CameraMetadata metadata = cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        x.e(key, "INFO_SUPPORTED_HARDWARE_LEVEL");
        Integer num = (Integer) metadata.getOrDefault((CameraCharacteristics.Key<CameraCharacteristics.Key>) key, (CameraCharacteristics.Key) (-1));
        if (num != null && num.intValue() == 2) {
            strConcat = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (num != null && num.intValue() == 4) {
            strConcat = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        } else if (num != null && num.intValue() == 0) {
            strConcat = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (num != null && num.intValue() == 1) {
            strConcat = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (num != null && num.intValue() == 3) {
            strConcat = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else {
            Objects.toString(num);
            strConcat = "Unknown value: ".concat(String.valueOf(num));
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isInfoEnabled(Log.TAG)) {
            android.util.Log.i(Camera2Logger.TRUNCATED_TAG, "Device Level: ".concat(strConcat));
        }
    }

    public final void logDeviceInfo(CameraProperties cameraProperties) {
        x.f(cameraProperties, "cameraProperties");
        logDeviceLevel(cameraProperties);
    }
}
