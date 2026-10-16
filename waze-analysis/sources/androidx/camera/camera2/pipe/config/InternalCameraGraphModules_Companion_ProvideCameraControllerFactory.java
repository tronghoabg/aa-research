package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraContext;
import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.SurfaceTracker;
import androidx.camera.camera2.pipe.graph.GraphProcessorImpl;
import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class InternalCameraGraphModules_Companion_ProvideCameraControllerFactory implements c<CameraController> {
    private final e<CameraBackend> cameraBackendProvider;
    private final e<CameraContext> cameraContextProvider;
    private final e<CameraGraph.Config> graphConfigProvider;
    private final e<CameraGraphId> graphIdProvider;
    private final e<GraphProcessorImpl> graphProcessorProvider;
    private final e<StreamGraph> streamGraphProvider;
    private final e<SurfaceTracker> surfaceTrackerProvider;

    private InternalCameraGraphModules_Companion_ProvideCameraControllerFactory(e<CameraGraphId> eVar, e<CameraGraph.Config> eVar2, e<CameraBackend> eVar3, e<CameraContext> eVar4, e<GraphProcessorImpl> eVar5, e<StreamGraph> eVar6, e<SurfaceTracker> eVar7) {
        this.graphIdProvider = eVar;
        this.graphConfigProvider = eVar2;
        this.cameraBackendProvider = eVar3;
        this.cameraContextProvider = eVar4;
        this.graphProcessorProvider = eVar5;
        this.streamGraphProvider = eVar6;
        this.surfaceTrackerProvider = eVar7;
    }

    public static InternalCameraGraphModules_Companion_ProvideCameraControllerFactory create(e<CameraGraphId> eVar, e<CameraGraph.Config> eVar2, e<CameraBackend> eVar3, e<CameraContext> eVar4, e<GraphProcessorImpl> eVar5, e<StreamGraph> eVar6, e<SurfaceTracker> eVar7) {
        return new InternalCameraGraphModules_Companion_ProvideCameraControllerFactory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7);
    }

    public static CameraController provideCameraController(CameraGraphId cameraGraphId, CameraGraph.Config config, CameraBackend cameraBackend, CameraContext cameraContext, GraphProcessorImpl graphProcessorImpl, StreamGraph streamGraph, SurfaceTracker surfaceTracker) {
        CameraController cameraControllerProvideCameraController = InternalCameraGraphModules.Companion.provideCameraController(cameraGraphId, config, cameraBackend, cameraContext, graphProcessorImpl, streamGraph, surfaceTracker);
        r.g(cameraControllerProvideCameraController);
        return cameraControllerProvideCameraController;
    }

    @Override // g.a.a, f.a.a
    public CameraController get() {
        return provideCameraController(this.graphIdProvider.get(), this.graphConfigProvider.get(), this.cameraBackendProvider.get(), this.cameraContextProvider.get(), this.graphProcessorProvider.get(), this.streamGraphProvider.get(), this.surfaceTrackerProvider.get());
    }
}
