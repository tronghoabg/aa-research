package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface AutoFlashAEModeDisabler {
    int getCorrectedAeMode(int i2);

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public static final Companion Companion = new Companion(null);

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final AutoFlashAEModeDisabler provideAEModeDisabler(CameraQuirks cameraQuirks) {
                x.f(cameraQuirks, "cameraQuirks");
                return (DeviceQuirks.INSTANCE.get(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) == null && !cameraQuirks.getQuirks().contains(ImageCaptureFailWithAutoFlashQuirk.class)) ? NoOpAutoFlashAEModeDisabler.INSTANCE : AutoFlashAEModeDisablerImpl.INSTANCE;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }
}
