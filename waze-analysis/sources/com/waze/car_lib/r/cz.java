package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class cz extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f21251a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f21252b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ de f21253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cz(de deVar, h.c.e eVar) {
        super(2, eVar);
        this.f21253c = deVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        cz czVar = new cz(this.f21253c, eVar);
        czVar.f21252b = obj;
        return czVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cz) create((com.waze.bl.b.c.r) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f21251a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.bl.b.c.r rVar = (com.waze.bl.b.c.r) this.f21252b;
            if (!h.g.b.x.n(rVar, com.waze.bl.c.c.e.f17027a)) {
                if (!(rVar instanceof com.waze.bl.c.c.f)) {
                    throw new h.i();
                }
                de deVar = this.f21253c;
                this.f21251a = 1;
                if (deVar.f21370f.a(deVar.f21369e, ((com.waze.bl.c.c.f) rVar).d(), this) == aVar) {
                    return aVar;
                }
            }
        }
        return h.ab.f48028a;
    }
}
