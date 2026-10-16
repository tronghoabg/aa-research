package com.waze.car_lib.r;

import com.waze.car_lib.f.gw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ez {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21611a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.n.al f21612b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.n.w f21613c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.config.b f21614d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.car_lib.q.h f21615e;

    public ez(com.waze.shared_infra.o.a aVar, com.waze.car_lib.n.al alVar, com.waze.car_lib.n.w wVar, com.waze.config.b bVar, com.waze.car_lib.q.h hVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(alVar, "searchController");
        h.g.b.x.f(wVar, "searchQueryFactory");
        h.g.b.x.f(bVar, "nd4cAlgoTransparencyFeatureEnabledConfig");
        h.g.b.x.f(hVar, "wazeResourceLoader");
        this.f21611a = aVar;
        this.f21612b = alVar;
        this.f21613c = wVar;
        this.f21614d = bVar;
        this.f21615e = hVar;
    }

    public final ey a(gw gwVar) {
        h.g.b.x.f(gwVar, "coordinatorController");
        return new ey(this.f21611a, this.f21612b, this.f21613c, this.f21614d, gwVar, this.f21615e);
    }
}
