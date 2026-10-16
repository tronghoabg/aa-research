package com.waze.settings.g.a;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.ui.platform.ComposeView;
import com.waze.R;
import com.waze.cb.k;
import com.waze.design_components.button.WazeIconButton;
import com.waze.trip_overview.views.RouteHeader;
import com.waze.trip_overview.views.trip_details_container.TripOverviewDetailsBottomSheet;
import com.waze.trip_overview.views.trip_details_container.q;
import com.waze.trip_overview.views.trip_details_container.t;
import com.waze.ui.a.aa;
import com.waze.ui.af;
import com.waze.ui.alerter.Alerter;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f37290a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37291b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f37291b = i2;
        this.f37290a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v39, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v54, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v58, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f37291b) {
            case 0:
                return c.d((c) this.f37290a);
            case 1:
                View viewFindViewById = ((RouteHeader) this.f37290a).findViewById(R.id.routeStartTime);
                x.e(viewFindViewById, "findViewById(...)");
                return (TextView) viewFindViewById;
            case 2:
                View viewFindViewById2 = ((RouteHeader) this.f37290a).findViewById(R.id.ttlContainer);
                x.e(viewFindViewById2, "findViewById(...)");
                return (ViewGroup) viewFindViewById2;
            case 3:
                View viewFindViewById3 = ((RouteHeader) this.f37290a).findViewById(R.id.back);
                x.e(viewFindViewById3, "findViewById(...)");
                return (WazeIconButton) viewFindViewById3;
            case 4:
                return com.waze.design_components.g.b.d((View) this.f37290a);
            case 5:
                return ((TripOverviewDetailsBottomSheet) this.f37290a).findViewById(R.id.tripOverviewDetails);
            case 6:
                return ((TripOverviewDetailsBottomSheet) this.f37290a).findViewById(R.id.dragIndicator);
            case 7:
                return (RecyclerView) ((TripOverviewDetailsBottomSheet) this.f37290a).findViewById(R.id.routeDetailsRecycler);
            case 8:
                return (ComposeView) ((q) this.f37290a).findViewById(R.id.tripOverview_vehicleTypeSelectorCompose);
            case 9:
                return q.l((q) this.f37290a);
            case 10:
                return q.n((q) this.f37290a);
            case 11:
                int i2 = t.f41597a;
                this.f37290a.invoke(com.waze.trip_overview.views.trip_details_container.c.f41557a);
                return ab.f48028a;
            case 12:
                ((k) this.f37290a).a();
                return ab.f48028a;
            case 13:
                ((k) this.f37290a).a();
                return ab.f48028a;
            case 14:
                int i3 = af.f41795a;
                this.f37290a.invoke();
                return true;
            case 15:
                return Boolean.valueOf(((ModalBottomSheetState) this.f37290a).isVisible());
            case 16:
                return a.a.k(this.f37290a);
            case 17:
                return a.a.k(this.f37290a);
            case 18:
                int i4 = aa.f41643a;
                this.f37290a.invoke(com.waze.ui.a.x.f41703a);
                return ab.f48028a;
            case 19:
                return (ViewGroup) ((Alerter) this.f37290a).findViewById(R.id.alerterFrame);
            default:
                return (ViewGroup) ((Alerter) this.f37290a).findViewById(R.id.alerterTopTimerLayout);
        }
    }
}
