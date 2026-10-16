package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class hp implements android.widget.AdapterView.OnItemClickListener, defpackage.hx, defpackage.ht {
    public android.graphics.Rect g;

    protected static defpackage.he v(android.widget.ListAdapter listAdapter) {
        return listAdapter instanceof android.widget.HeaderViewListAdapter ? (defpackage.he) ((android.widget.HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (defpackage.he) listAdapter;
    }

    protected static boolean w(defpackage.hh hhVar) {
        int size = hhVar.size();
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = hhVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static int x(android.widget.ListAdapter listAdapter, android.content.Context context, int i) {
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        android.widget.FrameLayout frameLayout = null;
        android.view.View view = null;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            int i5 = itemViewType != i4 ? itemViewType : i4;
            if (itemViewType != i4) {
                view = null;
            }
            if (frameLayout == null) {
                frameLayout = new android.widget.FrameLayout(context);
            }
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(0, 0);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
            i2++;
            i4 = i5;
        }
        return i3;
    }

    @Override // defpackage.ht
    public final boolean g(defpackage.hj hjVar) {
        return false;
    }

    @Override // defpackage.ht
    public final boolean h(defpackage.hj hjVar) {
        return false;
    }

    public abstract void j(defpackage.hh hhVar);

    public abstract void l(android.view.View view);

    public abstract void m(boolean z);

    public abstract void n(int i);

    public abstract void o(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        android.widget.ListAdapter listAdapter = (android.widget.ListAdapter) adapterView.getAdapter();
        v(listAdapter).a.z((android.view.MenuItem) listAdapter.getItem(i), this, true != t() ? 4 : 0);
    }

    public abstract void p(android.widget.PopupWindow.OnDismissListener onDismissListener);

    public abstract void q(boolean z);

    public abstract void r(int i);

    protected boolean t() {
        return true;
    }

    @Override // defpackage.ht
    public final void b(android.content.Context context, defpackage.hh hhVar) {
    }
}
