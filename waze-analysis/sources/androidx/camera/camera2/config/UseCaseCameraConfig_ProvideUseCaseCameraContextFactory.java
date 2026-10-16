package androidx.camera.camera2.config;

import androidx.camera.camera2.adapter.CameraStateAdapter;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseCameraConfig_ProvideUseCaseCameraContextFactory implements c<UseCaseCameraContext> {
    private final e<CameraStateAdapter> cameraStateAdapterProvider;
    private final UseCaseCameraConfig module;

    private UseCaseCameraConfig_ProvideUseCaseCameraContextFactory(UseCaseCameraConfig useCaseCameraConfig, e<CameraStateAdapter> eVar) {
        this.module = useCaseCameraConfig;
        this.cameraStateAdapterProvider = eVar;
    }

    public static UseCaseCameraConfig_ProvideUseCaseCameraContextFactory create(UseCaseCameraConfig useCaseCameraConfig, e<CameraStateAdapter> eVar) {
        return new UseCaseCameraConfig_ProvideUseCaseCameraContextFactory(useCaseCameraConfig, eVar);
    }

    public static UseCaseCameraContext provideUseCaseCameraContext(UseCaseCameraConfig useCaseCameraConfig, CameraStateAdapter cameraStateAdapter) {
        return useCaseCameraConfig.provideUseCaseCameraContext(cameraStateAdapter);
    }

    @Override // g.a.a, f.a.a
    public UseCaseCameraContext get() {
        return provideUseCaseCameraContext(this.module, this.cameraStateAdapterProvider.get());
    }
}
