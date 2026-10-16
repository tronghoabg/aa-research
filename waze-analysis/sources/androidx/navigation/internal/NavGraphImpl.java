package androidx.navigation.internal;

import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavArgument;
import androidx.navigation.NavDeepLinkRequest;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.serialization.RouteSerializerKt;
import h.a.i;
import h.a.r;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.l.c;
import h.m.k;
import h.n.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.b.b;
import kotlinx.b.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavGraphImpl {
    private final NavGraph graph;
    private final SparseArrayCompat<NavDestination> nodes;
    private int startDestId;
    private String startDestIdName;
    private String startDestinationRoute;

    public NavGraphImpl(NavGraph navGraph) {
        x.f(navGraph, "graph");
        this.graph = navGraph;
        this.nodes = new SparseArrayCompat<>(0, 1, null);
    }

    public static /* synthetic */ NavDestination findNodeComprehensive$navigation_common$default(NavGraphImpl navGraphImpl, int i2, NavDestination navDestination, boolean z, NavDestination navDestination2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            navDestination2 = null;
        }
        return navGraphImpl.findNodeComprehensive$navigation_common(i2, navDestination, z, navDestination2);
    }

    static final String setStartDestination$lambda$0(NavDestination navDestination) {
        x.f(navDestination, "startDestination");
        String route = navDestination.getRoute();
        x.c(route);
        return route;
    }

    static final String setStartDestination$lambda$1(Object obj, NavDestination navDestination) {
        x.f(navDestination, "startDestination");
        Map<String, NavArgument> arguments = navDestination.getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.a(arguments.size()));
        Iterator<T> it = arguments.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).getType());
        }
        return RouteSerializerKt.generateRouteWithArgs(obj, linkedHashMap);
    }

    public final void addAll$navigation_common(NavGraph navGraph) {
        x.f(navGraph, "other");
        Iterator<NavDestination> it = navGraph.iterator();
        while (it.hasNext()) {
            NavDestination next = it.next();
            it.remove();
            addDestination$navigation_common(next);
        }
    }

    public final void addDestination$navigation_common(NavDestination navDestination) {
        x.f(navDestination, "node");
        int id = navDestination.getId();
        String route = navDestination.getRoute();
        if (id == 0) {
            if (route == null) {
                throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            }
            id = 0;
        }
        if (this.graph.getRoute() != null && x.n(route, this.graph.getRoute())) {
            throw new IllegalArgumentException("Destination " + navDestination + " cannot have the same route as graph " + this.graph);
        }
        if (id == this.graph.getId()) {
            throw new IllegalArgumentException("Destination " + navDestination + " cannot have the same id as graph " + this.graph);
        }
        NavDestination navDestination2 = this.nodes.get(id);
        if (navDestination2 == navDestination) {
            return;
        }
        if (navDestination.getParent() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (navDestination2 != null) {
            navDestination2.setParent(null);
        }
        navDestination.setParent(this.graph);
        this.nodes.put(navDestination.getId(), navDestination);
    }

    public final void addDestinations$navigation_common(Collection<? extends NavDestination> collection) {
        x.f(collection, "nodes");
        for (NavDestination navDestination : collection) {
            if (navDestination != null) {
                addDestination$navigation_common(navDestination);
            }
        }
    }

    public final void clear$navigation_common() {
        Iterator<NavDestination> itIterator$navigation_common = iterator$navigation_common();
        while (itIterator$navigation_common.hasNext()) {
            itIterator$navigation_common.next();
            itIterator$navigation_common.remove();
        }
    }

    public final NavDestination findNode$navigation_common(String str, boolean z) {
        Object next;
        x.f(str, "route");
        Iterator it = k.c(SparseArrayKt.valueIterator(this.nodes)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            NavDestination navDestination = (NavDestination) next;
            if (o.m(navDestination.getRoute(), str, false) || navDestination.matchRoute(str) != null) {
                break;
            }
        }
        NavDestination navDestination2 = (NavDestination) next;
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (!z || this.graph.getParent() == null) {
            return null;
        }
        NavGraph parent = this.graph.getParent();
        x.c(parent);
        return parent.findNode(str);
    }

    public final NavDestination findNodeComprehensive$navigation_common(int i2, NavDestination navDestination, boolean z, NavDestination navDestination2) {
        NavDestination navDestinationFindNodeComprehensive;
        NavDestination navDestination3 = this.nodes.get(i2);
        if (navDestination2 == null ? navDestination3 != null : x.n(navDestination3, navDestination2) && x.n(navDestination3.getParent(), navDestination2.getParent())) {
            return navDestination3;
        }
        if (z) {
            for (NavDestination navDestination4 : k.c(SparseArrayKt.valueIterator(this.nodes))) {
                navDestinationFindNodeComprehensive = (!(navDestination4 instanceof NavGraph) || x.n(navDestination4, navDestination)) ? null : ((NavGraph) navDestination4).findNodeComprehensive(i2, this.graph, true, navDestination2);
                if (navDestinationFindNodeComprehensive != null) {
                    break;
                }
            }
            navDestinationFindNodeComprehensive = null;
        } else {
            navDestinationFindNodeComprehensive = null;
        }
        if (navDestinationFindNodeComprehensive != null) {
            return navDestinationFindNodeComprehensive;
        }
        if (this.graph.getParent() == null || x.n(this.graph.getParent(), navDestination)) {
            return null;
        }
        NavGraph parent = this.graph.getParent();
        x.c(parent);
        return parent.findNodeComprehensive(i2, this.graph, z, navDestination2);
    }

    public final String getDisplayName$navigation_common(String str) {
        x.f(str, "superName");
        return this.graph.getId() != 0 ? str : "the root navigation";
    }

    public final NavGraph getGraph() {
        return this.graph;
    }

    public final SparseArrayCompat<NavDestination> getNodes$navigation_common() {
        return this.nodes;
    }

    public final String getStartDestDisplayName$navigation_common() {
        String strValueOf = this.startDestIdName;
        if (strValueOf == null) {
            strValueOf = this.startDestinationRoute;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.startDestId);
            }
            this.startDestIdName = strValueOf;
        }
        x.c(strValueOf);
        return strValueOf;
    }

    public final int getStartDestId$navigation_common() {
        return this.startDestId;
    }

    public final String getStartDestIdName$navigation_common() {
        return this.startDestIdName;
    }

    public final int getStartDestinationId$navigation_common() {
        return this.startDestId;
    }

    public final String getStartDestinationRoute$navigation_common() {
        return this.startDestinationRoute;
    }

    public final Iterator<NavDestination> iterator$navigation_common() {
        return new NavGraphImpl$iterator$1(this);
    }

    public final NavDestination.DeepLinkMatch matchDeepLink$navigation_common(NavDestination.DeepLinkMatch deepLinkMatch, NavDeepLinkRequest navDeepLinkRequest) {
        x.f(navDeepLinkRequest, "navDeepLinkRequest");
        return matchDeepLinkComprehensive$navigation_common(deepLinkMatch, navDeepLinkRequest, true, false, this.graph);
    }

    public final NavDestination.DeepLinkMatch matchDeepLinkComprehensive$navigation_common(NavDestination.DeepLinkMatch deepLinkMatch, NavDeepLinkRequest navDeepLinkRequest, boolean z, boolean z2, NavDestination navDestination) {
        NavDestination.DeepLinkMatch deepLinkMatch2;
        x.f(navDeepLinkRequest, "navDeepLinkRequest");
        x.f(navDestination, "lastVisited");
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = null;
        if (z) {
            NavGraph navGraph = this.graph;
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination2 : navGraph) {
                NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink = !x.n(navDestination2, navDestination) ? navDestination2.matchDeepLink(navDeepLinkRequest) : null;
                if (deepLinkMatchMatchDeepLink != null) {
                    arrayList.add(deepLinkMatchMatchDeepLink);
                }
            }
            deepLinkMatch2 = (NavDestination.DeepLinkMatch) i.J(arrayList);
        } else {
            deepLinkMatch2 = null;
        }
        NavGraph parent = this.graph.getParent();
        if (parent != null && z2 && !x.n(parent, navDestination)) {
            deepLinkMatchMatchDeepLinkComprehensive = parent.matchDeepLinkComprehensive(navDeepLinkRequest, z, true, this.graph);
        }
        return (NavDestination.DeepLinkMatch) i.J(i.k(deepLinkMatch, deepLinkMatch2, deepLinkMatchMatchDeepLinkComprehensive));
    }

    public final NavDestination.DeepLinkMatch matchRouteComprehensive$navigation_common(String str, boolean z, boolean z2, NavDestination navDestination) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        x.f(str, "route");
        x.f(navDestination, "lastVisited");
        NavDestination.DeepLinkMatch deepLinkMatchMatchRoute = this.graph.matchRoute(str);
        NavDestination.DeepLinkMatch deepLinkMatchMatchRouteComprehensive = null;
        if (z) {
            NavGraph navGraph = this.graph;
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination2 : navGraph) {
                NavDestination.DeepLinkMatch deepLinkMatchMatchRouteComprehensive2 = x.n(navDestination2, navDestination) ? null : navDestination2 instanceof NavGraph ? ((NavGraph) navDestination2).matchRouteComprehensive(str, true, false, this.graph) : navDestination2.matchRoute(str);
                if (deepLinkMatchMatchRouteComprehensive2 != null) {
                    arrayList.add(deepLinkMatchMatchRouteComprehensive2);
                }
            }
            deepLinkMatch = (NavDestination.DeepLinkMatch) i.J(arrayList);
        } else {
            deepLinkMatch = null;
        }
        NavGraph parent = this.graph.getParent();
        if (parent != null && z2 && !x.n(parent, navDestination)) {
            deepLinkMatchMatchRouteComprehensive = parent.matchRouteComprehensive(str, z, true, this.graph);
        }
        return (NavDestination.DeepLinkMatch) i.J(i.k(deepLinkMatchMatchRoute, deepLinkMatch, deepLinkMatchMatchRouteComprehensive));
    }

    public final void remove$navigation_common(NavDestination navDestination) {
        x.f(navDestination, "node");
        int iIndexOfKey = this.nodes.indexOfKey(navDestination.getId());
        if (iIndexOfKey >= 0) {
            this.nodes.valueAt(iIndexOfKey).setParent(null);
            this.nodes.removeAt(iIndexOfKey);
        }
    }

    public final void setStartDestId$navigation_common(int i2) {
        this.startDestId = i2;
    }

    public final void setStartDestIdName$navigation_common(String str) {
        this.startDestIdName = str;
    }

    public final <T> void setStartDestination$navigation_common(b<T> bVar, l<? super NavDestination, String> lVar) {
        x.f(bVar, "serializer");
        x.f(lVar, "parseRoute");
        int iGenerateHashCode = RouteSerializerKt.generateHashCode(bVar);
        NavDestination navDestinationFindNode$navigation_common = findNode$navigation_common(iGenerateHashCode);
        if (navDestinationFindNode$navigation_common != null) {
            setStartDestinationRoute$navigation_common(lVar.invoke(navDestinationFindNode$navigation_common));
            this.startDestId = iGenerateHashCode;
        } else {
            throw new IllegalStateException("Cannot find startDestination " + bVar.getDescriptor().d() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.");
        }
    }

    public final void setStartDestinationId$navigation_common(int i2) {
        if (i2 != this.graph.getId()) {
            if (this.startDestinationRoute != null) {
                setStartDestinationRoute$navigation_common(null);
            }
            this.startDestId = i2;
            this.startDestIdName = null;
            return;
        }
        throw new IllegalArgumentException("Start destination " + i2 + " cannot use the same id as the graph " + this.graph);
    }

    public final void setStartDestinationRoute$navigation_common(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (x.n(str, this.graph.getRoute())) {
                throw new IllegalArgumentException("Start destination " + str + " cannot use the same route as the graph " + this.graph);
            }
            if (o.G(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = NavDestination.Companion.createRoute(str).hashCode();
        }
        this.startDestId = iHashCode;
        this.startDestinationRoute = str;
    }

    public final void addDestinations$navigation_common(NavDestination... navDestinationArr) {
        x.f(navDestinationArr, "nodes");
        for (NavDestination navDestination : navDestinationArr) {
            addDestination$navigation_common(navDestination);
        }
    }

    public final <T> void setStartDestination$navigation_common(final T t) {
        x.f(t, "startDestRoute");
        Class<?> cls = t.getClass();
        int i2 = ar.f48106a;
        setStartDestination$navigation_common(p.a(new m(cls)), new l() { // from class: androidx.navigation.internal.NavGraphImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return NavGraphImpl.setStartDestination$lambda$1(t, (NavDestination) obj);
            }
        });
    }

    public final void setStartDestination$navigation_common(String str) {
        x.f(str, "startDestRoute");
        setStartDestinationRoute$navigation_common(str);
    }

    public final <T> void setStartDestination$navigation_common(c<T> cVar) {
        x.f(cVar, "startDestRoute");
        setStartDestination$navigation_common(p.a(cVar), new l() { // from class: androidx.navigation.internal.NavGraphImpl$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return NavGraphImpl.setStartDestination$lambda$0((NavDestination) obj);
            }
        });
    }

    public final void setStartDestination$navigation_common(int i2) {
        setStartDestinationId$navigation_common(i2);
    }

    public final <T> NavDestination findNode$navigation_common(T t) {
        if (t == null) {
            return null;
        }
        int i2 = ar.f48106a;
        return findNode$navigation_common(RouteSerializerKt.generateHashCode(p.a(new m(t.getClass()))));
    }

    public final NavDestination findNode$navigation_common(String str) {
        String str2 = str;
        if (str2 == null || o.G(str2)) {
            return null;
        }
        return findNode$navigation_common(str, true);
    }

    public final NavDestination findNode$navigation_common(int i2) {
        return findNodeComprehensive$navigation_common$default(this, i2, this.graph, false, null, 8, null);
    }

    public final NavDestination findNode$navigation_common(c<?> cVar) {
        x.f(cVar, "route");
        return findNode$navigation_common(RouteSerializerKt.generateHashCode(p.a(cVar)));
    }
}
