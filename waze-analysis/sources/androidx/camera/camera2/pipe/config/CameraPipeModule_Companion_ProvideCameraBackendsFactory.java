package androidx.camera.camera2.pipe.config;

import android.content.Context;
import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraBackends;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import c.b.c;
import c.b.e;
import g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeModule_Companion_ProvideCameraBackendsFactory implements c<CameraBackends> {
    private final e<Context> cameraPipeContextProvider;
    private final e<CameraPipeLifetime> cameraPipeLifetimeProvider;
    private final e<CameraPipe.Config> configProvider;
    private final e<CameraBackend> defaultCameraBackendProvider;
    private final e<Threads> threadsProvider;

    private CameraPipeModule_Companion_ProvideCameraBackendsFactory(e<CameraPipe.Config> eVar, e<CameraBackend> eVar2, e<Context> eVar3, e<Threads> eVar4, e<CameraPipeLifetime> eVar5) {
        this.configProvider = eVar;
        this.defaultCameraBackendProvider = eVar2;
        this.cameraPipeContextProvider = eVar3;
        this.threadsProvider = eVar4;
        this.cameraPipeLifetimeProvider = eVar5;
    }

    public static CameraPipeModule_Companion_ProvideCameraBackendsFactory create(e<CameraPipe.Config> eVar, e<CameraBackend> eVar2, e<Context> eVar3, e<Threads> eVar4, e<CameraPipeLifetime> eVar5) {
        return new CameraPipeModule_Companion_ProvideCameraBackendsFactory(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static CameraBackends provideCameraBackends(CameraPipe.Config config, a<CameraBackend> aVar, Context context, Threads threads, CameraPipeLifetime cameraPipeLifetime) {
        return CameraPipeModule.Companion.provideCameraBackends(config, aVar, context, threads, cameraPipeLifetime);
    }

    @Override // g.a.a, f.a.a
    public CameraBackends get() {
        return provideCameraBackends(this.configProvider.get(), this.defaultCameraBackendProvider, this.cameraPipeContextProvider.get(), this.threadsProvider.get(), this.cameraPipeLifetimeProvider.get());
    }
}
