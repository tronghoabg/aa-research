package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dsp implements android.view.ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout a;

    public dsp(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(android.view.View view, android.view.View view2) {
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a.g;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(android.view.View view, android.view.View view2) {
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = this.a;
        coordinatorLayout.i(2);
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.g;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
