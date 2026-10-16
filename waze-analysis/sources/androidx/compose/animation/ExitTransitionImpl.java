package androidx.compose.animation;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ExitTransitionImpl extends ExitTransition {
    private final TransitionData data;

    public ExitTransitionImpl(TransitionData transitionData) {
        super(null);
        this.data = transitionData;
    }

    @Override // androidx.compose.animation.ExitTransition
    public TransitionData getData$animation() {
        return this.data;
    }
}
