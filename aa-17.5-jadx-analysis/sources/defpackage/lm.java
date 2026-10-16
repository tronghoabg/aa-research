package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import java.util.List;

/* loaded from: classes2.dex */
public final class lm extends ks {
    final int c;
    final int d;
    public ll e;
    private MenuItem f;

    public lm(Context context, boolean z) {
        super(context, z);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        this.c = layoutDirection == 1 ? 21 : 22;
        this.d = layoutDirection == 1 ? 22 : 21;
    }

    @Override // defpackage.ks, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        hd hdVar;
        int headersCount;
        ll llVar;
        ll llVar2;
        int iPointToPosition;
        int i;
        if (this.e != null) {
            ListAdapter adapter = getAdapter();
            int i2 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                hdVar = (hd) headerViewListAdapter.getWrappedAdapter();
            } else {
                hdVar = (hd) adapter;
                headersCount = 0;
            }
            hi item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= hdVar.getCount()) ? null : hdVar.getItem(i);
            MenuItem menuItem = this.f;
            if (menuItem != item) {
                hg hgVar = hdVar.a;
                if (menuItem != null && (llVar2 = ((ln) this.e).b) != null) {
                    ((gz) llVar2).a.a.removeCallbacksAndMessages(hgVar);
                }
                this.f = item;
                if (item != null && (llVar = ((ln) this.e).b) != null) {
                    gz gzVar = (gz) llVar;
                    ha haVar = gzVar.a;
                    Handler handler = haVar.a;
                    handler.removeCallbacksAndMessages(null);
                    List list = haVar.b;
                    int size = list.size();
                    while (true) {
                        if (i2 >= size) {
                            i2 = -1;
                            break;
                        }
                        if (hgVar == ((aagd) list.get(i2)).b) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        int i3 = i2 + 1;
                        handler.postAtTime(new xx(gzVar, i3 < list.size() ? (aagd) list.get(i3) : null, (MenuItem) item, hgVar, 1), hgVar, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.d) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (hd) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (hd) adapter).a.i(false);
        return true;
    }
}
