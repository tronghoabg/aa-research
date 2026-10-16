package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Api30Compat {
    public static final Api30Compat INSTANCE = new Api30Compat();

    private Api30Compat() {
    }

    public static final int getCameraAudioRestriction(CameraDevice cameraDevice) {
        x.f(cameraDevice, "cameraDevice");
        return cameraDevice.getCameraAudioRestriction();
    }

    public static final Set<Set<String>> getConcurrentCameraIds(CameraManager cameraManager) throws CameraAccessException {
        x.f(cameraManager, "cameraManager");
        Set<Set<String>> concurrentCameraIds = cameraManager.getConcurrentCameraIds();
        x.e(concurrentCameraIds, "getConcurrentCameraIds(...)");
        return concurrentCameraIds;
    }

    public static final void setCameraAudioRestriction(CameraDevice cameraDevice, int i2) throws CameraAccessException {
        x.f(cameraDevice, "cameraDevice");
        cameraDevice.setCameraAudioRestriction(i2);
    }
}
