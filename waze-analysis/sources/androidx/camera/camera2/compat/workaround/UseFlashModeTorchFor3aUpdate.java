package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface UseFlashModeTorchFor3aUpdate {
    boolean shouldUseFlashModeTorch();

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public static final Companion Companion = new Companion(null);

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final UseFlashModeTorchFor3aUpdate provideUseFlashModeTorchFor3aUpdate(CameraQuirks cameraQuirks) {
                x.f(cameraQuirks, "cameraQuirks");
                return cameraQuirks.getQuirks().contains(TorchFlashRequiredFor3aUpdateQuirk.class) ? UseFlashModeTorchFor3aUpdateImpl.INSTANCE : NotUseFlashModeTorchFor3aUpdate.INSTANCE;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }
}
