package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface ComposeAnimationClock<T extends ComposeAnimation, TState extends ComposeAnimationState> {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void setStateParameters$default(ComposeAnimationClock composeAnimationClock, Object obj, Object obj2, int i2, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStateParameters");
            }
            if ((i2 & 2) != 0) {
                obj2 = null;
            }
            composeAnimationClock.setStateParameters(obj, obj2);
        }
    }

    List<ComposeAnimatedProperty> getAnimatedProperties();

    T getAnimation();

    long getMaxDuration();

    long getMaxDurationPerIteration();

    TState getState();

    List<TransitionInfo> getTransitions(long j2);

    void setClockTime(long j2);

    void setState(TState tstate);

    void setStateParameters(Object obj, Object obj2);
}
