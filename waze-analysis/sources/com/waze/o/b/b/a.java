package com.waze.o.b.b;

import com.waze.navigate.db;
import com.waze.o.c.c.a.p;
import com.waze.sound.bs;
import com.waze.t.b.aj;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a implements com.waze.o.c.c.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32672a;

    /* renamed from: b, reason: collision with root package name */
    private final bs f32673b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.i f32674c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.o.c.c.a.e f32675d;

    /* renamed from: e, reason: collision with root package name */
    private final db f32676e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.o.c.c.a.d f32677f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.o.c.c.a.i f32678g;

    /* renamed from: h, reason: collision with root package name */
    private final p f32679h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.bl.c.a f32680i;

    public a(com.waze.shared_infra.i.e eVar, bs bsVar, com.waze.shared_infra.i.i iVar, com.waze.o.c.c.a.e eVar2, db dbVar, com.waze.o.c.c.a.d dVar, com.waze.o.c.c.a.i iVar2, p pVar, com.waze.bl.c.a aVar) {
        x.f(eVar, "logger");
        x.f(bsVar, "guidanceModeRepository");
        x.f(iVar, "logsReporter");
        x.f(eVar2, "calculateRouteByVenueIdUseCase");
        x.f(dbVar, "navigationController");
        x.f(dVar, "addFavoriteUseCase");
        x.f(iVar2, "deleteFavoriteByVenueIdUseCase");
        x.f(pVar, "startNavigationUseCase");
        x.f(aVar, "reportAgentActionHandlerFactory");
        this.f32672a = eVar;
        this.f32673b = bsVar;
        this.f32674c = iVar;
        this.f32675d = eVar2;
        this.f32676e = dbVar;
        this.f32677f = dVar;
        this.f32678g = iVar2;
        this.f32679h = pVar;
        this.f32680i = aVar;
    }

    @Override // com.waze.t.b.ai
    public final /* bridge */ /* synthetic */ aj a() {
        return new c(this.f32672a, this.f32673b, this.f32674c, this.f32675d, this.f32676e, this.f32677f, this.f32678g, this.f32679h, this.f32680i.a());
    }
}
