package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Api24Compat {
    public static final Api24Compat INSTANCE = new Api24Compat();

    private Api24Compat() {
    }

    public static final void createCaptureSessionByOutputConfigurations(CameraDevice cameraDevice, List<OutputConfiguration> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        x.f(cameraDevice, "cameraDevice");
        x.f(list, "outputConfig");
        x.f(stateCallback, "stateCallback");
        cameraDevice.createCaptureSessionByOutputConfigurations(list, stateCallback, handler);
    }

    public static final void createReprocessableCaptureSessionByConfigurations(CameraDevice cameraDevice, InputConfiguration inputConfiguration, List<OutputConfiguration> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        x.f(cameraDevice, "cameraDevice");
        x.f(inputConfiguration, "inputConfig");
        x.f(list, "outputs");
        x.f(stateCallback, "stateCallback");
        cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, list, stateCallback, handler);
    }

    public static final int getSurfaceGroupId(OutputConfiguration outputConfiguration) {
        x.f(outputConfiguration, "outputConfiguration");
        return outputConfiguration.getSurfaceGroupId();
    }
}
