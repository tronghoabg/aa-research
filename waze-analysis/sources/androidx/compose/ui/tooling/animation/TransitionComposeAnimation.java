package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TransitionComposeAnimation<T> implements ComposeAnimation, TransitionBasedAnimation<T> {
    public static final int $stable = 8;
    private final Transition<T> animationObject;
    private final Object initialState;
    private final String label;
    private final Set<Object> states;
    private final Object targetState;
    private final ComposeAnimationType type = ComposeAnimationType.TRANSITION_ANIMATION;

    public TransitionComposeAnimation(Object obj, Object obj2, Transition<T> transition, Set<? extends Object> set, String str) {
        this.initialState = obj;
        this.targetState = obj2;
        this.animationObject = transition;
        this.states = set;
        this.label = str;
    }

    public final Object getInitialState() {
        return this.initialState;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public String getLabel() {
        return this.label;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public Set<Object> getStates() {
        return this.states;
    }

    public final Object getTargetState() {
        return this.targetState;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public ComposeAnimationType getType() {
        return this.type;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public Transition<T> getAnimationObject() {
        return this.animationObject;
    }
}
