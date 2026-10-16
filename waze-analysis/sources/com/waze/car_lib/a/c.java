package com.waze.car_lib.a;

import com.waze.car_lib.bm;
import com.waze.car_lib.br;
import com.waze.car_lib.f.gf;
import h.g.b.ar;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18829a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f18830b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, h.c.e eVar) {
        super(2, eVar);
        this.f18830b = dVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f18830b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f18829a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            d dVar = this.f18830b;
            d dVar2 = dVar;
            org.a.d.k.b bVarC = dVar.c();
            int i2 = ar.f48106a;
            com.waze.car_lib.o oVar = (com.waze.car_lib.o) bVarC.a(new h.g.b.m(com.waze.car_lib.o.class), null, null);
            bm bmVar = (bm) oVar.b().a(new h.g.b.m(gf.class), null, null);
            bmVar.d(oVar.a());
            bmVar.e(oVar.b());
            bmVar.E(new br());
            this.f18829a = 1;
            if (dVar2.x(bmVar, new com.waze.perf.p(11), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
