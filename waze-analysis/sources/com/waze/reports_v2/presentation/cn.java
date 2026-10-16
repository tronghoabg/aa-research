package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cn extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34963a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f34964b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cz f34965c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cn(cz czVar, h.c.e eVar) {
        super(2, eVar);
        this.f34965c = czVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        cn cnVar = new cn(this.f34965c, eVar);
        cnVar.f34964b = obj;
        return cnVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cn) create((com.waze.bl.b.c.r) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34963a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.bl.b.c.r rVar = (com.waze.bl.b.c.r) this.f34964b;
            if (!h.g.b.x.n(rVar, com.waze.bl.c.c.e.f17027a)) {
                if (!(rVar instanceof com.waze.bl.c.c.f)) {
                    throw new h.i();
                }
                cz czVar = this.f34965c;
                this.f34963a = 1;
                if (czVar.f35005i.a(czVar.f35003g, ((com.waze.bl.c.c.f) rVar).d(), this) == aVar) {
                    return aVar;
                }
            }
        }
        return h.ab.f48028a;
    }
}
