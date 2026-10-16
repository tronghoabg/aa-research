package androidx.compose.ui.tooling.animation.states;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TargetState<T> implements ComposeAnimationState {
    public static final int $stable = 0;
    private final T initial;
    private final T target;

    public TargetState(T t, T t2) {
        this.initial = t;
        this.target = t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TargetState copy$default(TargetState targetState, Object obj, Object obj2, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = targetState.initial;
        }
        if ((i2 & 2) != 0) {
            obj2 = targetState.target;
        }
        return targetState.copy(obj, obj2);
    }

    public final T component1() {
        return this.initial;
    }

    public final T component2() {
        return this.target;
    }

    public final TargetState<T> copy(T t, T t2) {
        return new TargetState<>(t, t2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TargetState)) {
            return false;
        }
        TargetState targetState = (TargetState) obj;
        return x.n(this.initial, targetState.initial) && x.n(this.target, targetState.target);
    }

    public final T getInitial() {
        return this.initial;
    }

    public final T getTarget() {
        return this.target;
    }

    public int hashCode() {
        T t = this.initial;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.target;
        return (iHashCode * 31) + (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "TargetState(initial=" + this.initial + ", target=" + this.target + ')';
    }
}
