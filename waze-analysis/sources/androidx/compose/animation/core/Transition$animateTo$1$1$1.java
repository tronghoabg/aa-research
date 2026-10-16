package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class Transition$animateTo$1$1$1 extends g implements p<af, e<? super ab>, Object> {
    float F$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Transition<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Transition$animateTo$1$1$1(Transition<S> transition, e<? super Transition$animateTo$1$1$1> eVar) {
        super(2, eVar);
        this.this$0 = transition;
    }

    static final ab invokeSuspend$lambda$0(Transition transition, float f2, long j2) {
        if (!transition.isSeeking()) {
            transition.onFrame$animation_core(j2, f2);
        }
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        Transition$animateTo$1$1$1 transition$animateTo$1$1$1 = new Transition$animateTo$1$1$1(this.this$0, eVar);
        transition$animateTo$1$1$1.L$0 = obj;
        return transition$animateTo$1$1$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((Transition$animateTo$1$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        af afVar;
        final float durationScale;
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            afVar = (af) this.L$0;
            durationScale = SuspendAnimationKt.getDurationScale(afVar.getCoroutineContext());
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            durationScale = this.F$0;
            afVar = (af) this.L$0;
            c.b(obj);
        }
        while (aj.j(afVar)) {
            final Transition<S> transition = this.this$0;
            this.L$0 = afVar;
            this.F$0 = durationScale;
            this.label = 1;
            if (MonotonicFrameClockKt.withFrameNanos(new l() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1$1$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return Transition$animateTo$1$1$1.invokeSuspend$lambda$0(transition, durationScale, ((Long) obj2).longValue());
                }
            }, this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
