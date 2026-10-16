package androidx.camera.camera2.config;

import c.b.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraConfig_ProvideCameraConfigFactory implements c<CameraConfig> {
    private final CameraConfig module;

    private CameraConfig_ProvideCameraConfigFactory(CameraConfig cameraConfig) {
        this.module = cameraConfig;
    }

    public static CameraConfig_ProvideCameraConfigFactory create(CameraConfig cameraConfig) {
        return new CameraConfig_ProvideCameraConfigFactory(cameraConfig);
    }

    public static CameraConfig provideCameraConfig(CameraConfig cameraConfig) {
        cameraConfig.provideCameraConfig();
        return cameraConfig;
    }

    @Override // g.a.a, f.a.a
    public CameraConfig get() {
        return provideCameraConfig(this.module);
    }
}
