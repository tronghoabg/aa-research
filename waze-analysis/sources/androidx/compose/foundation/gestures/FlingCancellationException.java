package androidx.compose.foundation.gestures;

import androidx.compose.foundation.internal.PlatformOptimizedCancellationException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FlingCancellationException extends PlatformOptimizedCancellationException {
    public static final int $stable = 8;

    public FlingCancellationException() {
        super("The fling animation was cancelled");
    }
}
