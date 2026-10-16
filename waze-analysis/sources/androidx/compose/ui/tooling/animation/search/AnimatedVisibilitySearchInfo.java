package androidx.compose.ui.tooling.animation.search;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation;
import androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation_androidKt;
import androidx.compose.ui.tooling.animation.ClockInfo;
import androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AnimatedVisibilitySearchInfo implements SearchInfo<AnimatedVisibilityComposeAnimation, AnimatedVisibilityClock> {
    public static final int $stable = 8;
    private final Object animationObject;
    private boolean initialState;
    private boolean targetState;
    private final Transition<Boolean> transition;

    public AnimatedVisibilitySearchInfo(Transition<Boolean> transition) {
        this.transition = transition;
        this.animationObject = transition;
        this.initialState = transition.getTargetState().booleanValue();
        this.targetState = transition.getTargetState().booleanValue();
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public /* synthetic */ void attach() {
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public AnimatedVisibilityClock createClock(AnimatedVisibilityComposeAnimation animatedVisibilityComposeAnimation, ClockInfo clockInfo) {
        clockInfo.requestLayout();
        AnimatedVisibilityClock animatedVisibilityClock = new AnimatedVisibilityClock(animatedVisibilityComposeAnimation);
        animatedVisibilityClock.setClockTime(0L);
        return animatedVisibilityClock;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public /* synthetic */ void detach() {
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getAnimationObject() {
        return this.animationObject;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Boolean getInitialState() {
        return Boolean.valueOf(this.initialState);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public String getLabel() {
        String label = this.transition.getLabel();
        return label == null ? "AnimatedVisibility" : label;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Boolean getTargetState() {
        return Boolean.valueOf(this.targetState);
    }

    public final Transition<Boolean> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setInitialStateToCurrentAnimationValue() {
        this.initialState = this.transition.getTargetState().booleanValue();
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setTargetStateToCurrentAnimationValue() {
        this.targetState = this.transition.getTargetState().booleanValue();
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public AnimatedVisibilityComposeAnimation createAnimation() {
        return AnimatedVisibilityComposeAnimation_androidKt.parseAnimatedVisibility(this.transition);
    }
}
