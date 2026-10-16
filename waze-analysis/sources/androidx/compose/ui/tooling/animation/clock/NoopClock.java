package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.UnsupportedComposeAnimation;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import androidx.compose.ui.tooling.animation.states.NoopState_androidKt;
import h.a.i;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NoopClock implements ComposeAnimationClock<UnsupportedComposeAnimation, ComposeAnimationState> {
    public static final int $stable = 8;
    private final UnsupportedComposeAnimation animation;
    private ComposeAnimationState state = NoopState_androidKt.getNoopState();

    public NoopClock(UnsupportedComposeAnimation unsupportedComposeAnimation) {
        this.animation = unsupportedComposeAnimation;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        return i.h();
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return 0L;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        return 0L;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public ComposeAnimationState getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<TransitionInfo> getTransitions(long j2) {
        return i.h();
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long j2) {
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setState(ComposeAnimationState composeAnimationState) {
        this.state = composeAnimationState;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(Object obj, Object obj2) {
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public UnsupportedComposeAnimation getAnimation() {
        return this.animation;
    }
}
