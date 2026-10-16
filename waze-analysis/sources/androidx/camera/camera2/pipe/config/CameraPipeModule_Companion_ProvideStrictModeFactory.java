package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.StrictMode;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeModule_Companion_ProvideStrictModeFactory implements c<StrictMode> {
    private final e<CameraPipe.Flags> flagsProvider;

    private CameraPipeModule_Companion_ProvideStrictModeFactory(e<CameraPipe.Flags> eVar) {
        this.flagsProvider = eVar;
    }

    public static CameraPipeModule_Companion_ProvideStrictModeFactory create(e<CameraPipe.Flags> eVar) {
        return new CameraPipeModule_Companion_ProvideStrictModeFactory(eVar);
    }

    public static StrictMode provideStrictMode(CameraPipe.Flags flags) {
        return CameraPipeModule.Companion.provideStrictMode(flags);
    }

    @Override // g.a.a, f.a.a
    public StrictMode get() {
        return provideStrictMode(this.flagsProvider.get());
    }
}
