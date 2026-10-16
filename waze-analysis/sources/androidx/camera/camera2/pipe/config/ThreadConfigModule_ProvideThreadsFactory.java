package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import c.b.c;
import c.b.e;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ThreadConfigModule_ProvideThreadsFactory implements c<Threads> {
    private final e<br> cameraPipeJobProvider;
    private final e<CameraPipeLifetime> cameraPipeLifetimeProvider;
    private final ThreadConfigModule module;

    private ThreadConfigModule_ProvideThreadsFactory(ThreadConfigModule threadConfigModule, e<CameraPipeLifetime> eVar, e<br> eVar2) {
        this.module = threadConfigModule;
        this.cameraPipeLifetimeProvider = eVar;
        this.cameraPipeJobProvider = eVar2;
    }

    public static ThreadConfigModule_ProvideThreadsFactory create(ThreadConfigModule threadConfigModule, e<CameraPipeLifetime> eVar, e<br> eVar2) {
        return new ThreadConfigModule_ProvideThreadsFactory(threadConfigModule, eVar, eVar2);
    }

    public static Threads provideThreads(ThreadConfigModule threadConfigModule, CameraPipeLifetime cameraPipeLifetime, br brVar) {
        return threadConfigModule.provideThreads(cameraPipeLifetime, brVar);
    }

    @Override // g.a.a, f.a.a
    public Threads get() {
        return provideThreads(this.module, this.cameraPipeLifetimeProvider.get(), this.cameraPipeJobProvider.get());
    }
}
