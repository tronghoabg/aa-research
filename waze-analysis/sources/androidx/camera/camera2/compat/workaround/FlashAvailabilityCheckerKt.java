package androidx.camera.camera2.compat.workaround;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import h.g.b.x;
import java.nio.BufferUnderflowException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FlashAvailabilityCheckerKt {
    public static final boolean isFlashAvailable(CameraProperties cameraProperties, boolean z) {
        Boolean bool;
        x.f(cameraProperties, "<this>");
        try {
            CameraMetadata metadata = cameraProperties.getMetadata();
            CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            x.e(key, "FLASH_INFO_AVAILABLE");
            bool = (Boolean) metadata.get(key);
        } catch (BufferUnderflowException e2) {
            if (DeviceQuirks.INSTANCE.get(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    android.util.Log.d(Camera2Logger.TRUNCATED_TAG, a.a(new StringBuilder(), "Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: ", "]."));
                }
            } else {
                Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                BufferUnderflowException bufferUnderflowException = e2;
                if (Logger.isErrorEnabled(Log.TAG)) {
                    android.util.Log.e(Camera2Logger.TRUNCATED_TAG, a.a(new StringBuilder(), "Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: ", "]. Flash is not available."), bufferUnderflowException);
                }
            }
            if (z) {
                throw e2;
            }
            bool = false;
        }
        if (bool == null) {
            Camera2Logger camera2Logger3 = Camera2Logger.INSTANCE;
            if (Logger.isWarnEnabled(Log.TAG)) {
                android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
            }
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
