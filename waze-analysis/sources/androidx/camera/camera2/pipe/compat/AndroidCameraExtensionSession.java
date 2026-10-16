package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$ExtensionCaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.i;
import h.ab;
import h.g.b.x;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class AndroidCameraExtensionSession implements CameraExtensionSessionWrapper {
    private final Executor callbackExecutor;
    private final CameraErrorListener cameraErrorListener;
    private final CameraExtensionSession cameraExtensionSession;
    private final CameraDeviceWrapper device;
    private final Map<CameraExtensionSession, Long> extensionSessionMap;
    private final kotlinx.a.c frameNumbers;
    private final int id;

    /* compiled from: WazeSource */
    public final class Camera2CaptureSessionCallbackToExtensionCaptureCallback extends CameraExtensionSession$ExtensionCaptureCallback {
        private final Camera2CaptureCallback captureCallback;
        private final ConcurrentLinkedQueue<Long> frameQueue;
        final /* synthetic */ AndroidCameraExtensionSession this$0;

        public Camera2CaptureSessionCallbackToExtensionCaptureCallback(AndroidCameraExtensionSession androidCameraExtensionSession, Camera2CaptureCallback camera2CaptureCallback) {
            x.f(camera2CaptureCallback, "captureCallback");
            this.this$0 = androidCameraExtensionSession;
            this.captureCallback = camera2CaptureCallback;
            this.frameQueue = new ConcurrentLinkedQueue<>();
        }

        private final long dequeueFrameNumber(CameraExtensionSession cameraExtensionSession) {
            if (this.frameQueue.isEmpty()) {
                incrementAndGetNextFrameNumber(cameraExtensionSession);
            }
            Long lRemove = this.frameQueue.remove();
            x.e(lRemove, "remove(...)");
            return lRemove.longValue();
        }

        private final long incrementAndGetNextFrameNumber(CameraExtensionSession cameraExtensionSession) {
            long jE = this.this$0.frameNumbers.e();
            Map map = this.this$0.extensionSessionMap;
            Long lValueOf = Long.valueOf(jE);
            map.put(cameraExtensionSession, lValueOf);
            this.frameQueue.add(lValueOf);
            return jE;
        }

        public void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
            x.f(cameraExtensionSession, "session");
            x.f(captureRequest, "request");
            this.captureCallback.mo1012onCaptureFailedRuT0dZU(captureRequest, dequeueFrameNumber(cameraExtensionSession));
        }

        public void onCaptureProcessProgressed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, int i2) {
            x.f(cameraExtensionSession, "session");
            x.f(captureRequest, "request");
            this.captureCallback.onCaptureProcessProgressed(captureRequest, i2);
        }

        public void onCaptureProcessStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
            x.f(cameraExtensionSession, "session");
            x.f(captureRequest, "request");
        }

        public void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            x.f(cameraExtensionSession, "session");
            x.f(captureRequest, "request");
            x.f(totalCaptureResult, "result");
            this.captureCallback.mo1011onCaptureCompletedrmrZIYk(captureRequest, totalCaptureResult, dequeueFrameNumber(cameraExtensionSession));
        }

        public void onCaptureSequenceAborted(CameraExtensionSession cameraExtensionSession, int i2) {
            x.f(cameraExtensionSession, "session");
            this.captureCallback.onCaptureSequenceAborted(i2);
        }

        public void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i2) {
            x.f(cameraExtensionSession, "session");
            Long l2 = (Long) this.this$0.extensionSessionMap.get(cameraExtensionSession);
            x.c(l2);
            this.captureCallback.onCaptureSequenceCompleted(i2, l2.longValue());
        }

        public void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j2) {
            x.f(cameraExtensionSession, "session");
            x.f(captureRequest, "request");
            this.captureCallback.onCaptureStarted(captureRequest, incrementAndGetNextFrameNumber(cameraExtensionSession), j2);
        }
    }

    /* compiled from: WazeSource */
    public final class Camera2CaptureSessionCallbackToExtensionCaptureCallbackAndroidS extends CameraExtensionSession$ExtensionCaptureCallback {
        private final Camera2CaptureCallback captureCallback;
        private final Map<CaptureRequest, List<Long>> captureRequestMap;
        final /* synthetic */ AndroidCameraExtensionSession this$0;

        public Camera2CaptureSessionCallbackToExtensionCaptureCallbackAndroidS(AndroidCameraExtensionSession androidCameraExtensionSession, Camera2CaptureCallback camera2CaptureCallback, Map<CaptureRequest, List<Long>> map) {
            x.f(camera2CaptureCallback, "captureCallback");
            x.f(map, "captureRequestMap");
            this.this$0 = androidCameraExtensionSession;
            this.captureCallback = camera2CaptureCallback;
            this.captureRequestMap = map;
        }

        public void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
            x.f(cameraExtensionSession, "session");
            x.f(captureRequest, "request");
            List<Long> list = this.captureRequestMap.get(captureRequest);
            x.c(list);
            if (list.size() == 1) {
                List<Long> list2 = this.captureRequestMap.get(captureRequest);
                x.c(list2);
                this.captureCallback.mo1012onCaptureFailedRuT0dZU(captureRequest, list2.get(0).longValue());
                return;
            }
            if (Log.INSTANCE.getINFO_LOGGABLE()) {
                Object obj = this.captureRequestMap.get(captureRequest);
                x.c(obj);
                Stream stream = Collection.EL.stream((List) obj);
                Objects.toString(stream);
                android.util.Log.i(Log.TAG, "onCaptureFailed is not triggered for repeating requests. Request frame numbers: ".concat(String.valueOf(stream)));
            }
        }

        public void onCaptureProcessProgressed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, int i2) {
            x.f(cameraExtensionSession, "session");
            x.f(captureRequest, "request");
            this.captureCallback.onCaptureProcessProgressed(captureRequest, i2);
        }

        public void onCaptureProcessStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
            x.f(cameraExtensionSession, "session");
            x.f(captureRequest, "request");
        }

        public void onCaptureSequenceAborted(CameraExtensionSession cameraExtensionSession, int i2) {
            x.f(cameraExtensionSession, "session");
            this.captureCallback.onCaptureSequenceAborted(i2);
        }

        public void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i2) {
            x.f(cameraExtensionSession, "session");
            Long l2 = (Long) this.this$0.extensionSessionMap.get(cameraExtensionSession);
            x.c(l2);
            this.captureCallback.onCaptureSequenceCompleted(i2, l2.longValue());
        }

        public void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j2) {
            x.f(cameraExtensionSession, "session");
            x.f(captureRequest, "request");
            long jE = this.this$0.frameNumbers.e();
            Map map = this.this$0.extensionSessionMap;
            Long lValueOf = Long.valueOf(jE);
            map.put(cameraExtensionSession, lValueOf);
            Map<CaptureRequest, List<Long>> map2 = this.captureRequestMap;
            ArrayList arrayList = map2.get(captureRequest);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map2.put(captureRequest, arrayList);
            }
            arrayList.add(lValueOf);
            this.captureCallback.onCaptureStarted(captureRequest, jE, j2);
        }
    }

    public AndroidCameraExtensionSession(CameraDeviceWrapper cameraDeviceWrapper, CameraExtensionSession cameraExtensionSession, CameraErrorListener cameraErrorListener, Executor executor) {
        x.f(cameraDeviceWrapper, "device");
        x.f(cameraExtensionSession, "cameraExtensionSession");
        x.f(cameraErrorListener, "cameraErrorListener");
        x.f(executor, "callbackExecutor");
        this.device = cameraDeviceWrapper;
        this.cameraExtensionSession = cameraExtensionSession;
        this.cameraErrorListener = cameraErrorListener;
        this.callbackExecutor = executor;
        this.id = CameraInterop.captureSessionIds.e();
        this.frameNumbers = h.e.b.g(0L);
        this.extensionSessionMap = new HashMap();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public boolean abortCaptures() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Integer capture(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        x.f(captureRequest, "request");
        x.f(captureCallback, "listener");
        String strMo985getCameraIdDz_R5H8 = getDevice().mo985getCameraIdDz_R5H8();
        try {
            return Integer.valueOf(Build.VERSION.SDK_INT >= 33 ? this.cameraExtensionSession.capture(captureRequest, this.callbackExecutor, bi$$ExternalSyntheticApiModelOutline0.m119m((Object) new Camera2CaptureSessionCallbackToExtensionCaptureCallback(this, (Camera2CaptureCallback) captureCallback))) : this.cameraExtensionSession.capture(captureRequest, this.callbackExecutor, bi$$ExternalSyntheticApiModelOutline0.m119m((Object) new Camera2CaptureSessionCallbackToExtensionCaptureCallbackAndroidS(this, (Camera2CaptureCallback) captureCallback, new LinkedHashMap()))));
        } catch (Exception e2) {
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            if (e2 instanceof CameraAccessException) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Failed to execute call: Camera encountered an error: ".concat(String.valueOf(e2.getMessage())));
                }
                cameraErrorListener.mo1038onCameraError3M5Xam4(strMo985getCameraIdDz_R5H8, CameraError.Companion.m480fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e2), true);
            } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Failed to execute call: Unexpected exception: ".concat(String.valueOf(e2.getMessage())));
                }
                cameraErrorListener.mo1038onCameraError3M5Xam4(strMo985getCameraIdDz_R5H8, CameraError.Companion.m491getERROR_GRAPH_CONFIGv7Vf74A(), false);
            } else {
                if (!(e2 instanceof IllegalStateException)) {
                    throw e2;
                }
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Failed to execute call: Camera may be closed");
                    return null;
                }
            }
            return null;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Integer captureBurst(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        x.f(list, "requests");
        x.f(captureCallback, "listener");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            capture((CaptureRequest) it.next(), captureCallback);
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws CameraAccessException {
        this.cameraExtensionSession.close();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public boolean finalizeOutputConfigurations(List<? extends OutputConfigurationWrapper> list) {
        x.f(list, "outputConfigs");
        if (!Log.INSTANCE.getWARN_LOGGABLE()) {
            return false;
        }
        android.util.Log.w(Log.TAG, "CameraExtensionSession does not support finalizeOutputConfigurations()");
        return false;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public CameraDeviceWrapper getDevice() {
        return this.device;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    /* renamed from: getId-159jkk4 */
    public int mo982getId159jkk4() {
        return this.id;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Surface getInputSurface() {
        return null;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper
    public CameraExtensionSession.StillCaptureLatency getRealTimeCaptureLatency() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.cameraExtensionSession.getRealtimeStillCaptureLatency();
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public boolean isReprocessable() {
        return false;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Integer setRepeatingBurst(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        x.f(list, "requests");
        x.f(captureCallback, "listener");
        if (list.size() == 1) {
            return setRepeatingRequest((CaptureRequest) i.X(list), captureCallback);
        }
        throw new IllegalStateException("CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Integer setRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        x.f(captureRequest, "request");
        x.f(captureCallback, "listener");
        String strMo985getCameraIdDz_R5H8 = getDevice().mo985getCameraIdDz_R5H8();
        try {
            return Integer.valueOf(Build.VERSION.SDK_INT >= 33 ? this.cameraExtensionSession.setRepeatingRequest(captureRequest, this.callbackExecutor, bi$$ExternalSyntheticApiModelOutline0.m119m((Object) new Camera2CaptureSessionCallbackToExtensionCaptureCallback(this, (Camera2CaptureCallback) captureCallback))) : this.cameraExtensionSession.setRepeatingRequest(captureRequest, this.callbackExecutor, bi$$ExternalSyntheticApiModelOutline0.m119m((Object) new Camera2CaptureSessionCallbackToExtensionCaptureCallbackAndroidS(this, (Camera2CaptureCallback) captureCallback, new LinkedHashMap()))));
        } catch (Exception e2) {
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            if (e2 instanceof CameraAccessException) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Failed to execute call: Camera encountered an error: ".concat(String.valueOf(e2.getMessage())));
                }
                cameraErrorListener.mo1038onCameraError3M5Xam4(strMo985getCameraIdDz_R5H8, CameraError.Companion.m480fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e2), true);
            } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Failed to execute call: Unexpected exception: ".concat(String.valueOf(e2.getMessage())));
                }
                cameraErrorListener.mo1038onCameraError3M5Xam4(strMo985getCameraIdDz_R5H8, CameraError.Companion.m491getERROR_GRAPH_CONFIGv7Vf74A(), false);
            } else {
                if (!(e2 instanceof IllegalStateException)) {
                    throw e2;
                }
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Failed to execute call: Camera may be closed");
                    return null;
                }
            }
            return null;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public boolean stopRepeating() throws Exception {
        ab abVar;
        String strMo985getCameraIdDz_R5H8 = getDevice().mo985getCameraIdDz_R5H8();
        try {
            this.cameraExtensionSession.stopRepeating();
            abVar = ab.f48028a;
        } catch (Exception e2) {
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            if (e2 instanceof CameraAccessException) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Failed to execute call: Camera encountered an error: ".concat(String.valueOf(e2.getMessage())));
                }
                cameraErrorListener.mo1038onCameraError3M5Xam4(strMo985getCameraIdDz_R5H8, CameraError.Companion.m480fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e2), true);
            } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Failed to execute call: Unexpected exception: ".concat(String.valueOf(e2.getMessage())));
                }
                cameraErrorListener.mo1038onCameraError3M5Xam4(strMo985getCameraIdDz_R5H8, CameraError.Companion.m491getERROR_GRAPH_CONFIGv7Vf74A(), false);
            } else {
                if (!(e2 instanceof IllegalStateException)) {
                    throw e2;
                }
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Failed to execute call: Camera may be closed");
                }
            }
            abVar = null;
        }
        return abVar != null;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (x.n(cls, bi$$ExternalSyntheticApiModelOutline0.m134m())) {
            return (T) this.cameraExtensionSession;
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }
}
