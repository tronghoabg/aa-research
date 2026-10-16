package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraGraph;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraGraphConfigModule_ProvideCameraGraphConfigFactory implements c<CameraGraph.Config> {
    private final CameraGraphConfigModule module;

    private CameraGraphConfigModule_ProvideCameraGraphConfigFactory(CameraGraphConfigModule cameraGraphConfigModule) {
        this.module = cameraGraphConfigModule;
    }

    public static CameraGraphConfigModule_ProvideCameraGraphConfigFactory create(CameraGraphConfigModule cameraGraphConfigModule) {
        return new CameraGraphConfigModule_ProvideCameraGraphConfigFactory(cameraGraphConfigModule);
    }

    public static CameraGraph.Config provideCameraGraphConfig(CameraGraphConfigModule cameraGraphConfigModule) {
        CameraGraph.Config configProvideCameraGraphConfig = cameraGraphConfigModule.provideCameraGraphConfig();
        r.g(configProvideCameraGraphConfig);
        return configProvideCameraGraphConfig;
    }

    @Override // g.a.a, f.a.a
    public CameraGraph.Config get() {
        return provideCameraGraphConfig(this.module);
    }
}
