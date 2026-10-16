package androidx.compose.animation.core;

import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TransitionKt$rememberTransition$1$1$snapshotStateObserver$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ a<ab> $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransitionKt$rememberTransition$1$1$snapshotStateObserver$1$1(a<ab> aVar, e<? super TransitionKt$rememberTransition$1$1$snapshotStateObserver$1$1> eVar) {
        super(2, eVar);
        this.$it = aVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new TransitionKt$rememberTransition$1$1$snapshotStateObserver$1$1(this.$it, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((TransitionKt$rememberTransition$1$1$snapshotStateObserver$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        this.$it.invoke();
        return ab.f48028a;
    }
}
