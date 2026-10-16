package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.core.impl.DeferrableSurface;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NoOpInactiveSurfaceCloser implements InactiveSurfaceCloser {
    public static final NoOpInactiveSurfaceCloser INSTANCE = new NoOpInactiveSurfaceCloser();

    private NoOpInactiveSurfaceCloser() {
    }

    @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
    /* renamed from: configure-hB7JTeY */
    public void mo225configurehB7JTeY(int i2, DeferrableSurface deferrableSurface, CameraGraph cameraGraph) {
        x.f(deferrableSurface, "deferrableSurface");
        x.f(cameraGraph, "graph");
    }

    @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
    public void onSurfaceInactive(DeferrableSurface deferrableSurface) {
        x.f(deferrableSurface, "deferrableSurface");
    }

    @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
    public void closeAll() {
    }
}
