package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.core.Threads;
import c.b.c;
import c.b.e;
import kotlinx.coroutines.af;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2ControllerModule_Companion_ProvideCoroutineScopeFactory implements c<af> {
    private final e<br> cameraPipeJobProvider;
    private final e<Threads> threadsProvider;

    private Camera2ControllerModule_Companion_ProvideCoroutineScopeFactory(e<Threads> eVar, e<br> eVar2) {
        this.threadsProvider = eVar;
        this.cameraPipeJobProvider = eVar2;
    }

    public static Camera2ControllerModule_Companion_ProvideCoroutineScopeFactory create(e<Threads> eVar, e<br> eVar2) {
        return new Camera2ControllerModule_Companion_ProvideCoroutineScopeFactory(eVar, eVar2);
    }

    public static af provideCoroutineScope(Threads threads, br brVar) {
        return Camera2ControllerModule.Companion.provideCoroutineScope(threads, brVar);
    }

    @Override // g.a.a, f.a.a
    public af get() {
        return provideCoroutineScope(this.threadsProvider.get(), this.cameraPipeJobProvider.get());
    }
}
