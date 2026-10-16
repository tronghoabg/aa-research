package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.graph.GraphListener;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RequestOpen extends CameraRequest {
    private final GraphListener graphListener;
    private final l<ab, Boolean> isForegroundObserver;
    private final boolean isPrewarm;
    private final List<CameraId> sharedCameraIds;
    private final VirtualCameraState virtualCamera;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RequestOpen(VirtualCameraState virtualCameraState, List<CameraId> list, GraphListener graphListener, boolean z, l<? super ab, Boolean> lVar) {
        super(null);
        x.f(virtualCameraState, "virtualCamera");
        x.f(list, "sharedCameraIds");
        x.f(graphListener, "graphListener");
        x.f(lVar, "isForegroundObserver");
        this.virtualCamera = virtualCameraState;
        this.sharedCameraIds = list;
        this.graphListener = graphListener;
        this.isPrewarm = z;
        this.isForegroundObserver = lVar;
    }

    public static /* synthetic */ RequestOpen copy$default(RequestOpen requestOpen, VirtualCameraState virtualCameraState, List list, GraphListener graphListener, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            virtualCameraState = requestOpen.virtualCamera;
        }
        if ((i2 & 2) != 0) {
            list = requestOpen.sharedCameraIds;
        }
        if ((i2 & 4) != 0) {
            graphListener = requestOpen.graphListener;
        }
        if ((i2 & 8) != 0) {
            z = requestOpen.isPrewarm;
        }
        if ((i2 & 16) != 0) {
            lVar = requestOpen.isForegroundObserver;
        }
        l lVar2 = lVar;
        GraphListener graphListener2 = graphListener;
        return requestOpen.copy(virtualCameraState, list, graphListener2, z, lVar2);
    }

    public final VirtualCameraState component1() {
        return this.virtualCamera;
    }

    public final List<CameraId> component2() {
        return this.sharedCameraIds;
    }

    public final GraphListener component3() {
        return this.graphListener;
    }

    public final boolean component4() {
        return this.isPrewarm;
    }

    public final l<ab, Boolean> component5() {
        return this.isForegroundObserver;
    }

    public final RequestOpen copy(VirtualCameraState virtualCameraState, List<CameraId> list, GraphListener graphListener, boolean z, l<? super ab, Boolean> lVar) {
        x.f(virtualCameraState, "virtualCamera");
        x.f(list, "sharedCameraIds");
        x.f(graphListener, "graphListener");
        x.f(lVar, "isForegroundObserver");
        return new RequestOpen(virtualCameraState, list, graphListener, z, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestOpen)) {
            return false;
        }
        RequestOpen requestOpen = (RequestOpen) obj;
        return x.n(this.virtualCamera, requestOpen.virtualCamera) && x.n(this.sharedCameraIds, requestOpen.sharedCameraIds) && x.n(this.graphListener, requestOpen.graphListener) && this.isPrewarm == requestOpen.isPrewarm && x.n(this.isForegroundObserver, requestOpen.isForegroundObserver);
    }

    public final GraphListener getGraphListener() {
        return this.graphListener;
    }

    public final List<CameraId> getSharedCameraIds() {
        return this.sharedCameraIds;
    }

    public final VirtualCameraState getVirtualCamera() {
        return this.virtualCamera;
    }

    public int hashCode() {
        return (((((((this.virtualCamera.hashCode() * 31) + this.sharedCameraIds.hashCode()) * 31) + this.graphListener.hashCode()) * 31) + RequestOpen$$ExternalSyntheticBackport0.m(this.isPrewarm)) * 31) + this.isForegroundObserver.hashCode();
    }

    public final l<ab, Boolean> isForegroundObserver() {
        return this.isForegroundObserver;
    }

    public final boolean isPrewarm() {
        return this.isPrewarm;
    }

    public String toString() {
        return "RequestOpen(virtualCamera=" + this.virtualCamera + ", sharedCameraIds=" + this.sharedCameraIds + ", graphListener=" + this.graphListener + ", isPrewarm=" + this.isPrewarm + ", isForegroundObserver=" + this.isForegroundObserver + ")";
    }
}
