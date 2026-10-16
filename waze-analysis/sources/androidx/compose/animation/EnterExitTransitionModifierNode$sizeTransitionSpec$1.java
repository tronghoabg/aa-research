package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.unit.IntSize;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode$sizeTransitionSpec$1 extends y implements l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> {
    final /* synthetic */ EnterExitTransitionModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterExitTransitionModifierNode$sizeTransitionSpec$1(EnterExitTransitionModifierNode enterExitTransitionModifierNode) {
        super(1);
        this.this$0 = enterExitTransitionModifierNode;
    }

    @Override // h.g.a.l
    public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<EnterExitState> segment) {
        SpringSpec animationSpec = null;
        if (segment.isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
            ChangeSize changeSize = this.this$0.getEnter().getData$animation().getChangeSize();
            if (changeSize != null) {
                animationSpec = changeSize.getAnimationSpec();
            }
        } else if (segment.isTransitioningTo(EnterExitState.Visible, EnterExitState.PostExit)) {
            ChangeSize changeSize2 = this.this$0.getExit().getData$animation().getChangeSize();
            if (changeSize2 != null) {
                animationSpec = changeSize2.getAnimationSpec();
            }
        } else {
            animationSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
        }
        return animationSpec == null ? EnterExitTransitionKt.DefaultSizeAnimationSpec : animationSpec;
    }
}
