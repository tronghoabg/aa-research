package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v extends ej {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.waze.car_lib.b.br brVar, com.waze.navigate.db dbVar, com.waze.car_lib.c.d dVar, com.waze.car_lib.j.x xVar, com.waze.search.bn bnVar, kotlinx.coroutines.af afVar, com.waze.navigate.b bVar, com.waze.car_lib.d.b bVar2, com.waze.config.b bVar3, com.waze.config.b bVar4, com.waze.car_lib.c.i iVar, com.waze.main_screen.af.a.i iVar2, com.waze.car_lib.b.ap apVar, com.waze.c.e.ce ceVar, com.waze.navigate.a.f fVar, com.waze.ct ctVar, com.waze.map.b.n nVar) {
        super(brVar, dbVar, dVar, xVar, bnVar, afVar, bVar, bVar2, bVar3, bVar4, iVar, iVar2, apVar, ceVar, fVar, nVar, ctVar);
        h.g.b.x.f(brVar, "reportAlertController");
        h.g.b.x.f(dbVar, "navigationController");
        h.g.b.x.f(dVar, "analytics");
        h.g.b.x.f(xVar, "tollInfoController");
        h.g.b.x.f(bnVar, "searchQueryBroadcaster");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(bVar, "beaconInfoStateInterface");
        h.g.b.x.f(bVar2, "bluetoothAccessHelper");
        h.g.b.x.f(bVar3, "userOptedOutBeaconsConfig");
        h.g.b.x.f(bVar4, "wazeAsksInCarEnabled");
        h.g.b.x.f(iVar, "inCarMainScreenStatsReporter");
        h.g.b.x.f(iVar2, "wazeAsksController");
        h.g.b.x.f(apVar, "alertPresenter");
        h.g.b.x.f(ceVar, "openAlternativeRoutesService");
        h.g.b.x.f(fVar, "inCarDeeplinkActionsController");
        h.g.b.x.f(ctVar, "locationPreviewIntentBroadcaster");
        h.g.b.x.f(nVar, "mainMapController");
    }

    @Override // com.waze.car_lib.f.ej
    public final void a() {
        H(ex.f19571a);
        H(em.f19558a);
    }

    @Override // com.waze.car_lib.f.ej
    public final void b() {
        H(ey.f19572a);
        H(new et(new u(this, 0)));
    }
}
