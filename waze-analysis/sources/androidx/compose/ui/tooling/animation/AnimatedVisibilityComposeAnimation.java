package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import e.c.d.a;
import h.a.i;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AnimatedVisibilityComposeAnimation implements ComposeAnimation {
    public static final int $stable = 8;
    private final Transition<Boolean> animationObject;
    private final String label;
    private final ComposeAnimationType type = ComposeAnimationType.ANIMATED_VISIBILITY;
    private final Set<AnimatedVisibilityState> states = a.r(AnimatedVisibilityState.m11085boximpl(AnimatedVisibilityState.Companion.m11092getEnterjXw82LU()), AnimatedVisibilityState.m11085boximpl(AnimatedVisibilityState.Companion.m11093getExitjXw82LU()));

    public AnimatedVisibilityComposeAnimation(Transition<Boolean> transition, String str) {
        this.animationObject = transition;
        this.label = str;
    }

    public static /* synthetic */ void getChildTransition$annotations() {
    }

    public final Transition<Object> getChildTransition() {
        Object objS = i.S(getAnimationObject().getTransitions(), 0);
        if (objS instanceof Transition) {
            return (Transition) objS;
        }
        return null;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public String getLabel() {
        return this.label;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public Set<AnimatedVisibilityState> getStates() {
        return this.states;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public ComposeAnimationType getType() {
        return this.type;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public Transition<Boolean> getAnimationObject() {
        return this.animationObject;
    }
}
