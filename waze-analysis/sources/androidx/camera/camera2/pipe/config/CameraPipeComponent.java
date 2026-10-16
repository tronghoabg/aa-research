package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraBackends;
import androidx.camera.camera2.pipe.CameraContext;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.MemoryEstimator;
import androidx.camera.camera2.pipe.compat.AudioRestrictionController;
import androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers;
import androidx.camera.camera2.pipe.config.CameraGraphComponent;
import androidx.camera.camera2.pipe.config.FrameGraphComponent;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraPipeComponent {
    AudioRestrictionController cameraAudioRestrictionController();

    CameraBackends cameraBackends();

    CameraContext cameraContext();

    CameraGraphComponent.Builder cameraGraphComponentBuilder();

    CameraPipeLifetime cameraPipeLifetime();

    CameraSurfaceManager cameraSurfaceManager();

    CameraDevices cameras();

    ConcurrentSessionSequencers concurrentSessionSequencers();

    FrameGraphComponent.Builder frameGraphComponentBuilder();

    MemoryEstimator memoryEstimator();
}
