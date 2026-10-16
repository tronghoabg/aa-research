package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.config.CameraGraphScope;
import androidx.camera.camera2.pipe.graph.GraphLoop;
import h.g.b.x;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: WazeSource */
@CameraGraphScope
/* loaded from: classes2.dex */
public final class Listener3A implements Request.Listener, GraphLoop.Listener {
    private final CopyOnWriteArrayList<Result3AStateListener> listeners = new CopyOnWriteArrayList<>();

    public final void addListener(Result3AStateListener result3AStateListener) {
        x.f(result3AStateListener, "listener");
        this.listeners.add(result3AStateListener);
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

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public void onGraphShutdown() {
        Iterator<Result3AStateListener> it = this.listeners.iterator();
        x.e(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().onStopRepeating();
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public void onGraphStopped() {
        Iterator<Result3AStateListener> it = this.listeners.iterator();
        x.e(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().onStopRepeating();
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onPartialCaptureResult-CcXjc1I */
    public void mo191onPartialCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata) {
        x.f(requestMetadata, "requestMetadata");
        x.f(frameMetadata, "captureResult");
        Iterator<Result3AStateListener> it = this.listeners.iterator();
        x.e(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().mo1171onPartialCaptureResultCcXjc1I(requestMetadata, j2, frameMetadata);
        }
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
    public void onRequestSequenceCreated(RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
        Iterator<Result3AStateListener> it = this.listeners.iterator();
        x.e(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().mo1172onRequestSequenceCreatedDThHKJ0(requestMetadata.mo198getRequestNumbermy6kx4g());
        }
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

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public void onStopRepeating() {
        Iterator<Result3AStateListener> it = this.listeners.iterator();
        x.e(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().onStopRepeating();
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onTotalCaptureResult-CcXjc1I */
    public void mo195onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        x.f(requestMetadata, "requestMetadata");
        x.f(frameInfo, "totalCaptureResult");
        Iterator<Result3AStateListener> it = this.listeners.iterator();
        x.e(it, "iterator(...)");
        while (it.hasNext()) {
            Result3AStateListener next = it.next();
            if (next.mo1173onTotalCaptureResultCcXjc1I(requestMetadata, j2, frameInfo)) {
                this.listeners.remove(next);
            }
        }
    }

    public final void removeListener(Result3AStateListener result3AStateListener) {
        x.f(result3AStateListener, "listener");
        this.listeners.remove(result3AStateListener);
    }
}
