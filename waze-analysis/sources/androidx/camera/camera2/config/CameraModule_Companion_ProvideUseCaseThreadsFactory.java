package androidx.camera.camera2.config;

import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.core.impl.CameraThreadConfig;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraModule_Companion_ProvideUseCaseThreadsFactory implements c<UseCaseThreads> {
    private final e<CameraConfig> cameraConfigProvider;
    private final e<CameraThreadConfig> cameraThreadConfigProvider;

    private CameraModule_Companion_ProvideUseCaseThreadsFactory(e<CameraConfig> eVar, e<CameraThreadConfig> eVar2) {
        this.cameraConfigProvider = eVar;
        this.cameraThreadConfigProvider = eVar2;
    }

    public static CameraModule_Companion_ProvideUseCaseThreadsFactory create(e<CameraConfig> eVar, e<CameraThreadConfig> eVar2) {
        return new CameraModule_Companion_ProvideUseCaseThreadsFactory(eVar, eVar2);
    }

    public static UseCaseThreads provideUseCaseThreads(CameraConfig cameraConfig, CameraThreadConfig cameraThreadConfig) {
        return CameraModule.Companion.provideUseCaseThreads(cameraConfig, cameraThreadConfig);
    }

    @Override // g.a.a, f.a.a
    public UseCaseThreads get() {
        return provideUseCaseThreads(this.cameraConfigProvider.get(), this.cameraThreadConfigProvider.get());
    }
}
