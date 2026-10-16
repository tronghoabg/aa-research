package androidx.compose.animation;

import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PendingAnimatedContentTransitionScope<S> implements AnimatedContentTransitionScope<S> {
    public static final int $stable = 0;
    private final /* synthetic */ AnimatedContentTransitionScope<S> $$delegate_0;
    private final S overrideInitialState;
    private final S overrideTargetState;

    public PendingAnimatedContentTransitionScope(AnimatedContentTransitionScope<S> animatedContentTransitionScope, S s, S s2) {
        this.$$delegate_0 = animatedContentTransitionScope;
        this.overrideInitialState = s;
        this.overrideTargetState = s2;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public Alignment getContentAlignment() {
        return this.$$delegate_0.getContentAlignment();
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.overrideInitialState;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public ExitTransition getKeepUntilTransitionsFinished(ExitTransition.Companion companion) {
        return this.$$delegate_0.getKeepUntilTransitionsFinished(companion);
    }

    public final S getOverrideInitialState() {
        return this.overrideInitialState;
    }

    public final S getOverrideTargetState() {
        return this.overrideTargetState;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.overrideTargetState;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public boolean isTransitioningTo(S s, S s2) {
        return this.$$delegate_0.isTransitioningTo(s, s2);
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* renamed from: slideIntoContainer-mOhB8PU */
    public EnterTransition mo1705slideIntoContainermOhB8PU(int i2, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, l<? super Integer, Integer> lVar) {
        return this.$$delegate_0.mo1705slideIntoContainermOhB8PU(i2, finiteAnimationSpec, lVar);
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* renamed from: slideOutOfContainer-mOhB8PU */
    public ExitTransition mo1706slideOutOfContainermOhB8PU(int i2, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, l<? super Integer, Integer> lVar) {
        return this.$$delegate_0.mo1706slideOutOfContainermOhB8PU(i2, finiteAnimationSpec, lVar);
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform) {
        return this.$$delegate_0.using(contentTransform, sizeTransform);
    }
}
