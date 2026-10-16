package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraPipe;
import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeConfigModule_ProvideCameraInteropConfigFactory implements c<CameraPipe.CameraInteropConfig> {
    private final e<CameraPipe.Config> cameraPipeConfigProvider;
    private final CameraPipeConfigModule module;

    private CameraPipeConfigModule_ProvideCameraInteropConfigFactory(CameraPipeConfigModule cameraPipeConfigModule, e<CameraPipe.Config> eVar) {
        this.module = cameraPipeConfigModule;
        this.cameraPipeConfigProvider = eVar;
    }

    public static CameraPipeConfigModule_ProvideCameraInteropConfigFactory create(CameraPipeConfigModule cameraPipeConfigModule, e<CameraPipe.Config> eVar) {
        return new CameraPipeConfigModule_ProvideCameraInteropConfigFactory(cameraPipeConfigModule, eVar);
    }

    public static CameraPipe.CameraInteropConfig provideCameraInteropConfig(CameraPipeConfigModule cameraPipeConfigModule, CameraPipe.Config config) {
        CameraPipe.CameraInteropConfig cameraInteropConfigProvideCameraInteropConfig = cameraPipeConfigModule.provideCameraInteropConfig(config);
        r.g(cameraInteropConfigProvideCameraInteropConfig);
        return cameraInteropConfigProvideCameraInteropConfig;
    }

    @Override // g.a.a, f.a.a
    public CameraPipe.CameraInteropConfig get() {
        return provideCameraInteropConfig(this.module, this.cameraPipeConfigProvider.get());
    }
}
