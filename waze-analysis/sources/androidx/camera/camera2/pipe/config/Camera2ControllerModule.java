package androidx.camera.camera2.pipe.config;

import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor;
import androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessorFactory;
import androidx.camera.camera2.pipe.compat.StandardCamera2CaptureSequenceProcessorFactory;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraStatusMonitor;
import g.a.a;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class Camera2ControllerModule {
    public static final Companion Companion = new Companion(null);

    public abstract Camera2CaptureSequenceProcessorFactory bindCamera2RequestProcessorFactory(StandardCamera2CaptureSequenceProcessorFactory standardCamera2CaptureSequenceProcessorFactory);

    public abstract CameraController bindCameraController(Camera2CameraController camera2CameraController);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        @Camera2ControllerScope
        public final CameraStatusMonitor provideCameraStatusMonitor(a<CameraManager> aVar, Threads threads, CameraGraph.Config config, @CameraPipeJob br brVar) {
            x.f(aVar, "cameraManager");
            x.f(threads, "threads");
            x.f(config, "graphConfig");
            x.f(brVar, "cameraPipeJob");
            return new Camera2CameraStatusMonitor(aVar, threads, config.m505getCameraDz_R5H8(), brVar, null);
        }

        @Camera2ControllerScope
        public final af provideCoroutineScope(Threads threads, @CameraPipeJob br brVar) {
            x.f(threads, "threads");
            x.f(brVar, "cameraPipeJob");
            return aj.e(aj.P(brVar).plus(threads.getLightweightDispatcher().plus(new ae("CXCP-Camera2Controller"))));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
