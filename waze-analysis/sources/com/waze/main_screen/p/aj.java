package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aj extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27025a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f27026b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bf f27027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(bf bfVar, h.c.e eVar) {
        super(3, eVar);
        this.f27027c = bfVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        aj ajVar = new aj(this.f27027c, (h.c.e) obj3);
        ajVar.f27025a = (com.waze.main_screen.p.a.b.b.ae) obj;
        ajVar.f27026b = (bm) obj2;
        return ajVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.main_screen.p.a.b.b.ae aeVar = (com.waze.main_screen.p.a.b.b.ae) this.f27025a;
        bm bmVar = (bm) this.f27026b;
        return Boolean.valueOf((aeVar.a() != null && !aeVar.a().a() && !((Boolean) this.f27027c.h().x().d()).booleanValue()) && ((bmVar.l() instanceof bj) && ((bj) bmVar.l()).a()));
    }
}
