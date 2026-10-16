package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntSize;
import h.g.a.l;
import h.g.b.x;
import h.g.b.y;

/* JADX INFO: Add missing generic type declarations: [S] */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1<S> extends y implements l<Transition.Segment<S>, FiniteAnimationSpec<IntSize>> {
    final /* synthetic */ long $currentSize;
    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1(AnimatedContentTransitionScopeImpl.SizeModifierNode<S> sizeModifierNode, long j2) {
        super(1);
        this.this$0 = sizeModifierNode;
        this.$currentSize = j2;
    }

    @Override // h.g.a.l
    public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<S> segment) {
        long jM11343unboximpl;
        FiniteAnimationSpec<IntSize> finiteAnimationSpecMo1843createAnimationSpecTemP2vQ;
        boolean zN = x.n(segment.getInitialState(), this.this$0.getScope().getInitialState());
        AnimatedContentTransitionScopeImpl.SizeModifierNode<S> sizeModifierNode = this.this$0;
        if (zN) {
            jM11343unboximpl = sizeModifierNode.m1731lastContinuousSizeOrDefaultmzRDjE0(this.$currentSize);
        } else {
            State<IntSize> state = sizeModifierNode.getScope().getTargetSizeMap$animation().get(segment.getInitialState());
            jM11343unboximpl = state != null ? state.getValue().m11343unboximpl() : IntSize.Companion.m11344getZeroYbymL2g();
        }
        State<IntSize> state2 = this.this$0.getScope().getTargetSizeMap$animation().get(segment.getTargetState());
        long jM11343unboximpl2 = state2 != null ? state2.getValue().m11343unboximpl() : IntSize.Companion.m11344getZeroYbymL2g();
        SizeTransform value = this.this$0.getSizeTransform().getValue();
        return (value == null || (finiteAnimationSpecMo1843createAnimationSpecTemP2vQ = value.mo1843createAnimationSpecTemP2vQ(jM11343unboximpl, jM11343unboximpl2)) == null) ? AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null) : finiteAnimationSpecMo1843createAnimationSpecTemP2vQ;
    }
}
