package androidx.camera.camera2.config;

import androidx.camera.camera2.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import androidx.camera.camera2.config.CameraComponent;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraPipe;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraAppComponent {

    /* compiled from: WazeSource */
    public interface Builder {
        CameraAppComponent build();

        Builder config(CameraAppConfig cameraAppConfig);
    }

    CameraComponent.Builder cameraBuilder();

    CameraDevices getCameraDevices();

    CameraPipe getCameraPipe();

    ExtraSupportedSurfaceCombinationsContainer getExtraSupportedSurfaceCombinationsContainer();
}
