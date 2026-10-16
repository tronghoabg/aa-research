package androidx.compose.ui.tooling.animation;

import android.util.Log;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock;
import androidx.compose.ui.tooling.animation.clock.Utils_androidKt;
import androidx.compose.ui.tooling.animation.search.SearchInfo;
import androidx.compose.ui.tooling.animation.search.UnsupportedSearchInfo;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class PreviewAnimationClock {
    public static final int $stable = 8;
    private final boolean DEBUG;
    private final a<ab> applySnapshot;
    private final a<ab> requestLayout;
    private final String TAG = "PreviewAnimationClock";
    private final Map<ComposeAnimation, ComposeAnimationClock<?, ?>> animationClocks = new LinkedHashMap();
    private final PreviewAnimationClock$clockInfo$1 clockInfo = new ClockInfo() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$clockInfo$1
        @Override // androidx.compose.ui.tooling.animation.ClockInfo
        public long getMaxDurationPerIterationMillis() {
            return this.this$0.getMaxDurationPerIteration();
        }

        @Override // androidx.compose.ui.tooling.animation.ClockInfo
        public void requestLayout() {
            this.this$0.requestLayout.invoke();
        }
    };
    private final Map<Object, TriggerComposeAnimation<?>> triggersToTrack = new LinkedHashMap();
    private final LinkedHashSet<UnsupportedComposeAnimation> trackedUnsupportedAnimations = new LinkedHashSet<>();
    private final LinkedHashSet<Object> trackedAnimations = new LinkedHashSet<>();
    private final Object lock = new Object();

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.tooling.animation.PreviewAnimationClock$clockInfo$1] */
    public PreviewAnimationClock(a<ab> aVar, a<ab> aVar2) {
        this.requestLayout = aVar;
        this.applySnapshot = aVar2;
    }

    public static /* synthetic */ void getAnimationClocks$ui_tooling$annotations() {
    }

    public static /* synthetic */ void getTrackedUnsupportedAnimations$annotations() {
    }

    public static /* synthetic */ void getTriggersToTrack$ui_tooling$annotations() {
    }

    private final boolean trackAnimation(Object obj, l<Object, ab> lVar) {
        synchronized (this.lock) {
            if (this.trackedAnimations.contains(obj)) {
                if (this.DEBUG) {
                    Log.d(this.TAG, "Animation " + obj + " is already being tracked");
                }
                return false;
            }
            this.trackedAnimations.add(obj);
            lVar.invoke(obj);
            if (!this.DEBUG) {
                return true;
            }
            Log.d(this.TAG, "Animation " + obj + " is now tracked");
            return true;
        }
    }

    static final ab trackComposeAnimation$lambda$0(SearchInfo searchInfo, PreviewAnimationClock previewAnimationClock, Object obj) {
        ComposeAnimation composeAnimationCreateAnimation;
        SearchInfo searchInfo2 = true != (searchInfo instanceof UnsupportedSearchInfo) ? searchInfo : null;
        if (searchInfo2 == null || (composeAnimationCreateAnimation = searchInfo2.createAnimation()) == null) {
            UnsupportedComposeAnimation unsupportedComposeAnimationCreate = UnsupportedComposeAnimation.Companion.create(searchInfo.getLabel());
            if (unsupportedComposeAnimationCreate != null) {
                previewAnimationClock.trackedUnsupportedAnimations.add(unsupportedComposeAnimationCreate);
                previewAnimationClock.notifySubscribe(unsupportedComposeAnimationCreate);
            }
            return ab.f48028a;
        }
        Map<ComposeAnimation, ComposeAnimationClock<?, ?>> map = previewAnimationClock.animationClocks;
        ComposeAnimationClock<?, ?> composeAnimationClockCreateClock = searchInfo.createClock(composeAnimationCreateAnimation, previewAnimationClock.clockInfo);
        composeAnimationClockCreateClock.setClockTime(0L);
        map.put(composeAnimationCreateAnimation, composeAnimationClockCreateClock);
        previewAnimationClock.notifySubscribe(composeAnimationCreateAnimation);
        return ab.f48028a;
    }

    public final void dispose() {
        Iterator<Map.Entry<ComposeAnimation, ComposeAnimationClock<?, ?>>> it = this.animationClocks.entrySet().iterator();
        while (it.hasNext()) {
            notifyUnsubscribe(it.next().getKey());
        }
        Iterator<T> it2 = this.trackedUnsupportedAnimations.iterator();
        while (it2.hasNext()) {
            notifyUnsubscribe((UnsupportedComposeAnimation) it2.next());
        }
        this.trackedUnsupportedAnimations.clear();
        this.triggersToTrack.clear();
        this.animationClocks.clear();
        this.trackedAnimations.clear();
    }

    public final List<ComposeAnimatedProperty> getAnimatedProperties(ComposeAnimation composeAnimation) {
        List<ComposeAnimatedProperty> animatedProperties;
        ComposeAnimationClock<?, ?> composeAnimationClock = this.animationClocks.get(composeAnimation);
        return (composeAnimationClock == null || (animatedProperties = composeAnimationClock.getAnimatedProperties()) == null) ? i.h() : animatedProperties;
    }

    /* renamed from: getAnimatedVisibilityState-cc2g1to, reason: not valid java name */
    public final String m11081getAnimatedVisibilityStatecc2g1to(ComposeAnimation composeAnimation) {
        ComposeAnimationClock<?, ?> composeAnimationClock = this.animationClocks.get(composeAnimation);
        ComposeAnimationState state = composeAnimationClock != null ? composeAnimationClock.getState() : null;
        String strM11091unboximpl = state instanceof AnimatedVisibilityState ? ((AnimatedVisibilityState) state).m11091unboximpl() : null;
        return strM11091unboximpl == null ? AnimatedVisibilityState.Companion.m11092getEnterjXw82LU() : strM11091unboximpl;
    }

    public final Map<ComposeAnimation, ComposeAnimationClock<?, ?>> getAnimationClocks$ui_tooling() {
        return this.animationClocks;
    }

    public final long getMaxDuration() {
        Long l2;
        Iterator<T> it = this.animationClocks.values().iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDuration());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDuration());
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l2 = lValueOf;
        } else {
            l2 = null;
        }
        Long l3 = l2;
        if (l3 != null) {
            return l3.longValue();
        }
        return 0L;
    }

    public final long getMaxDurationPerIteration() {
        Long l2;
        Iterator<T> it = this.animationClocks.values().iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDurationPerIteration());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDurationPerIteration());
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l2 = lValueOf;
        } else {
            l2 = null;
        }
        Long l3 = l2;
        if (l3 != null) {
            return l3.longValue();
        }
        return 0L;
    }

    public final LinkedHashSet<UnsupportedComposeAnimation> getTrackedUnsupportedAnimations() {
        return this.trackedUnsupportedAnimations;
    }

    public final List<TransitionInfo> getTransitions(ComposeAnimation composeAnimation, long j2) {
        List<TransitionInfo> transitions;
        ComposeAnimationClock<?, ?> composeAnimationClock = this.animationClocks.get(composeAnimation);
        return (composeAnimationClock == null || (transitions = composeAnimationClock.getTransitions(j2)) == null) ? i.h() : transitions;
    }

    public final Map<Object, TriggerComposeAnimation<?>> getTriggersToTrack$ui_tooling() {
        return this.triggersToTrack;
    }

    protected void notifySubscribe(ComposeAnimation composeAnimation) {
    }

    protected void notifyUnsubscribe(ComposeAnimation composeAnimation) {
    }

    public final void setClockTime(long j2) {
        int i2 = Utils_androidKt.f1680a;
        Iterator<T> it = this.animationClocks.values().iterator();
        while (it.hasNext()) {
            ((ComposeAnimationClock) it.next()).setClockTime(Utils_androidKt.millisToNanos(j2));
        }
        this.applySnapshot.invoke();
    }

    public final void setClockTimes(Map<ComposeAnimation, Long> map) {
        for (Map.Entry<ComposeAnimation, Long> entry : map.entrySet()) {
            ComposeAnimation key = entry.getKey();
            long jLongValue = entry.getValue().longValue();
            ComposeAnimationClock<?, ?> composeAnimationClock = this.animationClocks.get(key);
            if (composeAnimationClock != null) {
                composeAnimationClock.setClockTime(Utils_androidKt.millisToNanos(jLongValue));
            }
        }
        this.applySnapshot.invoke();
    }

    public final <AnimationType extends ComposeAnimation> void trackComposeAnimation(final SearchInfo<AnimationType, ?> searchInfo) {
        trackAnimation(searchInfo.getAnimationObject(), new l() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return PreviewAnimationClock.trackComposeAnimation$lambda$0(searchInfo, this, obj);
            }
        });
    }

    public final void trackTrigger(TriggerComposeAnimation<?> triggerComposeAnimation) {
        this.triggersToTrack.put(triggerComposeAnimation.getAnimationObject(), triggerComposeAnimation);
    }

    public final void updateAnimatedVisibilityState(ComposeAnimation composeAnimation, Object obj) {
        ComposeAnimationClock<?, ?> composeAnimationClock = this.animationClocks.get(composeAnimation);
        if (composeAnimationClock != null) {
            ComposeAnimationClock.CC.setStateParameters$default(composeAnimationClock, obj, null, 2, null);
        }
    }

    public final void updateFromAndToStates(ComposeAnimation composeAnimation, Object obj, Object obj2) {
        ComposeAnimationClock<?, ?> composeAnimationClock = this.animationClocks.get(composeAnimation);
        if (composeAnimationClock != null) {
            composeAnimationClock.setStateParameters(obj, obj2);
        }
    }
}
