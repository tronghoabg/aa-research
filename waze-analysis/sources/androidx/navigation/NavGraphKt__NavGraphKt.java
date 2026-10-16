package androidx.navigation;

import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.l.c;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class NavGraphKt__NavGraphKt {
    public static final /* synthetic */ <T> boolean contains(NavGraph navGraph, c<T> cVar) {
        x.f(navGraph, "<this>");
        x.f(cVar, "route");
        x.i();
        int i2 = ar.f48106a;
        return navGraph.findNode((c<?>) new m(Object.class)) != null;
    }

    public static final /* synthetic */ <T> NavDestination get(NavGraph navGraph, c<T> cVar) {
        x.f(navGraph, "<this>");
        x.f(cVar, "route");
        x.i();
        int i2 = ar.f48106a;
        NavDestination navDestinationFindNode = navGraph.findNode((c<?>) new m(Object.class));
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + cVar + " was found in " + navGraph);
    }

    public static final void minusAssign(NavGraph navGraph, NavDestination navDestination) {
        x.f(navGraph, "<this>");
        x.f(navDestination, "node");
        navGraph.remove(navDestination);
    }

    public static final void plusAssign(NavGraph navGraph, NavDestination navDestination) {
        x.f(navGraph, "<this>");
        x.f(navDestination, "node");
        navGraph.addDestination(navDestination);
    }

    public static final void plusAssign(NavGraph navGraph, NavGraph navGraph2) {
        x.f(navGraph, "<this>");
        x.f(navGraph2, "other");
        navGraph.addAll(navGraph2);
    }

    public static final boolean contains(NavGraph navGraph, String str) {
        x.f(navGraph, "<this>");
        x.f(str, "route");
        return navGraph.findNode(str) != null;
    }

    public static final <T> boolean contains(NavGraph navGraph, T t) {
        x.f(navGraph, "<this>");
        x.f(t, "route");
        return navGraph.findNode((NavGraph) t) != null;
    }

    public static final NavDestination get(NavGraph navGraph, String str) {
        x.f(navGraph, "<this>");
        x.f(str, "route");
        NavDestination navDestinationFindNode = navGraph.findNode(str);
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + str + " was found in " + navGraph);
    }

    public static final <T> NavDestination get(NavGraph navGraph, T t) {
        x.f(navGraph, "<this>");
        x.f(t, "route");
        NavDestination navDestinationFindNode = navGraph.findNode((NavGraph) t);
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + t + " was found in " + navGraph);
    }
}
