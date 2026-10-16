package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class hj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19657a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f19658b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f19659c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f19660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hj(com.waze.av.b.n nVar, gw gwVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f19660d = i2;
        this.f19659c = nVar;
        this.f19658b = gwVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f19660d;
        if (i2 == 0) {
            return new hj((hk) this.f19658b, (com.waze.car_lib.p.dh) this.f19659c, eVar, 0);
        }
        if (i2 != 1) {
            return new hj((hk) this.f19658b, (com.waze.car_lib.p.dh) this.f19659c, eVar, 2, null);
        }
        return new hj((com.waze.av.b.n) this.f19659c, (gw) this.f19658b, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f19660d;
        return i2 != 0 ? i2 != 1 ? ((hj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((hj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((hj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f19660d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f19657a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f19658b;
                com.waze.shared_infra.coordinators.o oVar = (com.waze.shared_infra.coordinators.o) obj2;
                org.a.d.k.b bVarC = ((com.waze.car_lib.bm) obj2).c();
                int i3 = h.g.b.ar.f48106a;
                com.waze.car_lib.o oVar2 = (com.waze.car_lib.o) bVarC.a(new h.g.b.m(com.waze.car_lib.o.class), null, null);
                com.waze.car_lib.bm bmVar = (com.waze.car_lib.bm) oVar2.b().a(new h.g.b.m(ci.class), null, null);
                bmVar.d(oVar2.a());
                bmVar.e(oVar2.b());
                bmVar.E(new com.waze.car_lib.br());
                this.f19657a = 1;
                obj = oVar.x(bmVar, new com.waze.perf.p(11), this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            com.waze.settings.tree.a.d dVar = (com.waze.settings.tree.a.d) obj;
            ((hx) this.f19659c).a().invoke(Boolean.valueOf((dVar instanceof com.waze.shared_infra.coordinators.d) && (((com.waze.shared_infra.coordinators.d) dVar).f() instanceof gd)));
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f19657a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                com.waze.av.a.o oVarC = ((com.waze.av.b.n) this.f19659c).e().c();
                Object obj3 = this.f19658b;
                String strC = oVarC.c();
                if (strC == null) {
                    return null;
                }
                com.waze.search.b.a aVar3 = ((gw) obj3).f19635b;
                String strB = oVarC.b();
                this.f19657a = 1;
                obj = aVar3.a(strC, strB, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            }
            return (com.waze.av.d.k) obj;
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        if (this.f19657a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj4 = this.f19658b;
            com.waze.shared_infra.coordinators.o oVar3 = (com.waze.shared_infra.coordinators.o) obj4;
            org.a.d.k.b bVarC2 = ((com.waze.car_lib.bm) obj4).c();
            int i4 = h.g.b.ar.f48106a;
            com.waze.car_lib.o oVar4 = (com.waze.car_lib.o) bVarC2.a(new h.g.b.m(com.waze.car_lib.o.class), null, null);
            com.waze.car_lib.bm bmVar2 = (com.waze.car_lib.bm) oVar4.b().a(new h.g.b.m(ck.class), null, null);
            bmVar2.d(oVar4.a());
            bmVar2.e(oVar4.b());
            bmVar2.E(new com.waze.car_lib.br());
            ((ck) bmVar2).f().b(((hs) this.f19659c).a());
            this.f19657a = 1;
            if (oVar3.x(bmVar2, new com.waze.perf.p(11), this) == aVar4) {
                return aVar4;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hj(hk hkVar, com.waze.car_lib.p.dh dhVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f19660d = i2;
        this.f19658b = hkVar;
        this.f19659c = dhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hj(hk hkVar, com.waze.car_lib.p.dh dhVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f19660d = i2;
        this.f19658b = hkVar;
        this.f19659c = dhVar;
    }
}
