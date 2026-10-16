package androidx.camera.camera2.pipe;

import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ConcurrentCameraGraphs {
    private final Set<CameraGraphId> cameraGraphIds;
    private final Set<CameraId> cameraIds;

    public ConcurrentCameraGraphs(Set<CameraGraphId> set, Set<CameraId> set2) {
        x.f(set, "cameraGraphIds");
        x.f(set2, "cameraIds");
        this.cameraGraphIds = set;
        this.cameraIds = set2;
        if (set.size() <= 1) {
            throw new IllegalStateException("Check failed.");
        }
        if (set.size() != set2.size()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConcurrentCameraGraphs copy$default(ConcurrentCameraGraphs concurrentCameraGraphs, Set set, Set set2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            set = concurrentCameraGraphs.cameraGraphIds;
        }
        if ((i2 & 2) != 0) {
            set2 = concurrentCameraGraphs.cameraIds;
        }
        return concurrentCameraGraphs.copy(set, set2);
    }

    public final Set<CameraGraphId> component1() {
        return this.cameraGraphIds;
    }

    public final Set<CameraId> component2() {
        return this.cameraIds;
    }

    public final ConcurrentCameraGraphs copy(Set<CameraGraphId> set, Set<CameraId> set2) {
        x.f(set, "cameraGraphIds");
        x.f(set2, "cameraIds");
        return new ConcurrentCameraGraphs(set, set2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConcurrentCameraGraphs)) {
            return false;
        }
        ConcurrentCameraGraphs concurrentCameraGraphs = (ConcurrentCameraGraphs) obj;
        return x.n(this.cameraGraphIds, concurrentCameraGraphs.cameraGraphIds) && x.n(this.cameraIds, concurrentCameraGraphs.cameraIds);
    }

    public final Set<CameraGraphId> getCameraGraphIds() {
        return this.cameraGraphIds;
    }

    public final Set<CameraId> getCameraIds() {
        return this.cameraIds;
    }

    public int hashCode() {
        return (this.cameraGraphIds.hashCode() * 31) + this.cameraIds.hashCode();
    }

    public String toString() {
        return "ConcurrentCameraGraphs(cameraGraphIds=" + this.cameraGraphIds + ", cameraIds=" + this.cameraIds + ")";
    }
}
