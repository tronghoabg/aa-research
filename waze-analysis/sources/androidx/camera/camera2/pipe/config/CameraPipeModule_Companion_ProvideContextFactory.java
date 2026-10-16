package androidx.camera.camera2.pipe.config;

import android.content.Context;
import androidx.camera.camera2.pipe.CameraPipe;
import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeModule_Companion_ProvideContextFactory implements c<Context> {
    private final e<CameraPipe.Config> configProvider;

    private CameraPipeModule_Companion_ProvideContextFactory(e<CameraPipe.Config> eVar) {
        this.configProvider = eVar;
    }

    public static CameraPipeModule_Companion_ProvideContextFactory create(e<CameraPipe.Config> eVar) {
        return new CameraPipeModule_Companion_ProvideContextFactory(eVar);
    }

    public static Context provideContext(CameraPipe.Config config) {
        Context contextProvideContext = CameraPipeModule.Companion.provideContext(config);
        r.g(contextProvideContext);
        return contextProvideContext;
    }

    @Override // g.a.a, f.a.a
    public Context get() {
        return provideContext(this.configProvider.get());
    }
}
