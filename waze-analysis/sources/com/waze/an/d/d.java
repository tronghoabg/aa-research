package com.waze.an.d;

import com.waze.an.a.a.ar;
import com.waze.an.a.u;
import com.waze.app_nav.hub.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private final ar f14836a;

    /* renamed from: b, reason: collision with root package name */
    private final h.c.j f14837b;

    public d(ar arVar, h.c.j jVar) {
        x.f(arVar, "notificationInsightSource");
        x.f(jVar, "coroutineContext");
        this.f14836a = arVar;
        this.f14837b = jVar;
    }

    @Override // com.waze.an.d.b
    public final void a(u uVar) {
        x.f(uVar, "notificationInsightId");
        this.f14836a.f(uVar);
    }

    @Override // com.waze.an.d.b
    public final boolean b(u uVar, com.waze.an.a.k kVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3) {
        x.f(uVar, "insightId");
        x.f(kVar, "state");
        ar arVar = this.f14836a;
        if (arVar.g(uVar)) {
            return false;
        }
        arVar.e(new n(new c(uVar, kVar), new o(this, uVar, aVar3, 8), new o(this, uVar, aVar2, 9), aVar, this.f14837b));
        return true;
    }
}
