package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.Navigator;
import h.g.b.x;

/* compiled from: WazeSource */
@Navigator.Name("NoOp")
/* loaded from: classes3.dex */
public final class NoOpNavigator extends Navigator<NavDestination> {
    public NoOpNavigator() {
        super("NoOp");
    }

    @Override // androidx.navigation.Navigator
    public NavDestination createDestination() {
        return new NavDestination(this);
    }

    @Override // androidx.navigation.Navigator
    public NavDestination navigate(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        x.f(navDestination, "destination");
        return navDestination;
    }

    @Override // androidx.navigation.Navigator
    public boolean popBackStack() {
        return true;
    }
}
