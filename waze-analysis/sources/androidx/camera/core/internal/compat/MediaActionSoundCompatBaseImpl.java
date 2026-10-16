package androidx.camera.core.internal.compat;

import android.hardware.Camera;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class MediaActionSoundCompatBaseImpl {
    private static final int SAMPLE_CAMERA_ID = 0;

    private MediaActionSoundCompatBaseImpl() {
    }

    static boolean mustPlayShutterSound() {
        Camera.CameraInfo cameraInfo;
        if (Camera.getNumberOfCameras() <= 0) {
            return false;
        }
        try {
            cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(0, cameraInfo);
        } catch (RuntimeException unused) {
        }
        return !cameraInfo.canDisableShutterSound;
    }
}
