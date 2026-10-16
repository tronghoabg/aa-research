package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cl extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f19459a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(kotlinx.coroutines.af afVar) {
        super(cm.f19460a, afVar);
        h.g.b.x.f(afVar, "scope");
        this.f19459a = kotlinx.coroutines.b.ck.b(com.waze.settings.b.d.f36836a);
    }

    public final kotlinx.coroutines.b.ch a() {
        return kotlinx.coroutines.b.ai.U(this.f19459a);
    }

    public final void b(com.waze.settings.b.f fVar) {
        h.g.b.x.f(fVar, "filter");
        this.f19459a.e(fVar);
    }

    public final void c() {
        com.waze.settings.b.d dVar;
        kotlinx.coroutines.b.bn bnVar = this.f19459a;
        com.waze.settings.b.f fVar = (com.waze.settings.b.f) bnVar.d();
        com.waze.settings.b.d dVar2 = com.waze.settings.b.d.f36836a;
        if (h.g.b.x.n(fVar, dVar2)) {
            dVar = com.waze.settings.b.e.f36837a;
        } else {
            if (!h.g.b.x.n(fVar, com.waze.settings.b.e.f36837a)) {
                throw new h.i();
            }
            dVar = dVar2;
        }
        bnVar.e(dVar);
    }
}
