package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class cc extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19445a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f19446b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cd f19447c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cc(cd cdVar, h.c.e eVar) {
        super(2, eVar);
        this.f19447c = cdVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        cc ccVar = new cc(this.f19447c, eVar);
        ccVar.f19446b = obj;
        return ccVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cc) create((com.waze.z.a.be) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f19445a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.z.a.be beVar = (com.waze.z.a.be) this.f19446b;
            if (beVar instanceof cf) {
                this.f19447c.D(h.ab.f48028a);
            } else {
                if (!(beVar instanceof cg)) {
                    throw new h.i();
                }
                cd cdVar = this.f19447c;
                cd cdVar2 = cdVar;
                org.a.d.k.b bVarC = cdVar.c();
                int i2 = h.g.b.ar.f48106a;
                com.waze.car_lib.o oVar = (com.waze.car_lib.o) bVarC.a(new h.g.b.m(com.waze.car_lib.o.class), null, null);
                com.waze.car_lib.bm bmVar = (com.waze.car_lib.bm) oVar.b().a(new h.g.b.m(ca.class), null, null);
                bmVar.d(oVar.a());
                bmVar.e(oVar.b());
                bmVar.E(new com.waze.car_lib.br());
                this.f19445a = 1;
                if (cdVar2.x(bmVar, new com.waze.perf.p(11), this) == aVar) {
                    return aVar;
                }
            }
        }
        return h.ab.f48028a;
    }
}
