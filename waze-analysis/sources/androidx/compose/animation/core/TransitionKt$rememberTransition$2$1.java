package androidx.compose.animation.core;

import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.h.a;
import kotlinx.coroutines.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TransitionKt$rememberTransition$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ TransitionState $transitionState;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransitionKt$rememberTransition$2$1(TransitionState transitionState, e<? super TransitionKt$rememberTransition$2$1> eVar) {
        super(2, eVar);
        this.$transitionState = transitionState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new TransitionKt$rememberTransition$2$1(this.$transitionState, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((TransitionKt$rememberTransition$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        TransitionState transitionState;
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            ((SeekableTransitionState) this.$transitionState).observeTotalDuration$animation_core();
            a compositionContinuationMutex$animation_core = ((SeekableTransitionState) this.$transitionState).getCompositionContinuationMutex$animation_core();
            TransitionState transitionState2 = this.$transitionState;
            this.L$0 = compositionContinuationMutex$animation_core;
            this.L$1 = transitionState2;
            this.label = 1;
            if (compositionContinuationMutex$animation_core.lock(null, this) == aVar2) {
                return aVar2;
            }
            aVar = compositionContinuationMutex$animation_core;
            transitionState = transitionState2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transitionState = (TransitionState) this.L$1;
            aVar = (a) this.L$0;
            c.b(obj);
        }
        try {
            SeekableTransitionState seekableTransitionState = (SeekableTransitionState) transitionState;
            seekableTransitionState.setComposedTargetState$animation_core(seekableTransitionState.getTargetState());
            k compositionContinuation$animation_core = seekableTransitionState.getCompositionContinuation$animation_core();
            if (compositionContinuation$animation_core != null) {
                compositionContinuation$animation_core.resumeWith(seekableTransitionState.getTargetState());
            }
            seekableTransitionState.setCompositionContinuation$animation_core(null);
            aVar.unlock(null);
            return ab.f48028a;
        } catch (Throwable th) {
            aVar.unlock(null);
            throw th;
        }
    }
}
