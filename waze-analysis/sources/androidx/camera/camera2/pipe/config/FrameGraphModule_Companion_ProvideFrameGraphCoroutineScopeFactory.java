package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.core.Threads;
import c.b.c;
import c.b.e;
import kotlinx.coroutines.af;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameGraphModule_Companion_ProvideFrameGraphCoroutineScopeFactory implements c<af> {
    private final e<br> cameraPipeJobProvider;
    private final e<Threads> threadsProvider;

    private FrameGraphModule_Companion_ProvideFrameGraphCoroutineScopeFactory(e<Threads> eVar, e<br> eVar2) {
        this.threadsProvider = eVar;
        this.cameraPipeJobProvider = eVar2;
    }

    public static FrameGraphModule_Companion_ProvideFrameGraphCoroutineScopeFactory create(e<Threads> eVar, e<br> eVar2) {
        return new FrameGraphModule_Companion_ProvideFrameGraphCoroutineScopeFactory(eVar, eVar2);
    }

    public static af provideFrameGraphCoroutineScope(Threads threads, br brVar) {
        return FrameGraphModule.Companion.provideFrameGraphCoroutineScope(threads, brVar);
    }

    @Override // g.a.a, f.a.a
    public af get() {
        return provideFrameGraphCoroutineScope(this.threadsProvider.get(), this.cameraPipeJobProvider.get());
    }
}
