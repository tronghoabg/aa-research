package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionObserver;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CompositionObserverHolder {
    public static final int $stable = 8;
    private CompositionObserver observer;
    private final CompositionContext parent;
    private boolean root;

    public /* synthetic */ CompositionObserverHolder(CompositionObserver compositionObserver, boolean z, CompositionContext compositionContext, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : compositionObserver, z & ((i2 & 2) == 0), compositionContext);
    }

    public final CompositionObserver current() {
        if (this.root) {
            return this.observer;
        }
        CompositionObserverHolder observerHolder$runtime = this.parent.getObserverHolder$runtime();
        CompositionObserver compositionObserver = observerHolder$runtime != null ? observerHolder$runtime.observer : null;
        if (x.n(compositionObserver, this.observer)) {
            return compositionObserver;
        }
        this.observer = compositionObserver;
        return compositionObserver;
    }

    public final CompositionObserver getObserver() {
        return this.observer;
    }

    public final boolean getRoot() {
        return this.root;
    }

    public final void setObserver(CompositionObserver compositionObserver) {
        this.observer = compositionObserver;
    }

    public final void setRoot(boolean z) {
        this.root = z;
    }

    public CompositionObserverHolder(CompositionObserver compositionObserver, boolean z, CompositionContext compositionContext) {
        this.observer = compositionObserver;
        this.root = z;
        this.parent = compositionContext;
    }
}
