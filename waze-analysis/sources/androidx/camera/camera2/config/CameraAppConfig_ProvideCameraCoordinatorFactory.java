package androidx.camera.camera2.config;

import androidx.camera.core.concurrent.CameraCoordinator;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraAppConfig_ProvideCameraCoordinatorFactory implements c<CameraCoordinator> {
    private final CameraAppConfig module;

    private CameraAppConfig_ProvideCameraCoordinatorFactory(CameraAppConfig cameraAppConfig) {
        this.module = cameraAppConfig;
    }

    public static CameraAppConfig_ProvideCameraCoordinatorFactory create(CameraAppConfig cameraAppConfig) {
        return new CameraAppConfig_ProvideCameraCoordinatorFactory(cameraAppConfig);
    }

    public static CameraCoordinator provideCameraCoordinator(CameraAppConfig cameraAppConfig) {
        CameraCoordinator cameraCoordinatorProvideCameraCoordinator = cameraAppConfig.provideCameraCoordinator();
        r.g(cameraCoordinatorProvideCameraCoordinator);
        return cameraCoordinatorProvideCameraCoordinator;
    }

    @Override // g.a.a, f.a.a
    public CameraCoordinator get() {
        return provideCameraCoordinator(this.module);
    }
}
