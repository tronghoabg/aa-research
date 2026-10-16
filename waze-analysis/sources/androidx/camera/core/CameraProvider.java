package androidx.camera.core;

import h.g.b.x;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraProvider {
    void addCameraPresenceListener(Executor executor, CameraPresenceListener cameraPresenceListener);

    List<CameraInfo> getAvailableCameraInfos();

    List<List<CameraInfo>> getAvailableConcurrentCameraInfos();

    CameraInfo getCameraInfo(CameraSelector cameraSelector);

    CameraInfo getCameraInfo(CameraSelector cameraSelector, SessionConfig sessionConfig);

    boolean hasCamera(CameraSelector cameraSelector);

    boolean isConcurrentCameraModeOn();

    void removeCameraPresenceListener(CameraPresenceListener cameraPresenceListener);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.CameraProvider$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$addCameraPresenceListener(CameraProvider cameraProvider, Executor executor, CameraPresenceListener cameraPresenceListener) {
            x.f(executor, "executor");
            x.f(cameraPresenceListener, "listener");
            throw new UnsupportedOperationException("The camera provider is not implemented properly.");
        }

        public static CameraInfo $default$getCameraInfo(CameraProvider cameraProvider, CameraSelector cameraSelector, SessionConfig sessionConfig) {
            x.f(cameraSelector, "cameraSelector");
            x.f(sessionConfig, "sessionConfig");
            throw new UnsupportedOperationException("The camera provider is not implemented properly.");
        }

        public static void $default$removeCameraPresenceListener(CameraProvider cameraProvider, CameraPresenceListener cameraPresenceListener) {
            x.f(cameraPresenceListener, "listener");
            throw new UnsupportedOperationException("The camera provider is not implemented properly.");
        }

        public static CameraInfo $default$getCameraInfo(CameraProvider cameraProvider, CameraSelector cameraSelector) {
            x.f(cameraSelector, "cameraSelector");
            throw new UnsupportedOperationException("The camera provider is not implemented properly.");
        }
    }
}
