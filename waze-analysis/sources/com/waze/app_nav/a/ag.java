package com.waze.app_nav.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ag extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f15107a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(kotlinx.coroutines.af afVar) {
        super(al.f15112a, afVar);
        h.g.b.x.f(afVar, "scope");
        this.f15107a = h.g.b(h.h.f48130a, new a((org.a.d.a.a) this, 3));
        H(ai.f15109a);
        kotlinx.coroutines.aj.z(G(), null, null, new i(this, (h.c.e) null, 4), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.app_nav.w d() {
        return (com.waze.app_nav.w) this.f15107a.getValue();
    }

    public final void b() {
        d().c();
        H(ah.f15108a);
    }
}
