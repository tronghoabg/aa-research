package com.waze.an.c.a;

import com.waze.an.c.ac;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14689a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f14690b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f14691c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(d dVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f14691c = i2;
        this.f14690b = dVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f14691c;
        Object obj2 = this.f14690b;
        if (i2 != 0) {
            h hVar = new h((d) obj2, eVar, 1);
            hVar.f14689a = obj;
            return hVar;
        }
        h hVar2 = new h((l) obj2, eVar, 0);
        hVar2.f14689a = obj;
        return hVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f14691c != 0 ? ((h) create((com.waze.j) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((h) create((ac) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f14691c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((l) this.f14690b).f14706f = (ac) this.f14689a;
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.i iVarD = ((com.waze.j) this.f14689a).d();
        h.o.a aVarZ = iVarD != null ? h.o.a.z(iVarD.a()) : null;
        h.o.c cVar = h.o.a.f48264a;
        if (aVarZ != null && h.o.a.A(aVarZ.w(), 0L)) {
            d dVar = (d) this.f14690b;
            if (dVar.f14674g) {
                dVar.w(com.waze.alerters.a.a.f14139h);
            } else {
                dVar.w(com.waze.alerters.a.a.f14132a);
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f14691c = i2;
        this.f14690b = lVar;
    }
}
