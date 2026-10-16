package androidx.compose.animation.core;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DeferredTransition<S> extends Transition<S> {
    public static final int $stable = 0;

    public /* synthetic */ DeferredTransition(DeferredTransitionState deferredTransitionState, String str, int i2, o oVar) {
        this(deferredTransitionState, (i2 & 2) != 0 ? null : str);
    }

    public DeferredTransition(DeferredTransitionState<S> deferredTransitionState, String str) {
        super(deferredTransitionState, null, str);
    }
}
