package androidx.camera.camera2.config;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.core.impl.EncoderProfilesProvider;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraModule_Companion_ProvideEncoderProfilesProviderFactory implements c<EncoderProfilesProvider> {
    private final e<String> cameraIdStringProvider;
    private final e<CameraQuirks> cameraQuirksProvider;

    private CameraModule_Companion_ProvideEncoderProfilesProviderFactory(e<String> eVar, e<CameraQuirks> eVar2) {
        this.cameraIdStringProvider = eVar;
        this.cameraQuirksProvider = eVar2;
    }

    public static CameraModule_Companion_ProvideEncoderProfilesProviderFactory create(e<String> eVar, e<CameraQuirks> eVar2) {
        return new CameraModule_Companion_ProvideEncoderProfilesProviderFactory(eVar, eVar2);
    }

    public static EncoderProfilesProvider provideEncoderProfilesProvider(String str, CameraQuirks cameraQuirks) {
        return CameraModule.Companion.provideEncoderProfilesProvider(str, cameraQuirks);
    }

    @Override // g.a.a, f.a.a
    public EncoderProfilesProvider get() {
        return provideEncoderProfilesProvider(this.cameraIdStringProvider.get(), this.cameraQuirksProvider.get());
    }
}
