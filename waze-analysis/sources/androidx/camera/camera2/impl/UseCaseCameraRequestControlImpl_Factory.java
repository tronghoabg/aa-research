package androidx.camera.camera2.impl;

import androidx.camera.camera2.config.UseCaseCameraContext;
import androidx.camera.core.CameraXConfig;
import c.b.c;
import c.b.e;
import g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseCameraRequestControlImpl_Factory implements c<UseCaseCameraRequestControlImpl> {
    private final e<CameraXConfig> cameraXConfigProvider;
    private final e<CapturePipeline> capturePipelineProvider;
    private final e<UseCaseThreads> threadsProvider;
    private final e<UseCaseCameraContext> useCaseCameraContextProvider;
    private final e<UseCaseCameraState> useCaseCameraStateProvider;
    private final e<UseCaseSurfaceManager> useCaseSurfaceManagerProvider;

    private UseCaseCameraRequestControlImpl_Factory(e<CapturePipeline> eVar, e<UseCaseCameraState> eVar2, e<UseCaseCameraContext> eVar3, e<UseCaseSurfaceManager> eVar4, e<UseCaseThreads> eVar5, e<CameraXConfig> eVar6) {
        this.capturePipelineProvider = eVar;
        this.useCaseCameraStateProvider = eVar2;
        this.useCaseCameraContextProvider = eVar3;
        this.useCaseSurfaceManagerProvider = eVar4;
        this.threadsProvider = eVar5;
        this.cameraXConfigProvider = eVar6;
    }

    public static UseCaseCameraRequestControlImpl_Factory create(e<CapturePipeline> eVar, e<UseCaseCameraState> eVar2, e<UseCaseCameraContext> eVar3, e<UseCaseSurfaceManager> eVar4, e<UseCaseThreads> eVar5, e<CameraXConfig> eVar6) {
        return new UseCaseCameraRequestControlImpl_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static UseCaseCameraRequestControlImpl newInstance(a<CapturePipeline> aVar, a<UseCaseCameraState> aVar2, UseCaseCameraContext useCaseCameraContext, a<UseCaseSurfaceManager> aVar3, UseCaseThreads useCaseThreads, CameraXConfig cameraXConfig) {
        return new UseCaseCameraRequestControlImpl(aVar, aVar2, useCaseCameraContext, aVar3, useCaseThreads, cameraXConfig);
    }

    @Override // g.a.a, f.a.a
    public UseCaseCameraRequestControlImpl get() {
        UseCaseCameraContext useCaseCameraContext = this.useCaseCameraContextProvider.get();
        UseCaseThreads useCaseThreads = this.threadsProvider.get();
        CameraXConfig cameraXConfig = this.cameraXConfigProvider.get();
        return newInstance(this.capturePipelineProvider, this.useCaseCameraStateProvider, useCaseCameraContext, this.useCaseSurfaceManagerProvider, useCaseThreads, cameraXConfig);
    }
}
