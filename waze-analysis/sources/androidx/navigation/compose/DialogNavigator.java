package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import h.a.i;
import h.ab;
import h.g.a.q;
import h.g.b.o;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
@Navigator.Name(DialogNavigator.NAME)
/* loaded from: classes3.dex */
public final class DialogNavigator extends Navigator<Destination> {
    public static final String NAME = "dialog";
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public DialogNavigator() {
        super(NAME);
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this, null, ComposableSingletons$DialogNavigatorKt.INSTANCE.m13222getLambda$1092249270$navigation_compose(), 2, null);
    }

    public final void dismiss$navigation_compose(NavBackStackEntry navBackStackEntry) {
        popBackStack(navBackStackEntry, false);
    }

    public final ch<List<NavBackStackEntry>> getBackStack$navigation_compose() {
        return getState().getBackStack();
    }

    public final ch<Set<NavBackStackEntry>> getTransitionInProgress$navigation_compose() {
        return getState().getTransitionsInProgress();
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            getState().push((NavBackStackEntry) it.next());
        }
    }

    public final void onTransitionComplete$navigation_compose(NavBackStackEntry navBackStackEntry) {
        getState().markTransitionComplete(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(NavBackStackEntry navBackStackEntry, boolean z) {
        getState().popWithTransition(navBackStackEntry, z);
        int iH = i.H((Iterable) getState().getTransitionsInProgress().d(), navBackStackEntry);
        int i2 = 0;
        for (Object obj : (Iterable) getState().getTransitionsInProgress().d()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i.p();
            }
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
            if (i2 > iH) {
                onTransitionComplete$navigation_compose(navBackStackEntry2);
            }
            i2 = i3;
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class Destination extends NavDestination implements FloatingWindow {
        public static final int $stable = 8;
        private final q<NavBackStackEntry, Composer, Integer, ab> content;
        private final DialogProperties dialogProperties;

        public /* synthetic */ Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, q qVar, int i2, o oVar) {
            this(dialogNavigator, (i2 & 2) != 0 ? new DialogProperties(false, false, false, 7, (o) null) : dialogProperties, qVar);
        }

        public final q<NavBackStackEntry, Composer, Integer, ab> getContent$navigation_compose() {
            return this.content;
        }

        public final DialogProperties getDialogProperties$navigation_compose() {
            return this.dialogProperties;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, q<? super NavBackStackEntry, ? super Composer, ? super Integer, ab> qVar) {
            super(dialogNavigator);
            this.dialogProperties = dialogProperties;
            this.content = qVar;
        }
    }
}
