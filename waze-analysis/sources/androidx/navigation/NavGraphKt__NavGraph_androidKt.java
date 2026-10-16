package androidx.navigation;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class NavGraphKt__NavGraph_androidKt {
    public static final boolean contains(NavGraph navGraph, int i2) {
        x.f(navGraph, "<this>");
        return navGraph.findNode(i2) != null;
    }

    public static final NavDestination get(NavGraph navGraph, int i2) {
        x.f(navGraph, "<this>");
        NavDestination navDestinationFindNode = navGraph.findNode(i2);
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + i2 + " was found in " + navGraph);
    }
}
