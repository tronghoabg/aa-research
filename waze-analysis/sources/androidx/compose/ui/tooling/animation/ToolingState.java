package androidx.compose.ui.tooling.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ToolingState<T> implements State<T> {
    public static final int $stable = 0;
    private final MutableState value$delegate;

    public ToolingState(T t) {
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return this.value$delegate.getValue();
    }

    public void setValue(T t) {
        this.value$delegate.setValue(t);
    }
}
