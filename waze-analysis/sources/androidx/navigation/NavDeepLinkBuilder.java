package androidx.navigation;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.core.app.TaskStackBuilder;
import androidx.navigation.Navigator;
import androidx.navigation.internal.NavContext;
import androidx.savedstate.SavedStateReader;
import h.a.i;
import h.a.u;
import h.g.a.l;
import h.g.b.x;
import h.m.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NavDeepLinkBuilder {
    private final Activity activity;
    private final Context context;
    private final List<DeepLinkDestination> destinations;
    private Bundle globalArgs;
    private NavGraph graph;
    private final Intent intent;
    private final NavContext navContext;

    /* compiled from: WazeSource */
    final class DeepLinkDestination {
        private final Bundle arguments;
        private final int destinationId;

        public DeepLinkDestination(int i2, Bundle bundle) {
            this.destinationId = i2;
            this.arguments = bundle;
        }

        public final Bundle getArguments() {
            return this.arguments;
        }

        public final int getDestinationId() {
            return this.destinationId;
        }
    }

    /* compiled from: WazeSource */
    final class PermissiveNavigatorProvider extends NavigatorProvider {
        private final Navigator<NavDestination> mDestNavigator = new Navigator<NavDestination>() { // from class: androidx.navigation.NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1
            @Override // androidx.navigation.Navigator
            public NavDestination createDestination() {
                return new NavDestination("permissive");
            }

            @Override // androidx.navigation.Navigator
            public NavDestination navigate(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
                x.f(navDestination, "destination");
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // androidx.navigation.Navigator
            public boolean popBackStack() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        };

        public PermissiveNavigatorProvider() {
            addNavigator(new NavGraphNavigator(this));
        }

        @Override // androidx.navigation.NavigatorProvider
        public <T extends Navigator<? extends NavDestination>> T getNavigator(String str) {
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            try {
                return (T) super.getNavigator(str);
            } catch (IllegalStateException unused) {
                Navigator<NavDestination> navigator = this.mDestNavigator;
                x.d(navigator, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
                return navigator;
            }
        }
    }

    public NavDeepLinkBuilder(Context context) {
        Intent launchIntentForPackage;
        x.f(context, "context");
        this.context = context;
        this.navContext = new NavContext(context);
        Activity activity = (Activity) k.i(k.p(k.g(context, new l() { // from class: androidx.navigation.NavDeepLinkBuilder$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return NavDeepLinkBuilder.activity$lambda$0((Context) obj);
            }
        }), new l() { // from class: androidx.navigation.NavDeepLinkBuilder$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return NavDeepLinkBuilder.activity$lambda$1((Context) obj);
            }
        }));
        this.activity = activity;
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.intent = launchIntentForPackage;
        this.destinations = new ArrayList();
    }

    static final Context activity$lambda$0(Context context) {
        x.f(context, "it");
        ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
        if (contextWrapper != null) {
            return contextWrapper.getBaseContext();
        }
        return null;
    }

    static final Activity activity$lambda$1(Context context) {
        x.f(context, "it");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i2, Bundle bundle, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            bundle = null;
        }
        navDeepLinkBuilder.addDestination(i2, bundle);
        return navDeepLinkBuilder;
    }

    private final void fillInIntent() {
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        NavDestination navDestination = null;
        for (DeepLinkDestination deepLinkDestination : this.destinations) {
            int destinationId = deepLinkDestination.getDestinationId();
            Bundle arguments = deepLinkDestination.getArguments();
            NavDestination navDestinationFindDestination = findDestination(destinationId);
            if (navDestinationFindDestination == null) {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.Companion.getDisplayName(this.navContext, destinationId) + " cannot be found in the navigation graph " + this.graph);
            }
            for (int i2 : navDestinationFindDestination.buildDeepLinkIds(navDestination)) {
                arrayList.add(Integer.valueOf(i2));
                arrayList2.add(arguments);
            }
            navDestination = navDestinationFindDestination;
        }
        this.intent.putExtra(NavController.KEY_DEEP_LINK_IDS, i.aA(arrayList));
        this.intent.putParcelableArrayListExtra(NavController.KEY_DEEP_LINK_ARGS, arrayList2);
    }

    private final NavDestination findDestination(int i2) {
        u uVar = new u();
        NavGraph navGraph = this.graph;
        x.c(navGraph);
        uVar.add(navGraph);
        while (!uVar.isEmpty()) {
            NavDestination navDestination = (NavDestination) uVar.removeFirst();
            if (navDestination.getId() == i2) {
                return navDestination;
            }
            if (navDestination instanceof NavGraph) {
                Iterator<NavDestination> it = ((NavGraph) navDestination).iterator();
                while (it.hasNext()) {
                    uVar.add(it.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i2, Bundle bundle, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            bundle = null;
        }
        navDeepLinkBuilder.setDestination(i2, bundle);
        return navDeepLinkBuilder;
    }

    private final void verifyAllDestinations() {
        Iterator<DeepLinkDestination> it = this.destinations.iterator();
        while (it.hasNext()) {
            int destinationId = it.next().getDestinationId();
            if (findDestination(destinationId) == null) {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.Companion.getDisplayName(this.navContext, destinationId) + " cannot be found in the navigation graph " + this.graph);
            }
        }
    }

    public final NavDeepLinkBuilder addDestination(String str, Bundle bundle) {
        x.f(str, "route");
        this.destinations.add(new DeepLinkDestination(NavDestination.Companion.createRoute(str).hashCode(), bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public final PendingIntent createPendingIntent() {
        int destinationId;
        Integer numValueOf;
        Bundle bundle = this.globalArgs;
        if (bundle != null) {
            SavedStateReader.m13269constructorimpl(bundle);
            destinationId = SavedStateReader.m13272contentDeepHashCodeimpl(bundle);
        } else {
            destinationId = 0;
        }
        for (DeepLinkDestination deepLinkDestination : this.destinations) {
            destinationId = (destinationId * 31) + deepLinkDestination.getDestinationId();
            Bundle arguments = deepLinkDestination.getArguments();
            if (arguments != null) {
                SavedStateReader.m13269constructorimpl(arguments);
                numValueOf = Integer.valueOf(SavedStateReader.m13272contentDeepHashCodeimpl(arguments));
            } else {
                numValueOf = null;
            }
            if (numValueOf != null) {
                destinationId = (destinationId * 31) + numValueOf.intValue();
            }
        }
        PendingIntent pendingIntent = createTaskStackBuilder().getPendingIntent(destinationId, 201326592);
        x.c(pendingIntent);
        return pendingIntent;
    }

    public final TaskStackBuilder createTaskStackBuilder() {
        if (this.graph == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        if (this.destinations.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        fillInIntent();
        Context context = this.context;
        Intent intent = this.intent;
        TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(context);
        taskStackBuilderCreate.addNextIntentWithParentStack(new Intent(intent));
        x.e(taskStackBuilderCreate, "addNextIntentWithParentStack(...)");
        int intentCount = taskStackBuilderCreate.getIntentCount();
        for (int i2 = 0; i2 < intentCount; i2++) {
            Intent intentEditIntentAt = taskStackBuilderCreate.editIntentAt(i2);
            if (intentEditIntentAt != null) {
                intentEditIntentAt.putExtra(NavController.KEY_DEEP_LINK_INTENT, this.intent);
            }
        }
        return taskStackBuilderCreate;
    }

    public final NavContext getNavContext$navigation_runtime() {
        return this.navContext;
    }

    public final NavDeepLinkBuilder setArguments(Bundle bundle) {
        this.globalArgs = bundle;
        this.intent.putExtra(NavController.KEY_DEEP_LINK_EXTRAS, bundle);
        return this;
    }

    public final NavDeepLinkBuilder setComponentName(Class<? extends Activity> cls) {
        x.f(cls, "activityClass");
        setComponentName(new ComponentName(this.context, cls));
        return this;
    }

    public final NavDeepLinkBuilder setDestination(String str, Bundle bundle) {
        x.f(str, "destRoute");
        this.destinations.clear();
        this.destinations.add(new DeepLinkDestination(NavDestination.Companion.createRoute(str).hashCode(), bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public final NavDeepLinkBuilder setGraph(int i2) {
        setGraph(new NavInflater(this.context, new PermissiveNavigatorProvider()).inflate(i2));
        return this;
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        navDeepLinkBuilder.addDestination(str, bundle);
        return navDeepLinkBuilder;
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        navDeepLinkBuilder.setDestination(str, bundle);
        return navDeepLinkBuilder;
    }

    public final NavDeepLinkBuilder setComponentName(ComponentName componentName) {
        x.f(componentName, "componentName");
        this.intent.setComponent(componentName);
        return this;
    }

    public final NavDeepLinkBuilder setGraph(NavGraph navGraph) {
        x.f(navGraph, "navGraph");
        this.graph = navGraph;
        verifyAllDestinations();
        return this;
    }

    public final NavDeepLinkBuilder addDestination(String str) {
        x.f(str, "route");
        addDestination$default(this, str, (Bundle) null, 2, (Object) null);
        return this;
    }

    public final NavDeepLinkBuilder addDestination(int i2, Bundle bundle) {
        this.destinations.add(new DeepLinkDestination(i2, bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public final NavDeepLinkBuilder addDestination(int i2) {
        addDestination$default(this, i2, (Bundle) null, 2, (Object) null);
        return this;
    }

    public final NavDeepLinkBuilder setDestination(String str) {
        x.f(str, "destRoute");
        setDestination$default(this, str, (Bundle) null, 2, (Object) null);
        return this;
    }

    public final NavDeepLinkBuilder setDestination(int i2, Bundle bundle) {
        this.destinations.clear();
        this.destinations.add(new DeepLinkDestination(i2, bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public final NavDeepLinkBuilder setDestination(int i2) {
        setDestination$default(this, i2, (Bundle) null, 2, (Object) null);
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDeepLinkBuilder(NavController navController) {
        this(navController.getContext());
        x.f(navController, "navController");
        this.graph = navController.getGraph();
    }
}
