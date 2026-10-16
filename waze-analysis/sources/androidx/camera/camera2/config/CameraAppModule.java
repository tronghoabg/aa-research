package androidx.camera.camera2.config;

import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraPipe;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class CameraAppModule {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CameraDevices provideCameraDevices(CameraPipe cameraPipe) {
            x.f(cameraPipe, "cameraPipe");
            return cameraPipe.cameras();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
