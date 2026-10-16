package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bq extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19045a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.c.e f19046b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ br f19047c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.b.q f19048d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.b.at f19049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bq(com.waze.reports_v2.c.e eVar, br brVar, com.waze.reports_v2.b.q qVar, com.waze.reports_v2.b.at atVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f19046b = eVar;
        this.f19047c = brVar;
        this.f19048d = qVar;
        this.f19049e = atVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bq(this.f19046b, this.f19047c, this.f19048d, this.f19049e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bq) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f19045a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f19045a = 1;
            obj = this.f19046b.b().c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        com.waze.reports_v2.c.d dVar = (com.waze.reports_v2.c.d) obj;
        if (dVar instanceof com.waze.reports_v2.c.b) {
            this.f19047c.f();
        } else {
            if (!(dVar instanceof com.waze.reports_v2.c.c)) {
                throw new h.i();
            }
            this.f19047c.g(this.f19048d, this.f19049e);
        }
        return h.ab.f48028a;
    }
}
