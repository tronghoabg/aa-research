package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureRequest;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraConstrainedHighSpeedCaptureSessionWrapper extends CameraCaptureSessionWrapper {
    List<CaptureRequest> createHighSpeedRequestList(CaptureRequest captureRequest);
}
