package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraGraph;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2ControllerConfig_ProvideCameraGraphConfigFactory implements c<CameraGraph.Config> {
    private final Camera2ControllerConfig module;

    private Camera2ControllerConfig_ProvideCameraGraphConfigFactory(Camera2ControllerConfig camera2ControllerConfig) {
        this.module = camera2ControllerConfig;
    }

    public static Camera2ControllerConfig_ProvideCameraGraphConfigFactory create(Camera2ControllerConfig camera2ControllerConfig) {
        return new Camera2ControllerConfig_ProvideCameraGraphConfigFactory(camera2ControllerConfig);
    }

    public static CameraGraph.Config provideCameraGraphConfig(Camera2ControllerConfig camera2ControllerConfig) {
        CameraGraph.Config configProvideCameraGraphConfig = camera2ControllerConfig.provideCameraGraphConfig();
        r.g(configProvideCameraGraphConfig);
        return configProvideCameraGraphConfig;
    }

    @Override // g.a.a, f.a.a
    public CameraGraph.Config get() {
        return provideCameraGraphConfig(this.module);
    }
}
