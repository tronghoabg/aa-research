package androidx.camera.camera2.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Api34Compat {
    public static final Api34Compat INSTANCE = new Api34Compat();

    private Api34Compat() {
    }

    public static final void onReadoutStarted(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j3) {
        x.f(captureCallback, "callback");
        x.f(cameraCaptureSession, "session");
        x.f(captureRequest, "request");
        captureCallback.onReadoutStarted(cameraCaptureSession, captureRequest, j2, j3);
    }

    public static final void setSettingsOverrideZoom(Map<CaptureRequest.Key<?>, Object> map) {
        x.f(map, "parameters");
        map.put(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
    }
}
