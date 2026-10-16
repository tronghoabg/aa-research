package androidx.activity.compose.internal;

import androidx.activity.OnBackPressedDispatcher;
import androidx.navigationevent.NavigationEventDispatcher;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class BackHandlerDispatcherCompat {
    public static final int $stable = 8;
    private final NavigationEventDispatcher navigationEventDispatcher;
    private final OnBackPressedDispatcher onBackPressedDispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public BackHandlerDispatcherCompat(NavigationEventDispatcher navigationEventDispatcher, OnBackPressedDispatcher onBackPressedDispatcher) {
        this.navigationEventDispatcher = navigationEventDispatcher;
        this.onBackPressedDispatcher = onBackPressedDispatcher;
        if ((navigationEventDispatcher == null ? onBackPressedDispatcher : navigationEventDispatcher) == null) {
            throw new IllegalArgumentException("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        }
    }

    public final void addHandler(BackHandlerCompat backHandlerCompat) {
        NavigationEventDispatcher navigationEventDispatcher = this.navigationEventDispatcher;
        if (navigationEventDispatcher != null) {
            NavigationEventDispatcher.addHandler$default(navigationEventDispatcher, backHandlerCompat.getNavigationEventHandler(), 0, 2, null);
            return;
        }
        OnBackPressedDispatcher onBackPressedDispatcher = this.onBackPressedDispatcher;
        if (onBackPressedDispatcher == null) {
            throw new IllegalStateException("Unreachable");
        }
        onBackPressedDispatcher.addCallback(backHandlerCompat.getOnBackPressedCallback());
    }

    public final void removeHandler(BackHandlerCompat backHandlerCompat) throws Exception {
        if (this.navigationEventDispatcher != null) {
            backHandlerCompat.getNavigationEventHandler().remove();
        } else {
            if (this.onBackPressedDispatcher == null) {
                throw new IllegalStateException("Unreachable");
            }
            backHandlerCompat.getOnBackPressedCallback().remove();
        }
    }
}
