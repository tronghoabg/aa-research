package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraDevice;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Camera2DeviceCloser {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2DeviceCloser$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void closeCamera$default(Camera2DeviceCloser camera2DeviceCloser, CameraDeviceWrapper cameraDeviceWrapper, CameraDevice cameraDevice, AndroidCameraState androidCameraState, AudioRestrictionController audioRestrictionController, boolean z, boolean z2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeCamera");
            }
            if (1 == (i2 & 1)) {
                cameraDeviceWrapper = null;
            }
            if ((i2 & 2) != 0) {
                cameraDevice = null;
            }
            camera2DeviceCloser.closeCamera(cameraDeviceWrapper, cameraDevice, androidCameraState, audioRestrictionController, z & ((i2 & 16) == 0), z2 & ((i2 & 32) == 0));
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
    }

    void closeCamera(CameraDeviceWrapper cameraDeviceWrapper, CameraDevice cameraDevice, AndroidCameraState androidCameraState, AudioRestrictionController audioRestrictionController, boolean z, boolean z2);
}
