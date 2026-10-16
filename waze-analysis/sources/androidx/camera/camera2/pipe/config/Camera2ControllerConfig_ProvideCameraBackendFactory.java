package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraBackend;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2ControllerConfig_ProvideCameraBackendFactory implements c<CameraBackend> {
    private final Camera2ControllerConfig module;

    private Camera2ControllerConfig_ProvideCameraBackendFactory(Camera2ControllerConfig camera2ControllerConfig) {
        this.module = camera2ControllerConfig;
    }

    public static Camera2ControllerConfig_ProvideCameraBackendFactory create(Camera2ControllerConfig camera2ControllerConfig) {
        return new Camera2ControllerConfig_ProvideCameraBackendFactory(camera2ControllerConfig);
    }

    public static CameraBackend provideCameraBackend(Camera2ControllerConfig camera2ControllerConfig) {
        CameraBackend cameraBackendProvideCameraBackend = camera2ControllerConfig.provideCameraBackend();
        r.g(cameraBackendProvideCameraBackend);
        return cameraBackendProvideCameraBackend;
    }

    @Override // g.a.a, f.a.a
    public CameraBackend get() {
        return provideCameraBackend(this.module);
    }
}
