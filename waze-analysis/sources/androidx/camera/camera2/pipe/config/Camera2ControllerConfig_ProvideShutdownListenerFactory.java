package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2ControllerConfig_ProvideShutdownListenerFactory implements c<Camera2CameraController.ShutdownListener> {
    private final Camera2ControllerConfig module;

    private Camera2ControllerConfig_ProvideShutdownListenerFactory(Camera2ControllerConfig camera2ControllerConfig) {
        this.module = camera2ControllerConfig;
    }

    public static Camera2ControllerConfig_ProvideShutdownListenerFactory create(Camera2ControllerConfig camera2ControllerConfig) {
        return new Camera2ControllerConfig_ProvideShutdownListenerFactory(camera2ControllerConfig);
    }

    public static Camera2CameraController.ShutdownListener provideShutdownListener(Camera2ControllerConfig camera2ControllerConfig) {
        Camera2CameraController.ShutdownListener shutdownListenerProvideShutdownListener = camera2ControllerConfig.provideShutdownListener();
        r.g(shutdownListenerProvideShutdownListener);
        return shutdownListenerProvideShutdownListener;
    }

    @Override // g.a.a, f.a.a
    public Camera2CameraController.ShutdownListener get() {
        return provideShutdownListener(this.module);
    }
}
