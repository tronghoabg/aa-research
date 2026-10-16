package com.waze.car_lib.r;

import com.waze.car_lib.f.gw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dt {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.ah f21437a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21438b;

    public dt(com.waze.av.b.ah ahVar, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(ahVar, "wazePlaceRepository");
        h.g.b.x.f(aVar, "stringProvider");
        this.f21437a = ahVar;
        this.f21438b = aVar;
    }

    public final dp a(gw gwVar, ds dsVar, com.waze.car_lib.screens.core.l lVar) {
        h.g.b.x.f(gwVar, "searchCoordinatorController");
        h.g.b.x.f(dsVar, "filterType");
        h.g.b.x.f(lVar, "screenThrottleCallback");
        return new dp(gwVar, this.f21437a, dsVar, lVar, this.f21438b);
    }
}
