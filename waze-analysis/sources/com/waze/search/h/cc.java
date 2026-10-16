package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cc implements ca {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.q.j f35887a;

    public cc(com.waze.shared_infra.q.j jVar) {
        h.g.b.x.f(jVar, "wazeDateFormat");
        this.f35887a = jVar;
    }

    @Override // com.waze.search.h.ca
    public final com.waze.search.e.z a(final com.waze.av.b.n nVar, com.waze.search.c.b bVar, com.waze.search.c.b bVar2, final au auVar, final av avVar) {
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.f(bVar, "onClick");
        h.g.b.x.f(bVar2, "onLongClick");
        h.g.b.x.f(auVar, "destinationCellSwiped");
        h.g.b.x.f(avVar, "destinationCellSwipeActionClicked");
        com.waze.search.e.j jVar = new com.waze.search.e.j();
        String strU = com.waze.ac.e.u(nVar);
        com.waze.z.a.ak akVarH = cd.h();
        com.waze.ui.ac.i iVarB = cd.b(nVar);
        com.waze.search.e.r rVarA = cd.a(nVar, jVar);
        com.waze.ui.ac.n nVarD = cd.d(nVar, this.f35887a);
        com.waze.search.e.i iVar = new com.waze.search.e.i(cd.c(nVar));
        com.waze.authentication.as asVar = new com.waze.authentication.as(bVar, nVar, 18, null);
        com.waze.authentication.as asVar2 = new com.waze.authentication.as(bVar2, nVar, 19, null);
        final int i2 = 1;
        h.g.a.p pVar = new h.g.a.p() { // from class: com.waze.search.h.cb
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                if (i2 != 0) {
                    com.waze.search.e.p pVar2 = (com.waze.search.e.p) obj;
                    com.waze.z.a.ae aeVar = (com.waze.z.a.ae) obj2;
                    h.g.b.x.f(pVar2, "destinationCell");
                    h.g.b.x.f(aeVar, "swipeAnchor");
                    com.waze.av.b.n nVar2 = nVar;
                    au auVar2 = (au) auVar;
                    aw.d(auVar2.f35793a, auVar2.f35794b, nVar2, pVar2, aeVar);
                    return h.ab.f48028a;
                }
                com.waze.search.e.p pVar3 = (com.waze.search.e.p) obj;
                com.waze.z.a.ad adVar = (com.waze.z.a.ad) obj2;
                h.g.b.x.f(pVar3, "destinationCell");
                h.g.b.x.f(adVar, "swipeAction");
                com.waze.av.b.n nVar3 = nVar;
                av avVar2 = (av) auVar;
                aw.e(avVar2.f35795a, avVar2.f35796b, nVar3, pVar3, adVar);
                return h.ab.f48028a;
            }
        };
        final int i3 = 0;
        return new com.waze.search.e.p(strU, iVarB, nVarD, akVarH, asVar, asVar2, pVar, new h.g.a.p() { // from class: com.waze.search.h.cb
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                if (i3 != 0) {
                    com.waze.search.e.p pVar2 = (com.waze.search.e.p) obj;
                    com.waze.z.a.ae aeVar = (com.waze.z.a.ae) obj2;
                    h.g.b.x.f(pVar2, "destinationCell");
                    h.g.b.x.f(aeVar, "swipeAnchor");
                    com.waze.av.b.n nVar2 = nVar;
                    au auVar2 = (au) avVar;
                    aw.d(auVar2.f35793a, auVar2.f35794b, nVar2, pVar2, aeVar);
                    return h.ab.f48028a;
                }
                com.waze.search.e.p pVar3 = (com.waze.search.e.p) obj;
                com.waze.z.a.ad adVar = (com.waze.z.a.ad) obj2;
                h.g.b.x.f(pVar3, "destinationCell");
                h.g.b.x.f(adVar, "swipeAction");
                com.waze.av.b.n nVar3 = nVar;
                av avVar2 = (av) avVar;
                aw.e(avVar2.f35795a, avVar2.f35796b, nVar3, pVar3, adVar);
                return h.ab.f48028a;
            }
        }, iVar, null, null, rVarA, jVar, 11520);
    }
}
