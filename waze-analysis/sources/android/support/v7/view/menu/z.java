package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class z implements AdapterView.OnItemClickListener, ah, ad {

    /* renamed from: a, reason: collision with root package name */
    private Rect f863a;

    z() {
    }

    protected static n w(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (n) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (n) listAdapter;
    }

    protected static boolean y(q qVar) {
        int size = qVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = qVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static int z(ListAdapter listAdapter, Context context, int i2) {
        int i3 = 0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i4 = 0;
        int i5 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        while (i3 < count) {
            int itemViewType = listAdapter.getItemViewType(i3);
            int i6 = itemViewType != i5 ? itemViewType : i5;
            if (itemViewType != i5) {
                view = null;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i3, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
            i3++;
            i5 = i6;
        }
        return i4;
    }

    public abstract void b(q qVar);

    @Override // android.support.v7.view.menu.ad
    public final boolean h(t tVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.ad
    public final boolean i(t tVar) {
        return false;
    }

    public abstract void l(View view);

    public abstract void m(boolean z);

    public abstract void n(int i2);

    public abstract void o(int i2);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        w(listAdapter).f819a.G((MenuItem) listAdapter.getItem(i2), this, true != t() ? 4 : 0);
    }

    public abstract void p(PopupWindow.OnDismissListener onDismissListener);

    public abstract void q(boolean z);

    public abstract void r(int i2);

    protected boolean t() {
        return true;
    }

    public final Rect v() {
        return this.f863a;
    }

    public final void x(Rect rect) {
        this.f863a = rect;
    }

    @Override // android.support.v7.view.menu.ad
    public final void c(Context context, q qVar) {
    }
}
