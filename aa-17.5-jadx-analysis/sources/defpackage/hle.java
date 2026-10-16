package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.GridItemView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.GridRowContainerView;
import com.google.android.apps.auto.components.system.dashboard.design.DashboardCardView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class hle implements ViewTreeObserver.OnGlobalFocusChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hle(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        GridRowContainerView gridRowContainerView;
        int iA;
        int i = this.b;
        if (i == 0) {
            if (view2 != null) {
                ((hlf) this.a).l = view2;
                return;
            }
            return;
        }
        if (i == 1) {
            if (view2 == null || (view2 instanceof hli)) {
                return;
            }
            ((gne) this.a).a = view2;
            return;
        }
        if (i == 2) {
            geu geuVar = ((hli) this.a).c;
            if (geuVar != null) {
                ((gio) geuVar.F(gio.class)).a();
                return;
            }
            return;
        }
        if (i != 3) {
            if (i == 4) {
                if (!(view2 instanceof GridItemView) || (iA = (gridRowContainerView = (GridRowContainerView) this.a).a()) == -1) {
                    return;
                }
                gridRowContainerView.b = iA;
                return;
            }
            DashboardCardView dashboardCardView = (DashboardCardView) this.a;
            View view3 = dashboardCardView.c;
            view3.getClass();
            view3.setVisibility(8);
            View viewFindViewById = dashboardCardView.b.findViewById(R.id.suggestion_divider);
            if (viewFindViewById != null) {
                view3.getClass();
                viewFindViewById.setVisibility(view3.getVisibility() != 0 ? 0 : 8);
                return;
            }
            return;
        }
        if (view2 != null) {
            kcj kcjVar = (kcj) this.a;
            if (kcjVar.w) {
                kcjVar.v();
            }
        }
        if ((view instanceof kdf) && (view2 instanceof kdf)) {
            kcj kcjVar2 = (kcj) this.a;
            ActionStripView actionStripView = kcjVar2.t;
            if (actionStripView != null) {
                actionStripView.f();
            }
            ActionStripView actionStripView2 = kcjVar2.u;
            if (actionStripView2 != null) {
                actionStripView2.f();
            }
        }
    }

    public /* synthetic */ hle(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
