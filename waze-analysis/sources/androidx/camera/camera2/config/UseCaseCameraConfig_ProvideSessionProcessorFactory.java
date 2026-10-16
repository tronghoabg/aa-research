package androidx.camera.camera2.config;

import androidx.camera.core.impl.SessionProcessor;
import c.b.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseCameraConfig_ProvideSessionProcessorFactory implements c<SessionProcessor> {
    private final UseCaseCameraConfig module;

    private UseCaseCameraConfig_ProvideSessionProcessorFactory(UseCaseCameraConfig useCaseCameraConfig) {
        this.module = useCaseCameraConfig;
    }

    public static UseCaseCameraConfig_ProvideSessionProcessorFactory create(UseCaseCameraConfig useCaseCameraConfig) {
        return new UseCaseCameraConfig_ProvideSessionProcessorFactory(useCaseCameraConfig);
    }

    public static SessionProcessor provideSessionProcessor(UseCaseCameraConfig useCaseCameraConfig) {
        return useCaseCameraConfig.provideSessionProcessor();
    }

    @Override // g.a.a, f.a.a
    public SessionProcessor get() {
        return provideSessionProcessor(this.module);
    }
}
