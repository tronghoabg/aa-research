package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TransitionKt$animateValue$animationSpec$1$1 implements a<Transition.Segment> {
    final /* synthetic */ Transition $this_animateValue;

    public TransitionKt$animateValue$animationSpec$1$1(Transition transition) {
        this.$this_animateValue = transition;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.g.a.a
    public final Transition.Segment invoke() {
        return this.$this_animateValue.getSegment();
    }
}
