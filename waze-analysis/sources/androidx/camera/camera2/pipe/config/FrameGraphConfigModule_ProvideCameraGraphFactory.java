package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraGraph;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameGraphConfigModule_ProvideCameraGraphFactory implements c<CameraGraph> {
    private final FrameGraphConfigModule module;

    private FrameGraphConfigModule_ProvideCameraGraphFactory(FrameGraphConfigModule frameGraphConfigModule) {
        this.module = frameGraphConfigModule;
    }

    public static FrameGraphConfigModule_ProvideCameraGraphFactory create(FrameGraphConfigModule frameGraphConfigModule) {
        return new FrameGraphConfigModule_ProvideCameraGraphFactory(frameGraphConfigModule);
    }

    public static CameraGraph provideCameraGraph(FrameGraphConfigModule frameGraphConfigModule) {
        CameraGraph cameraGraphProvideCameraGraph = frameGraphConfigModule.provideCameraGraph();
        r.g(cameraGraphProvideCameraGraph);
        return cameraGraphProvideCameraGraph;
    }

    @Override // g.a.a, f.a.a
    public CameraGraph get() {
        return provideCameraGraph(this.module);
    }
}
