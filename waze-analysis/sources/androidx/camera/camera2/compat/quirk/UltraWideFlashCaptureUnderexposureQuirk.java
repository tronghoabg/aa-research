package androidx.camera.camera2.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.pipe.CameraMetadata;
import h.a.i;
import h.g.b.x;
import h.n.o;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UltraWideFlashCaptureUnderexposureQuirk implements UseTorchAsFlashQuirk {
    public static final Companion Companion = new Companion(null);
    private static final List<String> BUILD_MODEL_PREFIXES = i.d("sm-s921");

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final List<String> getBUILD_MODEL_PREFIXES() {
            return UltraWideFlashCaptureUnderexposureQuirk.BUILD_MODEL_PREFIXES;
        }

        public final boolean isEnabled(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "cameraMetadata");
            List<String> build_model_prefixes = getBUILD_MODEL_PREFIXES();
            if ((build_model_prefixes instanceof Collection) && build_model_prefixes.isEmpty()) {
                return false;
            }
            for (String str : build_model_prefixes) {
                String str2 = Build.MODEL;
                x.e(str2, "MODEL");
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                x.e(lowerCase, "toLowerCase(...)");
                if (o.ah(lowerCase, str)) {
                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                    x.e(key, "LENS_FACING");
                    Integer num = (Integer) cameraMetadata.get(key);
                    return num != null && num.intValue() == 1;
                }
            }
            return false;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
