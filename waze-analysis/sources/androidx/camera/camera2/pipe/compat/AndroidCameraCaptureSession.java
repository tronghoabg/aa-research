package androidx.camera.camera2.pipe.compat;

import a.a$$ExternalSyntheticApiModelOutline0;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.i;
import h.ab;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class AndroidCameraCaptureSession implements CameraCaptureSessionWrapper {
    private final Handler callbackHandler;
    private final CameraCaptureSession cameraCaptureSession;
    private final CameraErrorListener cameraErrorListener;
    private final CameraDeviceWrapper device;
    private final int id;

    public AndroidCameraCaptureSession(CameraDeviceWrapper cameraDeviceWrapper, CameraCaptureSession cameraCaptureSession, CameraErrorListener cameraErrorListener, Handler handler) {
        x.f(cameraDeviceWrapper, "device");
        x.f(cameraCaptureSession, "cameraCaptureSession");
        x.f(cameraErrorListener, "cameraErrorListener");
        x.f(handler, "callbackHandler");
        this.device = cameraDeviceWrapper;
        this.cameraCaptureSession = cameraCaptureSession;
        this.cameraErrorListener = cameraErrorListener;
        this.callbackHandler = handler;
        this.id = CameraInterop.captureSessionIds.e();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public boolean abortCaptures() {
        ab abVar;
        Debug debug = Debug.INSTANCE;
        String strValueOf = String.valueOf(getDevice().mo985getCameraIdDz_R5H8());
        long jMo1117nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
        String strConcat = "CXCP#abortCaptures-".concat(strValueOf);
        try {
            Trace.beginSection(strConcat);
            String strMo985getCameraIdDz_R5H8 = getDevice().mo985getCameraIdDz_R5H8();
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            try {
                this.cameraCaptureSession.abortCaptures();
                abVar = ab.f48028a;
            } catch (Exception e2) {
                if (e2 instanceof CameraAccessException) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, e.a(e2, "Failed to execute call: Camera encountered an error: "));
                    }
                    cameraErrorListener.mo1038onCameraError3M5Xam4(strMo985getCameraIdDz_R5H8, CameraError.Companion.m480fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e2), true);
                } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, e.a(e2, "Failed to execute call: Unexpected exception: "));
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
            Trace.endSection();
            long jMo1117nowvQl9yQU2 = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
            h.o.c cVar = h.o.a.f48264a;
            long j2 = h.o.c.j(jMo1117nowvQl9yQU2 - jMo1117nowvQl9yQU, h.o.d.f48270a);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, f.a(true, false, null, "%.3f ms", j2, strConcat));
            }
            return abVar != null;
        } finally {
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Integer capture(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        Integer numValueOf;
        x.f(captureRequest, "request");
        x.f(captureCallback, "listener");
        Debug debug = Debug.INSTANCE;
        String strValueOf = String.valueOf(getDevice().mo985getCameraIdDz_R5H8());
        long jMo1117nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
        String strConcat = "CXCP#capture-".concat(strValueOf);
        try {
            Trace.beginSection(strConcat);
            String strMo985getCameraIdDz_R5H8 = getDevice().mo985getCameraIdDz_R5H8();
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            try {
                numValueOf = Integer.valueOf(this.cameraCaptureSession.capture(captureRequest, captureCallback, this.callbackHandler));
            } catch (Exception e2) {
                if (e2 instanceof CameraAccessException) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, e.a(e2, "Failed to execute call: Camera encountered an error: "));
                    }
                    cameraErrorListener.mo1038onCameraError3M5Xam4(strMo985getCameraIdDz_R5H8, CameraError.Companion.m480fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e2), true);
                } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, e.a(e2, "Failed to execute call: Unexpected exception: "));
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
                numValueOf = null;
            }
            Trace.endSection();
            long jMo1117nowvQl9yQU2 = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
            h.o.c cVar = h.o.a.f48264a;
            long j2 = h.o.c.j(jMo1117nowvQl9yQU2 - jMo1117nowvQl9yQU, h.o.d.f48270a);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, f.a(true, false, null, "%.3f ms", j2, strConcat));
            }
            return numValueOf;
        } finally {
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Integer captureBurst(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        Integer numValueOf;
        x.f(list, "requests");
        x.f(captureCallback, "listener");
        Debug debug = Debug.INSTANCE;
        String strValueOf = String.valueOf(getDevice().mo985getCameraIdDz_R5H8());
        long jMo1117nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
        String strConcat = "CXCP#captureBurst-".concat(strValueOf);
        try {
            Trace.beginSection(strConcat);
            String strMo985getCameraIdDz_R5H8 = getDevice().mo985getCameraIdDz_R5H8();
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            try {
                numValueOf = Integer.valueOf(this.cameraCaptureSession.captureBurst(list, captureCallback, this.callbackHandler));
            } catch (Exception e2) {
                if (e2 instanceof CameraAccessException) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, e.a(e2, "Failed to execute call: Camera encountered an error: "));
                    }
                    cameraErrorListener.mo1038onCameraError3M5Xam4(strMo985getCameraIdDz_R5H8, CameraError.Companion.m480fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e2), true);
                } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, e.a(e2, "Failed to execute call: Unexpected exception: "));
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
                numValueOf = null;
            }
            Trace.endSection();
            long jMo1117nowvQl9yQU2 = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
            h.o.c cVar = h.o.a.f48264a;
            long j2 = h.o.c.j(jMo1117nowvQl9yQU2 - jMo1117nowvQl9yQU, h.o.d.f48270a);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, f.a(true, false, null, "%.3f ms", j2, strConcat));
            }
            return numValueOf;
        } finally {
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.cameraCaptureSession.close();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public boolean finalizeOutputConfigurations(List<? extends OutputConfigurationWrapper> list) {
        ab abVar;
        x.f(list, "outputConfigs");
        Debug debug = Debug.INSTANCE;
        String strValueOf = String.valueOf(getDevice().mo985getCameraIdDz_R5H8());
        long jMo1117nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
        String strConcat = "CXCP#finalizeOutputConfigurations-".concat(strValueOf);
        try {
            Trace.beginSection(strConcat);
            String strMo985getCameraIdDz_R5H8 = getDevice().mo985getCameraIdDz_R5H8();
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            try {
                CameraCaptureSession cameraCaptureSession = this.cameraCaptureSession;
                List<? extends OutputConfigurationWrapper> list2 = list;
                ArrayList arrayList = new ArrayList(i.q(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(a$$ExternalSyntheticApiModelOutline0.m4m(((OutputConfigurationWrapper) it.next()).unwrapAs(a$$ExternalSyntheticApiModelOutline0.m16m())));
                }
                Api26Compat.finalizeOutputConfigurations(cameraCaptureSession, arrayList);
                abVar = ab.f48028a;
            } catch (Exception e2) {
                if (e2 instanceof CameraAccessException) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, e.a(e2, "Failed to execute call: Camera encountered an error: "));
                    }
                    cameraErrorListener.mo1038onCameraError3M5Xam4(strMo985getCameraIdDz_R5H8, CameraError.Companion.m480fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e2), true);
                } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, e.a(e2, "Failed to execute call: Unexpected exception: "));
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
        } finally {
            Trace.endSection();
            long jMo1117nowvQl9yQU2 = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
            h.o.c cVar = h.o.a.f48264a;
            long j2 = h.o.c.j(jMo1117nowvQl9yQU2 - jMo1117nowvQl9yQU, h.o.d.f48270a);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, f.a(true, false, null, "%.3f ms", j2, strConcat));
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public CameraDeviceWrapper getDevice() {
        return this.device;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    /* renamed from: getId-159jkk4, reason: not valid java name */
    public int mo982getId159jkk4() {
        return this.id;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Surface getInputSurface() {
        return this.cameraCaptureSession.getInputSurface();
    }

    public final <T> T instrumentAndCatch$camera_camera2_pipe(String str, h.g.a.a<? extends T> aVar) {
        T tInvoke;
        x.f(str, "fnName");
        x.f(aVar, "block");
        Debug debug = Debug.INSTANCE;
        String str2 = "CXCP#" + str + "-" + getDevice().mo985getCameraIdDz_R5H8();
        long jMo1117nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
        try {
            Trace.beginSection(str2);
            String strMo985getCameraIdDz_R5H8 = getDevice().mo985getCameraIdDz_R5H8();
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            try {
                tInvoke = aVar.invoke();
            } catch (Exception e2) {
                if (e2 instanceof CameraAccessException) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, e.a(e2, "Failed to execute call: Camera encountered an error: "));
                    }
                    cameraErrorListener.mo1038onCameraError3M5Xam4(strMo985getCameraIdDz_R5H8, CameraError.Companion.m480fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e2), true);
                } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, e.a(e2, "Failed to execute call: Unexpected exception: "));
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
                tInvoke = null;
            }
            Trace.endSection();
            long jMo1117nowvQl9yQU2 = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
            h.o.c cVar = h.o.a.f48264a;
            long j2 = h.o.c.j(jMo1117nowvQl9yQU2 - jMo1117nowvQl9yQU, h.o.d.f48270a);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, f.a(true, false, null, "%.3f ms", j2, str2));
            }
            return tInvoke;
        } finally {
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public boolean isReprocessable() {
        return this.cameraCaptureSession.isReprocessable();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Integer setRepeatingBurst(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        Integer numValueOf;
        x.f(list, "requests");
        x.f(captureCallback, "listener");
        Debug debug = Debug.INSTANCE;
        String strValueOf = String.valueOf(getDevice().mo985getCameraIdDz_R5H8());
        long jMo1117nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
        String strConcat = "CXCP#setRepeatingBurst-".concat(strValueOf);
        try {
            Trace.beginSection(strConcat);
            String strMo985getCameraIdDz_R5H8 = getDevice().mo985getCameraIdDz_R5H8();
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            try {
                numValueOf = Integer.valueOf(this.cameraCaptureSession.setRepeatingBurst(list, captureCallback, this.callbackHandler));
            } catch (Exception e2) {
                if (e2 instanceof CameraAccessException) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, e.a(e2, "Failed to execute call: Camera encountered an error: "));
                    }
                    cameraErrorListener.mo1038onCameraError3M5Xam4(strMo985getCameraIdDz_R5H8, CameraError.Companion.m480fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e2), true);
                } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, e.a(e2, "Failed to execute call: Unexpected exception: "));
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
                numValueOf = null;
            }
            Trace.endSection();
            long jMo1117nowvQl9yQU2 = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
            h.o.c cVar = h.o.a.f48264a;
            long j2 = h.o.c.j(jMo1117nowvQl9yQU2 - jMo1117nowvQl9yQU, h.o.d.f48270a);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, f.a(true, false, null, "%.3f ms", j2, strConcat));
            }
            return numValueOf;
        } finally {
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Integer setRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        Integer numValueOf;
        x.f(captureRequest, "request");
        x.f(captureCallback, "listener");
        Debug debug = Debug.INSTANCE;
        String strValueOf = String.valueOf(getDevice().mo985getCameraIdDz_R5H8());
        long jMo1117nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
        String strConcat = "CXCP#setRepeatingRequest-".concat(strValueOf);
        try {
            Trace.beginSection(strConcat);
            String strMo985getCameraIdDz_R5H8 = getDevice().mo985getCameraIdDz_R5H8();
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            try {
                numValueOf = Integer.valueOf(this.cameraCaptureSession.setRepeatingRequest(captureRequest, captureCallback, this.callbackHandler));
            } catch (Exception e2) {
                if (e2 instanceof CameraAccessException) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, e.a(e2, "Failed to execute call: Camera encountered an error: "));
                    }
                    cameraErrorListener.mo1038onCameraError3M5Xam4(strMo985getCameraIdDz_R5H8, CameraError.Companion.m480fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e2), true);
                } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, e.a(e2, "Failed to execute call: Unexpected exception: "));
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
                numValueOf = null;
            }
            Trace.endSection();
            long jMo1117nowvQl9yQU2 = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
            h.o.c cVar = h.o.a.f48264a;
            long j2 = h.o.c.j(jMo1117nowvQl9yQU2 - jMo1117nowvQl9yQU, h.o.d.f48270a);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, f.a(true, false, null, "%.3f ms", j2, strConcat));
            }
            return numValueOf;
        } finally {
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public boolean stopRepeating() {
        ab abVar;
        Debug debug = Debug.INSTANCE;
        String strValueOf = String.valueOf(getDevice().mo985getCameraIdDz_R5H8());
        long jMo1117nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
        String strConcat = "CXCP#stopRepeating-".concat(strValueOf);
        try {
            Trace.beginSection(strConcat);
            String strMo985getCameraIdDz_R5H8 = getDevice().mo985getCameraIdDz_R5H8();
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            try {
                this.cameraCaptureSession.stopRepeating();
                abVar = ab.f48028a;
            } catch (Exception e2) {
                if (e2 instanceof CameraAccessException) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, e.a(e2, "Failed to execute call: Camera encountered an error: "));
                    }
                    cameraErrorListener.mo1038onCameraError3M5Xam4(strMo985getCameraIdDz_R5H8, CameraError.Companion.m480fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e2), true);
                } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, e.a(e2, "Failed to execute call: Unexpected exception: "));
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
            Trace.endSection();
            long jMo1117nowvQl9yQU2 = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
            h.o.c cVar = h.o.a.f48264a;
            long j2 = h.o.c.j(jMo1117nowvQl9yQU2 - jMo1117nowvQl9yQU, h.o.d.f48270a);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, f.a(true, false, null, "%.3f ms", j2, strConcat));
            }
            return abVar != null;
        } finally {
        }
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (x.n(cls, CameraCaptureSession.class)) {
            return (T) this.cameraCaptureSession;
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }
}
