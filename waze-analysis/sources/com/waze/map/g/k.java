package com.waze.map.g;

import com.waze.map.canvas.bp;
import com.waze.map.el;
import h.ab;
import j$.time.Instant;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class k extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f29069a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f29070b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ s f29071c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(s sVar, h.c.e eVar) {
        super(2, eVar);
        this.f29071c = sVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        k kVar = new k(this.f29071c, eVar);
        kVar.f29070b = obj;
        return kVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((bp) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f29069a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            bp bpVar = (bp) this.f29070b;
            s sVar = this.f29071c;
            com.waze.shared_infra.i.e eVar = sVar.f29098g;
            Objects.toString(bpVar);
            eVar.a("new state request: ".concat(String.valueOf(bpVar)));
            Instant instantA = bpVar.a();
            boolean z = false;
            if (instantA != null && instantA.isAfter(sVar.f29094c.b())) {
                z = true;
            }
            com.waze.ap.b.o oVarB = bpVar.b();
            if (h.g.b.x.n(oVarB, com.waze.map.b.p.f28363a)) {
                this.f29069a = 1;
                if (s.j(sVar, z, this) == aVar) {
                    return aVar;
                }
            } else if (h.g.b.x.n(oVarB, com.waze.map.b.q.f28364a)) {
                s.t(sVar, z, sVar.o.g());
            } else {
                if (!(oVarB instanceof com.waze.map.b.o)) {
                    throw new h.i();
                }
                s.n(sVar, el.a((com.waze.map.b.o) oVarB), z);
            }
        }
        return ab.f48028a;
    }
}
