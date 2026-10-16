package androidx.navigation;

import h.g.a.l;
import h.g.b.x;
import h.l.c;
import h.l.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.b.p;

/* compiled from: WazeSource */
@NavDestinationDsl
/* loaded from: classes3.dex */
public class NavGraphBuilder extends NavDestinationBuilder<NavGraph> {
    private final List<NavDestination> destinations;
    private final NavigatorProvider provider;
    private c<?> startDestinationClass;
    private int startDestinationId;
    private Object startDestinationObject;
    private String startDestinationRoute;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, Object obj, c<?> cVar, Map<s, NavType<?>> map) {
        super(navigatorProvider.getNavigator(NavGraphNavigator.class), cVar, map);
        x.f(navigatorProvider, "provider");
        x.f(obj, "startDestination");
        x.f(map, "typeMap");
        this.destinations = new ArrayList();
        this.provider = navigatorProvider;
        this.startDestinationObject = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String build$lambda$0$0(NavDestination navDestination) {
        x.f(navDestination, "it");
        String route = navDestination.getRoute();
        x.c(route);
        return route;
    }

    public final void addDestination(NavDestination navDestination) {
        x.f(navDestination, "destination");
        this.destinations.add(navDestination);
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public NavGraph build() {
        NavGraph navGraph = (NavGraph) super.build();
        navGraph.addDestinations(this.destinations);
        int i2 = this.startDestinationId;
        if (i2 == 0) {
            if (this.startDestinationRoute == null && this.startDestinationClass == null && this.startDestinationObject == null) {
                if (getRoute() != null) {
                    throw new IllegalStateException("You must set a start destination route");
                }
                throw new IllegalStateException("You must set a start destination id");
            }
            i2 = 0;
        }
        String str = this.startDestinationRoute;
        if (str != null) {
            navGraph.setStartDestination(str);
            return navGraph;
        }
        c<?> cVar = this.startDestinationClass;
        if (cVar != null) {
            navGraph.setStartDestination(p.a(cVar), new l() { // from class: androidx.navigation.NavGraphBuilder$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return NavGraphBuilder.build$lambda$0$0((NavDestination) obj);
                }
            });
            return navGraph;
        }
        Object obj = this.startDestinationObject;
        if (obj != null) {
            navGraph.setStartDestination(obj);
            return navGraph;
        }
        navGraph.setStartDestination(i2);
        return navGraph;
    }

    public final <D extends NavDestination> void destination(NavDestinationBuilder<? extends D> navDestinationBuilder) {
        x.f(navDestinationBuilder, "navDestination");
        this.destinations.add(navDestinationBuilder.build());
    }

    public final NavigatorProvider getProvider() {
        return this.provider;
    }

    public final void unaryPlus(NavDestination navDestination) {
        x.f(navDestination, "<this>");
        addDestination(navDestination);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, int i2, int i3) {
        super(navigatorProvider.getNavigator(NavGraphNavigator.class), i2);
        x.f(navigatorProvider, "provider");
        this.destinations = new ArrayList();
        this.provider = navigatorProvider;
        this.startDestinationId = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, String str, String str2) {
        super(navigatorProvider.getNavigator(NavGraphNavigator.class), str2);
        x.f(navigatorProvider, "provider");
        x.f(str, "startDestination");
        this.destinations = new ArrayList();
        this.provider = navigatorProvider;
        this.startDestinationRoute = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, c<?> cVar, c<?> cVar2, Map<s, NavType<?>> map) {
        super(navigatorProvider.getNavigator(NavGraphNavigator.class), cVar2, map);
        x.f(navigatorProvider, "provider");
        x.f(cVar, "startDestination");
        x.f(map, "typeMap");
        this.destinations = new ArrayList();
        this.provider = navigatorProvider;
        this.startDestinationClass = cVar;
    }
}
