package androidx.camera.camera2.pipe.internal;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.ParameterUpdateListener;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import h.g.b.x;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ParameterUpdateRequestListener implements Request.Listener {
    private final /* synthetic */ NoOpRequestListener $$delegate_0;
    private final CameraGraphParametersImpl cameraGraphParameters;
    private final ParameterUpdateListener clientListener;
    private final AtomicBoolean completed;
    private final CaptureRequest.Key<?> key;
    private final AtomicBoolean started;

    public ParameterUpdateRequestListener(CaptureRequest.Key<?> key, ParameterUpdateListener parameterUpdateListener, CameraGraphParametersImpl cameraGraphParametersImpl) {
        x.f(key, "key");
        x.f(parameterUpdateListener, "clientListener");
        x.f(cameraGraphParametersImpl, "cameraGraphParameters");
        this.$$delegate_0 = NoOpRequestListener.INSTANCE;
        this.key = key;
        this.clientListener = parameterUpdateListener;
        this.cameraGraphParameters = cameraGraphParametersImpl;
        this.started = new AtomicBoolean(false);
        this.completed = new AtomicBoolean(false);
    }

    public final ParameterUpdateListener getClientListener() {
        return this.clientListener;
    }

    public final CaptureRequest.Key<?> getKey() {
        return this.key;
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onAborted(Request request) {
        x.f(request, "request");
        if (this.started.get() || !this.completed.compareAndSet(false, true)) {
            return;
        }
        this.clientListener.onUpdateSkipped(null);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-DlC0U5Y */
    public void mo187onBufferLostDlC0U5Y(RequestMetadata requestMetadata, long j2, int i2) {
        x.f(requestMetadata, "requestMetadata");
        this.$$delegate_0.mo187onBufferLostDlC0U5Y(requestMetadata, j2, i2);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-iiEMlm4 */
    public void mo188onBufferLostiiEMlm4(RequestMetadata requestMetadata, long j2, int i2, int i3) {
        x.f(requestMetadata, "requestMetadata");
        this.$$delegate_0.mo188onBufferLostiiEMlm4(requestMetadata, j2, i2, i3);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onCaptureProgress(RequestMetadata requestMetadata, int i2) {
        x.f(requestMetadata, "requestMetadata");
        this.$$delegate_0.onCaptureProgress(requestMetadata, i2);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onComplete-CcXjc1I */
    public void mo189onCompleteCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        x.f(requestMetadata, "requestMetadata");
        x.f(frameInfo, "result");
        if (this.completed.compareAndSet(false, true)) {
            this.clientListener.m849onUpdateCompletedCcXjc1I(requestMetadata, j2, frameInfo);
            this.cameraGraphParameters.removeAndPurgePriors$camera_camera2_pipe(this.key, this);
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onFailed-CcXjc1I */
    public void mo190onFailedCcXjc1I(RequestMetadata requestMetadata, long j2, RequestFailure requestFailure) {
        x.f(requestMetadata, "requestMetadata");
        x.f(requestFailure, "requestFailure");
        if (this.started.get() || !this.completed.compareAndSet(false, true)) {
            return;
        }
        this.clientListener.onUpdateSkipped(requestFailure);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onPartialCaptureResult-CcXjc1I */
    public void mo191onPartialCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata) {
        x.f(requestMetadata, "requestMetadata");
        x.f(frameMetadata, "captureResult");
        this.$$delegate_0.mo191onPartialCaptureResultCcXjc1I(requestMetadata, j2, frameMetadata);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onReadoutStarted-mP9r-9w */
    public void mo192onReadoutStartedmP9r9w(RequestMetadata requestMetadata, long j2, long j3) {
        x.f(requestMetadata, "requestMetadata");
        this.$$delegate_0.mo192onReadoutStartedmP9r9w(requestMetadata, j2, j3);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onRequestSequenceAborted(RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
        this.$$delegate_0.onRequestSequenceAborted(requestMetadata);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onRequestSequenceCompleted-RuT0dZU */
    public void mo193onRequestSequenceCompletedRuT0dZU(RequestMetadata requestMetadata, long j2) {
        x.f(requestMetadata, "requestMetadata");
        this.$$delegate_0.mo193onRequestSequenceCompletedRuT0dZU(requestMetadata, j2);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onRequestSequenceCreated(RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
        if (this.started.get()) {
            return;
        }
        this.clientListener.onUpdateRequestCreated(requestMetadata);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onRequestSequenceSubmitted(RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
        if (this.started.get()) {
            return;
        }
        this.clientListener.onUpdateRequestSubmitted(requestMetadata);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onStarted-uGKBvU4 */
    public void mo194onStarteduGKBvU4(RequestMetadata requestMetadata, long j2, long j3) {
        x.f(requestMetadata, "requestMetadata");
        if (this.started.compareAndSet(false, true)) {
            this.clientListener.m850onUpdateStarteduGKBvU4(requestMetadata, j2, j3);
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onTotalCaptureResult-CcXjc1I */
    public void mo195onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        x.f(requestMetadata, "requestMetadata");
        x.f(frameInfo, "totalCaptureResult");
        this.$$delegate_0.mo195onTotalCaptureResultCcXjc1I(requestMetadata, j2, frameInfo);
    }

    public final void trySkip$camera_camera2_pipe() {
        if (this.started.get() || !this.completed.compareAndSet(false, true)) {
            return;
        }
        this.clientListener.onUpdateSkipped(null);
    }
}
