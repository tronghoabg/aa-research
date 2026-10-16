package androidx.camera.camera2.compat.quirk;

import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.impl.Quirk;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AspectRatioLegacyApi21Quirk implements Quirk {
    public static final Companion Companion = new Companion(null);

    public final int getCorrectedAspectRatio() {
        return 2;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "cameraMetadata");
            CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata);
            return false;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
