package androidx.camera.camera2.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.pipe.CameraMetadata;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TemporalNoiseQuirk implements CaptureIntentPreviewQuirk {
    public static final Companion Companion = new Companion(null);

    @Override // androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk
    public /* synthetic */ boolean workaroundByCaptureIntentPreview() {
        return true;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final boolean isPixel8() {
            return o.m("Pixel 8", Build.MODEL, true);
        }

        public final boolean isEnabled(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "cameraMetadata");
            if (!isPixel8()) {
                return false;
            }
            CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
            x.e(key, "LENS_FACING");
            Integer num = (Integer) cameraMetadata.get(key);
            return num != null && num.intValue() == 0;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
