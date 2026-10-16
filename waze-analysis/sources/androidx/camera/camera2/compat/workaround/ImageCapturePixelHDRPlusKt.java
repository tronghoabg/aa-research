package androidx.camera.camera2.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.core.impl.ImageCaptureConfig;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImageCapturePixelHDRPlusKt {
    public static final void toggleHDRPlus(Camera2ImplConfig.Builder builder, ImageCaptureConfig imageCaptureConfig) {
        x.f(builder, "<this>");
        x.f(imageCaptureConfig, "imageCaptureConfig");
        if (((ImageCapturePixelHDRPlusQuirk) DeviceQuirks.INSTANCE.get(ImageCapturePixelHDRPlusQuirk.class)) != null && imageCaptureConfig.hasCaptureMode()) {
            int captureMode = imageCaptureConfig.getCaptureMode();
            if (captureMode == 0) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                x.e(key, "CONTROL_ENABLE_ZSL");
                builder.setCaptureRequestOption(key, true);
            } else {
                if (captureMode != 1) {
                    return;
                }
                CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                x.e(key2, "CONTROL_ENABLE_ZSL");
                builder.setCaptureRequestOption(key2, false);
            }
        }
    }
}
