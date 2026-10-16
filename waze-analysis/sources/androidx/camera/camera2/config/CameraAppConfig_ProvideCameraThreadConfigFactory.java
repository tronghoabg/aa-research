package androidx.camera.camera2.config;

import androidx.camera.core.impl.CameraThreadConfig;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraAppConfig_ProvideCameraThreadConfigFactory implements c<CameraThreadConfig> {
    private final CameraAppConfig module;

    private CameraAppConfig_ProvideCameraThreadConfigFactory(CameraAppConfig cameraAppConfig) {
        this.module = cameraAppConfig;
    }

    public static CameraAppConfig_ProvideCameraThreadConfigFactory create(CameraAppConfig cameraAppConfig) {
        return new CameraAppConfig_ProvideCameraThreadConfigFactory(cameraAppConfig);
    }

    public static CameraThreadConfig provideCameraThreadConfig(CameraAppConfig cameraAppConfig) {
        CameraThreadConfig cameraThreadConfigProvideCameraThreadConfig = cameraAppConfig.provideCameraThreadConfig();
        r.g(cameraThreadConfigProvideCameraThreadConfig);
        return cameraThreadConfigProvideCameraThreadConfig;
    }

    @Override // g.a.a, f.a.a
    public CameraThreadConfig get() {
        return provideCameraThreadConfig(this.module);
    }
}
