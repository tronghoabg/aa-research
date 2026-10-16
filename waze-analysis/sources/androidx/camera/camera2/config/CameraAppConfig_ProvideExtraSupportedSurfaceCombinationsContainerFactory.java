package androidx.camera.camera2.config;

import androidx.camera.camera2.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import androidx.camera.core.CameraXConfig;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraAppConfig_ProvideExtraSupportedSurfaceCombinationsContainerFactory implements c<ExtraSupportedSurfaceCombinationsContainer> {
    private final e<CameraXConfig> cameraXConfigProvider;
    private final CameraAppConfig module;

    private CameraAppConfig_ProvideExtraSupportedSurfaceCombinationsContainerFactory(CameraAppConfig cameraAppConfig, e<CameraXConfig> eVar) {
        this.module = cameraAppConfig;
        this.cameraXConfigProvider = eVar;
    }

    public static CameraAppConfig_ProvideExtraSupportedSurfaceCombinationsContainerFactory create(CameraAppConfig cameraAppConfig, e<CameraXConfig> eVar) {
        return new CameraAppConfig_ProvideExtraSupportedSurfaceCombinationsContainerFactory(cameraAppConfig, eVar);
    }

    public static ExtraSupportedSurfaceCombinationsContainer provideExtraSupportedSurfaceCombinationsContainer(CameraAppConfig cameraAppConfig, CameraXConfig cameraXConfig) {
        return cameraAppConfig.provideExtraSupportedSurfaceCombinationsContainer(cameraXConfig);
    }

    @Override // g.a.a, f.a.a
    public ExtraSupportedSurfaceCombinationsContainer get() {
        return provideExtraSupportedSurfaceCombinationsContainer(this.module, this.cameraXConfigProvider.get());
    }
}
