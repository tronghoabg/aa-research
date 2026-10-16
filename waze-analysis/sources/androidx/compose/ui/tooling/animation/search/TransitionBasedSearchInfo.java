package androidx.compose.ui.tooling.animation.search;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.tooling.animation.TransitionBasedAnimation;
import androidx.compose.ui.tooling.animation.clock.TransitionClock;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class TransitionBasedSearchInfo<AnimationType extends TransitionBasedAnimation> implements SearchInfo<AnimationType, TransitionClock> {
    public static final int $stable = 8;
    private final Object animationObject;
    private Object initialState;
    private Object targetState;
    private final Transition<?> transition;

    public TransitionBasedSearchInfo(Transition<?> transition) {
        this.transition = transition;
        this.animationObject = transition;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public /* synthetic */ void attach() {
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public /* synthetic */ void detach() {
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getAnimationObject() {
        return this.animationObject;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public final Object getInitialState() {
        return this.initialState;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public final Object getTargetState() {
        return this.targetState;
    }

    public final Transition<?> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setInitialStateToCurrentAnimationValue() {
        this.initialState = this.transition.getTargetState();
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setTargetStateToCurrentAnimationValue() {
        this.targetState = this.transition.getTargetState();
    }
}
