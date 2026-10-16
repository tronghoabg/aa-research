package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation;
import androidx.compose.ui.tooling.animation.states.TargetState;
import h.a.i;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AnimateXAsStateClock<T, V extends AnimationVector> implements ComposeAnimationClock<AnimateXAsStateComposeAnimation<T, V>, TargetState<T>> {
    public static final int $stable = 8;
    private final AnimateXAsStateComposeAnimation<T, V> animation;
    private long clockTimeNanos;
    private TargetState<T> state = new TargetState<>(getAnimation().getAnimationObject().getValue(), getAnimation().getAnimationObject().getValue());
    private T currentValue = getAnimation().getToolingState().getValue();
    private TargetBasedAnimation<T, V> currAnimation = getCurrentAnimation();

    public AnimateXAsStateClock(AnimateXAsStateComposeAnimation<T, V> animateXAsStateComposeAnimation) {
        this.animation = animateXAsStateComposeAnimation;
    }

    private final TargetBasedAnimation<T, V> getCurrentAnimation() {
        return AnimationKt.TargetBasedAnimation(getAnimation().getAnimationSpec(), getAnimation().getAnimationObject().getTypeConverter(), getState().getInitial(), getState().getTarget(), getAnimation().getAnimationObject().getVelocity());
    }

    private final void setClockTimeNanos(long j2) {
        this.clockTimeNanos = j2;
        setCurrentValue(this.currAnimation.getValueFromNanos(j2));
    }

    private final void setCurrentValue(T t) {
        this.currentValue = t;
        getAnimation().getToolingState().setValue(t);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        String label = getAnimation().getLabel();
        T t = this.currentValue;
        x.d(t, "null cannot be cast to non-null type kotlin.Any");
        return i.d(new ComposeAnimatedProperty(label, t));
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return Utils_androidKt.nanosToMillis(this.currAnimation.getDurationNanos());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        return Utils_androidKt.nanosToMillis(this.currAnimation.getDurationNanos());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<TransitionInfo> getTransitions(long j2) {
        return i.d(Utils_androidKt.createTransitionInfo(this.currAnimation, getAnimation().getLabel(), getAnimation().getAnimationSpec(), j2));
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long j2) {
        setClockTimeNanos(j2);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setState(TargetState<T> targetState) {
        this.state = targetState;
        this.currAnimation = getCurrentAnimation();
        setClockTime(this.clockTimeNanos);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(Object obj, Object obj2) {
        TargetState<T> parametersToValue = Utils_androidKt.parseParametersToValue(this.currentValue, obj, obj2);
        if (parametersToValue != null) {
            setState((TargetState) parametersToValue);
        }
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public AnimateXAsStateComposeAnimation<T, V> getAnimation() {
        return this.animation;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public TargetState<T> getState() {
        return this.state;
    }
}
