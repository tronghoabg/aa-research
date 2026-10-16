package androidx.navigationevent.compose;

import androidx.compose.runtime.HostDefaultKey;
import androidx.compose.runtime.ViewTreeHostDefaultKey;
import androidx.navigationevent.NavigationEventDispatcherOwner;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class LocalNavigationEventDispatcherOwner_androidKt {
    private static final HostDefaultKey<NavigationEventDispatcherOwner> NavigationEventDispatcherOwnerHostDefaultKey = new ViewTreeHostDefaultKey<NavigationEventDispatcherOwner>() { // from class: androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner_androidKt$NavigationEventDispatcherOwnerHostDefaultKey$1
        @Override // androidx.compose.runtime.ViewTreeHostDefaultKey
        public int getTagKey() {
            return com.waze.R.id.view_tree_navigation_event_dispatcher_owner;
        }
    };

    public static final HostDefaultKey<NavigationEventDispatcherOwner> getNavigationEventDispatcherOwnerHostDefaultKey() {
        return NavigationEventDispatcherOwnerHostDefaultKey;
    }
}
