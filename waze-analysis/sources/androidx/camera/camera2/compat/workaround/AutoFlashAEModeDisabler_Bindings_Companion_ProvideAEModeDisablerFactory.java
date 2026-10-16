package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler;
import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AutoFlashAEModeDisabler_Bindings_Companion_ProvideAEModeDisablerFactory implements c<AutoFlashAEModeDisabler> {
    private final e<CameraQuirks> cameraQuirksProvider;

    private AutoFlashAEModeDisabler_Bindings_Companion_ProvideAEModeDisablerFactory(e<CameraQuirks> eVar) {
        this.cameraQuirksProvider = eVar;
    }

    public static AutoFlashAEModeDisabler_Bindings_Companion_ProvideAEModeDisablerFactory create(e<CameraQuirks> eVar) {
        return new AutoFlashAEModeDisabler_Bindings_Companion_ProvideAEModeDisablerFactory(eVar);
    }

    public static AutoFlashAEModeDisabler provideAEModeDisabler(CameraQuirks cameraQuirks) {
        AutoFlashAEModeDisabler autoFlashAEModeDisablerProvideAEModeDisabler = AutoFlashAEModeDisabler.Bindings.Companion.provideAEModeDisabler(cameraQuirks);
        r.g(autoFlashAEModeDisablerProvideAEModeDisabler);
        return autoFlashAEModeDisablerProvideAEModeDisabler;
    }

    @Override // g.a.a, f.a.a
    public AutoFlashAEModeDisabler get() {
        return provideAEModeDisabler(this.cameraQuirksProvider.get());
    }
}
