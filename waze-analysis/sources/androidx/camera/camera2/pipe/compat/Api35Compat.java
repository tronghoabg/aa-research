package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.util.Size;
import androidx.camera.camera2.pipe.CameraMetadata;
import h.g.b.x;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Api35Compat {
    public static final Api35Compat INSTANCE = new Api35Compat();

    private Api35Compat() {
    }

    public static final CaptureRequest.Builder createCaptureRequest(CameraDevice.CameraDeviceSetup cameraDeviceSetup, int i2) {
        x.f(cameraDeviceSetup, "cameraDeviceSetup");
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDeviceSetup.createCaptureRequest(i2);
        x.e(builderCreateCaptureRequest, "createCaptureRequest(...)");
        return builderCreateCaptureRequest;
    }

    public static final List<CameraCharacteristics.Key<?>> getAvailableSessionCharacteristicsKeys(CameraCharacteristics cameraCharacteristics) {
        x.f(cameraCharacteristics, "cameraCharacteristics");
        return cameraCharacteristics.getAvailableSessionCharacteristicsKeys();
    }

    public static final int getDefaultTorchStrengthLevel(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "cameraMetadata");
        CameraCharacteristics.Key key = CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL;
        x.e(key, "FLASH_TORCH_STRENGTH_DEFAULT_LEVEL");
        Integer num = (Integer) cameraMetadata.get(key);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static final <T> T getExtensionCharacteristic(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i2, CameraCharacteristics.Key<T> key) {
        x.f(cameraExtensionCharacteristics, "extensionCharacteristics");
        x.f(key, "key");
        return (T) cameraExtensionCharacteristics.get(i2, key);
    }

    public static final Set<CameraCharacteristics.Key<?>> getExtensionKeys(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i2) {
        x.f(cameraExtensionCharacteristics, "extensionCharacteristics");
        Set<CameraCharacteristics.Key<?>> keys = cameraExtensionCharacteristics.getKeys(i2);
        x.e(keys, "getKeys(...)");
        return keys;
    }

    public static final int getMaxTorchStrengthLevel(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "cameraMetadata");
        CameraCharacteristics.Key key = CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
        x.e(key, "FLASH_TORCH_STRENGTH_MAX_LEVEL");
        Integer num = (Integer) cameraMetadata.get(key);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static final boolean isTorchStrengthSupported(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "cameraMetadata");
        CameraCharacteristics.Key key = CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
        x.e(key, "FLASH_TORCH_STRENGTH_MAX_LEVEL");
        Integer num = (Integer) cameraMetadata.get(key);
        return num != null && num.intValue() > 1;
    }

    public static final OutputConfiguration newImageReaderOutputConfiguration(int i2, Size size) {
        x.f(size, "surfaceSize");
        return new OutputConfiguration(i2, size);
    }

    public static final SessionConfiguration newSessionConfiguration(int i2, List<OutputConfiguration> list) {
        x.f(list, "outputs");
        return new SessionConfiguration(i2, list);
    }
}
