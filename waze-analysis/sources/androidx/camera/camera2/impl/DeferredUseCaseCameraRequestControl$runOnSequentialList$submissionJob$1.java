package androidx.camera.camera2.impl;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DeferredUseCaseCameraRequestControl$runOnSequentialList$submissionJob$1 extends g implements p<af, e<? super List<? extends am>>, Object> {
    final /* synthetic */ l<UseCaseCameraRequestControl, List<am>> $action;
    int label;
    final /* synthetic */ DeferredUseCaseCameraRequestControl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeferredUseCaseCameraRequestControl$runOnSequentialList$submissionJob$1(l<? super UseCaseCameraRequestControl, ? extends List<? extends am>> lVar, DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, e<? super DeferredUseCaseCameraRequestControl$runOnSequentialList$submissionJob$1> eVar) {
        super(2, eVar);
        this.$action = lVar;
        this.this$0 = deferredUseCaseCameraRequestControl;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DeferredUseCaseCameraRequestControl$runOnSequentialList$submissionJob$1(this.$action, this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super List<? extends am>> eVar) {
        return ((DeferredUseCaseCameraRequestControl$runOnSequentialList$submissionJob$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        return this.$action.invoke(this.this$0.getOrCreateImpl());
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$action.invoke(this.this$0.getOrCreateImpl());
    }
}
