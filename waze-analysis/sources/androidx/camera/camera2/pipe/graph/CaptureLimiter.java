package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.graph.GraphLoop;
import h.e.b;
import h.g.b.x;
import kotlinx.a.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CaptureLimiter implements Request.Listener, GraphLoop.Listener {
    private GraphLoop _graphLoop;
    private final c frameCount;
    private final long requestsUntilActive;

    public CaptureLimiter(long j2) {
        this.requestsUntilActive = j2;
        if (j2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.frameCount = b.g(0L);
    }

    public final GraphLoop getGraphLoop() {
        GraphLoop graphLoop = this._graphLoop;
        x.c(graphLoop);
        return graphLoop;
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
    public void mo189onCompleteCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        c cVar;
        long jD;
        long j3;
        x.f(requestMetadata, "requestMetadata");
        x.f(frameInfo, "result");
        do {
            cVar = this.frameCount;
            jD = cVar.d();
            j3 = jD != -1 ? 1 + jD : -1L;
        } while (!cVar.g(jD, j3));
        if (j3 == this.requestsUntilActive) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Capture processing is now enabled for " + this._graphLoop + " after " + j3 + " frames.");
            }
            getGraphLoop().setCaptureProcessingEnabled(true);
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onFailed-CcXjc1I */
    public /* synthetic */ void mo190onFailedCcXjc1I(RequestMetadata requestMetadata, long j2, RequestFailure requestFailure) {
        Request.Listener.CC.m855$default$onFailedCcXjc1I(this, requestMetadata, j2, requestFailure);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public void onGraphShutdown() {
        this.frameCount.f(-1L);
        getGraphLoop().setCaptureProcessingEnabled(false);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public void onGraphStopped() {
        c cVar;
        long jD;
        do {
            cVar = this.frameCount;
            jD = cVar.d();
        } while (!cVar.g(jD, jD != -1 ? 0L : -1L));
        getGraphLoop().setCaptureProcessingEnabled(false);
        if (Log.INSTANCE.getWARN_LOGGABLE()) {
            android.util.Log.w(Log.TAG, "Capture processing has been disabled for " + getGraphLoop() + " until " + this.requestsUntilActive + " frames have been completed.");
        }
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
    public /* synthetic */ void mo195onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        Request.Listener.CC.m860$default$onTotalCaptureResultCcXjc1I(this, requestMetadata, j2, frameInfo);
    }

    public final void setGraphLoop(GraphLoop graphLoop) {
        x.f(graphLoop, "value");
        if (this._graphLoop != null) {
            throw new IllegalStateException("GraphLoop has already been set!");
        }
        this._graphLoop = graphLoop;
        graphLoop.setCaptureProcessingEnabled(false);
        if (Log.INSTANCE.getWARN_LOGGABLE()) {
            android.util.Log.w(Log.TAG, "Capture processing has been disabled for " + graphLoop + " until " + this.requestsUntilActive + " frames have been completed.");
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public void onStopRepeating() {
    }
}
