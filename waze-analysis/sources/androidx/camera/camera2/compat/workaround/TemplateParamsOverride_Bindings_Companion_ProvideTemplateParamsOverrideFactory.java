package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TemplateParamsOverride_Bindings_Companion_ProvideTemplateParamsOverrideFactory implements c<TemplateParamsOverride> {
    private final e<CameraQuirks> cameraQuirksProvider;

    private TemplateParamsOverride_Bindings_Companion_ProvideTemplateParamsOverrideFactory(e<CameraQuirks> eVar) {
        this.cameraQuirksProvider = eVar;
    }

    public static TemplateParamsOverride_Bindings_Companion_ProvideTemplateParamsOverrideFactory create(e<CameraQuirks> eVar) {
        return new TemplateParamsOverride_Bindings_Companion_ProvideTemplateParamsOverrideFactory(eVar);
    }

    public static TemplateParamsOverride provideTemplateParamsOverride(CameraQuirks cameraQuirks) {
        TemplateParamsOverride templateParamsOverrideProvideTemplateParamsOverride = TemplateParamsOverride.Bindings.Companion.provideTemplateParamsOverride(cameraQuirks);
        r.g(templateParamsOverrideProvideTemplateParamsOverride);
        return templateParamsOverrideProvideTemplateParamsOverride;
    }

    @Override // g.a.a, f.a.a
    public TemplateParamsOverride get() {
        return provideTemplateParamsOverride(this.cameraQuirksProvider.get());
    }
}
