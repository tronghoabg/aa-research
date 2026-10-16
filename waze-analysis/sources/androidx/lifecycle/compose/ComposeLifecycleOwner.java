package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ComposeLifecycleOwner implements LifecycleOwner {
    private final LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
    private Lifecycle.State maxLifecycleState;
    private Lifecycle.State parentLifecycleState;

    public ComposeLifecycleOwner() {
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.parentLifecycleState = state;
        this.maxLifecycleState = state;
    }

    private final void updateLifecycleState() {
        Lifecycle.State state = this.parentLifecycleState.ordinal() < this.maxLifecycleState.ordinal() ? this.parentLifecycleState : this.maxLifecycleState;
        if (this.lifecycleRegistry.getCurrentState() == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            return;
        }
        this.lifecycleRegistry.setCurrentState(state);
    }

    public final Lifecycle.State getMaxLifecycleState() {
        return this.maxLifecycleState;
    }

    public final void handleLifecycleEvent(Lifecycle.Event event) {
        this.parentLifecycleState = event.getTargetState();
        updateLifecycleState();
    }

    public final void setMaxLifecycleState(Lifecycle.State state) {
        this.maxLifecycleState = state;
        updateLifecycleState();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public LifecycleRegistry getLifecycle() {
        return this.lifecycleRegistry;
    }
}
