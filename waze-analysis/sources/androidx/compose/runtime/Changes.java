package androidx.compose.runtime;

import androidx.compose.runtime.composer.DebugStringFormattable;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class Changes extends DebugStringFormattable {
    public static final int $stable = 0;

    public abstract void clear();

    public abstract void execute(SlotStorage slotStorage, Applier<?> applier, RememberManager rememberManager, CompositionErrorContextImpl compositionErrorContextImpl);

    public abstract boolean isEmpty();

    public final boolean isNotEmpty() {
        return !isEmpty();
    }
}
