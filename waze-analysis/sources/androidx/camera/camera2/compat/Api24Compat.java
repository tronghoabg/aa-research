package androidx.camera.camera2.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Api24Compat {
    public static final Api24Compat INSTANCE = new Api24Compat();

    private Api24Compat() {
    }

    public static final void onCaptureBufferLost(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j2) {
        x.f(captureCallback, "callback");
        x.f(cameraCaptureSession, "session");
        x.f(captureRequest, "request");
        x.f(surface, "surface");
        captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j2);
    }
}
