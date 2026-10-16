package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.TaskStackBuilder;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.internal.NavContext;
import androidx.navigation.internal.NavControllerImpl;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import h.a.i;
import h.a.r;
import h.a.u;
import h.ab;
import h.f;
import h.g;
import h.g.a.a;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import h.m.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class NavController {
    public static final String KEY_DEEP_LINK_ARGS = "android-support-nav:controller:deepLinkArgs";
    public static final String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";
    public static final String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";
    public static final String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";
    public static final String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";
    private Activity activity;
    private final Context context;
    private boolean deepLinkHandled;
    private boolean enableOnBackPressedCallback;
    private final NavControllerImpl impl;
    private NavInflater inflater;
    private final NavContext navContext;
    private final f navInflater$delegate;
    private final OnBackPressedCallback onBackPressedCallback;
    private OnBackPressedDispatcher onBackPressedDispatcher;
    public static final Companion Companion = new Companion(null);
    private static boolean deepLinkSaveState = true;

    /* compiled from: WazeSource */
    public class NavControllerNavigatorState extends NavigatorState {
        private final Navigator<? extends NavDestination> navigator;
        final /* synthetic */ NavController this$0;

        public NavControllerNavigatorState(NavController navController, Navigator<? extends NavDestination> navigator) {
            x.f(navigator, "navigator");
            this.this$0 = navController;
            this.navigator = navigator;
        }

        static final ab markTransitionComplete$lambda$0(NavControllerNavigatorState navControllerNavigatorState, NavBackStackEntry navBackStackEntry) {
            super.markTransitionComplete(navBackStackEntry);
            return ab.f48028a;
        }

        static final ab pop$lambda$0(NavControllerNavigatorState navControllerNavigatorState, NavBackStackEntry navBackStackEntry, boolean z) {
            super.pop(navBackStackEntry, z);
            return ab.f48028a;
        }

        public final void addInternal(NavBackStackEntry navBackStackEntry) {
            x.f(navBackStackEntry, "backStackEntry");
            super.push(navBackStackEntry);
        }

        @Override // androidx.navigation.NavigatorState
        public NavBackStackEntry createBackStackEntry(NavDestination navDestination, Bundle bundle) {
            x.f(navDestination, "destination");
            return this.this$0.impl.createBackStackEntry$navigation_runtime(navDestination, bundle);
        }

        public final Navigator<? extends NavDestination> getNavigator() {
            return this.navigator;
        }

        @Override // androidx.navigation.NavigatorState
        public void markTransitionComplete(final NavBackStackEntry navBackStackEntry) {
            x.f(navBackStackEntry, "entry");
            this.this$0.impl.markTransitionComplete$navigation_runtime(this, navBackStackEntry, new a() { // from class: androidx.navigation.NavController$NavControllerNavigatorState$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return NavController.NavControllerNavigatorState.markTransitionComplete$lambda$0(this.f$0, navBackStackEntry);
                }
            });
        }

        @Override // androidx.navigation.NavigatorState
        public void pop(final NavBackStackEntry navBackStackEntry, final boolean z) {
            x.f(navBackStackEntry, "popUpTo");
            this.this$0.impl.pop$navigation_runtime(this, navBackStackEntry, z, new a() { // from class: androidx.navigation.NavController$NavControllerNavigatorState$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return NavController.NavControllerNavigatorState.pop$lambda$0(this.f$0, navBackStackEntry, z);
                }
            });
        }

        @Override // androidx.navigation.NavigatorState
        public void popWithTransition(NavBackStackEntry navBackStackEntry, boolean z) {
            x.f(navBackStackEntry, "popUpTo");
            super.popWithTransition(navBackStackEntry, z);
        }

        @Override // androidx.navigation.NavigatorState
        public void prepareForTransition(NavBackStackEntry navBackStackEntry) {
            x.f(navBackStackEntry, "entry");
            super.prepareForTransition(navBackStackEntry);
            this.this$0.impl.prepareForTransition$navigation_runtime(navBackStackEntry);
        }

        @Override // androidx.navigation.NavigatorState
        public void push(NavBackStackEntry navBackStackEntry) {
            x.f(navBackStackEntry, "backStackEntry");
            this.this$0.impl.push$navigation_runtime(this, navBackStackEntry);
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public interface OnDestinationChangedListener {
        void onDestinationChanged(NavController navController, NavDestination navDestination, Bundle bundle);
    }

    public NavController(Context context) {
        Object next;
        x.f(context, "context");
        this.context = context;
        this.impl = new NavControllerImpl(this, new a() { // from class: androidx.navigation.NavController$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return NavController.impl$lambda$0(this.f$0);
            }
        });
        this.navContext = new NavContext(context);
        Iterator it = k.g(context, new l() { // from class: androidx.navigation.NavController$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return NavController.activity$lambda$0((Context) obj);
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.activity = (Activity) next;
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            {
                super(false);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                this.this$0.popBackStack();
            }
        };
        this.enableOnBackPressedCallback = true;
        this.impl.get_navigatorProvider$navigation_runtime().addNavigator(new NavGraphNavigator(this.impl.get_navigatorProvider$navigation_runtime()));
        this.impl.get_navigatorProvider$navigation_runtime().addNavigator(new ActivityNavigator(this.context));
        this.navInflater$delegate = g.a(new a() { // from class: androidx.navigation.NavController$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return NavController.navInflater_delegate$lambda$0(this.f$0);
            }
        });
    }

    static final Context activity$lambda$0(Context context) {
        x.f(context, "it");
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static final void enableDeepLinkSaveState(boolean z) {
        Companion.enableDeepLinkSaveState(z);
    }

    public static /* synthetic */ NavDestination findDestination$default(NavController navController, int i2, NavDestination navDestination, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
        }
        if ((i3 & 2) != 0) {
            navDestination = null;
        }
        return navController.findDestination(i2, navDestination);
    }

    public static /* synthetic */ NavDestination findDestinationComprehensive$default(NavController navController, NavDestination navDestination, int i2, boolean z, NavDestination navDestination2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
        }
        if ((i3 & 4) != 0) {
            navDestination2 = null;
        }
        return navController.findDestinationComprehensive(navDestination, i2, z, navDestination2);
    }

    private final String findInvalidDestinationDisplayNameInDeepLink(int[] iArr) {
        return this.impl.findInvalidDestinationDisplayNameInDeepLink$navigation_runtime(iArr);
    }

    private final int getDestinationCountOnBackStack() {
        u<NavBackStackEntry> backQueue$navigation_runtime = this.impl.getBackQueue$navigation_runtime();
        int i2 = 0;
        if ((backQueue$navigation_runtime instanceof Collection) && backQueue$navigation_runtime.isEmpty()) {
            return 0;
        }
        Iterator<NavBackStackEntry> it = backQueue$navigation_runtime.iterator();
        while (it.hasNext()) {
            if (!(it.next().getDestination() instanceof NavGraph) && (i2 = i2 + 1) < 0) {
                i.o();
            }
        }
        return i2;
    }

    static final ab handleDeepLink$lambda$7(NavDestination navDestination, NavController navController, NavOptionsBuilder navOptionsBuilder) {
        x.f(navOptionsBuilder, "$this$navOptions");
        navOptionsBuilder.anim(new l() { // from class: androidx.navigation.NavController$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return NavController.handleDeepLink$lambda$7$0((AnimBuilder) obj);
            }
        });
        if (navDestination instanceof NavGraph) {
            Iterator<NavDestination> it = NavDestination.Companion.getHierarchy(navDestination).iterator();
            while (true) {
                if (it.hasNext()) {
                    NavDestination next = it.next();
                    NavDestination currentDestination = navController.getCurrentDestination();
                    if (x.n(next, currentDestination != null ? currentDestination.getParent() : null)) {
                        break;
                    }
                } else if (deepLinkSaveState) {
                    navOptionsBuilder.popUpTo(NavGraph.Companion.findStartDestination(navController.getGraph()).getId(), new l() { // from class: androidx.navigation.NavController$$ExternalSyntheticLambda1
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return NavController.handleDeepLink$lambda$7$2((PopUpToBuilder) obj);
                        }
                    });
                }
            }
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab handleDeepLink$lambda$7$0(AnimBuilder animBuilder) {
        x.f(animBuilder, "$this$anim");
        animBuilder.setEnter(0);
        animBuilder.setExit(0);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab handleDeepLink$lambda$7$2(PopUpToBuilder popUpToBuilder) {
        x.f(popUpToBuilder, "$this$popUpTo");
        popUpToBuilder.setSaveState(true);
        return ab.f48028a;
    }

    static final ab impl$lambda$0(NavController navController) {
        navController.updateOnBackPressedCallbackEnabled();
        return ab.f48028a;
    }

    static final NavInflater navInflater_delegate$lambda$0(NavController navController) {
        NavInflater navInflater = navController.inflater;
        return navInflater == null ? new NavInflater(navController.context, navController.impl.get_navigatorProvider$navigation_runtime()) : navInflater;
    }

    public static /* synthetic */ void navigate$default(NavController navController, Object obj, NavOptions navOptions, Navigator.Extras extras, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i2 & 2) != 0) {
            navOptions = null;
        }
        if ((i2 & 4) != 0) {
            extras = null;
        }
        navController.navigate((NavController) obj, navOptions, extras);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, boolean z, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        boolean z3 = z2 & ((i2 & 2) == 0);
        x.i();
        int i3 = ar.f48106a;
        return navController.popBackStack((c) new m(Object.class), z, z3);
    }

    private final boolean popBackStackInternal(int i2, boolean z, boolean z2) {
        return this.impl.popBackStackInternal$navigation_runtime(i2, z, z2);
    }

    static /* synthetic */ boolean popBackStackInternal$default(NavController navController, int i2, boolean z, boolean z2, int i3, Object obj) {
        if (obj == null) {
            return navController.popBackStackInternal(i2, z, z2 & ((i3 & 4) == 0));
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    private final boolean tryRelaunchUpToExplicitStack() {
        h.k[] kVarArr;
        int i2 = 0;
        if (!this.deepLinkHandled) {
            return false;
        }
        Activity activity = this.activity;
        x.c(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        x.c(extras);
        int[] intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
        x.c(intArray);
        List listZ = h.a.c.Z(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS);
        if (listZ.size() < 2) {
            return false;
        }
        int iIntValue = ((Number) i.w(listZ)).intValue();
        if (parcelableArrayList != null) {
        }
        NavDestination navDestinationFindDestinationComprehensive$default = findDestinationComprehensive$default(this, getGraph(), iIntValue, false, null, 4, null);
        if (navDestinationFindDestinationComprehensive$default instanceof NavGraph) {
            iIntValue = NavGraph.Companion.findStartDestination((NavGraph) navDestinationFindDestinationComprehensive$default).getId();
        }
        NavDestination currentDestination = getCurrentDestination();
        if (currentDestination == null || iIntValue != currentDestination.getId()) {
            return false;
        }
        NavDeepLinkBuilder navDeepLinkBuilderCreateDeepLink = createDeepLink();
        Map mapJ = r.j();
        if (mapJ.isEmpty()) {
            kVarArr = new h.k[0];
        } else {
            ArrayList arrayList = new ArrayList(mapJ.size());
            for (Map.Entry entry : mapJ.entrySet()) {
                arrayList.add(new h.k((String) entry.getKey(), entry.getValue()));
            }
            kVarArr = (h.k[]) arrayList.toArray(new h.k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((h.k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        x.c(intent);
        SavedStateWriter.m13379putParcelableimpl(bundleBundleOf, KEY_DEEP_LINK_INTENT, intent);
        Bundle bundle = extras.getBundle(KEY_DEEP_LINK_EXTRAS);
        if (bundle != null) {
            SavedStateWriter.m13359putAllimpl(bundleBundleOf, bundle);
        }
        navDeepLinkBuilderCreateDeepLink.setArguments(bundleBundleOf);
        for (Object obj : listZ) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i.p();
            }
            navDeepLinkBuilderCreateDeepLink.addDestination(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i2) : null);
            i2 = i3;
        }
        navDeepLinkBuilderCreateDeepLink.createTaskStackBuilder().startActivities();
        Activity activity2 = this.activity;
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    private final boolean tryRelaunchUpToGeneratedStack() {
        h.k[] kVarArr;
        Bundle bundleAddInDefaultArgs;
        NavDestination currentDestination = getCurrentDestination();
        x.c(currentDestination);
        int id = currentDestination.getId();
        for (NavGraph parent = currentDestination.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getStartDestinationId() != id) {
                Map mapJ = r.j();
                if (mapJ.isEmpty()) {
                    kVarArr = new h.k[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapJ.size());
                    for (Map.Entry entry : mapJ.entrySet()) {
                        arrayList.add(new h.k((String) entry.getKey(), entry.getValue()));
                    }
                    kVarArr = (h.k[]) arrayList.toArray(new h.k[0]);
                }
                Bundle bundleBundleOf = BundleKt.bundleOf((h.k[]) Arrays.copyOf(kVarArr, kVarArr.length));
                SavedStateWriter.m13355constructorimpl(bundleBundleOf);
                Activity activity = this.activity;
                if (activity != null && activity.getIntent() != null) {
                    Activity activity2 = this.activity;
                    x.c(activity2);
                    if (activity2.getIntent().getData() != null) {
                        Activity activity3 = this.activity;
                        x.c(activity3);
                        Intent intent = activity3.getIntent();
                        x.e(intent, "getIntent(...)");
                        SavedStateWriter.m13379putParcelableimpl(bundleBundleOf, KEY_DEEP_LINK_INTENT, intent);
                        NavGraph topGraph$navigation_runtime = this.impl.getTopGraph$navigation_runtime();
                        Activity activity4 = this.activity;
                        x.c(activity4);
                        Intent intent2 = activity4.getIntent();
                        x.e(intent2, "getIntent(...)");
                        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = topGraph$navigation_runtime.matchDeepLinkComprehensive(NavControllerKt.NavDeepLinkRequest(intent2), true, true, topGraph$navigation_runtime);
                        if ((deepLinkMatchMatchDeepLinkComprehensive != null ? deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs() : null) != null && (bundleAddInDefaultArgs = deepLinkMatchMatchDeepLinkComprehensive.getDestination().addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs())) != null) {
                            SavedStateWriter.m13359putAllimpl(bundleBundleOf, bundleAddInDefaultArgs);
                        }
                    }
                }
                NavDeepLinkBuilder navDeepLinkBuilder = new NavDeepLinkBuilder(this);
                NavDeepLinkBuilder.setDestination$default(navDeepLinkBuilder, parent.getId(), (Bundle) null, 2, (Object) null);
                navDeepLinkBuilder.setArguments(bundleBundleOf);
                navDeepLinkBuilder.createTaskStackBuilder().startActivities();
                Activity activity5 = this.activity;
                if (activity5 != null) {
                    activity5.finish();
                }
                return true;
            }
            id = parent.getId();
        }
        return false;
    }

    private final void updateOnBackPressedCallbackEnabled() {
        boolean z = false;
        if (this.enableOnBackPressedCallback && getDestinationCountOnBackStack() > 1) {
            z = true;
        }
        this.onBackPressedCallback.setEnabled(z);
    }

    public void addOnDestinationChangedListener(OnDestinationChangedListener onDestinationChangedListener) {
        x.f(onDestinationChangedListener, "listener");
        this.impl.addOnDestinationChangedListener$navigation_runtime(onDestinationChangedListener);
    }

    public final boolean checkDeepLinkHandled$navigation_runtime() {
        Activity activity;
        return (this.deepLinkHandled || (activity = this.activity) == null || !handleDeepLink(activity.getIntent())) ? false : true;
    }

    public final /* synthetic */ <T> boolean clearBackStack() {
        x.i();
        int i2 = ar.f48106a;
        return clearBackStack((c) new m(Object.class));
    }

    public NavDeepLinkBuilder createDeepLink() {
        return new NavDeepLinkBuilder(this);
    }

    public final NavControllerNavigatorState createNavControllerNavigatorState$navigation_runtime(Navigator<? extends NavDestination> navigator) {
        x.f(navigator, "navigator");
        return new NavControllerNavigatorState(this, navigator);
    }

    public void enableOnBackPressed(boolean z) {
        this.enableOnBackPressedCallback = z;
        updateOnBackPressedCallbackEnabled();
    }

    public final NavDestination findDestination(String str) {
        x.f(str, "route");
        return this.impl.findDestination$navigation_runtime(str);
    }

    public final NavDestination findDestinationComprehensive(NavDestination navDestination, int i2, boolean z, NavDestination navDestination2) {
        x.f(navDestination, "<this>");
        return this.impl.findDestinationComprehensive$navigation_runtime(navDestination, i2, z, navDestination2);
    }

    public final /* synthetic */ <T> NavBackStackEntry getBackStackEntry() {
        x.i();
        int i2 = ar.f48106a;
        return getBackStackEntry((c) new m(Object.class));
    }

    public final Context getContext() {
        return this.context;
    }

    public final ch<List<NavBackStackEntry>> getCurrentBackStack() {
        return this.impl.getCurrentBackStack$navigation_runtime();
    }

    public NavBackStackEntry getCurrentBackStackEntry() {
        return this.impl.getCurrentBackStackEntry$navigation_runtime();
    }

    public final kotlinx.coroutines.b.k<NavBackStackEntry> getCurrentBackStackEntryFlow() {
        return ai.S(this.impl.get_currentBackStackEntryFlow$navigation_runtime());
    }

    public NavDestination getCurrentDestination() {
        return this.impl.getCurrentDestination$navigation_runtime();
    }

    public final boolean getDeepLinkHandled$navigation_runtime() {
        return this.deepLinkHandled;
    }

    public NavGraph getGraph() {
        return this.impl.getGraph$navigation_runtime();
    }

    public final NavContext getNavContext$navigation_runtime() {
        return this.navContext;
    }

    public NavInflater getNavInflater() {
        return (NavInflater) this.navInflater$delegate.getValue();
    }

    public NavigatorProvider getNavigatorProvider() {
        return this.impl.getNavigatorProvider$navigation_runtime();
    }

    public NavBackStackEntry getPreviousBackStackEntry() {
        return this.impl.getPreviousBackStackEntry$navigation_runtime();
    }

    public ViewModelStoreOwner getViewModelStoreOwner(int i2) {
        return this.impl.getViewModelStoreOwner$navigation_runtime(i2);
    }

    public final ch<List<NavBackStackEntry>> getVisibleEntries() {
        return this.impl.getVisibleEntries$navigation_runtime();
    }

    public boolean handleDeepLink(Intent intent) {
        int[] intArray;
        h.k[] kVarArr;
        NavGraph topGraph$navigation_runtime;
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive;
        int length;
        h.k[] kVarArr2;
        Bundle bundle;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        if (extras != null) {
            try {
                intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
            } catch (Exception e2) {
                Objects.toString(intent);
                Log.e(NavControllerImpl.TAG, "handleDeepLink() could not extract deepLink from ".concat(intent.toString()), e2);
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS) : null;
        Map mapJ = r.j();
        if (mapJ.isEmpty()) {
            kVarArr = new h.k[0];
        } else {
            ArrayList arrayList2 = new ArrayList(mapJ.size());
            for (Map.Entry entry : mapJ.entrySet()) {
                arrayList2.add(new h.k((String) entry.getKey(), entry.getValue()));
            }
            kVarArr = (h.k[]) arrayList2.toArray(new h.k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((h.k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        Bundle bundle2 = extras != null ? extras.getBundle(KEY_DEEP_LINK_EXTRAS) : null;
        if (bundle2 != null) {
            SavedStateWriter.m13355constructorimpl(bundleBundleOf);
            SavedStateWriter.m13359putAllimpl(bundleBundleOf, bundle2);
        }
        if ((intArray == null || intArray.length == 0) && (deepLinkMatchMatchDeepLinkComprehensive = (topGraph$navigation_runtime = this.impl.getTopGraph$navigation_runtime()).matchDeepLinkComprehensive(NavControllerKt.NavDeepLinkRequest(intent), true, true, topGraph$navigation_runtime)) != null) {
            NavDestination destination = deepLinkMatchMatchDeepLinkComprehensive.getDestination();
            int[] iArrBuildDeepLinkIds$default = NavDestination.buildDeepLinkIds$default(destination, null, 1, null);
            Bundle bundleAddInDefaultArgs = destination.addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs());
            if (bundleAddInDefaultArgs != null) {
                SavedStateWriter.m13355constructorimpl(bundleBundleOf);
                SavedStateWriter.m13359putAllimpl(bundleBundleOf, bundleAddInDefaultArgs);
            }
            intArray = iArrBuildDeepLinkIds$default;
        } else {
            arrayList = parcelableArrayList;
        }
        if (intArray == null || (length = intArray.length) == 0) {
            return false;
        }
        String strFindInvalidDestinationDisplayNameInDeepLink = findInvalidDestinationDisplayNameInDeepLink(intArray);
        if (strFindInvalidDestinationDisplayNameInDeepLink != null) {
            androidx.navigation.internal.Log.Companion.i(NavControllerImpl.TAG, "Could not find destination " + strFindInvalidDestinationDisplayNameInDeepLink + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        SavedStateWriter.m13379putParcelableimpl(bundleBundleOf, KEY_DEEP_LINK_INTENT, intent);
        Bundle[] bundleArr = new Bundle[length];
        for (int i2 = 0; i2 < length; i2++) {
            Map mapJ2 = r.j();
            if (mapJ2.isEmpty()) {
                kVarArr2 = new h.k[0];
            } else {
                ArrayList arrayList3 = new ArrayList(mapJ2.size());
                for (Map.Entry entry2 : mapJ2.entrySet()) {
                    arrayList3.add(new h.k((String) entry2.getKey(), entry2.getValue()));
                }
                kVarArr2 = (h.k[]) arrayList3.toArray(new h.k[0]);
            }
            Bundle bundleBundleOf2 = BundleKt.bundleOf((h.k[]) Arrays.copyOf(kVarArr2, kVarArr2.length));
            SavedStateWriter.m13355constructorimpl(bundleBundleOf2);
            SavedStateWriter.m13359putAllimpl(bundleBundleOf2, bundleBundleOf);
            if (arrayList != null && (bundle = (Bundle) arrayList.get(i2)) != null) {
                SavedStateWriter.m13359putAllimpl(bundleBundleOf2, bundle);
            }
            bundleArr[i2] = bundleBundleOf2;
        }
        int flags = intent.getFlags();
        int i3 = 268435456 & flags;
        boolean z = i3 == 0;
        if (i3 == 0 || (flags & 32768) != 0) {
            handleDeepLink(intArray, bundleArr, !z);
            return true;
        }
        intent.addFlags(32768);
        TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(this.context);
        taskStackBuilderCreate.addNextIntentWithParentStack(intent);
        x.e(taskStackBuilderCreate, "addNextIntentWithParentStack(...)");
        taskStackBuilderCreate.startActivities();
        Activity activity = this.activity;
        if (activity != null) {
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void navigate(int r12, android.os.Bundle r13, androidx.navigation.NavOptions r14, androidx.navigation.Navigator.Extras r15) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.navigate(int, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    public boolean navigateUp() {
        Intent intent;
        if (getDestinationCountOnBackStack() != 1) {
            return popBackStack();
        }
        Activity activity = this.activity;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        return (extras != null ? extras.getIntArray(KEY_DEEP_LINK_IDS) : null) != null ? tryRelaunchUpToExplicitStack() : tryRelaunchUpToGeneratedStack();
    }

    public final /* synthetic */ <T> boolean popBackStack(boolean z) {
        x.i();
        int i2 = ar.f48106a;
        return popBackStack((c) new m(Object.class), z, false);
    }

    public void removeOnDestinationChangedListener(OnDestinationChangedListener onDestinationChangedListener) {
        x.f(onDestinationChangedListener, "listener");
        this.impl.removeOnDestinationChangedListener$navigation_runtime(onDestinationChangedListener);
    }

    public void restoreState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.context.getClassLoader());
        }
        this.impl.restoreState$navigation_runtime(bundle);
        if (bundle != null) {
            SavedStateReader.m13269constructorimpl(bundle);
            Boolean boolM13281getBooleanOrNullimpl = SavedStateReader.m13281getBooleanOrNullimpl(bundle, KEY_DEEP_LINK_HANDLED);
            this.deepLinkHandled = boolM13281getBooleanOrNullimpl != null ? boolM13281getBooleanOrNullimpl.booleanValue() : false;
        }
    }

    public Bundle saveState() {
        h.k[] kVarArr;
        Bundle bundleSaveState$navigation_runtime = this.impl.saveState$navigation_runtime();
        if (this.deepLinkHandled) {
            if (bundleSaveState$navigation_runtime == null) {
                Map mapJ = r.j();
                if (mapJ.isEmpty()) {
                    kVarArr = new h.k[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapJ.size());
                    for (Map.Entry entry : mapJ.entrySet()) {
                        arrayList.add(new h.k((String) entry.getKey(), entry.getValue()));
                    }
                    kVarArr = (h.k[]) arrayList.toArray(new h.k[0]);
                }
                bundleSaveState$navigation_runtime = BundleKt.bundleOf((h.k[]) Arrays.copyOf(kVarArr, kVarArr.length));
                SavedStateWriter.m13355constructorimpl(bundleSaveState$navigation_runtime);
            }
            SavedStateWriter.m13355constructorimpl(bundleSaveState$navigation_runtime);
            SavedStateWriter.m13361putBooleanimpl(bundleSaveState$navigation_runtime, KEY_DEEP_LINK_HANDLED, this.deepLinkHandled);
        }
        return bundleSaveState$navigation_runtime;
    }

    public final void setDeepLinkHandled$navigation_runtime(boolean z) {
        this.deepLinkHandled = z;
    }

    public void setGraph(int i2) {
        this.impl.setGraph$navigation_runtime(getNavInflater().inflate(i2), null);
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
        this.impl.setLifecycleOwner$navigation_runtime(lifecycleOwner);
    }

    public void setNavigatorProvider(NavigatorProvider navigatorProvider) {
        x.f(navigatorProvider, "value");
        this.impl.setNavigatorProvider$navigation_runtime(navigatorProvider);
    }

    public void setOnBackPressedDispatcher(OnBackPressedDispatcher onBackPressedDispatcher) throws Exception {
        x.f(onBackPressedDispatcher, "dispatcher");
        if (x.n(onBackPressedDispatcher, this.onBackPressedDispatcher)) {
            return;
        }
        LifecycleOwner lifecycleOwner$navigation_runtime = this.impl.getLifecycleOwner$navigation_runtime();
        if (lifecycleOwner$navigation_runtime == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        this.onBackPressedCallback.remove();
        this.onBackPressedDispatcher = onBackPressedDispatcher;
        onBackPressedDispatcher.addCallback(lifecycleOwner$navigation_runtime, this.onBackPressedCallback);
        NavControllerImpl navControllerImpl = this.impl;
        Lifecycle lifecycle = lifecycleOwner$navigation_runtime.getLifecycle();
        lifecycle.removeObserver(navControllerImpl.getLifecycleObserver$navigation_runtime());
        lifecycle.addObserver(this.impl.getLifecycleObserver$navigation_runtime());
    }

    public void setViewModelStore(ViewModelStore viewModelStore) {
        x.f(viewModelStore, "viewModelStore");
        this.impl.setViewModelStore$navigation_runtime(viewModelStore);
    }

    public final void writeIntent$navigation_runtime(NavDeepLinkRequest navDeepLinkRequest, Bundle bundle) {
        x.f(navDeepLinkRequest, "request");
        x.f(bundle, "args");
        Intent intent = new Intent();
        intent.setDataAndType(navDeepLinkRequest.getUri(), navDeepLinkRequest.getMimeType());
        intent.setAction(navDeepLinkRequest.getAction());
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13379putParcelableimpl(bundle, KEY_DEEP_LINK_INTENT, intent);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final void enableDeepLinkSaveState(boolean z) {
            NavController.deepLinkSaveState = z;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getKEY_DEEP_LINK_EXTRAS$annotations() {
        }
    }

    public final NavDestination findDestination(int i2, NavDestination navDestination) {
        return this.impl.findDestination$navigation_runtime(i2, navDestination);
    }

    public void setGraph(int i2, Bundle bundle) {
        this.impl.setGraph$navigation_runtime(getNavInflater().inflate(i2), bundle);
    }

    public void setGraph(NavGraph navGraph) {
        x.f(navGraph, "graph");
        this.impl.setGraph$navigation_runtime(navGraph);
    }

    public final boolean clearBackStack(int i2) {
        return this.impl.clearBackStack$navigation_runtime(i2);
    }

    public NavBackStackEntry getBackStackEntry(int i2) {
        return this.impl.getBackStackEntry$navigation_runtime(i2);
    }

    public void setGraph(NavGraph navGraph, Bundle bundle) {
        x.f(navGraph, "graph");
        this.impl.setGraph$navigation_runtime(navGraph, bundle);
    }

    public final <T> boolean clearBackStack(T t) {
        x.f(t, "route");
        return this.impl.clearBackStack$navigation_runtime((NavControllerImpl) t);
    }

    public final <T> NavBackStackEntry getBackStackEntry(T t) {
        x.f(t, "route");
        return this.impl.getBackStackEntry$navigation_runtime((NavControllerImpl) t);
    }

    public final <T> boolean popBackStack(T t, boolean z) {
        x.f(t, "route");
        return popBackStack$default(this, (Object) t, z, false, 4, (Object) null);
    }

    public final boolean clearBackStack(String str) {
        x.f(str, "route");
        return this.impl.clearBackStack$navigation_runtime(str);
    }

    public final NavBackStackEntry getBackStackEntry(String str) {
        x.f(str, "route");
        return this.impl.getBackStackEntry$navigation_runtime(str);
    }

    public final boolean popBackStack(String str, boolean z) {
        x.f(str, "route");
        return popBackStack$default(this, str, z, false, 4, (Object) null);
    }

    public final <T> boolean clearBackStack(c<T> cVar) {
        x.f(cVar, "route");
        return this.impl.clearBackStack$navigation_runtime((c) cVar);
    }

    public final <T> NavBackStackEntry getBackStackEntry(c<T> cVar) {
        x.f(cVar, "route");
        return this.impl.getBackStackEntry$navigation_runtime((c) cVar);
    }

    public boolean popBackStack() {
        return this.impl.popBackStack$navigation_runtime();
    }

    public final <T> boolean popBackStack(c<T> cVar, boolean z, boolean z2) {
        x.f(cVar, "route");
        return this.impl.popBackStack$navigation_runtime((c) cVar, z, z2);
    }

    public final <T> boolean popBackStack(T t, boolean z, boolean z2) {
        x.f(t, "route");
        return this.impl.popBackStack$navigation_runtime((NavControllerImpl) t, z, z2);
    }

    public final boolean popBackStack(String str, boolean z, boolean z2) {
        x.f(str, "route");
        return this.impl.popBackStack$navigation_runtime(str, z, z2);
    }

    public boolean popBackStack(int i2, boolean z) {
        return this.impl.popBackStack$navigation_runtime(i2, z);
    }

    public static /* synthetic */ void navigate$default(NavController navController, String str, NavOptions navOptions, Navigator.Extras extras, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i2 & 2) != 0) {
            navOptions = null;
        }
        if ((i2 & 4) != 0) {
            extras = null;
        }
        navController.navigate(str, navOptions, extras);
    }

    public final <T> boolean popBackStack(c<T> cVar, boolean z) {
        x.f(cVar, "route");
        return popBackStack$default(this, (c) cVar, z, false, 4, (Object) null);
    }

    public boolean popBackStack(int i2, boolean z, boolean z2) {
        return this.impl.popBackStack$navigation_runtime(i2, z, z2);
    }

    public final /* synthetic */ <T> boolean popBackStack(boolean z, boolean z2) {
        x.i();
        int i2 = ar.f48106a;
        return popBackStack((c) new m(Object.class), z, z2);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, String str, boolean z, boolean z2, int i2, Object obj) {
        if (obj == null) {
            return navController.popBackStack(str, z, z2 & ((i2 & 4) == 0));
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, c cVar, boolean z, boolean z2, int i2, Object obj) {
        if (obj == null) {
            return navController.popBackStack(cVar, z, z2 & ((i2 & 4) == 0));
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, Object obj, boolean z, boolean z2, int i2, Object obj2) {
        if (obj2 == null) {
            return navController.popBackStack((NavController) obj, z, z2 & ((i2 & 4) == 0));
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
    }

    public final boolean handleDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        h.k[] kVarArr;
        h.k[] kVarArr2;
        x.f(navDeepLinkRequest, "request");
        NavGraph topGraph$navigation_runtime = this.impl.getTopGraph$navigation_runtime();
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = topGraph$navigation_runtime.matchDeepLinkComprehensive(navDeepLinkRequest, true, true, topGraph$navigation_runtime);
        if (deepLinkMatchMatchDeepLinkComprehensive == null) {
            return false;
        }
        NavDestination destination = deepLinkMatchMatchDeepLinkComprehensive.getDestination();
        int[] iArrBuildDeepLinkIds$default = NavDestination.buildDeepLinkIds$default(destination, null, 1, null);
        Map mapJ = r.j();
        if (mapJ.isEmpty()) {
            kVarArr = new h.k[0];
        } else {
            ArrayList arrayList = new ArrayList(mapJ.size());
            for (Map.Entry entry : mapJ.entrySet()) {
                arrayList.add(new h.k((String) entry.getKey(), entry.getValue()));
            }
            kVarArr = (h.k[]) arrayList.toArray(new h.k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((h.k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        Bundle bundleAddInDefaultArgs = destination.addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs());
        if (bundleAddInDefaultArgs != null) {
            SavedStateWriter.m13359putAllimpl(bundleBundleOf, bundleAddInDefaultArgs);
        }
        int length = iArrBuildDeepLinkIds$default.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i2 = 0; i2 < length; i2++) {
            Map mapJ2 = r.j();
            if (mapJ2.isEmpty()) {
                kVarArr2 = new h.k[0];
            } else {
                ArrayList arrayList2 = new ArrayList(mapJ2.size());
                for (Map.Entry entry2 : mapJ2.entrySet()) {
                    arrayList2.add(new h.k((String) entry2.getKey(), entry2.getValue()));
                }
                kVarArr2 = (h.k[]) arrayList2.toArray(new h.k[0]);
            }
            Bundle bundleBundleOf2 = BundleKt.bundleOf((h.k[]) Arrays.copyOf(kVarArr2, kVarArr2.length));
            SavedStateWriter.m13355constructorimpl(bundleBundleOf2);
            SavedStateWriter.m13359putAllimpl(bundleBundleOf2, bundleBundleOf);
            bundleArr[i2] = bundleBundleOf2;
        }
        handleDeepLink(iArrBuildDeepLinkIds$default, bundleArr, true);
        return true;
    }

    private final boolean handleDeepLink(int[] iArr, Bundle[] bundleArr, boolean z) {
        NavGraph navGraphFindNode;
        NavGraph navGraph;
        NavControllerImpl navControllerImpl = this.impl;
        int i2 = 0;
        if (z) {
            if (!navControllerImpl.getBackQueue$navigation_runtime().isEmpty()) {
                NavGraph navGraph2 = this.impl.get_graph$navigation_runtime();
                x.c(navGraph2);
                popBackStackInternal$default(this, navGraph2.getId(), true, false, 4, null);
            }
            while (i2 < iArr.length) {
                int i3 = iArr[i2];
                int i4 = i2 + 1;
                Bundle bundle = bundleArr[i2];
                final NavDestination navDestinationFindDestination$default = findDestination$default(this, i3, null, 2, null);
                if (navDestinationFindDestination$default != null) {
                    navigate(navDestinationFindDestination$default, bundle, NavOptionsBuilderKt.navOptions(new l() { // from class: androidx.navigation.NavController$$ExternalSyntheticLambda5
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return NavController.handleDeepLink$lambda$7(navDestinationFindDestination$default, this, (NavOptionsBuilder) obj);
                        }
                    }), (Navigator.Extras) null);
                    i2 = i4;
                } else {
                    throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.Companion.getDisplayName(this.navContext, i3) + " cannot be found from the current destination " + getCurrentDestination());
                }
            }
        } else {
            NavGraph navGraph3 = navControllerImpl.get_graph$navigation_runtime();
            int length = iArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = iArr[i5];
                Bundle bundle2 = bundleArr[i5];
                if (i5 == 0) {
                    navGraphFindNode = this.impl.get_graph$navigation_runtime();
                } else {
                    x.c(navGraph3);
                    navGraphFindNode = navGraph3.findNode(i6);
                }
                if (navGraphFindNode != null) {
                    if (i5 == iArr.length - 1) {
                        NavOptions.Builder builder = new NavOptions.Builder();
                        NavGraph navGraph4 = this.impl.get_graph$navigation_runtime();
                        x.c(navGraph4);
                        NavOptions.Builder.setPopUpTo$default(builder, navGraph4.getId(), true, false, 4, (Object) null);
                        builder.setEnterAnim(0);
                        builder.setExitAnim(0);
                        navigate(navGraphFindNode, bundle2, builder.build(), (Navigator.Extras) null);
                    } else if (navGraphFindNode instanceof NavGraph) {
                        while (true) {
                            navGraph = (NavGraph) navGraphFindNode;
                            x.c(navGraph);
                            if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                                break;
                            }
                            navGraphFindNode = navGraph.findNode(navGraph.getStartDestinationId());
                        }
                        navGraph3 = navGraph;
                    }
                } else {
                    throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.Companion.getDisplayName(this.navContext, i6) + " cannot be found in graph " + navGraph3);
                }
            }
        }
        this.deepLinkHandled = true;
        return true;
    }

    public final <T> void navigate(T t, NavOptions navOptions) {
        x.f(t, "route");
        navigate$default(this, t, navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    public final void navigate(String str) {
        x.f(str, "route");
        navigate$default(this, str, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    public final void navigate(String str, NavOptions navOptions) {
        x.f(str, "route");
        navigate$default(this, str, navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    public void navigate(int i2) {
        navigate(i2, (Bundle) null);
    }

    public final <T> void navigate(T t, NavOptions navOptions, Navigator.Extras extras) {
        x.f(t, "route");
        this.impl.navigate$navigation_runtime((NavControllerImpl) t, navOptions, extras);
    }

    public final void navigate(String str, NavOptions navOptions, Navigator.Extras extras) {
        x.f(str, "route");
        this.impl.navigate$navigation_runtime(str, navOptions, extras);
    }

    public void navigate(int i2, Bundle bundle) {
        navigate(i2, bundle, (NavOptions) null);
    }

    public final <T> void navigate(T t, l<? super NavOptionsBuilder, ab> lVar) {
        x.f(t, "route");
        x.f(lVar, "builder");
        this.impl.navigate$navigation_runtime((NavControllerImpl) t, lVar);
    }

    public final void navigate(String str, l<? super NavOptionsBuilder, ab> lVar) {
        x.f(str, "route");
        x.f(lVar, "builder");
        this.impl.navigate$navigation_runtime(str, lVar);
    }

    public void navigate(int i2, Bundle bundle, NavOptions navOptions) {
        navigate(i2, bundle, navOptions, (Navigator.Extras) null);
    }

    public final <T> void navigate(T t) {
        x.f(t, "route");
        navigate$default(this, t, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    public void navigate(Uri uri) {
        x.f(uri, "deepLink");
        this.impl.navigate$navigation_runtime(new NavDeepLinkRequest(uri, null, null));
    }

    public void navigate(Uri uri, NavOptions navOptions) {
        x.f(uri, "deepLink");
        this.impl.navigate$navigation_runtime(new NavDeepLinkRequest(uri, null, null), navOptions);
    }

    public void navigate(Uri uri, NavOptions navOptions, Navigator.Extras extras) {
        x.f(uri, "deepLink");
        this.impl.navigate$navigation_runtime(new NavDeepLinkRequest(uri, null, null), navOptions, extras);
    }

    public void navigate(NavDeepLinkRequest navDeepLinkRequest) {
        x.f(navDeepLinkRequest, "request");
        this.impl.navigate$navigation_runtime(navDeepLinkRequest);
    }

    public void navigate(NavDeepLinkRequest navDeepLinkRequest, NavOptions navOptions) {
        x.f(navDeepLinkRequest, "request");
        this.impl.navigate$navigation_runtime(navDeepLinkRequest, navOptions);
    }

    public void navigate(NavDeepLinkRequest navDeepLinkRequest, NavOptions navOptions, Navigator.Extras extras) {
        x.f(navDeepLinkRequest, "request");
        this.impl.navigate$navigation_runtime(navDeepLinkRequest, navOptions, extras);
    }

    private final void navigate(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        this.impl.navigate$navigation_runtime(navDestination, bundle, navOptions, extras);
    }

    public void navigate(NavDirections navDirections) {
        x.f(navDirections, "directions");
        navigate(navDirections.getActionId(), navDirections.getArguments(), (NavOptions) null);
    }

    public void navigate(NavDirections navDirections, NavOptions navOptions) {
        x.f(navDirections, "directions");
        navigate(navDirections.getActionId(), navDirections.getArguments(), navOptions);
    }

    public void navigate(NavDirections navDirections, Navigator.Extras extras) {
        x.f(navDirections, "directions");
        x.f(extras, "navigatorExtras");
        navigate(navDirections.getActionId(), navDirections.getArguments(), (NavOptions) null, extras);
    }
}
