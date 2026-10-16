package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation;
import androidx.compose.ui.tooling.animation.states.TargetState;
import h.a.i;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class InfiniteTransitionClock implements ComposeAnimationClock<InfiniteTransitionComposeAnimation, TargetState<Object>> {
    public static final int $stable = 8;
    private final InfiniteTransitionComposeAnimation animation;
    private final a<Long> maxDuration;
    private TargetState<Object> state;

    public InfiniteTransitionClock(InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation, a<Long> aVar) {
        this.animation = infiniteTransitionComposeAnimation;
        this.maxDuration = aVar;
        this.state = new TargetState<>(0, 0);
    }

    static final long _init_$lambda$0() {
        return 0L;
    }

    private final <T, V extends AnimationVector> long getIterationDuration(InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState) {
        AnimationSpec<T> animationSpec = transitionAnimationState.getAnimationSpec();
        x.d(animationSpec, "null cannot be cast to non-null type androidx.compose.animation.core.InfiniteRepeatableSpec<T of androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock.getIterationDuration>");
        InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) animationSpec;
        RepeatMode repeatMode = infiniteRepeatableSpec.getRepeatMode();
        RepeatMode repeatMode2 = RepeatMode.Reverse;
        VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpecVectorize = infiniteRepeatableSpec.getAnimation().vectorize((TwoWayConverter) transitionAnimationState.getTypeConverter());
        return Utils_androidKt.millisToNanos(vectorizedDurationBasedAnimationSpecVectorize.getDelayMillis() + (vectorizedDurationBasedAnimationSpecVectorize.getDurationMillis() * (repeatMode == repeatMode2 ? 2 : 1)));
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        List<InfiniteTransition.TransitionAnimationState<?, ?>> animations = getAnimation().getAnimationObject().getAnimations();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = animations.iterator();
        while (it.hasNext()) {
            InfiniteTransition.TransitionAnimationState transitionAnimationState = (InfiniteTransition.TransitionAnimationState) it.next();
            Object value = transitionAnimationState.getValue();
            ComposeAnimatedProperty composeAnimatedProperty = value == null ? null : new ComposeAnimatedProperty(transitionAnimationState.getLabel(), value);
            if (composeAnimatedProperty != null) {
                arrayList.add(composeAnimatedProperty);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return Math.max(getMaxDurationPerIteration(), this.maxDuration.invoke().longValue());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        Long l2;
        Iterator<T> it = getAnimation().getAnimationObject().getAnimations().iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(getIterationDuration((InfiniteTransition.TransitionAnimationState) it.next()));
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(getIterationDuration((InfiniteTransition.TransitionAnimationState) it.next()));
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l2 = lValueOf;
        } else {
            l2 = null;
        }
        Long l3 = l2;
        return Utils_androidKt.nanosToMillis(l3 != null ? l3.longValue() : 0L);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<TransitionInfo> getTransitions(long j2) {
        List<InfiniteTransition.TransitionAnimationState<?, ?>> animations = getAnimation().getAnimationObject().getAnimations();
        ArrayList arrayList = new ArrayList(i.q(animations, 10));
        Iterator<T> it = animations.iterator();
        while (it.hasNext()) {
            arrayList.add(Utils_androidKt.createTransitionInfo((InfiniteTransition.TransitionAnimationState) it.next(), j2, getMaxDuration()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((TransitionInfo) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return i.ao(arrayList2);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long j2) {
        getAnimation().setTimeNanos(j2);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(Object obj, Object obj2) {
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setState(TargetState<Object> targetState) {
        this.state = targetState;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public InfiniteTransitionComposeAnimation getAnimation() {
        return this.animation;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public TargetState<Object> getState() {
        return this.state;
    }

    public /* synthetic */ InfiniteTransitionClock(InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation, a aVar, int i2, o oVar) {
        this(infiniteTransitionComposeAnimation, (i2 & 2) != 0 ? new a() { // from class: androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return 0L;
            }
        } : aVar);
    }
}
