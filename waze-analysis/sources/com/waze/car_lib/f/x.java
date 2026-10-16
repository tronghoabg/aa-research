package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.location.b f19782a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlinx.coroutines.af afVar, com.waze.location.q qVar, com.waze.location.b bVar) {
        super(fk.f19584a, afVar);
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(qVar, "locationAccessHelper");
        h.g.b.x.f(bVar, "repository");
        h.g.b.x.f(afVar, "scope");
        this.f19782a = bVar;
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(this, (h.c.e) null, 1), 3);
    }
}
