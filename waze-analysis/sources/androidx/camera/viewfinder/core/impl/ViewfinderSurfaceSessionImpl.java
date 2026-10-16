package androidx.camera.viewfinder.core.impl;

import android.view.Surface;
import androidx.camera.viewfinder.core.ViewfinderSurfaceRequest;
import androidx.camera.viewfinder.core.ViewfinderSurfaceSession;
import h.ab;
import h.e.b;
import h.g.b.x;
import kotlinx.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ViewfinderSurfaceSessionImpl implements ViewfinderSurfaceSession {
    private final CloseGuardHelper closeGuard;
    private final a closed;
    private final h.g.a.a<ab> onClose;
    private final ViewfinderSurfaceRequest request;
    private final Surface surface;

    public ViewfinderSurfaceSessionImpl(Surface surface, ViewfinderSurfaceRequest viewfinderSurfaceRequest, h.g.a.a<ab> aVar) {
        x.f(surface, "surface");
        x.f(viewfinderSurfaceRequest, "request");
        x.f(aVar, "onClose");
        this.surface = surface;
        this.request = viewfinderSurfaceRequest;
        this.onClose = aVar;
        this.closed = b.e(false);
        CloseGuardHelper closeGuardHelperCreate = CloseGuardHelper.Companion.create();
        closeGuardHelperCreate.open("close");
        this.closeGuard = closeGuardHelperCreate;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.closeGuard.close();
        if (this.closed.d()) {
            return;
        }
        this.onClose.invoke();
    }

    protected final void finalize() {
        this.closeGuard.warnIfOpen();
        close();
    }

    @Override // androidx.camera.viewfinder.core.ViewfinderSurfaceSession
    public ViewfinderSurfaceRequest getRequest() {
        return this.request;
    }

    @Override // androidx.camera.viewfinder.core.ViewfinderSurfaceSession
    public Surface getSurface() {
        return this.surface;
    }
}
