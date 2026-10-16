package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.FrameGraph;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameGraphConfigModule_ProvideCameraGraphConfigFactory implements c<FrameGraph.Config> {
    private final FrameGraphConfigModule module;

    private FrameGraphConfigModule_ProvideCameraGraphConfigFactory(FrameGraphConfigModule frameGraphConfigModule) {
        this.module = frameGraphConfigModule;
    }

    public static FrameGraphConfigModule_ProvideCameraGraphConfigFactory create(FrameGraphConfigModule frameGraphConfigModule) {
        return new FrameGraphConfigModule_ProvideCameraGraphConfigFactory(frameGraphConfigModule);
    }

    public static FrameGraph.Config provideCameraGraphConfig(FrameGraphConfigModule frameGraphConfigModule) {
        FrameGraph.Config configProvideCameraGraphConfig = frameGraphConfigModule.provideCameraGraphConfig();
        r.g(configProvideCameraGraphConfig);
        return configProvideCameraGraphConfig;
    }

    @Override // g.a.a, f.a.a
    public FrameGraph.Config get() {
        return provideCameraGraphConfig(this.module);
    }
}
