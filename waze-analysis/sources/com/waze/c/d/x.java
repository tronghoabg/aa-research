package com.waze.c.d;

import com.waze.modules.c.dv;
import com.waze.modules.c.eb;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class x extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18400a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f18401b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ae f18402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(ae aeVar, h.c.e eVar) {
        super(2, eVar);
        this.f18402c = aeVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        x xVar = new x(this.f18402c, eVar);
        xVar.f18401b = obj;
        return xVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((x) create((eb) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f18400a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            eb ebVar = (eb) this.f18401b;
            if (ebVar == null) {
                this.f18402c.f18280k.a("Reroute ignored - no route");
                return h.ab.f48028a;
            }
            if (ebVar instanceof dv) {
                ae aeVar = this.f18402c;
                com.waze.c.b.j jVar = aeVar.o;
                String strJ = null;
                if (jVar instanceof com.waze.c.b.h) {
                    com.waze.modules.c.av avVarD = ((com.waze.modules.c.aw) ((com.waze.c.b.h) jVar).c()).d();
                    if (avVarD != null) {
                        strJ = avVarD.a().j();
                    }
                } else if (!(jVar instanceof com.waze.c.b.f) && !(jVar instanceof com.waze.c.b.i) && !h.g.b.x.n(jVar, com.waze.c.b.g.f18243a)) {
                    throw new h.i();
                }
                if (h.g.b.x.n(strJ, ((dv) ebVar).a().j())) {
                    aeVar.f18280k.a("Reroute ignored, same route or no route");
                    return h.ab.f48028a;
                }
            }
            ae aeVar2 = this.f18402c;
            aeVar2.f18280k.a("Reroute detected");
            bn bnVar = aeVar2.m;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, t.g((t) objD, r.f18384a, null, null, null, null, 126)));
            this.f18400a = 1;
            if (ae.s(aeVar2, ah.f18285c, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
