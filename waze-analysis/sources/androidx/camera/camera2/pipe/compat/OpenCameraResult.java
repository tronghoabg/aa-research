package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraError;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class OpenCameraResult {
    private final AndroidCameraState cameraState;
    private final CameraError errorCode;

    public /* synthetic */ OpenCameraResult(AndroidCameraState androidCameraState, CameraError cameraError, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : androidCameraState, (i2 & 2) != 0 ? null : cameraError, null);
    }

    /* renamed from: copy-8d-yNqA$default, reason: not valid java name */
    public static /* synthetic */ OpenCameraResult m1086copy8dyNqA$default(OpenCameraResult openCameraResult, AndroidCameraState androidCameraState, CameraError cameraError, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            androidCameraState = openCameraResult.cameraState;
        }
        if ((i2 & 2) != 0) {
            cameraError = openCameraResult.errorCode;
        }
        return openCameraResult.m1088copy8dyNqA(androidCameraState, cameraError);
    }

    public final AndroidCameraState component1() {
        return this.cameraState;
    }

    /* renamed from: component2-mVEW8x0, reason: not valid java name */
    public final CameraError m1087component2mVEW8x0() {
        return this.errorCode;
    }

    /* renamed from: copy-8d-yNqA, reason: not valid java name */
    public final OpenCameraResult m1088copy8dyNqA(AndroidCameraState androidCameraState, CameraError cameraError) {
        return new OpenCameraResult(androidCameraState, cameraError, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenCameraResult)) {
            return false;
        }
        OpenCameraResult openCameraResult = (OpenCameraResult) obj;
        return x.n(this.cameraState, openCameraResult.cameraState) && x.n(this.errorCode, openCameraResult.errorCode);
    }

    public final AndroidCameraState getCameraState() {
        return this.cameraState;
    }

    /* renamed from: getErrorCode-mVEW8x0, reason: not valid java name */
    public final CameraError m1089getErrorCodemVEW8x0() {
        return this.errorCode;
    }

    public int hashCode() {
        AndroidCameraState androidCameraState = this.cameraState;
        int iHashCode = androidCameraState == null ? 0 : androidCameraState.hashCode();
        CameraError cameraError = this.errorCode;
        return (iHashCode * 31) + (cameraError != null ? cameraError.m478unboximpl() : 0);
    }

    public String toString() {
        return "OpenCameraResult(cameraState=" + this.cameraState + ", errorCode=" + this.errorCode + ")";
    }

    public /* synthetic */ OpenCameraResult(AndroidCameraState androidCameraState, CameraError cameraError, o oVar) {
        this(androidCameraState, cameraError);
    }

    private OpenCameraResult(AndroidCameraState androidCameraState, CameraError cameraError) {
        this.cameraState = androidCameraState;
        this.errorCode = cameraError;
    }
}
