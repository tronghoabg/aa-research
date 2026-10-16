package androidx.camera.camera2.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import e.c.d.a;
import h.g.b.x;
import java.util.Locale;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class JpegCaptureDownsizingQuirk implements SoftwareJpegEncodingPreferredQuirk {
    public static final JpegCaptureDownsizingQuirk INSTANCE = new JpegCaptureDownsizingQuirk();
    private static final Set<String> KNOWN_AFFECTED_FRONT_CAMERA_DEVICES = a.o("redmi note 8 pro");

    private JpegCaptureDownsizingQuirk() {
    }

    public final boolean isEnabled(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "cameraMetadata");
        Set<String> set = KNOWN_AFFECTED_FRONT_CAMERA_DEVICES;
        String str = Build.MODEL;
        x.e(str, "MODEL");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        x.e(lowerCase, "toLowerCase(...)");
        if (!set.contains(lowerCase)) {
            return false;
        }
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        x.e(key, "LENS_FACING");
        Integer num = (Integer) cameraMetadata.get(key);
        return num != null && num.intValue() == 0;
    }
}
