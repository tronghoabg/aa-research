package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate;
import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseFlashModeTorchFor3aUpdate_Bindings_Companion_ProvideUseFlashModeTorchFor3aUpdateFactory implements c<UseFlashModeTorchFor3aUpdate> {
    private final e<CameraQuirks> cameraQuirksProvider;

    private UseFlashModeTorchFor3aUpdate_Bindings_Companion_ProvideUseFlashModeTorchFor3aUpdateFactory(e<CameraQuirks> eVar) {
        this.cameraQuirksProvider = eVar;
    }

    public static UseFlashModeTorchFor3aUpdate_Bindings_Companion_ProvideUseFlashModeTorchFor3aUpdateFactory create(e<CameraQuirks> eVar) {
        return new UseFlashModeTorchFor3aUpdate_Bindings_Companion_ProvideUseFlashModeTorchFor3aUpdateFactory(eVar);
    }

    public static UseFlashModeTorchFor3aUpdate provideUseFlashModeTorchFor3aUpdate(CameraQuirks cameraQuirks) {
        UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdateProvideUseFlashModeTorchFor3aUpdate = UseFlashModeTorchFor3aUpdate.Bindings.Companion.provideUseFlashModeTorchFor3aUpdate(cameraQuirks);
        r.g(useFlashModeTorchFor3aUpdateProvideUseFlashModeTorchFor3aUpdate);
        return useFlashModeTorchFor3aUpdateProvideUseFlashModeTorchFor3aUpdate;
    }

    @Override // g.a.a, f.a.a
    public UseFlashModeTorchFor3aUpdate get() {
        return provideUseFlashModeTorchFor3aUpdate(this.cameraQuirksProvider.get());
    }
}
