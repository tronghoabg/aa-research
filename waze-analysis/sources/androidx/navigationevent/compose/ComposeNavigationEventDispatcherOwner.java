package androidx.navigationevent.compose;

import androidx.navigationevent.NavigationEventDispatcher;
import androidx.navigationevent.NavigationEventDispatcherOwner;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ComposeNavigationEventDispatcherOwner implements NavigationEventDispatcherOwner {
    private final NavigationEventDispatcher navigationEventDispatcher;

    public ComposeNavigationEventDispatcherOwner(NavigationEventDispatcher navigationEventDispatcher) {
        this.navigationEventDispatcher = navigationEventDispatcher;
    }

    @Override // androidx.navigationevent.NavigationEventDispatcherOwner
    public NavigationEventDispatcher getNavigationEventDispatcher() {
        return this.navigationEventDispatcher;
    }
}
