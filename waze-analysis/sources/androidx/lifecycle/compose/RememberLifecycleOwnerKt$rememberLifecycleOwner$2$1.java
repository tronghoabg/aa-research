package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ ComposeLifecycleOwner $localLifecycleOwner;
    final /* synthetic */ Lifecycle.State $maxLifecycle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1(ComposeLifecycleOwner composeLifecycleOwner, Lifecycle.State state, e<? super RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1> eVar) {
        super(2, eVar);
        this.$localLifecycleOwner = composeLifecycleOwner;
        this.$maxLifecycle = state;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1(this.$localLifecycleOwner, this.$maxLifecycle, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        this.$localLifecycleOwner.setMaxLifecycleState(this.$maxLifecycle);
        return ab.f48028a;
    }
}
