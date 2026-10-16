package androidx.camera.core;

import android.util.Range;
import androidx.camera.core.internal.compat.MediaActionSoundCompat;
import androidx.core.util.Consumer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraInfo {
    public static final String IMPLEMENTATION_TYPE_CAMERA2 = "androidx.camera.camera2";
    public static final String IMPLEMENTATION_TYPE_CAMERA2_LEGACY = "androidx.camera.camera2.legacy";
    public static final String IMPLEMENTATION_TYPE_FAKE = "androidx.camera.fake";
    public static final String IMPLEMENTATION_TYPE_UNKNOWN = "<unknown>";
    public static final float INTRINSIC_ZOOM_RATIO_UNKNOWN = 1.0f;
    public static final int TORCH_STRENGTH_LEVEL_UNSUPPORTED = 0;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ImplementationType {
    }

    void addCameraStateListener(Executor executor, Consumer<CameraState> consumer);

    CameraIdentifier getCameraIdentifier();

    CameraSelector getCameraSelector();

    LiveData<CameraState> getCameraState();

    ExposureState getExposureState();

    String getImplementationType();

    float getIntrinsicZoomRatio();

    int getLensFacing();

    LiveData<Integer> getLowLightBoostState();

    int getMaxTorchStrengthLevel();

    LiveData<Integer> getNightModeIndicator();

    Set<CameraInfo> getPhysicalCameraInfos();

    int getSensorRotationDegrees();

    int getSensorRotationDegrees(int i2);

    Set<Range<Integer>> getSupportedFrameRateRanges();

    Set<Range<Integer>> getSupportedFrameRateRanges(SessionConfig sessionConfig);

    LiveData<Integer> getTorchState();

    LiveData<Integer> getTorchStrengthLevel();

    LiveData<ZoomState> getZoomState();

    boolean hasFlashUnit();

    boolean isFocusMeteringSupported(FocusMeteringAction focusMeteringAction);

    boolean isLogicalMultiCameraSupported();

    boolean isLowLightBoostSupported();

    boolean isNightModeIndicatorSupported();

    boolean isPrivateReprocessingSupported();

    boolean isSessionConfigSupported(SessionConfig sessionConfig);

    boolean isTorchStrengthSupported();

    boolean isZslSupported();

    Set<DynamicRange> querySupportedDynamicRanges(Set<DynamicRange> set);

    void removeCameraStateListener(Consumer<CameraState> consumer);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.CameraInfo$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static CameraIdentifier $default$getCameraIdentifier(CameraInfo cameraInfo) {
            return null;
        }

        public static float $default$getIntrinsicZoomRatio(CameraInfo cameraInfo) {
            return 1.0f;
        }

        public static int $default$getLensFacing(CameraInfo cameraInfo) {
            return -1;
        }

        public static LiveData $default$getLowLightBoostState(CameraInfo cameraInfo) {
            return new MutableLiveData(-1);
        }

        public static int $default$getMaxTorchStrengthLevel(CameraInfo cameraInfo) {
            return 0;
        }

        public static LiveData $default$getNightModeIndicator(CameraInfo cameraInfo) {
            return new MutableLiveData(0);
        }

        public static LiveData $default$getTorchStrengthLevel(CameraInfo cameraInfo) {
            return new MutableLiveData(0);
        }

        public static boolean $default$isFocusMeteringSupported(CameraInfo cameraInfo, FocusMeteringAction focusMeteringAction) {
            return false;
        }

        public static boolean $default$isLogicalMultiCameraSupported(CameraInfo cameraInfo) {
            return false;
        }

        public static boolean $default$isLowLightBoostSupported(CameraInfo cameraInfo) {
            return false;
        }

        public static boolean $default$isNightModeIndicatorSupported(CameraInfo cameraInfo) {
            return false;
        }

        public static boolean $default$isPrivateReprocessingSupported(CameraInfo cameraInfo) {
            return false;
        }

        public static boolean $default$isSessionConfigSupported(CameraInfo cameraInfo, SessionConfig sessionConfig) {
            return false;
        }

        public static boolean $default$isTorchStrengthSupported(CameraInfo cameraInfo) {
            return false;
        }

        public static boolean $default$isZslSupported(CameraInfo cameraInfo) {
            return false;
        }

        public static boolean mustPlayShutterSound() {
            return MediaActionSoundCompat.mustPlayShutterSound();
        }

        public static void $default$removeCameraStateListener(CameraInfo cameraInfo, Consumer consumer) {
        }

        public static void $default$addCameraStateListener(CameraInfo cameraInfo, Executor executor, Consumer consumer) {
        }
    }
}
