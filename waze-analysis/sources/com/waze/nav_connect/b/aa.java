package com.waze.nav_connect.b;

import com.waze.bs;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aa implements x {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.nav_connect.a.f f30758a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.nav_connect.a f30759b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.app_nav.hub.b.c f30760c;

    /* renamed from: d, reason: collision with root package name */
    private final bs f30761d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.uid.d.s f30762e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.nav_connect.c.b f30763f;

    public aa(com.waze.nav_connect.a.f fVar, com.waze.nav_connect.a aVar, com.waze.app_nav.hub.b.c cVar, bs bsVar, com.waze.uid.d.s sVar, com.waze.nav_connect.c.b bVar) {
        h.g.b.x.f(fVar, "navConnectRepository");
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(cVar, "popupManager");
        h.g.b.x.f(bsVar, "externalWebBrowserLauncher");
        h.g.b.x.f(sVar, "webViewFactory");
        h.g.b.x.f(bVar, "statsSender");
        this.f30758a = fVar;
        this.f30759b = aVar;
        this.f30760c = cVar;
        this.f30761d = bsVar;
        this.f30762e = sVar;
        this.f30763f = bVar;
    }

    @Override // com.waze.nav_connect.b.x
    public final af a() {
        com.waze.nav_connect.a aVar = this.f30759b;
        af afVar = null;
        if ((true != com.waze.nav_connect.a.e() ? null : aVar) != null) {
            com.waze.nav_connect.a.f fVar = this.f30758a;
            com.waze.app_nav.hub.b.c cVar = this.f30760c;
            bs bsVar = this.f30761d;
            com.waze.uid.d.s sVar = this.f30762e;
            com.waze.nav_connect.c.b bVar = this.f30763f;
            com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("NavConnectConsentStateHolder");
            h.g.b.x.e(eVarD, "create(...)");
            afVar = new af(fVar, aVar, cVar, bsVar, sVar, bVar, eVarD);
        }
        return afVar;
    }
}
