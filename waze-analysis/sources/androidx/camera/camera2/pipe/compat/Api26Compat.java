package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import android.view.Surface;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Api26Compat {
    public static final Api26Compat INSTANCE = new Api26Compat();

    private Api26Compat() {
    }

    public static final void addSurfaces(OutputConfiguration outputConfiguration, Surface surface) {
        x.f(outputConfiguration, "outputConfig");
        x.f(surface, "surface");
        outputConfiguration.addSurface(surface);
    }

    public static final void enableSurfaceSharing(OutputConfiguration outputConfiguration) {
        x.f(outputConfiguration, "outputConfig");
        outputConfiguration.enableSurfaceSharing();
    }

    public static final void finalizeOutputConfigurations(CameraCaptureSession cameraCaptureSession, List<OutputConfiguration> list) throws CameraAccessException {
        x.f(cameraCaptureSession, "cameraCaptureSession");
        x.f(list, "outputConfiguration");
        cameraCaptureSession.finalizeOutputConfigurations(list);
    }

    public static final List<Surface> getSurfaces(OutputConfiguration outputConfiguration) {
        x.f(outputConfiguration, "outputConfig");
        List<Surface> surfaces = outputConfiguration.getSurfaces();
        x.e(surfaces, "getSurfaces(...)");
        return surfaces;
    }

    public static final OutputConfiguration newOutputConfiguration(Size size, Class<?> cls) {
        x.f(size, "size");
        x.f(cls, "klass");
        return new OutputConfiguration(size, cls);
    }

    public static final void onCaptureQueueEmpty(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        x.f(cameraCaptureSession, "session");
        if (stateCallback != null) {
            stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
        }
    }
}
