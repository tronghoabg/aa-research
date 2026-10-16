package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.ar;
import android.support.v4.app.bq;
import android.support.v4.app.bv;
import android.support.v4.app.bz;
import android.support.v4.app.ch;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.activity.BackEventCompat;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.NavigatorState;
import androidx.savedstate.SavedStateWriter;
import h.a.i;
import h.a.r;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
@Navigator.Name("fragment")
/* loaded from: classes.dex */
public class FragmentNavigator extends Navigator<Destination> {
    private static final Companion Companion = new Companion(null);
    private static final String KEY_SAVED_IDS = "androidx-nav-fragment:navigator:savedIds";
    private static final String TAG = "FragmentNavigator";
    private final int containerId;
    private final Context context;
    private final bv fragmentManager;
    private final LifecycleEventObserver fragmentObserver;
    private final l<NavBackStackEntry, LifecycleEventObserver> fragmentViewObserver;
    private final List<k<String, Boolean>> pendingOps;
    private final Set<String> savedIds;

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class ClearEntryStateViewModel extends ViewModel {
        public WeakReference<a<ab>> completeTransition;

        public final WeakReference<a<ab>> getCompleteTransition() {
            WeakReference<a<ab>> weakReference = this.completeTransition;
            if (weakReference != null) {
                return weakReference;
            }
            x.j("completeTransition");
            return null;
        }

        @Override // androidx.lifecycle.ViewModel
        protected void onCleared() {
            a<ab> aVar = getCompleteTransition().get();
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void setCompleteTransition(WeakReference<a<ab>> weakReference) {
            x.f(weakReference, "<set-?>");
            this.completeTransition = weakReference;
        }
    }

    /* compiled from: WazeSource */
    public final class Extras implements Navigator.Extras {
        private final LinkedHashMap<View, String> _sharedElements;

        /* compiled from: WazeSource */
        /* loaded from: classes3.dex */
        public final class Builder {
            private final LinkedHashMap<View, String> _sharedElements = new LinkedHashMap<>();

            public final Builder addSharedElement(View view, String str) {
                x.f(view, "sharedElement");
                x.f(str, HintConstants.AUTOFILL_HINT_NAME);
                this._sharedElements.put(view, str);
                return this;
            }

            public final Builder addSharedElements(Map<View, String> map) {
                x.f(map, "sharedElements");
                for (Map.Entry<View, String> entry : map.entrySet()) {
                    addSharedElement(entry.getKey(), entry.getValue());
                }
                return this;
            }

            public final Extras build() {
                return new Extras(this._sharedElements);
            }
        }

        public Extras(Map<View, String> map) {
            x.f(map, "sharedElements");
            LinkedHashMap<View, String> linkedHashMap = new LinkedHashMap<>();
            this._sharedElements = linkedHashMap;
            linkedHashMap.putAll(map);
        }

        public final Map<View, String> getSharedElements() {
            return r.r(this._sharedElements);
        }
    }

    public FragmentNavigator(Context context, bv bvVar, int i2) {
        x.f(context, "context");
        x.f(bvVar, "fragmentManager");
        this.context = context;
        this.fragmentManager = bvVar;
        this.containerId = i2;
        this.savedIds = new LinkedHashSet();
        this.pendingOps = new ArrayList();
        this.fragmentObserver = new LifecycleEventObserver() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda7
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                FragmentNavigator.fragmentObserver$lambda$0(this.f$0, lifecycleOwner, event);
            }
        };
        this.fragmentViewObserver = new l() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda8
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FragmentNavigator.fragmentViewObserver$lambda$0(this.f$0, (NavBackStackEntry) obj);
            }
        };
    }

    private final void addPendingOps(final String str, boolean z, boolean z2) {
        if (z2) {
            i.aQ(this.pendingOps, new l() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda6
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(FragmentNavigator.addPendingOps$lambda$0(str, (k) obj));
                }
            });
        }
        this.pendingOps.add(new k<>(str, Boolean.valueOf(z)));
    }

    static /* synthetic */ void addPendingOps$default(FragmentNavigator fragmentNavigator, String str, boolean z, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPendingOps");
        }
        fragmentNavigator.addPendingOps(str, z & ((i2 & 2) == 0), z2 | (!((i2 & 4) == 0)));
    }

    static final boolean addPendingOps$lambda$0(String str, k kVar) {
        x.f(kVar, "it");
        return x.n(kVar.c(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClearEntryStateViewModel attachClearViewModel$lambda$0$0(CreationExtras creationExtras) {
        x.f(creationExtras, "$this$initializer");
        return new ClearEntryStateViewModel();
    }

    static final ab attachClearViewModel$lambda$1(NavBackStackEntry navBackStackEntry, NavigatorState navigatorState, FragmentNavigator fragmentNavigator, ar arVar) {
        for (NavBackStackEntry navBackStackEntry2 : (Iterable) navigatorState.getTransitionsInProgress().d()) {
            if (fragmentNavigator.isLoggingEnabled(2)) {
                Log.v(TAG, "Marking transition complete for entry " + navBackStackEntry2 + " due to fragment " + arVar + " viewmodel being cleared");
            }
            navigatorState.markTransitionComplete(navBackStackEntry2);
        }
        return ab.f48028a;
    }

    private final void attachObservers(final NavBackStackEntry navBackStackEntry, final ar arVar) {
        arVar.getViewLifecycleOwnerLiveData().observe(arVar, new FragmentNavigator$sam$androidx_lifecycle_Observer$0(new l() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FragmentNavigator.attachObservers$lambda$0(this.f$0, arVar, navBackStackEntry, (LifecycleOwner) obj);
            }
        }));
        arVar.getLifecycle().addObserver(this.fragmentObserver);
    }

    static final ab attachObservers$lambda$0(FragmentNavigator fragmentNavigator, ar arVar, NavBackStackEntry navBackStackEntry, LifecycleOwner lifecycleOwner) {
        List<k<String, Boolean>> list = fragmentNavigator.pendingOps;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (x.n(((k) it.next()).c(), arVar.getTag())) {
                    z = true;
                    break;
                }
            }
        }
        if (lifecycleOwner != null && !z) {
            Lifecycle lifecycle = arVar.getViewLifecycleOwner().getLifecycle();
            if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                lifecycle.addObserver(fragmentNavigator.fragmentViewObserver.invoke(navBackStackEntry));
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.support.v4.app.ch createFragmentTransaction(androidx.navigation.NavBackStackEntry r8, androidx.navigation.NavOptions r9) {
        /*
            r7 = this;
            androidx.navigation.NavDestination r0 = r8.getDestination()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination"
            h.g.b.x.d(r0, r1)
            androidx.navigation.fragment.FragmentNavigator$Destination r0 = (androidx.navigation.fragment.FragmentNavigator.Destination) r0
            android.os.Bundle r1 = r8.getArguments()
            java.lang.String r0 = r0.getClassName()
            r2 = 0
            char r3 = r0.charAt(r2)
            r4 = 46
            if (r3 != r4) goto L2a
            android.content.Context r3 = r7.context
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r3.concat(r0)
        L2a:
            android.support.v4.app.bv r3 = r7.fragmentManager
            android.content.Context r4 = r7.context
            android.support.v4.app.az r3 = r3.o()
            java.lang.ClassLoader r4 = r4.getClassLoader()
            android.support.v4.app.ar r0 = r3.a(r4, r0)
            java.lang.String r3 = "instantiate(...)"
            h.g.b.x.e(r0, r3)
            r0.setArguments(r1)
            android.support.v4.app.bv r1 = r7.fragmentManager
            android.support.v4.app.ch r1 = r1.u()
            java.lang.String r3 = "beginTransaction(...)"
            h.g.b.x.e(r1, r3)
            r3 = -1
            if (r9 == 0) goto L55
            int r4 = r9.getEnterAnim()
            goto L56
        L55:
            r4 = r3
        L56:
            if (r9 == 0) goto L5d
            int r5 = r9.getExitAnim()
            goto L5e
        L5d:
            r5 = r3
        L5e:
            if (r9 == 0) goto L65
            int r6 = r9.getPopEnterAnim()
            goto L66
        L65:
            r6 = r3
        L66:
            if (r9 == 0) goto L6d
            int r9 = r9.getPopExitAnim()
            goto L6e
        L6d:
            r9 = r3
        L6e:
            if (r4 != r3) goto L7e
            if (r5 != r3) goto L7d
            if (r6 != r3) goto L7a
            if (r9 == r3) goto L8e
            r4 = r3
            r5 = r4
            r6 = r5
            goto L7e
        L7a:
            r4 = r3
            r5 = r4
            goto L7e
        L7d:
            r4 = r3
        L7e:
            if (r4 != r3) goto L81
            r4 = r2
        L81:
            if (r5 != r3) goto L84
            r5 = r2
        L84:
            if (r6 != r3) goto L87
            r6 = r2
        L87:
            if (r9 != r3) goto L8a
            goto L8b
        L8a:
            r2 = r9
        L8b:
            r1.z(r4, r5, r6, r2)
        L8e:
            int r7 = r7.containerId
            java.lang.String r8 = r8.getId()
            r1.x(r7, r0, r8)
            r1.o(r0)
            r1.A()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.FragmentNavigator.createFragmentTransaction(androidx.navigation.NavBackStackEntry, androidx.navigation.NavOptions):android.support.v4.app.ch");
    }

    static final void fragmentObserver$lambda$0(FragmentNavigator fragmentNavigator, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        x.f(lifecycleOwner, "source");
        x.f(event, NotificationCompat.CATEGORY_EVENT);
        if (event == Lifecycle.Event.ON_DESTROY) {
            ar arVar = (ar) lifecycleOwner;
            Object obj = null;
            for (Object obj2 : (Iterable) fragmentNavigator.getState().getTransitionsInProgress().d()) {
                if (x.n(((NavBackStackEntry) obj2).getId(), arVar.getTag())) {
                    obj = obj2;
                }
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (navBackStackEntry != null) {
                if (fragmentNavigator.isLoggingEnabled(2)) {
                    Log.v(TAG, "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + lifecycleOwner + " lifecycle reaching DESTROYED");
                }
                fragmentNavigator.getState().markTransitionComplete(navBackStackEntry);
            }
        }
    }

    static final LifecycleEventObserver fragmentViewObserver$lambda$0(final FragmentNavigator fragmentNavigator, final NavBackStackEntry navBackStackEntry) {
        x.f(navBackStackEntry, "entry");
        return new LifecycleEventObserver() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                FragmentNavigator.fragmentViewObserver$lambda$0$0(this.f$0, navBackStackEntry, lifecycleOwner, event);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fragmentViewObserver$lambda$0$0(FragmentNavigator fragmentNavigator, NavBackStackEntry navBackStackEntry, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        x.f(lifecycleOwner, "owner");
        x.f(event, NotificationCompat.CATEGORY_EVENT);
        if (event == Lifecycle.Event.ON_RESUME && ((List) fragmentNavigator.getState().getBackStack().d()).contains(navBackStackEntry)) {
            if (fragmentNavigator.isLoggingEnabled(2)) {
                Log.v(TAG, "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + lifecycleOwner + " view lifecycle reaching RESUMED");
            }
            fragmentNavigator.getState().markTransitionComplete(navBackStackEntry);
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (fragmentNavigator.isLoggingEnabled(2)) {
                Log.v(TAG, "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + lifecycleOwner + " view lifecycle reaching DESTROYED");
            }
            fragmentNavigator.getState().markTransitionComplete(navBackStackEntry);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLoggingEnabled(int i2) {
        return Log.isLoggable("FragmentManager", i2) || Log.isLoggable(TAG, i2);
    }

    private final void navigate(NavBackStackEntry navBackStackEntry, NavOptions navOptions, Navigator.Extras extras) {
        boolean zIsEmpty = ((List) getState().getBackStack().d()).isEmpty();
        if (navOptions != null && !zIsEmpty && navOptions.shouldRestoreState() && this.savedIds.remove(navBackStackEntry.getId())) {
            this.fragmentManager.ay(navBackStackEntry.getId());
            getState().pushWithTransition(navBackStackEntry);
            return;
        }
        ch chVarCreateFragmentTransaction = createFragmentTransaction(navBackStackEntry, navOptions);
        if (!zIsEmpty) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) i.U((List) getState().getBackStack().d());
            if (navBackStackEntry2 != null) {
                addPendingOps$default(this, navBackStackEntry2.getId(), false, false, 6, null);
            }
            addPendingOps$default(this, navBackStackEntry.getId(), false, false, 6, null);
            chVarCreateFragmentTransaction.u(navBackStackEntry.getId());
        }
        if (extras instanceof Extras) {
            for (Map.Entry<View, String> entry : ((Extras) extras).getSharedElements().entrySet()) {
                chVarCreateFragmentTransaction.t(entry.getKey(), entry.getValue());
            }
        }
        chVarCreateFragmentTransaction.a();
        if (isLoggingEnabled(2)) {
            Objects.toString(navBackStackEntry);
            Log.v(TAG, "Calling pushWithTransition via navigate() on entry ".concat(String.valueOf(navBackStackEntry)));
        }
        getState().pushWithTransition(navBackStackEntry);
    }

    static final void onAttach$lambda$0(NavigatorState navigatorState, FragmentNavigator fragmentNavigator, bv bvVar, ar arVar) {
        Object objPrevious;
        x.f(bvVar, "<unused var>");
        x.f(arVar, "fragment");
        List list = (List) navigatorState.getBackStack().d();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (x.n(((NavBackStackEntry) objPrevious).getId(), arVar.getTag())) {
                    break;
                }
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
        if (fragmentNavigator.isLoggingEnabled(2)) {
            Log.v(TAG, "Attaching fragment " + arVar + " associated with entry " + navBackStackEntry + " to FragmentManager " + fragmentNavigator.fragmentManager);
        }
        if (navBackStackEntry != null) {
            fragmentNavigator.attachObservers(navBackStackEntry, arVar);
            fragmentNavigator.attachClearViewModel$navigation_fragment(arVar, navBackStackEntry, navigatorState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String popBackStack$lambda$0$0(k kVar) {
        x.f(kVar, "it");
        return (String) kVar.c();
    }

    public final void attachClearViewModel$navigation_fragment(final ar arVar, final NavBackStackEntry navBackStackEntry, final NavigatorState navigatorState) {
        x.f(arVar, "fragment");
        x.f(navBackStackEntry, "entry");
        x.f(navigatorState, "state");
        ViewModelStore viewModelStore = arVar.getViewModelStore();
        x.e(viewModelStore, "<get-viewModelStore>(...)");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        l lVar = new l() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FragmentNavigator.attachClearViewModel$lambda$0$0((CreationExtras) obj);
            }
        };
        int i2 = h.g.b.ar.f48106a;
        initializerViewModelFactoryBuilder.addInitializer(new m(ClearEntryStateViewModel.class), lVar);
        ((ClearEntryStateViewModel) new ViewModelProvider(viewModelStore, initializerViewModelFactoryBuilder.build(), CreationExtras.Empty.INSTANCE).get(ClearEntryStateViewModel.class)).setCompleteTransition(new WeakReference<>(new a() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return FragmentNavigator.attachClearViewModel$lambda$1(navBackStackEntry, navigatorState, this, arVar);
            }
        }));
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this);
    }

    public final kotlinx.coroutines.b.ch<List<NavBackStackEntry>> getBackStack$navigation_fragment() {
        return getState().getBackStack();
    }

    public final List<k<String, Boolean>> getPendingOps$navigation_fragment() {
        return this.pendingOps;
    }

    public ar instantiateFragment(Context context, bv bvVar, String str, Bundle bundle) {
        x.f(context, "context");
        x.f(bvVar, "fragmentManager");
        x.f(str, "className");
        ar arVarA = bvVar.o().a(context.getClassLoader(), str);
        x.e(arVarA, "instantiate(...)");
        return arVarA;
    }

    @Override // androidx.navigation.Navigator
    public void onAttach(final NavigatorState navigatorState) {
        x.f(navigatorState, "state");
        super.onAttach(navigatorState);
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "onAttach");
        }
        this.fragmentManager.C(new bz() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda5
            @Override // android.support.v4.app.bz
            public final void onAttachFragment(bv bvVar, ar arVar) {
                FragmentNavigator.onAttach$lambda$0(navigatorState, this, bvVar, arVar);
            }
        });
        this.fragmentManager.D(new bq() { // from class: androidx.navigation.fragment.FragmentNavigator.onAttach.2
            @Override // android.support.v4.app.bq
            public /* synthetic */ void onBackStackChangeCancelled() {
            }

            @Override // android.support.v4.app.bq
            public void onBackStackChangeCommitted(ar arVar, boolean z) {
                Object obj;
                Object objPrevious;
                x.f(arVar, "fragment");
                List listAf = i.af((Collection) navigatorState.getBackStack().d(), (Iterable) navigatorState.getTransitionsInProgress().d());
                ListIterator listIterator = listAf.listIterator(listAf.size());
                while (true) {
                    obj = null;
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (x.n(((NavBackStackEntry) objPrevious).getId(), arVar.getTag())) {
                            break;
                        }
                    }
                }
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
                boolean z2 = z && this.getPendingOps$navigation_fragment().isEmpty() && arVar.isRemoving();
                Iterator<T> it = this.getPendingOps$navigation_fragment().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (x.n(((k) next).c(), arVar.getTag())) {
                        obj = next;
                        break;
                    }
                }
                k kVar = (k) obj;
                if (kVar != null) {
                    this.getPendingOps$navigation_fragment().remove(kVar);
                }
                if (!z2 && this.isLoggingEnabled(2)) {
                    Log.v(FragmentNavigator.TAG, "OnBackStackChangedCommitted for fragment " + arVar + " associated with entry " + navBackStackEntry);
                }
                boolean z3 = kVar != null && ((Boolean) kVar.d()).booleanValue();
                if (!z && !z3 && navBackStackEntry == null) {
                    throw new IllegalArgumentException("The fragment " + arVar + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.");
                }
                if (navBackStackEntry != null) {
                    this.attachClearViewModel$navigation_fragment(arVar, navBackStackEntry, navigatorState);
                    if (z2) {
                        if (this.isLoggingEnabled(2)) {
                            Log.v(FragmentNavigator.TAG, "OnBackStackChangedCommitted for fragment " + arVar + " popping associated entry " + navBackStackEntry + " via system back");
                        }
                        navigatorState.popWithTransition(navBackStackEntry, false);
                    }
                }
            }

            @Override // android.support.v4.app.bq
            public /* synthetic */ void onBackStackChangeProgressed(BackEventCompat backEventCompat) {
            }

            @Override // android.support.v4.app.bq
            public void onBackStackChangeStarted(ar arVar, boolean z) {
                Object objPrevious;
                x.f(arVar, "fragment");
                if (z) {
                    List list = (List) navigatorState.getBackStack().d();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        } else {
                            objPrevious = listIterator.previous();
                            if (x.n(((NavBackStackEntry) objPrevious).getId(), arVar.getTag())) {
                                break;
                            }
                        }
                    }
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
                    if (this.isLoggingEnabled(2)) {
                        Log.v(FragmentNavigator.TAG, "OnBackStackChangedStarted for fragment " + arVar + " associated with entry " + navBackStackEntry);
                    }
                    if (navBackStackEntry != null) {
                        navigatorState.prepareForTransition(navBackStackEntry);
                    }
                }
            }

            @Override // android.support.v4.app.bq
            public void onBackStackChanged() {
            }
        });
    }

    @Override // androidx.navigation.Navigator
    public void onLaunchSingleTop(NavBackStackEntry navBackStackEntry) {
        FragmentNavigator fragmentNavigator;
        x.f(navBackStackEntry, "backStackEntry");
        if (this.fragmentManager.aO()) {
            Log.i(TAG, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        ch chVarCreateFragmentTransaction = createFragmentTransaction(navBackStackEntry, null);
        List list = (List) getState().getBackStack().d();
        if (list.size() > 1) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) i.S(list, i.e(list) - 1);
            if (navBackStackEntry2 != null) {
                addPendingOps$default(this, navBackStackEntry2.getId(), false, false, 6, null);
                fragmentNavigator = this;
            } else {
                fragmentNavigator = this;
            }
            addPendingOps$default(fragmentNavigator, navBackStackEntry.getId(), true, false, 4, null);
            fragmentNavigator.fragmentManager.bb(navBackStackEntry.getId());
            addPendingOps$default(fragmentNavigator, navBackStackEntry.getId(), false, false, 2, null);
            chVarCreateFragmentTransaction.u(navBackStackEntry.getId());
        } else {
            fragmentNavigator = this;
        }
        chVarCreateFragmentTransaction.a();
        fragmentNavigator.getState().onLaunchSingleTop(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void onRestoreState(Bundle bundle) {
        x.f(bundle, "savedState");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_SAVED_IDS);
        if (stringArrayList != null) {
            this.savedIds.clear();
            i.aD(this.savedIds, stringArrayList);
        }
    }

    @Override // androidx.navigation.Navigator
    public Bundle onSaveState() {
        k[] kVarArr;
        if (this.savedIds.isEmpty()) {
            return null;
        }
        Map mapJ = r.j();
        if (mapJ.isEmpty()) {
            kVarArr = new k[0];
        } else {
            ArrayList arrayList = new ArrayList(mapJ.size());
            for (Map.Entry entry : mapJ.entrySet()) {
                arrayList.add(new k((String) entry.getKey(), entry.getValue()));
            }
            kVarArr = (k[]) arrayList.toArray(new k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        SavedStateWriter.m13390putStringListimpl(bundleBundleOf, KEY_SAVED_IDS, new ArrayList(this.savedIds));
        return bundleBundleOf;
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
        List listSubList = list.subList(iIndexOf, list.size());
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) i.P(list);
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) i.S(list, iIndexOf - 1);
        if (navBackStackEntry3 != null) {
            addPendingOps$default(this, navBackStackEntry3.getId(), false, false, 6, null);
        }
        List list2 = listSubList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            NavBackStackEntry navBackStackEntry4 = (NavBackStackEntry) obj;
            if (h.m.k.t(h.m.k.o(i.av(this.pendingOps), new l() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda4
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return FragmentNavigator.popBackStack$lambda$0$0((k) obj2);
                }
            }), navBackStackEntry4.getId()) || !x.n(navBackStackEntry4.getId(), navBackStackEntry2.getId())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            addPendingOps$default(this, ((NavBackStackEntry) it.next()).getId(), true, false, 4, null);
        }
        if (z) {
            for (NavBackStackEntry navBackStackEntry5 : i.ai(list2)) {
                if (x.n(navBackStackEntry5, navBackStackEntry2)) {
                    Objects.toString(navBackStackEntry5);
                    Log.i(TAG, "FragmentManager cannot save the state of the initial destination ".concat(String.valueOf(navBackStackEntry5)));
                } else {
                    this.fragmentManager.aA(navBackStackEntry5.getId());
                    this.savedIds.add(navBackStackEntry5.getId());
                }
            }
        } else {
            this.fragmentManager.bb(navBackStackEntry.getId());
        }
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Calling popWithTransition via popBackStack() on entry " + navBackStackEntry + " with savedState " + z);
        }
        getState().popWithTransition(navBackStackEntry, z);
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
    public class Destination extends NavDestination {
        private String _className;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(FragmentNavigator.class));
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
            throw new IllegalStateException("Fragment class was not set");
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
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.FragmentNavigator);
            x.e(typedArrayObtainAttributes, "obtainAttributes(...)");
            String string = typedArrayObtainAttributes.getString(R.styleable.FragmentNavigator_android_name);
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

        @Override // androidx.navigation.NavDestination
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this._className;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            String string = sb.toString();
            x.e(string, "toString(...)");
            return string;
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
            navigate(it.next(), navOptions, extras);
        }
    }
}
