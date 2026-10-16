package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.app.ab;
import android.support.v4.app.ar;
import android.support.v4.app.bv;
import android.support.v4.app.bz;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.NavigatorState;
import androidx.navigation.compose.DialogNavigator;
import h.a.i;
import h.g.b.au;
import h.g.b.o;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
@Navigator.Name(DialogNavigator.NAME)
/* loaded from: classes.dex */
public final class DialogFragmentNavigator extends Navigator<Destination> {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "DialogFragmentNavigator";
    private final Context context;
    private final bv fragmentManager;
    private final DialogFragmentNavigator$observer$1 observer;
    private final Set<String> restoredTagsAwaitingAttach;
    private final Map<String, ab> transitioningFragments;

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.navigation.fragment.DialogFragmentNavigator$observer$1] */
    public DialogFragmentNavigator(Context context, bv bvVar) {
        x.f(context, "context");
        x.f(bvVar, "fragmentManager");
        this.context = context;
        this.fragmentManager = bvVar;
        this.restoredTagsAwaitingAttach = new LinkedHashSet();
        this.observer = new LifecycleEventObserver() { // from class: androidx.navigation.fragment.DialogFragmentNavigator$observer$1

            /* compiled from: WazeSource */
            /* loaded from: classes3.dex */
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                int iNextIndex;
                x.f(lifecycleOwner, "source");
                x.f(event, NotificationCompat.CATEGORY_EVENT);
                Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
                int iOrdinal = event.ordinal();
                if (iOrdinal == 0) {
                    ab abVar = (ab) lifecycleOwner;
                    Iterable iterable = (Iterable) this.this$0.getState().getBackStack().d();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (x.n(((NavBackStackEntry) it.next()).getId(), abVar.getTag())) {
                                return;
                            }
                        }
                    }
                    abVar.dismiss();
                    return;
                }
                Object obj = null;
                if (iOrdinal == 2) {
                    ab abVar2 = (ab) lifecycleOwner;
                    for (Object obj2 : (Iterable) this.this$0.getState().getTransitionsInProgress().d()) {
                        if (x.n(((NavBackStackEntry) obj2).getId(), abVar2.getTag())) {
                            obj = obj2;
                        }
                    }
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                    if (navBackStackEntry != null) {
                        this.this$0.getState().markTransitionComplete(navBackStackEntry);
                        return;
                    }
                    return;
                }
                if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        return;
                    }
                    ab abVar3 = (ab) lifecycleOwner;
                    for (Object obj3 : (Iterable) this.this$0.getState().getTransitionsInProgress().d()) {
                        if (x.n(((NavBackStackEntry) obj3).getId(), abVar3.getTag())) {
                            obj = obj3;
                        }
                    }
                    NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
                    if (navBackStackEntry2 != null) {
                        this.this$0.getState().markTransitionComplete(navBackStackEntry2);
                    }
                    abVar3.getLifecycle().removeObserver(this);
                    return;
                }
                ab abVar4 = (ab) lifecycleOwner;
                if (abVar4.requireDialog().isShowing()) {
                    return;
                }
                List list = (List) this.this$0.getState().getBackStack().d();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (x.n(((NavBackStackEntry) listIterator.previous()).getId(), abVar4.getTag())) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) i.S(list, iNextIndex);
                if (!x.n(i.U(list), navBackStackEntry3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + abVar4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (navBackStackEntry3 != null) {
                    this.this$0.popWithTransition(iNextIndex, navBackStackEntry3, false);
                }
            }
        };
        this.transitioningFragments = new LinkedHashMap();
    }

    private final ab createDialogFragment(NavBackStackEntry navBackStackEntry) {
        NavDestination destination = navBackStackEntry.getDestination();
        x.d(destination, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        Destination destination2 = (Destination) destination;
        String className = destination2.getClassName();
        if (className.charAt(0) == '.') {
            className = String.valueOf(this.context.getPackageName()).concat(className);
        }
        ar arVarA = this.fragmentManager.o().a(this.context.getClassLoader(), className);
        x.e(arVarA, "instantiate(...)");
        if (ab.class.isAssignableFrom(arVarA.getClass())) {
            ab abVar = (ab) arVarA;
            abVar.setArguments(navBackStackEntry.getArguments());
            abVar.getLifecycle().addObserver(this.observer);
            this.transitioningFragments.put(navBackStackEntry.getId(), abVar);
            return abVar;
        }
        throw new IllegalArgumentException("Dialog destination " + destination2.getClassName() + " is not an instance of DialogFragment");
    }

    private final void navigate(NavBackStackEntry navBackStackEntry) {
        createDialogFragment(navBackStackEntry).show(this.fragmentManager, navBackStackEntry.getId());
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) i.U((List) getState().getBackStack().d());
        boolean zAx = i.ax((Iterable) getState().getTransitionsInProgress().d(), navBackStackEntry2);
        getState().pushWithTransition(navBackStackEntry);
        if (navBackStackEntry2 == null || zAx) {
            return;
        }
        getState().markTransitionComplete(navBackStackEntry2);
    }

    static final void onAttach$lambda$0(DialogFragmentNavigator dialogFragmentNavigator, bv bvVar, ar arVar) {
        x.f(bvVar, "<unused var>");
        x.f(arVar, "childFragment");
        Set<String> set = dialogFragmentNavigator.restoredTagsAwaitingAttach;
        if (au.b(set).remove(arVar.getTag())) {
            arVar.getLifecycle().addObserver(dialogFragmentNavigator.observer);
        }
        Map<String, ab> map = dialogFragmentNavigator.transitioningFragments;
        au.c(map).remove(arVar.getTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void popWithTransition(int i2, NavBackStackEntry navBackStackEntry, boolean z) {
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) i.S((List) getState().getBackStack().d(), i2 - 1);
        boolean zAx = i.ax((Iterable) getState().getTransitionsInProgress().d(), navBackStackEntry2);
        getState().popWithTransition(navBackStackEntry, z);
        if (navBackStackEntry2 == null || zAx) {
            return;
        }
        getState().markTransitionComplete(navBackStackEntry2);
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this);
    }

    public final ch<List<NavBackStackEntry>> getBackStack$navigation_fragment() {
        return getState().getBackStack();
    }

    @Override // androidx.navigation.Navigator
    public void onAttach(NavigatorState navigatorState) {
        Lifecycle lifecycle;
        x.f(navigatorState, "state");
        super.onAttach(navigatorState);
        for (NavBackStackEntry navBackStackEntry : (List) navigatorState.getBackStack().d()) {
            ab abVar = (ab) this.fragmentManager.h(navBackStackEntry.getId());
            if (abVar == null || (lifecycle = abVar.getLifecycle()) == null) {
                this.restoredTagsAwaitingAttach.add(navBackStackEntry.getId());
            } else {
                lifecycle.addObserver(this.observer);
            }
        }
        this.fragmentManager.C(new bz() { // from class: androidx.navigation.fragment.DialogFragmentNavigator$$ExternalSyntheticLambda0
            @Override // android.support.v4.app.bz
            public final void onAttachFragment(bv bvVar, ar arVar) {
                DialogFragmentNavigator.onAttach$lambda$0(this.f$0, bvVar, arVar);
            }
        });
    }

    @Override // androidx.navigation.Navigator
    public void onLaunchSingleTop(NavBackStackEntry navBackStackEntry) {
        x.f(navBackStackEntry, "backStackEntry");
        if (this.fragmentManager.aO()) {
            Log.i(TAG, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        ab abVar = this.transitioningFragments.get(navBackStackEntry.getId());
        if (abVar == null) {
            ar arVarH = this.fragmentManager.h(navBackStackEntry.getId());
            abVar = arVarH instanceof ab ? (ab) arVarH : null;
        }
        if (abVar != null) {
            abVar.getLifecycle().removeObserver(this.observer);
            abVar.dismiss();
        }
        createDialogFragment(navBackStackEntry).show(this.fragmentManager, navBackStackEntry.getId());
        getState().onLaunchSingleTopWithTransition(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(NavBackStackEntry navBackStackEntry, boolean z) {
        x.f(navBackStackEntry, "popUpTo");
        if (this.fragmentManager.aO()) {
            Log.i(TAG, "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) getState().getBackStack().d();
        int iIndexOf = list.indexOf(navBackStackEntry);
        Iterator it = i.ai(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            ar arVarH = this.fragmentManager.h(((NavBackStackEntry) it.next()).getId());
            if (arVarH != null) {
                ((ab) arVarH).dismiss();
            }
        }
        popWithTransition(iIndexOf, navBackStackEntry, z);
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public class Destination extends NavDestination implements FloatingWindow {
        private String _className;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(DialogFragmentNavigator.class));
            x.f(navigatorProvider, "navigatorProvider");
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof Destination) && super.equals(obj) && x.n(this._className, ((Destination) obj)._className);
        }

        public final String getClassName() {
            String str = this._className;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this._className;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.NavDestination
        public void onInflate(Context context, AttributeSet attributeSet) {
            x.f(context, "context");
            x.f(attributeSet, "attrs");
            super.onInflate(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.DialogFragmentNavigator);
            x.e(typedArrayObtainAttributes, "obtainAttributes(...)");
            String string = typedArrayObtainAttributes.getString(R.styleable.DialogFragmentNavigator_android_name);
            if (string != null) {
                setClassName(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        public final Destination setClassName(String str) {
            x.f(str, "className");
            this._className = str;
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(Navigator<? extends Destination> navigator) {
            super(navigator);
            x.f(navigator, "fragmentNavigator");
        }
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras) {
        x.f(list, "entries");
        if (this.fragmentManager.aO()) {
            Log.i(TAG, "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<NavBackStackEntry> it = list.iterator();
        while (it.hasNext()) {
            navigate(it.next());
        }
    }
}
