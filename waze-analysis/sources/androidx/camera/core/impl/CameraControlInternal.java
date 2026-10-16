package androidx.camera.core.impl;

import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.d.m.a.bm;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraControlInternal extends CameraControl {
    public static final CameraControlInternal DEFAULT_EMPTY_INSTANCE = new CameraControlInternal() { // from class: androidx.camera.core.impl.CameraControlInternal.2
        @Override // androidx.camera.core.CameraControl
        public bm<Void> cancelFocusAndMetering() {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.CameraControl
        public /* synthetic */ bm enableLowLightBoostAsync(boolean z) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Not supported!"));
        }

        @Override // androidx.camera.core.CameraControl
        public bm<Void> enableTorch(boolean z) {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public /* synthetic */ bm getCameraCapturePipelineAsync(int i2, int i3) {
            return CC.$default$getCameraCapturePipelineAsync(this, i2, i3);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public int getFlashMode() {
            return 2;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public Config getInteropConfig() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public SessionConfig getSessionConfig() {
            return SessionConfig.defaultEmptySessionConfig();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public /* synthetic */ boolean isInVideoUsage() {
            return false;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public boolean isZslDisabledByByUserCaseConfig() {
            return false;
        }

        @Override // androidx.camera.core.CameraControl
        public bm<Integer> setExposureCompensationIndex(int i2) {
            return Futures.immediateFuture(0);
        }

        @Override // androidx.camera.core.CameraControl
        public bm<Void> setLinearZoom(float f2) {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.CameraControl
        public /* synthetic */ bm setTorchStrengthLevel(int i2) {
            return Futures.immediateFailedFuture(new UnsupportedOperationException("Setting torch strength is not supported on the device."));
        }

        @Override // androidx.camera.core.CameraControl
        public bm<Void> setZoomRatio(float f2) {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.CameraControl
        public bm<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
            return Futures.immediateFuture(FocusMeteringResult.emptyInstance());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public bm<List<Void>> submitStillCaptureRequests(List<CaptureConfig> list, int i2, int i3) {
            return Futures.immediateFuture(Collections.EMPTY_LIST);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void clearInteropConfig() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void clearZslConfig() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public /* synthetic */ void decrementVideoUsage() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public /* synthetic */ CameraControlInternal getImplementation() {
            return this;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public /* synthetic */ void incrementVideoUsage() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void addInteropConfig(Config config) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void addZslConfig(SessionConfig.Builder builder) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void setFlashMode(int i2) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public /* synthetic */ void setScreenFlash(ImageCapture.ScreenFlash screenFlash) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void setZslDisabledByUserCaseConfig(boolean z) {
        }
    };

    /* compiled from: WazeSource */
    public interface ControlUpdateCallback {
        void onCameraControlCaptureRequests(List<CaptureConfig> list);

        void onCameraControlUpdateSessionConfig();
    }

    void addInteropConfig(Config config);

    void addZslConfig(SessionConfig.Builder builder);

    void clearInteropConfig();

    void clearZslConfig();

    void decrementVideoUsage();

    bm<CameraCapturePipeline> getCameraCapturePipelineAsync(int i2, int i3);

    int getFlashMode();

    CameraControlInternal getImplementation();

    Config getInteropConfig();

    SessionConfig getSessionConfig();

    void incrementVideoUsage();

    boolean isInVideoUsage();

    boolean isZslDisabledByByUserCaseConfig();

    void setFlashMode(int i2);

    void setScreenFlash(ImageCapture.ScreenFlash screenFlash);

    void setZslDisabledByUserCaseConfig(boolean z);

    bm<List<Void>> submitStillCaptureRequests(List<CaptureConfig> list, int i2, int i3);

    /* compiled from: WazeSource */
    public final class CameraControlException extends Exception {
        private CameraCaptureFailure mCameraCaptureFailure;

        public CameraControlException(CameraCaptureFailure cameraCaptureFailure) {
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }

        public CameraCaptureFailure getCameraCaptureFailure() {
            return this.mCameraCaptureFailure;
        }

        public CameraControlException(CameraCaptureFailure cameraCaptureFailure, Throwable th) {
            super(th);
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.impl.CameraControlInternal$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static bm $default$getCameraCapturePipelineAsync(final CameraControlInternal cameraControlInternal, int i2, int i3) {
            return Futures.immediateFuture(new CameraCapturePipeline() { // from class: androidx.camera.core.impl.CameraControlInternal.1
                @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
                public bm<Void> invokePostCapture() {
                    return Futures.immediateFuture(null);
                }

                @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
                public bm<Void> invokePreCapture() {
                    return Futures.immediateFuture(null);
                }
            });
        }

        public static boolean $default$isInVideoUsage(CameraControlInternal cameraControlInternal) {
            return false;
        }

        public static void $default$decrementVideoUsage(CameraControlInternal cameraControlInternal) {
        }

        public static CameraControlInternal $default$getImplementation(CameraControlInternal cameraControlInternal) {
            return cameraControlInternal;
        }

        public static void $default$incrementVideoUsage(CameraControlInternal cameraControlInternal) {
        }

        public static void $default$setScreenFlash(CameraControlInternal cameraControlInternal, ImageCapture.ScreenFlash screenFlash) {
        }
    }
}
