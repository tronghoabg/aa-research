package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ea extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f36406a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f36407b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fi f36408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ea(fi fiVar, h.c.e eVar) {
        super(2, eVar);
        this.f36408c = fiVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ea eaVar = new ea(this.f36408c, eVar);
        eaVar.f36407b = obj;
        return eaVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ea) create((com.waze.search.bc) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f36406a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.search.bc bcVar = (com.waze.search.bc) this.f36407b;
            if (!bcVar.e().c().isEmpty()) {
                com.waze.av.d.k kVar = (com.waze.av.d.k) h.a.i.P(bcVar.e().c());
                this.f36406a = 1;
                if (fi.p(this.f36408c, kVar, this) == aVar) {
                    return aVar;
                }
            }
        }
        return h.ab.f48028a;
    }
}
