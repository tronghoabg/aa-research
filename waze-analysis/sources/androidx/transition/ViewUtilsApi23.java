package androidx.transition;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class ViewUtilsApi23 extends ViewUtilsApi22 {
    private static boolean sTryHiddenSetTransitionVisibility = true;

    /* compiled from: WazeSource */
    class Api29Impl {
        private Api29Impl() {
        }

        static void setTransitionVisibility(View view, int i2) {
            view.setTransitionVisibility(i2);
        }
    }

    ViewUtilsApi23() {
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void setTransitionVisibility(View view, int i2) {
        if (sTryHiddenSetTransitionVisibility) {
            try {
                Api29Impl.setTransitionVisibility(view, i2);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSetTransitionVisibility = false;
            }
        }
    }
}
