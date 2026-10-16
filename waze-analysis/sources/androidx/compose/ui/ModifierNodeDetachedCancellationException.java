package androidx.compose.ui;

import androidx.compose.ui.internal.PlatformOptimizedCancellationException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ModifierNodeDetachedCancellationException extends PlatformOptimizedCancellationException {
    public static final int $stable = 8;

    public ModifierNodeDetachedCancellationException() {
        super("The Modifier.Node was detached");
    }
}
