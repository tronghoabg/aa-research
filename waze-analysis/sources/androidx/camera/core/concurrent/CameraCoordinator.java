package androidx.camera.core.concurrent;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.InternalCameraPresenceListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraCoordinator extends InternalCameraPresenceListener {
    public static final int CAMERA_OPERATING_MODE_CONCURRENT = 2;
    public static final int CAMERA_OPERATING_MODE_SINGLE = 1;
    public static final int CAMERA_OPERATING_MODE_UNSPECIFIED = 0;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CameraOperatingMode {
    }

    /* compiled from: WazeSource */
    public interface ConcurrentCameraModeListener {
        void onCameraOperatingModeUpdated(int i2, int i3);
    }

    void addListener(ConcurrentCameraModeListener concurrentCameraModeListener);

    void addPendingCameraInfo(CameraInfo cameraInfo);

    List<CameraInfo> getActiveConcurrentCameraInfos();

    int getCameraOperatingMode();

    List<List<CameraSelector>> getConcurrentCameraSelectors();

    String getPairedConcurrentCameraId(String str);

    void init(CameraRepository cameraRepository);

    void removeListener(ConcurrentCameraModeListener concurrentCameraModeListener);

    void removePendingCameraInfo(CameraInfo cameraInfo);

    void setActiveConcurrentCameraInfos(List<CameraInfo> list);

    void setCameraOperatingMode(int i2);

    void shutdown();

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.concurrent.CameraCoordinator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$addPendingCameraInfo(CameraCoordinator cameraCoordinator, CameraInfo cameraInfo) {
        }

        public static void $default$init(CameraCoordinator cameraCoordinator, CameraRepository cameraRepository) {
        }

        public static void $default$removePendingCameraInfo(CameraCoordinator cameraCoordinator, CameraInfo cameraInfo) {
        }
    }
}
