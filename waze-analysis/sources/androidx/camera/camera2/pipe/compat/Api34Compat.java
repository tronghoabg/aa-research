package androidx.camera.camera2.pipe.compat;

import android.graphics.ColorSpace;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.util.Size;
import androidx.camera.camera2.pipe.CameraMetadata;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Api34Compat {
    public static final Api34Compat INSTANCE = new Api34Compat();

    private Api34Compat() {
    }

    public static final List<Size> getPostviewSupportedSizes(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i2, Size size, int i3) {
        x.f(cameraExtensionCharacteristics, "extensionCharacteristics");
        x.f(size, "captureSize");
        List<Size> postviewSupportedSizes = cameraExtensionCharacteristics.getPostviewSupportedSizes(i2, size, i3);
        x.e(postviewSupportedSizes, "getPostviewSupportedSizes(...)");
        return postviewSupportedSizes;
    }

    public static final boolean isCaptureProcessProgressAvailable(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i2) {
        x.f(cameraExtensionCharacteristics, "extensionCharacteristics");
        return cameraExtensionCharacteristics.isCaptureProcessProgressAvailable(i2);
    }

    public static final boolean isPostviewAvailable(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i2) {
        x.f(cameraExtensionCharacteristics, "extensionCharacteristics");
        return cameraExtensionCharacteristics.isPostviewAvailable(i2);
    }

    public static final boolean isZoomOverrideSupported(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "cameraMetadata");
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
        x.e(key, "CONTROL_AVAILABLE_SETTINGS_OVERRIDES");
        int[] iArr = (int[]) cameraMetadata.get(key);
        return iArr != null && h.a.c.ah(iArr, 1);
    }

    public static final void setColorSpace(SessionConfiguration sessionConfiguration, ColorSpace.Named named) {
        x.f(sessionConfiguration, "sessionConfiguration");
        x.f(named, "colorSpace");
        sessionConfiguration.setColorSpace(named);
    }

    public static final void setPostviewOutputConfiguration(ExtensionSessionConfiguration extensionSessionConfiguration, OutputConfiguration outputConfiguration) {
        x.f(extensionSessionConfiguration, "extensionSessionConfiguration");
        x.f(outputConfiguration, "postviewOutputConfiguration");
        extensionSessionConfiguration.setPostviewOutputConfiguration(outputConfiguration);
    }
}
