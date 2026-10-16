package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import h.g.a.l;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ResultListener implements Request.Listener {
    private final l<FrameInfo, Boolean> checker;
    private final CompletableDeferred<FrameInfo> completeSignal;
    private final long timeLimitNs;
    private volatile Long timestampOfFirstUpdateNs;

    /* JADX WARN: Multi-variable type inference failed */
    public ResultListener(long j2, l<? super FrameInfo, Boolean> lVar) {
        x.f(lVar, "checker");
        this.timeLimitNs = j2;
        this.checker = lVar;
        this.completeSignal = bo.j();
    }

    public final am<FrameInfo> getResult() {
        return this.completeSignal;
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onAborted(Request request) {
        x.f(request, "request");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-DlC0U5Y */
    public /* synthetic */ void mo187onBufferLostDlC0U5Y(RequestMetadata requestMetadata, long j2, int i2) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-iiEMlm4 */
    public /* synthetic */ void mo188onBufferLostiiEMlm4(RequestMetadata requestMetadata, long j2, int i2, int i3) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onCaptureProgress(RequestMetadata requestMetadata, int i2) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onComplete-CcXjc1I */
    public /* synthetic */ void mo189onCompleteCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        Request.Listener.CC.m854$default$onCompleteCcXjc1I(this, requestMetadata, j2, frameInfo);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onFailed-CcXjc1I */
    public /* synthetic */ void mo190onFailedCcXjc1I(RequestMetadata requestMetadata, long j2, RequestFailure requestFailure) {
        Request.Listener.CC.m855$default$onFailedCcXjc1I(this, requestMetadata, j2, requestFailure);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onPartialCaptureResult-CcXjc1I */
    public /* synthetic */ void mo191onPartialCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata) {
        Request.Listener.CC.m856$default$onPartialCaptureResultCcXjc1I(this, requestMetadata, j2, frameMetadata);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onReadoutStarted-mP9r-9w */
    public /* synthetic */ void mo192onReadoutStartedmP9r9w(RequestMetadata requestMetadata, long j2, long j3) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onRequestSequenceAborted(RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onRequestSequenceCompleted-RuT0dZU */
    public /* synthetic */ void mo193onRequestSequenceCompletedRuT0dZU(RequestMetadata requestMetadata, long j2) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onRequestSequenceCreated(RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onRequestSequenceSubmitted(RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onStarted-uGKBvU4 */
    public /* synthetic */ void mo194onStarteduGKBvU4(RequestMetadata requestMetadata, long j2, long j3) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onTotalCaptureResult-CcXjc1I */
    public void mo195onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        x.f(requestMetadata, "requestMetadata");
        x.f(frameInfo, "totalCaptureResult");
        if (this.completeSignal.ca() || this.completeSignal.u()) {
            return;
        }
        FrameMetadata metadata = frameInfo.getMetadata();
        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
        x.e(key, "SENSOR_TIMESTAMP");
        Long l2 = (Long) metadata.get(key);
        if (l2 != null && this.timestampOfFirstUpdateNs == null) {
            this.timestampOfFirstUpdateNs = l2;
        }
        Long l3 = this.timestampOfFirstUpdateNs;
        if (this.timeLimitNs == 0 || l3 == null || l2 == null || l2.longValue() - l3.longValue() <= this.timeLimitNs) {
            if (this.checker.invoke(frameInfo).booleanValue()) {
                this.completeSignal.a(frameInfo);
                return;
            }
            return;
        }
        this.completeSignal.a(null);
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Wait for capture result timeout, current: " + l2 + " first: " + l3);
        }
    }
}
