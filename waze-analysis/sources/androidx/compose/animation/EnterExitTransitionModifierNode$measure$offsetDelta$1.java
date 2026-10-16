package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.unit.IntOffset;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode$measure$offsetDelta$1 extends y implements l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> {
    public static final EnterExitTransitionModifierNode$measure$offsetDelta$1 INSTANCE = new EnterExitTransitionModifierNode$measure$offsetDelta$1();

    EnterExitTransitionModifierNode$measure$offsetDelta$1() {
        super(1);
    }

    @Override // h.g.a.l
    public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
        return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
    }
}
