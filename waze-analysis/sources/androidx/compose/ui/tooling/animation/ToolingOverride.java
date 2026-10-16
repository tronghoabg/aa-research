package androidx.compose.ui.tooling.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ToolingOverride<T> {
    public static final int $stable = 0;
    private final MutableState<State<T>> override;
    private final ToolingState<T> state;

    public ToolingOverride(MutableState<State<T>> mutableState, ToolingState<T> toolingState) {
        this.override = mutableState;
        this.state = toolingState;
    }

    public final void clearOverride() {
        this.override.setValue(null);
    }

    public final MutableState<State<T>> getOverride() {
        return this.override;
    }

    public final ToolingState<T> getState() {
        return this.state;
    }

    public final void overrideState() {
        this.override.setValue(this.state);
    }
}
