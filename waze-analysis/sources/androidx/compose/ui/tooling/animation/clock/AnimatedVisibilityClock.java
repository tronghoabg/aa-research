package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import h.a.i;
import h.b.a;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AnimatedVisibilityClock implements ComposeAnimationClock<AnimatedVisibilityComposeAnimation, AnimatedVisibilityState> {
    public static final int $stable = 8;
    private final AnimatedVisibilityComposeAnimation animation;
    private long currentClockTimeNanos;
    private String state;

    public AnimatedVisibilityClock(AnimatedVisibilityComposeAnimation animatedVisibilityComposeAnimation) {
        this.animation = animatedVisibilityComposeAnimation;
        this.state = getAnimation().getAnimationObject().getCurrentState().booleanValue() ? AnimatedVisibilityState.Companion.m11093getExitjXw82LU() : AnimatedVisibilityState.Companion.m11092getEnterjXw82LU();
    }

    /* renamed from: toCurrentTargetPair-7IW2chM, reason: not valid java name */
    private final k<Boolean, Boolean> m11082toCurrentTargetPair7IW2chM(String str) {
        boolean zM11088equalsimpl0 = AnimatedVisibilityState.m11088equalsimpl0(str, AnimatedVisibilityState.Companion.m11092getEnterjXw82LU());
        return new k<>(Boolean.valueOf(!zM11088equalsimpl0), Boolean.valueOf(zM11088equalsimpl0));
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        Transition<Object> childTransition = getAnimation().getChildTransition();
        if (childTransition == null) {
            return i.h();
        }
        List<Transition<?>.TransitionAnimationState<?, ?>> listAllAnimations = Utils_androidKt.allAnimations(childTransition);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listAllAnimations.iterator();
        while (it.hasNext()) {
            Transition.TransitionAnimationState transitionAnimationState = (Transition.TransitionAnimationState) it.next();
            String label = transitionAnimationState.getLabel();
            Object value = transitionAnimationState.getValue();
            ComposeAnimatedProperty composeAnimatedProperty = value == null ? null : new ComposeAnimatedProperty(label, value);
            if (composeAnimatedProperty != null) {
                arrayList.add(composeAnimatedProperty);
            }
        }
        List listAl = i.al(arrayList, new Comparator() { // from class: androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock$getAnimatedProperties$lambda$0$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return a.a(((ComposeAnimatedProperty) t).getLabel(), ((ComposeAnimatedProperty) t2).getLabel());
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listAl) {
            if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        Transition<Object> childTransition = getAnimation().getChildTransition();
        if (childTransition != null) {
            return Utils_androidKt.nanosToMillis(childTransition.getTotalDurationNanos());
        }
        return 0L;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        Transition<Object> childTransition = getAnimation().getChildTransition();
        if (childTransition != null) {
            return Utils_androidKt.nanosToMillis(childTransition.getTotalDurationNanos());
        }
        return 0L;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ ComposeAnimationState getState() {
        return AnimatedVisibilityState.m11085boximpl(m11083getStatejXw82LU());
    }

    /* renamed from: getState-jXw82LU, reason: not valid java name */
    public String m11083getStatejXw82LU() {
        return this.state;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<TransitionInfo> getTransitions(long j2) {
        Transition<Object> childTransition = getAnimation().getChildTransition();
        if (childTransition == null) {
            return i.h();
        }
        List<Transition<?>.TransitionAnimationState<?, ?>> listAllAnimations = Utils_androidKt.allAnimations(childTransition);
        ArrayList arrayList = new ArrayList(i.q(listAllAnimations, 10));
        Iterator<T> it = listAllAnimations.iterator();
        while (it.hasNext()) {
            arrayList.add(Utils_androidKt.createTransitionInfo((Transition.TransitionAnimationState) it.next(), j2));
        }
        List listAl = i.al(arrayList, new Comparator() { // from class: androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock$getTransitions$lambda$0$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return a.a(((TransitionInfo) t).getLabel(), ((TransitionInfo) t2).getLabel());
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listAl) {
            if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((TransitionInfo) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long j2) {
        this.currentClockTimeNanos = j2;
        Transition<Boolean> animationObject = getAnimation().getAnimationObject();
        k<Boolean, Boolean> kVarM11082toCurrentTargetPair7IW2chM = m11082toCurrentTargetPair7IW2chM(m11083getStatejXw82LU());
        Boolean bool = (Boolean) kVarM11082toCurrentTargetPair7IW2chM.a();
        bool.booleanValue();
        Boolean bool2 = (Boolean) kVarM11082toCurrentTargetPair7IW2chM.b();
        bool2.booleanValue();
        animationObject.seek(bool, bool2, j2);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ void setState(ComposeAnimationState composeAnimationState) {
        m11084setState7IW2chM(((AnimatedVisibilityState) composeAnimationState).m11091unboximpl());
    }

    /* renamed from: setState-7IW2chM, reason: not valid java name */
    public void m11084setState7IW2chM(String str) {
        this.state = str;
        setClockTime(this.currentClockTimeNanos);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(Object obj, Object obj2) {
        x.d(obj, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState");
        m11084setState7IW2chM(((AnimatedVisibilityState) obj).m11091unboximpl());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public AnimatedVisibilityComposeAnimation getAnimation() {
        return this.animation;
    }
}
