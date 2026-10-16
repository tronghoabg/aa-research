package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
final class wky implements Runnable {
    final /* synthetic */ wkz a;
    private final CoordinatorLayout b;
    private final View c;

    public wky(wkz wkzVar, CoordinatorLayout coordinatorLayout, View view) {
        this.a = wkzVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wkz wkzVar;
        OverScroller overScroller;
        View view = this.c;
        if (view == null || (overScroller = (wkzVar = this.a).b) == null) {
            return;
        }
        boolean zComputeScrollOffset = overScroller.computeScrollOffset();
        CoordinatorLayout coordinatorLayout = this.b;
        if (!zComputeScrollOffset) {
            wkzVar.O(coordinatorLayout, view);
        } else {
            wkzVar.M(coordinatorLayout, view, wkzVar.b.getCurrY(), Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
            view.postOnAnimation(this);
        }
    }
}
