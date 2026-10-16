package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ec extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19519a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ed f19520b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f19521c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ec(ed edVar, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f19520b = edVar;
        this.f19521c = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ec(this.f19520b, this.f19521c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ec) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f19519a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ed edVar = this.f19520b;
            ed edVar2 = edVar;
            org.a.d.k.b bVarC = edVar.c();
            int i2 = h.g.b.ar.f48106a;
            com.waze.car_lib.o oVar = (com.waze.car_lib.o) bVarC.a(new h.g.b.m(com.waze.car_lib.o.class), null, null);
            com.waze.car_lib.bm bmVar = (com.waze.car_lib.bm) oVar.b().a(new h.g.b.m(com.waze.car_lib.f.a.c.class), null, null);
            bmVar.d(oVar.a());
            bmVar.e(oVar.b());
            bmVar.E(new com.waze.car_lib.br());
            ((com.waze.car_lib.f.a.c) bmVar).f().H(new com.waze.car_lib.f.a.i(this.f19521c));
            this.f19519a = 1;
            if (edVar2.x(bmVar, new com.waze.perf.p(11), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
