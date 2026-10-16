package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class rai implements ras {
    public static ViewGroup b(ViewGroup viewGroup, View view) {
        if (view == null || view == viewGroup) {
            return viewGroup;
        }
        ViewGroup viewGroup2 = view.getParent() instanceof ViewGroup ? (ViewGroup) view.getParent() : null;
        return viewGroup2 == null ? viewGroup : c(viewGroup2) ? viewGroup2 : b(viewGroup, viewGroup2);
    }

    public static boolean c(ViewGroup viewGroup) {
        return rsb.d(viewGroup) && rsb.a(viewGroup) == 1;
    }

    @Override // defpackage.ras
    public final View a(ViewGroup viewGroup, View view, int i, boolean z) {
        throw null;
    }
}
