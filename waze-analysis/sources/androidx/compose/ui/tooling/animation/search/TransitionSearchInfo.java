package androidx.compose.ui.tooling.animation.search;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.tooling.animation.ClockInfo;
import androidx.compose.ui.tooling.animation.TransitionComposeAnimation;
import androidx.compose.ui.tooling.animation.TransitionComposeAnimation_androidKt;
import androidx.compose.ui.tooling.animation.clock.TransitionClock;
import h.g.b.ar;
import h.g.b.m;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TransitionSearchInfo extends TransitionBasedSearchInfo<TransitionComposeAnimation<?>> {
    public static final int $stable = 8;

    public TransitionSearchInfo(Transition<?> transition) {
        super(transition);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public String getLabel() {
        String label = getTransition().getLabel();
        if (label == null) {
            Object targetState = getTransition().getTargetState();
            label = null;
            if (targetState == null) {
                targetState = null;
            }
            if (targetState != null) {
                int i2 = ar.f48106a;
                label = new m(targetState.getClass()).c();
            }
            if (label == null) {
                return "updateTransition";
            }
        }
        return label;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public TransitionComposeAnimation<?> createAnimation() {
        return TransitionComposeAnimation_androidKt.parse(this);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public TransitionClock<?> createClock(TransitionComposeAnimation<?> transitionComposeAnimation, ClockInfo clockInfo) {
        return new TransitionClock<>(transitionComposeAnimation);
    }
}
