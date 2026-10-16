package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Trace;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Log;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraDeviceWrapperKt {
    public static final void closeWithTrace(CameraDevice cameraDevice) {
        if (cameraDevice == null) {
            return;
        }
        if (Log.INSTANCE.getINFO_LOGGABLE()) {
            android.util.Log.i(Log.TAG, "Closing Camera ".concat(String.valueOf(cameraDevice.getId())));
        }
        Debug debug = Debug.INSTANCE;
        String str = "CXCP#CameraDevice-" + cameraDevice.getId() + "#close";
        long jMo1117nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
        try {
            Trace.beginSection(str);
            try {
                cameraDevice.close();
            } catch (NullPointerException e2) {
                NullPointerException nullPointerException = e2;
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "NPE encountered during CameraDevice.close()", nullPointerException);
                }
            }
            Trace.endSection();
            long jMo1117nowvQl9yQU2 = debug.getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
            h.o.c cVar = h.o.a.f48264a;
            long j2 = h.o.c.j(jMo1117nowvQl9yQU2 - jMo1117nowvQl9yQU, h.o.d.f48270a);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, f.a(true, false, null, "%.3f ms", j2, str));
            }
        } finally {
        }
    }
}
