package androidx.camera.camera2.config;

import androidx.camera.camera2.adapter.SessionConfigAdapter;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseCameraConfig_ProvideSessionConfigAdapterFactory implements c<SessionConfigAdapter> {
    private final UseCaseCameraConfig module;

    private UseCaseCameraConfig_ProvideSessionConfigAdapterFactory(UseCaseCameraConfig useCaseCameraConfig) {
        this.module = useCaseCameraConfig;
    }

    public static UseCaseCameraConfig_ProvideSessionConfigAdapterFactory create(UseCaseCameraConfig useCaseCameraConfig) {
        return new UseCaseCameraConfig_ProvideSessionConfigAdapterFactory(useCaseCameraConfig);
    }

    public static SessionConfigAdapter provideSessionConfigAdapter(UseCaseCameraConfig useCaseCameraConfig) {
        SessionConfigAdapter sessionConfigAdapterProvideSessionConfigAdapter = useCaseCameraConfig.provideSessionConfigAdapter();
        r.g(sessionConfigAdapterProvideSessionConfigAdapter);
        return sessionConfigAdapterProvideSessionConfigAdapter;
    }

    @Override // g.a.a, f.a.a
    public SessionConfigAdapter get() {
        return provideSessionConfigAdapter(this.module);
    }
}
