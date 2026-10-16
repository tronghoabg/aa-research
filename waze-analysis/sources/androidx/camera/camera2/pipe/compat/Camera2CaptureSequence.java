package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.CaptureSequence;
import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.core.Log;
import h.ab;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CaptureSequence extends CameraCaptureSession.CaptureCallback implements Camera2CaptureCallback, CaptureSequence<CaptureRequest> {
    private volatile Integer _sequenceNumber;
    private final String cameraId;
    private final List<RequestMetadata> captureMetadataList;
    private final List<CaptureRequest> captureRequestList;
    private final long debugId;
    private final CompletableDeferred<ab> hasStarted;
    private final List<Request.Listener> listeners;
    private final boolean repeating;
    private final CaptureSequence.CaptureSequenceListener sequenceListener;
    private final StreamGraph streamGraph;
    private final StrictMode strictMode;
    private final Map<Surface, OutputId> surfaceToOutputMap;
    private final Map<Surface, StreamId> surfaceToStreamMap;

    /* JADX WARN: Multi-variable type inference failed */
    private Camera2CaptureSequence(String str, boolean z, List<CaptureRequest> list, List<? extends RequestMetadata> list2, List<? extends Request.Listener> list3, CaptureSequence.CaptureSequenceListener captureSequenceListener, Map<Surface, StreamId> map, Map<Surface, OutputId> map2, StreamGraph streamGraph, StrictMode strictMode) {
        x.f(str, "cameraId");
        x.f(list, "captureRequestList");
        x.f(list2, "captureMetadataList");
        x.f(list3, "listeners");
        x.f(captureSequenceListener, "sequenceListener");
        x.f(map, "surfaceToStreamMap");
        x.f(map2, "surfaceToOutputMap");
        x.f(streamGraph, "streamGraph");
        x.f(strictMode, "strictMode");
        this.cameraId = str;
        this.repeating = z;
        this.captureRequestList = list;
        this.captureMetadataList = list2;
        this.listeners = list3;
        this.sequenceListener = captureSequenceListener;
        this.surfaceToStreamMap = map;
        this.surfaceToOutputMap = map2;
        this.streamGraph = streamGraph;
        this.strictMode = strictMode;
        this.debugId = Camera2CaptureSequenceProcessorKt.getCaptureSequenceDebugIds().e();
        this.hasStarted = bo.j();
        if (getCaptureRequestList().size() != getCaptureMetadataList().size()) {
            throw new IllegalStateException("CaptureRequestList and CaptureMetadataList must have a 1:1 mapping.");
        }
    }

    /* renamed from: getStreamId-Lfjdq8s, reason: not valid java name */
    private final StreamId m1013getStreamIdLfjdq8s(Surface surface) {
        CameraStream stream;
        StreamId streamId = this.surfaceToStreamMap.get(surface);
        if (streamId != null) {
            return streamId;
        }
        OutputId outputId = this.surfaceToOutputMap.get(surface);
        OutputStream outputStreamMo963getiYJqvbA = outputId != null ? this.streamGraph.mo963getiYJqvbA(outputId.m740unboximpl()) : null;
        if (outputStreamMo963getiYJqvbA == null || (stream = outputStreamMo963getiYJqvbA.getStream()) == null) {
            return null;
        }
        return StreamId.m974boximpl(stream.m578getIdptHMqGs());
    }

    /* renamed from: invokeCaptureFailure-CcXjc1I, reason: not valid java name */
    private final void m1014invokeCaptureFailureCcXjc1I(RequestMetadata requestMetadata, long j2, RequestFailure requestFailure) {
        CaptureSequence.CaptureSequenceListener sequenceListener = getSequenceListener();
        Camera2CaptureSequence camera2CaptureSequence = this;
        sequenceListener.onCaptureSequenceComplete(camera2CaptureSequence);
        Trace.beginSection("InvokeInternalListeners");
        int size = camera2CaptureSequence.getListeners().size();
        for (int i2 = 0; i2 < size; i2++) {
            camera2CaptureSequence.getListeners().get(i2).mo190onFailedCcXjc1I(requestMetadata, j2, requestFailure);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = requestMetadata.getRequest().getListeners().size();
        for (int i3 = 0; i3 < size2; i3++) {
            requestMetadata.getRequest().getListeners().get(i3).mo190onFailedCcXjc1I(requestMetadata, j2, requestFailure);
        }
        Trace.endSection();
    }

    private final RequestMetadata readRequestMetadata(CaptureRequest captureRequest) {
        int size = getCaptureRequestList().size();
        for (int i2 = 0; i2 < size; i2++) {
            if (getCaptureRequestList().get(i2) == captureRequest) {
                return getCaptureMetadataList().get(i2);
            }
        }
        throw new IllegalArgumentException("Failed to find CaptureRequest " + captureRequest + " in " + getCaptureRequestList());
    }

    public final Object awaitStarted$camera_camera2_pipe(h.c.e<? super ab> eVar) {
        Object objC = this.hasStarted.c(eVar);
        return objC == h.c.a.a.f48038a ? objC : ab.f48028a;
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequence
    /* renamed from: getCameraId-Dz_R5H8 */
    public String mo595getCameraIdDz_R5H8() {
        return this.cameraId;
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequence
    public List<RequestMetadata> getCaptureMetadataList() {
        return this.captureMetadataList;
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequence
    public List<CaptureRequest> getCaptureRequestList() {
        return this.captureRequestList;
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequence
    public List<Request.Listener> getListeners() {
        return this.listeners;
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequence
    public boolean getRepeating() {
        return this.repeating;
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequence
    public CaptureSequence.CaptureSequenceListener getSequenceListener() {
        return this.sequenceListener;
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequence
    public int getSequenceNumber() {
        int iIntValue;
        if (this._sequenceNumber != null) {
            Integer num = this._sequenceNumber;
            if (num != null) {
                return num.intValue();
            }
            throw new IllegalStateException(a.a(this, "SequenceNumber has not been set for ", "!"));
        }
        synchronized (this) {
            Integer num2 = this._sequenceNumber;
            if (num2 == null) {
                throw new IllegalStateException(a.a(this, "SequenceNumber has not been set for ", "!"));
            }
            iIntValue = num2.intValue();
        }
        return iIntValue;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j2) {
        x.f(cameraCaptureSession, "captureSession");
        x.f(captureRequest, "captureRequest");
        x.f(surface, "surface");
        Trace.beginSection("onCaptureBufferLost");
        Map<Surface, OutputId> map = this.surfaceToOutputMap;
        StreamId streamIdM1013getStreamIdLfjdq8s = m1013getStreamIdLfjdq8s(surface);
        OutputId outputId = map.get(surface);
        if (streamIdM1013getStreamIdLfjdq8s == null) {
            throw new IllegalStateException("Unable to find the streamId for " + surface + " on " + FrameNumber.m695toStringimpl(j2));
        }
        if (outputId == null) {
            throw new IllegalStateException("Unable to find the outputId for " + surface + " on " + FrameNumber.m695toStringimpl(j2));
        }
        RequestMetadata requestMetadata = readRequestMetadata(captureRequest);
        Camera2CaptureSequence camera2CaptureSequence = this;
        Trace.beginSection("InvokeInternalListeners");
        int size = camera2CaptureSequence.getListeners().size();
        for (int i2 = 0; i2 < size; i2++) {
            camera2CaptureSequence.getListeners().get(i2).mo187onBufferLostDlC0U5Y(requestMetadata, j2, streamIdM1013getStreamIdLfjdq8s.m980unboximpl());
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = requestMetadata.getRequest().getListeners().size();
        for (int i3 = 0; i3 < size2; i3++) {
            requestMetadata.getRequest().getListeners().get(i3).mo187onBufferLostDlC0U5Y(requestMetadata, j2, streamIdM1013getStreamIdLfjdq8s.m980unboximpl());
        }
        Trace.endSection();
        Trace.beginSection("InvokeInternalListeners");
        int size3 = camera2CaptureSequence.getListeners().size();
        for (int i4 = 0; i4 < size3; i4++) {
            camera2CaptureSequence.getListeners().get(i4).mo188onBufferLostiiEMlm4(requestMetadata, j2, streamIdM1013getStreamIdLfjdq8s.m980unboximpl(), outputId.m740unboximpl());
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = requestMetadata.getRequest().getListeners().size();
        for (int i5 = 0; i5 < size4; i5++) {
            requestMetadata.getRequest().getListeners().get(i5).mo188onBufferLostiiEMlm4(requestMetadata, j2, streamIdM1013getStreamIdLfjdq8s.m980unboximpl(), outputId.m740unboximpl());
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        x.f(cameraCaptureSession, "captureSession");
        x.f(captureRequest, "captureRequest");
        x.f(totalCaptureResult, "captureResult");
        mo1011onCaptureCompletedrmrZIYk(captureRequest, totalCaptureResult, totalCaptureResult.getFrameNumber());
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CaptureCallback
    /* renamed from: onCaptureCompleted-rmrZIYk */
    public void mo1011onCaptureCompletedrmrZIYk(CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, long j2) {
        x.f(captureRequest, "captureRequest");
        x.f(totalCaptureResult, "captureResult");
        Trace.beginSection("onCaptureCompleted");
        Trace.beginSection("onCaptureSequenceComplete");
        Camera2CaptureSequence camera2CaptureSequence = this;
        getSequenceListener().onCaptureSequenceComplete(camera2CaptureSequence);
        Trace.endSection();
        RequestMetadata requestMetadata = readRequestMetadata(captureRequest);
        AndroidFrameInfo androidFrameInfo = new AndroidFrameInfo(totalCaptureResult, mo595getCameraIdDz_R5H8(), requestMetadata, null);
        Trace.beginSection("onTotalCaptureResult");
        Trace.beginSection("InvokeInternalListeners");
        int size = camera2CaptureSequence.getListeners().size();
        for (int i2 = 0; i2 < size; i2++) {
            camera2CaptureSequence.getListeners().get(i2).mo195onTotalCaptureResultCcXjc1I(requestMetadata, j2, androidFrameInfo);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = requestMetadata.getRequest().getListeners().size();
        for (int i3 = 0; i3 < size2; i3++) {
            requestMetadata.getRequest().getListeners().get(i3).mo195onTotalCaptureResultCcXjc1I(requestMetadata, j2, androidFrameInfo);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.beginSection("onComplete");
        Trace.beginSection("InvokeInternalListeners");
        int size3 = camera2CaptureSequence.getListeners().size();
        for (int i4 = 0; i4 < size3; i4++) {
            camera2CaptureSequence.getListeners().get(i4).mo189onCompleteCcXjc1I(requestMetadata, j2, androidFrameInfo);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = requestMetadata.getRequest().getListeners().size();
        for (int i5 = 0; i5 < size4; i5++) {
            requestMetadata.getRequest().getListeners().get(i5).mo189onCompleteCcXjc1I(requestMetadata, j2, androidFrameInfo);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        x.f(cameraCaptureSession, "captureSession");
        x.f(captureRequest, "captureRequest");
        x.f(captureFailure, "captureFailure");
        Trace.beginSection("onCaptureFailed");
        this.hasStarted.a(ab.f48028a);
        RequestMetadata requestMetadata = readRequestMetadata(captureRequest);
        m1014invokeCaptureFailureCcXjc1I(requestMetadata, captureFailure.getFrameNumber(), new AndroidCaptureFailure(requestMetadata, captureFailure));
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CaptureCallback
    /* renamed from: onCaptureFailed-RuT0dZU */
    public void mo1012onCaptureFailedRuT0dZU(CaptureRequest captureRequest, long j2) {
        x.f(captureRequest, "captureRequest");
        Trace.beginSection("onCaptureFailed");
        this.hasStarted.a(ab.f48028a);
        RequestMetadata requestMetadata = readRequestMetadata(captureRequest);
        m1014invokeCaptureFailureCcXjc1I(requestMetadata, j2, new ExtensionRequestFailure(requestMetadata, false, j2, 0, null));
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CaptureCallback
    public void onCaptureProcessProgressed(CaptureRequest captureRequest, int i2) {
        x.f(captureRequest, "captureRequest");
        Trace.beginSection("onCaptureProcessProgressed");
        RequestMetadata requestMetadata = readRequestMetadata(captureRequest);
        Camera2CaptureSequence camera2CaptureSequence = this;
        Trace.beginSection("InvokeInternalListeners");
        int size = camera2CaptureSequence.getListeners().size();
        for (int i3 = 0; i3 < size; i3++) {
            camera2CaptureSequence.getListeners().get(i3).onCaptureProgress(requestMetadata, i2);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = requestMetadata.getRequest().getListeners().size();
        for (int i4 = 0; i4 < size2; i4++) {
            requestMetadata.getRequest().getListeners().get(i4).onCaptureProgress(requestMetadata, i2);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CaptureCallback
    public void onCaptureProgressed(CaptureRequest captureRequest, CaptureResult captureResult) {
        x.f(captureRequest, "captureRequest");
        x.f(captureResult, "partialCaptureResult");
        Trace.beginSection("onCaptureProgressed");
        long frameNumber = captureResult.getFrameNumber();
        AndroidFrameMetadata androidFrameMetadata = new AndroidFrameMetadata(captureResult, mo595getCameraIdDz_R5H8(), null);
        RequestMetadata requestMetadata = readRequestMetadata(captureRequest);
        Camera2CaptureSequence camera2CaptureSequence = this;
        Trace.beginSection("InvokeInternalListeners");
        int size = camera2CaptureSequence.getListeners().size();
        for (int i2 = 0; i2 < size; i2++) {
            camera2CaptureSequence.getListeners().get(i2).mo191onPartialCaptureResultCcXjc1I(requestMetadata, frameNumber, androidFrameMetadata);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = requestMetadata.getRequest().getListeners().size();
        for (int i3 = 0; i3 < size2; i3++) {
            requestMetadata.getRequest().getListeners().get(i3).mo191onPartialCaptureResultCcXjc1I(requestMetadata, frameNumber, androidFrameMetadata);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CaptureCallback
    public void onCaptureSequenceAborted(int i2) {
        Trace.beginSection("onCaptureSequenceAborted");
        this.hasStarted.a(ab.f48028a);
        Camera2CaptureSequence camera2CaptureSequence = this;
        getSequenceListener().onCaptureSequenceComplete(camera2CaptureSequence);
        if (getSequenceNumber() != i2) {
            StrictMode strictMode = this.strictMode;
            String str = "onCaptureSequenceAborted was invoked on " + getSequenceNumber() + ", but expected " + i2 + "!";
            if (strictMode.getEnabled()) {
                throw new IllegalStateException(str);
            }
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, str);
            }
        }
        Trace.beginSection("InvokeInternalListeners");
        int size = camera2CaptureSequence.getCaptureMetadataList().size();
        for (int i3 = 0; i3 < size; i3++) {
            RequestMetadata requestMetadata = camera2CaptureSequence.getCaptureMetadataList().get(i3);
            int size2 = camera2CaptureSequence.getListeners().size();
            for (int i4 = 0; i4 < size2; i4++) {
                camera2CaptureSequence.getListeners().get(i4).onRequestSequenceAborted(requestMetadata);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = camera2CaptureSequence.getCaptureMetadataList().size();
        for (int i5 = 0; i5 < size3; i5++) {
            RequestMetadata requestMetadata2 = camera2CaptureSequence.getCaptureMetadataList().get(i5);
            int size4 = requestMetadata2.getRequest().getListeners().size();
            for (int i6 = 0; i6 < size4; i6++) {
                requestMetadata2.getRequest().getListeners().get(i6).onRequestSequenceAborted(requestMetadata2);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CaptureCallback
    public void onCaptureSequenceCompleted(int i2, long j2) {
        Trace.beginSection("onCaptureSequenceCompleted");
        this.hasStarted.a(ab.f48028a);
        Camera2CaptureSequence camera2CaptureSequence = this;
        getSequenceListener().onCaptureSequenceComplete(camera2CaptureSequence);
        if (getSequenceNumber() != i2) {
            StrictMode strictMode = this.strictMode;
            String str = "onCaptureSequenceCompleted was invoked on " + getSequenceNumber() + ", but expected " + i2 + "!";
            if (strictMode.getEnabled()) {
                throw new IllegalStateException(str);
            }
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, str);
            }
        }
        Trace.beginSection("InvokeInternalListeners");
        int size = camera2CaptureSequence.getCaptureMetadataList().size();
        for (int i3 = 0; i3 < size; i3++) {
            RequestMetadata requestMetadata = camera2CaptureSequence.getCaptureMetadataList().get(i3);
            int size2 = camera2CaptureSequence.getListeners().size();
            for (int i4 = 0; i4 < size2; i4++) {
                camera2CaptureSequence.getListeners().get(i4).mo193onRequestSequenceCompletedRuT0dZU(requestMetadata, j2);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = camera2CaptureSequence.getCaptureMetadataList().size();
        for (int i5 = 0; i5 < size3; i5++) {
            RequestMetadata requestMetadata2 = camera2CaptureSequence.getCaptureMetadataList().get(i5);
            int size4 = requestMetadata2.getRequest().getListeners().size();
            for (int i6 = 0; i6 < size4; i6++) {
                requestMetadata2.getRequest().getListeners().get(i6).mo193onRequestSequenceCompletedRuT0dZU(requestMetadata2, j2);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CaptureCallback
    public void onCaptureStarted(CaptureRequest captureRequest, long j2, long j3) {
        x.f(captureRequest, "captureRequest");
        Trace.beginSection("onCaptureStarted");
        this.hasStarted.a(ab.f48028a);
        RequestMetadata requestMetadata = readRequestMetadata(captureRequest);
        Camera2CaptureSequence camera2CaptureSequence = this;
        Trace.beginSection("InvokeInternalListeners");
        int size = camera2CaptureSequence.getListeners().size();
        for (int i2 = 0; i2 < size; i2++) {
            camera2CaptureSequence.getListeners().get(i2).mo194onStarteduGKBvU4(requestMetadata, j2, j3);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = requestMetadata.getRequest().getListeners().size();
        for (int i3 = 0; i3 < size2; i3++) {
            requestMetadata.getRequest().getListeners().get(i3).mo194onStarteduGKBvU4(requestMetadata, j2, j3);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j3) {
        x.f(cameraCaptureSession, "session");
        x.f(captureRequest, "captureRequest");
        Trace.beginSection("onReadoutStarted");
        RequestMetadata requestMetadata = readRequestMetadata(captureRequest);
        Camera2CaptureSequence camera2CaptureSequence = this;
        Trace.beginSection("InvokeInternalListeners");
        int size = camera2CaptureSequence.getListeners().size();
        for (int i2 = 0; i2 < size; i2++) {
            camera2CaptureSequence.getListeners().get(i2).mo192onReadoutStartedmP9r9w(requestMetadata, j3, j2);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = requestMetadata.getRequest().getListeners().size();
        for (int i3 = 0; i3 < size2; i3++) {
            requestMetadata.getRequest().getListeners().get(i3).mo192onReadoutStartedmP9r9w(requestMetadata, j3, j2);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequence
    public void setSequenceNumber(int i2) {
        this._sequenceNumber = Integer.valueOf(i2);
    }

    public String toString() {
        return "Camera2CaptureSequence-" + this.debugId;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j3) {
        x.f(cameraCaptureSession, "captureSession");
        x.f(captureRequest, "captureRequest");
        onCaptureStarted(captureRequest, j3, j2);
    }

    public /* synthetic */ Camera2CaptureSequence(String str, boolean z, List list, List list2, List list3, CaptureSequence.CaptureSequenceListener captureSequenceListener, Map map, Map map2, StreamGraph streamGraph, StrictMode strictMode, o oVar) {
        this(str, z, list, list2, list3, captureSequenceListener, map, map2, streamGraph, strictMode);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        x.f(cameraCaptureSession, "captureSession");
        x.f(captureRequest, "captureRequest");
        x.f(captureResult, "partialCaptureResult");
        onCaptureProgressed(captureRequest, captureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i2) {
        x.f(cameraCaptureSession, "captureSession");
        onCaptureSequenceAborted(i2);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i2, long j2) {
        x.f(cameraCaptureSession, "captureSession");
        onCaptureSequenceCompleted(i2, j2);
    }
}
