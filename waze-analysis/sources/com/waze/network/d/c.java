package com.waze.network.d;

import e.a.cm;
import e.a.cq;
import e.a.ee;
import e.a.eh;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c extends i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32182a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f32183b;

    /* renamed from: c, reason: collision with root package name */
    private int f32184c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(cq cqVar, e.a.h hVar, e.a.i iVar, com.waze.shared_infra.i.e eVar, h.g.a.a aVar) {
        super(cqVar, hVar, iVar);
        x.f(cqVar, "method");
        x.f(iVar, "next");
        x.f(eVar, "logger");
        x.f(aVar, "onUnauthenticated");
        this.f32182a = eVar;
        this.f32183b = aVar;
        this.f32184c = 1;
    }

    static final ab f(c cVar) {
        cVar.f32183b.invoke();
        return ab.f48028a;
    }

    static final ab g(c cVar, f fVar, cm cmVar) {
        cVar.k(fVar, cmVar);
        return ab.f48028a;
    }

    private final void k(com.waze.uid.f fVar, cm cmVar) {
        Object objA;
        try {
            c cVar = this;
            fVar.h(h());
            fVar.a(ee.f47401a, cmVar);
            objA = ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            int i2 = this.f32184c - 1;
            this.f32184c = i2;
            this.f32182a.a("onFailure with " + i2 + " attempts remaining");
            if (this.f32184c <= 0 || !(thC instanceof eh)) {
                a(null, thC);
            } else {
                k(fVar, cmVar);
            }
        }
    }

    @Override // com.waze.network.d.i, e.a.an, e.a.k
    public final void e(com.waze.uid.f fVar, final cm cmVar) {
        x.f(fVar, "responseListener");
        x.f(cmVar, "headers");
        final f fVar2 = new f(fVar, this.f32182a);
        fVar2.c(new h.g.a.a() { // from class: com.waze.network.d.a
            @Override // h.g.a.a
            public final Object invoke() {
                return c.f(this.f32178a);
            }
        });
        fVar2.b(new h.g.a.a() { // from class: com.waze.network.d.b
            @Override // h.g.a.a
            public final Object invoke() {
                return c.g(this.f32179a, fVar2, cmVar);
            }
        });
        super.e(fVar2, cmVar);
    }
}
