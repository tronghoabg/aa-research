package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraGraphId;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2ControllerConfig_ProvideCameraGraphIdFactory implements c<CameraGraphId> {
    private final Camera2ControllerConfig module;

    private Camera2ControllerConfig_ProvideCameraGraphIdFactory(Camera2ControllerConfig camera2ControllerConfig) {
        this.module = camera2ControllerConfig;
    }

    public static Camera2ControllerConfig_ProvideCameraGraphIdFactory create(Camera2ControllerConfig camera2ControllerConfig) {
        return new Camera2ControllerConfig_ProvideCameraGraphIdFactory(camera2ControllerConfig);
    }

    public static CameraGraphId provideCameraGraphId(Camera2ControllerConfig camera2ControllerConfig) {
        CameraGraphId cameraGraphIdProvideCameraGraphId = camera2ControllerConfig.provideCameraGraphId();
        r.g(cameraGraphIdProvideCameraGraphId);
        return cameraGraphIdProvideCameraGraphId;
    }

    @Override // g.a.a, f.a.a
    public CameraGraphId get() {
        return provideCameraGraphId(this.module);
    }
}
