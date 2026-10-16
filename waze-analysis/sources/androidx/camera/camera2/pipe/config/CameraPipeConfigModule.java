package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraPipe;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeConfigModule {
    private final CameraPipe.Config config;

    public CameraPipeConfigModule(CameraPipe.Config config) {
        x.f(config, "config");
        this.config = config;
    }

    public final CameraPipe.CameraInteropConfig provideCameraInteropConfig(CameraPipe.Config config) {
        x.f(config, "cameraPipeConfig");
        return config.getCameraInteropConfig();
    }

    public final CameraPipe.Config provideCameraPipeConfig() {
        return this.config;
    }

    public final CameraPipe.Flags provideCameraPipeFlags() {
        return this.config.getFlags();
    }
}
