package androidx.camera.camera2.pipe.config;

import android.content.Context;
import androidx.camera.camera2.pipe.CameraBackends;
import androidx.camera.camera2.pipe.CameraContext;
import androidx.camera.camera2.pipe.core.Threads;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeModule_Companion_ProvideCameraContextFactory implements c<CameraContext> {
    private final e<CameraBackends> cameraBackendsProvider;
    private final e<Context> cameraPipeContextProvider;
    private final e<Threads> threadsProvider;

    private CameraPipeModule_Companion_ProvideCameraContextFactory(e<Context> eVar, e<Threads> eVar2, e<CameraBackends> eVar3) {
        this.cameraPipeContextProvider = eVar;
        this.threadsProvider = eVar2;
        this.cameraBackendsProvider = eVar3;
    }

    public static CameraPipeModule_Companion_ProvideCameraContextFactory create(e<Context> eVar, e<Threads> eVar2, e<CameraBackends> eVar3) {
        return new CameraPipeModule_Companion_ProvideCameraContextFactory(eVar, eVar2, eVar3);
    }

    public static CameraContext provideCameraContext(Context context, Threads threads, CameraBackends cameraBackends) {
        return CameraPipeModule.Companion.provideCameraContext(context, threads, cameraBackends);
    }

    @Override // g.a.a, f.a.a
    public CameraContext get() {
        return provideCameraContext(this.cameraPipeContextProvider.get(), this.threadsProvider.get(), this.cameraBackendsProvider.get());
    }
}
