package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.GridView;
import com.google.android.apps.auto.sdk.ui.AutoTunedRecyclerView;
import com.google.android.apps.auto.sdk.ui.CarLayoutManager;

/* loaded from: classes2.dex */
public final class kdn extends ca {
    int c;
    final /* synthetic */ GridView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdn(GridView gridView) {
        super(null);
        this.d = gridView;
        this.c = 0;
    }

    @Override // defpackage.ca
    public final void p(RecyclerView recyclerView, int i) {
        ghe gheVarD;
        if (i == 2) {
            GridView gridView = this.d;
            int i2 = this.c;
            geu geuVar = gridView.e;
            if (geuVar == null || (gheVarD = jtq.d(geuVar)) == null) {
                return;
            }
            if (i2 < 0) {
                gheVarD.g(gsn.e);
                return;
            } else {
                if (i2 > 0) {
                    gheVarD.g(gsn.f);
                    return;
                }
                return;
            }
        }
        if (i == 0) {
            GridView gridView2 = this.d;
            if (gridView2.k != null) {
                AutoTunedRecyclerView autoTunedRecyclerView = gridView2.d;
                autoTunedRecyclerView.getClass();
                CarLayoutManager carLayoutManagerG = autoTunedRecyclerView.g();
                carLayoutManagerG.getClass();
                int iM = carLayoutManagerG.m();
                int iX = carLayoutManagerG.x();
                uw uwVar = gridView2.k;
                uwVar.getClass();
                geu geuVar2 = gridView2.e;
                geuVar2.getClass();
                geuVar2.t().l(uwVar, iM, iX);
            }
        }
    }

    @Override // defpackage.ca
    public final void q(RecyclerView recyclerView, int i, int i2) {
        this.c = i2;
    }
}
