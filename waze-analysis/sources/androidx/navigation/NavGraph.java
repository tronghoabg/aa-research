package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.internal.NavContext;
import androidx.navigation.internal.NavGraphImpl;
import h.g.a.l;
import h.g.b.a.a;
import h.g.b.ab;
import h.g.b.ah;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import h.m.h;
import h.m.k;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.b.b;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class NavGraph extends NavDestination implements Iterable<NavDestination>, a {
    public static final Companion Companion = new Companion(null);
    private final NavGraphImpl impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(Navigator<? extends NavGraph> navigator) {
        super(navigator);
        x.f(navigator, "navGraphNavigator");
        this.impl = new NavGraphImpl(this);
    }

    public static /* synthetic */ NavDestination findNodeComprehensive$default(NavGraph navGraph, int i2, NavDestination navDestination, boolean z, NavDestination navDestination2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findNodeComprehensive");
        }
        if ((i3 & 8) != 0) {
            navDestination2 = null;
        }
        return navGraph.findNodeComprehensive(i2, navDestination, z, navDestination2);
    }

    public static final NavDestination findStartDestination(NavGraph navGraph) {
        return Companion.findStartDestination(navGraph);
    }

    private static Object getNodes$delegate(NavGraph navGraph) {
        return new ah(navGraph.impl, NavGraphImpl.class, "nodes", "getNodes$navigation_common()Landroidx/collection/SparseArrayCompat;", 0);
    }

    private static Object getStartDestDisplayName$delegate(NavGraph navGraph) {
        return new ah(navGraph.impl, NavGraphImpl.class, "startDestDisplayName", "getStartDestDisplayName$navigation_common()Ljava/lang/String;", 0);
    }

    private static Object getStartDestinationId$delegate(NavGraph navGraph) {
        return new ab(navGraph.impl, NavGraphImpl.class, "startDestinationId", "getStartDestinationId$navigation_common()I", 0);
    }

    private static Object getStartDestinationRoute$delegate(NavGraph navGraph) {
        return new ab(navGraph.impl, NavGraphImpl.class, "startDestinationRoute", "getStartDestinationRoute$navigation_common()Ljava/lang/String;", 0);
    }

    private final void setStartDestinationId(int i2) {
        this.impl.setStartDestinationId$navigation_common(i2);
    }

    private final void setStartDestinationRoute(String str) {
        this.impl.setStartDestinationRoute$navigation_common(str);
    }

    public final void addAll(NavGraph navGraph) {
        x.f(navGraph, "other");
        this.impl.addAll$navigation_common(navGraph);
    }

    public final void addDestination(NavDestination navDestination) {
        x.f(navDestination, "node");
        this.impl.addDestination$navigation_common(navDestination);
    }

    public final void addDestinations(NavDestination... navDestinationArr) {
        x.f(navDestinationArr, "nodes");
        this.impl.addDestinations$navigation_common((NavDestination[]) Arrays.copyOf(navDestinationArr, navDestinationArr.length));
    }

    public final void clear() {
        this.impl.clear$navigation_common();
    }

    @Override // androidx.navigation.NavDestination
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof NavGraph) && super.equals(obj)) {
            NavGraph navGraph = (NavGraph) obj;
            if (getNodes().size() == navGraph.getNodes().size() && getStartDestinationId() == navGraph.getStartDestinationId()) {
                for (NavDestination navDestination : k.c(SparseArrayKt.valueIterator(getNodes()))) {
                    if (!x.n(navDestination, navGraph.getNodes().get(navDestination.getId()))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ <T> NavDestination findNode() {
        x.i();
        int i2 = ar.f48106a;
        return findNode((c<?>) new m(Object.class));
    }

    public final NavDestination findNodeComprehensive(int i2, NavDestination navDestination, boolean z, NavDestination navDestination2) {
        return this.impl.findNodeComprehensive$navigation_common(i2, navDestination, z, navDestination2);
    }

    @Override // androidx.navigation.NavDestination
    public String getDisplayName() {
        return this.impl.getDisplayName$navigation_common(super.getDisplayName());
    }

    public final SparseArrayCompat<NavDestination> getNodes() {
        return this.impl.getNodes$navigation_common();
    }

    public final String getStartDestDisplayName() {
        return this.impl.getStartDestDisplayName$navigation_common();
    }

    public final int getStartDestination() {
        return this.impl.getStartDestinationId$navigation_common();
    }

    public final int getStartDestinationId() {
        return this.impl.getStartDestinationId$navigation_common();
    }

    public final String getStartDestinationRoute() {
        return this.impl.getStartDestinationRoute$navigation_common();
    }

    @Override // androidx.navigation.NavDestination
    public int hashCode() {
        int startDestinationId = getStartDestinationId();
        SparseArrayCompat<NavDestination> nodes = getNodes();
        int size = nodes.size();
        for (int i2 = 0; i2 < size; i2++) {
            startDestinationId = (((startDestinationId * 31) + nodes.keyAt(i2)) * 31) + nodes.valueAt(i2).hashCode();
        }
        return startDestinationId;
    }

    @Override // java.lang.Iterable
    public final Iterator<NavDestination> iterator() {
        return this.impl.iterator$navigation_common();
    }

    @Override // androidx.navigation.NavDestination
    public NavDestination.DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        x.f(navDeepLinkRequest, "navDeepLinkRequest");
        return this.impl.matchDeepLink$navigation_common(super.matchDeepLink(navDeepLinkRequest), navDeepLinkRequest);
    }

    public final NavDestination.DeepLinkMatch matchDeepLinkComprehensive(NavDeepLinkRequest navDeepLinkRequest, boolean z, boolean z2, NavDestination navDestination) {
        x.f(navDeepLinkRequest, "navDeepLinkRequest");
        x.f(navDestination, "lastVisited");
        return this.impl.matchDeepLinkComprehensive$navigation_common(super.matchDeepLink(navDeepLinkRequest), navDeepLinkRequest, z, z2, navDestination);
    }

    public final NavDestination.DeepLinkMatch matchRouteComprehensive(String str, boolean z, boolean z2, NavDestination navDestination) {
        x.f(str, "route");
        x.f(navDestination, "lastVisited");
        return this.impl.matchRouteComprehensive$navigation_common(str, z, z2, navDestination);
    }

    @Override // androidx.navigation.NavDestination
    public void onInflate(Context context, AttributeSet attributeSet) {
        x.f(context, "context");
        x.f(attributeSet, "attrs");
        super.onInflate(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavGraphNavigator);
        x.e(typedArrayObtainAttributes, "obtainAttributes(...)");
        setStartDestinationId(typedArrayObtainAttributes.getResourceId(androidx.navigation.common.R.styleable.NavGraphNavigator_startDestination, 0));
        this.impl.setStartDestIdName$navigation_common(NavDestination.Companion.getDisplayName(new NavContext(context), this.impl.getStartDestId$navigation_common()));
        typedArrayObtainAttributes.recycle();
    }

    public final void remove(NavDestination navDestination) {
        x.f(navDestination, "node");
        this.impl.remove$navigation_common(navDestination);
    }

    public final /* synthetic */ <T> void setStartDestination() {
        x.i();
        int i2 = ar.f48106a;
        setStartDestination((c) new m(Object.class));
    }

    @Override // androidx.navigation.NavDestination
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        NavDestination navDestinationFindNode = findNode(getStartDestinationRoute());
        if (navDestinationFindNode == null) {
            navDestinationFindNode = findNode(getStartDestinationId());
        }
        sb.append(" startDestination=");
        if (navDestinationFindNode != null) {
            sb.append("{");
            sb.append(navDestinationFindNode.toString());
            sb.append("}");
        } else if (getStartDestinationRoute() != null) {
            sb.append(getStartDestinationRoute());
        } else {
            String startDestIdName$navigation_common = this.impl.getStartDestIdName$navigation_common();
            NavGraphImpl navGraphImpl = this.impl;
            if (startDestIdName$navigation_common != null) {
                sb.append(navGraphImpl.getStartDestIdName$navigation_common());
            } else {
                sb.append("0x".concat(String.valueOf(Integer.toHexString(navGraphImpl.getStartDestId$navigation_common()))));
            }
        }
        return sb.toString();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final NavDestination childHierarchy$lambda$0(NavDestination navDestination) {
            x.f(navDestination, "it");
            if (!(navDestination instanceof NavGraph)) {
                return null;
            }
            NavGraph navGraph = (NavGraph) navDestination;
            return navGraph.findNode(navGraph.getStartDestinationId());
        }

        public final h<NavDestination> childHierarchy(NavGraph navGraph) {
            x.f(navGraph, "<this>");
            return k.g(navGraph, new l() { // from class: androidx.navigation.NavGraph$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return NavGraph.Companion.childHierarchy$lambda$0((NavDestination) obj);
                }
            });
        }

        public final NavDestination findStartDestination(NavGraph navGraph) {
            x.f(navGraph, "<this>");
            h<NavDestination> hVarChildHierarchy = childHierarchy(navGraph);
            x.f(hVarChildHierarchy, "<this>");
            Iterator<NavDestination> it = hVarChildHierarchy.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException("Sequence is empty.");
            }
            NavDestination next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final void setStartDestination(int i2) {
        this.impl.setStartDestination$navigation_common(i2);
    }

    public final NavDestination findNode(int i2) {
        return this.impl.findNode$navigation_common(i2);
    }

    public final /* synthetic */ void setStartDestination(Object obj) {
        x.f(obj, "startDestRoute");
        this.impl.setStartDestination$navigation_common((NavGraphImpl) obj);
    }

    public final void addDestinations(Collection<? extends NavDestination> collection) {
        x.f(collection, "nodes");
        this.impl.addDestinations$navigation_common(collection);
    }

    public final <T> NavDestination findNode(T t) {
        return this.impl.findNode$navigation_common((NavGraphImpl) t);
    }

    public final void setStartDestination(String str) {
        x.f(str, "startDestRoute");
        this.impl.setStartDestination$navigation_common(str);
    }

    public final NavDestination findNode(String str) {
        return this.impl.findNode$navigation_common(str);
    }

    public final /* synthetic */ void setStartDestination(c cVar) {
        x.f(cVar, "startDestRoute");
        this.impl.setStartDestination$navigation_common(cVar);
    }

    public final NavDestination findNode(String str, boolean z) {
        x.f(str, "route");
        return this.impl.findNode$navigation_common(str, z);
    }

    public final <T> void setStartDestination(b<T> bVar, l<? super NavDestination, String> lVar) {
        x.f(bVar, "serializer");
        x.f(lVar, "parseRoute");
        this.impl.setStartDestination$navigation_common(bVar, lVar);
    }

    public final NavDestination findNode(c<?> cVar) {
        x.f(cVar, "route");
        return this.impl.findNode$navigation_common(cVar);
    }
}
