package androidx.camera.camera2.pipe.compat;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraStateOpen extends CameraState {
    private final CameraDeviceWrapper cameraDevice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraStateOpen(CameraDeviceWrapper cameraDeviceWrapper) {
        super(null);
        x.f(cameraDeviceWrapper, "cameraDevice");
        this.cameraDevice = cameraDeviceWrapper;
    }

    public static /* synthetic */ CameraStateOpen copy$default(CameraStateOpen cameraStateOpen, CameraDeviceWrapper cameraDeviceWrapper, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cameraDeviceWrapper = cameraStateOpen.cameraDevice;
        }
        return cameraStateOpen.copy(cameraDeviceWrapper);
    }

    public final CameraDeviceWrapper component1() {
        return this.cameraDevice;
    }

    public final CameraStateOpen copy(CameraDeviceWrapper cameraDeviceWrapper) {
        x.f(cameraDeviceWrapper, "cameraDevice");
        return new CameraStateOpen(cameraDeviceWrapper);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CameraStateOpen) && x.n(this.cameraDevice, ((CameraStateOpen) obj).cameraDevice);
    }

    public final CameraDeviceWrapper getCameraDevice() {
        return this.cameraDevice;
    }

    public int hashCode() {
        return this.cameraDevice.hashCode();
    }

    public String toString() {
        return "CameraStateOpen(cameraDevice=" + this.cameraDevice + ")";
    }
}
