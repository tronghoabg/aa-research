package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser;
import androidx.camera.camera2.pipe.CameraPipe;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseSurfaceManager_Factory implements c<UseCaseSurfaceManager> {
    private final e<CameraPipe> cameraPipeProvider;
    private final e<InactiveSurfaceCloser> inactiveSurfaceCloserProvider;
    private final e<SessionConfigAdapter> sessionConfigAdapterProvider;
    private final e<UseCaseThreads> threadsProvider;

    private UseCaseSurfaceManager_Factory(e<UseCaseThreads> eVar, e<CameraPipe> eVar2, e<InactiveSurfaceCloser> eVar3, e<SessionConfigAdapter> eVar4) {
        this.threadsProvider = eVar;
        this.cameraPipeProvider = eVar2;
        this.inactiveSurfaceCloserProvider = eVar3;
        this.sessionConfigAdapterProvider = eVar4;
    }

    public static UseCaseSurfaceManager_Factory create(e<UseCaseThreads> eVar, e<CameraPipe> eVar2, e<InactiveSurfaceCloser> eVar3, e<SessionConfigAdapter> eVar4) {
        return new UseCaseSurfaceManager_Factory(eVar, eVar2, eVar3, eVar4);
    }

    public static UseCaseSurfaceManager newInstance(UseCaseThreads useCaseThreads, CameraPipe cameraPipe, InactiveSurfaceCloser inactiveSurfaceCloser, SessionConfigAdapter sessionConfigAdapter) {
        return new UseCaseSurfaceManager(useCaseThreads, cameraPipe, inactiveSurfaceCloser, sessionConfigAdapter);
    }

    @Override // g.a.a, f.a.a
    public UseCaseSurfaceManager get() {
        return newInstance(this.threadsProvider.get(), this.cameraPipeProvider.get(), this.inactiveSurfaceCloserProvider.get(), this.sessionConfigAdapterProvider.get());
    }
}
