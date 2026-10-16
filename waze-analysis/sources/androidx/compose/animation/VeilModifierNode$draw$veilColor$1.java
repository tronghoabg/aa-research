package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.graphics.Color;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VeilModifierNode$draw$veilColor$1 extends y implements l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<Color>> {
    final /* synthetic */ VeilModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VeilModifierNode$draw$veilColor$1(VeilModifierNode veilModifierNode) {
        super(1);
        this.this$0 = veilModifierNode;
    }

    @Override // h.g.a.l
    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<EnterExitState> segment) {
        FiniteAnimationSpec<Color> animationSpec;
        FiniteAnimationSpec<Color> animationSpec2;
        if (segment.isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
            Veil veil = this.this$0.getEnter().getData$animation().getVeil();
            return (veil == null || (animationSpec2 = veil.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultColorAnimationSpec : animationSpec2;
        }
        if (!segment.isTransitioningTo(EnterExitState.Visible, EnterExitState.PostExit)) {
            return EnterExitTransitionKt.DefaultColorAnimationSpec;
        }
        Veil veil2 = this.this$0.getExit().getData$animation().getVeil();
        return (veil2 == null || (animationSpec = veil2.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultColorAnimationSpec : animationSpec;
    }
}
