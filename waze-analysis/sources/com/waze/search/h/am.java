package com.waze.search.h;

import com.waze.search.v2.gb;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.l f35777a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.app_nav.w f35778b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.search.c.b f35779c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f35780d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.search.stats.s f35781e;

    /* renamed from: f, reason: collision with root package name */
    private final ac f35782f;

    public am(ac acVar, h.g.a.l lVar, com.waze.app_nav.w wVar, com.waze.search.c.b bVar, com.waze.shared_infra.i.e eVar, com.waze.search.stats.s sVar) {
        h.g.b.x.f(acVar, "destinationCellHandler");
        h.g.b.x.f(lVar, "onSearchListItemAction");
        h.g.b.x.f(wVar, "wazeMainScreenFlowController");
        h.g.b.x.f(bVar, "onGenericPlaceLongClicked");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(sVar, "searchStatsSender");
        this.f35782f = acVar;
        this.f35777a = lVar;
        this.f35778b = wVar;
        this.f35779c = bVar;
        this.f35780d = eVar;
        this.f35781e = sVar;
    }

    private static final com.waze.search.stats.f f(com.waze.av.b.n nVar) {
        if (!(nVar instanceof com.waze.av.b.k)) {
            if (nVar instanceof com.waze.av.b.j) {
                return com.waze.search.stats.f.f36030e;
            }
            if (nVar instanceof com.waze.av.b.l) {
                return com.waze.search.stats.f.f36029d;
            }
            if (nVar instanceof com.waze.av.b.m) {
                return com.waze.search.stats.f.f36030e;
            }
            throw new h.i();
        }
        com.waze.av.b.i iVarF = ((com.waze.av.b.k) nVar).f();
        com.waze.av.b.i iVar = com.waze.av.b.i.f15955a;
        int iOrdinal = iVarF.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return com.waze.search.stats.f.f36026a;
            }
            if (iOrdinal == 2) {
                return com.waze.search.stats.f.f36027b;
            }
            if (iOrdinal != 3) {
                throw new h.i();
            }
        }
        return com.waze.search.stats.f.f36028c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.waze.search.d.a.a.a aVar, int i2) {
        h.g.b.x.f(aVar, "categoryGroupItem");
        this.f35780d.a("Category Clicked " + aVar + ", index:" + i2);
        com.waze.search.d.a.b.i(this.f35781e, com.waze.search.stats.k.f36060c, gb.m(aVar.d()), true, Long.valueOf((long) i2), null, null, bjz.MOBILE_ANDROID, 48);
        if (!h.g.b.x.n("category_more", aVar.d())) {
            this.f35777a.invoke(new w(aVar));
            return;
        }
        com.waze.app_nav.w wVar = this.f35778b;
        com.waze.search.a.d dVar = com.waze.search.a.d.f35473a;
        wVar.a(new com.waze.app_nav.m(new com.waze.app_nav.p(com.waze.search.a.b.h.class, null, 6), new com.waze.app_nav.ah(false, null, null == true ? 1 : 0, 6)));
    }

    public final void b(com.waze.av.b.n nVar, com.waze.search.e.p pVar, com.waze.z.a.ad adVar, int i2) {
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.f(pVar, "destinationCell");
        h.g.b.x.f(adVar, "swipeAction");
        this.f35780d.a("onDestinationCellSwipeActionClicked at: " + i2 + ", " + nVar + "," + pVar.a() + "," + adVar);
        com.waze.search.d.a.b.i(this.f35781e, com.waze.search.stats.k.f36062e, null, null, null, Long.valueOf(i2), new com.waze.search.stats.e(nVar.e().c().c(), com.waze.search.f.x.q(nVar) ? com.waze.search.stats.q.f36094j : com.waze.search.stats.q.f36095k, f(nVar), nVar.e().d()), bjz.MOBILE_ANDROID, 14);
        this.f35779c.a(nVar, pVar);
    }

    public final void c(com.waze.av.b.n nVar, com.waze.search.e.p pVar, com.waze.z.a.ae aeVar, int i2) {
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.f(pVar, "destinationCell");
        h.g.b.x.f(aeVar, "swipeAnchor");
        this.f35780d.a("onDestinationCellSwiped at: " + i2 + ", " + nVar + "," + pVar.a() + "," + aeVar);
    }

    public final void d(com.waze.av.b.n nVar, int i2) {
        h.g.b.x.f(nVar, "genericPlace");
        this.f35780d.a("onGenericPlaceClicked at: " + i2 + ", " + nVar);
        com.waze.search.d.a.b.i(this.f35781e, com.waze.search.stats.k.f36062e, null, null, null, Long.valueOf(i2), new com.waze.search.stats.e(nVar.e().c().c(), com.waze.search.f.x.q(nVar) ? com.waze.search.stats.q.f36094j : com.waze.search.stats.q.f36095k, f(nVar), nVar.e().d()), bjz.MOBILE_ANDROID, 14);
        ab abVarA = this.f35782f.a(nVar);
        if (abVarA != null) {
            this.f35777a.invoke(abVarA);
        }
    }

    public final void e(com.waze.av.b.n nVar, com.waze.search.e.p pVar, int i2) {
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.f(pVar, "searchListItem");
        this.f35780d.a("onGenericPlaceLongClicked at: " + i2 + ", " + nVar);
        com.waze.search.d.a.b.i(this.f35781e, com.waze.search.stats.k.f36062e, null, null, null, Long.valueOf(i2), new com.waze.search.stats.e(nVar.e().c().c(), com.waze.search.f.x.q(nVar) ? com.waze.search.stats.q.f36094j : com.waze.search.stats.q.f36095k, f(nVar), nVar.e().d()), bjz.MOBILE_ANDROID, 14);
        this.f35779c.a(nVar, pVar);
    }
}
