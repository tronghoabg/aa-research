package androidx.camera.camera2.adapter;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraState;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ExposureState;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.core.util.Consumer;
import androidx.lifecycle.LiveData;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.f;
import h.g;
import h.g.b.x;
import h.l.c;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PhysicalCameraInfoAdapter implements CameraInfo, UnsafeWrapper {
    private final f camera2CameraInfo$delegate;
    private final CameraProperties cameraProperties;

    public PhysicalCameraInfoAdapter(CameraProperties cameraProperties) {
        x.f(cameraProperties, "cameraProperties");
        this.cameraProperties = cameraProperties;
        this.camera2CameraInfo$delegate = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.adapter.PhysicalCameraInfoAdapter$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Camera2CameraInfo.Companion.create(this.f$0.cameraProperties);
            }
        });
    }

    private final int getCameraSelectorLensFacing(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("The specified lens facing integer " + i2 + " can not be recognized.");
    }

    public final Camera2CameraInfo getCamera2CameraInfo$camera_camera2() {
        return (Camera2CameraInfo) this.camera2CameraInfo$delegate.getValue();
    }

    @Override // androidx.camera.core.CameraInfo
    public CameraIdentifier getCameraIdentifier() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public CameraSelector getCameraSelector() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<CameraState> getCameraState() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public ExposureState getExposureState() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public String getImplementationType() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public float getIntrinsicZoomRatio() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public int getLensFacing() {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        x.e(key, "LENS_FACING");
        Object obj = metadata.get((CameraCharacteristics.Key<Object>) key);
        x.c(obj);
        return getCameraSelectorLensFacing(((Number) obj).intValue());
    }

    @Override // androidx.camera.core.CameraInfo
    public /* synthetic */ LiveData getLowLightBoostState() {
        return CameraInfo.CC.$default$getLowLightBoostState(this);
    }

    @Override // androidx.camera.core.CameraInfo
    public /* synthetic */ int getMaxTorchStrengthLevel() {
        return 0;
    }

    @Override // androidx.camera.core.CameraInfo
    public /* synthetic */ LiveData getNightModeIndicator() {
        return CameraInfo.CC.$default$getNightModeIndicator(this);
    }

    @Override // androidx.camera.core.CameraInfo
    public Set<CameraInfo> getPhysicalCameraInfos() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int i2) {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        x.e(key, "SENSOR_ORIENTATION");
        Object obj = metadata.get((CameraCharacteristics.Key<Object>) key);
        x.c(obj);
        return CameraOrientationUtil.getRelativeImageRotation(CameraOrientationUtil.surfaceRotationToDegrees(i2), ((Number) obj).intValue(), getLensFacing() == 1);
    }

    @Override // androidx.camera.core.CameraInfo
    public Set<Range<Integer>> getSupportedFrameRateRanges() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<Integer> getTorchState() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public /* synthetic */ LiveData getTorchStrengthLevel() {
        return CameraInfo.CC.$default$getTorchStrengthLevel(this);
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<ZoomState> getZoomState() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(FocusMeteringAction focusMeteringAction) {
        x.f(focusMeteringAction, "action");
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isLogicalMultiCameraSupported() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public /* synthetic */ boolean isLowLightBoostSupported() {
        return false;
    }

    @Override // androidx.camera.core.CameraInfo
    public /* synthetic */ boolean isNightModeIndicatorSupported() {
        return false;
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isPrivateReprocessingSupported() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public /* synthetic */ boolean isSessionConfigSupported(SessionConfig sessionConfig) {
        return false;
    }

    @Override // androidx.camera.core.CameraInfo
    public /* synthetic */ boolean isTorchStrengthSupported() {
        return false;
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isZslSupported() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public Set<DynamicRange> querySupportedDynamicRanges(Set<DynamicRange> set) {
        x.f(set, "candidateDynamicRanges");
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (x.n(cls, Camera2CameraInfo.class)) {
            Object camera2CameraInfo$camera_camera2 = getCamera2CameraInfo$camera_camera2();
            x.d(camera2CameraInfo$camera_camera2, "null cannot be cast to non-null type T of androidx.camera.camera2.adapter.PhysicalCameraInfoAdapter.unwrapAs");
            return (T) camera2CameraInfo$camera_camera2;
        }
        if (x.n(cls, CameraProperties.class)) {
            CameraProperties cameraProperties = this.cameraProperties;
            x.d(cameraProperties, "null cannot be cast to non-null type T of androidx.camera.camera2.adapter.PhysicalCameraInfoAdapter.unwrapAs");
            return (T) cameraProperties;
        }
        boolean zN = x.n(cls, android.hardware.camera2.CameraMetadata.class);
        CameraProperties cameraProperties2 = this.cameraProperties;
        if (!zN) {
            return (T) cameraProperties2.getMetadata().unwrapAs(cls);
        }
        CameraMetadata metadata = cameraProperties2.getMetadata();
        x.d(metadata, "null cannot be cast to non-null type T of androidx.camera.camera2.adapter.PhysicalCameraInfoAdapter.unwrapAs");
        return (T) metadata;
    }

    @Override // androidx.camera.core.CameraInfo
    public /* synthetic */ Set getSupportedFrameRateRanges(SessionConfig sessionConfig) {
        return Collections.EMPTY_SET;
    }

    public static /* synthetic */ void getCamera2CameraInfo$camera_camera2$annotations() {
    }

    @Override // androidx.camera.core.CameraInfo
    public /* synthetic */ void removeCameraStateListener(Consumer consumer) {
    }

    @Override // androidx.camera.core.CameraInfo
    public /* synthetic */ void addCameraStateListener(Executor executor, Consumer consumer) {
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }
}
