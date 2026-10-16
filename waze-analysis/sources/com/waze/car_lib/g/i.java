package com.waze.car_lib.g;

import com.waze.car_lib.r.cr;
import h.ab;
import h.g.a.p;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f19796a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f19797b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, h.c.e eVar) {
        super(2, eVar);
        this.f19797b = jVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new i(this.f19797b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((i) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        f fVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f19796a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f19796a = 1;
            obj = this.f19797b.f19800c.a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        j jVar = this.f19797b;
        cr crVar = (cr) obj;
        com.waze.shared_infra.i.e eVar = jVar.f19803f;
        Objects.toString(crVar);
        eVar.a("Exterior dimensions: ".concat(String.valueOf(crVar)));
        bn bnVar = jVar.f19806i;
        do {
            objD = bnVar.d();
            if (x.n(crVar, com.waze.car_lib.q.e.f20849a)) {
                fVar = d.f19792a;
            } else if (x.n(crVar, com.waze.car_lib.q.c.f20847a)) {
                fVar = h.f19795a;
            } else {
                if (!x.n(crVar, com.waze.car_lib.q.d.f20848a)) {
                    throw new h.i();
                }
                fVar = f.f19794a;
            }
        } while (!bnVar.f(objD, fVar));
        return ab.f48028a;
    }
}
