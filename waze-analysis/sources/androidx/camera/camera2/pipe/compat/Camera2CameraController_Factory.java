package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.SurfaceTracker;
import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import androidx.camera.camera2.pipe.graph.GraphListener;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.internal.CameraStatusMonitor;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CameraController_Factory implements c.b.c<Camera2CameraController> {
    private final c.b.e<Camera2DeviceManager> camera2DeviceManagerProvider;
    private final c.b.e<Camera2Quirks> camera2QuirksProvider;
    private final c.b.e<Camera2SystemState> camera2SystemStateProvider;
    private final c.b.e<CameraGraphId> cameraGraphIdProvider;
    private final c.b.e<CameraStatusMonitor> cameraStatusMonitorProvider;
    private final c.b.e<CameraSurfaceManager> cameraSurfaceManagerProvider;
    private final c.b.e<Camera2CaptureSequenceProcessorFactory> captureSequenceProcessorFactoryProvider;
    private final c.b.e<CaptureSessionFactory> captureSessionFactoryProvider;
    private final c.b.e<ConcurrentSessionSequencers> concurrentSessionSequencersProvider;
    private final c.b.e<CameraGraph.Config> graphConfigProvider;
    private final c.b.e<GraphListener> graphListenerProvider;
    private final c.b.e<af> scopeProvider;
    private final c.b.e<Camera2CameraController.ShutdownListener> shutdownListenerProvider;
    private final c.b.e<StreamGraphImpl> streamGraphProvider;
    private final c.b.e<StrictMode> strictModeProvider;
    private final c.b.e<SurfaceTracker> surfaceTrackerProvider;
    private final c.b.e<Threads> threadsProvider;
    private final c.b.e<TimeSource> timeSourceProvider;

    private Camera2CameraController_Factory(c.b.e<CameraGraphId> eVar, c.b.e<CameraGraph.Config> eVar2, c.b.e<af> eVar3, c.b.e<Threads> eVar4, c.b.e<StrictMode> eVar5, c.b.e<TimeSource> eVar6, c.b.e<Camera2Quirks> eVar7, c.b.e<Camera2DeviceManager> eVar8, c.b.e<Camera2SystemState> eVar9, c.b.e<CameraStatusMonitor> eVar10, c.b.e<ConcurrentSessionSequencers> eVar11, c.b.e<StreamGraphImpl> eVar12, c.b.e<CameraSurfaceManager> eVar13, c.b.e<SurfaceTracker> eVar14, c.b.e<CaptureSessionFactory> eVar15, c.b.e<Camera2CaptureSequenceProcessorFactory> eVar16, c.b.e<GraphListener> eVar17, c.b.e<Camera2CameraController.ShutdownListener> eVar18) {
        this.cameraGraphIdProvider = eVar;
        this.graphConfigProvider = eVar2;
        this.scopeProvider = eVar3;
        this.threadsProvider = eVar4;
        this.strictModeProvider = eVar5;
        this.timeSourceProvider = eVar6;
        this.camera2QuirksProvider = eVar7;
        this.camera2DeviceManagerProvider = eVar8;
        this.camera2SystemStateProvider = eVar9;
        this.cameraStatusMonitorProvider = eVar10;
        this.concurrentSessionSequencersProvider = eVar11;
        this.streamGraphProvider = eVar12;
        this.cameraSurfaceManagerProvider = eVar13;
        this.surfaceTrackerProvider = eVar14;
        this.captureSessionFactoryProvider = eVar15;
        this.captureSequenceProcessorFactoryProvider = eVar16;
        this.graphListenerProvider = eVar17;
        this.shutdownListenerProvider = eVar18;
    }

    public static Camera2CameraController_Factory create(c.b.e<CameraGraphId> eVar, c.b.e<CameraGraph.Config> eVar2, c.b.e<af> eVar3, c.b.e<Threads> eVar4, c.b.e<StrictMode> eVar5, c.b.e<TimeSource> eVar6, c.b.e<Camera2Quirks> eVar7, c.b.e<Camera2DeviceManager> eVar8, c.b.e<Camera2SystemState> eVar9, c.b.e<CameraStatusMonitor> eVar10, c.b.e<ConcurrentSessionSequencers> eVar11, c.b.e<StreamGraphImpl> eVar12, c.b.e<CameraSurfaceManager> eVar13, c.b.e<SurfaceTracker> eVar14, c.b.e<CaptureSessionFactory> eVar15, c.b.e<Camera2CaptureSequenceProcessorFactory> eVar16, c.b.e<GraphListener> eVar17, c.b.e<Camera2CameraController.ShutdownListener> eVar18) {
        return new Camera2CameraController_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18);
    }

    public static Camera2CameraController newInstance(CameraGraphId cameraGraphId, CameraGraph.Config config, af afVar, Threads threads, StrictMode strictMode, TimeSource timeSource, Camera2Quirks camera2Quirks, Camera2DeviceManager camera2DeviceManager, Camera2SystemState camera2SystemState, CameraStatusMonitor cameraStatusMonitor, ConcurrentSessionSequencers concurrentSessionSequencers, StreamGraphImpl streamGraphImpl, CameraSurfaceManager cameraSurfaceManager, SurfaceTracker surfaceTracker, CaptureSessionFactory captureSessionFactory, Camera2CaptureSequenceProcessorFactory camera2CaptureSequenceProcessorFactory, GraphListener graphListener, Camera2CameraController.ShutdownListener shutdownListener) {
        return new Camera2CameraController(cameraGraphId, config, afVar, threads, strictMode, timeSource, camera2Quirks, camera2DeviceManager, camera2SystemState, cameraStatusMonitor, concurrentSessionSequencers, streamGraphImpl, cameraSurfaceManager, surfaceTracker, captureSessionFactory, camera2CaptureSequenceProcessorFactory, graphListener, shutdownListener);
    }

    @Override // g.a.a, f.a.a
    public Camera2CameraController get() {
        return newInstance(this.cameraGraphIdProvider.get(), this.graphConfigProvider.get(), this.scopeProvider.get(), this.threadsProvider.get(), this.strictModeProvider.get(), this.timeSourceProvider.get(), this.camera2QuirksProvider.get(), this.camera2DeviceManagerProvider.get(), this.camera2SystemStateProvider.get(), this.cameraStatusMonitorProvider.get(), this.concurrentSessionSequencersProvider.get(), this.streamGraphProvider.get(), this.cameraSurfaceManagerProvider.get(), this.surfaceTrackerProvider.get(), this.captureSessionFactoryProvider.get(), this.captureSequenceProcessorFactoryProvider.get(), this.graphListenerProvider.get(), this.shutdownListenerProvider.get());
    }
}
