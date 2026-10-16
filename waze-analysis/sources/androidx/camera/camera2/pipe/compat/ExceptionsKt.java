package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExceptionsKt {
    /* renamed from: catchAndReportCameraExceptions-RzXb1QE, reason: not valid java name */
    public static final <T> T m1082catchAndReportCameraExceptionsRzXb1QE(String str, CameraErrorListener cameraErrorListener, h.g.a.a<? extends T> aVar) throws Exception {
        x.f(str, "cameraId");
        x.f(cameraErrorListener, "cameraErrorListener");
        x.f(aVar, "block");
        try {
            return aVar.invoke();
        } catch (Exception e2) {
            if (e2 instanceof CameraAccessException) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Failed to execute call: Camera encountered an error: ".concat(String.valueOf(e2.getMessage())));
                }
                cameraErrorListener.mo1038onCameraError3M5Xam4(str, CameraError.Companion.m480fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e2), true);
                return null;
            }
            if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Failed to execute call: Unexpected exception: ".concat(String.valueOf(e2.getMessage())));
                }
                cameraErrorListener.mo1038onCameraError3M5Xam4(str, CameraError.Companion.m491getERROR_GRAPH_CONFIGv7Vf74A(), false);
                return null;
            }
            if (!(e2 instanceof IllegalStateException)) {
                throw e2;
            }
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, "Failed to execute call: Camera may be closed");
            }
            return null;
        }
    }
}
