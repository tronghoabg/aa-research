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
public final class CameraNoResponseWhenEnablingFlashQuirk implements UseTorchAsFlashQuirk {
    public static final Companion Companion = new Companion(null);
    private static final List<String> AFFECTED_MODELS = i.i("SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN", "VIVO 1610");

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final List<String> getAFFECTED_MODELS() {
            return CameraNoResponseWhenEnablingFlashQuirk.AFFECTED_MODELS;
        }

        public final boolean isEnabled(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "cameraMetadata");
            List<String> affected_models = getAFFECTED_MODELS();
            String str = Build.MODEL;
            x.e(str, "MODEL");
            String upperCase = str.toUpperCase(Locale.ROOT);
            x.e(upperCase, "toUpperCase(...)");
            if (!affected_models.contains(upperCase)) {
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
