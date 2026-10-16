package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2DeviceSetup implements Camera2DeviceSetupWrapper {
    private final CameraDevice.CameraDeviceSetup cameraDeviceSetup;
    private final CameraErrorListener cameraErrorListener;
    private final String cameraId;

    private Camera2DeviceSetup(CameraDevice.CameraDeviceSetup cameraDeviceSetup, String str, CameraErrorListener cameraErrorListener) {
        x.f(cameraDeviceSetup, "cameraDeviceSetup");
        x.f(str, "cameraId");
        x.f(cameraErrorListener, "cameraErrorListener");
        this.cameraDeviceSetup = cameraDeviceSetup;
        this.cameraId = str;
        this.cameraErrorListener = cameraErrorListener;
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2DeviceSetupWrapper
    public CaptureRequest.Builder createCaptureRequest(int i2) throws Exception {
        try {
            return this.cameraDeviceSetup.createCaptureRequest(i2);
        } catch (Exception e2) {
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            String str = this.cameraId;
            if (e2 instanceof CameraAccessException) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Failed to execute call: Camera encountered an error: ".concat(String.valueOf(e2.getMessage())));
                }
                cameraErrorListener.mo1038onCameraError3M5Xam4(str, CameraError.Companion.m480fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e2), true);
            } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Failed to execute call: Unexpected exception: ".concat(String.valueOf(e2.getMessage())));
                }
                cameraErrorListener.mo1038onCameraError3M5Xam4(str, CameraError.Companion.m491getERROR_GRAPH_CONFIGv7Vf74A(), false);
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

    public /* synthetic */ Camera2DeviceSetup(CameraDevice.CameraDeviceSetup cameraDeviceSetup, String str, CameraErrorListener cameraErrorListener, o oVar) {
        this(cameraDeviceSetup, str, cameraErrorListener);
    }
}
