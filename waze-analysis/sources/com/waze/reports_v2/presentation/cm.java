package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cm extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34961a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cz f34962b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cm(cz czVar, h.c.e eVar) {
        super(2, eVar);
        this.f34962b = czVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        cm cmVar = new cm(this.f34962b, eVar);
        cmVar.f34961a = obj;
        return cmVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cm) create((com.waze.bl.d.b) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        com.waze.ui.w.b.ba baVarN;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.bl.d.b bVar = (com.waze.bl.d.b) this.f34961a;
        kotlinx.coroutines.b.bn bnVar = this.f34962b.r;
        do {
            objD = bnVar.d();
            baVarN = (com.waze.ui.k.q) objD;
            com.waze.ui.w.b.ba baVar = baVarN instanceof com.waze.ui.w.b.ba ? (com.waze.ui.w.b.ba) baVarN : null;
            if (baVar != null) {
                baVarN = com.waze.ui.w.b.ba.n(baVar, new com.waze.ui.w.b.az(bVar.a()));
            }
        } while (!bnVar.f(objD, baVarN));
        return h.ab.f48028a;
    }
}
