package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.auto.components.support.UnlimitedBrowsePagedListView;
import com.google.android.apps.auto.sdk.ui.CarLayoutManager;

/* loaded from: classes2.dex */
public final class mol extends ca {
    final /* synthetic */ UnlimitedBrowsePagedListView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mol(UnlimitedBrowsePagedListView unlimitedBrowsePagedListView) {
        super(null);
        this.c = unlimitedBrowsePagedListView;
    }

    @Override // defpackage.ca
    public final void p(RecyclerView recyclerView, int i) {
        UnlimitedBrowsePagedListView unlimitedBrowsePagedListView = this.c;
        osq osqVar = unlimitedBrowsePagedListView.u;
        if (osqVar != null) {
            osqVar.a(recyclerView, i);
        }
        if (i == 0) {
            unlimitedBrowsePagedListView.h.postDelayed(unlimitedBrowsePagedListView.t, 400L);
        }
    }

    @Override // defpackage.ca
    public final void q(RecyclerView recyclerView, int i, int i2) {
        UnlimitedBrowsePagedListView unlimitedBrowsePagedListView = this.c;
        osq osqVar = unlimitedBrowsePagedListView.u;
        if (osqVar != null) {
            osqVar.b(recyclerView, i, i2);
            CarLayoutManager carLayoutManager = unlimitedBrowsePagedListView.g;
            if (!carLayoutManager.Y() && carLayoutManager.X()) {
                unlimitedBrowsePagedListView.u.d();
            } else if (carLayoutManager.Y() || !carLayoutManager.X()) {
                unlimitedBrowsePagedListView.u.c();
            }
        }
        unlimitedBrowsePagedListView.d(false);
    }
}
