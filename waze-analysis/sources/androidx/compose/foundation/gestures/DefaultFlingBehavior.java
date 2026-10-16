package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DefaultFlingBehavior;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.unit.Density;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.an;
import h.g.b.o;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DefaultFlingBehavior implements ScrollableDefaultFlingBehavior {
    public static final int $stable = 0;
    private DecayAnimationSpec<Float> flingDecay;
    private int lastAnimationCycleCount;
    private final MotionDurationScale motionDurationScale;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super Float>, Object> {
        final /* synthetic */ float $initialVelocity;
        final /* synthetic */ ScrollScope $this_performFling;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DefaultFlingBehavior this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(float f2, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$initialVelocity = f2;
            this.this$0 = defaultFlingBehavior;
            this.$this_performFling = scrollScope;
        }

        static final ab invokeSuspend$lambda$0(an anVar, ScrollScope scrollScope, an anVar2, DefaultFlingBehavior defaultFlingBehavior, AnimationScope animationScope) {
            float fFloatValue = ((Number) animationScope.getValue()).floatValue() - anVar.f48102a;
            float fScrollBy = scrollScope.scrollBy(fFloatValue);
            anVar.f48102a = ((Number) animationScope.getValue()).floatValue();
            anVar2.f48102a = ((Number) animationScope.getVelocity()).floatValue();
            if (Math.abs(fFloatValue - fScrollBy) > 0.5f) {
                animationScope.cancelAnimation();
            }
            defaultFlingBehavior.setLastAnimationCycleCount(defaultFlingBehavior.getLastAnimationCycleCount() + 1);
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.$initialVelocity, this.this$0, this.$this_performFling, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super Float> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            float f2;
            an anVar;
            AnimationState animationState;
            DecayAnimationSpec decayAnimationSpec;
            final ScrollScope scrollScope;
            final DefaultFlingBehavior defaultFlingBehavior;
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                if (Math.abs(this.$initialVelocity) > 1.0f) {
                    final an anVar2 = new an();
                    anVar2.f48102a = this.$initialVelocity;
                    final an anVar3 = new an();
                    AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, this.$initialVelocity, 0L, 0L, false, 28, null);
                    try {
                        decayAnimationSpec = this.this$0.flingDecay;
                        scrollScope = this.$this_performFling;
                        defaultFlingBehavior = this.this$0;
                        this.L$0 = anVar2;
                        this.L$1 = animationStateAnimationState$default;
                        this.label = 1;
                    } catch (CancellationException unused) {
                        anVar = anVar2;
                        animationState = animationStateAnimationState$default;
                        anVar.f48102a = ((Number) animationState.getVelocity()).floatValue();
                        f2 = anVar.f48102a;
                        return new Float(f2);
                    }
                    if (SuspendAnimationKt.animateDecay$default(animationStateAnimationState$default, decayAnimationSpec, false, new l() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2$$ExternalSyntheticLambda0
                        @Override // h.g.a.l
                        public final Object invoke(Object obj2) {
                            return DefaultFlingBehavior.AnonymousClass2.invokeSuspend$lambda$0(anVar3, scrollScope, anVar2, defaultFlingBehavior, (AnimationScope) obj2);
                        }
                    }, this, 2, null) == aVar) {
                        return aVar;
                    }
                    anVar = anVar2;
                    f2 = anVar.f48102a;
                } else {
                    f2 = this.$initialVelocity;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                animationState = (AnimationState) this.L$1;
                anVar = (an) this.L$0;
                try {
                    c.b(obj);
                } catch (CancellationException unused2) {
                    anVar.f48102a = ((Number) animationState.getVelocity()).floatValue();
                    f2 = anVar.f48102a;
                    return new Float(f2);
                }
                f2 = anVar.f48102a;
            }
            return new Float(f2);
        }
    }

    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale, int i2, o oVar) {
        this(decayAnimationSpec, (i2 & 2) != 0 ? ScrollableKt.getDefaultScrollMotionDurationScale() : motionDurationScale);
    }

    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public Object performFling(ScrollScope scrollScope, float f2, e<? super Float> eVar) {
        this.lastAnimationCycleCount = 0;
        return aj.v(this.motionDurationScale, new AnonymousClass2(f2, this, scrollScope, null), eVar);
    }

    public final void setLastAnimationCycleCount(int i2) {
        this.lastAnimationCycleCount = i2;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableDefaultFlingBehavior
    public void updateDensity(Density density) {
        this.flingDecay = SplineBasedDecayKt.splineBasedDecay(density);
    }

    public DefaultFlingBehavior(DecayAnimationSpec<Float> decayAnimationSpec, MotionDurationScale motionDurationScale) {
        this.flingDecay = decayAnimationSpec;
        this.motionDurationScale = motionDurationScale;
    }
}
