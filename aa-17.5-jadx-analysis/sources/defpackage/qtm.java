package defpackage;

import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
final class qtm implements ras {
    private final View b(ViewGroup viewGroup, ViewGroup viewGroup2, View view, int i, boolean z) {
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup2, view, i);
        if (viewGroup2 != viewGroup) {
            if (rsb.d(viewGroup2)) {
                if (viewFindNextFocus == null) {
                    int iA = rsb.a(viewGroup2);
                    if (iA == 1) {
                        if (omc.c("CAR.PROJECTION.SEARCH", 3)) {
                            rrd.d(3, "CAR.PROJECTION.SEARCH", null, "Force field MODAL triggered. root: %s, view: %s, direction: %s", viewGroup2, view, qrv.n(i));
                            return view;
                        }
                    } else if (iA != 2 || !z) {
                        int nextFocusRightId = i == 66 ? viewGroup2.getNextFocusRightId() : i == 17 ? viewGroup2.getNextFocusLeftId() : i == 33 ? viewGroup2.getNextFocusUpId() : i == 130 ? viewGroup2.getNextFocusDownId() : -1;
                        if (nextFocusRightId != -1) {
                            if (nextFocusRightId != view.getId()) {
                                return viewGroup.findViewById(nextFocusRightId);
                            }
                            if (omc.c("CAR.PROJECTION.SEARCH", 3)) {
                                rrd.d(3, "CAR.PROJECTION.SEARCH", null, "Focus cluster user-defined next focus points to current focus. root: %s, nextFocusId: %s, direction: %s", viewGroup2, Integer.valueOf(nextFocusRightId), qrv.n(i));
                            }
                        }
                    } else if (omc.c("CAR.PROJECTION.SEARCH", 3)) {
                        rrd.d(3, "CAR.PROJECTION.SEARCH", null, "Force field MULTIMOVE_MODAL triggered. root: %s, view: %s, direction: %s", viewGroup2, view, qrv.n(i));
                        return view;
                    }
                    return view;
                }
                if (omc.c("CAR.PROJECTION.SEARCH", 3)) {
                    rrd.d(3, "CAR.PROJECTION.SEARCH", null, "Focus cluster search found %s. Focus Cluster: %s", viewFindNextFocus, viewGroup2);
                }
            }
            ViewGroup viewGroupC = c(viewGroup2, viewGroup);
            if (omc.c("CAR.PROJECTION.SEARCH", 3)) {
                rrd.d(3, "CAR.PROJECTION.SEARCH", null, "Focus cluster search returned null. Recursively searching next root. Focus Cluster: %s, Next Root: %s", viewGroup2, viewGroupC);
            }
            return b(viewGroup, viewGroupC, view, i, z);
        }
        return viewFindNextFocus;
    }

    private final ViewGroup c(View view, ViewGroup viewGroup) {
        if (view != viewGroup) {
            ViewGroup viewGroup2 = view.getParent() instanceof ViewGroup ? (ViewGroup) view.getParent() : null;
            if (viewGroup2 != null) {
                return rsb.d(viewGroup2) ? viewGroup2 : c(viewGroup2, viewGroup);
            }
        }
        return viewGroup;
    }

    @Override // defpackage.ras
    public final View a(ViewGroup viewGroup, View view, int i, boolean z) {
        return b(viewGroup, c(view, viewGroup), view, i, z);
    }
}
