package androidx.camera.camera2.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.impl.CameraMetadataIntegrationKt;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.impl.Quirk;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TorchFlashRequiredFor3aUpdateQuirk implements Quirk {
    private final CameraMetadata cameraMetadata;
    public static final Companion Companion = new Companion(null);
    private static final List<String> AFFECTED_PIXEL_MODELS = i.l("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    public TorchFlashRequiredFor3aUpdateQuirk(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "cameraMetadata");
        this.cameraMetadata = cameraMetadata;
    }

    public final boolean isFlashModeTorchRequired() {
        return !CameraMetadataIntegrationKt.isExternalFlashAeModeSupported(this.cameraMetadata);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final boolean isAffectedModel(CameraMetadata cameraMetadata) {
            return isAffectedPixelModel() && isFrontCamera(cameraMetadata);
        }

        private final boolean isAffectedPixelModel() {
            for (String str : TorchFlashRequiredFor3aUpdateQuirk.AFFECTED_PIXEL_MODELS) {
                String str2 = Build.MODEL;
                x.e(str2, "MODEL");
                String upperCase = str2.toUpperCase(Locale.ROOT);
                x.e(upperCase, "toUpperCase(...)");
                if (x.n(upperCase, str)) {
                    return true;
                }
            }
            return false;
        }

        private final boolean isFrontCamera(CameraMetadata cameraMetadata) {
            CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
            x.e(key, "LENS_FACING");
            Integer num = (Integer) cameraMetadata.get(key);
            return num != null && num.intValue() == 0;
        }

        public final boolean isEnabled(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "cameraMetadata");
            return isAffectedModel(cameraMetadata);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
