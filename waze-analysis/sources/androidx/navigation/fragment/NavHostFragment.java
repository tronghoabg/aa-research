package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.FragmentContainerView;
import android.support.v4.app.ab;
import android.support.v4.app.ar;
import android.support.v4.app.bv;
import android.support.v4.app.ch;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateWriter;
import h.a.r;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class NavHostFragment extends ar implements NavHost {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_DEFAULT_NAV_HOST = "android-support-nav:fragment:defaultHost";
    public static final String KEY_GRAPH_ID = "android-support-nav:fragment:graphId";
    private static final String KEY_NAV_CONTROLLER_STATE = "android-support-nav:fragment:navControllerState";
    public static final String KEY_START_DESTINATION_ARGS = "android-support-nav:fragment:startDestinationArgs";
    private boolean defaultNavHost;
    private int graphId;
    private final f navHostController$delegate = g.a(new a() { // from class: androidx.navigation.fragment.NavHostFragment$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return NavHostFragment.navHostController_delegate$lambda$0(this.f$0);
        }
    });
    private View viewParent;

    public static final NavHostFragment create(int i2) {
        return Companion.create(i2);
    }

    public static final NavController findNavController(ar arVar) {
        return Companion.findNavController(arVar);
    }

    private final int getContainerId() {
        int id = getId();
        return (id == 0 || id == -1) ? com.waze.R.id.nav_host_fragment_container : id;
    }

    static final NavHostController navHostController_delegate$lambda$0(final NavHostFragment navHostFragment) {
        Context context = navHostFragment.getContext();
        if (context == null) {
            throw new IllegalStateException("NavController cannot be created before the fragment is attached");
        }
        final NavHostController navHostController = new NavHostController(context);
        navHostController.setLifecycleOwner(navHostFragment);
        ViewModelStore viewModelStore = navHostFragment.getViewModelStore();
        x.e(viewModelStore, "<get-viewModelStore>(...)");
        navHostController.setViewModelStore(viewModelStore);
        navHostFragment.onCreateNavHostController(navHostController);
        Bundle bundleConsumeRestoredStateForKey = navHostFragment.getSavedStateRegistry().consumeRestoredStateForKey(KEY_NAV_CONTROLLER_STATE);
        if (bundleConsumeRestoredStateForKey != null) {
            navHostController.restoreState(bundleConsumeRestoredStateForKey);
        }
        navHostFragment.getSavedStateRegistry().registerSavedStateProvider(KEY_NAV_CONTROLLER_STATE, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.navigation.fragment.NavHostFragment$$ExternalSyntheticLambda1
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return NavHostFragment.navHostController_delegate$lambda$0$1$1(navHostController);
            }
        });
        Bundle bundleConsumeRestoredStateForKey2 = navHostFragment.getSavedStateRegistry().consumeRestoredStateForKey(KEY_GRAPH_ID);
        if (bundleConsumeRestoredStateForKey2 != null) {
            navHostFragment.graphId = bundleConsumeRestoredStateForKey2.getInt(KEY_GRAPH_ID);
        }
        navHostFragment.getSavedStateRegistry().registerSavedStateProvider(KEY_GRAPH_ID, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.navigation.fragment.NavHostFragment$$ExternalSyntheticLambda2
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return NavHostFragment.navHostController_delegate$lambda$0$1$3(this.f$0);
            }
        });
        int i2 = navHostFragment.graphId;
        if (i2 != 0) {
            navHostController.setGraph(i2);
            return navHostController;
        }
        Bundle arguments = navHostFragment.getArguments();
        int i3 = arguments != null ? arguments.getInt(KEY_GRAPH_ID) : 0;
        Bundle bundle = arguments != null ? arguments.getBundle(KEY_START_DESTINATION_ARGS) : null;
        if (i3 != 0) {
            navHostController.setGraph(i3, bundle);
        }
        return navHostController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle navHostController_delegate$lambda$0$1$1(NavHostController navHostController) {
        Bundle bundleSaveState = navHostController.saveState();
        if (bundleSaveState != null) {
            return bundleSaveState;
        }
        Bundle bundle = Bundle.EMPTY;
        x.e(bundle, "EMPTY");
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle navHostController_delegate$lambda$0$1$3(NavHostFragment navHostFragment) {
        k[] kVarArr;
        if (navHostFragment.graphId == 0) {
            Bundle bundle = Bundle.EMPTY;
            x.c(bundle);
            return bundle;
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
        SavedStateWriter.m13372putIntimpl(bundleBundleOf, KEY_GRAPH_ID, navHostFragment.graphId);
        return bundleBundleOf;
    }

    protected Navigator<? extends FragmentNavigator.Destination> createFragmentNavigator() {
        Context contextRequireContext = requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        bv childFragmentManager = getChildFragmentManager();
        x.e(childFragmentManager, "getChildFragmentManager(...)");
        return new FragmentNavigator(contextRequireContext, childFragmentManager, getContainerId());
    }

    @Override // androidx.navigation.NavHost
    public final NavController getNavController() {
        return getNavHostController$navigation_fragment();
    }

    public final NavHostController getNavHostController$navigation_fragment() {
        return (NavHostController) this.navHostController$delegate.getValue();
    }

    @Override // android.support.v4.app.ar
    public void onAttach(Context context) {
        x.f(context, "context");
        super.onAttach(context);
        if (this.defaultNavHost) {
            ch chVarU = getParentFragmentManager().u();
            chVarU.o(this);
            chVarU.a();
        }
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onCreate */
    public void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        getNavHostController$navigation_fragment();
        if (bundle != null && bundle.getBoolean(KEY_DEFAULT_NAV_HOST, false)) {
            this.defaultNavHost = true;
            ch chVarU = getParentFragmentManager().u();
            chVarU.o(this);
            chVarU.a();
        }
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
    }

    protected void onCreateNavController(NavController navController) {
        x.f(navController, "navController");
        NavigatorProvider navigatorProvider = navController.getNavigatorProvider();
        Context contextRequireContext = requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        bv childFragmentManager = getChildFragmentManager();
        x.e(childFragmentManager, "getChildFragmentManager(...)");
        navigatorProvider.addNavigator(new DialogFragmentNavigator(contextRequireContext, childFragmentManager));
        navController.getNavigatorProvider().addNavigator(createFragmentNavigator());
    }

    protected void onCreateNavHostController(NavHostController navHostController) {
        x.f(navHostController, "navHostController");
        onCreateNavController(navHostController);
    }

    @Override // android.support.v4.app.ar
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        x.f(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        x.e(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(getContainerId());
        return fragmentContainerView;
    }

    @Override // android.support.v4.app.ar
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.viewParent;
        if (view != null && Navigation.findNavController(view) == getNavHostController$navigation_fragment()) {
            Navigation.setViewNavController(view, null);
        }
        this.viewParent = null;
    }

    @Override // android.support.v4.app.ar
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        x.f(context, "context");
        x.f(attributeSet, "attrs");
        super.onInflate(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.navigation.R.styleable.NavHost);
        x.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.R.styleable.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.graphId = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.NavHostFragment);
        x.e(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
        if (typedArrayObtainStyledAttributes2.getBoolean(R.styleable.NavHostFragment_defaultNavHost, false)) {
            this.defaultNavHost = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onSaveInstanceState */
    public void m47x22bc4f96(Bundle bundle) {
        x.f(bundle, "outState");
        if (this.defaultNavHost) {
            bundle.putBoolean(KEY_DEFAULT_NAV_HOST, true);
        }
    }

    @Override // android.support.v4.app.ar
    public void onViewCreated(View view, Bundle bundle) {
        x.f(view, "view");
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
        }
        Navigation.setViewNavController(view, getNavHostController$navigation_fragment());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            x.d(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.viewParent = view2;
            if (view2 == null) {
                x.g();
            }
            if (view2.getId() == getId()) {
                View view3 = this.viewParent;
                if (view3 == null) {
                    x.g();
                }
                Navigation.setViewNavController(view3, getNavHostController$navigation_fragment());
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ NavHostFragment create$default(Companion companion, int i2, Bundle bundle, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                bundle = null;
            }
            return companion.create(i2, bundle);
        }

        public final NavHostFragment create(int i2, Bundle bundle) {
            Bundle bundle2;
            if (i2 != 0) {
                bundle2 = new Bundle();
                bundle2.putInt(NavHostFragment.KEY_GRAPH_ID, i2);
            } else {
                bundle2 = null;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putBundle(NavHostFragment.KEY_START_DESTINATION_ARGS, bundle);
            }
            NavHostFragment navHostFragment = new NavHostFragment();
            if (bundle2 != null) {
                navHostFragment.setArguments(bundle2);
            }
            return navHostFragment;
        }

        public final NavController findNavController(ar arVar) {
            Dialog dialog;
            Window window;
            x.f(arVar, "fragment");
            for (ar parentFragment = arVar; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof NavHostFragment) {
                    return ((NavHostFragment) parentFragment).getNavHostController$navigation_fragment();
                }
                ar arVarL = parentFragment.getParentFragmentManager().l();
                if (arVarL instanceof NavHostFragment) {
                    return ((NavHostFragment) arVarL).getNavHostController$navigation_fragment();
                }
            }
            View view = arVar.getView();
            if (view != null) {
                return Navigation.findNavController(view);
            }
            View decorView = null;
            ab abVar = arVar instanceof ab ? (ab) arVar : null;
            if (abVar != null && (dialog = abVar.getDialog()) != null && (window = dialog.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            if (decorView != null) {
                return Navigation.findNavController(decorView);
            }
            throw new IllegalStateException("Fragment " + arVar + " does not have a NavController set");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final NavHostFragment create(int i2) {
            return create$default(this, i2, null, 2, null);
        }
    }

    public static final NavHostFragment create(int i2, Bundle bundle) {
        return Companion.create(i2, bundle);
    }
}
