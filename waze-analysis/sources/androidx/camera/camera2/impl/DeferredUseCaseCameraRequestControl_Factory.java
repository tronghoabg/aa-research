package androidx.camera.camera2.impl;

import c.b.c;
import c.b.e;
import g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DeferredUseCaseCameraRequestControl_Factory implements c<DeferredUseCaseCameraRequestControl> {
    private final e<UseCaseCameraRequestControlImpl> implProvider;
    private final e<UseCaseThreads> threadsProvider;

    private DeferredUseCaseCameraRequestControl_Factory(e<UseCaseCameraRequestControlImpl> eVar, e<UseCaseThreads> eVar2) {
        this.implProvider = eVar;
        this.threadsProvider = eVar2;
    }

    public static DeferredUseCaseCameraRequestControl_Factory create(e<UseCaseCameraRequestControlImpl> eVar, e<UseCaseThreads> eVar2) {
        return new DeferredUseCaseCameraRequestControl_Factory(eVar, eVar2);
    }

    public static DeferredUseCaseCameraRequestControl newInstance(a<UseCaseCameraRequestControlImpl> aVar, UseCaseThreads useCaseThreads) {
        return new DeferredUseCaseCameraRequestControl(aVar, useCaseThreads);
    }

    @Override // g.a.a, f.a.a
    public DeferredUseCaseCameraRequestControl get() {
        return newInstance(this.implProvider, this.threadsProvider.get());
    }
}
