package androidx.camera.camera2.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.pipe.CameraMetadata;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImageCaptureWashedOutImageQuirk implements UseTorchAsFlashQuirk {
    public static final Companion Companion = new Companion(null);
    private static final List<String> BUILD_MODELS = i.i("SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P");

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final List<String> getBUILD_MODELS() {
            return ImageCaptureWashedOutImageQuirk.BUILD_MODELS;
        }

        public final boolean isEnabled(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "cameraMetadata");
            List<String> build_models = getBUILD_MODELS();
            String str = Build.MODEL;
            x.e(str, "MODEL");
            String upperCase = str.toUpperCase(Locale.ROOT);
            x.e(upperCase, "toUpperCase(...)");
            if (!build_models.contains(upperCase)) {
                return false;
            }
            CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
            x.e(key, "LENS_FACING");
            Integer num = (Integer) cameraMetadata.get(key);
            return num != null && num.intValue() == 1;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
