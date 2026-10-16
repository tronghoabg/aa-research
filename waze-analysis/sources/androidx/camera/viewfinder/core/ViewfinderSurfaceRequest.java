package androidx.camera.viewfinder.core;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ViewfinderSurfaceRequest {
    private final int height;
    private final ImplementationMode implementationMode;
    private final String requestId;
    private final int width;

    public /* synthetic */ ViewfinderSurfaceRequest(int i2, int i3, ImplementationMode implementationMode, String str, int i4, o oVar) {
        this(i2, i3, (i4 & 4) != 0 ? null : implementationMode, (i4 & 8) != 0 ? null : str);
    }

    public static /* synthetic */ ViewfinderSurfaceRequest copy$default(ViewfinderSurfaceRequest viewfinderSurfaceRequest, int i2, int i3, ImplementationMode implementationMode, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = viewfinderSurfaceRequest.width;
        }
        if ((i4 & 2) != 0) {
            i3 = viewfinderSurfaceRequest.height;
        }
        if ((i4 & 4) != 0) {
            implementationMode = viewfinderSurfaceRequest.implementationMode;
        }
        if ((i4 & 8) != 0) {
            str = viewfinderSurfaceRequest.requestId;
        }
        return viewfinderSurfaceRequest.copy(i2, i3, implementationMode, str);
    }

    public final /* synthetic */ ViewfinderSurfaceRequest copy(int i2, int i3, ImplementationMode implementationMode, String str) {
        return new ViewfinderSurfaceRequest(i2, i3, implementationMode, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewfinderSurfaceRequest)) {
            return false;
        }
        ViewfinderSurfaceRequest viewfinderSurfaceRequest = (ViewfinderSurfaceRequest) obj;
        return this.width == viewfinderSurfaceRequest.width && this.height == viewfinderSurfaceRequest.height && this.implementationMode == viewfinderSurfaceRequest.implementationMode && x.n(this.requestId, viewfinderSurfaceRequest.requestId);
    }

    public final int getHeight() {
        return this.height;
    }

    public final ImplementationMode getImplementationMode() {
        return this.implementationMode;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        ImplementationMode implementationMode = this.implementationMode;
        int iHashCode = implementationMode != null ? implementationMode.hashCode() : 0;
        int i2 = this.width;
        int i3 = this.height;
        String str = this.requestId;
        return (((((i2 * 31) + i3) * 31) + iHashCode) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ViewfinderSurfaceRequest(width=" + this.width + ", height=" + this.height + ", implementationMode=" + this.implementationMode + ", requestId=" + this.requestId + ")";
    }

    public ViewfinderSurfaceRequest(int i2, int i3, ImplementationMode implementationMode) {
        this(i2, i3, implementationMode, null, 8, null);
    }

    public ViewfinderSurfaceRequest(int i2, int i3, ImplementationMode implementationMode, String str) {
        this.width = i2;
        this.height = i3;
        this.implementationMode = implementationMode;
        this.requestId = str;
    }

    public ViewfinderSurfaceRequest(int i2, int i3) {
        this(i2, i3, null, null, 12, null);
    }
}
