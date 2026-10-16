package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* compiled from: WazeSource */
/* renamed from: android.support.v7.widget.do, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Cdo extends cl {

    /* renamed from: b, reason: collision with root package name */
    final int f1363b;

    /* renamed from: c, reason: collision with root package name */
    final int f1364c;

    /* renamed from: d, reason: collision with root package name */
    private dn f1365d;

    /* renamed from: e, reason: collision with root package name */
    private MenuItem f1366e;

    public Cdo(Context context, boolean z) {
        super(context, z);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        this.f1363b = layoutDirection == 1 ? 21 : 22;
        this.f1364c = layoutDirection == 1 ? 22 : 21;
    }

    public final void d(dn dnVar) {
        this.f1365d = dnVar;
    }

    @Override // android.support.v7.widget.cl, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        android.support.v7.view.menu.n nVar;
        int headersCount;
        int iPointToPosition;
        int i2;
        if (this.f1365d != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                nVar = (android.support.v7.view.menu.n) headerViewListAdapter.getWrappedAdapter();
            } else {
                nVar = (android.support.v7.view.menu.n) adapter;
                headersCount = 0;
            }
            android.support.v7.view.menu.t item = null;
            if (motionEvent.getAction() != 10 && (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = iPointToPosition - headersCount) >= 0 && i2 < nVar.getCount()) {
                item = nVar.getItem(i2);
            }
            MenuItem menuItem = this.f1366e;
            if (menuItem != item) {
                android.support.v7.view.menu.q qVarA = nVar.a();
                if (menuItem != null) {
                    this.f1365d.b(qVarA, menuItem);
                }
                this.f1366e = item;
                if (item != null) {
                    this.f1365d.a(qVarA, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f1363b) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f1364c) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (android.support.v7.view.menu.n) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (android.support.v7.view.menu.n) adapter).a().m(false);
        return true;
    }
}
