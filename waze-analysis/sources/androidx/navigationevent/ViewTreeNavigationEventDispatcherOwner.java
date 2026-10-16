package androidx.navigationevent;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ViewTreeNavigationEventDispatcherOwner {
    public static final NavigationEventDispatcherOwner get(View view) {
        x.f(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(com.waze.R.id.view_tree_navigation_event_dispatcher_owner);
            NavigationEventDispatcherOwner navigationEventDispatcherOwner = tag instanceof NavigationEventDispatcherOwner ? (NavigationEventDispatcherOwner) tag : null;
            if (navigationEventDispatcherOwner != null) {
                return navigationEventDispatcherOwner;
            }
            Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, NavigationEventDispatcherOwner navigationEventDispatcherOwner) {
        x.f(view, "<this>");
        view.setTag(com.waze.R.id.view_tree_navigation_event_dispatcher_owner, navigationEventDispatcherOwner);
    }
}
