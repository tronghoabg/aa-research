package androidx.camera.camera2.impl;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DeferredUseCaseCameraRequestControl$close$$inlined$confineLaunch$1 extends g implements p<af, e<? super ab>, Object> {
    int label;
    final /* synthetic */ DeferredUseCaseCameraRequestControl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeferredUseCaseCameraRequestControl$close$$inlined$confineLaunch$1(e eVar, DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl) {
        super(2, eVar);
        this.this$0 = deferredUseCaseCameraRequestControl;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DeferredUseCaseCameraRequestControl$close$$inlined$confineLaunch$1(eVar, this.this$0);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((DeferredUseCaseCameraRequestControl$close$$inlined$confineLaunch$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.this$0.impl;
        if (useCaseCameraRequestControlImpl != null) {
            useCaseCameraRequestControlImpl.close();
        }
        return ab.f48028a;
    }
}
