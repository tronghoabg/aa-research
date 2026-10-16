package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bb extends h.c.b.a.g implements h.g.a.s {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18562a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f18563b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f18564c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f18565d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bc f18566e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bb(bc bcVar, h.c.e eVar) {
        super(5, eVar);
        this.f18566e = bcVar;
    }

    @Override // h.g.a.s
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        bb bbVar = new bb(this.f18566e, (h.c.e) obj5);
        bbVar.f18562a = (com.waze.ui.b.bd) obj;
        bbVar.f18563b = (com.waze.c.d.t) obj2;
        bbVar.f18564c = (com.waze.ui.aa.c) obj3;
        bbVar.f18565d = (com.waze.c.e.a.c) obj4;
        return bbVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        e bVar;
        a aVar;
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.ui.b.bd bdVar = (com.waze.ui.b.bd) this.f18562a;
        com.waze.c.d.t tVar = (com.waze.c.d.t) this.f18563b;
        com.waze.ui.aa.c cVar = (com.waze.ui.aa.c) this.f18564c;
        com.waze.c.e.a.c cVar2 = (com.waze.c.e.a.c) this.f18565d;
        kotlinx.coroutines.b.bn bnVar = this.f18566e.m;
        do {
            objD = bnVar.d();
            com.waze.c.d.s sVarB = tVar.b();
            if (h.g.b.x.n(sVarB, com.waze.c.d.q.f18383a)) {
                bVar = d.f18660a;
            } else {
                if (sVarB instanceof com.waze.c.d.p) {
                    bVar = new c(tVar.f().size() == 1);
                } else if (sVarB instanceof com.waze.c.d.o) {
                    com.waze.c.d.n nVarA = ((com.waze.c.d.o) tVar.b()).a();
                    com.waze.c.d.n nVar = com.waze.c.d.n.f18376a;
                    int iOrdinal = nVarA.ordinal();
                    if (iOrdinal == 0) {
                        aVar = a.f18407a;
                    } else if (iOrdinal == 1) {
                        aVar = a.f18408b;
                    } else if (iOrdinal == 2) {
                        aVar = a.f18409c;
                    } else {
                        if (iOrdinal != 3) {
                            throw new h.i();
                        }
                        aVar = a.f18410d;
                    }
                    bVar = new b(aVar);
                } else {
                    if (!h.g.b.x.n(sVarB, com.waze.c.d.r.f18384a)) {
                        throw new h.i();
                    }
                    bVar = e.f18661a;
                }
            }
            h.g.b.x.f(bVar, "routesState");
            h.g.b.x.f(bdVar, "routeCardsState");
            h.g.b.x.f(cVar2, "mapState");
        } while (!bnVar.f(objD, new g(bVar, bdVar, cVar2, cVar)));
        return h.ab.f48028a;
    }
}
