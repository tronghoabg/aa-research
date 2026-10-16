package androidx.camera.camera2.adapter;

import androidx.camera.camera2.config.CameraConfig;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraInternalAdapter_Factory implements c<CameraInternalAdapter> {
    private final e<CameraControlInternal> cameraControllerProvider;
    private final e<CameraInfoInternal> cameraInfoProvider;
    private final e<CameraStateAdapter> cameraStateAdapterProvider;
    private final e<CameraConfig> configProvider;
    private final e<UseCaseThreads> threadsProvider;
    private final e<UseCaseManager> useCaseManagerProvider;

    private CameraInternalAdapter_Factory(e<CameraConfig> eVar, e<UseCaseManager> eVar2, e<CameraInfoInternal> eVar3, e<CameraControlInternal> eVar4, e<UseCaseThreads> eVar5, e<CameraStateAdapter> eVar6) {
        this.configProvider = eVar;
        this.useCaseManagerProvider = eVar2;
        this.cameraInfoProvider = eVar3;
        this.cameraControllerProvider = eVar4;
        this.threadsProvider = eVar5;
        this.cameraStateAdapterProvider = eVar6;
    }

    public static CameraInternalAdapter_Factory create(e<CameraConfig> eVar, e<UseCaseManager> eVar2, e<CameraInfoInternal> eVar3, e<CameraControlInternal> eVar4, e<UseCaseThreads> eVar5, e<CameraStateAdapter> eVar6) {
        return new CameraInternalAdapter_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static CameraInternalAdapter newInstance(CameraConfig cameraConfig, UseCaseManager useCaseManager, CameraInfoInternal cameraInfoInternal, CameraControlInternal cameraControlInternal, UseCaseThreads useCaseThreads, CameraStateAdapter cameraStateAdapter) {
        return new CameraInternalAdapter(cameraConfig, useCaseManager, cameraInfoInternal, cameraControlInternal, useCaseThreads, cameraStateAdapter);
    }

    @Override // g.a.a, f.a.a
    public CameraInternalAdapter get() {
        return newInstance(this.configProvider.get(), this.useCaseManagerProvider.get(), this.cameraInfoProvider.get(), this.cameraControllerProvider.get(), this.threadsProvider.get(), this.cameraStateAdapterProvider.get());
    }
}
