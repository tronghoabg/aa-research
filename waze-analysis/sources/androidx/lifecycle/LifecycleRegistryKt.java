package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LifecycleRegistryKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkLifecycleStateTransition(LifecycleOwner lifecycleOwner, Lifecycle.State state, Lifecycle.State state2) {
        if (state == Lifecycle.State.INITIALIZED && state2 == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("State must be at least '" + Lifecycle.State.CREATED + "' to be moved to '" + state2 + "' in component " + lifecycleOwner);
        }
        Lifecycle.State state3 = Lifecycle.State.DESTROYED;
        if (state != state3 || state == state2) {
            return;
        }
        throw new IllegalStateException("State is '" + state3 + "' and cannot be moved to `" + state2 + "` in component " + lifecycleOwner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Lifecycle.State min(Lifecycle.State state, Lifecycle.State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }
}
