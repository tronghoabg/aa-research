package androidx.camera.camera2.config;

import androidx.camera.core.CameraXConfig;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraAppConfig_ProvideCameraXConfigFactory implements c<CameraXConfig> {
    private final CameraAppConfig module;

    private CameraAppConfig_ProvideCameraXConfigFactory(CameraAppConfig cameraAppConfig) {
        this.module = cameraAppConfig;
    }

    public static CameraAppConfig_ProvideCameraXConfigFactory create(CameraAppConfig cameraAppConfig) {
        return new CameraAppConfig_ProvideCameraXConfigFactory(cameraAppConfig);
    }

    public static CameraXConfig provideCameraXConfig(CameraAppConfig cameraAppConfig) {
        CameraXConfig cameraXConfigProvideCameraXConfig = cameraAppConfig.provideCameraXConfig();
        r.g(cameraXConfigProvideCameraXConfig);
        return cameraXConfigProvideCameraXConfig;
    }

    @Override // g.a.a, f.a.a
    public CameraXConfig get() {
        return provideCameraXConfig(this.module);
    }
}
