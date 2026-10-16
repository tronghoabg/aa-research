package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wlw implements java.lang.Runnable {
    final /* synthetic */ defpackage.wlx a;
    private final androidx.coordinatorlayout.widget.CoordinatorLayout b;
    private final android.view.View c;

    public wlw(defpackage.wlx wlxVar, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        this.a = wlxVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.wlx wlxVar;
        android.widget.OverScroller overScroller;
        android.view.View view = this.c;
        if (view == null || (overScroller = (wlxVar = this.a).b) == null) {
            return;
        }
        boolean zComputeScrollOffset = overScroller.computeScrollOffset();
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = this.b;
        if (!zComputeScrollOffset) {
            wlxVar.D(coordinatorLayout, view);
        } else {
            wlxVar.B(coordinatorLayout, view, wlxVar.b.getCurrY(), Integer.MIN_VALUE, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
            view.postOnAnimation(this);
        }
    }
}
