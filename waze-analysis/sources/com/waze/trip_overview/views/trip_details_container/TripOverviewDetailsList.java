package com.waze.trip_overview.views.trip_details_container;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.bs;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.waze.R;
import com.waze.trip_overview.at;
import h.g.b.x;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class TripOverviewDetailsList extends q implements k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripOverviewDetailsList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x.f(context, "context");
        LayoutInflater.from(context).inflate(R.layout.trip_overview_details_list, this);
        g();
    }

    @Override // com.waze.trip_overview.views.trip_details_container.q
    public final kotlinx.coroutines.b.k b() {
        return ai.E(new r(this, null));
    }

    @Override // com.waze.trip_overview.views.trip_details_container.k
    public final void c() {
        for (com.waze.trip_overview.views.i iVar : k().b()) {
            iVar.d(k().f(iVar));
            iVar.e(k().f(iVar), 1.0f, false);
        }
    }

    @Override // com.waze.trip_overview.views.trip_details_container.q
    public final void e() {
    }

    @Override // com.waze.trip_overview.views.trip_details_container.q
    public final void g() {
        r(new p(this, this));
        q(new g());
        ((RecyclerView) findViewById(R.id.routeDetailsRecycler)).ak(new bs(k(), j()));
    }

    @Override // com.waze.trip_overview.views.trip_details_container.q
    public final void h(l lVar) {
        x.f(lVar, "data");
        at atVar = (at) h.a.i.R(lVar.b());
        j().a(t.a(atVar != null ? atVar.a() : 0, new com.waze.tide.a.c(this, 12)));
        k().e(lVar.b().size() > 1);
        k().c(lVar);
        post(new com.waze.beacons.p(this, 15));
    }

    public /* synthetic */ TripOverviewDetailsList(Context context, AttributeSet attributeSet, int i2, h.g.b.o oVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }
}
