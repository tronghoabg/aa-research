package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.internal.NavBackStackEntryStateImpl;
import androidx.navigation.internal.NavContext;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NavBackStackEntryState {
    private final NavBackStackEntryStateImpl impl;

    public NavBackStackEntryState(Bundle bundle) {
        x.f(bundle, "state");
        bundle.setClassLoader(getClass().getClassLoader());
        this.impl = new NavBackStackEntryStateImpl(bundle);
    }

    public final Bundle getArgs() {
        return this.impl.getArgs$navigation_runtime();
    }

    public final int getDestinationId() {
        return this.impl.getDestinationId$navigation_runtime();
    }

    public final String getId() {
        return this.impl.getId$navigation_runtime();
    }

    public final Bundle getSavedState() {
        return this.impl.getSavedState$navigation_runtime();
    }

    public final NavBackStackEntry instantiate(NavContext navContext, NavDestination navDestination, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider) {
        x.f(navContext, "context");
        x.f(navDestination, "destination");
        x.f(state, "hostLifecycleState");
        Bundle args = getArgs();
        if (args != null) {
            prepareArgs(args, navContext);
        } else {
            args = null;
        }
        return this.impl.instantiate(navContext, navDestination, args, state, navViewModelStoreProvider);
    }

    public final Bundle prepareArgs(Bundle bundle, NavContext navContext) {
        x.f(bundle, "args");
        x.f(navContext, "context");
        Context context = navContext.getContext();
        bundle.setClassLoader(context != null ? context.getClassLoader() : null);
        return bundle;
    }

    public final Bundle writeToState() {
        return this.impl.writeToState$navigation_runtime();
    }

    public NavBackStackEntryState(NavBackStackEntry navBackStackEntry) {
        x.f(navBackStackEntry, "entry");
        this.impl = new NavBackStackEntryStateImpl(navBackStackEntry, navBackStackEntry.getDestination().getId());
    }
}
