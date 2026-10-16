package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0;
import android.view.Surface;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.camera2.adapter.CaptureResultAdapter;
import androidx.camera.camera2.compat.Api24Compat;
import androidx.camera.camera2.compat.Api34Compat;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.TagBundle;
import h.a.r;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class CameraCallbackMap implements Request.Listener {
    public static final Companion Companion = new Companion(null);
    private final Map<CameraCaptureCallback, Executor> callbackMap = new LinkedHashMap();
    private final f rejectOperationCameraCaptureSession$delegate = g.a(new a() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda4
        @Override // h.g.a.a
        public final Object invoke() {
            return CameraCallbackMap.rejectOperationCameraCaptureSession_delegate$lambda$0();
        }
    });
    private volatile Map<CameraCaptureCallback, ? extends Executor> callbacks = r.j();

    private final CameraCaptureSession getCameraCaptureSession(RequestMetadata requestMetadata) {
        RequestMetadata requestMetadata2 = requestMetadata;
        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata2.unwrapAs(CameraCaptureSession.class);
        if (cameraCaptureSession != null) {
            return cameraCaptureSession;
        }
        if (Build.VERSION.SDK_INT < 31 || bi$$ExternalSyntheticApiModelOutline0.m121m(requestMetadata2.unwrapAs(bi$$ExternalSyntheticApiModelOutline0.m134m())) == null) {
            return null;
        }
        return getRejectOperationCameraCaptureSession();
    }

    private final int getCaptureConfigId(RequestMetadata requestMetadata) {
        TagBundle tagBundle = (TagBundle) requestMetadata.get(TagsKt.getCAMERAX_TAG_BUNDLE());
        Object tag = tagBundle != null ? tagBundle.getTag(CaptureConfig.CAPTURE_CONFIG_ID_TAG_KEY) : null;
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    private final CameraCaptureSession getRejectOperationCameraCaptureSession() {
        return (CameraCaptureSession) this.rejectOperationCameraCaptureSession$delegate.getValue();
    }

    static final RejectOperationCameraCaptureSession rejectOperationCameraCaptureSession_delegate$lambda$0() {
        return new RejectOperationCameraCaptureSession();
    }

    public final void addCaptureCallback(CameraCaptureCallback cameraCaptureCallback, Executor executor) {
        x.f(cameraCaptureCallback, "callback");
        x.f(executor, "executor");
        if (this.callbacks.containsKey(cameraCaptureCallback)) {
            Objects.toString(cameraCaptureCallback);
            throw new IllegalStateException(String.valueOf(cameraCaptureCallback).concat(" was already registered!"));
        }
        synchronized (this.callbackMap) {
            this.callbackMap.put(cameraCaptureCallback, executor);
            this.callbacks = r.r(this.callbackMap);
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onAborted(Request request) {
        x.f(request, "request");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            final CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            Object obj = request.getExtras().get(TagsKt.getCAMERAX_TAG_BUNDLE());
            TagBundle tagBundle = obj instanceof TagBundle ? (TagBundle) obj : null;
            Object tag = tagBundle != null ? tagBundle.getTag(CaptureConfig.CAPTURE_CONFIG_ID_TAG_KEY) : null;
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            final int iIntValue = num != null ? num.intValue() : -1;
            value.execute(new Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    key.onCaptureCancelled(iIntValue);
                }
            });
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-DlC0U5Y */
    public /* synthetic */ void mo187onBufferLostDlC0U5Y(RequestMetadata requestMetadata, long j2, int i2) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-iiEMlm4 */
    public void mo188onBufferLostiiEMlm4(RequestMetadata requestMetadata, final long j2, int i2, int i3) {
        x.f(requestMetadata, "requestMetadata");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            final CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                RequestMetadata requestMetadata2 = requestMetadata;
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata2.unwrapAs(CameraCaptureSession.class);
                final CaptureRequest captureRequest = (CaptureRequest) requestMetadata2.unwrapAs(CaptureRequest.class);
                final Surface surface = requestMetadata.getStreams().get(StreamId.m974boximpl(i2));
                if (cameraCaptureSession != null && captureRequest != null && surface != null) {
                    value.execute(new Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda8
                        @Override // java.lang.Runnable
                        public final void run() {
                            Api24Compat.onCaptureBufferLost(((CameraUseCaseAdapter.CaptureCallbackContainer) key).getCaptureCallback(), cameraCaptureSession, captureRequest, surface, j2);
                        }
                    });
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onCaptureProgress(final RequestMetadata requestMetadata, final int i2) {
        x.f(requestMetadata, "requestMetadata");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            final CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                RequestMetadata requestMetadata2 = requestMetadata;
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata2.unwrapAs(CameraCaptureSession.class);
                final CaptureRequest captureRequest = (CaptureRequest) requestMetadata2.unwrapAs(CaptureRequest.class);
                final CaptureResult captureResult = (CaptureResult) requestMetadata2.unwrapAs(CaptureResult.class);
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    value.execute(new Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((CameraUseCaseAdapter.CaptureCallbackContainer) key).getCaptureCallback().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                        }
                    });
                }
            } else {
                value.execute(new Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        key.onCaptureProcessProgressed(this.getCaptureConfigId(requestMetadata), i2);
                    }
                });
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onComplete-CcXjc1I */
    public void mo189onCompleteCcXjc1I(final RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        x.f(requestMetadata, "requestMetadata");
        x.f(frameInfo, "result");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            final CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                final CameraCaptureSession cameraCaptureSession = getCameraCaptureSession(requestMetadata);
                final CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(CaptureRequest.class);
                final TotalCaptureResult totalCaptureResult = (TotalCaptureResult) frameInfo.unwrapAs(TotalCaptureResult.class);
                if (cameraCaptureSession != null && captureRequest != null && totalCaptureResult != null) {
                    value.execute(new Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda12
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((CameraUseCaseAdapter.CaptureCallbackContainer) key).getCaptureCallback().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                        }
                    });
                }
            } else {
                final CaptureResultAdapter captureResultAdapter = new CaptureResultAdapter(requestMetadata, j2, frameInfo, null);
                value.execute(new Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda13
                    @Override // java.lang.Runnable
                    public final void run() {
                        key.onCaptureCompleted(this.getCaptureConfigId(requestMetadata), captureResultAdapter);
                    }
                });
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onFailed-CcXjc1I */
    public void mo190onFailedCcXjc1I(final RequestMetadata requestMetadata, long j2, RequestFailure requestFailure) {
        x.f(requestMetadata, "requestMetadata");
        x.f(requestFailure, "requestFailure");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            final CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                final CameraCaptureSession cameraCaptureSession = getCameraCaptureSession(requestMetadata);
                final CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(CaptureRequest.class);
                final CaptureFailure captureFailure = (CaptureFailure) requestFailure.unwrapAs(CaptureFailure.class);
                if (cameraCaptureSession != null && captureRequest != null && captureFailure != null) {
                    value.execute(new Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((CameraUseCaseAdapter.CaptureCallbackContainer) key).getCaptureCallback().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                        }
                    });
                }
            } else {
                final CameraCaptureFailure cameraCaptureFailure = new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR);
                value.execute(new Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        key.onCaptureFailed(this.getCaptureConfigId(requestMetadata), cameraCaptureFailure);
                    }
                });
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onPartialCaptureResult-CcXjc1I */
    public void mo191onPartialCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata) {
        x.f(requestMetadata, "requestMetadata");
        x.f(frameMetadata, "captureResult");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            final CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                RequestMetadata requestMetadata2 = requestMetadata;
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata2.unwrapAs(CameraCaptureSession.class);
                final CaptureRequest captureRequest = (CaptureRequest) requestMetadata2.unwrapAs(CaptureRequest.class);
                final CaptureResult captureResult = (CaptureResult) frameMetadata.unwrapAs(CaptureResult.class);
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    value.execute(new Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda6
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((CameraUseCaseAdapter.CaptureCallbackContainer) key).getCaptureCallback().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                        }
                    });
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onReadoutStarted-mP9r-9w */
    public void mo192onReadoutStartedmP9r9w(RequestMetadata requestMetadata, final long j2, final long j3) {
        x.f(requestMetadata, "requestMetadata");
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            final CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                RequestMetadata requestMetadata2 = requestMetadata;
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata2.unwrapAs(CameraCaptureSession.class);
                final CaptureRequest captureRequest = (CaptureRequest) requestMetadata2.unwrapAs(CaptureRequest.class);
                if (cameraCaptureSession != null && captureRequest != null) {
                    value.execute(new Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda7
                        @Override // java.lang.Runnable
                        public final void run() {
                            Api34Compat.onReadoutStarted(((CameraUseCaseAdapter.CaptureCallbackContainer) key).getCaptureCallback(), cameraCaptureSession, captureRequest, j3, j2);
                        }
                    });
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onRequestSequenceAborted(final RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            final CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                RequestMetadata requestMetadata2 = requestMetadata;
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata2.unwrapAs(CameraCaptureSession.class);
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata2.unwrapAs(CaptureRequest.class);
                if (cameraCaptureSession != null && captureRequest != null) {
                    value.execute(new Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda14
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((CameraUseCaseAdapter.CaptureCallbackContainer) key).getCaptureCallback().onCaptureSequenceAborted(cameraCaptureSession, -1);
                        }
                    });
                }
            } else {
                value.execute(new Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda15
                    @Override // java.lang.Runnable
                    public final void run() {
                        key.onCaptureCancelled(this.getCaptureConfigId(requestMetadata));
                    }
                });
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onRequestSequenceCompleted-RuT0dZU */
    public void mo193onRequestSequenceCompletedRuT0dZU(RequestMetadata requestMetadata, final long j2) {
        x.f(requestMetadata, "requestMetadata");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            final CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                final CameraCaptureSession cameraCaptureSession = getCameraCaptureSession(requestMetadata);
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(CaptureRequest.class);
                if (cameraCaptureSession != null && captureRequest != null) {
                    value.execute(new Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda9
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((CameraUseCaseAdapter.CaptureCallbackContainer) key).getCaptureCallback().onCaptureSequenceCompleted(cameraCaptureSession, -1, j2);
                        }
                    });
                }
            }
        }
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
    public void mo194onStarteduGKBvU4(final RequestMetadata requestMetadata, final long j2, final long j3) {
        x.f(requestMetadata, "requestMetadata");
        for (Map.Entry<CameraCaptureCallback, ? extends Executor> entry : this.callbacks.entrySet()) {
            final CameraCaptureCallback key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                final CameraCaptureSession cameraCaptureSession = getCameraCaptureSession(requestMetadata);
                final CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(CaptureRequest.class);
                if (cameraCaptureSession != null && captureRequest != null) {
                    value.execute(new Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda10
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((CameraUseCaseAdapter.CaptureCallbackContainer) key).getCaptureCallback().onCaptureStarted(cameraCaptureSession, captureRequest, j3, j2);
                        }
                    });
                }
            } else {
                value.execute(new Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        key.onCaptureStarted(this.getCaptureConfigId(requestMetadata));
                    }
                });
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onTotalCaptureResult-CcXjc1I */
    public /* synthetic */ void mo195onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        Request.Listener.CC.m860$default$onTotalCaptureResultCcXjc1I(this, requestMetadata, j2, frameInfo);
    }

    public final void removeCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
        x.f(cameraCaptureCallback, "callback");
        synchronized (this.callbackMap) {
            this.callbackMap.remove(cameraCaptureCallback);
            this.callbacks = r.r(this.callbackMap);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CameraCallbackMap createFor(Collection<? extends CameraCaptureCallback> collection, Executor executor) {
            x.f(collection, "callbacks");
            x.f(executor, "executor");
            CameraCallbackMap cameraCallbackMap = new CameraCallbackMap();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                cameraCallbackMap.addCaptureCallback((CameraCaptureCallback) it.next(), executor);
            }
            return cameraCallbackMap;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
