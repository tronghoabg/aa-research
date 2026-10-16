package androidx.camera.camera2.config;

import androidx.camera.camera2.pipe.CameraPipe;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraAppConfig_ProvideCameraPipeFactory implements c<CameraPipe> {
    private final CameraAppConfig module;

    private CameraAppConfig_ProvideCameraPipeFactory(CameraAppConfig cameraAppConfig) {
        this.module = cameraAppConfig;
    }

    public static CameraAppConfig_ProvideCameraPipeFactory create(CameraAppConfig cameraAppConfig) {
        return new CameraAppConfig_ProvideCameraPipeFactory(cameraAppConfig);
    }

    public static CameraPipe provideCameraPipe(CameraAppConfig cameraAppConfig) {
        CameraPipe cameraPipeProvideCameraPipe = cameraAppConfig.provideCameraPipe();
        r.g(cameraPipeProvideCameraPipe);
        return cameraPipeProvideCameraPipe;
    }

    @Override // g.a.a, f.a.a
    public CameraPipe get() {
        return provideCameraPipe(this.module);
    }
}
