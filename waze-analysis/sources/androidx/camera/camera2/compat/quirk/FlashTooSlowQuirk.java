package androidx.camera.camera2.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.pipe.CameraMetadata;
import h.a.i;
import h.g.b.x;
import h.n.o;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FlashTooSlowQuirk implements UseTorchAsFlashQuirk {
    public static final Companion Companion = new Companion(null);
    private static final List<String> AFFECTED_MODEL_PREFIXES = i.i("PIXEL 3A", "PIXEL 3A XL", "PIXEL 4", "PIXEL 5", "SM-A320", "MOTO G(20)", "ITEL L6006", "RMX3231");

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final boolean isAffectedModel() {
            for (String str : FlashTooSlowQuirk.AFFECTED_MODEL_PREFIXES) {
                String str2 = Build.MODEL;
                x.e(str2, "MODEL");
                String upperCase = str2.toUpperCase(Locale.ROOT);
                x.e(upperCase, "toUpperCase(...)");
                if (o.ah(upperCase, str)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isEnabled(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "cameraMetadata");
            if (!isAffectedModel()) {
                return false;
            }
            CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
            x.e(key, "LENS_FACING");
            Integer num = (Integer) cameraMetadata.get(key);
            return num != null && num.intValue() == 1;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
