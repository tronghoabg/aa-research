package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.SurfaceTracker;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2ControllerConfig_ProvideSurfaceGraphFactory implements c<SurfaceTracker> {
    private final Camera2ControllerConfig module;

    private Camera2ControllerConfig_ProvideSurfaceGraphFactory(Camera2ControllerConfig camera2ControllerConfig) {
        this.module = camera2ControllerConfig;
    }

    public static Camera2ControllerConfig_ProvideSurfaceGraphFactory create(Camera2ControllerConfig camera2ControllerConfig) {
        return new Camera2ControllerConfig_ProvideSurfaceGraphFactory(camera2ControllerConfig);
    }

    public static SurfaceTracker provideSurfaceGraph(Camera2ControllerConfig camera2ControllerConfig) {
        SurfaceTracker surfaceTrackerProvideSurfaceGraph = camera2ControllerConfig.provideSurfaceGraph();
        r.g(surfaceTrackerProvideSurfaceGraph);
        return surfaceTrackerProvideSurfaceGraph;
    }

    @Override // g.a.a, f.a.a
    public SurfaceTracker get() {
        return provideSurfaceGraph(this.module);
    }
}
