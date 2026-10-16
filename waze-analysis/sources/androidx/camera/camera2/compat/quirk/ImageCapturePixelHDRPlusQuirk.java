package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import h.a.i;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImageCapturePixelHDRPlusQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);
    private static final List<String> BUILD_MODELS = i.i("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            return ImageCapturePixelHDRPlusQuirk.BUILD_MODELS.contains(Build.MODEL) && Device.INSTANCE.isGoogleDevice();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
