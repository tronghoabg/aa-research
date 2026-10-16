package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.config.UseCaseCameraContext;
import androidx.camera.core.impl.SessionProcessor;
import c.b.c;
import c.b.e;
import g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseCameraImpl_Factory implements c<UseCaseCameraImpl> {
    private final e<CapturePipeline> capturePipelineProvider;
    private final e<UseCaseCameraRequestControl> requestControlProvider;
    private final e<SessionConfigAdapter> sessionConfigAdapterProvider;
    private final e<SessionProcessor> sessionProcessorProvider;
    private final e<UseCaseThreads> threadsProvider;
    private final e<UseCaseCameraContext> useCaseCameraContextProvider;
    private final e<UseCaseSurfaceManager> useCaseSurfaceManagerProvider;

    private UseCaseCameraImpl_Factory(e<UseCaseCameraContext> eVar, e<UseCaseThreads> eVar2, e<SessionProcessor> eVar3, e<UseCaseCameraRequestControl> eVar4, e<UseCaseSurfaceManager> eVar5, e<SessionConfigAdapter> eVar6, e<CapturePipeline> eVar7) {
        this.useCaseCameraContextProvider = eVar;
        this.threadsProvider = eVar2;
        this.sessionProcessorProvider = eVar3;
        this.requestControlProvider = eVar4;
        this.useCaseSurfaceManagerProvider = eVar5;
        this.sessionConfigAdapterProvider = eVar6;
        this.capturePipelineProvider = eVar7;
    }

    public static UseCaseCameraImpl_Factory create(e<UseCaseCameraContext> eVar, e<UseCaseThreads> eVar2, e<SessionProcessor> eVar3, e<UseCaseCameraRequestControl> eVar4, e<UseCaseSurfaceManager> eVar5, e<SessionConfigAdapter> eVar6, e<CapturePipeline> eVar7) {
        return new UseCaseCameraImpl_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7);
    }

    public static UseCaseCameraImpl newInstance(UseCaseCameraContext useCaseCameraContext, UseCaseThreads useCaseThreads, SessionProcessor sessionProcessor, UseCaseCameraRequestControl useCaseCameraRequestControl, a<UseCaseSurfaceManager> aVar, a<SessionConfigAdapter> aVar2, a<CapturePipeline> aVar3) {
        return new UseCaseCameraImpl(useCaseCameraContext, useCaseThreads, sessionProcessor, useCaseCameraRequestControl, aVar, aVar2, aVar3);
    }

    @Override // g.a.a, f.a.a
    public UseCaseCameraImpl get() {
        return newInstance(this.useCaseCameraContextProvider.get(), this.threadsProvider.get(), this.sessionProcessorProvider.get(), this.requestControlProvider.get(), this.useCaseSurfaceManagerProvider, this.sessionConfigAdapterProvider, this.capturePipelineProvider);
    }
}
