package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraCaptureSessionWrapper extends UnsafeWrapper, AutoCloseable {

    /* compiled from: WazeSource */
    public interface StateCallback extends SessionStateCallback {
        void onActive(CameraCaptureSessionWrapper cameraCaptureSessionWrapper);

        void onCaptureQueueEmpty(CameraCaptureSessionWrapper cameraCaptureSessionWrapper);

        void onClosed(CameraCaptureSessionWrapper cameraCaptureSessionWrapper);

        void onConfigureFailed(CameraCaptureSessionWrapper cameraCaptureSessionWrapper);

        void onConfigured(CameraCaptureSessionWrapper cameraCaptureSessionWrapper);

        void onReady(CameraCaptureSessionWrapper cameraCaptureSessionWrapper);
    }

    boolean abortCaptures();

    Integer capture(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    Integer captureBurst(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    boolean finalizeOutputConfigurations(List<? extends OutputConfigurationWrapper> list);

    CameraDeviceWrapper getDevice();

    /* renamed from: getId-159jkk4 */
    int mo982getId159jkk4();

    Surface getInputSurface();

    boolean isReprocessable();

    Integer setRepeatingBurst(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    Integer setRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    boolean stopRepeating();
}
