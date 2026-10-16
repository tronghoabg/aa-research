package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.an;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SnapFlingBehavior$fling$result$1 extends g implements p<af, e<? super AnimationResult<Float, AnimationVector1D>>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ l<Float, ab> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ ScrollScope $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SnapFlingBehavior$fling$result$1(SnapFlingBehavior snapFlingBehavior, float f2, l<? super Float, ab> lVar, ScrollScope scrollScope, e<? super SnapFlingBehavior$fling$result$1> eVar) {
        super(2, eVar);
        this.this$0 = snapFlingBehavior;
        this.$initialVelocity = f2;
        this.$onRemainingScrollOffsetUpdate = lVar;
        this.$this_fling = scrollScope;
    }

    static final ab invokeSuspend$lambda$1(an anVar, l lVar, float f2) {
        float f3 = anVar.f48102a - f2;
        anVar.f48102a = f3;
        lVar.invoke(Float.valueOf(f3));
        return ab.f48028a;
    }

    static final ab invokeSuspend$lambda$4(an anVar, l lVar, float f2) {
        float f3 = anVar.f48102a - f2;
        anVar.f48102a = f3;
        lVar.invoke(Float.valueOf(f3));
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SnapFlingBehavior$fling$result$1(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super AnimationResult<Float, AnimationVector1D>> eVar) {
        return ((SnapFlingBehavior$fling$result$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        final an anVar;
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            float fCalculateApproachOffset = this.this$0.snapLayoutInfoProvider.calculateApproachOffset(this.$initialVelocity, DecayAnimationSpecKt.calculateTargetValue(this.this$0.decayAnimationSpec, 0.0f, this.$initialVelocity));
            if (Float.isNaN(fCalculateApproachOffset)) {
                InlineClassHelperKt.throwIllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            anVar = new an();
            float fAbs = Math.abs(fCalculateApproachOffset) * Math.signum(this.$initialVelocity);
            anVar.f48102a = fAbs;
            this.$onRemainingScrollOffsetUpdate.invoke(new Float(fAbs));
            SnapFlingBehavior snapFlingBehavior = this.this$0;
            ScrollScope scrollScope = this.$this_fling;
            float f2 = anVar.f48102a;
            float f3 = this.$initialVelocity;
            final l<Float, ab> lVar = this.$onRemainingScrollOffsetUpdate;
            this.L$0 = anVar;
            this.label = 1;
            obj = snapFlingBehavior.tryApproach(scrollScope, f2, f3, new l() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return SnapFlingBehavior$fling$result$1.invokeSuspend$lambda$1(anVar, lVar, ((Float) obj2).floatValue());
                }
            }, this);
            if (obj != aVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return obj;
        }
        anVar = (an) this.L$0;
        c.b(obj);
        AnimationState animationState = (AnimationState) obj;
        float fCalculateSnapOffset = this.this$0.snapLayoutInfoProvider.calculateSnapOffset(((Number) animationState.getVelocity()).floatValue());
        if (Float.isNaN(fCalculateSnapOffset)) {
            InlineClassHelperKt.throwIllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        anVar.f48102a = fCalculateSnapOffset;
        ScrollScope scrollScope2 = this.$this_fling;
        AnimationState animationStateCopy$default = AnimationStateKt.copy$default(animationState, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
        SnapFlingBehavior snapFlingBehavior2 = this.this$0;
        final l<Float, ab> lVar2 = this.$onRemainingScrollOffsetUpdate;
        this.L$0 = null;
        this.label = 2;
        Object objAnimateWithTarget = SnapFlingBehaviorKt.animateWithTarget(scrollScope2, fCalculateSnapOffset, fCalculateSnapOffset, animationStateCopy$default, snapFlingBehavior2.snapAnimationSpec, new l() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj2) {
                return SnapFlingBehavior$fling$result$1.invokeSuspend$lambda$4(anVar, lVar2, ((Float) obj2).floatValue());
            }
        }, this);
        return objAnimateWithTarget == aVar ? aVar : objAnimateWithTarget;
    }
}
