package androidx.compose.ui.tooling.animation.search;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.tooling.animation.AnimatedContentComposeAnimation;
import androidx.compose.ui.tooling.animation.ClockInfo;
import androidx.compose.ui.tooling.animation.clock.TransitionClock;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AnimatedContentSearchInfo extends TransitionBasedSearchInfo<AnimatedContentComposeAnimation<?>> {
    public static final int $stable = 8;

    public AnimatedContentSearchInfo(Transition<?> transition) {
        super(transition);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public String getLabel() {
        String label = getTransition().getLabel();
        return label == null ? "AnimatedContent" : label;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public AnimatedContentComposeAnimation<?> createAnimation() {
        return AnimatedContentComposeAnimation.Companion.parseAnimatedContent(this);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public TransitionClock<?> createClock(AnimatedContentComposeAnimation<?> animatedContentComposeAnimation, ClockInfo clockInfo) {
        return new TransitionClock<>(animatedContentComposeAnimation);
    }
}
