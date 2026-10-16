package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class qui implements defpackage.rbn {
    private final android.view.View b(android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2, android.view.View view, int i, boolean z) {
        int nextFocusDownId;
        android.view.View viewFindNextFocus = android.view.FocusFinder.getInstance().findNextFocus(viewGroup2, view, i);
        if (viewGroup2 != viewGroup) {
            if (rsv.d(viewGroup2)) {
                if (viewFindNextFocus == null) {
                    int iA = rsv.a(viewGroup2);
                    if (iA == 1) {
                        if (defpackage.omv.c("CAR.PROJECTION.SEARCH", 3)) {
                            defpackage.rrx.d(3, "CAR.PROJECTION.SEARCH", null, "Force field MODAL triggered. root: %s, view: %s, direction: %s", viewGroup2, view, sqg.n(i));
                            return view;
                        }
                    } else if (iA != 2 || !z) {
                        if (i == 66) {
                            nextFocusDownId = viewGroup2.getNextFocusRightId();
                        } else if (i == 17) {
                            nextFocusDownId = viewGroup2.getNextFocusLeftId();
                        } else if (i == 33) {
                            nextFocusDownId = viewGroup2.getNextFocusUpId();
                        } else {
                            nextFocusDownId = i == 130 ? viewGroup2.getNextFocusDownId() : -1;
                        }
                        if (nextFocusDownId != -1) {
                            if (nextFocusDownId != view.getId()) {
                                return viewGroup.findViewById(nextFocusDownId);
                            }
                            if (defpackage.omv.c("CAR.PROJECTION.SEARCH", 3)) {
                                defpackage.rrx.d(3, "CAR.PROJECTION.SEARCH", null, "Focus cluster user-defined next focus points to current focus. root: %s, nextFocusId: %s, direction: %s", viewGroup2, java.lang.Integer.valueOf(nextFocusDownId), sqg.n(i));
                            }
                        }
                    } else if (defpackage.omv.c("CAR.PROJECTION.SEARCH", 3)) {
                        defpackage.rrx.d(3, "CAR.PROJECTION.SEARCH", null, "Force field MULTIMOVE_MODAL triggered. root: %s, view: %s, direction: %s", viewGroup2, view, sqg.n(i));
                        return view;
                    }
                    return view;
                }
                if (defpackage.omv.c("CAR.PROJECTION.SEARCH", 3)) {
                    defpackage.rrx.d(3, "CAR.PROJECTION.SEARCH", null, "Focus cluster search found %s. Focus Cluster: %s", viewFindNextFocus, viewGroup2);
                }
            }
            android.view.ViewGroup viewGroupC = c(viewGroup2, viewGroup);
            if (defpackage.omv.c("CAR.PROJECTION.SEARCH", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.SEARCH", null, "Focus cluster search returned null. Recursively searching next root. Focus Cluster: %s, Next Root: %s", viewGroup2, viewGroupC);
            }
            return b(viewGroup, viewGroupC, view, i, z);
        }
        return viewFindNextFocus;
    }

    private final android.view.ViewGroup c(android.view.View view, android.view.ViewGroup viewGroup) {
        if (view != viewGroup) {
            android.view.ViewGroup viewGroup2 = view.getParent() instanceof android.view.ViewGroup ? (android.view.ViewGroup) view.getParent() : null;
            if (viewGroup2 != null) {
                return rsv.d(viewGroup2) ? viewGroup2 : c(viewGroup2, viewGroup);
            }
        }
        return viewGroup;
    }

    @Override // defpackage.rbn
    public final android.view.View a(android.view.ViewGroup viewGroup, android.view.View view, int i, boolean z) {
        return b(viewGroup, c(view, viewGroup), view, i, z);
    }
}
