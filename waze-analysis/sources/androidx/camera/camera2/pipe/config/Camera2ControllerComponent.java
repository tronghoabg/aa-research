package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraController;

/* compiled from: WazeSource */
@Camera2ControllerScope
/* loaded from: classes2.dex */
public interface Camera2ControllerComponent {

    /* compiled from: WazeSource */
    public interface Builder {
        Camera2ControllerComponent build();

        Builder camera2ControllerConfig(Camera2ControllerConfig camera2ControllerConfig);
    }

    CameraController cameraController();
}
