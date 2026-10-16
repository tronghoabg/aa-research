package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraError;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraStateClosing extends CameraState {
    private final CameraError cameraErrorCode;

    public /* synthetic */ CameraStateClosing(CameraError cameraError, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : cameraError, null);
    }

    /* renamed from: copy-TPqeGZw$default, reason: not valid java name */
    public static /* synthetic */ CameraStateClosing m1070copyTPqeGZw$default(CameraStateClosing cameraStateClosing, CameraError cameraError, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cameraError = cameraStateClosing.cameraErrorCode;
        }
        return cameraStateClosing.m1072copyTPqeGZw(cameraError);
    }

    /* renamed from: component1-mVEW8x0, reason: not valid java name */
    public final CameraError m1071component1mVEW8x0() {
        return this.cameraErrorCode;
    }

    /* renamed from: copy-TPqeGZw, reason: not valid java name */
    public final CameraStateClosing m1072copyTPqeGZw(CameraError cameraError) {
        return new CameraStateClosing(cameraError, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CameraStateClosing) && x.n(this.cameraErrorCode, ((CameraStateClosing) obj).cameraErrorCode);
    }

    /* renamed from: getCameraErrorCode-mVEW8x0, reason: not valid java name */
    public final CameraError m1073getCameraErrorCodemVEW8x0() {
        return this.cameraErrorCode;
    }

    public int hashCode() {
        CameraError cameraError = this.cameraErrorCode;
        if (cameraError == null) {
            return 0;
        }
        return cameraError.m478unboximpl();
    }

    public String toString() {
        return "CameraStateClosing(cameraErrorCode=" + this.cameraErrorCode + ")";
    }

    public /* synthetic */ CameraStateClosing(CameraError cameraError, o oVar) {
        this(cameraError);
    }

    private CameraStateClosing(CameraError cameraError) {
        super(null);
        this.cameraErrorCode = cameraError;
    }
}
