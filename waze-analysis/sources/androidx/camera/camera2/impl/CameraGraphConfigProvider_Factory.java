package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.ZslControl;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.config.CameraConfig;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.CameraXConfig;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraGraphConfigProvider_Factory implements c<CameraGraphConfigProvider> {
    private final e<CameraCallbackMap> callbackMapProvider;
    private final e<CameraConfig> cameraConfigProvider;
    private final e<CameraInteropStateCallbackRepository> cameraInteropStateCallbackRepositoryProvider;
    private final e<CameraMetadata> cameraMetadataProvider;
    private final e<CameraQuirks> cameraQuirksProvider;
    private final e<CameraXConfig> cameraXConfigProvider;
    private final e<ComboRequestListener> requestListenerProvider;
    private final e<TemplateParamsOverride> templateParamsOverrideProvider;
    private final e<ZslControl> zslControlProvider;

    private CameraGraphConfigProvider_Factory(e<CameraCallbackMap> eVar, e<ComboRequestListener> eVar2, e<CameraConfig> eVar3, e<CameraQuirks> eVar4, e<ZslControl> eVar5, e<TemplateParamsOverride> eVar6, e<CameraMetadata> eVar7, e<CameraXConfig> eVar8, e<CameraInteropStateCallbackRepository> eVar9) {
        this.callbackMapProvider = eVar;
        this.requestListenerProvider = eVar2;
        this.cameraConfigProvider = eVar3;
        this.cameraQuirksProvider = eVar4;
        this.zslControlProvider = eVar5;
        this.templateParamsOverrideProvider = eVar6;
        this.cameraMetadataProvider = eVar7;
        this.cameraXConfigProvider = eVar8;
        this.cameraInteropStateCallbackRepositoryProvider = eVar9;
    }

    public static CameraGraphConfigProvider_Factory create(e<CameraCallbackMap> eVar, e<ComboRequestListener> eVar2, e<CameraConfig> eVar3, e<CameraQuirks> eVar4, e<ZslControl> eVar5, e<TemplateParamsOverride> eVar6, e<CameraMetadata> eVar7, e<CameraXConfig> eVar8, e<CameraInteropStateCallbackRepository> eVar9) {
        return new CameraGraphConfigProvider_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9);
    }

    public static CameraGraphConfigProvider newInstance(CameraCallbackMap cameraCallbackMap, ComboRequestListener comboRequestListener, CameraConfig cameraConfig, CameraQuirks cameraQuirks, ZslControl zslControl, TemplateParamsOverride templateParamsOverride, CameraMetadata cameraMetadata, CameraXConfig cameraXConfig, CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository) {
        return new CameraGraphConfigProvider(cameraCallbackMap, comboRequestListener, cameraConfig, cameraQuirks, zslControl, templateParamsOverride, cameraMetadata, cameraXConfig, cameraInteropStateCallbackRepository);
    }

    @Override // g.a.a, f.a.a
    public CameraGraphConfigProvider get() {
        return newInstance(this.callbackMapProvider.get(), this.requestListenerProvider.get(), this.cameraConfigProvider.get(), this.cameraQuirksProvider.get(), this.zslControlProvider.get(), this.templateParamsOverrideProvider.get(), this.cameraMetadataProvider.get(), this.cameraXConfigProvider.get(), this.cameraInteropStateCallbackRepositoryProvider.get());
    }
}
