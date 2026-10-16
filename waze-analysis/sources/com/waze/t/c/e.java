package com.waze.t.c;

import com.waze.an.a.ae;
import com.waze.an.a.u;
import com.waze.an.c.q;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40843a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.an.d.b f40844b;

    /* renamed from: c, reason: collision with root package name */
    private final c f40845c;

    public e(com.waze.shared_infra.i.e eVar, com.waze.an.d.b bVar, c cVar, com.waze.main_screen.k.a aVar) {
        x.f(eVar, "logger");
        x.f(bVar, "notificationInsightsService");
        x.f(cVar, "uiData");
        x.f(aVar, "insightConfig");
        this.f40843a = eVar;
        this.f40844b = bVar;
        this.f40845c = cVar;
    }

    @Override // com.waze.t.c.f
    public final void a(h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3) {
        x.f(aVar, "onShown");
        x.f(aVar2, "onPositive");
        x.f(aVar3, "onNegative");
        c cVar = this.f40845c;
        boolean zB = q.b(this.f40844b, new u(cVar.d(), ae.f14551g), new com.waze.an.a.k(cVar.e(), null, null, new com.waze.an.a.j(cVar.a(), new com.waze.car_lib.o.a(6), null), h.a.i.i(new com.waze.an.a.i(cVar.b().b(), aVar3, com.waze.an.a.c.f14570b, null, cVar.b().a()), new com.waze.an.a.i(cVar.c().b(), aVar2, new com.waze.an.a.c(true, false), null, cVar.c().a()))), aVar, null, 24);
        com.waze.shared_infra.i.e eVar = this.f40843a;
        if (zB) {
            eVar.a("Conversation feedback was scheduled to be shown in insight");
        } else {
            eVar.a("Conversation feedback is already there, cannot be added");
        }
    }
}
