package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraPipe;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeConfigModule_ProvideCameraPipeConfigFactory implements c<CameraPipe.Config> {
    private final CameraPipeConfigModule module;

    private CameraPipeConfigModule_ProvideCameraPipeConfigFactory(CameraPipeConfigModule cameraPipeConfigModule) {
        this.module = cameraPipeConfigModule;
    }

    public static CameraPipeConfigModule_ProvideCameraPipeConfigFactory create(CameraPipeConfigModule cameraPipeConfigModule) {
        return new CameraPipeConfigModule_ProvideCameraPipeConfigFactory(cameraPipeConfigModule);
    }

    public static CameraPipe.Config provideCameraPipeConfig(CameraPipeConfigModule cameraPipeConfigModule) {
        CameraPipe.Config configProvideCameraPipeConfig = cameraPipeConfigModule.provideCameraPipeConfig();
        r.g(configProvideCameraPipeConfig);
        return configProvideCameraPipeConfig;
    }

    @Override // g.a.a, f.a.a
    public CameraPipe.Config get() {
        return provideCameraPipeConfig(this.module);
    }
}
