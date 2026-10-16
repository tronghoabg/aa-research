package androidx.navigation;

import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.navigation.NavDestination;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.m.k;
import h.n.o;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class Navigator<D extends NavDestination> {
    private final String _name;
    private NavigatorState _state;
    private boolean isAttached;

    /* compiled from: WazeSource */
    public interface Extras {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Name {
        String value();
    }

    public Navigator(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this._name = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final NavBackStackEntry navigate$lambda$0(Navigator navigator, NavOptions navOptions, Extras extras, NavBackStackEntry navBackStackEntry) {
        NavDestination navDestinationNavigate;
        x.f(navBackStackEntry, "backStackEntry");
        NavDestination destination = navBackStackEntry.getDestination();
        if (true != (destination instanceof NavDestination)) {
            destination = null;
        }
        if (destination == null || (navDestinationNavigate = navigator.navigate(destination, navBackStackEntry.getArguments(), navOptions, extras)) == null) {
            return null;
        }
        return !x.n(navDestinationNavigate, destination) ? navigator.getState().createBackStackEntry(navDestinationNavigate, navDestinationNavigate.addInDefaultArgs(navBackStackEntry.getArguments())) : navBackStackEntry;
    }

    static final ab onLaunchSingleTop$lambda$0(NavOptionsBuilder navOptionsBuilder) {
        x.f(navOptionsBuilder, "$this$navOptions");
        navOptionsBuilder.setLaunchSingleTop(true);
        return ab.f48028a;
    }

    public abstract D createDestination();

    public final String getName$navigation_common() {
        String str = this._name;
        if (str != null) {
            return str;
        }
        Class<?> cls = getClass();
        int i2 = ar.f48106a;
        String strC = new m(cls).c();
        x.c(strC);
        return o.y(strC, "Navigator");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final NavigatorState getState() {
        NavigatorState navigatorState = this._state;
        if (navigatorState != null) {
            return navigatorState;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    public void navigate(List<NavBackStackEntry> list, final NavOptions navOptions, final Extras extras) {
        x.f(list, "entries");
        Iterator it = k.l(k.o(i.av(list), new l() { // from class: androidx.navigation.Navigator$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Navigator.navigate$lambda$0(this.f$0, navOptions, extras, (NavBackStackEntry) obj);
            }
        })).iterator();
        while (it.hasNext()) {
            getState().push((NavBackStackEntry) it.next());
        }
    }

    public void onAttach(NavigatorState navigatorState) {
        x.f(navigatorState, "state");
        this._state = navigatorState;
        this.isAttached = true;
    }

    public void onLaunchSingleTop(NavBackStackEntry navBackStackEntry) {
        x.f(navBackStackEntry, "backStackEntry");
        NavDestination destination = navBackStackEntry.getDestination();
        if (true != (destination instanceof NavDestination)) {
            destination = null;
        }
        if (destination == null) {
            return;
        }
        navigate(destination, null, NavOptionsBuilderKt.navOptions(new l() { // from class: androidx.navigation.Navigator$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Navigator.onLaunchSingleTop$lambda$0((NavOptionsBuilder) obj);
            }
        }), null);
        getState().onLaunchSingleTop(navBackStackEntry);
    }

    public void onRestoreState(Bundle bundle) {
        x.f(bundle, "savedState");
    }

    public Bundle onSaveState() {
        return null;
    }

    public void popBackStack(NavBackStackEntry navBackStackEntry, boolean z) {
        x.f(navBackStackEntry, "popUpTo");
        List list = (List) getState().getBackStack().d();
        if (!list.contains(navBackStackEntry)) {
            throw new IllegalStateException("popBackStack was called with " + navBackStackEntry + " which does not exist in back stack " + list);
        }
        ListIterator listIterator = list.listIterator(list.size());
        NavBackStackEntry navBackStackEntry2 = null;
        while (popBackStack()) {
            navBackStackEntry2 = (NavBackStackEntry) listIterator.previous();
            if (x.n(navBackStackEntry2, navBackStackEntry)) {
                break;
            }
        }
        if (navBackStackEntry2 != null) {
            getState().pop(navBackStackEntry2, z);
        }
    }

    public Navigator() {
        this._name = null;
    }

    public NavDestination navigate(D d2, Bundle bundle, NavOptions navOptions, Extras extras) {
        x.f(d2, "destination");
        return d2;
    }

    public boolean popBackStack() {
        return true;
    }
}
