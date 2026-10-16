package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1 extends y implements l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<Float>> {
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1(EnterTransition enterTransition, ExitTransition exitTransition) {
        super(1);
        this.$enter = enterTransition;
        this.$exit = exitTransition;
    }

    @Override // h.g.a.l
    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> segment) {
        FiniteAnimationSpec<Float> animationSpec;
        FiniteAnimationSpec<Float> animationSpec2;
        if (segment.isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
            Fade fade = this.$enter.getData$animation().getFade();
            return (fade == null || (animationSpec2 = fade.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultAlphaAndScaleSpring : animationSpec2;
        }
        if (!segment.isTransitioningTo(EnterExitState.Visible, EnterExitState.PostExit)) {
            return EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
        }
        Fade fade2 = this.$exit.getData$animation().getFade();
        return (fade2 == null || (animationSpec = fade2.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultAlphaAndScaleSpring : animationSpec;
    }
}
