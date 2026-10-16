package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidCameraDevice implements CameraDeviceWrapper {
    private final kotlinx.a.d<SessionStateCallback> _lastStateCallback;
    private final CameraDevice cameraDevice;
    private final CameraErrorListener cameraErrorListener;
    private final String cameraId;
    private final CameraMetadata cameraMetadata;
    private final kotlinx.a.a closed;
    private final CameraInterop.CaptureSessionListener interopCaptureSessionListener;
    private final Threads threads;

    private AndroidCameraDevice(CameraMetadata cameraMetadata, CameraDevice cameraDevice, String str, CameraErrorListener cameraErrorListener, CameraInterop.CaptureSessionListener captureSessionListener, Threads threads) {
        x.f(cameraMetadata, "cameraMetadata");
        x.f(cameraDevice, "cameraDevice");
        x.f(str, "cameraId");
        x.f(cameraErrorListener, "cameraErrorListener");
        x.f(threads, "threads");
        this.cameraMetadata = cameraMetadata;
        this.cameraDevice = cameraDevice;
        this.cameraId = str;
        this.cameraErrorListener = cameraErrorListener;
        this.interopCaptureSessionListener = captureSessionListener;
        this.threads = threads;
        this.closed = h.e.b.e(false);
        this._lastStateCallback = h.e.b.h(null);
    }

    private final k<Boolean, SessionStateCallback> checkAndSetStateCallback(SessionStateCallback sessionStateCallback) {
        if (!this.closed.c()) {
            return new k<>(true, this._lastStateCallback.a(sessionStateCallback));
        }
        onSessionFinalizedWithTrace(sessionStateCallback);
        return new k<>(false, null);
    }

    private final <T> T instrumentAndCatch(String str, h.g.a.a<? extends T> aVar) {
        T tInvoke;
        Debug debug = Debug.INSTANCE;
        String str2 = "CXCP#" + str + "-" + mo985getCameraIdDz_R5H8();
        long jMo1117nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
        try {
            Trace.beginSection(str2);
            String strMo985getCameraIdDz_R5H8 = mo985getCameraIdDz_R5H8();
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

    private final void onSessionDisconnectedWithTrace(SessionStateCallback sessionStateCallback) {
        toString();
        try {
            Trace.beginSection(toString().concat("#onSessionDisconnected"));
            sessionStateCallback.onSessionDisconnected();
        } finally {
            Trace.endSection();
        }
    }

    private final void onSessionFinalizedWithTrace(SessionStateCallback sessionStateCallback) {
        toString();
        try {
            Trace.beginSection(toString().concat("#onSessionFinalized"));
            sessionStateCallback.onSessionFinalized();
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /* renamed from: createCaptureRequest-2PPcXtw, reason: not valid java name */
    public CaptureRequest.Builder mo983createCaptureRequest2PPcXtw(int i2) {
        CaptureRequest.Builder builderCreateCaptureRequest;
        Debug debug = Debug.INSTANCE;
        String strValueOf = String.valueOf(mo985getCameraIdDz_R5H8());
        long jMo1117nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
        String strConcat = "CXCP#createCaptureRequest-".concat(strValueOf);
        try {
            Trace.beginSection(strConcat);
            String strMo985getCameraIdDz_R5H8 = mo985getCameraIdDz_R5H8();
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            try {
                builderCreateCaptureRequest = this.cameraDevice.createCaptureRequest(i2);
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
                builderCreateCaptureRequest = null;
            }
            Trace.endSection();
            long jMo1117nowvQl9yQU2 = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
            h.o.c cVar = h.o.a.f48264a;
            long j2 = h.o.c.j(jMo1117nowvQl9yQU2 - jMo1117nowvQl9yQU, h.o.d.f48270a);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, f.a(true, false, null, "%.3f ms", j2, strConcat));
            }
            return builderCreateCaptureRequest;
        } finally {
        }
    }

    /* JADX WARN: Not initialized variable reg: 18, insn: 0x02db: MOVE (r12 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]) (LINE:732), block:B:120:0x02d8 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022a A[Catch: all -> 0x02d7, TryCatch #4 {all -> 0x02d7, blocks: (B:22:0x00c5, B:24:0x00d4, B:26:0x00da, B:27:0x00ea, B:28:0x011c, B:31:0x0128, B:33:0x012e, B:43:0x016c, B:44:0x018d, B:46:0x0193, B:47:0x01a1, B:48:0x01af, B:50:0x01b5, B:52:0x01c7, B:54:0x01d4, B:55:0x01d8, B:57:0x01f0, B:59:0x01f7, B:60:0x01fa, B:62:0x01fc, B:63:0x01ff, B:34:0x0132, B:36:0x013a, B:38:0x0148, B:40:0x0150, B:77:0x0225, B:79:0x022a, B:81:0x0232, B:82:0x023b, B:85:0x024a, B:87:0x024e, B:89:0x0252, B:91:0x0256, B:94:0x025b, B:96:0x025f, B:98:0x0267, B:99:0x026d, B:100:0x026e, B:102:0x0276, B:103:0x027f), top: B:135:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024a A[Catch: all -> 0x02d7, TryCatch #4 {all -> 0x02d7, blocks: (B:22:0x00c5, B:24:0x00d4, B:26:0x00da, B:27:0x00ea, B:28:0x011c, B:31:0x0128, B:33:0x012e, B:43:0x016c, B:44:0x018d, B:46:0x0193, B:47:0x01a1, B:48:0x01af, B:50:0x01b5, B:52:0x01c7, B:54:0x01d4, B:55:0x01d8, B:57:0x01f0, B:59:0x01f7, B:60:0x01fa, B:62:0x01fc, B:63:0x01ff, B:34:0x0132, B:36:0x013a, B:38:0x0148, B:40:0x0150, B:77:0x0225, B:79:0x022a, B:81:0x0232, B:82:0x023b, B:85:0x024a, B:87:0x024e, B:89:0x0252, B:91:0x0256, B:94:0x025b, B:96:0x025f, B:98:0x0267, B:99:0x026d, B:100:0x026e, B:102:0x0276, B:103:0x027f), top: B:135:0x0049 }] */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean createCaptureSession(androidx.camera.camera2.pipe.compat.SessionConfigData r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraDevice.createCaptureSession(androidx.camera.camera2.pipe.compat.SessionConfigData):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd A[Catch: all -> 0x0183, TryCatch #1 {all -> 0x0183, blocks: (B:21:0x00b2, B:35:0x00d8, B:37:0x00dd, B:39:0x00e5, B:40:0x00ee, B:43:0x00fc, B:45:0x0100, B:47:0x0104, B:49:0x0108, B:52:0x010d, B:54:0x0111, B:56:0x0119, B:57:0x011f, B:58:0x0120, B:60:0x0128, B:61:0x0131), top: B:86:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc A[Catch: all -> 0x0183, TryCatch #1 {all -> 0x0183, blocks: (B:21:0x00b2, B:35:0x00d8, B:37:0x00dd, B:39:0x00e5, B:40:0x00ee, B:43:0x00fc, B:45:0x0100, B:47:0x0104, B:49:0x0108, B:52:0x010d, B:54:0x0111, B:56:0x0119, B:57:0x011f, B:58:0x0120, B:60:0x0128, B:61:0x0131), top: B:86:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0181 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0182 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a4  */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean createCaptureSessionByOutputConfigurations(java.util.List<? extends androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper> r21, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraDevice.createCaptureSessionByOutputConfigurations(java.util.List, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper$StateCallback):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0 A[Catch: all -> 0x0156, TryCatch #1 {all -> 0x0156, blocks: (B:18:0x0082, B:31:0x00ab, B:33:0x00b0, B:35:0x00b8, B:36:0x00c1, B:39:0x00cf, B:41:0x00d3, B:43:0x00d7, B:45:0x00db, B:48:0x00e0, B:50:0x00e4, B:52:0x00ec, B:53:0x00f2, B:54:0x00f3, B:56:0x00fb, B:57:0x0104), top: B:82:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf A[Catch: all -> 0x0156, TryCatch #1 {all -> 0x0156, blocks: (B:18:0x0082, B:31:0x00ab, B:33:0x00b0, B:35:0x00b8, B:36:0x00c1, B:39:0x00cf, B:41:0x00d3, B:43:0x00d7, B:45:0x00db, B:48:0x00e0, B:50:0x00e4, B:52:0x00ec, B:53:0x00f2, B:54:0x00f3, B:56:0x00fb, B:57:0x0104), top: B:82:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155 A[RETURN] */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean createConstrainedHighSpeedCaptureSession(java.util.List<? extends android.view.Surface> r21, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraDevice.createConstrainedHighSpeedCaptureSession(java.util.List, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper$StateCallback):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014a A[Catch: all -> 0x01ef, TryCatch #8 {all -> 0x01ef, blocks: (B:28:0x00c9, B:30:0x00da, B:32:0x00e0, B:34:0x00f4, B:35:0x00f8, B:36:0x00ff, B:37:0x0100, B:55:0x0145, B:57:0x014a, B:59:0x0152, B:60:0x015b, B:62:0x0168, B:64:0x016c, B:66:0x0170, B:68:0x0174, B:71:0x0179, B:73:0x017d, B:75:0x0185, B:76:0x018b, B:77:0x018c, B:79:0x0194, B:80:0x019d), top: B:111:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0168 A[Catch: all -> 0x01ef, TryCatch #8 {all -> 0x01ef, blocks: (B:28:0x00c9, B:30:0x00da, B:32:0x00e0, B:34:0x00f4, B:35:0x00f8, B:36:0x00ff, B:37:0x0100, B:55:0x0145, B:57:0x014a, B:59:0x0152, B:60:0x015b, B:62:0x0168, B:64:0x016c, B:66:0x0170, B:68:0x0174, B:71:0x0179, B:73:0x017d, B:75:0x0185, B:76:0x018b, B:77:0x018c, B:79:0x0194, B:80:0x019d), top: B:111:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ec A[RETURN] */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean createExtensionSession(androidx.camera.camera2.pipe.compat.ExtensionSessionConfigData r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraDevice.createExtensionSession(androidx.camera.camera2.pipe.compat.ExtensionSessionConfigData):boolean");
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public CaptureRequest.Builder createReprocessCaptureRequest(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Builder builderCreateReprocessCaptureRequest;
        x.f(totalCaptureResult, "inputResult");
        Debug debug = Debug.INSTANCE;
        String strValueOf = String.valueOf(mo985getCameraIdDz_R5H8());
        long jMo1117nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
        String strConcat = "CXCP#createReprocessCaptureRequest-".concat(strValueOf);
        try {
            Trace.beginSection(strConcat);
            String strMo985getCameraIdDz_R5H8 = mo985getCameraIdDz_R5H8();
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            try {
                builderCreateReprocessCaptureRequest = this.cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
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
                builderCreateReprocessCaptureRequest = null;
            }
            Trace.endSection();
            long jMo1117nowvQl9yQU2 = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
            h.o.c cVar = h.o.a.f48264a;
            long j2 = h.o.c.j(jMo1117nowvQl9yQU2 - jMo1117nowvQl9yQU, h.o.d.f48270a);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, f.a(true, false, null, "%.3f ms", j2, strConcat));
            }
            return builderCreateReprocessCaptureRequest;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7 A[Catch: all -> 0x015d, TryCatch #5 {all -> 0x015d, blocks: (B:18:0x0089, B:31:0x00b2, B:33:0x00b7, B:35:0x00bf, B:36:0x00c8, B:39:0x00d6, B:41:0x00da, B:43:0x00de, B:45:0x00e2, B:48:0x00e7, B:50:0x00eb, B:52:0x00f3, B:53:0x00f9, B:54:0x00fa, B:56:0x0102, B:57:0x010b), top: B:84:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6 A[Catch: all -> 0x015d, TryCatch #5 {all -> 0x015d, blocks: (B:18:0x0089, B:31:0x00b2, B:33:0x00b7, B:35:0x00bf, B:36:0x00c8, B:39:0x00d6, B:41:0x00da, B:43:0x00de, B:45:0x00e2, B:48:0x00e7, B:50:0x00eb, B:52:0x00f3, B:53:0x00f9, B:54:0x00fa, B:56:0x0102, B:57:0x010b), top: B:84:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015c A[RETURN] */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean createReprocessableCaptureSession(android.hardware.camera2.params.InputConfiguration r22, java.util.List<? extends android.view.Surface> r23, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraDevice.createReprocessableCaptureSession(android.hardware.camera2.params.InputConfiguration, java.util.List, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper$StateCallback):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0102 A[Catch: all -> 0x01af, TryCatch #6 {all -> 0x01af, blocks: (B:22:0x00cc, B:37:0x00fd, B:39:0x0102, B:41:0x010a, B:42:0x0113, B:45:0x0121, B:47:0x0125, B:49:0x0129, B:51:0x012d, B:54:0x0132, B:56:0x0136, B:58:0x013e, B:59:0x0144, B:60:0x0145, B:62:0x014d, B:63:0x0156), top: B:87:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121 A[Catch: all -> 0x01af, TryCatch #6 {all -> 0x01af, blocks: (B:22:0x00cc, B:37:0x00fd, B:39:0x0102, B:41:0x010a, B:42:0x0113, B:45:0x0121, B:47:0x0125, B:49:0x0129, B:51:0x012d, B:54:0x0132, B:56:0x0136, B:58:0x013e, B:59:0x0144, B:60:0x0145, B:62:0x014d, B:63:0x0156), top: B:87:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ae A[RETURN] */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean createReprocessableCaptureSessionByConfigurations(androidx.camera.camera2.pipe.compat.InputConfigData r22, java.util.List<? extends androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper> r23, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraDevice.createReprocessableCaptureSessionByConfigurations(androidx.camera.camera2.pipe.compat.InputConfigData, java.util.List, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper$StateCallback):boolean");
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /* renamed from: getCameraAudioRestriction-_b5Q8KE, reason: not valid java name */
    public int mo984getCameraAudioRestriction_b5Q8KE() {
        try {
            Trace.beginSection("getCameraAudioRestriction");
            return Api30Compat.getCameraAudioRestriction(this.cameraDevice);
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
    public String mo985getCameraIdDz_R5H8() {
        return this.cameraId;
    }

    @Override // androidx.camera.camera2.pipe.compat.AudioRestrictionController.Listener
    /* renamed from: onCameraAudioRestrictionUpdated-LwUUkyU, reason: not valid java name */
    public void mo986onCameraAudioRestrictionUpdatedLwUUkyU(int i2) {
        try {
            Trace.beginSection("setCameraAudioRestriction");
            String strMo985getCameraIdDz_R5H8 = mo985getCameraIdDz_R5H8();
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            try {
                Api30Compat.setCameraAudioRestriction(this.cameraDevice, i2);
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
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public void onDeviceClosed() {
        if (!this.closed.c()) {
            throw new IllegalStateException("Check failed.");
        }
        SessionStateCallback sessionStateCallback = (SessionStateCallback) this._lastStateCallback.a(null);
        if (sessionStateCallback != null) {
            onSessionFinalizedWithTrace(sessionStateCallback);
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public void onDeviceClosing() {
        SessionStateCallback sessionStateCallback;
        if (!this.closed.b(false, true) || (sessionStateCallback = (SessionStateCallback) this._lastStateCallback.b()) == null) {
            return;
        }
        onSessionDisconnectedWithTrace(sessionStateCallback);
    }

    public String toString() {
        return "AndroidCameraDevice(camera=" + CameraId.m552toStringimpl(mo985getCameraIdDz_R5H8()) + ")";
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (!x.n(cls, CameraDevice.class)) {
            return null;
        }
        Object obj = this.cameraDevice;
        x.d(obj, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.compat.AndroidCameraDevice.unwrapAs");
        return (T) obj;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }

    public /* synthetic */ AndroidCameraDevice(CameraMetadata cameraMetadata, CameraDevice cameraDevice, String str, CameraErrorListener cameraErrorListener, CameraInterop.CaptureSessionListener captureSessionListener, Threads threads, o oVar) {
        this(cameraMetadata, cameraDevice, str, cameraErrorListener, captureSessionListener, threads);
    }

    public /* synthetic */ AndroidCameraDevice(CameraMetadata cameraMetadata, CameraDevice cameraDevice, String str, CameraErrorListener cameraErrorListener, CameraInterop.CaptureSessionListener captureSessionListener, Threads threads, int i2, o oVar) {
        this(cameraMetadata, cameraDevice, str, cameraErrorListener, (i2 & 16) != 0 ? null : captureSessionListener, threads, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0 A[Catch: all -> 0x0156, TryCatch #1 {all -> 0x0156, blocks: (B:18:0x0082, B:31:0x00ab, B:33:0x00b0, B:35:0x00b8, B:36:0x00c1, B:39:0x00cf, B:41:0x00d3, B:43:0x00d7, B:45:0x00db, B:48:0x00e0, B:50:0x00e4, B:52:0x00ec, B:53:0x00f2, B:54:0x00f3, B:56:0x00fb, B:57:0x0104), top: B:82:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf A[Catch: all -> 0x0156, TryCatch #1 {all -> 0x0156, blocks: (B:18:0x0082, B:31:0x00ab, B:33:0x00b0, B:35:0x00b8, B:36:0x00c1, B:39:0x00cf, B:41:0x00d3, B:43:0x00d7, B:45:0x00db, B:48:0x00e0, B:50:0x00e4, B:52:0x00ec, B:53:0x00f2, B:54:0x00f3, B:56:0x00fb, B:57:0x0104), top: B:82:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155 A[RETURN] */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean createCaptureSession(java.util.List<? extends android.view.Surface> r21, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraDevice.createCaptureSession(java.util.List, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper$StateCallback):boolean");
    }
}
