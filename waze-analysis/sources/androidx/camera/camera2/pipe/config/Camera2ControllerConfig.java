package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.SurfaceTracker;
import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import androidx.camera.camera2.pipe.graph.GraphListener;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2ControllerConfig {
    private final CameraBackend cameraBackend;
    private final CameraGraph.Config graphConfig;
    private final CameraGraphId graphId;
    private final GraphListener graphListener;
    private final Camera2CameraController.ShutdownListener shutdownListener;
    private final StreamGraph streamGraph;
    private final SurfaceTracker surfaceTracker;

    public Camera2ControllerConfig(CameraBackend cameraBackend, CameraGraphId cameraGraphId, CameraGraph.Config config, GraphListener graphListener, StreamGraph streamGraph, SurfaceTracker surfaceTracker, Camera2CameraController.ShutdownListener shutdownListener) {
        x.f(cameraBackend, "cameraBackend");
        x.f(cameraGraphId, "graphId");
        x.f(config, "graphConfig");
        x.f(graphListener, "graphListener");
        x.f(streamGraph, "streamGraph");
        x.f(surfaceTracker, "surfaceTracker");
        x.f(shutdownListener, "shutdownListener");
        this.cameraBackend = cameraBackend;
        this.graphId = cameraGraphId;
        this.graphConfig = config;
        this.graphListener = graphListener;
        this.streamGraph = streamGraph;
        this.surfaceTracker = surfaceTracker;
        this.shutdownListener = shutdownListener;
    }

    public final CameraBackend provideCameraBackend() {
        return this.cameraBackend;
    }

    public final CameraGraph.Config provideCameraGraphConfig() {
        return this.graphConfig;
    }

    public final CameraGraphId provideCameraGraphId() {
        return this.graphId;
    }

    public final GraphListener provideGraphListener() {
        return this.graphListener;
    }

    public final Camera2CameraController.ShutdownListener provideShutdownListener() {
        return this.shutdownListener;
    }

    public final StreamGraphImpl provideStreamGraph() {
        StreamGraph streamGraph = this.streamGraph;
        x.d(streamGraph, "null cannot be cast to non-null type androidx.camera.camera2.pipe.graph.StreamGraphImpl");
        return (StreamGraphImpl) streamGraph;
    }

    public final SurfaceTracker provideSurfaceGraph() {
        return this.surfaceTracker;
    }
}
