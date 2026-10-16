package androidx.camera.camera2.pipe.compat;

import android.view.Surface;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CaptureSequence;
import androidx.camera.camera2.pipe.CaptureSequenceProcessor;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class StandardCamera2CaptureSequenceProcessorFactory implements Camera2CaptureSequenceProcessorFactory {
    private final CameraGraph.Config graphConfig;
    private final Camera2Quirks quirks;
    private final StreamGraphImpl streamGraph;
    private final StrictMode strictMode;
    private final Threads threads;

    public StandardCamera2CaptureSequenceProcessorFactory(Threads threads, CameraGraph.Config config, StreamGraphImpl streamGraphImpl, Camera2Quirks camera2Quirks, StrictMode strictMode) {
        x.f(threads, "threads");
        x.f(config, "graphConfig");
        x.f(streamGraphImpl, "streamGraph");
        x.f(camera2Quirks, "quirks");
        x.f(strictMode, "strictMode");
        this.threads = threads;
        this.graphConfig = config;
        this.streamGraph = streamGraphImpl;
        this.quirks = camera2Quirks;
        this.strictMode = strictMode;
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessorFactory
    public CaptureSequenceProcessor<?, CaptureSequence<Object>> create(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, Map<StreamId, ? extends Surface> map, Map<OutputId, ? extends Surface> map2) {
        x.f(cameraCaptureSessionWrapper, "session");
        x.f(map, "streamToSurfaceMap");
        x.f(map2, "outputToSurfaceMap");
        Camera2Quirks camera2Quirks = this.quirks;
        StreamGraphImpl streamGraphImpl = this.streamGraph;
        CameraGraph.Config config = this.graphConfig;
        return new Camera2CaptureSequenceProcessor(cameraCaptureSessionWrapper, this.threads, config.m507getDefaultTemplatefGx8uWA(), map, map2, streamGraphImpl, this.strictMode, camera2Quirks.shouldWaitForRepeatingRequestStartOnDisconnect$camera_camera2_pipe(config), null);
    }
}
