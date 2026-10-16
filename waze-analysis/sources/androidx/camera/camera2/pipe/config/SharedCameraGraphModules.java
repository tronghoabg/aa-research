package androidx.camera.camera2.pipe.config;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.Parameters;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestListeners;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.SurfaceTracker;
import androidx.camera.camera2.pipe.core.SystemClockOffsets;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.graph.GraphListener;
import androidx.camera.camera2.pipe.graph.GraphProcessor;
import androidx.camera.camera2.pipe.graph.GraphProcessorImpl;
import androidx.camera.camera2.pipe.graph.Listener3A;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.graph.SurfaceGraph;
import androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl;
import androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import androidx.camera.camera2.pipe.media.ImageReaderImageSources;
import androidx.camera.camera2.pipe.media.ImageSources;
import g.a.a;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class SharedCameraGraphModules {
    public static final Companion Companion = new Companion(null);

    public abstract CameraGraph bindCameraGraph(CameraGraphImpl cameraGraphImpl);

    @CameraGraphContext
    public abstract Context bindCameraGraphContext(@CameraPipeContext Context context);

    public abstract RequestListeners bindCameraGraphListeners(CameraGraphRequestListenersImpl cameraGraphRequestListenersImpl);

    public abstract Parameters bindCameraGraphParameters(CameraGraphParametersImpl cameraGraphParametersImpl);

    public abstract GraphListener bindGraphListener(GraphProcessorImpl graphProcessorImpl);

    public abstract GraphProcessor bindGraphProcessor(GraphProcessorImpl graphProcessorImpl);

    public abstract StreamGraph bindStreamGraph(StreamGraphImpl streamGraphImpl);

    @CameraGraphScope
    public abstract SurfaceTracker bindSurfaceTracker(SurfaceGraph surfaceGraph);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        @CameraGraphScope
        public final ImageSources configureImageSources(ImageReaderImageSources imageReaderImageSources, CameraPipe.Config config) {
            x.f(imageReaderImageSources, "imageReaderImageSources");
            x.f(config, "cameraPipeConfig");
            return config.getImageSources() != null ? config.getImageSources() : imageReaderImageSources;
        }

        @CameraGraphScope
        @ForCameraGraph
        public final af provideCameraGraphCoroutineScope(Threads threads, @CameraPipeJob br brVar) {
            x.f(threads, "threads");
            x.f(brVar, "cameraPipeJob");
            return aj.e(aj.P(brVar).plus(threads.getLightweightDispatcher().plus(new ae("CXCP-Graph"))));
        }

        @CameraGraphScope
        public final FrameDistributor provideFrameDistributor(StreamGraphImpl streamGraphImpl, FrameCaptureQueue frameCaptureQueue, CameraMetadata cameraMetadata, SystemClockOffsets systemClockOffsets) {
            x.f(streamGraphImpl, "streamGraphImpl");
            x.f(frameCaptureQueue, "frameCaptureQueue");
            x.f(cameraMetadata, "cameraMetadata");
            x.f(systemClockOffsets, "systemClockOffsets");
            CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
            x.e(key, "SENSOR_INFO_TIMESTAMP_SOURCE");
            Integer num = (Integer) cameraMetadata.get(key);
            return new FrameDistributor(streamGraphImpl, frameCaptureQueue, num != null && num.intValue() == 1, systemClockOffsets.getRealtimeNsToMonotonicNs());
        }

        @CameraGraphScope
        @ForCameraGraph
        public final List<Request.Listener> provideRequestListeners(CameraGraph.Config config, Listener3A listener3A, FrameDistributor frameDistributor) {
            x.f(config, "graphConfig");
            x.f(listener3A, "listener3A");
            x.f(frameDistributor, "frameDistributor");
            List<Request.Listener> listL = i.l(listener3A);
            listL.add(listener3A);
            listL.add(frameDistributor);
            listL.addAll(config.getDefaultListeners());
            return listL;
        }

        @CameraGraphScope
        public final SurfaceGraph provideSurfaceGraph(StreamGraphImpl streamGraphImpl, a<CameraController> aVar, CameraSurfaceManager cameraSurfaceManager) {
            x.f(streamGraphImpl, "streamGraphImpl");
            x.f(aVar, "cameraController");
            x.f(cameraSurfaceManager, "cameraSurfaceManager");
            return new SurfaceGraph(streamGraphImpl, aVar, cameraSurfaceManager, streamGraphImpl.getImageSourceMap$camera_camera2_pipe());
        }

        @CameraGraphScope
        public final SystemClockOffsets provideSystemClockOffsets() {
            return SystemClockOffsets.Companion.estimate();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
