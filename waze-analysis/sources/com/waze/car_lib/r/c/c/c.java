package com.waze.car_lib.r.c.c;

import com.waze.bw.b.a.k;
import com.waze.car_lib.screens.bd;
import com.waze.main_screen.u.af;
import com.waze.main_screen.u.aj;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.r.c.a.c f21144a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bn.b f21145b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.r.c.b.a f21146c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f21147d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.location.b.d f21148e;

    /* renamed from: f, reason: collision with root package name */
    private final k f21149f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f21150g;

    /* renamed from: h, reason: collision with root package name */
    private final aj f21151h;

    /* renamed from: i, reason: collision with root package name */
    private final af f21152i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21153j;

    public c(com.waze.car_lib.r.c.a.c cVar, com.waze.bn.b bVar, com.waze.car_lib.r.c.b.a aVar, com.waze.car_lib.r.c.b.c cVar2, com.waze.shared_infra.q.e eVar, com.waze.location.b.d dVar, k kVar, com.waze.shared_infra.i.e eVar2, aj ajVar, af afVar, com.waze.shared_infra.o.a aVar2) {
        x.f(cVar, "predictionCardAutoConfigRepository");
        x.f(bVar, "roamingProvider");
        x.f(aVar, "getIsRtlLanguageUseCase");
        x.f(cVar2, "getLocaleUseCase");
        x.f(eVar, "wazeClock");
        x.f(dVar, "locationProvider");
        x.f(kVar, "routeDurationApi");
        x.f(eVar2, "loggerInterface");
        x.f(ajVar, "resumeDriveStateRepository");
        x.f(afVar, "predictionCardStatsSender");
        x.f(aVar2, "stringProvider");
        this.f21144a = cVar;
        this.f21145b = bVar;
        this.f21146c = aVar;
        this.f21147d = eVar;
        this.f21148e = dVar;
        this.f21149f = kVar;
        this.f21150g = eVar2;
        this.f21151h = ajVar;
        this.f21152i = afVar;
        this.f21153j = aVar2;
    }

    public final i a(bd bdVar) {
        x.f(bdVar, "launchParams");
        return new i(this.f21144a, this.f21145b, this.f21146c, this.f21147d, this.f21148e, this.f21149f, this.f21151h, this.f21150g, this.f21152i, this.f21153j, bdVar);
    }
}
