package androidx.navigation;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.navigation.internal.NavContext;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.SavedStateWriter;
import h.a.r;
import h.f;
import h.g;
import h.g.a.a;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {
    public static final Companion Companion = new Companion(null);
    private final NavContext context;
    private final f defaultFactory$delegate;
    private NavDestination destination;
    private Lifecycle.State hostLifecycleState;
    private final String id;
    private final Bundle immutableArgs;
    private final LifecycleRegistry lifecycleRegistry;
    private Lifecycle.State maxLifecycle;
    private final f navResultSavedStateFactory$delegate;
    private final Bundle savedState;
    private final f savedStateHandle$delegate;
    private boolean savedStateRegistryAttached;
    private final SavedStateRegistryController savedStateRegistryController;
    private final NavViewModelStoreProvider viewModelStoreProvider;

    private NavBackStackEntry(NavContext navContext, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2) {
        this.context = navContext;
        this.destination = navDestination;
        this.immutableArgs = bundle;
        this.hostLifecycleState = state;
        this.viewModelStoreProvider = navViewModelStoreProvider;
        this.id = str;
        this.savedState = bundle2;
        this.savedStateRegistryController = SavedStateRegistryController.Companion.create(this);
        this.defaultFactory$delegate = g.a(new a() { // from class: androidx.navigation.NavBackStackEntry$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return NavBackStackEntry.defaultFactory_delegate$lambda$0();
            }
        });
        this.lifecycleRegistry = new LifecycleRegistry(this);
        this.navResultSavedStateFactory$delegate = g.a(new a() { // from class: androidx.navigation.NavBackStackEntry$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return NavBackStackEntry.navResultSavedStateFactory_delegate$lambda$0();
            }
        });
        this.savedStateHandle$delegate = g.a(new a() { // from class: androidx.navigation.NavBackStackEntry$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return NavBackStackEntry.savedStateHandle_delegate$lambda$0(this.f$0);
            }
        });
        this.maxLifecycle = Lifecycle.State.INITIALIZED;
    }

    static final SavedStateViewModelFactory defaultFactory_delegate$lambda$0() {
        return new SavedStateViewModelFactory();
    }

    private final SavedStateViewModelFactory getDefaultFactory() {
        return (SavedStateViewModelFactory) this.defaultFactory$delegate.getValue();
    }

    private final ViewModelProvider.Factory getNavResultSavedStateFactory() {
        return (ViewModelProvider.Factory) this.navResultSavedStateFactory$delegate.getValue();
    }

    static final ViewModelProvider.Factory navResultSavedStateFactory_delegate$lambda$0() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        l lVar = new l() { // from class: androidx.navigation.NavBackStackEntry$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return NavBackStackEntry.navResultSavedStateFactory_delegate$lambda$0$0$0((CreationExtras) obj);
            }
        };
        int i2 = ar.f48106a;
        initializerViewModelFactoryBuilder.addInitializer(new m(SavedStateViewModel.class), lVar);
        return initializerViewModelFactoryBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedStateViewModel navResultSavedStateFactory_delegate$lambda$0$0$0(CreationExtras creationExtras) {
        x.f(creationExtras, "$this$initializer");
        return new SavedStateViewModel(SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    static final SavedStateHandle savedStateHandle_delegate$lambda$0(NavBackStackEntry navBackStackEntry) {
        if (!navBackStackEntry.savedStateRegistryAttached) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (navBackStackEntry.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
        }
        ViewModelProvider viewModelProviderCreate$default = ViewModelProvider.Companion.create$default(ViewModelProvider.Companion, navBackStackEntry, navBackStackEntry.getNavResultSavedStateFactory(), (CreationExtras) null, 4, (Object) null);
        int i2 = ar.f48106a;
        return ((SavedStateViewModel) viewModelProviderCreate$default.get(new m(SavedStateViewModel.class))).getHandle();
    }

    public boolean equals(Object obj) {
        boolean zM13271contentDeepEqualsimpl;
        if (obj != null && (obj instanceof NavBackStackEntry)) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (x.n(this.immutableArgs, navBackStackEntry.immutableArgs)) {
                zM13271contentDeepEqualsimpl = true;
            } else {
                Bundle bundle = this.immutableArgs;
                if (bundle == null || navBackStackEntry.immutableArgs == null) {
                    zM13271contentDeepEqualsimpl = false;
                } else {
                    SavedStateReader.m13269constructorimpl(bundle);
                    zM13271contentDeepEqualsimpl = SavedStateReader.m13271contentDeepEqualsimpl(bundle, navBackStackEntry.immutableArgs);
                }
            }
            if (x.n(this.id, navBackStackEntry.id) && x.n(this.destination, navBackStackEntry.destination) && x.n(getLifecycle(), navBackStackEntry.getLifecycle()) && x.n(getSavedStateRegistry(), navBackStackEntry.getSavedStateRegistry()) && zM13271contentDeepEqualsimpl) {
                return true;
            }
        }
        return false;
    }

    public final Bundle getArguments() {
        k[] kVarArr;
        if (this.immutableArgs == null) {
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
        SavedStateWriter.m13359putAllimpl(bundleBundleOf, this.immutableArgs);
        return bundleBundleOf;
    }

    public final NavContext getContext$navigation_common() {
        return this.context;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, arguments);
        }
        NavBackStackEntryKt.setPlatformExtras(mutableCreationExtras, this.context);
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return getDefaultFactory();
    }

    public final NavDestination getDestination() {
        return this.destination;
    }

    public final Lifecycle.State getHostLifecycleState$navigation_common() {
        return this.hostLifecycleState;
    }

    public final String getId() {
        return this.id;
    }

    public final Bundle getImmutableArgs$navigation_common() {
        return this.immutableArgs;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    public final Lifecycle.State getMaxLifecycle() {
        return this.maxLifecycle;
    }

    public final Bundle getSavedState$navigation_common() {
        return this.savedState;
    }

    public final SavedStateHandle getSavedStateHandle() {
        return (SavedStateHandle) this.savedStateHandle$delegate.getValue();
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        if (!this.savedStateRegistryAttached) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        NavViewModelStoreProvider navViewModelStoreProvider = this.viewModelStoreProvider;
        if (navViewModelStoreProvider != null) {
            return navViewModelStoreProvider.get(this.id);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final NavViewModelStoreProvider getViewModelStoreProvider$navigation_common() {
        return this.viewModelStoreProvider;
    }

    public final void handleLifecycleEvent(Lifecycle.Event event) {
        x.f(event, NotificationCompat.CATEGORY_EVENT);
        this.hostLifecycleState = event.getTargetState();
        updateState();
    }

    public int hashCode() {
        int iHashCode = (this.id.hashCode() * 31) + this.destination.hashCode();
        Bundle bundle = this.immutableArgs;
        if (bundle != null) {
            SavedStateReader.m13269constructorimpl(bundle);
            iHashCode = (iHashCode * 31) + SavedStateReader.m13272contentDeepHashCodeimpl(bundle);
        }
        return (((iHashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public final void saveState(Bundle bundle) {
        x.f(bundle, "outBundle");
        this.savedStateRegistryController.performSave(bundle);
    }

    public final void setDestination(NavDestination navDestination) {
        x.f(navDestination, "<set-?>");
        this.destination = navDestination;
    }

    public final void setHostLifecycleState$navigation_common(Lifecycle.State state) {
        x.f(state, "<set-?>");
        this.hostLifecycleState = state;
    }

    public final void setMaxLifecycle(Lifecycle.State state) {
        x.f(state, "maxState");
        this.maxLifecycle = state;
        updateState();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Class<?> cls = sb.getClass();
        int i2 = ar.f48106a;
        sb.append(new m(cls).c());
        sb.append("(" + this.id + ")");
        sb.append(" destination=");
        sb.append(this.destination);
        return sb.toString();
    }

    public final void updateState() {
        if (!this.savedStateRegistryAttached) {
            this.savedStateRegistryController.performAttach();
            this.savedStateRegistryAttached = true;
            if (this.viewModelStoreProvider != null) {
                SavedStateHandleSupport.enableSavedStateHandles(this);
            }
            this.savedStateRegistryController.performRestore(this.savedState);
        }
        int iOrdinal = this.hostLifecycleState.ordinal();
        int iOrdinal2 = this.maxLifecycle.ordinal();
        LifecycleRegistry lifecycleRegistry = this.lifecycleRegistry;
        if (iOrdinal < iOrdinal2) {
            lifecycleRegistry.setCurrentState(this.hostLifecycleState);
        } else {
            lifecycleRegistry.setCurrentState(this.maxLifecycle);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ NavBackStackEntry create$default(Companion companion, NavContext navContext, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, int i2, Object obj) {
            Bundle bundle3;
            Companion companion2;
            NavContext navContext2;
            NavDestination navDestination2;
            if ((i2 & 8) != 0) {
                state = Lifecycle.State.CREATED;
            }
            Lifecycle.State state2 = state;
            NavViewModelStoreProvider navViewModelStoreProvider2 = (i2 & 16) != 0 ? null : navViewModelStoreProvider;
            if ((i2 & 32) != 0) {
                str = NavBackStackEntryKt.randomUuid();
            }
            String str2 = str;
            Bundle bundle4 = (i2 & 4) != 0 ? null : bundle;
            if ((i2 & 64) != 0) {
                bundle3 = null;
                navContext2 = navContext;
                navDestination2 = navDestination;
                companion2 = companion;
            } else {
                bundle3 = bundle2;
                companion2 = companion;
                navContext2 = navContext;
                navDestination2 = navDestination;
            }
            return companion2.create(navContext2, navDestination2, bundle4, state2, navViewModelStoreProvider2, str2, bundle3);
        }

        public final NavBackStackEntry create(NavBackStackEntry navBackStackEntry, Bundle bundle) {
            x.f(navBackStackEntry, "entry");
            NavBackStackEntry navBackStackEntry2 = new NavBackStackEntry(navBackStackEntry.getContext$navigation_common(), navBackStackEntry.getDestination(), bundle, navBackStackEntry.getHostLifecycleState$navigation_common(), navBackStackEntry.getViewModelStoreProvider$navigation_common(), navBackStackEntry.getId(), navBackStackEntry.getSavedState$navigation_common(), null);
            navBackStackEntry2.setHostLifecycleState$navigation_common(navBackStackEntry.getHostLifecycleState$navigation_common());
            navBackStackEntry2.setMaxLifecycle(navBackStackEntry.getMaxLifecycle());
            return navBackStackEntry2;
        }

        public final String randomUUID$navigation_common() {
            return NavBackStackEntryKt.randomUuid();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ NavBackStackEntry create$default(Companion companion, NavBackStackEntry navBackStackEntry, Bundle bundle, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                bundle = navBackStackEntry.getArguments();
            }
            return companion.create(navBackStackEntry, bundle);
        }

        public final NavBackStackEntry create(NavContext navContext, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2) {
            x.f(navDestination, "destination");
            x.f(state, "hostLifecycleState");
            x.f(str, TtmlNode.ATTR_ID);
            return new NavBackStackEntry(navContext, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2, null);
        }
    }

    public /* synthetic */ NavBackStackEntry(NavContext navContext, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, o oVar) {
        this(navContext, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    /* synthetic */ NavBackStackEntry(androidx.navigation.internal.NavContext r9, androidx.navigation.NavDestination r10, android.os.Bundle r11, androidx.lifecycle.Lifecycle.State r12, androidx.navigation.NavViewModelStoreProvider r13, java.lang.String r14, android.os.Bundle r15, int r16, h.g.b.o r17) {
        /*
            r8 = this;
            r0 = r16 & 8
            if (r0 == 0) goto L6
            androidx.lifecycle.Lifecycle$State r12 = androidx.lifecycle.Lifecycle.State.CREATED
        L6:
            r4 = r12
            r12 = r16 & 16
            r0 = 0
            if (r12 == 0) goto Le
            r5 = r0
            goto Lf
        Le:
            r5 = r13
        Lf:
            r12 = r16 & 32
            if (r12 == 0) goto L17
            java.lang.String r14 = androidx.navigation.NavBackStackEntryKt.randomUuid()
        L17:
            r6 = r14
            r12 = r16 & 4
            if (r12 == 0) goto L1e
            r3 = r0
            goto L1f
        L1e:
            r3 = r11
        L1f:
            r11 = r16 & 64
            if (r11 == 0) goto L28
            r7 = r0
            r1 = r9
            r2 = r10
            r0 = r8
            goto L2c
        L28:
            r7 = r15
            r0 = r8
            r1 = r9
            r2 = r10
        L2c:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavBackStackEntry.<init>(androidx.navigation.internal.NavContext, androidx.navigation.NavDestination, android.os.Bundle, androidx.lifecycle.Lifecycle$State, androidx.navigation.NavViewModelStoreProvider, java.lang.String, android.os.Bundle, int, h.g.b.o):void");
    }
}
