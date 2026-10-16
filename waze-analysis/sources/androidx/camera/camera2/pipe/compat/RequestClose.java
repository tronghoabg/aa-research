package androidx.camera.camera2.pipe.compat;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RequestClose extends CameraRequest {
    private final ActiveCamera activeCamera;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestClose(ActiveCamera activeCamera) {
        super(null);
        x.f(activeCamera, "activeCamera");
        this.activeCamera = activeCamera;
    }

    public static /* synthetic */ RequestClose copy$default(RequestClose requestClose, ActiveCamera activeCamera, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            activeCamera = requestClose.activeCamera;
        }
        return requestClose.copy(activeCamera);
    }

    public final ActiveCamera component1() {
        return this.activeCamera;
    }

    public final RequestClose copy(ActiveCamera activeCamera) {
        x.f(activeCamera, "activeCamera");
        return new RequestClose(activeCamera);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestClose) && x.n(this.activeCamera, ((RequestClose) obj).activeCamera);
    }

    public final ActiveCamera getActiveCamera() {
        return this.activeCamera;
    }

    public int hashCode() {
        return this.activeCamera.hashCode();
    }

    public String toString() {
        return "RequestClose(activeCamera=" + this.activeCamera + ")";
    }
}
