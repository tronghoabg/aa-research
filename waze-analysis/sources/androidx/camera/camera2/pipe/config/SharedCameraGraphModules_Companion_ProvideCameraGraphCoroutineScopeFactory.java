package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.core.Threads;
import c.b.c;
import c.b.e;
import kotlinx.coroutines.af;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SharedCameraGraphModules_Companion_ProvideCameraGraphCoroutineScopeFactory implements c<af> {
    private final e<br> cameraPipeJobProvider;
    private final e<Threads> threadsProvider;

    private SharedCameraGraphModules_Companion_ProvideCameraGraphCoroutineScopeFactory(e<Threads> eVar, e<br> eVar2) {
        this.threadsProvider = eVar;
        this.cameraPipeJobProvider = eVar2;
    }

    public static SharedCameraGraphModules_Companion_ProvideCameraGraphCoroutineScopeFactory create(e<Threads> eVar, e<br> eVar2) {
        return new SharedCameraGraphModules_Companion_ProvideCameraGraphCoroutineScopeFactory(eVar, eVar2);
    }

    public static af provideCameraGraphCoroutineScope(Threads threads, br brVar) {
        return SharedCameraGraphModules.Companion.provideCameraGraphCoroutineScope(threads, brVar);
    }

    @Override // g.a.a, f.a.a
    public af get() {
        return provideCameraGraphCoroutineScope(this.threadsProvider.get(), this.cameraPipeJobProvider.get());
    }
}
