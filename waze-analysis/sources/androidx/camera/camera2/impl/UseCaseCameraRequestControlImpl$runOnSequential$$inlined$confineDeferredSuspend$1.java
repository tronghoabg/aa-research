package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseCameraRequestControlImpl$runOnSequential$$inlined$confineDeferredSuspend$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ l $block;
    final /* synthetic */ CompletableDeferred $signal;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraRequestControlImpl$runOnSequential$$inlined$confineDeferredSuspend$1(l lVar, CompletableDeferred completableDeferred, e eVar) {
        super(2, eVar);
        this.$block = lVar;
        this.$signal = completableDeferred;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new UseCaseCameraRequestControlImpl$runOnSequential$$inlined$confineDeferredSuspend$1(this.$block, this.$signal, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((UseCaseCameraRequestControlImpl$runOnSequential$$inlined$confineDeferredSuspend$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            l lVar = this.$block;
            this.label = 1;
            obj = lVar.invoke(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        CoroutineAdaptersKt.propagateTo((am) obj, this.$signal);
        return ab.f48028a;
    }
}
