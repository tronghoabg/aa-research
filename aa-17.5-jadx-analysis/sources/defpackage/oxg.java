package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.auto.sdk.ui.CarLayoutManager;
import com.google.android.apps.auto.sdk.ui.PagedListView;

/* loaded from: classes2.dex */
public final class oxg extends ca {
    final /* synthetic */ PagedListView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxg(PagedListView pagedListView) {
        super(null);
        this.c = pagedListView;
    }

    @Override // defpackage.ca
    public final void p(RecyclerView recyclerView, int i) {
        PagedListView pagedListView = this.c;
        osq osqVar = pagedListView.u;
        if (osqVar != null) {
            osqVar.a(recyclerView, i);
        }
        if (i == 0) {
            pagedListView.h.postDelayed(pagedListView.t, 400L);
        }
    }

    @Override // defpackage.ca
    public final void q(RecyclerView recyclerView, int i, int i2) {
        PagedListView pagedListView = this.c;
        osq osqVar = pagedListView.u;
        if (osqVar != null) {
            osqVar.b(recyclerView, i, i2);
            CarLayoutManager carLayoutManager = pagedListView.g;
            if (!carLayoutManager.Y() && carLayoutManager.X()) {
                pagedListView.u.d();
            } else if (carLayoutManager.Y() || !carLayoutManager.X()) {
                pagedListView.u.c();
            }
        }
        pagedListView.d(false);
    }
}
