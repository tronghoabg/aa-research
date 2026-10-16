package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraBackendFactory;
import androidx.camera.camera2.pipe.CameraBackendId;
import androidx.camera.camera2.pipe.CameraBackends;
import androidx.camera.camera2.pipe.CameraContext;
import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.SurfaceTracker;
import androidx.camera.camera2.pipe.graph.GraphProcessorImpl;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class InternalCameraGraphModules {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        @CameraGraphScope
        public final CameraBackend provideCameraBackend(CameraBackends cameraBackends, CameraGraph.Config config, CameraContext cameraContext) {
            x.f(cameraBackends, "cameraBackends");
            x.f(config, "graphConfig");
            x.f(cameraContext, "cameraContext");
            CameraBackendFactory customCameraBackend = config.getCustomCameraBackend();
            if (customCameraBackend != null) {
                return customCameraBackend.create(cameraContext);
            }
            String strM506getCameraBackendIdAKmI2lo = config.m506getCameraBackendIdAKmI2lo();
            if (strM506getCameraBackendIdAKmI2lo == null) {
                return cameraBackends.getDefault();
            }
            CameraBackend cameraBackendMo389getSG3A4s8 = cameraBackends.mo389getSG3A4s8(strM506getCameraBackendIdAKmI2lo);
            if (cameraBackendMo389getSG3A4s8 != null) {
                return cameraBackendMo389getSG3A4s8;
            }
            throw new IllegalStateException("Failed to initialize " + CameraBackendId.m387toStringimpl(strM506getCameraBackendIdAKmI2lo) + " from " + config);
        }

        @CameraGraphScope
        public final CameraController provideCameraController(CameraGraphId cameraGraphId, CameraGraph.Config config, CameraBackend cameraBackend, CameraContext cameraContext, GraphProcessorImpl graphProcessorImpl, StreamGraph streamGraph, SurfaceTracker surfaceTracker) {
            x.f(cameraGraphId, "graphId");
            x.f(config, "graphConfig");
            x.f(cameraBackend, "cameraBackend");
            x.f(cameraContext, "cameraContext");
            x.f(graphProcessorImpl, "graphProcessor");
            x.f(streamGraph, "streamGraph");
            x.f(surfaceTracker, "surfaceTracker");
            return cameraBackend.createCameraController(cameraContext, cameraGraphId, config, graphProcessorImpl, streamGraph, surfaceTracker);
        }

        @CameraGraphScope
        public final CameraMetadata provideCameraMetadata(CameraGraph.Config config, CameraBackend cameraBackend) {
            x.f(config, "graphConfig");
            x.f(cameraBackend, "cameraBackend");
            CameraMetadata cameraMetadataMo358awaitCameraMetadataEfqyGwQ = cameraBackend.mo358awaitCameraMetadataEfqyGwQ(config.m505getCameraDz_R5H8());
            if (cameraMetadataMo358awaitCameraMetadataEfqyGwQ != null) {
                return cameraMetadataMo358awaitCameraMetadataEfqyGwQ;
            }
            throw new IllegalStateException("Failed to load metadata for " + CameraId.m552toStringimpl(config.m505getCameraDz_R5H8()) + "!");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
