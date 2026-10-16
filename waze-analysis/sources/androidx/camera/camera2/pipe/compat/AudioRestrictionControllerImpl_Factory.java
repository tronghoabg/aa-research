package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AudioRestrictionControllerImpl_Factory implements c.b.c<AudioRestrictionControllerImpl> {
    private final c.b.e<br> cameraPipeJobProvider;
    private final c.b.e<CameraPipeLifetime> cameraPipeLifetimeProvider;
    private final c.b.e<Threads> threadsProvider;

    private AudioRestrictionControllerImpl_Factory(c.b.e<Threads> eVar, c.b.e<CameraPipeLifetime> eVar2, c.b.e<br> eVar3) {
        this.threadsProvider = eVar;
        this.cameraPipeLifetimeProvider = eVar2;
        this.cameraPipeJobProvider = eVar3;
    }

    public static AudioRestrictionControllerImpl_Factory create(c.b.e<Threads> eVar, c.b.e<CameraPipeLifetime> eVar2, c.b.e<br> eVar3) {
        return new AudioRestrictionControllerImpl_Factory(eVar, eVar2, eVar3);
    }

    public static AudioRestrictionControllerImpl newInstance(Threads threads, CameraPipeLifetime cameraPipeLifetime, br brVar) {
        return new AudioRestrictionControllerImpl(threads, cameraPipeLifetime, brVar);
    }

    @Override // g.a.a, f.a.a
    public AudioRestrictionControllerImpl get() {
        return newInstance(this.threadsProvider.get(), this.cameraPipeLifetimeProvider.get(), this.cameraPipeJobProvider.get());
    }
}
