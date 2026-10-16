package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.impl.utils.SessionProcessorUtil;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.d.m.a.bm;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class AdapterCameraControl extends ForwardingCameraControl {
    private final CameraControlInternal mCameraControl;
    private final SessionProcessor mSessionProcessor;

    public AdapterCameraControl(CameraControlInternal cameraControlInternal, SessionProcessor sessionProcessor) {
        super(cameraControlInternal);
        this.mCameraControl = cameraControlInternal;
        this.mSessionProcessor = sessionProcessor;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public bm<Void> cancelFocusAndMetering() {
        return this.mCameraControl.cancelFocusAndMetering();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public bm<Void> enableTorch(boolean z) {
        return !SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 6) ? Futures.immediateFailedFuture(new IllegalStateException("Torch is not supported")) : this.mCameraControl.enableTorch(z);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    public CameraControlInternal getImplementation() {
        return this.mCameraControl;
    }

    public SessionProcessor getSessionProcessor() {
        return this.mSessionProcessor;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public bm<Integer> setExposureCompensationIndex(int i2) {
        return !SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 7) ? Futures.immediateFailedFuture(new IllegalStateException("ExposureCompensation is not supported")) : this.mCameraControl.setExposureCompensationIndex(i2);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public bm<Void> setLinearZoom(float f2) {
        if (!SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 0)) {
            return Futures.immediateFailedFuture(new IllegalStateException("Zoom is not supported"));
        }
        SessionProcessor sessionProcessor = this.mSessionProcessor;
        if (sessionProcessor == null) {
            return this.mCameraControl.setLinearZoom(f2);
        }
        Range<Float> extensionZoomRange = sessionProcessor.getExtensionZoomRange();
        if (extensionZoomRange == null) {
            return this.mCameraControl.setLinearZoom(f2);
        }
        if (f2 <= 1.0f && f2 >= 0.0f) {
            return this.mCameraControl.setZoomRatio(AdapterCameraInfo.getZoomRatioByPercentage(f2, ((Float) extensionZoomRange.getLower()).floatValue(), ((Float) extensionZoomRange.getUpper()).floatValue()));
        }
        return Futures.immediateFailedFuture(new IllegalArgumentException("Requested linearZoom " + f2 + " is not within valid range [0..1]"));
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public bm<Void> setZoomRatio(float f2) {
        Range<Float> extensionZoomRange;
        if (!SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 0)) {
            return Futures.immediateFailedFuture(new IllegalStateException("Zoom is not supported"));
        }
        SessionProcessor sessionProcessor = this.mSessionProcessor;
        if (sessionProcessor == null || (extensionZoomRange = sessionProcessor.getExtensionZoomRange()) == null || (f2 >= ((Float) extensionZoomRange.getLower()).floatValue() && f2 <= ((Float) extensionZoomRange.getUpper()).floatValue())) {
            return this.mCameraControl.setZoomRatio(f2);
        }
        return Futures.immediateFailedFuture(new IllegalArgumentException("Requested zoomRatio " + f2 + " is not within valid range [" + extensionZoomRange.getLower() + " , " + extensionZoomRange.getUpper() + "]"));
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public bm<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
        FocusMeteringAction modifiedFocusMeteringAction = SessionProcessorUtil.getModifiedFocusMeteringAction(this.mSessionProcessor, focusMeteringAction);
        return modifiedFocusMeteringAction == null ? Futures.immediateFailedFuture(new IllegalStateException("FocusMetering is not supported")) : this.mCameraControl.startFocusAndMetering(modifiedFocusMeteringAction);
    }
}
