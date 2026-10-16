package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.FrameGraph;
import androidx.camera.camera2.pipe.graph.Controller3A;
import androidx.camera.camera2.pipe.graph.GraphProcessor;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import androidx.camera.camera2.pipe.internal.GraphSessionLock;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameGraphConfigModule {
    private final CameraGraphComponent cameraGraphComponent;
    private final FrameGraph.Config config;

    public FrameGraphConfigModule(CameraGraphComponent cameraGraphComponent, FrameGraph.Config config) {
        x.f(cameraGraphComponent, "cameraGraphComponent");
        x.f(config, "config");
        this.cameraGraphComponent = cameraGraphComponent;
        this.config = config;
    }

    public final CameraGraph provideCameraGraph() {
        return this.cameraGraphComponent.cameraGraph();
    }

    public final FrameGraph.Config provideCameraGraphConfig() {
        return this.config;
    }

    public final Controller3A provideController3A() {
        return this.cameraGraphComponent.controller3A();
    }

    public final FrameCaptureQueue provideFrameCaptureQueue() {
        return this.cameraGraphComponent.frameCaptureQueue();
    }

    public final FrameDistributor provideFrameDistributor() {
        return this.cameraGraphComponent.frameDistributor();
    }

    public final GraphProcessor provideGraphProcessor() {
        return this.cameraGraphComponent.graphProcessor();
    }

    public final GraphSessionLock provideSessionLock() {
        return this.cameraGraphComponent.sessionLock();
    }
}
