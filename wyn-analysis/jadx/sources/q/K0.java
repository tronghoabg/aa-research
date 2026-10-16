package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class K0 extends C3838t0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f43666m;

    /* renamed from: n, reason: collision with root package name */
    public final int f43667n;

    /* renamed from: o, reason: collision with root package name */
    public G0 f43668o;

    /* renamed from: p, reason: collision with root package name */
    public p.m f43669p;

    public K0(Context context, boolean z2) {
        super(context, z2);
        if (1 == J0.a(context.getResources().getConfiguration())) {
            this.f43666m = 21;
            this.f43667n = 22;
        } else {
            this.f43666m = 22;
            this.f43667n = 21;
        }
    }

    @Override // q.C3838t0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        p.h hVar;
        int headersCount;
        int iPointToPosition;
        int i5;
        if (this.f43668o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                hVar = (p.h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (p.h) adapter;
                headersCount = 0;
            }
            p.m mVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i5 = iPointToPosition - headersCount) < 0 || i5 >= hVar.getCount()) ? null : hVar.getItem(i5);
            p.m mVar = this.f43669p;
            if (mVar != mVarB) {
                p.k kVar = hVar.f43032a;
                if (mVar != null) {
                    this.f43668o.m(kVar, mVar);
                }
                this.f43669p = mVarB;
                if (mVarB != null) {
                    this.f43668o.D(kVar, mVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i5, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i5 == this.f43666m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i5 != this.f43667n) {
            return super.onKeyDown(i5, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (p.h) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (p.h) adapter).f43032a.c(false);
        return true;
    }

    public void setHoverListener(G0 g02) {
        this.f43668o = g02;
    }

    @Override // q.C3838t0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
