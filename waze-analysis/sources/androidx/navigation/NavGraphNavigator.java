package androidx.navigation;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import h.a.r;
import h.g.a.l;
import h.g.b.aq;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
@Navigator.Name("navigation")
/* loaded from: classes.dex */
public class NavGraphNavigator extends Navigator<NavGraph> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "navigation";
    private final NavigatorProvider navigatorProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphNavigator(NavigatorProvider navigatorProvider) {
        super("navigation");
        x.f(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    private final void navigate(NavBackStackEntry navBackStackEntry, NavOptions navOptions, Navigator.Extras extras) {
        k[] kVarArr;
        NavDestination destination = navBackStackEntry.getDestination();
        x.d(destination, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        NavGraph navGraph = (NavGraph) destination;
        final aq aqVar = new aq();
        aqVar.f48105a = navBackStackEntry.getArguments();
        int startDestinationId = navGraph.getStartDestinationId();
        String startDestinationRoute = navGraph.getStartDestinationRoute();
        if (startDestinationId == 0) {
            if (startDestinationRoute == null) {
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(String.valueOf(navGraph.getDisplayName())));
            }
            startDestinationId = 0;
        }
        NavDestination navDestinationFindNode = startDestinationRoute != null ? navGraph.findNode(startDestinationRoute, false) : navGraph.getNodes().get(startDestinationId);
        if (navDestinationFindNode == null) {
            throw new IllegalArgumentException("navigation destination " + navGraph.getStartDestDisplayName() + " is not a direct child of this NavGraph");
        }
        if (startDestinationRoute != null) {
            if (!x.n(startDestinationRoute, navDestinationFindNode.getRoute())) {
                NavDestination.DeepLinkMatch deepLinkMatchMatchRoute = navDestinationFindNode.matchRoute(startDestinationRoute);
                Bundle matchingArgs = deepLinkMatchMatchRoute != null ? deepLinkMatchMatchRoute.getMatchingArgs() : null;
                if (matchingArgs != null) {
                    SavedStateReader.m13269constructorimpl(matchingArgs);
                    if (!SavedStateReader.m13347isEmptyimpl(matchingArgs)) {
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
                        SavedStateWriter.m13359putAllimpl(bundleBundleOf, matchingArgs);
                        Bundle bundle = (Bundle) aqVar.f48105a;
                        if (bundle != null) {
                            SavedStateWriter.m13359putAllimpl(bundleBundleOf, bundle);
                        }
                        aqVar.f48105a = bundleBundleOf;
                    }
                }
            }
            if (!navDestinationFindNode.getArguments().isEmpty()) {
                List<String> listMissingRequiredArguments = NavArgumentKt.missingRequiredArguments(navDestinationFindNode.getArguments(), new l() { // from class: androidx.navigation.NavGraphNavigator$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(NavGraphNavigator.navigate$lambda$4(aqVar, (String) obj));
                    }
                });
                if (!listMissingRequiredArguments.isEmpty()) {
                    throw new IllegalArgumentException("Cannot navigate to startDestination " + navDestinationFindNode + ". Missing required arguments [" + listMissingRequiredArguments + "]");
                }
            }
        }
        Navigator navigator = this.navigatorProvider.getNavigator(navDestinationFindNode.getNavigatorName());
        List<NavBackStackEntry> listSingletonList = Collections.singletonList(getState().createBackStackEntry(navDestinationFindNode, navDestinationFindNode.addInDefaultArgs((Bundle) aqVar.f48105a)));
        x.e(listSingletonList, "singletonList(...)");
        navigator.navigate(listSingletonList, navOptions, extras);
    }

    static final boolean navigate$lambda$4(aq aqVar, String str) {
        x.f(str, "key");
        Object obj = aqVar.f48105a;
        if (obj == null) {
            return true;
        }
        Bundle bundle = (Bundle) obj;
        SavedStateReader.m13269constructorimpl(bundle);
        return !SavedStateReader.m13270containsimpl(bundle, str);
    }

    @Override // androidx.navigation.Navigator
    public NavGraph createDestination() {
        return new NavGraph(this);
    }

    public final ch<List<NavBackStackEntry>> getBackStack() {
        return getState().getBackStack();
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras) {
        x.f(list, "entries");
        Iterator<NavBackStackEntry> it = list.iterator();
        while (it.hasNext()) {
            navigate(it.next(), navOptions, extras);
        }
    }
}
