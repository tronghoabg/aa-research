package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.graph.Controller3A;
import androidx.camera.camera2.pipe.graph.GraphProcessor;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import androidx.camera.camera2.pipe.internal.GraphSessionLock;

/* compiled from: WazeSource */
@CameraGraphScope
/* loaded from: classes2.dex */
public interface CameraGraphComponent {

    /* compiled from: WazeSource */
    public interface Builder {
        CameraGraphComponent build();

        Builder cameraGraphConfigModule(CameraGraphConfigModule cameraGraphConfigModule);
    }

    CameraGraph cameraGraph();

    Controller3A controller3A();

    FrameCaptureQueue frameCaptureQueue();

    FrameDistributor frameDistributor();

    GraphProcessor graphProcessor();

    GraphSessionLock sessionLock();
}
