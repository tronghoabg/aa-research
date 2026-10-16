package androidx.activity;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ViewTreeFullyDrawnReporterOwner {
    public static final FullyDrawnReporterOwner get(View view) {
        x.f(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(com.waze.R.id.report_drawn);
            FullyDrawnReporterOwner fullyDrawnReporterOwner = tag instanceof FullyDrawnReporterOwner ? (FullyDrawnReporterOwner) tag : null;
            if (fullyDrawnReporterOwner != null) {
                return fullyDrawnReporterOwner;
            }
            Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        x.f(view, "<this>");
        x.f(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(com.waze.R.id.report_drawn, fullyDrawnReporterOwner);
    }
}
