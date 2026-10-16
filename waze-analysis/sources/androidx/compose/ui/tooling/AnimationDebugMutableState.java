package androidx.compose.ui.tooling;

import androidx.compose.runtime.MutableState;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AnimationDebugMutableState<T> implements MutableState<T> {
    public static final int $stable = 0;
    private final /* synthetic */ MutableState<T> $$delegate_0;
    private final String label;
    private final a<Set<T>> states;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimationDebugMutableState(MutableState<T> mutableState, a<? extends Set<? extends T>> aVar, String str) {
        this.$$delegate_0 = mutableState;
        this.states = aVar;
        this.label = str;
    }

    @Override // androidx.compose.runtime.MutableState
    public T component1() {
        return this.$$delegate_0.component1();
    }

    @Override // androidx.compose.runtime.MutableState
    public l<T, ab> component2() {
        return this.$$delegate_0.component2();
    }

    public final String getLabel() {
        return this.label;
    }

    public final a<Set<T>> getStates() {
        return this.states;
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public T getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public void setValue(T t) {
        this.$$delegate_0.setValue(t);
    }
}
