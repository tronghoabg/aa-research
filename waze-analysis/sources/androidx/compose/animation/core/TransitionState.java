package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class TransitionState<S> {
    public static final int $stable = 0;
    private final MutableState isRunning$delegate;

    private TransitionState() {
        this.isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    public abstract S getCurrentState();

    public abstract S getTargetState();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRunning$animation_core() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public abstract void setCurrentState$animation_core(S s);

    public final void setRunning$animation_core(boolean z) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z));
    }

    public abstract void setTargetState$animation_core(S s);

    public abstract void transitionConfigured$animation_core(Transition<S> transition);

    public abstract void transitionRemoved$animation_core();

    public /* synthetic */ TransitionState(o oVar) {
        this();
    }
}
