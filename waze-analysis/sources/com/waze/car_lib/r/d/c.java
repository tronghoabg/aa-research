package com.waze.car_lib.r.d;

import com.waze.R;
import com.waze.trip_overview.dq;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21269a;

    /* renamed from: b, reason: collision with root package name */
    private final dq f21270b;

    public c(com.waze.shared_infra.o.a aVar, dq dqVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(dqVar, "tripOverviewStatsSender");
        this.f21269a = aVar;
        this.f21270b = dqVar;
    }

    public final b a(boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            com.waze.shared_infra.o.a aVar = this.f21269a;
            arrayList.add(new a(aVar.c(R.string.AAOS_TRIP_OVERVIEW_INFO_SCREEN_TOLL_TITLE, new Object[0]), aVar.c(R.string.AAOS_TRIP_OVERVIEW_INFO_SCREEN_TOLL_MESSAGE, new Object[0])));
        }
        if (z2) {
            com.waze.shared_infra.o.a aVar2 = this.f21269a;
            arrayList.add(new a(aVar2.c(R.string.AAOS_TRIP_OVERVIEW_INFO_SCREEN_CARBON_EMISSION_TITLE, new Object[0]), aVar2.c(R.string.AAOS_TRIP_OVERVIEW_INFO_SCREEN_CARBON_EMISSION_MESSAGE, new Object[0])));
        }
        return new b(arrayList);
    }

    public final void b() {
        this.f21270b.c();
    }
}
