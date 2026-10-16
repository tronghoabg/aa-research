package androidx.camera.camera2.adapter;

import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.config.UseCaseCameraContext;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.UseCaseThreads;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CaptureConfigAdapter_Factory implements c<CaptureConfigAdapter> {
    private final e<CameraProperties> cameraPropertiesProvider;
    private final e<TemplateParamsOverride> templateParamsOverrideProvider;
    private final e<UseCaseThreads> threadsProvider;
    private final e<UseCaseCameraContext> useCaseCameraContextProvider;
    private final e<ZslControl> zslControlProvider;

    private CaptureConfigAdapter_Factory(e<CameraProperties> eVar, e<UseCaseCameraContext> eVar2, e<ZslControl> eVar3, e<UseCaseThreads> eVar4, e<TemplateParamsOverride> eVar5) {
        this.cameraPropertiesProvider = eVar;
        this.useCaseCameraContextProvider = eVar2;
        this.zslControlProvider = eVar3;
        this.threadsProvider = eVar4;
        this.templateParamsOverrideProvider = eVar5;
    }

    public static CaptureConfigAdapter_Factory create(e<CameraProperties> eVar, e<UseCaseCameraContext> eVar2, e<ZslControl> eVar3, e<UseCaseThreads> eVar4, e<TemplateParamsOverride> eVar5) {
        return new CaptureConfigAdapter_Factory(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static CaptureConfigAdapter newInstance(CameraProperties cameraProperties, UseCaseCameraContext useCaseCameraContext, ZslControl zslControl, UseCaseThreads useCaseThreads, TemplateParamsOverride templateParamsOverride) {
        return new CaptureConfigAdapter(cameraProperties, useCaseCameraContext, zslControl, useCaseThreads, templateParamsOverride);
    }

    @Override // g.a.a, f.a.a
    public CaptureConfigAdapter get() {
        return newInstance(this.cameraPropertiesProvider.get(), this.useCaseCameraContextProvider.get(), this.zslControlProvider.get(), this.threadsProvider.get(), this.templateParamsOverrideProvider.get());
    }
}
