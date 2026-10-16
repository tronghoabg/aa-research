package androidx.camera.camera2.pipe.compat;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AwaitOpenCameraResult {
    private final AndroidCameraState androidCameraState;
    private final CameraDeviceWrapper cameraDeviceWrapper;

    public /* synthetic */ AwaitOpenCameraResult(CameraDeviceWrapper cameraDeviceWrapper, AndroidCameraState androidCameraState, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : cameraDeviceWrapper, (i2 & 2) != 0 ? null : androidCameraState);
    }

    public static /* synthetic */ AwaitOpenCameraResult copy$default(AwaitOpenCameraResult awaitOpenCameraResult, CameraDeviceWrapper cameraDeviceWrapper, AndroidCameraState androidCameraState, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cameraDeviceWrapper = awaitOpenCameraResult.cameraDeviceWrapper;
        }
        if ((i2 & 2) != 0) {
            androidCameraState = awaitOpenCameraResult.androidCameraState;
        }
        return awaitOpenCameraResult.copy(cameraDeviceWrapper, androidCameraState);
    }

    public final CameraDeviceWrapper component1() {
        return this.cameraDeviceWrapper;
    }

    public final AndroidCameraState component2() {
        return this.androidCameraState;
    }

    public final AwaitOpenCameraResult copy(CameraDeviceWrapper cameraDeviceWrapper, AndroidCameraState androidCameraState) {
        return new AwaitOpenCameraResult(cameraDeviceWrapper, androidCameraState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwaitOpenCameraResult)) {
            return false;
        }
        AwaitOpenCameraResult awaitOpenCameraResult = (AwaitOpenCameraResult) obj;
        return x.n(this.cameraDeviceWrapper, awaitOpenCameraResult.cameraDeviceWrapper) && x.n(this.androidCameraState, awaitOpenCameraResult.androidCameraState);
    }

    public final AndroidCameraState getAndroidCameraState() {
        return this.androidCameraState;
    }

    public final CameraDeviceWrapper getCameraDeviceWrapper() {
        return this.cameraDeviceWrapper;
    }

    public int hashCode() {
        CameraDeviceWrapper cameraDeviceWrapper = this.cameraDeviceWrapper;
        int iHashCode = cameraDeviceWrapper == null ? 0 : cameraDeviceWrapper.hashCode();
        AndroidCameraState androidCameraState = this.androidCameraState;
        return (iHashCode * 31) + (androidCameraState != null ? androidCameraState.hashCode() : 0);
    }

    public String toString() {
        return "AwaitOpenCameraResult(cameraDeviceWrapper=" + this.cameraDeviceWrapper + ", androidCameraState=" + this.androidCameraState + ")";
    }

    public AwaitOpenCameraResult(CameraDeviceWrapper cameraDeviceWrapper, AndroidCameraState androidCameraState) {
        this.cameraDeviceWrapper = cameraDeviceWrapper;
        this.androidCameraState = androidCameraState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AwaitOpenCameraResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
