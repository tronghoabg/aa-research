package com.waze.uid.state_impl.g;

import androidx.core.app.NotificationCompat;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends com.waze.uid.e.f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.app_nav.hub.service.a f44686a;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.app_nav.hub.c.b f44687f;

    public m(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("ND4CConsent", bVar, hVar, mVar);
        com.waze.uid.d.p pVar = com.waze.uid.d.q.f44463a;
        com.waze.app_nav.hub.service.a aVar = new com.waze.app_nav.hub.service.a("ND4CConsent", "Get ND4C consent from the user", new com.waze.r.b(pVar.a().f44470h.g(), new i(this, 1), new i(this, 0), new com.waze.uid.state_impl.email.n(this, 6), pVar.a().f44470h.f(), pVar.a().f44470h.a(), false, pVar.a().f44470h.e(), pVar.a().f44470h.b(), pVar.a().f44470h.d(), pVar.a().f44470h.c(), com.waze.design_components.button.g.f23359b), com.waze.r.h.class);
        this.f44686a = aVar;
        this.f44687f = new com.waze.app_nav.hub.service.i(aVar, pVar.a().f44467e.c().a(), com.waze.app_nav.hub.service.k.f15395a.a(), pVar.a().f44467e.c().c());
    }

    static final ab a(m mVar) {
        com.waze.uid.d.q.f44463a.a().f44470h.h();
        mVar.c(j.f44683a);
        return ab.f48028a;
    }

    static final ab b(m mVar) {
        mVar.c(k.f44684a);
        return ab.f48028a;
    }

    private final void c(com.waze.tide.s sVar) {
        this.f44687f.b();
        com.waze.uid.b.m mVar = this.f44485c;
        if (mVar != null) {
            mVar.o(sVar);
        }
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        h.g.b.x.f(eVar, "dir");
        super.f(eVar);
        this.f44687f.c();
        com.waze.uid.d.q.f44463a.a().c().u();
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        h.g.b.x.f(eVar, "dir");
        return eVar == com.waze.uid.e.e.f44481a && com.waze.uid.d.q.f44463a.a().f44470h.j();
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(sVar, j.f44683a)) {
            k();
            com.waze.uid.d.q.f44463a.a().c().t(com.waze.uid.stats.l.f44761a);
        } else if (h.g.b.x.n(sVar, k.f44684a)) {
            j();
            com.waze.uid.d.q.f44463a.a().c().t(com.waze.uid.stats.l.f44762b);
        } else if (h.g.b.x.n(sVar, l.f44685a)) {
            com.waze.uid.d.q.f44463a.a().c().t(com.waze.uid.stats.l.f44763c);
        } else {
            super.o(sVar);
        }
    }
}
