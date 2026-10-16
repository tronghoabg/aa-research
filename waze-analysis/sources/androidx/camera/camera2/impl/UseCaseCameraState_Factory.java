package androidx.camera.camera2.impl;

import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.config.UseCaseCameraContext;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseCameraState_Factory implements c<UseCaseCameraState> {
    private final e<TemplateParamsOverride> templateParamsOverrideProvider;
    private final e<UseCaseCameraContext> useCaseCameraContextProvider;

    private UseCaseCameraState_Factory(e<UseCaseCameraContext> eVar, e<TemplateParamsOverride> eVar2) {
        this.useCaseCameraContextProvider = eVar;
        this.templateParamsOverrideProvider = eVar2;
    }

    public static UseCaseCameraState_Factory create(e<UseCaseCameraContext> eVar, e<TemplateParamsOverride> eVar2) {
        return new UseCaseCameraState_Factory(eVar, eVar2);
    }

    public static UseCaseCameraState newInstance(UseCaseCameraContext useCaseCameraContext, TemplateParamsOverride templateParamsOverride) {
        return new UseCaseCameraState(useCaseCameraContext, templateParamsOverride);
    }

    @Override // g.a.a, f.a.a
    public UseCaseCameraState get() {
        return newInstance(this.useCaseCameraContextProvider.get(), this.templateParamsOverrideProvider.get());
    }
}
