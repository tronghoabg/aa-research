package com.waze.uid.state_impl.g;

import androidx.core.app.NotificationCompat;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends com.waze.uid.e.f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.b.u f44690a;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.app_nav.hub.service.a f44691f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.app_nav.hub.c.b f44692g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar, com.waze.b.u uVar, com.waze.app_nav.hub.service.k kVar) {
        super("PrivacyConsent", bVar, hVar, mVar);
        h.g.b.x.f(uVar, "ageRestrictionRepository");
        h.g.b.x.f(kVar, "wazeServiceRegistry");
        this.f44690a = uVar;
        com.waze.uid.d.p pVar = com.waze.uid.d.q.f44463a;
        com.waze.app_nav.hub.service.a aVar = new com.waze.app_nav.hub.service.a("GdprConsent", "Get privacy consent from the user", new com.waze.r.b(pVar.a().f44468f.g(), new i(this, 2), new i(this, 3), new com.waze.ui.r.a.e.c(14), pVar.a().f44468f.f(), pVar.a().f44468f.a(), true, pVar.a().f44468f.e(), pVar.a().f44468f.b(), pVar.a().f44468f.d(), pVar.a().f44468f.c(), ((com.waze.b.s) uVar.a().d()).d() ? com.waze.design_components.button.g.f23359b : com.waze.design_components.button.g.f23358a), com.waze.r.h.class);
        this.f44691f = aVar;
        this.f44692g = new com.waze.app_nav.hub.service.i(aVar, pVar.a().f44467e.c().a(), kVar, pVar.a().f44467e.c().c());
    }

    static final ab a(p pVar) {
        com.waze.uid.d.q.f44463a.a().f44468f.h();
        pVar.c(n.f44688a);
        return ab.f48028a;
    }

    static final ab b(p pVar) {
        pVar.c(o.f44689a);
        return ab.f48028a;
    }

    private final void c(com.waze.tide.s sVar) {
        this.f44692g.b();
        com.waze.uid.b.m mVar = this.f44485c;
        if (mVar != null) {
            mVar.o(sVar);
        }
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        h.g.b.x.f(eVar, "dir");
        super.f(eVar);
        this.f44692g.c();
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        h.g.b.x.f(eVar, "dir");
        if (eVar != com.waze.uid.e.e.f44481a) {
            return false;
        }
        com.waze.bf.a aVar = com.waze.uid.d.q.f44463a.a().f44468f;
        h.g.b.x.f(aVar, "<this>");
        return aVar.j() && !aVar.i();
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(sVar, n.f44688a)) {
            k();
        } else if (h.g.b.x.n(sVar, o.f44689a)) {
            j();
        } else {
            super.o(sVar);
        }
    }
}
