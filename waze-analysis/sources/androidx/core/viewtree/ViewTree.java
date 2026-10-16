package androidx.core.viewtree;

import android.view.View;
import android.view.ViewParent;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewTree {
    public static final ViewParent getParentOrViewTreeDisjointParent(View view) {
        x.f(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(com.waze.R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final void setViewTreeDisjointParent(View view, ViewParent viewParent) {
        x.f(view, "<this>");
        view.setTag(com.waze.R.id.view_tree_disjoint_parent, viewParent);
    }
}
